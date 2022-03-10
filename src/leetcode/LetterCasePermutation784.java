package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zxliuyu
 * @date : 2022-03-10 01:32
 */
public class LetterCasePermutation784 {

	/**
	 * 784. 字母大小写全排列
	 * 给定一个字符串 s ，通过将字符串 s 中的每个字母转变大小写，我们可以获得一个新的字符串。
	 *
	 * 返回 所有可能得到的字符串集合 。以 任意顺序 返回输出。
	 * @param s
	 * @return
	 */
	public List<String> letterCasePermutation(String s) {
		List<StringBuilder> ans = new ArrayList();
		ans.add(new StringBuilder());

		for (char c: s.toCharArray()) {
			int n = ans.size();
			if (Character.isLetter(c)) {
				for (int i = 0; i < n; ++i) {
					ans.add(new StringBuilder(ans.get(i)));
					ans.get(i).append(Character.toLowerCase(c));
					ans.get(n+i).append(Character.toUpperCase(c));
				}
			} else {
				for (int i = 0; i < n; ++i)
					ans.get(i).append(c);
			}
		}

		List<String> finalans = new ArrayList();
		for (StringBuilder sb: ans)
			finalans.add(sb.toString());
		return finalans;
	}
	public static void main(String[] args) {
		LetterCasePermutation784 letterCasePermutation784 = new LetterCasePermutation784();
		List<String> stringList = letterCasePermutation784.letterCasePermutation("a1b2");
		System.out.println(stringList);
	}
}
