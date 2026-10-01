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
        var tracker = new Tracker(GetDatasetId(), GetApiKey(), GetServerUrl());

        var orderRequest = TrackOrderRequest.create(
            Order.create(
                fixtureUser("order-creator").setChannel(Channel.create("Channel 1")),
                Money.create(Currency.create("DKK"), 100.0),
                fixtureId("order-creator")
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
        var tracker = new Tracker(GetDatasetId(), GetApiKey(), GetServerUrl());

        var orderRequest = (new TrackOrderRequest())
            .setOrder((new Order())
                .setUser(fixtureUser("order-builder").setChannel(Channel.create("Channel 1")))
                .setSubtotal((new Money())
                    .setAmount(100.0)
                    .setCurrency((new Currency())
                        .setValue("DKK")
                    )
                )
                .setOrderNumber(fixtureId("order-builder"))
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
        var tracker = new Tracker(GetDatasetId(), GetApiKey(), GetServerUrl());

        var order = new Order(
            fixtureUser("order-direct").setChannel(Channel.create("Channel 1")),
            new Money(
                new Currency("DKK"),
                100.0
            ),
            fixtureId("order-direct")
        );

        var orderRequest = new TrackOrderRequest(order);

        Executable action = () -> tracker.track(orderRequest);
        assertDoesNotThrow(action);
    }
}
