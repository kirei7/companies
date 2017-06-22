package companies;

import companies.business.ConcreteMainCompany;
import companies.business.ConcreteSubsidiaryCompany;
import companies.business.MainCompany;
import companies.business.SubsidiaryCompany;
import companies.entity.CompanyData;
import companies.entity.MainCompanyDataEntity;
import companies.entity.SubsidiaryCompanyData;
import companies.entity.SubsidiaryCompanyDataEntity;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CompanyTest {

    @Test
    public void getTotalEarningsShouldReturnSumOfAllChildrenIncludingNested() {
        CompanyData mainCompanyData = new MainCompanyDataEntity();
        MainCompany mainCompany = new ConcreteMainCompany(mainCompanyData);
        mainCompanyData.setEstimatedEarnings(createSum(1000f));

        SubsidiaryCompanyData subsidiaryCompanyData1 = new SubsidiaryCompanyDataEntity();
        SubsidiaryCompany childCompany1 = new ConcreteSubsidiaryCompany(subsidiaryCompanyData1);
        subsidiaryCompanyData1.setEstimatedEarnings(createSum(500f));

        SubsidiaryCompanyData subsidiaryCompanyData2 = new SubsidiaryCompanyDataEntity();
        SubsidiaryCompany childCompany2 = new ConcreteSubsidiaryCompany(subsidiaryCompanyData2);
        subsidiaryCompanyData2.setEstimatedEarnings(createSum(600f));

        SubsidiaryCompanyData subsidiaryCompanyData1Nested = new SubsidiaryCompanyDataEntity();
        SubsidiaryCompany childCompany1Nested = new ConcreteSubsidiaryCompany(subsidiaryCompanyData1Nested);
        subsidiaryCompanyData1Nested.setEstimatedEarnings(createSum(400f));

        subsidiaryCompanyData1.setChildCompanies(Arrays.asList(childCompany1Nested));

        mainCompanyData.setChildCompanies(Arrays.asList(childCompany1, childCompany2));

        assertEquals(createSum(2500f), mainCompany.getTotalEarnings());
    }
    private BigDecimal createSum(double rawSum) {
        return new BigDecimal(rawSum).setScale(2);
    }

}
