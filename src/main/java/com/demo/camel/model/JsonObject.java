package com.demo.camel.model;

import lombok.Data;

import java.io.Serializable;


/**
 * @author tu
 */
public class JsonObject<T> implements Serializable {
    
    private static final long serialVersionUID = -5704142630465057923L;
    
    public final static String typeData = "data";
    private String type;
    private boolean success;
    private T data;
    private String message;

    public JsonObject() {
        this(null, null, false, "");
    }

    public JsonObject(String type, T data) {
        this(type, data, false, "");
    }

    public JsonObject(String type, T data, boolean success, String message) {
        this.type = type;
        this.data = data;
        this.success = success;
        this.message = message;
    }

    public static JsonObject<String> success() {
        return new JsonObject<String>(typeData, "", true, "");
    }

    public static <T> JsonObject<T> success(String message) {
        return new JsonObject<T>(typeData, null, true, message);
    }

    public static <T> JsonObject<T> success(T data) {
        return new JsonObject<T>(typeData, data, true, "Success");
    }

    public static <T> JsonObject<T> success(T data, String message) {
        return new JsonObject<T>(typeData, data, true, message);
    }

    public static <T> JsonObject<T> error() {
        return new JsonObject<T>(typeData, null, false, "");
    }

    public static <T> JsonObject<T> error(String message) {
        return new JsonObject<T>(typeData, null, false, message);
    }

    public static <T> JsonObject<T> error(T data) {
        return new JsonObject<T>(typeData, data, false, "Fail");
    }

    public static <T> JsonObject<T> error(T data, String message) {
        return new JsonObject<T>(typeData, data, false, message);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void addMessage(String message) {
        this.message = this.message.concat("<br>").concat(message);
    }

}
