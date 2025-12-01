package com.example.aula1;

import java.io.Serializable;

public class Nota implements Serializable { // Serializable permite classe pode ser convertida em bytes e transmitida/armazenada

    int id;
    String texto;


        public Nota(int id, String texto){
            this.id = id;
            this.texto = texto;

        }
}
