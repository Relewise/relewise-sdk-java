namespace Generator;

public class Constants
{
    public const string Namespace = "com.relewise.client";
    public const string GenerationFolderPath = "model";

    public const string StandardImports = """
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
        """;
}