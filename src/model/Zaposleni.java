package model;
// Generated Sep 17, 2019 11:31:18 PM by Hibernate Tools 4.3.1



/**
 * Zaposleni generated by hbm2java
 */
public class Zaposleni  implements java.io.Serializable {


     private Integer zaposleniId;
     private String ime;
     private int godine;
     private String adresa;
     private int plata;

    public Zaposleni() {
    }

    public Zaposleni(String ime, int godine, String adresa, int plata) {
       this.ime = ime;
       this.godine = godine;
       this.adresa = adresa;
       this.plata = plata;
    }
   
    public Integer getZaposleniId() {
        return this.zaposleniId;
    }
    
    public void setZaposleniId(Integer zaposleniId) {
        this.zaposleniId = zaposleniId;
    }
    public String getIme() {
        return this.ime;
    }
    
    public void setIme(String ime) {
        this.ime = ime;
    }
    public int getGodine() {
        return this.godine;
    }
    
    public void setGodine(int godine) {
        this.godine = godine;
    }
    public String getAdresa() {
        return this.adresa;
    }
    
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
    public int getPlata() {
        return this.plata;
    }
    
    public void setPlata(int plata) {
        this.plata = plata;
    }




}


