package leetcode;

/**
 * @author : zxliuyu
 * @date : 2022-03-06 17:45
 */
public class CheckInclusion567 {

	/**
	 *
	 * 567. 字符串的排列
	 * 给你两个字符串 s1 和 s2 ，写一个函数来判断 s2 是否包含 s1 的排列。如果是，返回 true ；否则，返回 false 。
	 *
	 * 换句话说，s1 的排列之一是 s2 的 子串 。
	 *
	 * 来源：力扣（LeetCode）
	 * 链接：https://leetcode-cn.com/problems/permutation-in-string
	 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。s
	 * @param s1
	 * @param s2
	 * @return
	 */
	public boolean checkInclusion(String s1, String s2) {
		char[] s1Array = s1.toCharArray();
		char[] s2Array = s2.toCharArray();
		int s1Length = s1Array.length;
		int s2Length = s2Array.length;

		// 记录每一个字符出现的次数
		int[] count = new int[26];
		for (int i = 0; i < s1Length; i++) {
			count[s1Array[i] - 'a']++;
		}
		// 定义滑动指针的索引
		int left = 0, right =0;
		while (left <= s2Length - s1Length) {
			while (right < left + s1Length && count[s2Array[right] - 'a'] >= 1) {
				count[s2Array[right] - 'a']--;
				right++;
			}
			if (right == left + s1Length) {
				return true;
			}
			count[s2Array[left] - 'a']++;
			left++;
		}
		return false;
	}
}
