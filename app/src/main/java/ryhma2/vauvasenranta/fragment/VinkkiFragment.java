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
        vinkkiTiedot.add(new VinkkiLista("RAVITSEMUS","Äidinmaito on vastasyntyneen ensisijainen ravinnonlähde. Niin äidin kuin\n" +
                "vastasyntyneenkin kannalta, sen edut ovat kiistattomat. Valtakunnallisen suosituksen\n" +
                "mukaan täysimetystä tulisi jatkaa 4-6 kuukauden ikään saakka. Kuuden kuukauden iästä\n" +
                "lähtien voi vauvalle aloittaa lisäruokien antamisen.\n" +
                "Imetyksestä on hyötyä sekä äidille että vauvalle. Etuja ovat molempien osapuolien\n" +
                "hyvinvointi sekä imetyksen käytännöllisyys. Imetys helpottaa myös arkea siinä mielessä,\n" +
                "että se mahdollistaa liikkumisen vauvan kanssa vapaammin. Imetyksen on katsottu myös\n" +
                "lisäävän äitien itseluottamusta naisina.\n" +
                "Rintaruokinta tarjoaa myös paljon enemmän kuin vain ravintoa. Imetys luo läheisyyttä ja\n" +
                "lämpöä. Se vahvistaa äidin ja lapsen välistä sidettä. Samalla lisääntyy oksitosiinihormonin\n" +
                "tuotanto, joka aikaansaa kohdun supistelut. Imetyksen onnistuminen voi viedä hetken\n" +
                "aikaa ja vaatiikin kärsivällisyyttä. Voi viedä muutamia päiviä, ennen kuin maidontuotanto\n" +
                "lähtee käyntiin. Imetykseen voi saada ohjausta neuvoloiden perhevalmennuksissa,\n" +
                "kätilöiltä ja terveydenhoitajilta. Lisäksi kokemuksia kannattaa jakaa ystävien ja tuttavien\n" +
                "kanssa, tai esimerkiksi lapsivuodeosastolla muiden synnyttäneiden äitien kanssa.\n" +
                "Imettäminen vaatii oikeanlaista imetystekniikkaa. \n" +
                "Itkeminen on usein myöhäinen nälän merkki. Vauvaa tulisikin alusta saakka syöttää\n" +
                "vauvantahtisesti eli aina kun hän haluaa ruokaa. Varhaisia merkkejä ovat esimerkiksi\n" +
                "vauvan pään kääntely sivuille, hamuaminen ja huulten lipominen. Maiskuttelu ja käden\n" +
                "vieminen suuhun ovat myös varhaisia tällaisia merkkejä. Imetys on helpompaa, kun\n" +
                "vauvan varhaisiin nälän merkkeihin vastataan. Äidinmaidon lisäksi vauva tarvitsee\n" +
                "ainoastaan D-vitamiinia.\n" +
                "Aina imetys ei onnistu. Silloin kannattaa hakea apua esimerkiksi synnytyssairaalasta tai\n" +
                "neuvoloiden terveydenhoitajilta. Esteitä imetykselle voi olla esimerkiksi jokin äidin sairaus\n" +
                "tai lääkitys. Jos imetys ei onnistu, voi se johtaa äidin turhautumiseen. Jos vauvan\n" +
                "rintaruokinta syystä tai toisesta ei onnistu, tulee vauvan rintaruokintaa jatkaa\n" +
                "pulloruokinnalla"));
        vinkkiTiedot.add(new VinkkiLista("D-VITAMIINI","D-vitamiinin tarve on etenkin kasvuikäisille ja raskaana oleville äideille niin keskeistä, että\n" +
                "suositusten mukaan sitä tulisi nauttia ruokavaliosta ja vuodenajasta riippumatta. Riittävän\n" +
                "D-vitamiinin saannin on pitkään tiedetty olevan tärkeä rakennusaine luuston kasvulle ja\n" +
                "kunnolle. Tutkimusten perusteella D-vitamiinin katsotaan myös ehkäisevän monenlaisia\n" +
                "sairauksia. Suositusten mukaan kaikille alle 2-vuotiaille lapsille, raskaana oleville ja\n" +
                "imettäville suositellaan 10µg D-vitamiinilisää vuorokaudessa. Vitamiinin antaminen\n" +
                "aloitetaan vauvan ollessa kahden viikon ikäinen.\n" +
                "Lue lisää D-vitamiinista ja sen antamisesta vauvalle\n" +
                "- Vastasyntyneen ensisijainen ravinto on äidin maito\n" +
                "- Imetyksestä on hyötyä sekä äidille että vauvalle\n" +
                "- Ei kannata lannistua jos imetys ei heti onnistu. Tukea imetykseen on mahdollisuus\n" +
                "saada esimerkiksi neuvoloissa\n" +
                "- Suositusten mukaan kaikille alle 2-vuotiaille lapsille suositellaan 10µg D-vitamiinilisää\n" +
                "vuorokaudessa"));
        vinkkiTiedot.add(new VinkkiLista("UNI","Ateriat ja uni määrittävät vauvan vuorokausirytmin. Alkuun vauva nukkuu suuren osan\n" +
                "aterioidensa välissä. Vastasyntyneen unijaksot ovat epäsäännöllisiä ja lyhyitä. Vauvan\n" +
                "rytmi saattaa täysin poiketa vanhempien luontaisesta rytmistä. Tässä vaiheessa\n" +
                "vanhempien on hyväksyttävä tietynlainen rytmittömyys juuri tähän elämänvaiheeseen\n" +
                "kuuluvana asiana. Voimavaroja koetellaan, kun pitkään jatkunut unen puute väsyttää\n" +
                "vanhempia. Onneksi valvominen ei kuitenkaan kestä loputtomiin. Kun unirutiinit toistuvat\n" +
                "säännöllisinä, auttavat ne vauvaa nukkumaan. Yön ja päivän erot voi opettaa erilaisin\n" +
                "keinoin, kuten esimerkiksi himmentämällä huoneen valaistusta nukkumaan mentäessä.\n" +
                "Yö tulisi rauhoittaa lepoa varten. Iltarutiineilla voi aloittaa nukkumaanmenon. Valojen\n" +
                "himmentäminen ja äänien vaimentaminen auttavat rytmin opettelussa. Vauva nukahtaa\n" +
                "usein rinnalle, josta vanhempi voi hänet nostaa omaan sänkyynsä. Yöllä hoitotoimenpiteet\n" +
                "tulisi minimoida välttämättömimpiin. Pienet ääntelyt ja tuhahtelut eivät välttämättä tarkoita,\n" +
                "että vauva tulisi nostaa heti syliin seurustelemaan. Kun vauvalle tulee nälkä, ilmaisee hän\n" +
                "sen niin, ettei siitä voi erehtyä. Kun vauva on syönyt, nostetaan hänet takaisin sänkyyn\n" +
                "jatkamaan unia. Keskellä yötä ei vaipan vaihto ole aina välttämätöntä. Olisi tärkeää, että\n" +
                "myös vanhemmat huolehtisivat omasta jaksamisestaan menemällä hekin nukkumaan\n" +
                "varhain. On tärkeää, että hoitaja lepää riittävästi, sillä väsyneenä on suurempi riski\n" +
                "hermostua.\n" +
                "Lisätietoa vastasyntyneen unesta.\n" +
                "- Vastasyntynyt nukkuu suurimman ajan päivästä\n" +
                "- Unijaksot voivat olla epäsäännöllisiä ja lyhyitä\n" +
                "- Unirytmin opettelu kannattaa aloittaa jo vauvana"));
        vinkkiTiedot.add(new VinkkiLista("VARHAINEN VUOROVAIKUTUS","Vauva nauttii siitä, että vanhempi iloitsee olla hänen kanssaan. Hän tarvitsee pysyviä ja\n" +
                "lämpimiä suhteita häntä hoitaviin henkilöihin. Yhteinen tekeminen ei tarvitse olla erikseen\n" +
                "suunniteltua. Tavalliset arjen askareet kuten vaipan vaihto, kylvetys, pukeminen ja ruokailu\n" +
                "ovat hetkiä, jolloin vanhempi ja vauva ovat keskenään vuorovaikutuksessa. Keskinäisellä\n" +
                "vuorovaikutuksella opetellaan yhdessä elämistä ja osoitetaan ja jaetaan tunteita.\n" +
                "Leikkiminen, loruilu, ulkoilu ja satujen lukeminen ovat hetkiä, jossa osoitetaan rakkautta ja\n" +
                "hyväksyntää. Varhainen vuorovaikutus on oikeastaan kaikkea vanhemman ja vauvan\n" +
                "yhdessä tekemistä. Hyvä varhainen vuorovaikutus vanhemman ja lapsen välillä on tärkeää\n" +
                "sillä se luo muun muassa pohjaa hyvälle itsetunnolle. Hyvän varhaisen vuorovaikutuksen\n" +
                "seurauksena vauvalle kehittyy riittävä perusturva, jolloin hän kykenee ympäristönsä\n" +
                "tutkimiseen, leikkimiseen ja uuden oppimiseen."));
        vinkkiTiedot.add(new VinkkiLista("VAUVAN HOITO KOTONA","Vastasyntyneen iho on ohut ja herkkä. Se hilseilee ja saattaa olla hyvinkin kuiva.\n" +
                "Päivittäistä kylvettämistä tulisi välttää, kaksi- kolme kertaa viikossa riittää. Tärkeää on\n" +
                "pitää puhtaana kasvot, kädet, vaippa-alue ja ihopoimut. Ne voi pestä lämpimällä vedellä\n" +
                "vesihanan alla. Vaippa-alueen ihoa ei tarvitse vesipesua kuin kakkavaippojen vaihdon\n" +
                "- Varhainen vuorovaikutus tarkoittaa kaikkea vanhemman ja vauvan yhdessä\n" +
                "tekemistä\n" +
                "- Esimerkiksi loruilu, laulelu ja kaikki arjen askareet ovat hetkiä, joissa vauva\n" +
                "ja vanhempi ovat keskenään vuorovaikutuksessa\n" +
                "- Varhainen vuorovaikutus luo vauvalle perusturvaa\n" +
                "yhteydessä. Kuivalla, pehmeällä pyyhkeellä iho taputellaan kuivaksi välttäen hankaamista.\n" +
                "Pyllypyyhe ja kasvopyyhe tulee olla erikseen. Kuivaihoista vauvaa voi hoitaa\n" +
                "hajusteettomalla hoitoöljyllä. Myös ilmakylvyt tekevät vaippa-alueelle hyvää.\n" +
                "Vastasyntyneen iholle voi syntymän jälkeen ilmaantua pieniä näppylöitä. Usein lähes\n" +
                "poikkeuksetta ne ovat vaarattomia. Pienet valkoiset näppylät, jotka ilmaantuvat yleensä\n" +
                "kasvoihin, ovat ihohuokosten tukkeutumisesta johtuvia, mutta ne häviävät muutamassa\n" +
                "viikossa itsestään. Hyönteisen pistoa muistuttavat punaiset läiskät, joissa on vaaleampi\n" +
                "näppylä keskellä, katoavat myös itsestään. Niitä voi ilmaantua eri puolella kehoa, eikä\n" +
                "niiden syytä tarkalleen tiedetä. Kolmantena tavallisena iho-oireena voi ilmetä\n" +
                "vastasyntyneen kasvoille ilmestyvät finnit, jotka ovat seuraus äidiltä saaduista\n" +
                "hormoneista. Nämäkin ovat vaarattomia ja häviävät muutamassa kuukaudessa.\n" +
                "Syntymän jälkeen napanuora katkaistaan ja suljetaan pienellä kumirenkaalla. Yhdenkahden viikon kuluttua jäljellä oleva napanuoran osa kuivuu ja irtoaa. Napaa tulisi tarkkailla\n" +
                "ja hoitaa ennen irtoamista. Navan seutu pidetään kuivana tulehdusriskin estämiseksi.\n" +
                "Napaa voi hoitaa esimerkiksi veteen kostutetulla pumpulipuikolla, jonka jälkeen se\n" +
                "kuivatan huolellisesti.\n" +
                "Jotta vauva ei pääse raapimaan kasvojaan, olisi hänen kynnet leikattava. Suositusten\n" +
                "mukaan aikaisintaan kahden viikon ikäisenä voi aloittaa vauvan kynsien leikkaamisen. Jos\n" +
                "vauvalla on ennen kahden viikon ikää jo kovin terävät kynnet, voidaan käyttää tumppuja\n" +
                "suojaamaan raapimisilta. Kynnet olisi hyvä leikata kun ne ovat hieman pehmenneet \n" +
                "esimerkiksi kylvetyksen jälkeen. Myös vauvan ollessa unessa, ovat kynnet mukavan\n" +
                "helppo leikata."));
        vinkkiTiedot.add(new VinkkiLista("AISTI","Vauvan aistit toimivat heti syntymästä lähtien ja niiden avulla hän tutustuu kohdun\n" +
                "ulkopuoliseen maailmaan. Vauva on jo kohdussa ollessaan kuullut äitinsä äänen ja\n" +
                "tunnistaa sen synnyttyään. Äidin ääni on vauvalle tutuin. Vauvalle juteltaessa, hän\n" +
                "kuuntelee ja rekisteröi valtavan määrän erilaisia äänteitä, sävyjä ja vivahteita. Näin myös\n" +
                "vauvaa itse valmistellaan äänteiden tuottamiselle.\n" +
                "Vastasyntynyt näkee parhaiten 25 -30 senttimetrin päähän, kauempana olevia muotoja\n" +
                "hän ei pysty tarkentamaan. Vauva tunnistaa muutaman päivän iässä äidin kasvot ja\n" +
                "seuraa niitä mielellään. Erityisesti silmät ovat mielenkiintoiset. Ensimmäisten viikkojen\n" +
                "aikana vauvat ovat kiinnostuneempia enemmän mustavalkoisista kuin värillisistä kuvista.\n" +
                "Kaarevat muodot ja kolmiulotteiset esineet ovat kiinnostavia.\n" +
                "Vauva tunnistaa noin viikon ikäisenä äidin maitonsa tuoksun ja se valmistaa häntä\n" +
                "rauhoittumaan imetykseen. Äidin maito on hieman makeaa ja vauva suosiikin makeita\n" +
                "makuja. Vauvalle iho ja tuntoaisti ovat tärkeimpiä, siksi on erityisen tärkeä helliä ja\n" +
                "koskettaa vauvaa. Se on avain ainutlaatuiselle tutustumiselle ja kestävälle\n" +
                "kiintymyssuhteelle. Vauvan päätä on muistettava tukea aina syliin otettaessa tai makuulle\n" +
                "- On tärkeää pitää puhtaana kasvot, kädet, vaippa-alue ja ihopoimut\n" +
                "- Pieniä iholle ilmestyviä näppylöitä ei tarvitse pelästyä. Ne voivat olla vaarattomia\n" +
                "tukkeutuneita ihohuokosia tai itsestään häviäviä niin kutsuttuja\n" +
                "hormoninäppylöitä\n" +
                "- Napatynkää tulee tarkkailla ja hoitaa ennen irtoamista\n" +
                "- kahden viikon ikäisenä voi aloittaa vauvan kynsien leikkaamisen, jotta hän ei\n" +
                "pääsisi raapimaan kasvojaan\n" +
                "laittaessa. Syli, jossa sekä äiti että vauva ovat rentoina ja häntä pidellään hellästi, on\n" +
                "vauvalle turvallisin paikka."));
        vinkkiTiedot.add(new VinkkiLista("KEHITYS","Jokainen vauva on omanlaisensa yksilö ja kehittyy omaan tahtiinsa. Ensimmäisen\n" +
                "elinkuukauden aikana vauvan itku saa erilaisia merkityksiä, nälkäitku, väsymysitkua,\n" +
                "pahan olon itkua, väsymysitkua, turhautumisitkua. Pikku hiljaa äiti alkaa tunnistamaan eri\n" +
                "itkujen aiheita ja vastaa itkuihin nopeammin ja mahdollisesti varmemmin.\n" +
                "Vauva seuraa esineitä katseellaan, jotka liikkuvat sivuilta toisille. Kädet ovat pääosin\n" +
                "nyrkissä ja voivat hakeutua silloin tällöin suuhunkin. Vatsamakuullaan vauva saattaa\n" +
                "kannatella jo pienen hetken päätään. Jalat ja kädet ojentuvat ja heiluvat innokkaasti.\n" +
                "Toisena elinkuukautenaan vauva saattaa tuottaa erilaisia äänteitä, mutta niille ei vielä ole\n" +
                "tarkoitusta. Hoitajan kehonkieli on mielenkiintoista ja vauva tarkkaileekin ympäröiviä\n" +
                "ihmisiä mielellään. Kädet avautuvat nyrkeistä ja tarrautuvat johonkin esineeseen. Mahalla\n" +
                "ollessaan pään kannattelu sujuu jo huomattavasti paremmin. Ensimmäiset hymyt alkavat\n" +
                "esiintymään. Osa vauvoista voi nukkua jo koko yön heräämättä.\n" +
                "Kolmen kuukauden iässä vauva alkaa kuulla jo hiljaisempia ääniä. Hän alkaa jokellella ja\n" +
                "tuottaa erilaisia vokaaliäänteitä. Hän yrittää aktiivisemmin tarttua erilaisiin esineisiin ja\n" +
                "leluihin. Kuvat alkavat kiinnostaa esim. kirjoissa ja vauva yrittää koskettaa niitä. Liikkeet\n" +
                "alkavat olla hallituimpia ja niihin tulee enemmän voimaa. Vauva saattaa jo kovasti yrittää\n" +
                "kääntyä, muttei välttämättä vielä onnistu. Sängyssä ollessaan vauva liikuskelee kovasti ja\n" +
                "saattaakin olla eri kohdassa, johon hänet viimeksi jätettiin. Ilmeitä on jo monenlaisia ja ne\n" +
                "viestittävät vauvan mielialoista.\n" +
                "Neljäntenä elinkuukautenaan vauva alkaa jo selvästi naureskelemaan. Vanhemmat ovat\n" +
                "erittäin tärkeitä. Silmät kohdistuvat sekä lähelle että kauas samoin kuin aikuisilla.\n" +
                "Kehonhallinta on jo huomattavasti kehittyneempää, pikku hiljaa vauva kääntyy vatsalta\n" +
                "selälleen ja selältä vatsalleen. Päivittäiset rutiinit kuten syöminen, pukeminen ja\n" +
                "peseytyminen ovat vauvalle tärkeitä.\n" +
                "Viiden kuukauden iässä vauvan jokeltelu kehittyy ja hän alkaa käyttämään vokaalikonsonanttijonoa esim. papapa. Vanhempien ilmeet kiinnostavat ja vauva saattaa matkia\n" +
                "niitä. Kädet puristavat jo tiukasti esineitä ja mikäli esine putoaa, vauva yrittää etsiä sitä ja\n" +
                "tarrautua siihen uudestaan. Liikkuminen alkaa yleensä taaksepäin menemisellä, yritystä\n" +
                "kuitenkin eteenpäin ryömimiselle löytyy. Mielilelu saattaa löytyä ja vauva saattaakin leikkiä\n" +
                "hetkiä ilman aikuista.\n" +
                "Noin puoli vuotiaana vauvan jutustelu aikuisen kanssa saattaa alkaa muodostumaan\n" +
                "vastavuoroiseksi. Konsonantit lisääntyvät äänteissä ja äänneyhdistelmistä tulee pidempiä.\n" +
                "Vauva alkaa viemään suuhunsa tavaroita, esineitä ja pikku hiljaa myös ruokaa. Vauva\n" +
                "oppii istumaan ilman tukea ja alkaa hakemaan konttausasentoa. Tässä iässä voi alkaa\n" +
                "esiintymään myös vierastusta uusia ihmisiä kohtaan. Tällöin lapsi turvautuu\n" +
                "vanhempaansa ja hakeutuu esimerkiksi syliin. Vauva saattaa oppia tunnistamaan jo oman\n" +
                "nimensä kutsuttaessa ja kääntyy sen suuntaan"));

        adapterVinkkiTiedot = new Adapter_Info( vinkkiTiedot, getActivity());
        ryc_vinkki.setAdapter(adapterVinkkiTiedot);
        return v;
    }

}
