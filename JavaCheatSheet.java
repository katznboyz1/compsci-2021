//import the ArrayList class for use in this program
import java.util.ArrayList;

//the main class for the file
//this must have the same name as the file
class JavaCheatSheet {

    //just a random value to demonstrate how you can access and modify items in a new instance of the class
    //this can be accessed via object.value
    String value;

    //a method to print out the words in an ArrayList
    public static void printOutArrayListOfWords(ArrayList arrayList) {

        //iterate through the ArrayList
        for (int i = 0; i < arrayList.size(); i++) {

            //print out the index of the arrayList
            System.out.print(arrayList.get(i) + " ");
        }

        //print the carriage return character
        //to print strings in java, you can only use double quotes; single quotes are for the char data type
        System.out.print("\n");
    }

    //the method to initialize an instance
    //this must be the same name as the class, since it initializes the instance
    //any other functions used by the instance can be named whatever they want
    public JavaCheatSheet(String string) {

        //set the value variable to string
        value = string;
    }

    //a function to change the value of value (can also be done by doing object.value = newValue)
    public void changeValue(String newValue) {

        //change the value to the new value
        value = newValue;
    }

    //the main method that will be ran
    //public: the method is accessible outside of this scope
    //static: this method belongs to the class, so this means that you dont need to create an instance of the class in order to run it
    //void: the return value for this method, which is void (no value)
    //String[] args: the arguments for the main function (command line args)
    public static void main(String[] args) {

        //create a new ArrayList
        //the <> is called a generic, which ensures that whatever type is stated within it will be the only type in the ArrayList
        //generics prevent the wrong types from being included, and any type errors will be caught at compilation
        //arraylists are different from normal arrays because they are resizable, but this also means you interact with them differently
        ArrayList<String> newListOfWords = new ArrayList<String>();

        //you can create a new array of fixed size by doing type[]
        //if you want to create an empty array, you can do type[] varName = type[length]
        //this will create a new empty list of the specified data type, with the specified length
        String[] words = {"This", "program", "worked", "correctly!", "extra"};

        //to iterate through an array, you can do "for (type var1 : var2)" which is the java equivalent of pythons "for var1 in var2"
        for (String word : words) {

            //add the new items to the ArrayList by using the .add method
            newListOfWords.add(word);
        }

        //there is an extra word in the words array, so delete items
        //you can also delete the extra word by doing newListOfWords.remove(4);
        newListOfWords.remove("extra");

        //run a method that will print out the newListOfWords in a nice format
        printOutArrayListOfWords(newListOfWords);

        //make a new instance of JavaCheatSheet
        JavaCheatSheet testInstance = new JavaCheatSheet("This is part of an instance!");

        //print out the value variable that is within the new instance
        System.out.println(testInstance.value);

        //change the value of value
        testInstance.changeValue("Value has been changed!");

        //print out value again
        System.out.println(testInstance.value);
    }
}