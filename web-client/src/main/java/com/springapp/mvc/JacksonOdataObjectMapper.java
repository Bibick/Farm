package com.springapp.mvc;

//import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import org.springframework.stereotype.Component;

/**
 * User: istrakhouski
 * Date: 1/13/14 12:48 PM
 */
@Component
public class JacksonOdataObjectMapper extends ObjectMapper{

    public JacksonOdataObjectMapper() {
        final AnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        this.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
        this.configure(SerializationFeature.WRAP_ROOT_VALUE, true);

        this._deserializationConfig = this.getDeserializationConfig().with(introspector);
        this._serializationConfig = this.getSerializationConfig().with(introspector);
        //this.setDeserializationConfig(this.getDeserializationConfig().with(introspector));
        //this.setSerializationConfig(this.getSerializationConfig().with(introspector));

    }
}
