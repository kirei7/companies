package companies.business;

import companies.entity.CompanyData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.List;

public abstract class AbstractCompany<T extends CompanyData> implements Company<T>{

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    protected T companyData;

    public AbstractCompany(T companyData) {
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
    public T getCompanyData() {
        return companyData;
    }

}
