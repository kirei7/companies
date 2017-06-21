package companies;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ConcreteCompanyTest {

    @Test
    public void getTotalEarningsShouldReturnSumOfAllChildrenIncludingNested() {
        ConcreteCompany mainCompany = new ConcreteCompany();
        mainCompany.setEstimatedEarnings(createSum(1000f));

        ConcreteSubsidiaryCompany childCompany1 = new ConcreteSubsidiaryCompany();
        childCompany1.setEstimatedEarnings(createSum(500f));

        ConcreteSubsidiaryCompany childCompany2 = new ConcreteSubsidiaryCompany();
        childCompany2.setEstimatedEarnings(createSum(600f));

        ConcreteSubsidiaryCompany childCompany1Nested = new ConcreteSubsidiaryCompany();
        childCompany1Nested.setEstimatedEarnings(createSum(400f));

        childCompany1.setChildCompanies(Arrays.asList(childCompany1Nested));

        mainCompany.setChildCompanies(Arrays.asList(childCompany1, childCompany2));

        assertEquals(createSum(2500f), mainCompany.getTotalEarnings());
    }
    private BigDecimal createSum(double rawSum) {
        return new BigDecimal(rawSum).setScale(2);
    }

}