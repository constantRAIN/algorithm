package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LengthOfLongestSubstring3 {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        if (s == null || s.equals("")) {
            return max;
        }
        LinkedList<Character> result = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            while (result.contains(s.charAt(i))) {
                result.removeFirst();
            }
            result.addLast(s.charAt(i));
            max = Math.max(max, result.size());
        }
        return max;
    }

    public int lengthOfLongestSubstring2(String s) {
        int max = 0;
        if (s == null || s.equals("")) {
            return max;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
