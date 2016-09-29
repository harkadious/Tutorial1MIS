package com.android.juan.tutorial;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    private View view;
    private EditText etNama;
    private Button btnKatakan;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_login, container, false);

        bind();
        clickListener();

        return view;
    }

    private void bind() {
        etNama = (EditText) view.findViewById(R.id.etNama);
        btnKatakan = (Button) view.findViewById(R.id.btnKatakanHalo);
    }

    private void clickListener() {
        btnKatakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HaloSayFragment haloSayFragment = new HaloSayFragment();
                getFragmentManager().beginTransaction().replace(R.id.activity_login,haloSayFragment).addToBackStack(null).commit();
            }
        });
    }



}
