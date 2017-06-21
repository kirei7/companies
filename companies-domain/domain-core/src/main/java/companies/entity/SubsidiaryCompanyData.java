package companies.entity;

import companies.Company;
import companies.SubsidiaryCompany;

public interface SubsidiaryCompanyData extends CompanyData<SubsidiaryCompany> {
    Company getParent();
    void setParent(Company parent);
}
