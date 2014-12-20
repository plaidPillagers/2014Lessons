/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2014lesson4.master;

/**
 *
 * @author MarMostro
 */
public class Master {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Loops:
         *  Loops allow us to run a certain section of code repeatedly. 
         *    They do this by incrementing a variable (Usually an int)
         *    You can technically increment any type of variable... but if I catch you doing that... SHAME!
         *  The general structure of loops looks like this:
         */
        
        for(int i = 0; i < 10; i++) {
            System.out.println("I'm in a loop!");
        }
        
        /**
         * Because loops contain other code, they end with {}'s 
         * Every thing inside gets indented
         * 
         * Declaration: if we look at line 25, we can see that you tell java 
         *  that you want a for loop by writing "for", next we have three arguments in ()'s
         *  Three Arguments:
         *     1. "int i = 0" This sets the variable we are incrementing
         *     2. "i < 10" This determines when the loop will stop, in this case the biggest i can be is 9   >
         *          Be careful, if you set this part wrong, you can end up with an infinite loop
         *     3. Last we have our increment, here we are incrementing by 1
         *          i++ is a shorter way of writing i = i + 1, you can also decrement by saying i--
         *          You can increment by any other number by doing i+= 2, i *= 500, ect..
         * 
         * How it Runs:
         *   First, i = 0, we check that i is less than 10 and it is, so we run all lines of code in the for loops {}'s,
         *   After that, we increment by our increment (1). Now i = 1, 1 is less than 10 so we run line 26 again. 
         *   We keep running and at some point i = 9, 9 is less than 10, we run whats inside, then i = 10,
         *   10 is not less than 10 so we don't run the code and we go to line 28
         * 
         * It Prints:
         *   I'm in a loop!
             I'm in a loop!
             I'm in a loop!
             I'm in a loop!
             I'm in a loop!
             I'm in a loop!
             I'm in a loop!
             I'm in a loop!
             I'm in a loop!
             I'm in a loop!
         */
        
        /**
         * Here's some more example of loops, guess what they print
         */
        
        // EX 1:
        System.out.println("*** EXAMPLE 1 *** (You can use the value of startHere in the loop)");
        int stopHere = 5;
        
        for(int startHere = 2; startHere < stopHere; startHere++) {
            System.out.println(startHere);
        }
        
        // EX 2: 
        System.out.println("*** EXAMPLE 2 *** (You can pretty much write anything you want in forloops!)");
        for(int i = 0; i < 10; i++){
            int addTo = i + 1;
            if(i * 2 == 20) {
                System.out.println(i + " * 2 is equal to 20");
            }
            else {
                System.out.println(addTo + giveMeANumber(i));
            }
        }
        
        // EX 3:
        System.out.println("*** EXAMPLE 3 *** (Even other for loops!!! loopception!)");
        for(int i = 2; i > 0; i--) {
            for(int j = 0; j <= 2; j ++) {
                System.out.println(i + j);
            }
        }
        
        /**
         * Now, lets try to make some shapes. To start off, lets try a square, It will look something like this
         *   Size = 3
         *   Symbol = '*'
         * 
         *   * * *
         *   * * *
         *   * * *
         * 
         * We will make it in a method so we can put in a size of the square and a symbol and it will print it.
         */
        
        makeSquare(3, '*');
        /*
         *  * * *
         *  * * * 
         *  * * * 
         */
        
        makeSquare(5, 'A');
        /*
         *  A A A A A 
         *  A A A A A 
         *  A A A A A 
         *  A A A A A 
         *  A A A A A 
         */
        
        makeSquare(-100000, '#');
        // you can't make a square of a negative size
        
        /*
         * YOUR TURN!
         * Make a method that takes in an int size and a char symbol and prints a RIGHT TRIANGLE
         * Don't worry about negative outputs
         * 
         * Here are examples:
         *  makeTriangle(0, '&');
         *  prints nothing
         * 
         *  makeTriangle(1, '^');
         *  ^
         * 
         *  makeTriangle(5, '@');
         *  @
         *  @ @
         *  @ @ @ 
         *  @ @ @ @
         *  @ @ @ @ @ 
         */
        
    }

    static int giveMeANumber(int loopOutput) {
        return (loopOutput * loopOutput) * 2 + (loopOutput * loopOutput) * 5 + 7;
    }

    static void makeSquare(int size, char symbol) {
        // Can't print negative sizes, this would cause an infinite loop because 0 is always greater than negatives
        if(size < 0){
            System.out.println("you can't make a square of a negative size");
            return;
            /*
             * This return up to now should make you confused because makeSquare() doesn't return anything.
             *  The return here returns nothing but it stops the method so nothing benieth line 132 will be run.
             *  This is a tad of a hack, it shouldn't come up very much but it might somewhere.
             */
        }
        
        /**
         * We can't print in columns so we have to print in rows.
         * The secret to doing this is to use the "print() command rather than "println()".
         * This won't make a new line after anything we print, it will just stick the next 
         * thing we print write after the last thing we printed.
         */
        
        for(int height = 0; height < size; height++) {
            /** 
             *  The forloop we are in will print how many rows we want, 
             *  the inner one will print what is in the rows
             */
             
            for(int width = 0; width < size; width++) {
                System.out.print(symbol + " "); 
                //this will print the symbol and a space, WITHOUT going down a line
            }
            /*
             *  after we printed each line, we then want to go down a line so we println
             */
            
            System.out.println();
        }
    }
}
