package ryhma2.vauvasenranta.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ryhma2.vauvasenranta.common.Adapter_TAUTI_VINKKI_tablelayout;
import ryhma2.vauvasenranta.R;


/**
 * <h1>Info class!</h1>
 * This class used to get user input information from dialog (use AlertDialog class) then save to MaitoDao (Sqlite databases).
 * Communicate with Adater_maito to get data and show the output on the screen.
 * Instance variable <b>tab_Layout</b> TabLayout provides a horizontal layout to display tabs.
 * Instance variable <b>view_Pager</b> show webpage in the screen. ViewPager is most often used in conjunction with Fragment, which is a convenient way to supply and manage the lifecycle of each page.
 * Instance variable <b>adapteri_laake_vinkkeja</b> create new instance of Adapter_TAUTI_VINKKI_tablelayout.



 * @author  Au Nguyen
 * @version 1.0
 * @since   10.12.2019
 */

public class InfoActivity extends AppCompatActivity {
    TabLayout tab_Layout;
    ViewPager view_Pager;
    Adapter_TAUTI_VINKKI_tablelayout adapteri_laake_vinkkeja;


    //calling data from adapter and print to screen
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        tab_Layout = findViewById(R.id.websivu);
        view_Pager = findViewById(R.id.list_vinkkeja);
        adapteri_laake_vinkkeja = new Adapter_TAUTI_VINKKI_tablelayout(getSupportFragmentManager());
        view_Pager.setAdapter(adapteri_laake_vinkkeja);
        tab_Layout.setupWithViewPager(view_Pager);
    }
}
