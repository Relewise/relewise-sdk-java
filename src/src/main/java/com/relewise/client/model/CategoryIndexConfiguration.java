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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryIndexConfiguration
{
    /** Default configuration entry used when no specific category scope is specified. This serves as the fallback configuration for category indexing operations. */
    public CategoryIndexConfigurationEntry unspecified;
    /** Scope-specific configuration entries mapped by CategoryScope enum values. Allows different indexing configurations for different category relationship scopes (e.g., ImmediateParent, ImmediateParentOrItsParent, Ancestor). When null, only the Unspecified configuration will be used. */
    public @Nullable HashMap<CategoryScope, CategoryIndexConfigurationEntry> byScope;
    public static CategoryIndexConfiguration create()
    {
        return new CategoryIndexConfiguration();
    }
    public CategoryIndexConfiguration()
    {
    }
    /** Default configuration entry used when no specific category scope is specified. This serves as the fallback configuration for category indexing operations. */
    public CategoryIndexConfigurationEntry getUnspecified()
    {
        return this.unspecified;
    }
    /** Scope-specific configuration entries mapped by CategoryScope enum values. Allows different indexing configurations for different category relationship scopes (e.g., ImmediateParent, ImmediateParentOrItsParent, Ancestor). When null, only the Unspecified configuration will be used. */
    public @Nullable HashMap<CategoryScope, CategoryIndexConfigurationEntry> getByScope()
    {
        return this.byScope;
    }
    /** Default configuration entry used when no specific category scope is specified. This serves as the fallback configuration for category indexing operations. */
    public CategoryIndexConfiguration setUnspecified(CategoryIndexConfigurationEntry unspecified)
    {
        this.unspecified = unspecified;
        return this;
    }
    /** Scope-specific configuration entries mapped by CategoryScope enum values. Allows different indexing configurations for different category relationship scopes (e.g., ImmediateParent, ImmediateParentOrItsParent, Ancestor). When null, only the Unspecified configuration will be used. */
    public CategoryIndexConfiguration addToByScope(CategoryScope key, CategoryIndexConfigurationEntry value)
    {
        if (this.byScope == null)
        {
            this.byScope = new HashMap<>();
        }
        this.byScope.put(key, value);
        return this;
    }
    /** Scope-specific configuration entries mapped by CategoryScope enum values. Allows different indexing configurations for different category relationship scopes (e.g., ImmediateParent, ImmediateParentOrItsParent, Ancestor). When null, only the Unspecified configuration will be used. */
    public CategoryIndexConfiguration setByScope(@Nullable HashMap<CategoryScope, CategoryIndexConfigurationEntry> byScope)
    {
        this.byScope = byScope;
        return this;
    }
}
