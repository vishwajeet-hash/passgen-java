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
	public static void printpass(int n) throws IOException {

		// generates the random password
		String password = Password_creater.getPassword(n);
		System.out.println("Password: " + password);

		StringSelection stringSelection = new StringSelection(password);

		// copy to clipboard
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

		// copy to xclip
		Runtime runtime = Runtime.getRuntime();
		Process p = runtime.exec(new String[] { "sh", "-c", "echo" + password + " | xclip -selection clipboard" });

	}

	// function to print the help statements
	public static void help() {

		System.out.println("--help--Input format should be as below" + 
		                   "\njava -jar passgen.jar -l" +  
				           "\n" +
				           "\njava -jar passgen.jar -l" + "\n(where l= length of password)" + 
				           "\n");

	}

}
