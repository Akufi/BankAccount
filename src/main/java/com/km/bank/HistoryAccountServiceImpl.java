package com.km.bank;

import com.km.bank.model.Compte;
import com.km.bank.model.Operation;

public class HistoryAccountServiceImpl implements HistoryAccountService {


    @Override
    public void saveOperation(Operation operation) {
        if (operation.getCompte() != null) {
            operation.getCompte().getOperations().add(operation);
        }
    }

    @Override
    public void printOperations(Compte compte) {
        if (compte != null) {
            compte.getOperations().stream().forEach(PrinterUtils::formatHistoryOperation);
        }
    }
}
