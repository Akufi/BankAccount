package com.km.bank;

import com.km.bank.model.Compte;
import com.km.bank.model.Personne;
import org.junit.Assert;
import org.junit.Test;


public class OperationServiceTest {

    @Test
    public void depotMontantCompte(){
        Personne personne = new Personne(Integer.valueOf(1), "Joe", "ToTO");
        Compte compte = new Compte(Integer.valueOf(1), "44522115555", 200d, personne);
        OperationService service = new OperationServiceImpl() ;
        //depo sur compte
        service.deposer(compte , 400d);
        Assert.assertEquals(Double.valueOf(600d), Double.valueOf(compte.getSolde()));
        //apres retrait du compte
        service.retirer(compte, 500d);
        Assert.assertEquals(Double.valueOf(100d), Double.valueOf(compte.getSolde()));
        //depo sur compte
        service.deposer(compte , 850d);
        Assert.assertEquals(Double.valueOf(950d), Double.valueOf(compte.getSolde()));
    }

    @Test
    public void retraitMontantCompte(){
        Personne personne = new Personne(Integer.valueOf(1), "Joe", "ToTO");
        Compte compte = new Compte(Integer.valueOf(1), "44522115555", 1200d, personne);
        OperationService service = new OperationServiceImpl() ;
        //apres retrait du compte
        service.retirer(compte, 400d);
        Assert.assertEquals(Double.valueOf(800d), Double.valueOf(compte.getSolde()));

        //apres retrait du compte
        service.retirer(compte, 350d);
        Assert.assertEquals(Double.valueOf(450d), Double.valueOf(compte.getSolde()));
    }

}
