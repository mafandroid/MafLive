package com.maf.maflive;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by KF00001 on 2016/8/15.
 */
public class TwoFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_two, container, false);
        WebView webView = (WebView) view.findViewById(R.id.wv);
        webView.loadUrl("http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2014/0925/1713.html");
        return view;
    }
}
