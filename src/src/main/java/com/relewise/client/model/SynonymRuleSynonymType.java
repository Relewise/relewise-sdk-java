package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Arrays;
import java.util.UUID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

/** Defines the direction in which a synonym relation is applied. */
public enum SynonymRuleSynonymType
{
    OneWay {
        public String toString() {
            return "OneWay";
        }
    },
    Multidirectional {
        public String toString() {
            return "Multidirectional";
        }
    },
}
