package numberPackage;

import counterPackage.counterClass;

public class numberClass {
	
	private int firstnum;
	private int secondnum;
	private int operation;
	
	public numberClass(int firstnum, int secondnum, int operation) {
		this.firstnum = firstnum;
		this.secondnum = secondnum;
		this.operation = operation;
	}
	
	public int getFirstnum() {
		return firstnum;
	}
	public void setFirstnum(int firstnum) {
		this.firstnum = firstnum;
	}
	public int getSecondnum() {
		return secondnum;
	}
	public void setSecondnum(int secondnum) {
		this.secondnum = secondnum;
	}
	public int getOperation() {
		return operation;
	}
	public void setOperation(int operation) {
		this.operation = operation;
	}

	@Override
	public String toString() {
		counterClass countTotal = new counterClass();
		return "\n" + firstnum + " " + countTotal.convert(operation) + " " + secondnum + " = " + countTotal.count(firstnum, secondnum, operation);
	}
	
	

}
