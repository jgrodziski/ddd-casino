package ddd.casino.domain;

import java.math.BigDecimal;
import java.util.Currency;

import static com.google.common.base.Preconditions.checkNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

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

    public boolean isAmountValid(Amount amount){
        return isAmountValid(amount, this);
    }

    public static boolean isAmountValid(Amount amount, Denomination denomination){
        assertThat(amount.getCurrency(), equalTo(denomination.getCurrency()));
        return amount.getValue().remainder(denomination.getValue()).intValue() == 0;
    }

    public Credit convert(Amount amount){
        checkNotNull(amount, this);
        assertThat(amount.getCurrency(), equalTo(this.getCurrency()));
        return new Credit(amount.getValue().divide(this.getValue()).intValue());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Denomination that = (Denomination) o;

        if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = value != null ? value.hashCode() : 0;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        return result;
    }
}
