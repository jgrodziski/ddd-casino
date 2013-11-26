package ddd.casino.domain;


import org.hamcrest.MatcherAssert;
import org.hamcrest.core.IsEqual;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import java.math.BigDecimal;
import java.util.Currency;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertNotNull;

public class SlotSteps {
    EGM egm;
    EGMRepository repo = new EGMRepositoryMock();

    @When("the following EGM is created: $brand, $model, denomination $denom $currency, $code")
    public void whenTheFollowingEGMIsCreatedGTechEMotion05Denomination1000(String brand, String mode, String denom, String currency, String code) {
        EGM egm = new EGM(brand, mode, new Denomination(new BigDecimal(denom), Currency.getInstance(currency)), new EGMCode(code));
        repo.store(egm);
    }

    @Given("the EGM $code")
    public void givenEGM(String code){
        egm = repo.load(new EGMCode(code));
        assertNotNull("EGM with code "+code+" not found",egm);
    }

    @Then("the EGM is available with the code $code through the EGM repository")
    @Pending
    public void thenTheEGMIsAvailableWithTheCode1000ThroughTheEGMRepository(String code) {
        EGMCode egmCode = new EGMCode(code);
        EGM egm  = repo.load(egmCode);
        assertNotNull(egm);
        assertThat(egm.getCode(), equalTo(new EGMCode(code)));
    }

    @When("the player inserts a bill of $value $currency")
    public void whenThePlayerInsertsABillOf(String value, String currencyCode) {
        egm.insert(new Bill(new Amount(new BigDecimal(value), Currency.getInstance(currencyCode))));
    }

    @Then("the EGM has an increment 40 credits")
    public void thenTheEGMHasAnIncrement40Credits() {
        Credit fourtyCredits = new Credit(40);
        assertThat(egm.getBalance(), equalTo(fourtyCredits));
    }

    @When("the player bets 1 credit")
    @Pending
    public void whenThePlayerBets1Credit() {
        // PENDING
    }

    @Then("the EGM starts a game with a bet of 1 credit")
    @Pending
    public void thenTheEGMStartsAGameWithABetOf1Credit() {
        // PENDING
    }

    @Then("the EGM returns the game result")
    @Pending
    public void thenTheEGMReturnsTheGameResult() {
        // PENDING
    }
}
