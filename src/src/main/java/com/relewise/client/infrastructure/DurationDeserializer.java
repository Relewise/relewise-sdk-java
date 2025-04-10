package com.relewise.client.infrastructure;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.Duration;

public class DurationDeserializer extends JsonDeserializer<Duration> {
    @Override
    public Duration deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        String value = deserializationContext.readValue(jsonParser, String.class);
        String[] parts = value.split("\\:");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Tried to deserialize time span that was not in correct format (it should consist of three parts colon-separated).");
        }
        double hours = Double.parseDouble(parts[0]);
        double minutes = Double.parseDouble(parts[1]);
        double seconds = Double.parseDouble(parts[2]);
        minutes += hours * 60;
        seconds += minutes * 60;
        return Duration.ofNanos((long)(seconds * 1_000_000_000));
    }
}
