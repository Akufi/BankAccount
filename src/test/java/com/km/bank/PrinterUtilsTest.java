package com.km.bank;

import com.km.bank.model.Compte;
import com.km.bank.model.Operation;
import com.km.bank.model.Personne;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class PrinterUtilsTest {

    private Personne personne;
    private Compte compte;

    @Before
    public void setUp() throws Exception {
        personne = new Personne(Integer.valueOf(1), "Joe", "ToTO");
        compte = new Compte(Integer.valueOf(1), "44522115555", 200d, personne);
    }

    @Test
    public void printStatement() {
        String historyPrint =
                PrinterUtils.formatHistoryOperation(new Operation(TypeOperationEnum.CREDIT, new Date(), 350d, compte));
        System.out.println(historyPrint);
    }

}