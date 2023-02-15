package com.relewise.client;

import com.relewise.client.factory.UserFactory;
import com.relewise.client.model.*;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class SearchAdministratorTest extends TestBase {
    @Test
    void testSaveSimpleSearchIndex() throws Exception {
        var searchAdministrator = new SearchAdministrator(GetDatasetId(), GetApiKey());

        var saveSearchIndex = SaveSearchIndexRequest.create(
            SearchIndex.create("simple", "a simple test index that is not default", false)
                .setConfiguration(
                    IndexConfiguration.create()
                        .setLanguage(LanguageIndexConfiguration.create()
                            .setLanguages(
                                LanguageIndexConfigurationEntry.create(Language.create("da-dk"), true),
                                LanguageIndexConfigurationEntry.create(Language.create("da.dk"), true)
                            )
                        )
                        .setProduct(ProductIndexConfiguration.create()
                            .setId(FieldIndexConfiguration.create(true, (short)1, PredictionSourceType.Disabled))
                            .setDisplayName(FieldIndexConfiguration.create(true, (short)9, PredictionSourceType.PartialWordSequences))
                            .setData(
                                DataIndexConfiguration.create()
                                    .addToKeys("Tags", FieldIndexConfiguration.create(true, (short)8, PredictionSourceType.IndividualWords))
                                    .addToKeys("Description", FieldIndexConfiguration.create(true, (short)5, PredictionSourceType.PartialWordSequences).setParser(HtmlParser.create()))
                            )
                        )
                ),
            "Java Integration test"
        );

        var response = searchAdministrator.save(saveSearchIndex);
        assertNotNull(response);
    }

    @Test
    void testSaveGetUpdateAndDeleteSearchIndex() throws Exception {
        var searchAdministrator = new SearchAdministrator(GetDatasetId(), GetApiKey());

        // Create
        var saveRequest = SaveSearchIndexRequest.create(
            SearchIndex.create("to_be_deleted", "Some Description", false)
                .setConfiguration(
                    IndexConfiguration.create()
                ),
            "Java Integration test"
        );
        var saveResponse = searchAdministrator.save(saveRequest);
        assertNotNull(saveResponse);

        // Read
        var getRequest = SearchIndexRequest.create("to_be_deleted");
        var getResponse  = searchAdministrator.load(getRequest);
        assertNotNull(getResponse);
        assertEquals("Some Description", getResponse.index.description);

        // Update
        var updateRequest = SaveSearchIndexRequest.create(
            SearchIndex.create("to_be_deleted", "Another Description", false)
                .setConfiguration(
                    IndexConfiguration.create()
                ),
            "Java Integration test"
        );
        var updateResponse = searchAdministrator.save(updateRequest);
        assertNotNull(updateResponse);
        assertEquals("Another Description", updateResponse.index.description);

        // Delete
        var deleteRequest = DeleteSearchIndexRequest.create("to_be_deleted", "Java Integration test");
        searchAdministrator.delete(deleteRequest);

        // Validate Delete
        getRequest = SearchIndexRequest.create("to_be_deleted");
        getResponse  = searchAdministrator.load(getRequest);
        assertNull(getResponse);
    }
}