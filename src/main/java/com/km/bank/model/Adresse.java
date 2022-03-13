package com.km.bank.model;

public class Adresse {

    private String adr1;
    private String adr2;
    private String adr3;
    private String codePostal;
    private String ville;

    public String getAdr1() {
        return adr1;
    }

    public void setAdr1(String adr1) {
        this.adr1 = adr1;
    }

    public String getAdr3() {
        return adr3;
    }

    public void setAdr3(String adr3) {
        this.adr3 = adr3;
    }

    public String getAdr2() {
        return adr2;
    }

    public void setAdr2(String adr2) {
        this.adr2 = adr2;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostale) {
        this.codePostal = codePostale;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
