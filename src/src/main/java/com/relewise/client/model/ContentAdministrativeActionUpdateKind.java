package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
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

public enum ContentAdministrativeActionUpdateKind
{
    DisableInRecommendations {
        public String toString() {
            return "DisableInRecommendations";
        }
    },
    Disable {
        public String toString() {
            return "Disable";
        }
    },
    EnableInRecommendations {
        public String toString() {
            return "EnableInRecommendations";
        }
    },
    Enable {
        public String toString() {
            return "Enable";
        }
    },
    PermanentlyDelete {
        public String toString() {
            return "PermanentlyDelete";
        }
    },
    Delete {
        public String toString() {
            return "Delete";
        }
    },
}
