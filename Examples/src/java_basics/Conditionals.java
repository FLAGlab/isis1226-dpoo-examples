package java_basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Basic conditional structures in Java
 * @author ISIS1126
 */
public class Conditionals {

	//Simple if-else
	public static void ifElse() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter a number:");
			int x = Integer.parseInt(br.readLine());
			if(x% 2 == 0) {
				System.out.println(x + " is even");
			} else {
				System.out.println(x + " is odd");
			}
		} catch(IOException e) {
			System.out.println(e);
		}
	}

	//composed if-else
	public static void nestedIfs() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter an option:");
			int x = Integer.parseInt(br.readLine());
			if(x == 1) {
				System.out.println("Option ONE chosen");
			} else if(x == 2) {
				System.out.println("Option TWO chosen");
			} else if(x == 3) {
				System.out.println("Option THREE chosen");
			} else {
				System.out.println("Option not recognized");
			}
		} catch(IOException e) {
			System.out.println(e);
		}
	}

	//switch statement
	public static void switchStatement() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter an option:");
			int x = Integer.parseInt(br.readLine());
			switch(x) {
			case 1:
				System.out.println("Option ONE chosen");
				break;
			case 2:
				System.out.println("Option TWO chosen");
				break;
			case 3:
				System.out.println("Option THREE chosen");
				break;
			default:
				System.out.println("Option not recognized");
			}
		} catch(IOException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Conditionals.ifElse();
		Conditionals.nestedIfs();
		Conditionals.switchStatement();
	}
}
