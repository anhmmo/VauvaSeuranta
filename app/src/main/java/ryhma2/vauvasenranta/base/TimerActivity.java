package ryhma2.vauvasenranta.base;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimerActivity {



    public String getCurrentTime(){
        Calendar kalenteri = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy  'kello' HH:mm:ss");
        String time = " " + format.format(kalenteri.getTime());
        return time;
    }
}
