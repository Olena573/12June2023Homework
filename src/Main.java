// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.


        // Press Shift+F10 or click the green arrow button in the gutter to run the code.


        // Press Shift+F9 to start debugging your code. We have set one breakpoint
        // for you, but you can always add more by pressing Ctrl+F8.
        // here are unicode symbols runned not in the methods:
        /* char unicodeOne = 2203;
         * String unicodeTwo = "\2246";
         * char unicodeThree = 2274;
         * String ab = Character.toString(unicodeOne);
         * String bb = Character.toString(unicodeThree);
         *
         * System.out.println("Here are the unicode Symbols: "
         *        + ab + " " + bb + " " + " .");
         */


        unicodeSymbols();
        //Here are variables;
        int a;
        int ab;
        int b = 25;
        char D = 12;
        char aA = 2275;
        float fLl = 2246.12F;
        byte someByte = 3;

        getSum();
        //here we calculate and print a cube of 5 with a method, which will be written further;
        System.out.println(cubeCalc(5));
        //Here we print our results of the main actions of the calculator:
        System.out.println(calculatorSum(5, 6));
        System.out.println(calculatorMinus(5, 6));
        System.out.println(calculatorMultiply(5, 6));
        System.out.println(calculatorDivision(5, 6));

    }


    // Here is a method with the Unicode Symbols:
    public static void unicodeSymbols (){
        char unicodeOne = 2203;
        String unicodeTwo = "\2246";
        char unicodeThree = 2274;
        String ab = Character.toString(unicodeOne);
        String bb = Character.toString(unicodeThree);

        System.out.println("Here are the unicode Symbols: "
                + ab + " " + bb + " " + " .");

    }
  //  Here are methods with the method's overload.

    public static int getSum(int a) {
        int b = 2;
        int c = a+b;
        System.out.println ("Overload 1, int c = " + c);
        return  a;
    }
    public static int getSum(int ab, int a) {
        int b = 2;
        int c = a+b;
        int bc = 25 - b;
        System.out.println ("Overload 2, int c = " + c + " bc = " + bc);
        return ab + a;
    }

    public static long getSum(long a) {
        long b = 2;
        long c = a+b;
        long bc = 25 - b;
        System.out.println ("Overload 3" + c + " bc = " + bc);
        return a;
    }

    public static int getSum(int a, char D, int c) {
        char aD = 2274;

        System.out.println ("Overload 4" + c + " bc = " + aD + D);
        return a + c;
    }
    public static int getSum() {
        char aD = 22;

        System.out.println ("Overload 5" + aD);
        return aD;
    }

    public static float getSum(float fLl) {
        float b = 45.1F;
        System.out.println ("Overload 6" );
        return fLl + b;
    }
    public static int [] getSum(int ...a){
        int someInt[] = new int [a.length];
        for (int i = 0; i<a.length; i++){
        someInt [i] = a[i];
        }
        System.out.println ("Overload 7" );
        return someInt;
    }
    public static byte getSum (byte someByte) {
        System.out.println ("Overload 8" );
        return someByte;
    }

    //A method which calculates the cube of the number and prints out this number.
    public static int cubeCalc (int cube){

        return cube*cube*cube;

    }


    // Here are methods for the main functions of the calculator:

    public static int calculatorSum (int calcA, int calcB){
    return calcA + calcB;
    }
    public static int calculatorMinus (int calcA, int calcB){
        return calcA - calcB;
    }
    public static int calculatorMultiply (int calcA, int calcB) {
        return calcA * calcB;
    }
    public static int calculatorDivision (int calcA, int calcB) {
        return calcA / calcB;
    }
}
