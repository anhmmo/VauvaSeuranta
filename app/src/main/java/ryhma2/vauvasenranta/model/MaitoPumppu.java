package ryhma2.vauvasenranta.model;

import ryhma2.vauvasenranta.base.TimerActivity;

/**
 * Object-Oriented Programming java.
 * a simple class with instance variables and contructor, get and set function
 * used in MaitoActivity, Adapter_maito, MaitoDao.
 */
public class MaitoPumppu {

    private int maitoMaara;
    private String maitoNote;
    private TimerActivity aikoja = new TimerActivity();
    private String ajat = aikoja.getCurrentTime();

    public MaitoPumppu(String ajat, int maitoMaara, String maitoNote) {
        this.ajat = ajat;
        this.maitoMaara = maitoMaara;
        this.maitoNote = maitoNote;
    }

    public MaitoPumppu() {
    }

    public String getAika(){
        return ajat;
    }


    public int getMaitoMaara() {
        return maitoMaara;
    }

    public void setMaitoMaara(int maitoMaara) {
        this.maitoMaara = maitoMaara;
    }

    public String getMaitoNote() {
        return maitoNote;
    }

    public void setmaitoNote(String maitoNote) {
        this.maitoNote = maitoNote;
    }


}
