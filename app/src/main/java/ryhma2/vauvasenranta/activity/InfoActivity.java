package ryhma2.vauvasenranta.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ryhma2.vauvasenranta.common.Adapter_TAUTI_VINKKI_tablelayout;
import ryhma2.vauvasenranta.R;

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
