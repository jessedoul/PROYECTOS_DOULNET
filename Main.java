package com.company;
import java.util.Arraylist;
public class Main {
    public static void main(String[] args) {
        // write your code here
        ArrayList<marca> ind1 = new ArrayList<>();
        ArrayList<numero> cal1 = new ArrayList<>();
        ArrayList<color> acc1 = new ArrayList<>();

        Calzado a = new Jovenes("puma",432, "blanco", "deportivo", 8);
        Calzado b = new Adultos("champion", 1512, "rojo", "formales", 5);
        Calzado c = new Niños("nike",2321,"amarillo", "semi formales", 32);



        System.out.println(a.resultado());
        System.out.println(b.resultado());
        System.out.println(c.resultado());

    }
}

