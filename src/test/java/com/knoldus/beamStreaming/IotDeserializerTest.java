package com.knoldus.beamStreaming;

import static org.junit.jupiter.api.Assertions.assertNull;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import org.apache.kafka.common.header.internals.RecordHeaders;
import org.junit.jupiter.api.Test;

class IotDeserializerTest {
    /**
     * Method under test: {@link IotDeserializer#close()}
     */
    @Test
    void testClose() {
        // TODO: Complete this test.
        // There are no fields that could be asserted on.

        (new IotDeserializer()).close();
    }

    /**
     * Method under test: {@link IotDeserializer#configure(java.util.Map, boolean)}
     */
    @Test
    void testConfigure() {

        //  TODO: Complete this test.
        //   Make sure that fields modified by configure(Map, boolean)
        //   have package-private, protected, or public getters.

        IotDeserializer iotDeserializer = new IotDeserializer();
        iotDeserializer.configure(new HashMap<>(), true);
    }

    /**
     * Method under test: {@link IotDeserializer#deserialize(String, org.apache.kafka.common.header.Headers, byte[])}
     */
    @Test
    void testDeserialize() throws UnsupportedEncodingException {
        IotDeserializer iotDeserializer = new IotDeserializer();
        RecordHeaders headers = new RecordHeaders();
        assertNull(iotDeserializer.deserialize("Topic", headers, "AAAAAAAA".getBytes("UTF-8")));
    }

    /**
     * Method under test: {@link IotDeserializer#deserialize(String, byte[])}
     */
    @Test
    void testDeserialize2() throws UnsupportedEncodingException {
        IotDeserializer iotDeserializer = new IotDeserializer();
        assertNull(iotDeserializer.deserialize("foo", "AAAAAAAA".getBytes("UTF-8")));
    }
}

