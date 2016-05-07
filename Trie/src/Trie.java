import java.util.Map;
import java.util.Set;

/**
 * Created by Jerry on 07-05-2016.
 */
public class Trie {

    TrieNode root = new TrieNode(' ');


    public void insert(String word){
        char letters[] = word.toCharArray();
        TrieNode temp = root;

        for (int i = 0; i <letters.length ; i++) {
            Map<Character, TrieNode> letterMap = temp.getLetterMap();

            if(letterMap.containsKey(letters[i]))
                temp = letterMap.get(letters[i]);

            else {
                TrieNode newNode = new TrieNode(letters[i]);
                letterMap.put(letters[i],newNode);
                temp = newNode;
            }
        }

        temp.setIsWord(true);

    }

    public void findAutoCompleteList(String word){

        char[] chars = word.toCharArray();
        TrieNode temp = root;


        for (int i = 0; i <chars.length ; i++) {
            Map<Character, TrieNode> letterMap = temp.getLetterMap();
            if(letterMap.containsKey(chars[i]))
                temp = letterMap.get(chars[i]);
        }

        Map<Character, TrieNode> letterMap = temp.getLetterMap();
        Set<Character> characters = letterMap.keySet();
        for (Character character : characters) {
            System.out.println(" "+word+character);
        }


    }


}
