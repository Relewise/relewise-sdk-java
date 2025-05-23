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

/** @deprecated Replaced by PredictionConfiguration */
public enum PredictionSourceType
{
    Disabled {
        public String toString() {
            return "Disabled";
        }
    },
    IndividualWords {
        public String toString() {
            return "IndividualWords";
        }
    },
    PartialWordSequences {
        public String toString() {
            return "PartialWordSequences";
        }
    },
    CompleteWordSequence {
        public String toString() {
            return "CompleteWordSequence";
        }
    },
}
