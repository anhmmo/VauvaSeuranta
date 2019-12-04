package ryhma2.vauvasenranta.model;

import ryhma2.vauvasenranta.base.TimerActivity;

public class Mittaus {
    private String mittausNote;
    private double pituus;
    private double paino;
    private TimerActivity aikoja = new TimerActivity();
    private String ajat = aikoja.getCurrentTime();

    public Mittaus(String mittausNote, double pituus, double paino, String ajat) {
        this.mittausNote = mittausNote;
        this.pituus = pituus;
        this.paino = paino;
        this.ajat = ajat;
    }

    public Mittaus() {
    }

    public String getAika(){
        return ajat;
    }

    public String getMittausNote() {
        return mittausNote;
    }

    public void setMittausNote(String mittausNote) {
        this.mittausNote = mittausNote;
    }

    public double getPituus() {
        return pituus;
    }

    public void setPituus(double pituus) {
        this.pituus = pituus;
    }

    public double getPaino() {
        return paino;
    }

    public void setPaino(double paino) {
        this.paino = paino;
    }
}
