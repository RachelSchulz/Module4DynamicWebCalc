package model;

public class Calculator {
	
	private double num1;
	private double num2;
	private double result;
	
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}

	
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public double addTwoNumbers(double num1, double num2) {
		
		return num1 + num2;
	}
	
	public double multiplyTwoNumbers(double num1, double num2) {
		
		return num1 * num2;
		
	}
	
}
