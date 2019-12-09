package ryhma2.vauvasenranta.model;


/**
 * Object-Oriented Programming java.
 * a simple class with instance variables and contructor, get and set function
 * used in VinkkiActivity, VinkkiFragment, VinkkiLista, Adepter_info, InfoActivity.
 */
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
