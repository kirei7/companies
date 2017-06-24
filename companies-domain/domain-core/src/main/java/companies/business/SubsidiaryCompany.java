package companies.business;

import companies.entity.SubsidiaryCompanyData;

public interface SubsidiaryCompany extends Company<SubsidiaryCompanyData> {
    Company getParent();
}
