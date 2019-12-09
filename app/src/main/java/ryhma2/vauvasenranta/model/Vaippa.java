package ryhma2.vauvasenranta.model;

/**
 * Object-Oriented Programming java.
 * a simple class with instance variables and contructor, get and set function
 * used in VaippaActivity, Adapter_vaippa, VaippaDao.
 */

public class Vaippa {
    private String mVaippaLaji;
    private String mMuistinpano;
    private String mAika;


    public Vaippa(String mVaippaLaji, String mMuistinpano, String mAika) {
        this.mVaippaLaji = mVaippaLaji;
        this.mMuistinpano = mMuistinpano;
        this.mAika = mAika;
    }

    public Vaippa() {
    }

    public String getmVaippaLaji() {
        return mVaippaLaji;
    }

    public void setmVaippaLaji(String mVaippaLaji) {
        this.mVaippaLaji = mVaippaLaji;
    }

    public String getmMuistinpano() {
        return mMuistinpano;
    }

    public void setmMuistinpano(String mMuistinpano) {
        this.mMuistinpano = mMuistinpano;
    }

    public String getmAika() {
        return mAika;
    }

    public void setmAika(String mAika) {
        this.mAika = mAika;
    }
}
