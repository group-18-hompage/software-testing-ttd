import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class calculatorTest {
    calculator calculator = new calculator();

    @Test //초기화가 잘 되었는지 확인
    public void getResult()  {
        assertThat(calculator.getResult(), is(0));
    }

    @Test //add가 잘 실행되는지 확인
    public void add() {
        calculator.add(2,3);
        assertThat(calculator.getResult(), is(5));
    }

    @Test //minus가 잘 실행되는지 확인
    public void minus() {
        calculator.minus(5, 2);
        assertThat(calculator.getResult(), is(3));
    }

    @Test // multiply가 잘 실행되는지 확인
    public void multiply() {
        calculator.multiply(2,3);
        assertThat(calculator.getResult(), is(6));
    }

    @Test // divide가 잘 실행되는지 확인인
    public void divide() {
        calculator.divide(9, 3);
        assertThat(calculator.getResult(), is(3));
    }

    @Test // 부피 구하기
    public void temp(){
        calculator.volume(3, 3, 3);
        assertThat(calculator.getResult(), is(27));

        calculator.volume(5);
        assertThat(calculator.getAnswer(), is(78.5));
    }
}