package java_basics;

/**
 * Basic loop structures available in Java 
 * @author ISIS1226
 */
public class LoopStructures {

	//While loops
	public static void whileLoops() {
		int i=0;
		while(i<3){
			System.out.println(i);
			i++;
		}
	}
	
	//For loops
	public static void forLoops() {
		for(int i=0; i<3; i++) 
			System.out.println(i);
	}
	
	//Do while loops
	public static void doWhileLoops() {
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while(i < 3);			
	}

	/*
	 * Foreach loops
	 * Usually used to iterate over collections (e.g., arrays, lists, maps)
	 */
	public static void foreachLoops() {
		int[] array = {0,1,2};
		for(int element : array) 
			System.out.println(element);
	}
	
	public static void main(String[] args) {
		LoopStructures.whileLoops();
		LoopStructures.forLoops();
		LoopStructures.foreachLoops();
	}
}
