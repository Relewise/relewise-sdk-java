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
    
/** A selector which can change the weighing of an observed view or purchase when making a <code>PopularProductsRequest</code>. */
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class PopularityMultiplierSelector
{
    public String $type = "";
}
