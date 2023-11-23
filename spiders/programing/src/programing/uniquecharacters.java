package programing;

public class uniquecharacters {
	public static void main(String[] args) {
		String str = "bbbharuf";
		String n = "";

		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);

			if (n.indexOf(ch) == -1) {
				n = n + ch;
			}

		}
		System.out.println(n);

	}

}
