package com.km.bank;

import com.km.bank.model.Compte;
import com.km.bank.model.Operation;

public interface HistoryAccountService {

    void saveOperation(Compte compte, double montant, TypeOperationEnum type);

    void printOperations(Compte compte);

}
