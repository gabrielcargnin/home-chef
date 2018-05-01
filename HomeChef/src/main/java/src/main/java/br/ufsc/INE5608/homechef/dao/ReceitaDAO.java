package src.main.java.br.ufsc.INE5608.homechef.dao;

import src.main.java.br.ufsc.INE5608.homechef.model.Receita;

import java.util.Collection;

public interface ReceitaDAO {

    Integer insert(Receita receita);

    Collection<Receita> list();

    Receita findById(Integer idReceita);

    Receita update(Receita receita);
}
