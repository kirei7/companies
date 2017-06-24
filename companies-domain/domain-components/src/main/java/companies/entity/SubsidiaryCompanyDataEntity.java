package companies.entity;

import companies.business.Company;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class SubsidiaryCompanyDataEntity
        extends AbstractCompanyData
        implements SubsidiaryCompanyData {

    @ManyToOne
    private Company parent;

    @Override
    public Company getParent() {
        return parent;
    }
    @Override
    public void setParent(Company parent) {
        this.parent = parent;
    }
}
