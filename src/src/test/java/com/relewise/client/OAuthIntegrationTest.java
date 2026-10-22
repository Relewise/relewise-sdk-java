package com.relewise.client;

import com.relewise.client.factory.UserFactory;
import com.relewise.client.model.Product;
import com.relewise.client.model.ProductView;
import com.relewise.client.model.TrackProductViewRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/** Opt-in live OAuth smoke test. Set OAUTH_CLIENT_ID and OAUTH_CLIENT_SECRET to run it. */
class OAuthIntegrationTest extends TestBase {
    @Test
    void acquiresAndReusesOAuthTokenForApiRequests() {
        String clientId = System.getenv("OAUTH_CLIENT_ID");
        String clientSecret = System.getenv("OAUTH_CLIENT_SECRET");
        String datasetId = GetDatasetId();
        assumeTrue(clientId != null && !clientId.isBlank()
            && clientSecret != null && !clientSecret.isBlank()
            && datasetId != null && !datasetId.isBlank());

        var tracker = new Tracker(
            datasetId,
            new OAuthClientCredentials(clientId, clientSecret),
            GetServerUrl()
        );
        var request = TrackProductViewRequest.create(ProductView.create(
            UserFactory.byTemporaryId(fixtureId("oauth-user")),
            Product.create(fixtureId("oauth-product"))
        ));

        assertDoesNotThrow(() -> {
            tracker.track(request);
            tracker.track(request);
        });
    }
}
