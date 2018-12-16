package pl.jkan.creditcard;

import org.junit.Assert;
import org.junit.Test;

public class CreditCardTest {
    
    @Test
    public void assignCreditLimitToCard() {
        CreditCard card = new CreditCard();
        
        card.assignLimit(2000);
        
        Assert.assertTrue(card.getLimit() == 2000);
    }
    
    @Test
    public void canBlockCredsitCard() {
        CreditCard card = new CreditCard();
        card.block();
        Assert.assertTrue(card.isBlocked());
    }

    @Test
    public void withdrawedDecreaseAwolableFounds() {
        CreditCard card = new CreditCard();
        
        card.assignLimit(2000);
        card.withdraw(1000);
        
        Assert.assertTrue(card.getCountBalance() == 1000);
    }

}