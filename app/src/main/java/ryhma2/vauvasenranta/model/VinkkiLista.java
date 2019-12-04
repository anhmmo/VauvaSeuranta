package ryhma2.vauvasenranta.model;

public class VinkkiLista {
    private String mVinkkiNimi;
    private String mVinkkiTiedot;

    public VinkkiLista(String mVinkkiNimi, String mVinkkiTiedot) {
        this.mVinkkiNimi = mVinkkiNimi;
        this.mVinkkiTiedot = mVinkkiTiedot;
    }

    public VinkkiLista() {
    }

    public String getVinkkiNimi() {
        return mVinkkiNimi;
    }

    public void setVinkkiNimi(String mVinkkiNimi) {
        this.mVinkkiNimi = mVinkkiNimi;
    }

    public String getVinkkiTiedot() {
        return mVinkkiTiedot;
    }

    public void setVinkkiTiedot(String mVinkkiTiedot) {
        this.mVinkkiTiedot = mVinkkiTiedot;
    }
}
