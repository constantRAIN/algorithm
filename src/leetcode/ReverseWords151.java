package leetcode;

/**
 * @author : zxliuyu
 * @date : 2022-03-01 00:58
 */
public class ReverseWords151 {

	/**
	 *
	 * 151. 翻转字符串里的单词
	 *
	 * 给你一个字符串 s ，逐个翻转字符串中的所有 单词 。
	 *
	 * 单词 是由非空格字符组成的字符串。s 中使用至少一个空格将字符串中的 单词 分隔开。
	 *
	 * 请你返回一个翻转 s 中单词顺序并用单个空格相连的字符串。
	 *
	 * 说明：
	 *
	 * 输入字符串 s 可以在前面、后面或者单词间包含多余的空格。
	 * 翻转后单词间应当仅用一个空格分隔。
	 * 翻转后的字符串中不应包含额外的空格。
	 *
	 * 来源：力扣（LeetCode）
	 * 链接：https://leetcode-cn.com/problems/reverse-words-in-a-string
	 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	 * @param s
	 * @return
	 */
	public String reverseWords(String s) {
		String[] words = s.split(" ");
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			if (words[i] != " " && words[i] != "") {
				stringBuilder.append(words[i]).append(" ");
			}
		}
		return stringBuilder.toString().trim();
	}
}
