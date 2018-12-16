package pl.jkan.creditcard;

class CreditCardApi {

    CreditCardInMemoryStorage storage;

    public CreditCardApi(CreditCardInMemoryStorage storage) {
        this.storage = storage;
    }

    public void withdraw(String ccNumber, double money) {
        CreditCard cc = storage.find(ccNumber);

        cc.withdraw(money);
    }
}
