package companies.dao;

import companies.business.MainCompany;
import companies.entity.MainCompanyDataEntity;
import companies.repository.MainCompanyEntityRepository;
import companies.util.factory.CompanyMainFactory;

import java.util.ArrayList;
import java.util.List;

public class MainCompanyDao extends AbstractCompanyDao<MainCompany, MainCompanyDataEntity> {

    private MainCompanyEntityRepository mainCompanyRepository;
    private CompanyMainFactory mainFactory;

    public MainCompanyDao(MainCompanyEntityRepository mainCompanyRepository,
            CompanyMainFactory mainFactory) {
        this.mainCompanyRepository = mainCompanyRepository;
        this.mainFactory = mainFactory;
    }

    public List<MainCompany> getAllCompanies() {
        Iterable<MainCompanyDataEntity> data = mainCompanyRepository.findAll();
        List<MainCompany> companies = new ArrayList<>();
        data.forEach((entry) -> companies.add(mainFactory.create(entry)));
        return companies;
    }

    @Override
    public MainCompany findByName(String name) {
        return mainFactory.create(mainCompanyRepository.findByName(name));
    }

    @Override
    public MainCompany save(MainCompany company) {
        return mainFactory.create(mainCompanyRepository.save(
                fetchDataEntity(company)
        ));
    }

    @Override
    public void remove(MainCompany company) {
        mainCompanyRepository.delete(
                fetchDataEntity(company)
        );
    }
}
