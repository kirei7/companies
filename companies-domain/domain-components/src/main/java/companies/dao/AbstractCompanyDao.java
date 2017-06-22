package companies.dao;

import companies.business.Company;
import companies.business.MainCompany;
import companies.business.SubsidiaryCompany;
import companies.entity.CompanyData;
import companies.entity.MainCompanyDataEntity;

import java.util.List;

public abstract class AbstractCompanyDao<T extends Company, E extends CompanyData> implements CompanyDao<T> {
    @Override
    public List<SubsidiaryCompany> getChildCompanies(T company) {
        return fetchDataEntity(company).getChildCompanies();
    }

    protected E fetchDataEntity(T company) {
        return (E) company.getCompanyData();
    }
}
