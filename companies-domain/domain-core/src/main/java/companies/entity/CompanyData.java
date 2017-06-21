package companies.entity;

import companies.Company;
import companies.SubsidiaryCompany;

import java.math.BigDecimal;
import java.util.List;

public interface CompanyData<T extends Company> {
    Long getId();
    void setId(Long id);

    List<SubsidiaryCompany> getChildCompanies();
    void setChildCompanies(List<SubsidiaryCompany> childCompanies);

    String getName();
    void setName(String name);

    BigDecimal getEstimatedEarnings();
    void setEstimatedEarnings(BigDecimal estimatedEarnings);
}
