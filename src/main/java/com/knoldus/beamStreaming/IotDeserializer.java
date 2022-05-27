package com.knoldus.beamStreaming;

import java.util.Map;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Deserializer;
import org.codehaus.jackson.map.ObjectMapper;


public class IotDeserializer implements Deserializer<IotEvent> {

    @Override
    public void close() {
        // TODO Auto-generated method stub
        Deserializer.super.close();
    }
    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        // TODO Auto-generated method stub
        Deserializer.super.configure(configs, isKey);
    }

    @Override
    public IotEvent deserialize(String s, byte[] bytes) {
       // TODO Auto-generated method stub
       ObjectMapper om = new ObjectMapper();
       IotEvent iotEvent = null;
       try {
           iotEvent = om.readValue(s, IotEvent.class);
       }
       catch (Exception e){
           System.out.println(e.getMessage());
       }

        return iotEvent;
    }


    @Override
    public IotEvent deserialize(String topic, Headers headers, byte[] data) {
        return Deserializer.super.deserialize(topic, headers, data);
    }


}
