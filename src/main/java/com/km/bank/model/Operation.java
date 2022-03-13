package com.km.bank.model;

import com.km.bank.TypeOperationEnum;

import java.util.Date;

public class Operation {

    private Integer operationId;
    private Date dateOperation;
    private double montantOperation;
    private TypeOperationEnum typeOperation;
    private Compte compte;
    public Operation() {
    }

    public Operation(TypeOperationEnum typeOperation, Date dateOperation, double montantOperation, Compte compte) {
        this.dateOperation = dateOperation;
        this.montantOperation = montantOperation;
        this.typeOperation = typeOperation;
        this.compte = compte;
    }

    public Integer getOperationId() {
        return operationId;
    }

    public void setOperationId(Integer operationId) {
        this.operationId = operationId;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public double getMontantOperation() {
        return montantOperation;
    }

    public void setMontantOperation(double montantOperation) {
        this.montantOperation = montantOperation;
    }

    public TypeOperationEnum getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(TypeOperationEnum typeOperation) {
        this.typeOperation = typeOperation;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }
}
