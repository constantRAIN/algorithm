package niuke.stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MaxInWindows {

    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> list = new ArrayList<>();
        if (num == null || num.length == 0 || size > num.length || size == 0) {
            return list;
        }
        int slowIndex = 0, fastIndex = size - 1;
        for (; fastIndex < num.length; fastIndex++, slowIndex++) {
            int max = num[slowIndex];
            for (int i = slowIndex; i <= fastIndex; i++) {
                max = Math.max(max, num[i]);
            }
            list.add(max);
        }
        return list;
    }
}
