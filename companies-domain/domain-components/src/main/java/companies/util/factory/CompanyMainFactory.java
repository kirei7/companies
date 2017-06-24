package companies.util.factory;

import companies.business.ConcreteMainCompany;
import companies.business.MainCompany;
import companies.entity.CompanyData;

public class CompanyMainFactory implements CompanyFactory<MainCompany, CompanyData> {
    @Override
    public MainCompany create(CompanyData data) {
        return new ConcreteMainCompany(data);
    }
}
