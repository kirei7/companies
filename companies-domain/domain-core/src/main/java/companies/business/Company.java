package companies.business;

import companies.entity.CompanyData;

import java.math.BigDecimal;

public interface Company<T extends Company> {
    String getName();
    BigDecimal getTotalEarnings();
    CompanyData<T> getCompanyData();
}
