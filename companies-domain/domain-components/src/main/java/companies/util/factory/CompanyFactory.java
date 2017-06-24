package companies.util.factory;

import companies.business.Company;
import companies.entity.CompanyData;

public interface CompanyFactory<T extends Company, R extends CompanyData> {
    T create(R data);
}
