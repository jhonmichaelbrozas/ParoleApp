package paroleapp;

import java.io.IOException;
/**
 *
 * @author Amministratore
 */
public class ParoleApp {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        ParoleSet ps = new ParoleSet();

        ps.leggiFile("./data/ipromessisposi.txt");

        System.out.println("Totale parole: " + ps.getTotaleParole());

    }
}
