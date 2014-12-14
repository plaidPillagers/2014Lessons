
public class main {

	public static void main(String[] args) {
		double result = calculator(5, 6, "+");
		System.out.println(result);
		result = result + 1;
		System.out.println(result);
		System.out.println(calculator(2.4, 5.5, "j"));
		
		
		voidcalculator(5, 6, "+");

	}
	
	static double calculator(double first, double second, String operation) {
		if(operation == "+"){
			return first + second;
		}
		else if(operation == "-"){
			return first - second;
		}
		else if(operation == "/"){
			return first / second;
		}
		else if(operation == "*"){
			return first * second;
		}
		else{
			System.out.println("Unsupported operation.");
			return 0;
		}
	}
	
	static void voidcalculator (double first, double second, String operation) {
		if(operation == "+"){
			System.out.println(first + second);
		}
		else if(operation == "-"){
			System.out.println(first - second);
		}
		else if(operation == "/"){
			System.out.println(first / second);
		}
		else if(operation == "*"){
			System.out.println(first * second);
		}
		else{
			System.out.println("Unsupported operation.");
			
		}
	}

}
