package com.bibick.dto.json;

/**
 * User: istrakhouski
 * Date: 2/7/14 4:33 PM
 */
public class JsonBuilder<T> {

   private T value;

   private boolean success = true;

   public static <T> JsonBuilder <T> entity(T value) {
       return new JsonBuilder<T>(value);
   }

   public JsonBuilder(T value) {
       this.value = value;
   }

    public JsonBuilder(T value, boolean success) {
        this.value = value;
        this.success = success;
    }

    public JsonBuilder(boolean success) {
        this.success = success;
    }

    public <T> JsonEntity<T> build() {
       return new JsonEntity(success, this.value);
   }
}
