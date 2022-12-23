package src.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import src.main.*;

import org.junit.Test;

public class checkoutTest{
    
    @Test
    public void subtotalIsValid() {
        assertEquals(19.2, Main.getSubtotal());
    }

    @Test
    public void taxIsValid() {
        assertEquals(2.5, Main.getTax(19.2));
    }

    @Test
    public void totalIsValid() {
        assertEquals(21.7, Main.getTotal(19.2, 2.5));
    }
}
