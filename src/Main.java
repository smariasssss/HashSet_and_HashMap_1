import java.util.HashMap;
import java.util.Map;

public class Main {

    public static final String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> freqs = new HashMap<>();

        for (int i = 0; i < TEXT.length(); i++) {
            char c = TEXT.charAt(i);
            if (!Character.isLetter(c)) {
                continue;
            }
            if (freqs.containsKey(c)) {
                freqs.put(c, freqs.get(c) + 1);
            } else {
                freqs.put(c, 1);
            }

        }

        int max = -1;
        char maxc = 0;
        for (char c : freqs.keySet()) {
            int freq = freqs.get(c);
            if (freq > max) {
                max = freq;
                maxc = c;
            }
        }
        System.out.println("Максимальная частота у символа " + maxc + ": " + max);

        int min = Integer.MAX_VALUE;
        char mina = 0;
        for (char a : freqs.keySet()) {
            int fr = freqs.get(a);
            if (fr < min) {
                min = fr;
                min = a;
            }
        }
        System.out.println("Минимальная частота у символа " + mina + ": " + min);
    }

}
