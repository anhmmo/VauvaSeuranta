package ryhma2.vauvasenranta.common;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import ryhma2.vauvasenranta.fragment.VinkkiFragment;
import ryhma2.vauvasenranta.fragment.TautiJaLaakeFragment;


public class Adapter_TAUTI_VINKKI_tablelayout extends FragmentStatePagerAdapter {
    public Adapter_TAUTI_VINKKI_tablelayout(FragmentManager fm) {
        super(fm);
    }

    //calling tab by choosing position of item
    //sample https://stackoverflow.com/questions/26822516/how-to-display-3-fragments-inside-pageviewer
    // sample from https://github.com/nahuel-cci/1erParcial/blob/873dfb3413e67058da66b916a56fc9f1eb69dd02/1erParcial/app/src/main/java/com/example/nahuel/a1erparcial/SampleFragmentPagerAdapter.java

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new TautiJaLaakeFragment();
            case 1:
                return new VinkkiFragment();
            default:
                return null;
        }
    }
    @Override
    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "TAUTI JA LÄÄKE";
            case 1:
                return "HOITO-OPAS";
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return 2;
    }
}
