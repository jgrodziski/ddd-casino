package ddd.casino.domain;


import static com.google.common.base.Preconditions.checkNotNull;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 *
 */
public class Credit implements ValueObject {
    private Integer value;
    public static final Credit ZERO = new Credit(0);

    public Credit(Integer value) {
        //TODO verifier que strictly positive
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public Credit add(Credit credit){
        return new Credit(credit.getValue()+this.getValue());
    }

    public Credit minus(Credit credit){
        if(this.value < credit.getValue()) {
            throw new IllegalArgumentException("It's not possible to de-credit more than current credit");
        }
        return new Credit(this.getValue()-credit.getValue());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Credit credit = (Credit) o;

        if (value != null ? !value.equals(credit.value) : credit.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "value=" + value +
                '}';
    }
}
