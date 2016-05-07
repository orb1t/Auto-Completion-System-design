import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jerry on 07-05-2016.
 */
public class TrieNode {

    private  char letter;
    private  Map<Character,TrieNode>letterMap = new HashMap<Character, TrieNode>();
    private boolean isWord;

    public TrieNode(char letter) {
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }


    public Map<Character, TrieNode> getLetterMap() {
        return letterMap;
    }

    public void setLetterMap(Map<Character, TrieNode> letterMap) {
        this.letterMap = letterMap;
    }

    public boolean isWord() {
        return isWord;
    }

    public void setIsWord(boolean isWord) {
        this.isWord = isWord;
    }

}
