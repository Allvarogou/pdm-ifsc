package com.example.aula1;


import java.util.ArrayList;

public class MundoDAO{
     ArrayList<MundoM> arrayListMundoM;

public MundoDAO(){
    arrayListMundoM = new ArrayList<MundoM>();

    arrayListMundoM.add(new MundoM("Sol", R.drawable.sol));

    arrayListMundoM.add(new MundoM("Mercurio", R.drawable.mercurio));
    arrayListMundoM.add(new MundoM("Vênus", R.drawable.venus));
    arrayListMundoM.add(new MundoM( "Terra", R.drawable.terra ));
    arrayListMundoM.add(new MundoM( "Marte", R.drawable.marte ));
    arrayListMundoM.add(new MundoM( "Júpiter", R.drawable.jupiter ));
    arrayListMundoM.add(new MundoM( "Saturno", R.drawable.saturno ));
    arrayListMundoM.add(new MundoM( "Netuno", R.drawable.netuno ));
    arrayListMundoM.add(new MundoM( "Urano", R.drawable.urano ));

}

    public ArrayList<MundoM> getListMundoM() {
        return arrayListMundoM;
    }
}
