package pl.jkan.creditcard;

import org.junit.Test;

class CreditCardApiTest {
    private CreditCardApi api;

    @Test
    public void iamAbleToWithdrawFromCC() {
        //GIVEN
        thereIsCCApi();
        thereIsCreditCard("1234-5678", 5000);

        //WHEN
        api.withdraw("1234-5678", 2000);

        //THEN
        ccWithNuberBalanceEquals("1234-5678", 3000);
    }

    private void ccWithNuberBalanceEquals(String number, double money) {

    }

    private void thereIsCreditCard(String cardNumber, double money) {

    }

    private void thereIsCCApi() {
        this.api = new CreditCardApi();
    }

}
