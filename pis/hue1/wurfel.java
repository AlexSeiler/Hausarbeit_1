package pis.hue1;

/**
 * Created by Alex on 22.11.2017.
 */
public class wurfel {
    /**
     * Methode "Zahlenlosung"
     *
     * fülle ein array mit dem Schlüsselwort, durchlaufe es für jeden buchstaben im Alphabet, bei einem match setze
     * den jetzigen counter an der stelle und erhöhe ihn um 1 BSP:
     * int counter =0;
     * Wald -> ary[] = [W][a][l][d]
     * for (i=0;i< alphabet.length,i++)
     *      for (j=0;j< ary.length,j++)
     *          if alphabet[i] == ary[j] (W = W )
     *              ary[j] = counter (=0)
     *              counter+=1
     *
     *Methode "Kodieren"
     *
     * eine schleife mit dem array ary wird durchlaufen solange es noch buchstaben eines zu kodierenden textes gibt
     * ary sollte nun [3][0][2][1] so aussehen
     *
     * for (int i =0; i< textzukodieren.length;i++)
     *      if ary position = ary.length
     *          ary position = 0
     *      buchstabe aus text = ary[position]add buchstabe
     *      ary+=1
     * ary[0].inhalt +ary[1] +ary[2] +ary[3] = kodierter text
     *
     */
}
