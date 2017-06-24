package companies.dao;

import companies.business.Company;
import companies.business.SubsidiaryCompany;

import java.util.List;

public interface CompanyDao<T extends Company> {
    List<SubsidiaryCompany> getChildCompanies(T company);
    T findByName(String name);
    T save(T company);
    void remove(T company);
}
