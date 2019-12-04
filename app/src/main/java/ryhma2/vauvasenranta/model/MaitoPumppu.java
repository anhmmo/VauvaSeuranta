package ryhma2.vauvasenranta.model;

public class MaitoPumppu {
    private String maitoNimet;
    private int maitoMaara;
    private String maitoNote;

    public MaitoPumppu(String maitoNimet, int maitoMaara, String maitoNote) {
        this.maitoNimet = maitoNimet;
        this.maitoMaara = maitoMaara;
        this.maitoNote = maitoNote;
    }

    public MaitoPumppu() {
    }

    public String getMaitoNimet() {
        return maitoNimet;
    }

    public void setMaitoNimet(String maitoNimet) {
        this.maitoNimet = maitoNimet;
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
