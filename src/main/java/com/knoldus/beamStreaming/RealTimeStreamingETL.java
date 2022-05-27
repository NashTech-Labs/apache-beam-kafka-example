package com.knoldus.beamStreaming;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.kafka.KafkaIO;
import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.values.KV;
import org.apache.kafka.common.serialization.ByteArrayDeserializer;

/**
 * created RealTimeStreamingETL class
 * provide real time data
 */
public class RealTimeStreamingETL {
    /**
     * main Method Called here..
     * @param args arguments
     */
    public static void main(String[] args) {
        Pipeline p = Pipeline.create();

        p.apply(KafkaIO.<byte[]  ,byte[]> read()
                .withBootstrapServers("localhost:9092")
                .withTopic("new_topic")
                .withKeyDeserializer(ByteArrayDeserializer.class)
                .withValueDeserializer(ByteArrayDeserializer.class)
                .withoutMetadata()
                )
                //.apply(Values.<IotEvent>create())
                .apply(ParDo.of(new DoFn<KV<byte[],byte[]>,Void>() {

                    @ProcessElement
                    public void processElement(ProcessContext c){

                        String string = new String(Objects.requireNonNull(c.element().getValue()), StandardCharsets.UTF_8);   //string with "UTF-8" encoding
                        System.out.println(string);
                    }

                }));
                p.run(); // TODO implementation of above 

    }
}
