package pl.jkan.creditcard;

import java.util.HashMap;
import java.util.Map;

class CreditCardInMemoryStorage {
    private Map<String, CreditCard> cards = new HashMap<>();

    public void add(CreditCard cc) {
        cards.put(cc.getNumber(), cc);
    }

    public CreditCard find(String number) {
        return cards.get(number);
    }
}
