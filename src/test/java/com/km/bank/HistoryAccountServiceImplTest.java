package com.km.bank;

import com.km.bank.model.Compte;
import com.km.bank.model.Operation;
import com.km.bank.model.Personne;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class HistoryAccountServiceImplTest {
    private HistoryAccountService service;
    private Personne personne;
    private Compte compte;


    @Before
    public void setUp() throws Exception {
        service = new HistoryAccountServiceImpl();
        personne = new Personne(Integer.valueOf(1), "Joe", "ToTO");
        compte = new Compte(Integer.valueOf(1), "44522115555", 200d, personne);
    }

    @Test
    public void saveOperation() {
        service.saveOperation(compte, 350d, TypeOperationEnum.CREDIT );
        service.saveOperation(compte, 3870d, TypeOperationEnum.CREDIT);
        Assert.assertTrue(compte.getOperations().size() == 2 );
    }

}