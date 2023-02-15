package com.relewise.client.factory;

import com.relewise.client.model.Language;

public class MultilingualCollectionValue {
    public Language Language;
    public String[] Values;

    public MultilingualCollectionValue(Language language, String... values) {
        this.Language = language;
        this.Values = values;
    }

    public static MultilingualCollectionValue create(Language language, String... values) {
        return new MultilingualCollectionValue(language, values);
    }
}
