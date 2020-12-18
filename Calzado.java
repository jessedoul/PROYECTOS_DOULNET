package com.company;

public abstract class Calzado {
    private String marca;
    private double prec;
    private String col;
    private String estilo;
    private int cant;

    public String getMarca() { return marca; }

    public void setMarca(String marca) { this.marca = marca; }

    public double getPrec() { return prec; }

    public void setPrec(double prec) { this.prec = prec; }

    public String getCol() { return col; }

    public void setCol(String col) { this.col = col; }

    public String getEstilo() { return estilo; }

    public void setEstilo(String estilo) { this.estilo = estilo; }

    public int getCant() { return cant; }

    public void setCant(int cant) { this.cant = cant; }

    public abstract double resultado();

}
