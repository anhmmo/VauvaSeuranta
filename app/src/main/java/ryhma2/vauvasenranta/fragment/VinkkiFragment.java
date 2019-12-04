package ryhma2.vauvasenranta.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ryhma2.vauvasenranta.adapter.Adapter_Info;
import ryhma2.vauvasenranta.R;
import ryhma2.vauvasenranta.model.VinkkiLista;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class VinkkiFragment extends Fragment {

   private RecyclerView ryc_vinkki;
   private List<VinkkiLista> vinkkiTiedot;
   private Adapter_Info adapterVinkkiTiedot;

    public VinkkiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_info, container, false);
        ryc_vinkki = v.findViewById(R.id.vinkkitietoa);
        ryc_vinkki.setLayoutManager(new LinearLayoutManager(getActivity()));
        vinkkiTiedot = new ArrayList<>();
        vinkkiTiedot.add(new VinkkiLista("Lue 20 vinkkiä vauvan lohdutukseen","1. Tarkista perusasiat\n" +
                "\n" +
                "Ensimmäisenä kannattaa aina tarkistaa vauvan perustarpeiden tilanne. Onko vauva nälkäinen, väsynyt tai vaipanvaihdon tarpeessa?\n"));
        vinkkiTiedot.add(new VinkkiLista("Itkevän vauvan rauhoittaminen","Kaikki vauvat itkevät. Kun vauva itkee, vanhemmista tuntuu usein siltä, että he tekevät jotakin väärin ja että on oltava jokin keino, jolla itkun saa loppumaan. Valitettavasti tällaista ihmekeinoa ei useinkaan ole. Vauvan hermosto on vielä kehittymätön, eikä hän siksi osaa itse tyynnyttää itseään. Hermostuneet vauvat, jotka elävät vilkkaissa kodeissa, itkevät usein paljon, mutta kaikilla vauvoilla esiintyy itkukausia."));
        vinkkiTiedot.add(new VinkkiLista("Itkevän vauvan rauhoittaminen","Kaikki vauvat itkevät. Kun vauva itkee, vanhemmista tuntuu usein siltä, että he tekevät jotakin väärin ja että on oltava jokin keino, jolla itkun saa loppumaan. Valitettavasti tällaista ihmekeinoa ei useinkaan ole. Vauvan hermosto on vielä kehittymätön, eikä hän siksi osaa itse tyynnyttää itseään. Hermostuneet vauvat, jotka elävät vilkkaissa kodeissa, itkevät usein paljon, mutta kaikilla vauvoilla esiintyy itkukausia."));
        vinkkiTiedot.add(new VinkkiLista("Itkevän vauvan rauhoittaminen","Kaikki vauvat itkevät. Kun vauva itkee, vanhemmista tuntuu usein siltä, että he tekevät jotakin väärin ja että on oltava jokin keino, jolla itkun saa loppumaan. Valitettavasti tällaista ihmekeinoa ei useinkaan ole. Vauvan hermosto on vielä kehittymätön, eikä hän siksi osaa itse tyynnyttää itseään. Hermostuneet vauvat, jotka elävät vilkkaissa kodeissa, itkevät usein paljon, mutta kaikilla vauvoilla esiintyy itkukausia."));
        vinkkiTiedot.add(new VinkkiLista("Itkevän vauvan rauhoittaminen"," Kaikki vauvat itkevät. Kun vauva itkee, vanhemmista tuntuu usein siltä, että he tekevät jotakin väärin ja että on oltava jokin keino, jolla itkun saa loppumaan. Valitettavasti tällaista ihmekeinoa ei useinkaan ole. Vauvan hermosto on vielä kehittymätön, eikä hän siksi osaa itse tyynnyttää itseään. Hermostuneet vauvat, jotka elävät vilkkaissa kodeissa, itkevät usein paljon, mutta kaikilla vauvoilla esiintyy itkukausia."));
        vinkkiTiedot.add(new VinkkiLista("Itkevän vauvan rauhoittaminen","Kaikki vauvat itkevät. Kun vauva itkee, vanhemmista tuntuu usein siltä, että he tekevät jotakin väärin ja että on oltava jokin keino, jolla itkun saa loppumaan. Valitettavasti tällaista ihmekeinoa ei useinkaan ole. Vauvan hermosto on vielä kehittymätön, eikä hän siksi osaa itse tyynnyttää itseään. Hermostuneet vauvat, jotka elävät vilkkaissa kodeissa, itkevät usein paljon, mutta kaikilla vauvoilla esiintyy itkukausia."));
        vinkkiTiedot.add(new VinkkiLista("Itkevän vauvan rauhoittaminen","Kaikki vauvat itkevät. Kun vauva itkee, vanhemmista tuntuu usein siltä, että he tekevät jotakin väärin ja että on oltava jokin keino, jolla itkun saa loppumaan. Valitettavasti tällaista ihmekeinoa ei useinkaan ole. Vauvan hermosto on vielä kehittymätön, eikä hän siksi osaa itse tyynnyttää itseään. Hermostuneet vauvat, jotka elävät vilkkaissa kodeissa, itkevät usein paljon, mutta kaikilla vauvoilla esiintyy itkukausia."));
        vinkkiTiedot.add(new VinkkiLista("Itkevän vauvan rauhoittaminen","Kaikki vauvat itkevät. Kun vauva itkee, vanhemmista tuntuu usein siltä, että he tekevät jotakin väärin ja että on oltava jokin keino, jolla itkun saa loppumaan. Valitettavasti tällaista ihmekeinoa ei useinkaan ole. Vauvan hermosto on vielä kehittymätön, eikä hän siksi osaa itse tyynnyttää itseään. Hermostuneet vauvat, jotka elävät vilkkaissa kodeissa, itkevät usein paljon, mutta kaikilla vauvoilla esiintyy itkukausia."));
        vinkkiTiedot.add(new VinkkiLista("Itkevän vauvan rauhoittaminen","Kaikki vauvat itkevät. Kun vauva itkee, vanhemmista tuntuu usein siltä, että he tekevät jotakin väärin ja että on oltava jokin keino, jolla itkun saa loppumaan. Valitettavasti tällaista ihmekeinoa ei useinkaan ole. Vauvan hermosto on vielä kehittymätön, eikä hän siksi osaa itse tyynnyttää itseään. Hermostuneet vauvat, jotka elävät vilkkaissa kodeissa, itkevät usein paljon, mutta kaikilla vauvoilla esiintyy itkukausia."));
        adapterVinkkiTiedot = new Adapter_Info( vinkkiTiedot, getActivity());
        ryc_vinkki.setAdapter(adapterVinkkiTiedot);
        return v;
    }

}
