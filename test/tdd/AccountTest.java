package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {


    @Test
    public void accountCanBeCreatedTest() {
        //given i have created an account
        Account nepaAccount = new Account();
        //when i check my balance
        int balance = nepaAccount.getBalance();
        //confirm that my balance is zero
        assertEquals(0, balance);
    }

    @Test
    public void depositeMoneyTest() {
        //given I have an account
        Account boyoAccount = new Account();
        // when I deposit money
        boyoAccount.deposit(1_500);
        //check that my balance has changed
        assertEquals(1500, boyoAccount.getBalance());

    }

    @Test
    public void depositeTwice() {
        Account uselessAccount = new Account();
        uselessAccount.deposit(1_500);
        uselessAccount.deposit(2_000);

        assertEquals(3_500, uselessAccount.getBalance());
    }

    @Test
    public void withdrawMoneyTest() {
        //given I have an account
        Account acAccount = new Account();
        // when I deposit money
        acAccount.deposit( 3_000);
        acAccount.withdraw(500);
        //check that my balance has changed
        assertEquals(2_500, acAccount.getBalance());
    }

    @Test
    public void withdrawNegative() {
        Account acAccount = new Account();
        acAccount.deposit(3_000);
        acAccount.withdraw(-100);
        assertEquals(3_000, acAccount.getBalance());
    }

    @Test
    public void withdrawHigherAmountTest(){
        Account acAccount = new Account();
        acAccount.deposit( 3_000);
        acAccount.withdraw( 3_100);
        assertEquals(3_000,acAccount.getBalance());

    }
}




