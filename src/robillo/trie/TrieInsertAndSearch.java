package robillo.trie;

public class TrieInsertAndSearch {

    public static void main(String[] args) {

        // Input keys (use only 'a' through 'z' and lower case)
        String keys[] = {"the", "a", "there", "answer", "any",
                "by", "bye", "their"};

        String output[] = {"Not present in trie", "Present in trie"};


        root = new TrieNode();

        // Construct trie
        int i;
        for (i = 0; i < keys.length ; i++)
            insert(keys[i]);

        // Search for different keys
        if(search("the")) System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);

        if(search("these")) System.out.println("these --- " + output[1]);
        else System.out.println("these --- " + output[0]);

        if(search("their")) System.out.println("their --- " + output[1]);
        else System.out.println("their --- " + output[0]);

        if(search("thaw")) System.out.println("thaw --- " + output[1]);
        else System.out.println("thaw --- " + output[0]);

        if(search("thei")) System.out.println("their --- " + output[1]);
        else System.out.println("thei --- " + output[0]);
    }

    static final int ALPHABET_SIZE = 26;

    static class TrieNode {

        TrieNode[] children = new TrieNode[ALPHABET_SIZE];
        boolean isEndOfWord;

        TrieNode() {
            isEndOfWord = false;
            for(int i=0; i<ALPHABET_SIZE; i++)
                children[i] = null;
        }
    }

    private static TrieNode root;

    private static void insert(String word) {
        TrieNode pCrawl = root;

        for (int level = 0; level < word.length(); level++) {

            int index = word.charAt(level) - 'a';

            if (pCrawl.children[index] == null)
                pCrawl.children[index] = new TrieNode();

            pCrawl = pCrawl.children[index];
        }

        // mark last node as leaf
        pCrawl.isEndOfWord = true;
    }

    private static boolean search(String word) {
        TrieNode pCrawl = root;

        for (int level = 0; level < word.length(); level++) {
            int index = word.charAt(level) - 'a';

            if (pCrawl.children[index] == null)
                return false;

            pCrawl = pCrawl.children[index];
        }

        return (pCrawl != null && pCrawl.isEndOfWord);
    }
}
