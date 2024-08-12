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

public enum DataValueDataValueTypes
{
    String {
        public String toString() {
            return "String";
        }
    },
    Double {
        public String toString() {
            return "Double";
        }
    },
    Boolean {
        public String toString() {
            return "Boolean";
        }
    },
    Multilingual {
        public String toString() {
            return "Multilingual";
        }
    },
    Money {
        public String toString() {
            return "Money";
        }
    },
    MultiCurrency {
        public String toString() {
            return "MultiCurrency";
        }
    },
    StringList {
        public String toString() {
            return "StringList";
        }
    },
    DoubleList {
        public String toString() {
            return "DoubleList";
        }
    },
    BooleanList {
        public String toString() {
            return "BooleanList";
        }
    },
    MultilingualCollection {
        public String toString() {
            return "MultilingualCollection";
        }
    },
    Object {
        public String toString() {
            return "Object";
        }
    },
    ObjectList {
        public String toString() {
            return "ObjectList";
        }
    },
}
