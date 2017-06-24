package companies.dao;

import companies.business.SubsidiaryCompany;
import companies.entity.SubsidiaryCompanyDataEntity;
import companies.repository.SubsidiaryCompanyEntityRepository;
import companies.util.factory.CompanySubsidiaryFactory;

public class SubsidiaryCompanyDao extends AbstractCompanyDao<SubsidiaryCompany, SubsidiaryCompanyDataEntity> {

    private SubsidiaryCompanyEntityRepository subsidiaryCompanyRepository;
    private CompanySubsidiaryFactory subsidiaryFactory;

    public SubsidiaryCompanyDao(
            SubsidiaryCompanyEntityRepository subsidiaryCompanyRepository,
            CompanySubsidiaryFactory subsidiaryFactory) {
        this.subsidiaryCompanyRepository = subsidiaryCompanyRepository;
        this.subsidiaryFactory = subsidiaryFactory;
    }

    @Override
    public SubsidiaryCompany findByName(String name) {
        return subsidiaryFactory.create(
                subsidiaryCompanyRepository.findByName(name)
        );
    }

    @Override
    public SubsidiaryCompany save(SubsidiaryCompany company) {
        return subsidiaryFactory.create(
                subsidiaryCompanyRepository.save(
                        fetchDataEntity(company)
                )
        );
    }

    @Override
    public void remove(SubsidiaryCompany company) {
        subsidiaryCompanyRepository.delete(
                fetchDataEntity(company)
        );
    }
}
