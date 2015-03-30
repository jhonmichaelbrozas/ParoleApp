package paroleapp;

import java.io.*;
import java.util.*;

/**
 *
 * @author Amministratore
 */
public class ParoleApp {
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        HashMap map = new HashMap();
        
        Scanner scan = new Scanner(new File("./data/ipromessisposi.txt"));
        while (scan.hasNext()) {
            String parola = scan.next();

            if (map.containsKey(parola)) {
                Integer conta = (Integer) map.get(parola);
                map.put(parola, conta + 1);
            } else {
                map.put(parola, 1);
            }
        }
        ArrayList al = new ArrayList(map.keySet());
        Collections.sort(al);

        for (int i = 0; i < al.size(); i++) {
            String key = (String) al.get(i);
            Integer count = (Integer) map.get(key);
            System.out.println(key + " = " + count);
        }
    }
}
