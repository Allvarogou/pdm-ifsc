package com.example.aula1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.aula1.MundoController;
import com.example.aula1.MundoM;

import java.util.List;

public class MundoAdapter extends ArrayAdapter<MundoM> {
    int mResource;
    public MundoAdapter(@NonNull Context context, int resource, @NonNull List<MundoM> objects) {
        super(context, resource, objects);
        mResource = resource;
    }

    @NonNull

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View v = inflater.inflate(mResource, parent, false);
        MundoM mundoM = getItem(position);
        TextView tv = v.findViewById(R.id.textView);
        ImageView iv = v.findViewById(R.id.imageView);
        tv.setText(mundoM.nome);
        iv.setImageResource(mundoM.img);
        return v;
    }
}
