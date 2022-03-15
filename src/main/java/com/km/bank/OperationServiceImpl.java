package com.km.bank;

import com.km.bank.model.Compte;
import com.km.bank.model.Operation;
import com.km.bank.model.Personne;

import java.util.Date;
import java.util.List;

public class OperationServiceImpl implements OperationService {
    HistoryAccountService service = new HistoryAccountServiceImpl();
    @Override
    public void deposer(Compte compte, double montant) {
        if (compte != null) {
            compte.setSolde(compte.getSolde() +montant);
            service.saveOperation(new Operation(TypeOperationEnum.CREDIT, new Date(), montant, compte) );
        }
    }

    @Override
    public void retirer(Compte compte, double montant) throws Exception {
        if (compte != null ) {
            if (compte.getSolde() - montant > 0){
                compte.setSolde(compte.getSolde() - montant);
                service.saveOperation(new Operation(TypeOperationEnum.DEBIT, new Date(), montant, compte) );
            }else{
                throw  new Exception("Solde insuffisant");
            }
        }
    }

    @Override
    public List<Operation> operationsCompte(Compte compte) {
        return  compte.getOperations();
    }

    public static void main(String[] args) throws Exception {
        Personne personne = new Personne(Integer.valueOf(1), "Joe", "ToTO");
        Compte compte = new Compte(Integer.valueOf(1), "44522115555", 200d, personne);
        Personne personne2 = new Personne(Integer.valueOf(2), "Faro", "TATA");
        Compte compte2 = new Compte(Integer.valueOf(2), "965855444", 150d, personne2);
        OperationService service = new OperationServiceImpl() ;
        service.deposer(compte , 400d);
        System.out.println("apres depot de compte1 : "+compte.getSolde());
        service.retirer(compte, 500);
        System.out.println("apres retrait du compte1 : " +compte.getSolde());
        service.deposer(compte2 , 400d);
        System.out.println("apres depot de compte2 : "+compte2.getSolde());
        service.retirer(compte2, 500);
        System.out.println("apres retrait du compte2 : "+ compte2.getSolde());
    }
}
