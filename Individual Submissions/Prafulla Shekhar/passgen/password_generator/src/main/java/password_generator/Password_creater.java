package password_generator;

import java.util.Random;

public class Password_creater {

	// function to generate password using characters from char_box
	private static char[] generator(int password_length) {

		String char_box = "!@#$%^&*?_+1234567890-abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

		Random random = new Random();

		char[] pass = new char[password_length];

		for (int i = 0; i < password_length; i++) {
			pass[i] = char_box.charAt(random.nextInt(74));
		}

		return pass;
	}

	// function to return password as string
	public static String getPassword(int password_length) {
		String s = new String(generator(password_length));
		return s;

	}

}
