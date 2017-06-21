package companies;

import companies.entity.CompanyData;

import java.math.BigDecimal;
import java.util.List;

public interface Company<T extends Company> {
    String getName();
    BigDecimal getTotalEarnings();
    CompanyData<T> getCompanyData();
}
