package ryhma2.vauvasenranta.base;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * <h1>TimerActivity class!</h1>
 * This class used to show current datetime.

 * @author  Au Nguyen
 * @version 1.0
 * @since   10.12.2019
 */



/**
 * get current time (get system time)
 */
public class TimerActivity {



    public String getCurrentTime(){
        Calendar kalenteri = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy  'kello' HH:mm:ss");
        String time = " " + format.format(kalenteri.getTime());
        return time;
    }
}
