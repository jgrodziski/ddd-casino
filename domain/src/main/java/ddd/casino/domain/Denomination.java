package ddd.casino.domain;

import java.math.BigDecimal;
import java.util.Currency;

/**
 *
 */
public class Denomination {
    private BigDecimal value;
    private Currency currency;

    public Denomination(BigDecimal value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    public BigDecimal getValue() {
        return value;
    }

    public Currency getCurrency() {
        return currency;
    }
}
