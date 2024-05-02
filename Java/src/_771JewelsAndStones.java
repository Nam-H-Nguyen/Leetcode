import java.util.HashMap;

public class _771JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        int sum = 0; // keep track of running count
        HashMap<Character, Integer> map = new HashMap<>(); // keep track of unique Jewels In Stones

        for (int i = 0; i < jewels.length(); i++) {
            // assuming jewels are unique
            map.put(jewels.charAt(i), 0);
        }

        for (int i = 0; i < stones.length(); i++) {
            if (map.containsKey(stones.charAt(i))) {
                sum += map.get(stones.charAt(i));
            }
        }

        for (Integer value : map.values()) {
            sum += value;
        }

        return sum;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones)); // output: 3
    }
}
