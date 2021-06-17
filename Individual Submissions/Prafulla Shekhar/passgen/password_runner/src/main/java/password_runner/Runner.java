package password_runner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import password_generator.Password_creater;

public class Runner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input the length of password ");
		int n = Integer.parseInt(sc.readLine());
		sc.close();

		String password = Password_creater.getPassword(n);
		System.out.println("Password: " + password);

	}

}
