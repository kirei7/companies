package companies.business;

public interface SubsidiaryCompany extends Company<SubsidiaryCompany> {
    Company getParent();
}
