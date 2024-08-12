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
import java.util.AbstractMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;

public enum SynonymsRequestSynonymSorting
{
    Created {
        public String toString() {
            return "Created";
        }
    },
    CreatedBy {
        public String toString() {
            return "CreatedBy";
        }
    },
    Modified {
        public String toString() {
            return "Modified";
        }
    },
    ModifiedBy {
        public String toString() {
            return "ModifiedBy";
        }
    },
    Approved {
        public String toString() {
            return "Approved";
        }
    },
    ApprovedBy {
        public String toString() {
            return "ApprovedBy";
        }
    },
    Usages {
        public String toString() {
            return "Usages";
        }
    },
    Type {
        public String toString() {
            return "Type";
        }
    },
    Predictable {
        public String toString() {
            return "Predictable";
        }
    },
}
