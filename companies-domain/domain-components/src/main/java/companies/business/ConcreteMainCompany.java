package companies.business;

import companies.entity.CompanyData;

public class ConcreteMainCompany
        extends AbstractCompany<MainCompany>
        implements MainCompany
{
    public ConcreteMainCompany(CompanyData<MainCompany> companyData) {
        super(companyData);
    }
}
