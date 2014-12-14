
public class Lesson2 {

	public static void main(String[] args) {
		// dates
		int month = 2;
		int day = 0;
		int year = 55998;
		System.out.println(  year + " / " + month + " / " + day);
		
		// if statements
		if (year > 4141 || month == day) {
			System.out.println("WOW THATS A LOT OF YEARS SON");
		}
		else{
			
		}
		
		if (year == 4141) {
			System.out.println("SECOND IF!");
		}
		else if (year > 1414) {
			System.out.println("ELSE IF");
		}
		else {
			
		}
		
		// calculator
		double first = -50.4;
		double second = 2;
		char operation = 'i';
		
		if ( operation == '+') {
			System.out.println( first + second);
		}	
		else if (operation == '-') {
			System.out.println(first - second);
		}
		else if (operation == '*') {
			System.out.println(first * second);
		}
		else if (operation == '/') {
			if (second == 0) {
				System.out.println("Dont Divide by zero");
			}
			else {
				System.out.println(first / second);
			}
		}
		else {
			System.out.println(operation + " Thats a no no" );
		}
		
		// 3 Numbers
		int x = 12;
		int y = 1;
		int z = 567;
		if(x>y){
			if(x>z){
				if (y>z){
					System.out. println(z+" , " + y +" , " + x);
				}
				else {
					System.out.println(y + " , " + z + " , " + x );
				}
			}
		}
		else {
			if (y>z){
				if(x>z){
					System.out.println(z + " , "+x+" , " + y);
				}
				else {
					System.out.println(x + " , " + z + " , " + y);
				}
			}
			else {
				if (z>x) {
					
				}
			}
		}
	}

}
