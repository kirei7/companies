package companies.business;

import companies.entity.CompanyData;

import java.math.BigDecimal;

public interface Company<T extends CompanyData> {
    String getName();
    BigDecimal getTotalEarnings();
    T getCompanyData();
}
