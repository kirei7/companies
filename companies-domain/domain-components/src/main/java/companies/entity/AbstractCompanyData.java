package companies.entity;

import companies.Company;
import companies.SubsidiaryCompany;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@MappedSuperclass
public class AbstractCompanyData<T extends Company> implements CompanyData<T> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private BigDecimal estimatedEarnings;
    @Column(nullable = false)
    private List<SubsidiaryCompany> childCompanies;

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
