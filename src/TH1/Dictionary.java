package TH1;

import java.util.*;

public class Dictionary {
    private TreeMap<String, String> dictionary = new TreeMap<>();

    public Dictionary(TreeMap<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    public Dictionary() {
        dictionary.put("cat", "mèo");
        dictionary.put("dog", "chó");
        dictionary.put("rat", "chuột");
        dictionary.put("chicken", "gà");
        dictionary.put("cockroaches", "gián");
        dictionary.put("worm", "giun");
        dictionary.put("duck", "vịt");
        dictionary.put("goose", "ngỗng");
        dictionary.put("pig", "heo");
        dictionary.put("Turkey", "gà tây");

    }

    public TreeMap<String, String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(TreeMap<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    public void add(String eng, String vie) {
        this.dictionary.put(handleInputEng(eng), vie);
    }

    public void search(String eng) {

        if (this.dictionary.containsKey(handleInputEng(eng))) {
            System.out.println(eng + " : " + dictionary.get(handleInputEng(eng)));
        } else {
            System.out.println("can't find " + eng);
        }

    }

    public void print() {
        System.out.println(this.dictionary);
    }
    public String handleInputEng(String eng) {
        return eng.toLowerCase().trim();
    }

}
