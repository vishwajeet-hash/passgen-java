package password_runner;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;

import password_generator.Password_creater;

public class Runner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// n is the length of the password
		int n = 8;

		try {

			if (!args[0].isEmpty()) {

				String str = args[0];
				String strlen = str.substring(1);
				n = Integer.parseInt(strlen);

				/*
				 * Accepting password length greater than 4 and less than 300 n /= 0 will throw
				 * ArithmeticException and it will call help
				 */

				if (n < 4) {
					System.out.println("** it's unsecure to use password less than 4 digits **");
					n /= 0;
				} else if (n > 300) {
					System.out.println("** to large password **");
					n /= 0;
				}
			}

			printpass(n);

		} catch (ArrayIndexOutOfBoundsException e) {
			printpass(8);

		} catch (Exception e) {
			help();
		}

	}

	// function to print password and get it copied in clipboard
	public static void printpass(int n) {

		// generates the random password
		String password = Password_creater.getPassword(n);

		StringSelection stringSelection = new StringSelection(password);

		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

		System.out.println("Password: " + password);

	}

	// function to print the help statements
	public static void help() {

		System.out.println("--help--Input format should be as below");
		System.out.println();
		System.out.println("java -jar passgen.jar -l");
		System.out.println("(where l= length of password)");
		System.out.println();

	}

}
