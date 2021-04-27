package exception;

public class InvalidOperandException extends Exception {
	private String operand;
	private String operation;
	
	public InvalidOperandException(String operand, String operation, String message) {
		super(message);
		this.operand = operand;
		this.operation = operation;
	}
	
	@Override
	public String getMessage() {
		String message = "Trying to use the operand " + this.operand 
				+ " but it was invalid for the operation " + this.operation + ".";
		return message + " ---> " + getMessage();
	}
	
	public String getOperand() {
		return this.operand;
	}
	
	public String getOperation() {
		return this.operation;
	}
}
