import java.util.HashMap;
import java.util.Map;

public class TrieExample {
    class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isEndOfWord;

        TrieNode() {
            isEndOfWord = false;
        }
    }

    class Trie {
        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            TrieNode currentNode = root;
            for (char ch : word.toCharArray()) {
                currentNode.children.putIfAbsent(ch, new TrieNode());
                currentNode = currentNode.children.get(ch);
            }
            currentNode.isEndOfWord = true;
        }

        public boolean search(String word) {
            TrieNode currentNode = root;
            for (char ch : word.toCharArray()) {
                if (currentNode.children.containsKey(ch)) {
                    currentNode = currentNode.children.get(ch);
                } else {
                    return false;
                }
            }
            return currentNode.isEndOfWord;
        }

        public boolean startsWith(String prefix) {
            TrieNode currentNode = root;
            for (char ch : prefix.toCharArray()) {
                if (currentNode.children.containsKey(ch)) {
                    currentNode = currentNode.children.get(ch);
                } else {
                    return false;
                }
            }
            return true;
        }
    }

    public void main(String[] args) {
        System.out.println("This is a Trie");

        Trie trie = new Trie();
        trie.insert("cat");
        trie.insert("car");
        trie.insert("bat");

        System.out.println(trie.search("cat"));
        System.out.println(trie.search("bat"));
        System.out.println(trie.search("rat"));

        System.out.println(trie.startsWith("ra"));
        System.out.println(trie.startsWith("ca"));
        System.out.println(trie.startsWith("ba"));

    }
}
