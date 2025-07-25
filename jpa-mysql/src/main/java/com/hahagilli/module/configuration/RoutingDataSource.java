package com.hahagilli.module.configuration;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.transaction.support.TransactionSynchronizationManager;

public class RoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        boolean transactionActive = TransactionSynchronizationManager.isActualTransactionActive();
        boolean readOnly = transactionActive && TransactionSynchronizationManager.isCurrentTransactionReadOnly();

        return readOnly ? "read" : "write";
    }
}
