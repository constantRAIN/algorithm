package leetcode;

/**
 * @author : zxliuyu
 * @date : 2022-03-03 01:50
 */
public class ReverseWords557 {


	/**
	 * 557. 反转字符串中的单词 III
	 * 给定一个字符串 s ，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
	 * @param s
	 * @return
	 */
	public String reverseWords(String s) {
		String[] words = s.split(" ");
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			for (int j = words[i].length() - 1; j >= 0 ; j--) {
				stringBuilder.append(words[i].charAt(j));
			}
			stringBuilder.append(" ");
		}
		return stringBuilder.toString().trim();
	}

	public String reverseWords2(String s) {
		int length = s.length();
		int i = 0;
		StringBuilder stringBuilder = new StringBuilder();
		while (i <= length-1) {
			int start = i;
			while(i<length && s.charAt(i) != ' '){
				i++;
			}
			for (int p = i-1; p >= start; p--) {
				stringBuilder.append(s.charAt(p));
			}
			if (i<length && s.charAt(i++) == ' ') {
				stringBuilder.append(' ');
			}
		}
		return stringBuilder.toString();
	}
}
