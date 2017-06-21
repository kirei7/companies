package companies;

import companies.entity.CompanyData;

import java.math.BigDecimal;
import java.util.List;

public abstract class AbstractCompany<T extends Company> implements Company<T>{
    protected CompanyData<T> companyData;

    public String getName() {
        return companyData.getName();
    }
    public BigDecimal getTotalEarnings() {
        BigDecimal totalEarnings = companyData.getEstimatedEarnings();
        List<SubsidiaryCompany> subsidiaryCompanies = companyData.getChildCompanies();
        if (subsidiaryCompanies != null)
            for (SubsidiaryCompany company : subsidiaryCompanies)
                totalEarnings = totalEarnings.add(company.getTotalEarnings());
        return totalEarnings;
    }

    @Override
    public CompanyData<T> getCompanyData() {
        return companyData;
    }

}
