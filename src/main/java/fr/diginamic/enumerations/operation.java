package fr.diginamic.enumerations;

public class operation {
//
	private int num1;
	private int num2;
	//
	public operation(){
		this.num1 = 0;
		this.num2 = 0;
	}
	public operation(int nb1, int nb2){
		this.num1 = nb1;
		this.num2 = nb2;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int addition(int a,int b) {
		return a+b;
	}
	public int soustraction(int a,int b) {
		return a-b;
	}
	public int multiplication(int a,int b) {
		return a*b;
	}
	public int division(int a,int b) {
		return a/b;
	}
	@Override
	public String toString() {
		return "operation [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
}
