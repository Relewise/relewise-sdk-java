package com.relewise.client.factory;

import com.relewise.client.model.*;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.HashMap;

public class DataValueFactory {
    public static DataValue create(String value) {
        return DataValue.create()
            .setType(DataValueDataValueTypes.String)
            .setValue(value);
    }

    public static DataValue create(double value) {
        return DataValue.create()
            .setType(DataValueDataValueTypes.Double)
            .setValue(value);
    }

    public static DataValue create(boolean value) {
        return DataValue.create()
            .setType(DataValueDataValueTypes.Boolean)
            .setValue(value);
    }

    public static DataValue create(MultiCurrency value) {
        return DataValue.create()
            .setType(DataValueDataValueTypes.MultiCurrency)
            .setValue(new Object() {
                public final String $type = "Relewise.Client.DataTypes.MultiCurrency, Relewise.Client";
                public final ArrayList<Money> Values = value.getValues();
            });
    }

    public static DataValue create(Money... moneyValues) {
        return DataValue.create()
            .setType(DataValueDataValueTypes.MultiCurrency)
            .setValue(new Object() {
                public final String $type = "Relewise.Client.DataTypes.MultiCurrency, Relewise.Client";
                public final Money[] Values = moneyValues;
            });
    }

    public static DataValue create(String... values) {
        return DataValue.create()
            .setType(DataValueDataValueTypes.StringList)
            .setValue(new Object() {
                public final String $type = "System.Collections.Generic.List`1[[System.String, System.Private.CoreLib]], System.Private.CoreLib";
                public final String[] $values = values;
            });
    }

    public static DataValue create(double... values) {
        return DataValue.create()
            .setType(DataValueDataValueTypes.DoubleList)
            .setValue(new Object() {
                public String $type = "System.Collections.Generic.List`1[[System.Double, System.Private.CoreLib]], System.Private.CoreLib";
                public double[] $values = values;
            });
    }

    public static DataValue create(boolean... values) {
        return DataValue.create()
            .setType(DataValueDataValueTypes.BooleanList)
            .setValue(new Object() {
                public final String $type = "System.Collections.Generic.List`1[[System.Boolean, System.Private.CoreLib]], System.Private.CoreLib";
                public final boolean[] $values = values;
            });
    }

    public static DataValue create(Multilingual value) {
        return DataValue.create()
            .setType(DataValueDataValueTypes.Multilingual)
            .setValue(new Object() {
                public final String $type = "Relewise.Client.DataTypes.Multilingual, Relewise.Client";
                public final ArrayList<MultilingualValue> Values = value.getValues();
            });
    }

    public static DataValue create(Language language, String... values) {
        return DataValue.create()
            .setType(DataValueDataValueTypes.MultilingualCollection)
            .setValue(new Object() {
                public final String $type = "Relewise.Client.DataTypes.MultilingualCollection, Relewise.Client";
                public final MultilingualCollectionValue[] Values = new MultilingualCollectionValue[] { new MultilingualCollectionValue(language, values) };
            });
    }

    public static DataValue create(MultilingualCollectionValue[] values) {
        return DataValue.create()
            .setType(DataValueDataValueTypes.MultilingualCollection)
            .setValue(new Object() {
                public final String $type = "Relewise.Client.DataTypes.MultilingualCollection, Relewise.Client";
                public final MultilingualCollectionValue[] Values = values;
            });
    }

    public static DataValue create(Object data) {
        return DataValue.create()
            .setType(DataValueDataValueTypes.Object)
            .setValue(new Object() {
                public final String $type = "Relewise.Client.DataTypes.DataObject, Relewise.Client";
                public final Object Data = data;
            });
    }

    public static DataValue create(DataObject... data) {
        return DataValue.create()
            .setType(DataValueDataValueTypes.ObjectList)
            .setValue(new Object() {
                public final String $type = "System.Collections.Generic.List`1[[Relewise.Client.DataTypes.DataObject, Relewise.Client]], System.Private.CoreLib";
                public final Object $values = data;
            });
    }

}
