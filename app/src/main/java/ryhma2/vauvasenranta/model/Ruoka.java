package ryhma2.vauvasenranta.model;

import ryhma2.vauvasenranta.base.TimerActivity;
/**
 * Object-Oriented Programming java.
 * a simple class with instance variables and contructor, get and set function
 * used in RuokaActivity, Adapter_ruoka, RuokaDao.
 */
public class Ruoka {
    private String ruokaLaji;
    private int maitoMaara;
    private String muistiPano;
    private TimerActivity aikoja = new TimerActivity();
    private String ajat = aikoja.getCurrentTime();

    public Ruoka(String ruokaLaji, int maitoMaara, String muistiPano, String ajat) {
        this.ruokaLaji = ruokaLaji;
        this.maitoMaara = maitoMaara;
        this.muistiPano = muistiPano;
        this.ajat = ajat;
    }

    public Ruoka() {
    }

    public String getAika(){
        return ajat;
    }

    public String getRuokaLaji() {
        return ruokaLaji;
    }

    public void setRuokaLaji(String ruokaLaji) {
        this.ruokaLaji = ruokaLaji;
    }

    public int getMaitoMaara() {
        return maitoMaara;
    }

    public void setMaitoMaara(int maitoMaara) {
        this.maitoMaara = maitoMaara;
    }

    public String getMuistiPano() {
        return muistiPano;
    }

    public void setMuistiPano(String muistiPano) {
        this.muistiPano = muistiPano;
    }
}
