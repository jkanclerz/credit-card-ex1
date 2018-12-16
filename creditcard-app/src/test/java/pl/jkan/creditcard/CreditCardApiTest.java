package pl.jkan.creditcard;

import org.junit.Assert;
import org.junit.Test;

public class CreditCardApiTest {
    public static final String CARD_NUMBER = "1234-5678";

    private CreditCardApi api;
    private CreditCardInMemoryStorage ccInMemoryStorage;

    @Test
    public void iamAbleToWithdrawFromCC() {
        //GIVEN
        thereIsCCStorage();
        thereIsCCApi();
        thereIsCreditCard(CARD_NUMBER, 5000);

        //WHEN
        api.withdraw(CARD_NUMBER, 2000);

        //THEN
        ccWithNuberBalanceEquals(CARD_NUMBER, 3000);
    }

    private void thereIsCCStorage() {
        this.ccInMemoryStorage = new CreditCardInMemoryStorage();
    }

    private void ccWithNuberBalanceEquals(String number, double money) {
        CreditCard cc = ccInMemoryStorage.find(number);

        Assert.assertTrue(cc.getAccountBalance() == money);
    }

    private void thereIsCreditCard(String cardNumber, double money) {

        CreditCard cc = new CreditCard(cardNumber);
        cc.assignLimit(money);

        this.ccInMemoryStorage.add(cc);
    }

    private void thereIsCCApi() {
        this.api = new CreditCardApi();
    }

}
