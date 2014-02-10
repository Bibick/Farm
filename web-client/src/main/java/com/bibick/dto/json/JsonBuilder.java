package com.bibick.dto.json;

/**
 * User: istrakhouski
 * Date: 2/7/14 4:33 PM
 */
public class JsonBuilder<T> {

   private T value;

   public static <T> JsonBuilder <T> entity(T value) {
       return new JsonBuilder<T>(value);
   }

   public JsonBuilder(T value) {
       this.value = value;
   }

   public <T> JsonEntity<T> build() {
       return new JsonEntity(this.value);
   }
}
