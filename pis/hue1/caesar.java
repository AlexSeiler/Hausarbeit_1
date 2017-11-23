package pis.hue1;

/**
 * Created by Alex on 22.11.2017.
 */
public class caesar {

    private static String kodieren(String text,String schluessel){
        String kodiert="";
        char move;
        for(int i=0;i<text.length();i++){
            move = text.charAt(i);
            kodiert += (move+=schluessel.length());
        }
        return kodiert;
    }

    private static String dekodieren(String text,String schluessel){
        String dekodiert="";
        char move;
        for(int i=0;i<text.length();i++){
            move=text.charAt(i);
            dekodiert += (move-=schluessel.length());
        }
        return dekodiert;
    }
}
