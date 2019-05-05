public class calculator {
    private int result = 0;
    private double answer = 0;
    public int getResult() {
        return result;
    }
    public int add(int input1, int input2) {
        return result = (input1 + input2);
    }
    public int minus(int input1, int input2) {
        return result = (input1 - input2);
    }
    public int multiply(int input1, int input2) {
        return result = (input1 * input2);
    }
    public int divide(int input1, int input2) {
        return result = (input1 / input2);
    }
    public int remainder(int input1, int input2) {
        return result = (input1 % input2);
    }
    public int square(int input) {
        return result = (input * input);
    }
    public int cube(int input) {
        return result = (input * input * input);
    }
    public int triangle(int a, int b) {
        return result = (1/2 * a * b);
    }

}
