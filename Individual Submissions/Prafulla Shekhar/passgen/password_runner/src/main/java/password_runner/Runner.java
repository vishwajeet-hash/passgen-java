package password_runner;

import java.io.IOException;

import password_generator.Password_creater;

public class Runner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int n = 8;

		try {

			if (args[0].isEmpty()) {
				n = 8;
			} else {
				String str = args[0];
				String strlen = str.substring(1);
				n = Integer.parseInt(strlen);
			}

			if (n < 4)
				n /= 0;

			String password = Password_creater.getPassword(n);
			System.out.println("Password: " + password);

		} catch (ArithmeticException e) {

			System.out.println("** minimum password length supported is 4 **");
			help();

		} catch (ArrayIndexOutOfBoundsException e) {

			String password = Password_creater.getPassword(8);
			System.out.println("Password: " + password);

		} catch (Exception e) {

			help();

		}

	}

	public static void help() {

		System.out.println("--help--Input format should be as below");
		System.out.println();
		System.out.println("java -jar passgen.jar -l");
		System.out.println("(where l= length of password)");
		System.out.println();
	}

}
