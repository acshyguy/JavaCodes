package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    @Test
    public void additionTest(){
        kata calculator = new kata();
        int result = calculator.add(2, 6);
        assertEquals(8, result);
        assertEquals(66, calculator.add(54,12));
    }
    @Test
    public void subtractionTest() {
        kata calculator = new kata();
        int result = calculator.subtract(4, 2);
        assertEquals(2, result);
    }
    @Test
    public void absoluteSubtractionTest() {
        kata calculator = new kata();
        int result = calculator.subtract(2, 4);
        assertEquals(2, result);
    }
    @Test
    public void quotientTest() {
        kata calculator = new kata();
        int result = calculator.divide(10, 0);
        assertEquals(0,result);
    }
    @Test
    public void multiplication() {
        kata calculator = new kata();
        int result = calculator.multiply(5, 3);
        assertEquals(15,result);
    }

    @Test
    public void testDrillerFor1To4Copies() {
        kata retailing = new kata();
        int price = retailing.copies ( 4);
        assertEquals(8_000, price);
    }
    @Test
    public void testDrillerFor5To9Copies() {
        kata retailing = new kata();
        int price = retailing.copies (5);
        assertEquals(9_000, price);
    }
    @Test
    public void testDrillerFor10To29Copies() {
        kata retailing = new kata();
        int price = retailing.copies (10);
        assertEquals(16_000, price);
    }
    @Test
    public void testDrillerFor30To49Copies() {
        kata retailing = new kata();
        int price = retailing.copies (30);
        assertEquals(45_000, price);
    }
    @Test
    public void testDrillerFor50To99Copies() {
        kata retailing = new kata();
        int price = retailing.copies (50);
        assertEquals(65_000, price);
    }
    @Test
    public void testDrillerFor100To199Copies() {
        kata retailing = new kata();
        int price = retailing.copies (100);
        assertEquals(120_000, price);
    }
    @Test
    public void testDrillerFor200To499Copies() {
        kata retailing = new kata();
        int price = retailing.copies (200);
        assertEquals(220_000, price);
    }
    @Test
    public void testDrillerFor500AndAboveCopies() {
        kata retailing = new kata();
        int price = retailing.copies (500);
        assertEquals(500_000, price);
    }

}

