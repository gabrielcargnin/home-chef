package src.main.java.br.ufsc.INE5608.homechef.service;

import src.main.java.br.ufsc.INE5608.homechef.model.Dificuldade;

import java.util.Collection;

public interface DificuldadeService {

    Integer insert(Dificuldade dificuldade);

    Collection<Dificuldade> list();

    Dificuldade findById(Integer idDificuldade);

    Dificuldade update(Dificuldade dificuldade);
}
