package com.km.bank;

import com.km.bank.model.Compte;
import com.km.bank.model.Operation;

import java.util.Date;

public class HistoryAccountServiceImpl implements HistoryAccountService {


    @Override
    public void saveOperation(Compte compte, double montant, TypeOperationEnum type) {
        if (compte != null) {
            compte.getOperations().add(new Operation(type, new Date(), montant, compte));
        }
    }

    @Override
    public void printOperations(Compte compte) {
        if (compte != null) {
            compte.getOperations().stream().forEach(PrinterUtils::formatHistoryOperation);
        }
    }
}
