package com.relewise.client;

import com.relewise.client.factory.UserFactory;
import com.relewise.client.model.Product;
import com.relewise.client.model.ProductVariant;
import com.relewise.client.model.ProductView;
import com.relewise.client.model.TrackProductViewRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public abstract class TestBase {

    public static String GetDatasetId() {
        return System.getenv("DATASET_ID");
    }

    public static String GetApiKey() {
        return System.getenv("API_KEY");
    }
    @Test
    void testProductView() throws Exception {
        var tracker = new Tracker(GetDatasetId(), GetApiKey());

        var productSearch = TrackProductViewRequest.create(
            ProductView.create(
                UserFactory.byTemporaryId("t-id"),
                Product.create("p-1"),
                ProductVariant.create("v-1")
            )
        );

        Executable action = () -> tracker.track(productSearch);
        assertDoesNotThrow(action);
    }
}
