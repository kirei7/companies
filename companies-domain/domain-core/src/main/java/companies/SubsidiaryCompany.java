package companies;

public interface SubsidiaryCompany extends Company<SubsidiaryCompany> {
    Company getParent();
}
