/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2014firstlesson;

/**
 *
 * @author lenny
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          /*
           * here is how you right a big Comment
           */ 
        // here is how you right a small comment
        
        // Integer Stuff
        int wholeNumber = 50;
        int secondWholeNumber = 36;
        System.out.println(wholeNumber + secondWholeNumber); //prints 86
        
        System.out.println("the value of wholeNumber is " + wholeNumber); // prints "the value of wholeNumber is 50"
        wholeNumber = 100;
        //prints "the value of wholeNumber after the cahnge is 100"
        System.out.println("the value of wholeNumber after the change is " + wholeNumber); 
        
        // prints "the value of wholeNumber after added with secondWholeNumber is 136"
        System.out.println("the value of wholeNumber after added with secondWholeNumber is " + (wholeNumber + secondWholeNumber));
        // prints "subtraction 64"
        System.out.println("subtraction " + (wholeNumber - secondWholeNumber ));
        // prints "Divison 2"
        System.out.println("Division " + wholeNumber / secondWholeNumber);
        
        // Double Stuff
        double decimal = 1;
        double secondDecimal = 3;
        // prints "1 / 3: 0.3333333333333333"
        System.out.println("1 / 3: " + decimal / secondDecimal);
        
        double result = 1.0 / 3;
        // prints "1 / 3: 0.3333333333333333"
        System.out.println("1 / 3: " + result);
    }
}
