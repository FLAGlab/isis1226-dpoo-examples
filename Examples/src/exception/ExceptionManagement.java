package exception;

public class ExceptionManagement {
	private boolean error;
	
	public float divide(int a, int b) {
	    if(b ==0)
	        return -1;
	    else
	        return a/b;
	}
	
	public float  divideRegistry(int a, int b) {
	    if(b ==0) {
	        error = true;
	        return -1;
	    } else {
	        error = false;
	        return a/b;
	    }
	}
	
	public float divideEx(int a, int b) throws Exception {
	    if(b ==0) 
	        throw new Exception("You cannot divide by 0");
	    else 
	        return a/b;
	}

	public float doubleDivision(int a, int b) throws Exception {
	    return divideEx(a,b) / divideEx(b,a);
	}
	
	public void callerMethod(int a, int b) {
		try {
			float result = divideEx(a,b);
			System.out.println("The result is: " + result);
		} catch(Exception e) {
			System.out.println("There was an error");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		ExceptionManagement em = new ExceptionManagement();
		em.callerMethod(5,2);
		em.callerMethod(8,0);
	}
}
