package com.relewise.client;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.relewise.client.model.AbandonedCartTriggerResult;
import com.relewise.client.model.Campaign;
import com.relewise.client.model.Increase;
import com.relewise.client.model.ObservableVariantAttribute;
import com.relewise.client.model.ObservableVariantAttributeSelector;
import com.relewise.client.model.ScheduledPeriod;
import com.relewise.client.model.TriggerResultResponse;
import com.relewise.client.model.VariantChangeTriggerConfiguration;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class HydrationTest {
    private final JsonMapper objectMapper = JsonMapper.builder()
        .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
        .addModule(new JavaTimeModule())
        .build();

    @Test
    public void campaignHydratesScheduleAsScheduledPeriod() throws Exception {
        var campaign = objectMapper.readValue("""
            {
                "schedule": {
                    "$type": "Relewise.Client.DataTypes.Scheduling.ScheduledPeriod, Relewise.Client",
                    "fromUtc": "2026-01-01T12:00:00+00:00",
                    "toUtc": "2026-01-02T12:00:00+00:00"
                }
            }
            """, Campaign.class);

        var scheduledPeriod = assertInstanceOf(ScheduledPeriod.class, campaign.getSchedule());
        assertEquals(OffsetDateTime.parse("2026-01-01T12:00:00+00:00"), scheduledPeriod.getFromUtc());
        assertEquals(OffsetDateTime.parse("2026-01-02T12:00:00+00:00"), scheduledPeriod.getToUtc());
    }

    @Test
    public void variantChangeTriggerConfigurationHydratesNestedInterfaceTypes() throws Exception {
        var configuration = objectMapper.readValue("""
            {
                "entityPropertySelector": {
                    "$type": "Relewise.Client.DataTypes.EntityPropertySelectors.ObservableVariantAttributeSelector, Relewise.Client",
                    "attribute": "SalesPrice"
                },
                "change": {
                    "$type": "Relewise.Client.DataTypes.Changes.Increase, Relewise.Client"
                }
            }
            """, VariantChangeTriggerConfiguration.class);

        var entityPropertySelector = assertInstanceOf(ObservableVariantAttributeSelector.class, configuration.getEntityPropertySelector());
        assertEquals(ObservableVariantAttribute.SalesPrice, entityPropertySelector.getAttribute());
        assertInstanceOf(Increase.class, configuration.getChange());
    }

    @Test
    public void triggerResultResponseHydratesResultInterfaceType() throws Exception {
        var response = objectMapper.readValue("""
            {
                "result": {
                    "$type": "Relewise.Client.Responses.Triggers.Results.AbandonedCartTriggerResult, Relewise.Client"
                }
            }
            """, TriggerResultResponse.class);

        assertInstanceOf(AbandonedCartTriggerResult.class, response.getResult());
    }
}
