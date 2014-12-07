
public class Lesson2_2014 {

	public static void main(String[] args) {
		// month/day/year printing
		int day = 12;
		int month = 12;
		int year = 2001;
		System.out.println(month + "/" + day + "/" + year);
		
		// starting if statements
		double first = 5.3;
		double second = 0;
		char operation = 'l';
		
		boolean firstGreaterThanSecond = first > second;
		boolean firstequalsecond = first == second;
		boolean firstLessThanSecondAndLessThanDay = first < second &&  first < day;
		
		if(firstGreaterThanSecond) {
			System.out.println(first + " > " + second);
		}
		else if (first < second) {
			System.out.println(first + " < " + second);
		}
		else if (first == second) {
			System.out.println(first + " equals " + second);
		}
		else {
			// will never run
			System.out.println("first and second aren't related to each other ");
		}

		if (first < second && first < day) {
			System.out.println(first + " is less than " + second + " and less than " + day);
		}
		
		if (first > second || first < day) {
			System.out.println("in or statement");
		}
		
		// calculator
		if (operation == '+'){
			System.out.println(first + second);
		}
		else if (operation == '-'){
			System.out.println(first-second);
		}
		else if (operation == '*'){
			System.out.println(first*second);			
		}
		else if (operation == '/'){
			if (second==0){
				System.out.println ("Dividing by Zero");
				
			}else {
				System.out.println(first/second);
			}
		}
		else {
			System.out.println ("Invalid Operation");
		}
		
		// three numbers
		int x = 2;
		int y = 1;
		int z = 3;
		
		if (x < y){
			if (x < z){
				if (y < z){
					System.out.println(x +"," + y + "," + z);
				}
				else {
					System.out.println(x + "," + z + "," + y);
				}
			
			}
			else {
				if (y < z){
					System.out.println(y +"," + x +"," + z);
				}
				else {
					System.out.println (z + "," + x + "," + y);
				}
			}
		}
		else {
			if (y < z) {
				if (x < z) {
					System.out.println(y + "," + x + "," + z);
				}
				else {
					System.out.println(y + "," + z + "," + x);
				}
			}
			else {
				if (x < z) {
					System.out.println(x + "," + y + "," + z);
				}
				else {
					System.out.println(z + "," + y + "," + x);
				}
			}
		}
	}

}
