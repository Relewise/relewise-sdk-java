package com.relewise.client;

import com.relewise.client.factory.DataValueFactory;
import com.relewise.client.factory.UserFactory;
import com.relewise.client.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClientConstructionTest extends TestBase {
    @Test
    public void testApiKeyEmpty() {
        assertThrows(IllegalArgumentException.class, () -> new Tracker("00000000-0000-0000-0000-000000000001", "", "https://api.relewise.com/"));
    }

    @Test
    public void testApiKeySpaceString() {
        assertThrows(IllegalArgumentException.class, () -> new Tracker("00000000-0000-0000-0000-000000000001", " ", "https://api.relewise.com/"));
    }

    @Test
    public void testApiKeyValid() {
        var tracker = new Tracker("00000000-0000-0000-0000-000000000001", "a-valid-apikey-format", "https://api.relewise.com/");

        assertNotNull(tracker);
    }

    @Test
    public void testOAuthValid() {
        var tracker = new Tracker(
            "00000000-0000-0000-0000-000000000001",
            new OAuthClientCredentials("11111111-1111-4111-8111-111111111111", "secret"),
            "https://api.relewise.com/"
        );

        assertNotNull(tracker);
    }

    @Test
    public void testOAuthValidatesDatasetAndServerUrl() {
        var credentials = new OAuthClientCredentials("11111111-1111-4111-8111-111111111111", "secret");

        assertThrows(IllegalArgumentException.class, () -> new Tracker("not-a-uuid", credentials, "https://api.relewise.com/"));
        assertThrows(IllegalArgumentException.class, () -> new Tracker("00000000-0000-0000-0000-000000000000", credentials, "https://api.relewise.com/"));
        assertThrows(IllegalArgumentException.class, () -> new Tracker("00000000-0000-0000-0000-000000000001", credentials, "http://api.relewise.com/"));
        assertThrows(IllegalArgumentException.class, () -> new Tracker("00000000-0000-0000-0000-000000000001", credentials, "https://user@api.relewise.com/"));
        assertThrows(IllegalArgumentException.class, () -> new Tracker("00000000-0000-0000-0000-000000000001", credentials, "https://api.relewise.com/?query=true"));
    }
}
