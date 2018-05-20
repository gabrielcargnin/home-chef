package src.main.java.br.ufsc.INE5608.homechef.service;

import src.main.java.br.ufsc.INE5608.homechef.model.Unidade;

import java.util.Collection;

public interface UnidadeService {

    Integer insert(Unidade unidade);

    Collection<Unidade> list();

    Unidade findById(Integer idUnidade);

    Unidade findByName(String nomeUnidade);

    Unidade update(Unidade unidade);
}
