import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        System.out.println("HashMap Example");

        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-val pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Grapes");
        map.put(4, "Guava");
        map.put(5, "Pineapple");

        System.out.println("HashMap : " + map);

        // Getting value for a key
        System.out.println(map.get(3));

        // Check key exists
        System.out.println("key 10 exists : " + map.containsKey(10));
        System.out.println("key 1 exists : " + map.containsKey(1));

        // Check val exists
        System.out.println("Val papaya exists : " + map.containsValue("Papaya"));
        System.out.println("Val Apple exists : " + map.containsValue("Apple"));

//        map.remove(1);
//        System.out.println("Val Apple exists : " + map.containsValue("Apple"));

        for (Integer key: map.keySet()) {       // map.keyset() it will give you an array of keys
            System.out.println("key : " + key + " value : " + map.get(key));
        }

        for (var entry : map.entrySet()) {
            System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
        }

        System.out.println(map.size());

        map.clear();
        System.out.println(map.size());

        // O(1)
    }

    // Question: Find the frequency of numbers in the array
    // [1,2,3,4,3,2,3,4,5,6,7,8,6,5,3,2,4,5,7,8,7,6,4,3,3]
    // 1 : 1
    // 2 : 2
    // 3 : 2
    // 4 : 1
}