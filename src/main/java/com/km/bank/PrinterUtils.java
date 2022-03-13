package com.km.bank;

import com.km.bank.model.Operation;

import java.util.StringJoiner;

public class PrinterUtils {

    public static String formatHistoryOperation(Operation operation) {
        return new StringJoiner(" | ")
                .add("Date='" + operation.getDateOperation() + "'")
                .add("Montant='" + operation.getMontantOperation() + "'")
                .add("TypeOperation='" + operation.getTypeOperation() + "'")
                .add("Solde='" + operation.getCompte().getSolde() + "'").toString();
    }
}
