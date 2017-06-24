package companies.business;

import companies.entity.SubsidiaryCompanyData;

public class ConcreteSubsidiaryCompany
        extends AbstractCompany<SubsidiaryCompanyData>
        implements SubsidiaryCompany {
    private Company parent;

    public ConcreteSubsidiaryCompany(SubsidiaryCompanyData companyData) {
        super(companyData);
    }

    @Override
    public Company getParent() {
        return parent;
    }
}
