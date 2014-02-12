package com.bibick.dto.json;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;

/**
 * User: istrakhouski
 * Date: 1/13/14 12:11 PM
 */
@JsonPropertyOrder({"value"})
@JsonAutoDetect(fieldVisibility = ANY, getterVisibility = NONE, setterVisibility = NONE)
public class JsonEntity<T> {

    private boolean success = true;

    @JsonUnwrapped
    private T value;

    public JsonEntity(T value) {
        this.value = value;
    }

    public JsonEntity(boolean success, T value) {
        this.success = success;
        this.value = value;
    }

    public JsonEntity(boolean success) {
        this.success = success;
    }

    public  boolean isSuccess() {
        return success;
    }

}
