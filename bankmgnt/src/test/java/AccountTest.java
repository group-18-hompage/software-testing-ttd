import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

    // 계좌 생성
    @Test
    public void createAccount(){
        Account account = new Account("연우", 1000000);

        assertThat(account.getOwner(), is("연우"));
    }

    // 그룹 계좌
    @Test
    public void groupAccount_balance(){
        Account group = new Account();

        Account member1 = new Account("주연", 1000000);
        Account member2 = new Account("현아", 1000000);
        Account member3 = new Account("규진", 1000000);

        group.groupAccount(member1, 500000);
        group.groupAccount(member2, 1000000);
        group.groupAccount(member3, 800000);

        assertThat(group.getBalance(), is(2300000));
        assertThat(member1.getBalance(), is(500000));
        assertThat(member2.getBalance(), is(0));
        assertThat(member3.getBalance(), is(200000));
    }

    // n빵 치기
    @Test
    public void divide_n(){
        Account member1 = new Account("주연", 1000000);
        Account member2 = new Account("현아", 10000000);
        Account member3 = new Account("규진", 700000);
        Account member4 = new Account("연우", 500000);

        int money = 100000;

        member1.divide_n_fairy(4, money);
        member2.divide_n_fairy(4, money);
        member3.divide_n_fairy(4, money);
        member4.divide_n_fairy(4, money);

        assertThat(member1.getBalance(), is(975000));
        assertThat(member2.getBalance(), is(9975000));
        assertThat(member3.getBalance(), is(675000));
        assertThat(member4.getBalance(), is(475000));
    }

}
