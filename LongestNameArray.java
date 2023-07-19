
public class LongestNameArray {

	public static void main(String[] args) {
		String[] names = { "Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks" };

		String longestname = names[0];
		for (int i = 0; i < 5; i++) {
			if (names[i].length() >= longestname.length()) {
				longestname = names[i];
			}

		}
		System.out.println(longestname);
	}

}
