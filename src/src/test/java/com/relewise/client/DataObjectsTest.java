package com.relewise.client;

import com.relewise.client.factory.DataValueFactory;
import com.relewise.client.factory.UserFactory;
import com.relewise.client.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DataObjectsTest extends TestBase {
    @Test
    public void testDataObjectsCanBeDeserialized() throws Exception {
        var searcher = new Searcher(GetDatasetId(), GetApiKey());

        var productSearch = ProductSearchRequest.create(
                Language.create("da-dk"),
                Currency.create("DKK"),
                UserFactory.anonymous(),
                "integration test - data object",
                "1",
                0,
                0
            ).setSettings(ProductSearchSettings.create()
                .setSelectedProductProperties(SelectedProductPropertiesSettings.create()
                    .setAllData(true)
                )
            )
            .setFilters(
                FilterCollection.create(
                    ProductDataFilter.create("DataObject")
                        .setConditions(ValueConditionCollection.create()
                            .setItems(
                                ContainsCondition.create(DataValueFactory.create(
                                    new Object() {
                                        public final DataValue d = DataValueFactory.create("a");
                                    }
                                ))
                            )
                        )
                )
            );

        var response = searcher.search(productSearch);
        assertNotNull(response);
        assertEquals(0, response.hits);
    }
}