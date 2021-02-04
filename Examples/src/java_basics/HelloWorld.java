package java_basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Java hello world
 * @author ISIS1126
 */
public class HelloWorld {
	public HelloWorld() {}
	
	public boolean mayorPositivo(int x, int y) {
		return x >= 0 && x < y;
	}
	
	public static void main(String[] args) {
		//int i=0;
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		for(int i=0; i<arr.length; i++) {
			int element = arr[i];
			System.out.println(element);
		}
		
		for(int element : arr) {
			System.out.println(element);
		}
		
	}
}