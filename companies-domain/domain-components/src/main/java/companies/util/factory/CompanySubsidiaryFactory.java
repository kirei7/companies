package companies.util.factory;

import companies.business.ConcreteSubsidiaryCompany;
import companies.business.SubsidiaryCompany;
import companies.entity.SubsidiaryCompanyData;

public class CompanySubsidiaryFactory implements CompanyFactory<SubsidiaryCompany, SubsidiaryCompanyData> {
    @Override
    public SubsidiaryCompany create(SubsidiaryCompanyData data) {
        return new ConcreteSubsidiaryCompany(data);
    }
}
