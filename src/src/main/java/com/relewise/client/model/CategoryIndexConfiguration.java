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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryIndexConfiguration
{
    public CategoryIndexConfigurationEntry unspecified;
    public static CategoryIndexConfiguration create()
    {
        return new CategoryIndexConfiguration();
    }
    public CategoryIndexConfiguration()
    {
    }
    public CategoryIndexConfigurationEntry getUnspecified()
    {
        return this.unspecified;
    }
    public CategoryIndexConfiguration setUnspecified(CategoryIndexConfigurationEntry unspecified)
    {
        this.unspecified = unspecified;
        return this;
    }
}
