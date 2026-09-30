package com.relewise.client;

import com.relewise.client.model.SearchIndexRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SearchAdministratorTest extends TestBase {
    @Test
    public void testGetDefaultSearchIndex() throws Exception {
        var administrator = new SearchAdministrator(GetDatasetId(), GetApiKey(), GetServerUrl());
        var response = administrator.load(SearchIndexRequest.create("default"));
        assertNotNull(response);
        assertEquals("default", response.index.id);
        assertTrue(response.index.isDefault);
    }

    @Test
    public void testGetMissingSearchIndexReturnsNull() throws Exception {
        var administrator = new SearchAdministrator(GetDatasetId(), GetApiKey(), GetServerUrl());
        assertNull(administrator.load(SearchIndexRequest.create(fixtureId("missing-index"))));
    }
}
