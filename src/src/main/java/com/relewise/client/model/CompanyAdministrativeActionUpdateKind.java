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

public enum CompanyAdministrativeActionUpdateKind
{
    Disable {
        public String toString() {
            return "Disable";
        }
    },
    Enable {
        public String toString() {
            return "Enable";
        }
    },
    Delete {
        public String toString() {
            return "Delete";
        }
    },
}
