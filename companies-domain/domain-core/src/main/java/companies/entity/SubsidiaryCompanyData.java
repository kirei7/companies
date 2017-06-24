package companies.entity;

import companies.business.Company;

public interface SubsidiaryCompanyData extends CompanyData {
    Company getParent();
    void setParent(Company parent);
}
