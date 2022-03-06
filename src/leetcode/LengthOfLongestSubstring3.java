package leetcode;

import java.util.ArrayList;
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
        if (s.length() == 0) {
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


    public int lengthOfLongestSubstring3(String s) {
        LinkedList<Character> list = new LinkedList<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            while (list.contains(s.charAt(i))){
                list.removeFirst();
            }
            list.addLast(s.charAt(i));
            max = Math.max(list.size(), max);
        }
        return max;

    }

    public int lengthOfLongestSubstring4(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int max = 0;
        // key 代表每一个字符，value 代表当前字符的位置
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(map.get(s.charAt(i)) + 1, left);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
