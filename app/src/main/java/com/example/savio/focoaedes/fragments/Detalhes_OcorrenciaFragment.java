package com.example.savio.focoaedes.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.savio.focoaedes.R;

public class Detalhes_OcorrenciaFragment extends Fragment {

    View view;

    ImageView detalhe_imagem;
    TextView detalhe_titulo;

    public Detalhes_OcorrenciaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_detalhes_ocorrencia, container, false);

        detalhe_imagem = (ImageView) view.findViewById(R.id.detalhe_imagem);
        detalhe_titulo = (TextView) view.findViewById(R.id.detalhe_titulo);

        return view;
    }

}
