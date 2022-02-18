package javaPackage;

public class AbstractClass extends CalculatorAbstract{
	
	public void add()
	{
		System.out.println("Add Abstract");
	}
	public void substract()
	{
		System.out.println("Substract Abstract");
	}
	public void multiple()
	{
		System.out.println("Multiple Abstract");
	}
	public void division()
	{
		System.out.println("Division Abstract");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AbstractClass obj=new AbstractClass();
obj.add();
obj.substract();
obj.multiple();
obj.division();

}

}

abstract class CalculatorAbstract
{

	abstract void add();
	abstract void substract();
	abstract void multiple();
	abstract void division();
	}
	