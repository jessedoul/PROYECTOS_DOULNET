package com.company;
import java.oi.FileWriter;
import java.io.FileReader;
import java.io.*;
import java.io.IOEXception;
import java.util.Arraylist;
import java.oi.file;


public class Talla {
public static void writeFileApppend(String calzar, String nombre){

    try{
        FileWriter FW = new FileWriter(nombre, append:true);
        FW.append(Texto);
        FW.flush();
        FW.close();{
            catch (IOException reporte){
                reporte.printStackTrace();
            }
        }
        public static  void writeFileTruncate (String nombre, String Calzar){
            try{
                FileWriter FW = new FileWriter(nombre, append:false);
                FW.append(Texto);
                FW.flush();
                FW.close();{
            catch (IOException reporte){
                        reporte.printStackTrace();
            }
        }
public static  ArrayList<¨String> ReadFile(String file){
                    Arraylist<String> lines = new ArrayList<>();
                    String line;
                    try {
                        file f1 = new File(file);
                        fileReader fr = new BufferedReader(fr);
                        while ((line = br.readLine())) != null){
    lines.add(line);
                        }
                        fr.close();
br.close();
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    return; lines;
                }
public static Boolean Existe (String file){
                    try{
                        File f1 = new File(file);
                        FileReader fr = new FileReader(f1);
                        BufferedReader br = new BufferedReader(fr);
                        fr.close();
                        br.close();
                        return true;
                    } catch (Exception e){
                        return false;
                    }
                }
    }
}



}
