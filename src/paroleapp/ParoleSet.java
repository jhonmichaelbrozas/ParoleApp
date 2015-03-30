package paroleapp;

import java.io.*;
import java.util.*;
/**
 *
 * @author Amministratore
 */
public class ParoleSet implements Set<String>{
    private Set<String> set;
    private int totParole;

    public ParoleSet() {
        this.set = new HashSet();
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return set.contains(o);
    }

    @Override
    public boolean add(String e) {
        return set.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return set.remove(o);
    }

    @Override
    public boolean containsAll(Collection clctn) {
        return set.containsAll(clctn);
    }

    @Override
    public boolean addAll(Collection clctn) {
        return set.addAll(clctn);
    }

    @Override
    public boolean retainAll(Collection clctn) {
        return set.retainAll(clctn);
    }

    @Override
    public boolean removeAll(Collection clctn) {
        return set.removeAll(clctn);
    }

    @Override
    public Object[] toArray() {
        return set.toArray();
    }

    @Override
    public Object[] toArray(Object[] ts) {
        return set.toArray(ts);
    }
    
    @Override
    public Iterator iterator() {
        return set.iterator();
    }

    @Override
    public String toString() {
        return set.toString();
    }

    public int getTotaleParole() {
        return totParole;
    }

    @Override
    public void clear() {
        set.clear();
    }
    
    public void leggiFile(String filename) throws IOException {

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String s;
            String[] book;
            while ((s = br.readLine()) != null) {
                book = s.toLowerCase().replace(".", " ").replace(",", " ").replace("'", " ").replace("!", " ").replace("?", " ").replace(";", " ").replace("-", " ").replace(":", " ").replace("(", " ").replace(")", " ").replace("[", " ").replace("]", " ").replace("  ", " ").replace("<", " ").replace(">", " ").split(" ");
                for (String word : book) {
                    set.add(word);
                    totParole++;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("ERRORE: File non trovato!");
        } 
    }
}
