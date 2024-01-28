package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {

	private Scanner sc;

	public Console() {
		sc = new Scanner(System.in);
	}

	public int nextInt() {

		int aux = sc.nextInt();

		return aux;

	}

	public long nextLong() {
		long aux = sc.nextLong();
		return aux;
	}

	public float nextFloat() {
		float aux = sc.nextFloat();
		return aux;
	}

	public double nextDouble() {

		double aux = sc.nextDouble();

		return aux;

	}

	public String nextLine() {

		return sc.nextLine();

	}

	public String next() {

		return sc.next();

	}

	public char nextChar() {

		return sc.next().charAt(0);

	}

	public String burn() {

		return sc.nextLine();

	}

	public void println(String str) {

		System.out.println(str);

	}

	public void print(String str) {

		System.out.print(str);

	}

}
