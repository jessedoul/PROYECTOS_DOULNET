package com.company;

public class Niños extends Calzado{
    public Niños (String marca, double prec, String col, String estilo, int cant){
        setMarca(marca);
        setPrec(prec);
        setCol(col);
        setEstilo(estilo);
        setCant(cant);
    }


    @Override
    public double resultado() { return getPrec() * getCant(); }
}



