public class calculator {
    private int result = 0;
    private double answer = 0;

    public int getResult() {
        return result;
    }
    public double getAnswer() {return answer; }
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
    public int volume(int hor, int ver, int hei) { return result = (hor * ver * hei);}
    public double volume(int r) {return answer = (3.14 * r * r);}
}
