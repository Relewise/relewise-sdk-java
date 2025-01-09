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

/** Defines how entities are to be selected by given paths. */
public enum CategorySelectionStrategy
{
    ImmediateParent {
        public String toString() {
            return "ImmediateParent";
        }
    },
    Ancestors {
        public String toString() {
            return "Ancestors";
        }
    },
    Descendants {
        public String toString() {
            return "Descendants";
        }
    },
}
