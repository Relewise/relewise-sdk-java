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

public enum ProductPerformanceRequestOrderByOptions
{
    Created {
        public String toString() {
            return "Created";
        }
    },
    Views {
        public String toString() {
            return "Views";
        }
    },
    Sales {
        public String toString() {
            return "Sales";
        }
    },
    CartsOpened {
        public String toString() {
            return "CartsOpened";
        }
    },
    RankByView {
        public String toString() {
            return "RankByView";
        }
    },
    RankBySales {
        public String toString() {
            return "RankBySales";
        }
    },
}
