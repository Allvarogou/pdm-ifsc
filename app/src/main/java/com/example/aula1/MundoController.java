package com.example.aula1;

import java.util.ArrayList;

public class MundoController {

    MundoDAO mundoDAO;

    public MundoController(){
    mundoDAO = new MundoDAO();
    }

    public ArrayList<MundoM> getMundoM(){
        return mundoDAO.getListMundoM();
    }

    public ArrayList<String> getNome() {
        ArrayList<String> nomes = new ArrayList<>();

        for (MundoM m: mundoDAO.getListMundoM()){
            nomes.add(m.nome);
        }
        return nomes;
    }}


