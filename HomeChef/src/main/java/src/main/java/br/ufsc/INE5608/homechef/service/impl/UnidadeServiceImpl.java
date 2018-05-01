package src.main.java.br.ufsc.INE5608.homechef.service.impl;

import src.main.java.br.ufsc.INE5608.homechef.dao.UnidadeDAO;
import src.main.java.br.ufsc.INE5608.homechef.dao.impl.UnidadeDAOImpl;
import src.main.java.br.ufsc.INE5608.homechef.model.Unidade;
import src.main.java.br.ufsc.INE5608.homechef.service.UnidadeService;

import java.util.Collection;

public class UnidadeServiceImpl implements UnidadeService {

    private UnidadeDAO unidadeDAO;

    public UnidadeServiceImpl() {
        unidadeDAO = UnidadeDAOImpl.getInstance();
    }

    @Override
    public Integer insert(Unidade unidade) {
        return unidadeDAO.insert(unidade);
    }

    @Override
    public Collection<Unidade> list() {
        return unidadeDAO.list();
    }

    @Override
    public Unidade findById(Integer idUnidade) {
        return unidadeDAO.findById(idUnidade);
    }

    @Override
    public Unidade update(Unidade unidade) {
        return unidadeDAO.update(unidade);
    }
}
