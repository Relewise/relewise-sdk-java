package com.relewise.client;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.relewise.client.factory.UserFactory;
import com.relewise.client.model.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

public class DateTimeSerializationTest extends TestBase {
    @Test
    public void testSerializeOffsetDateTime() throws Exception {
        var objectMapper = JsonMapper.builder()
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .addModule(new JavaTimeModule())
            .build();

        var input = "2024-08-09T00:00:00+02:00";

        var serialized = objectMapper.writeValueAsString(OffsetDateTime.parse(input));

        assertEquals("\"" + input + "\"", serialized);
    }

    @Test
    public void testSerializeLocalDateTime() throws Exception {
        var objectMapper = JsonMapper.builder()
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .addModule(new JavaTimeModule())
            .build();

        var input = "2024-08-09T00:00:00";

        var serialized = objectMapper.writeValueAsString(LocalDateTime.parse(input));

        assertEquals("\"" + input + "\"", serialized);
    }
}