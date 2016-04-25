package java101;

public class DifferentKindOfVariables {

    private int foo = 0;        // instance variable
    private static int BAR = 0; // class variable

    public void someMethod() {
        int fooBar = foo + BAR;      // local variable

        System.out.println(fooBar);
    }

}
