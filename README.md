# README

## apache-beam-kafka-example
Apache Kafka Integration with Apache Beam


### Requirements
  STEP 1: GET KAFKA
   * Download the latest Kafka release and extract it:

   * ```$ tar -xzf kafka_2.13-3.2.0.tgz```
   * ```$ cd kafka_2.13-3.2.0```

#### STEP 2: START THE KAFKA ENVIRONMENT
NOTE: Your local environment must have Java 8+ installed.

Run the following commands in order to start all services in the correct order:

#### Start the ZooKeeper service
##### Note: Soon, ZooKeeper will no longer be required by Apache Kafka.
    $ bin/zookeeper-server-start.sh config/zookeeper.properties
* Open another terminal session and run:

#### Start the Kafka broker service
    $ bin/kafka-server-start.sh config/server.properties
* Once all services have successfully launched, you will have a basic Kafka environment running and ready to use.

#### STEP 3: CREATE A TOPIC TO STORE YOUR EVENTS
    $ bin/kafka-topics.sh --create --topic <tpoic_name> --bootstrap-server localhost:9092


### 3. Create a Kafka Console Producer.
   Run the following command to start a Kafka Producer, using console interface, writing to sampleTopic.

    $ bin/kafka-console-producer.sh --broker-list localhost:9092 --topic new_topic
### 4. Create a Kafka Console Consumer.
   Run the following command to start a Kafka Consumer, using console interface, subscribed to sampleTopic.

    $ bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic new_topic --from-beginning

### How to run the starter project?
1. To build the service: Open the `Kafka-Integration-With-Apache-Beam`
2. folder in terminal and run `mvn clean install`.
3. To run the test cases: run `mvn clean test`.
