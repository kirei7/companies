package companies.entity;

import companies.Company;
import companies.SubsidiaryCompany;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class SubsidiaryCompanyDataEntity
        extends AbstractCompanyData<SubsidiaryCompany>
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
