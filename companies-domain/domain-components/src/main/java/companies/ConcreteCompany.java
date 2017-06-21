package companies;

import companies.entity.CompanyData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class ConcreteCompany implements Company{

    protected static final int EARNINGS_SCALE = 2;
    private final Logger logger = LoggerFactory.getLogger(ConcreteCompany.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    @OneToMany(fetch = FetchType.EAGER)
    protected List<SubsidiaryCompany> childCompanies;

    @Column(nullable = false)
    protected String name;
    @Column(nullable = false)
    protected BigDecimal estimatedEarnings;

    public String getName() {
        return name;
    }
    public BigDecimal getTotalEarnings() {
        BigDecimal totalEarnings = getEstimatedEarnings();
        if (getChildCompanies() != null)
            for (SubsidiaryCompany company : getChildCompanies())
                totalEarnings = totalEarnings.add(company.getTotalEarnings());
        return totalEarnings;
    }

    @Override
    public CompanyData getCompanyData() {
        return null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<SubsidiaryCompany> getChildCompanies() {
        return childCompanies;
    }

    public void setChildCompanies(List<SubsidiaryCompany> childCompanies) {
        this.childCompanies = childCompanies;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getEstimatedEarnings() {
        return estimatedEarnings;
    }

    public void setEstimatedEarnings(BigDecimal estimatedEarnings) {
        this.estimatedEarnings = estimatedEarnings;
    }
}
