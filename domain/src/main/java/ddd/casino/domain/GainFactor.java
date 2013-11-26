package ddd.casino.domain;

/**
 * Created with IntelliJ IDEA.
 * User: rformation
 * Date: 26/11/13
 * Time: 16:32
 * To change this template use File | Settings | File Templates.
 */
public class GainFactor {
    private int multiplicator;

    public static final GainFactor ZERO = new GainFactor(0);

    public GainFactor(int multiplicator)
    {
        this.multiplicator = multiplicator;
    }

    public Credit Calculate(Credit credit){
        return new Credit(credit.getValue()*this.multiplicator);
    }
}
