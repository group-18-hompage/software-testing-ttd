import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AccountTest {

    // 잔액
    @Test
    public void get_balance() {
        Account account = new Account();

        account.getBalance();
        assertThat(account.getBalance(), is(0));
    }

    // 입금
    @Test
    public void add_money(){
        Account account = new Account();

        account.addMoney(1000);
        assertThat(account.getBalance(), is(1000));
    }

    // 출금
    @Test
    public void withdrawal_money(){
        Account account = new Account();

        account.addMoney(2000);
        assertThat(account.getBalance(), is(2000));

        account.withdrawal(500);
        assertThat(account.getBalance(), is(1500));
    }

    // 마이너스면 에러
    @Test(expected = IllegalArgumentException.class)
    public void if_money_minus_error(){
        Account account = new Account();

        account.addMoney(300);
        account.withdrawal(500);
        assertThat(account.getBalance(), is(-200));
    }

    // 이체
    @Test
    public void transfer(){
        Account one = new Account();
        Account two = new Account();

        one.addMoney(10000);
        two.addMoney(20000);

        one.transfer(two, 5000);
        assertThat(one.getBalance(), is(5000));
        assertThat(two.getBalance(), is(25000));
    }

    @Test
    public void createAccount(){
        Account account = new Account("연우", 1000000);

        assertThat(account.getOwner(), is("연우"));
    }


}
