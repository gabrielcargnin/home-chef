package src.main.java.br.ufsc.INE5608.homechef.dao;

import src.main.java.br.ufsc.INE5608.homechef.model.Unidade;

import java.util.Collection;

public interface UnidadeDAO {

    Integer insert(Unidade unidade);

    Collection<Unidade> list();

    Unidade findById(Integer idUnidade);

    Unidade update(Unidade unidade);
}
