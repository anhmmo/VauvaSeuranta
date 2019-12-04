package ryhma2.vauvasenranta.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import ryhma2.vauvasenranta.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TautiJaLaakeFragment extends Fragment {
private WebView webView;

    public TautiJaLaakeFragment() {
        // Required empty public constructor
    }

//open webpage with layoutinfalter
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_laake_taudit, container, false);
        webView = v.findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://www.sairaslapsi.com/");

    return  v;
    }


}
