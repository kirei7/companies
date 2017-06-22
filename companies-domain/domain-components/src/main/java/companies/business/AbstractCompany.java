package companies.business;

import companies.business.Company;
import companies.business.SubsidiaryCompany;
import companies.entity.CompanyData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.List;

public abstract class AbstractCompany<T extends Company> implements Company<T>{

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    protected CompanyData<T> companyData;

    public AbstractCompany(CompanyData<T> companyData) {
        this.companyData = companyData;
    }

    public String getName() {
        return companyData.getName();
    }

    public BigDecimal getTotalEarnings() {
        BigDecimal totalEarnings = companyData.getEstimatedEarnings();
        List<SubsidiaryCompany> childCompanies = companyData.getChildCompanies();
        if (childCompanies != null)
            for (SubsidiaryCompany company : childCompanies)
                totalEarnings = totalEarnings.add(company.getTotalEarnings());
        return totalEarnings;
    }

    @Override
    public CompanyData<T> getCompanyData() {
        return companyData;
    }

}
