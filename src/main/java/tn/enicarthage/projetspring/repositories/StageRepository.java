package tn.enicarthage.projetspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tn.enicarthage.projetspring.entities.Stage;

@RepositoryRestResource
public interface StageRepository extends JpaRepository<Stage, Long>{

}