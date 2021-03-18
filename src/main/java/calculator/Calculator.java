package calculator;

public class Calculator {

    public int sum(int a, int b) {
        return a+b;
    }

    public int dif(int a, int b) {
        return a-b;
    }

    public int div (int a, int b) throws ArithmeticException {
        try{
            return a/b;
        } catch (ArithmeticException e) {
            System.out.println("Делить на ноль нельзя!");
            return -1;
        }
    }

    public int mult (int a, int b) {
        return a*b;
    }

    public float prc (int a, int b) {
        return a*b/100;
    }

    public int mod (int a, int b) {
        return a%b;
    }

    public int inc (int a) {
        return a+1;
    }


}
