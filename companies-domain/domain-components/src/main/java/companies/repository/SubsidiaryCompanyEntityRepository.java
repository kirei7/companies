package companies.repository;

import companies.entity.SubsidiaryCompanyDataEntity;
import org.springframework.data.repository.CrudRepository;

public interface SubsidiaryCompanyEntityRepository
        extends CrudRepository<SubsidiaryCompanyDataEntity, Long> {

    SubsidiaryCompanyDataEntity findByName(String name);
}
