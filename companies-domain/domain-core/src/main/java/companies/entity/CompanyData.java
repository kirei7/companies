package companies.entity;

import companies.business.SubsidiaryCompany;

import java.math.BigDecimal;
import java.util.List;

public interface CompanyData {
    Long getId();
    void setId(Long id);

    List<SubsidiaryCompany> getChildCompanies();
    void setChildCompanies(List<SubsidiaryCompany> childCompanies);

    String getName();
    void setName(String name);

    BigDecimal getEstimatedEarnings();
    void setEstimatedEarnings(BigDecimal estimatedEarnings);
}
