package com.example.aula1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AdapterNotas extends ArrayAdapter<Nota> {
    Context mcontext;

    public AdapterNotas(Context context, int resource, List<Nota> objects){
        super (context, resource, objects);
        mcontext = context;
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = covertView;
        LayoutInflater inflater = LayoutInflater.from(mcontext);
        view = inflater.inflate(R.layout.item_nota, parent, false);
        Nota nota = getItem(position);

        TextView tvid = view.findViewById(R.id.tvid);
        TextView tvtexto = view.findViewById(R.id.tvtexto);
        tvid.setText(Integer.toString(nota.id));         // Exibe ID
        tvtexto.setText(nota.texto);                     // Exibe texto da nota

        return view;
    }
}
