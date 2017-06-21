package companies.entity;

import companies.Company;
import companies.SubsidiaryCompany;

import javax.persistence.MappedSuperclass;
import java.math.BigDecimal;
import java.util.List;

@MappedSuperclass
public class AbstractCompanyData implements CompanyData<Company> {
    private Long id;
    private String name;
    private BigDecimal estimatedEarnings;
    List<SubsidiaryCompany> childCompanies;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public BigDecimal getEstimatedEarnings() {
        return estimatedEarnings;
    }

    @Override
    public void setEstimatedEarnings(BigDecimal estimatedEarnings) {
        this.estimatedEarnings = estimatedEarnings;
    }

    @Override
    public List<SubsidiaryCompany> getChildCompanies() {
        return childCompanies;
    }

    @Override
    public void setChildCompanies(List<SubsidiaryCompany> childCompanies) {
        this.childCompanies = childCompanies;
    }

}
