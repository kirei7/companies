package companies.business;

import companies.entity.CompanyData;

public class ConcreteMainCompany
        extends AbstractCompany<CompanyData>
        implements MainCompany
{
    public ConcreteMainCompany(CompanyData companyData) {
        super(companyData);
    }
}
