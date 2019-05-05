import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
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

    @Test // divide가 잘 실행되는지 확인
    public void divide() {
        calculator.divide(9,3);
        assertThat(calculator.getResult(), is(3));
    }

    @Test // reminder가 잘 실행되는지 확인
    public void reminder() {
        calculator.remainder(5, 2);
        assertThat(calculator.getResult(), is(1));
    }

    @Test // square가 잘 실행되는지 확인
    public void square() {
        calculator.square(5);
        assertThat(calculator.getResult(), is(25));
    }

    @Test // 두개 선언해서 곱해지는게 잘 되는지 확인
    public void multiplyTwoObject() {
        calculator calculator2 = new calculator();
        calculator.add(2,3);
        calculator2.multiply(2,4);
        calculator.multiply((calculator.getResult()),calculator2.getResult());
        assertThat(calculator.getResult(), is(40));
    }
    @Test // cube가 잘 실행되는지 확인
    public void cube() {
        calculator.cube(3);
        assertThat(calculator.getResult(),is(27));
    }

    @Test // triangle이 잘 실행되는지 확인
    public void triangle() {
        calculator.triangle(2,3);
        assertThat(calculator.getResult(), is(3));
    }

    @Test // 임의의 두 함수를 실행해서 합해보는 테스트
    public void spaceAdd() {
        calculator calculator2 = new calculator();
        calculator.square(3);
        calculator2.triangle(4, 3);
        calculator.add(calculator.getResult(),calculator2.getResult());
        assertThat(calculator.getResult(),is(15));
    }
}