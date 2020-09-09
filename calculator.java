//import statements
import java.util.Scanner; //for accepting stdin

//the main class
class Main {

    public static void main(String[] args) {

        //the value that determines whether or not to continue
        boolean continueInputLoop = true;

        //the scanner 
        Scanner mainScanner = new Scanner(System.in);

        //tell the user information
        System.out.println("Type \"exit\" to exit.");

        //the main loop 
        while (continueInputLoop) {

            //the try catch statement for errors
            try {

                //main input for the equation
                System.out.print("What is your equation (\"a + b\" format (with spaces)): ");
                String equation = mainScanner.nextLine();

                //split the equation by spaces (the different parts of the equation are seperated by spaces)
                //the limit is 4 because of part a, part b, and then the return characters
                String[] splitEquationArray = equation.split(" ", 4);

                //create a variable to check if the user wants to exit
                String userWantsToExit = splitEquationArray[0];

                //clean up the exit variable
                userWantsToExit = userWantsToExit.toLowerCase();

                //check if the user typed exit
                if (userWantsToExit.equals("exit")) {

                    //set the continue value to false
                    continueInputLoop = false;

                    //tell the user that the program is exiting
                    System.out.println("Quitting...");

                //the user didnt want to exit
                } else {

                    //the parts of the equation
                    float firstNumber = Float.parseFloat(splitEquationArray[0]);
                    float secondNumber = Float.parseFloat(splitEquationArray[2]);
                    String operator = splitEquationArray[1];

                    //TODO: find a way to optimize this, maybe a switch statement or whatever its called, also store the result in a var and only print the var instead of having all of these statements?
                    //check if the operation is addition
                    if (operator.equals("+")) {

                        //print the answer to the equation
                        System.out.println(equation + " = " + Float.toString(firstNumber + secondNumber));

                    //check if the operation is addition
                    } else if (operator.equals("-")) {

                        //print the answer to the equation
                        System.out.println(equation + " = " + Float.toString(firstNumber - secondNumber));

                    //check if the operation is division
                    } else if (operator.equals("/")) {

                        //check if the user is dividing by 0
                        if (secondNumber == 0) {
                            
                            //tell the user that they cant divide by 0
                            System.out.println("Divide by 0 error.");
                        
                        //the user isnt dividing by 0
                        } else {
                            
                            //print the answer to the equation
                            System.out.println(equation + " = " + Float.toString(firstNumber / secondNumber));
                        }

                    //check if the operation is multiplication
                    } else if (operator.equals("*")) {

                        //print the answer to the equation
                        System.out.println(equation + " = " + Float.toString(firstNumber * secondNumber));

                    }
                }

            //catch the error that happens
            } catch (Exception mainLoopError) {

                //alert the user that there was an error
                System.out.println("There was an error with your equation. Please fix is and retry.");

            }
        }

        //close the scanner
        mainScanner.close();
    }
}
