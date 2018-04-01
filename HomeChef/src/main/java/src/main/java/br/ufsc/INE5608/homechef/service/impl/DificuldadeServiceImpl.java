package src.main.java.br.ufsc.INE5608.homechef.service.impl;

import src.main.java.br.ufsc.INE5608.homechef.dao.DificuldadeDAO;
import src.main.java.br.ufsc.INE5608.homechef.dao.impl.DificuldadeDAOImpl;
import src.main.java.br.ufsc.INE5608.homechef.model.Dificuldade;
import src.main.java.br.ufsc.INE5608.homechef.service.DificuldadeService;

import java.util.Collection;

public class DificuldadeServiceImpl implements DificuldadeService {

    private DificuldadeDAO dificuldadeDAO;

    public DificuldadeServiceImpl() {
        dificuldadeDAO = DificuldadeDAOImpl.getInstance();
    }

    @Override
    public Integer insert(Dificuldade dificuldade) {
        return dificuldadeDAO.insert(dificuldade);
    }

    @Override
    public Collection<Dificuldade> list() {
        return dificuldadeDAO.list();
    }

    @Override
    public Dificuldade findById(Integer idDificuldade) {
        return dificuldadeDAO.findById(idDificuldade);
    }

    @Override
    public Dificuldade update(Dificuldade dificuldade) {
        return dificuldadeDAO.update(dificuldade);
    }
}
