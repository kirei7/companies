package companies.business;

import companies.entity.CompanyData;

public class ConcreteSubsidiaryCompany
        extends AbstractCompany<SubsidiaryCompany>
        implements SubsidiaryCompany {
    private Company parent;

    public ConcreteSubsidiaryCompany(CompanyData<SubsidiaryCompany> companyData) {
        super(companyData);
    }

    @Override
    public Company getParent() {
        return parent;
    }
}
