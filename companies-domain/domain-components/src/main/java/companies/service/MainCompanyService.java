package companies.service;

import companies.business.MainCompany;
import companies.dao.MainCompanyDao;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class MainCompanyService extends AbstractCompanyService<MainCompany> {
    public List<MainCompany> getMainCompanies() {
        return ((MainCompanyDao) dao).getAllCompanies();
    }
}
