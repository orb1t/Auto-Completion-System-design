/**
 * Created by Jerry on 07-05-2016.
 */
public class Main {


    public static void main(String[] args) {

        Trie trie = new Trie();
        trie.insert("ab");
        trie.insert("abc");
        trie.insert("abd");
        trie.insert("abb");

        trie.findAutoCompleteList("ab");
    }

}
