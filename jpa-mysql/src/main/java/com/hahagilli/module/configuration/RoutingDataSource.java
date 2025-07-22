package com.hahagilli.module.configuration;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.transaction.support.TransactionSynchronizationManager;

public class RoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        boolean active = TransactionSynchronizationManager.isActualTransactionActive();
        boolean write = active && !TransactionSynchronizationManager.isCurrentTransactionReadOnly();

        return write ? "write" : "read";
    }
}
