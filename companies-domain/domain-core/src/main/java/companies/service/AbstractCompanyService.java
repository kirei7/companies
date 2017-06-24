package companies.service;

import companies.business.Company;
import companies.dao.CompanyDao;

import java.util.List;

public abstract class AbstractCompanyService<T extends Company> {

    protected CompanyDao<T> dao;

    public T findByName(String companyName) {
        return dao.findByName(companyName);
    }

    public T add(T company) {
        return dao.save(company);
    }

    public T edit(T company) {
        return dao.save(company);
    }

    public void delete(T company) {
        dao.remove(company);
    }

}
