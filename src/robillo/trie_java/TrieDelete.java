package robillo.trie_java;

public class TrieDelete {

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

        if(search("thaw")) System.out.println("thaw --- " + output[1]);
        else System.out.println("thaw --- " + output[0]);

        if(search("thei")) System.out.println("their --- " + output[1]);
        else System.out.println("thei --- " + output[0]);


        //TESTING DELETE IN A TRIE

        String deleteKey = "their";
        System.out.println();

        if(search("their")) System.out.println("their --- " + output[1]);
        else System.out.println("their --- " + output[0]);

        System.out.println("Node to be deleted: " + deleteKey);

        deleteHelper(root, deleteKey, 0, deleteKey.length());

        if(search("their")) System.out.println("their --- " + output[1]);
        else System.out.println("their --- " + output[0]);
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

    private static boolean deleteHelper(TrieNode pNode, String key, int level, int len) {
        if(pNode != null) {
            //base case
            if(level == len) {
                if(pNode.isEndOfWord)   //un-mark end of word flag
                    pNode.isEndOfWord = false;

                return isItFreeNode(pNode);
            }
            else {  //recursive case
                int index = key.charAt(level) - 'a';
                if(deleteHelper(pNode.children[index], key, level+1, len)) {
                    pNode.children[index] = null;

                    // recursively climb up, and delete eligible nodes
                    return (pNode.isEndOfWord && isItFreeNode(pNode));
                }
            }
        }
        return false;
    }

    private static boolean isItFreeNode(TrieNode pNode) {
        int i;
        for(i = 0; i < ALPHABET_SIZE; i++) {
            if(pNode.children[i] != null)
                return false;
        }
        return true;
    }
}
