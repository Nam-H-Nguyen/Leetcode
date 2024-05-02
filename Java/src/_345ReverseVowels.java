public class _345ReverseVowels {
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j - 1) {
            if (isVowel(s.charAt(i)) && !isVowel(s.charAt(j))) {
                j--;
            }

            if (!isVowel(s.charAt(i)) && isVowel(s.charAt(j))) {
                i++;
            }

            if (isVowel(s.charAt(i)) && isVowel(s.charAt(j))) {
                chars[i] = s.charAt(j);
                chars[j] = s.charAt(i);
                i++;
                j--;
            }
        }

        return String.valueOf(chars);
    }

    public static boolean isVowel(char c) {
        return switch (c) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
            default -> false;
        };
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }
}
