package src.main.java.br.ufsc.INE5608.homechef.service;

import src.main.java.br.ufsc.INE5608.homechef.model.Receita;

import java.util.Collection;

public interface ReceitaService {

    Integer insert(Receita receita);

    Collection<Receita> list();

    Receita findById(Integer idReceita);

    Receita update(Receita receita);
}
