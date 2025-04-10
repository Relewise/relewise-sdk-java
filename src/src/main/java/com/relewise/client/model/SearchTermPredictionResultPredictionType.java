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

/** @deprecated No longer in use */
public enum SearchTermPredictionResultPredictionType
{
    Match {
        public String toString() {
            return "Match";
        }
    },
    WordContinuation {
        public String toString() {
            return "WordContinuation";
        }
    },
    Word {
        public String toString() {
            return "Word";
        }
    },
    WordSequence {
        public String toString() {
            return "WordSequence";
        }
    },
}
