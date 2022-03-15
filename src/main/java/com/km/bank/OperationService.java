package com.km.bank;

import com.km.bank.model.Compte;
import com.km.bank.model.Operation;

import java.util.List;

public interface OperationService {

    void deposer (Compte compte, double montant);

    void retirer(Compte compte, double montant) throws Exception;

    List<Operation> operationsCompte(Compte compte);

}
