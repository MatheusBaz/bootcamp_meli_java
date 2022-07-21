package br.meli.perolaspraticaintegradora.repository;

import br.meli.perolaspraticaintegradora.model.Joia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJoiaRepo extends CrudRepository<Joia,Long> {
}
