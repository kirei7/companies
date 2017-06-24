package companies.repository;

import companies.entity.MainCompanyDataEntity;
import org.springframework.data.repository.CrudRepository;

public interface MainCompanyEntityRepository extends CrudRepository<MainCompanyDataEntity, Long> {

    MainCompanyDataEntity findByName(String name);
}
