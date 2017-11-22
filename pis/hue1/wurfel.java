package pis.hue1;

import java.io.*;
import java.lang.StringBuilder;
import java.util.Arrays;

/**
 * Created by Alex on 22.11.2017.
 */
public class wurfel {
    public static void main(String args[]) {
        System.out.print(Kodieren("Schwarzwald","Schwenningen","eintreffendersendungverspaetetneuerterminfolgt"));
    }
    private static String Zahlenlosung(String losung){
        int counter =0;
        int[] x= new int[losung.length()];
        for(char alphabet = 'A'; alphabet <= 'Z';alphabet++) {
            for(int i=0;i< losung.length();i++){
                if (alphabet == Character.toLowerCase(losung.charAt(i))){
                    x[i] = counter;
                    counter +=1;}
                if (alphabet == Character.toUpperCase(losung.charAt(i))){
                    x[i] = counter;
                    counter +=1;}
            }
        }
        return Arrays.toString(x);
    }

    private static String Kodieren(String losung1,String losung2, String text){
        String umstand1 = Zahlenlosung(losung1);
        String umstand2 = Zahlenlosung(losung2);
        String[] schluessel1 = umstand1.substring(1,umstand1.length()-1).split(", ");
        String[] schluessel2= umstand2.substring(1,umstand2.length()-1).split(", ");
        String[] kodiert1=new String [schluessel1.length];
        String[] kodiert2=new String [schluessel2.length];
        String einfachwurfel ="";
        String zweifachwurfel="";
        int x=0;
        int y=0;
        for(int i=0;i< text.length();i++ ){
            if (x==schluessel1.length){
                x=0;
                y=1;}
                if (y==1) {
                    kodiert1[Integer.parseInt(schluessel1[x])] += text.charAt(i);
                    x += 1;
                 }
                else{
                    kodiert1[Integer.parseInt(schluessel1[x])] ="";
                    kodiert1[Integer.parseInt(schluessel1[x])] += text.charAt(i);
                    x+=1;}
        }
        for(int k =0;k< kodiert1.length;k++){
            einfachwurfel+=kodiert1[k];
        }
        x=0;
        y=0;
        for(int i=0;i< einfachwurfel.length();i++ ){
            if (x==schluessel2.length){
                x=0;
                y=1;}
                if (y==1) {
                    kodiert2[Integer.parseInt(schluessel2[x])] += einfachwurfel.charAt(i);
                    x += 1;
                }
                else{
                    kodiert2[Integer.parseInt(schluessel2[x])] ="";
                    kodiert2[Integer.parseInt(schluessel2[x])] += einfachwurfel.charAt(i);
                    x+=1;}
        }
        for(int l=0;l<kodiert2.length;l++){
            zweifachwurfel+=kodiert2[l];
        }
        return zweifachwurfel;
    }
}
