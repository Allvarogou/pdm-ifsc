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
import androidx.versionedparcelable.NonParcelField;

import java.util.List;

public class AdapterNotas extends ArrayAdapter<Nota> {
    Context mcontext;
    public AdapterNotas(@NonNull Context context, int resource, @NonNull List<Nota> objects){
        super(context, resource, objects);
        mcontext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View view = convertView;
        LayoutInflater inflater = LayoutInflater.from(mcontext);
        view = inflater.inflate(R.layout.item_nota, parent, false); // transforma esse XML em um componente visual que o Android consegue usar:

        Nota nota = getItem(position);

        TextView tvid = view.findViewById(R.id.tvid);
        TextView tvtexto = view.findViewById(R.id.tvtxt);

        tvid.setText(Integer.toString(nota.id));
        tvtexto.setText(nota.texto);

        return view;

    }


}
