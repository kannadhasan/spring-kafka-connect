# spring-kafka-connect

# Start Zookeeper
bin/zookeeper-server-start.sh config/zookeeper.properties

# Start Kafka Server
bin/kafka-server-start.sh config/server.properties

# Produce from kafka console
/kafka_2.12-2.2.0/bin/kafka-console-producer.sh --ber-list localhost:9092 --topic test

