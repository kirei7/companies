package companies.entity;

import companies.Company;

import javax.persistence.Entity;

@Entity
public class SubsidiaryCompanyDataEntity extends AbstractCompanyData implements SubsidiaryCompanyData {
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
