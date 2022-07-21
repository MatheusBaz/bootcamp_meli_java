package br.meli.perolaspraticaintegradora.service;

import br.meli.perolaspraticaintegradora.model.Joia;
import br.meli.perolaspraticaintegradora.repository.IJoiaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JoiaService {

    @Autowired
    private IJoiaRepo repo;

    public long add(Joia joia){
        Joia savedObject = repo.save(joia);
        if (savedObject != null) {
            return savedObject.getNumeroIdentificacao();
        }
        return -1;
    }

    public List<Joia> listAll(){
        return (List<Joia>) repo.findAll();
    }

    public void delete(Long num_ident) {
        repo.deleteById(num_ident);
    }

    public Joia update(Long num_ident) {
        Joia findedJoia = repo.findById(num_ident).get();
        findedJoia.setMaterial("prata");

        return repo.save(findedJoia);
    }

}
