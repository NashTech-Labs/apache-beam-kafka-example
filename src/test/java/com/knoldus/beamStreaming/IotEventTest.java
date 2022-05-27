package com.knoldus.beamStreaming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class IotEventTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link IotEvent#IotEvent()}
     *   <li>{@link IotEvent#setDescription(String)}
     *   <li>{@link IotEvent#setDeviceId(String)}
     *   <li>{@link IotEvent#setEventTime(Long)}
     *   <li>{@link IotEvent#setName(String)}
     *   <li>{@link IotEvent#setTemperature(Double)}
     *   <li>{@link IotEvent#setUnit(String)}
     *   <li>{@link IotEvent#getDescription()}
     *   <li>{@link IotEvent#getDeviceId()}
     *   <li>{@link IotEvent#getEventTime()}
     *   <li>{@link IotEvent#getName()}
     *   <li>{@link IotEvent#getTemperature()}
     *   <li>{@link IotEvent#getUnit()}
     * </ul>
     */
    @Test
    void testConstructor() {
        IotEvent actualIotEvent = new IotEvent();
        actualIotEvent.setDescription("The characteristics of someone or something");
        actualIotEvent.setDeviceId("42");
        actualIotEvent.setEventTime(1L);
        actualIotEvent.setName("Name");
        actualIotEvent.setTemperature(10.0d);
        actualIotEvent.setUnit("Unit");
        assertEquals("The characteristics of someone or something", actualIotEvent.getDescription());
        assertEquals("42", actualIotEvent.getDeviceId());
        assertEquals(1L, actualIotEvent.getEventTime().longValue());
        assertEquals("Name", actualIotEvent.getName());
        assertEquals(10.0d, actualIotEvent.getTemperature().doubleValue());
        assertEquals("Unit", actualIotEvent.getUnit());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link IotEvent#IotEvent(String, String, String, Long, Double, String)}
     *   <li>{@link IotEvent#setDescription(String)}
     *   <li>{@link IotEvent#setDeviceId(String)}
     *   <li>{@link IotEvent#setEventTime(Long)}
     *   <li>{@link IotEvent#setName(String)}
     *   <li>{@link IotEvent#setTemperature(Double)}
     *   <li>{@link IotEvent#setUnit(String)}
     *   <li>{@link IotEvent#getDescription()}
     *   <li>{@link IotEvent#getDeviceId()}
     *   <li>{@link IotEvent#getEventTime()}
     *   <li>{@link IotEvent#getName()}
     *   <li>{@link IotEvent#getTemperature()}
     *   <li>{@link IotEvent#getUnit()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        IotEvent actualIotEvent = new IotEvent("42", "Name", "The characteristics of someone or something", 1L, 10.0d,
                "Unit");
        actualIotEvent.setDescription("The characteristics of someone or something");
        actualIotEvent.setDeviceId("42");
        actualIotEvent.setEventTime(1L);
        actualIotEvent.setName("Name");
        actualIotEvent.setTemperature(10.0d);
        actualIotEvent.setUnit("Unit");
        assertEquals("The characteristics of someone or something", actualIotEvent.getDescription());
        assertEquals("42", actualIotEvent.getDeviceId());
        assertEquals(1L, actualIotEvent.getEventTime().longValue());
        assertEquals("Name", actualIotEvent.getName());
        assertEquals(10.0d, actualIotEvent.getTemperature().doubleValue());
        assertEquals("Unit", actualIotEvent.getUnit());
    }
}

