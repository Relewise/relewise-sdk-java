package com.relewise.client;

import com.relewise.client.factory.DataValueFactory;
import com.relewise.client.factory.UserFactory;
import com.relewise.client.model.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedRequestsTest extends TestBase {
    @Test
    public void testTrackOrderRequestWithBuilderPatternAndCreatorMethod() throws Exception {
        var tracker = new Tracker(GetDatasetId(), GetApiKey(), "https://api.relewise.com");

        var orderRequest = TrackOrderRequest.create(
            Order.create(
                UserFactory.byTemporaryId("t-id").setChannel(Channel.create("Channel 1")),
                Money.create(Currency.create("DKK"), 100.0),
                "1"
            )
        );

        Executable action = () -> tracker.track(orderRequest);
        assertDoesNotThrow(action);
    }

    /**
     * This is a regression test to test that we can still new-up classes without the create method. Don't use this style in real scenarios.
     *
     * @throws Exception
     */
    @Test
    public void testTrackOrderRequestWithBuilderPattern() throws Exception {
        var tracker = new Tracker(GetDatasetId(), GetApiKey(), "https://api.relewise.com");

        var orderRequest = (new TrackOrderRequest())
            .setOrder((new Order())
                .setUser(new User().setTemporaryId("t-Id").setChannel(Channel.create("Channel 1")))
                .setSubtotal((new Money())
                    .setAmount(100.0)
                    .setCurrency((new Currency())
                        .setValue("DKK")
                    )
                )
                .setOrderNumber("1")
                .setCartName("1")
            );

        Executable action = () -> tracker.track(orderRequest);
        assertDoesNotThrow(action);
    }

    /**
     * This is a regression test to test that we can still new-up classes without the create method and set each property without the fluent style creation. Don't use this style in real scenarios.
     *
     * @throws Exception
     */
    @Test
    public void testTrackOrderRequest() throws Exception {
        var tracker = new Tracker(GetDatasetId(), GetApiKey(), "https://api.relewise.com");

        var order = new Order(
            UserFactory.byTemporaryId("t-ID").setChannel(Channel.create("Channel 1")),
            new Money(
                new Currency("DKK"),
                100.0
            ),
            "1"
        );

        var orderRequest = new TrackOrderRequest(order);

        Executable action = () -> tracker.track(orderRequest);
        assertDoesNotThrow(action);
    }
}