package com.relewise.client.factory;

import com.relewise.client.model.Language;

public class DataObject {
    public Object Data;

    public DataObject(Object data) {
        this.Data = data;
    }

    public static DataObject create(Object data) {
        return new DataObject(data);
    }
}
