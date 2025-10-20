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

/** Specifies what company/companies should be targeted. */
public enum CompanyScope
{
    ImmediateCompany {
        public String toString() {
            return "ImmediateCompany";
        }
    },
    ParentCompany {
        public String toString() {
            return "ParentCompany";
        }
    },
    ImmediateOrParentCompany {
        public String toString() {
            return "ImmediateOrParentCompany";
        }
    },
}
