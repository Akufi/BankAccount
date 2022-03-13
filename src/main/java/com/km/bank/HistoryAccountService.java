package com.km.bank;

import com.km.bank.model.Compte;
import com.km.bank.model.Operation;

public interface HistoryAccountService {

    void saveOperation(Operation operation);

    void printOperations(Compte compte);

}
