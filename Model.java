package application;

public class Model {
	public int calculator(String op,int x, int y) {
		int result = 0;
		switch(op) {
			case "+":
				result = x+y;
				break;
			case "-":
				result = x-y;
				break;
			case "×":
				result = x*y;
				break;
			case "÷":
				result = x/y;
				break;
		}
		return result;
	}
}
