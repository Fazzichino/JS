de
// Create the file named Homework10.java under src
//FAZILFAZILFAZILFAZILFAZILFAZILFAZIL
public class Homework10 {

    // Task 1: Introduction to Java
    // Print a welcome message to the console in uppercase
    // Expected Output: WELCOME TO JAVA PROGRAMMING!
    public static void javaIntro() {
        // Declare and initialize a String variable with the message
        String name = ("WELCOME TO JAVA CLASS");
        System.out.println(name);

        // Print the message
    }


    // Task 2: Java Get Started
    // Print the classic "Hello, World!" message with each word on a new line
    // Expected Output:
    // Hello,
    // World!
    public static void javaGetStarted() {
        String message = "Hello,\nWorld!";
        System.out.println(message);

        // Declare and initialize a String variable with the message


        // Print the message using newline characters


    }


    // Task 3: Java Syntax
    // Create a simple Java method that prints a message with a line break in the middle of the sentence
    // Expected Output: This is a simple
    // method in Java.
    public static void javaSyntax() {
        // Declare and initialize a String variable with the message
String word = "This is a simple \nmethod in Java";
System.out.println(word);

        // Print the message with a line break in the middle


    }

    // Task 4: Java Output
    // Print a message and a number on the same line
    // Expected Output: The answer is: 42
    public class Main {
        public static void main(String[] args) {
            javaOutput();
        }
    }
    public static void javaOutput() {
        // Declare an integer variable with the value 42
int number = 42;
        System.out.println("The integer answer is "  + number);

        // Print a message concatenated with the integer variable


    }

    // Task 5: Print Text
    // Print a custom text message with its length
    // Expected Output: Learning Java is fun! (Length: 22)
    public static void printText() {
        String fe = "Learning Java is fun!";
                System.out.println(fe + "(Length: " + fe.length() +")");
        // Declare and initialize a String variable with the message

        // Print the length of the message


    }

    // Task 6: Print Numbers
    // Print an integer and a double value
    // Expected Output: Integer: 123, Double: 45.67
    public static void printNumbers() {

        // Declare and initialize an integer and a double variable

int integerValue = 123;
        double doubleValue= 45.67;
                System.out.println("Integer:" + integerValue + "Double:" + doubleValue);
        // Print both values


    }


    // Task 7: Java Comments
    // Demonstrate single-line and multi-line comments
    // Expected Output: Single-line comment above
    // Expected Output: Multi-line comment above
    public static void javaComments() {
        // Single-line comment
System.out.println("Single line comment above");

        /* Multi-line comment
        *
         */
        System.out.println("Multi line comment above");

        // Print messages to demonstrate the comments


    }

    // Task 8: Java Variables
    // Declare and initialize different types of variables
    // Expected Output: Integer: 5, String: Hello, Boolean: true
    public static void javaVariables() {
        // Declare and initialize an integer, a String, and a boolean variable
int integerValue = 5;
String stringValue = "Faz";
        boolean booleanValue = true;
        System.out.println("Integer: " + integerValue + ", String: " + stringValue + ", Boolean: " + booleanValue);

        // Print all variables


    }

    // Task 9: Java Data Types
    // Demonstrate usage of different data types
    // Expected Output: Integer: 10, Double: 20.5, Char: A, Boolean: true
    public static void javaDataTypes() {
        // Declare and initialize variables of different data types



        // Print all variables


    }

    // Task 10: Numbers
    // Perform basic arithmetic operations and print results
    // Expected Output: Sum: 30, Product: 200
    public static void numbers() {
        // Declare and initialize two integer variables


        // Print the results


    }

    // Task 11: Booleans
    // Demonstrate boolean operations
    // Expected Output: Is Java fun? true
    // Expected Output: Is fish tasty? false
    public static void booleans() {
        // Declare and initialize two boolean variables
boolean isJavaFun = true;
boolean isFishTasty = false;

        // Print both boolean values
System.out.println("Is Java fun? " +isJavaFun);
System.out.println("Is Fish Tasty? " +isFishTasty);

    }

    // Task 12: Calculate Area of a Rectangle
    // Calculate and print the area of a rectangle given the length and width
    // Formula: Area = length * width
    // Expected Output: Area of the rectangle with length 8 and width 5 is 40
    public static void calculateRectangleArea() {
        // Declare and initialize variables for length and width

        int length = 8;
                int width = 5;
                int area = length*width;

                System.out.println("The area of the rectangle with length " + length + " and width " + width + " is " + area);


        // Print the area


    }

    // Task 13: Calculate Area of a Square
    // Calculate and print the area of a square given the side length
    // Formula: Area = side * side
    // Expected Output: Area of the square with side length 5 is 25
    public static void calculateSquareArea() {
        // Declare and initialize a variable for the side length
int sideLength = 5;
        int sideLength2 = 5;
                int area = sideLength*sideLength2;
        // Print the area
System.out.println("The area of the square with side length " + sideLength + " is " + area );

    }

    // Task 14: Calculate Area of a Circle
    // Calculate and print the area of a circle given the radius
    // Formula: Area = π * radius^2
    // Expected Output: Area of the circle with radius 7 is 153.93804002589985
    public static void calculateCircleArea() {
        // Declare and initialize a variable for the radius
        // float pi =3.14;
        //


        // Calculate the area of the circle using the formula Area = π * radius^2


        // Print the area


        // Print the area


    }

    // Main method to run all tasks
    // Please do not modify the main method
    public static void main(String[] args) {
        javaIntro();
        javaGetStarted();
        javaSyntax();
        javaOutput();
        printText();
        printNumbers();
        javaComments();
        javaVariables();
        javaDataTypes();
        numbers();
        booleans();
        calculateRectangleArea();
        calculateSquareArea();
        calculateCircleArea();
    }
}

