package TH1;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add("pandA    " , "gấu");
        dictionary.print();
        dictionary.search("xxxx");
        dictionary.search("  PIG    ");

    }
}
