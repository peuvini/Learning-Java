/* Write a method called printNumberInWord. 
The method has one parameter number which is the whole number. The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" 
if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers. 
You can use if-else statement or switch statement whatever is easier for you.

NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.
NOTE: Do not add main method to solution code. */
public class NumberInWord {
    public static void printNumberInWord(String number){
        if (number.toUpperCase() == "ZERO"){
            System.out.println("0");
        } else if (number.toUpperCase() == "ONE"){
            System.out.println("1");
        }else if (number.toUpperCase() == "TWO"){
            System.out.println("2");
        }else if (number.toUpperCase() == "THREE"){
            System.out.println("3");
        }else if (number.toUpperCase() == "FOUR"){
            System.out.println("4");
        }else if (number.toUpperCase() == "FIVE"){
            System.out.println("5");
        }else if (number.toUpperCase() == "SIX"){
            System.out.println("6");
        }else if (number.toUpperCase() == "SEVEN"){
            System.out.println("7");
        }else if (number.toUpperCase() == "EIGHT"){
            System.out.println("8");
        }else if (number.toUpperCase() == "NINE"){
            System.out.println("9");
        }else if (number.toUpperCase() == "OTHER"){
            System.out.println("other");
        }
    }
}
