import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a Sentence :");
		String s = scr.nextLine();
		scr.close();

		if (s.length() < 26) {
			System.out.println(" Not a Panagram");
			return;
		} else {
			char c = 'a';
			for (int i = 0; i < 26; i++) {
				if (s.contains(c + ""))
					;
				else {
					System.out.println("Not a panagram");
					return;
				}
				c++;
			}
		}
		System.out.println("Panagram");
	}

}
