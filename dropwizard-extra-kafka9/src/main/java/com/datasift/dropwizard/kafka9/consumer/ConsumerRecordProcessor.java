package com.datasift.dropwizard.kafka9.consumer;


import org.apache.kafka.clients.consumer.ConsumerRecords;

/**
 * Processes an {@link Iterable} of messages of type {@code T}.
 * <p>
 * <p>
 * <i>Note: since consumers may use multiple threads, it is important that implementations are
 * thread-safe.</i>
 */
public interface ConsumerRecordProcessor<K, V> {

    /**
     * Process an {@link Iterable} of messages of type T.
     *
     * @param records the records of messages to process.
     */
    void process(ConsumerRecords<K, V> records);
}
