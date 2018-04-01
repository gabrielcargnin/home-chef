package src.main.java.br.ufsc.INE5608.homechef.service.impl;

import src.main.java.br.ufsc.INE5608.homechef.dao.DificuldadeDAO;
import src.main.java.br.ufsc.INE5608.homechef.dao.IngredienteDAO;
import src.main.java.br.ufsc.INE5608.homechef.dao.ReceitaDAO;
import src.main.java.br.ufsc.INE5608.homechef.dao.impl.DificuldadeDAOImpl;
import src.main.java.br.ufsc.INE5608.homechef.dao.impl.IngredienteDAOImpl;
import src.main.java.br.ufsc.INE5608.homechef.dao.impl.ReceitaDAOImpl;
import src.main.java.br.ufsc.INE5608.homechef.model.Receita;
import src.main.java.br.ufsc.INE5608.homechef.service.ReceitaService;

import java.util.Collection;

public class ReceitaServiceImpl implements ReceitaService {

    private IngredienteDAO ingredienteDAO;
    private ReceitaDAO receitaDAO;
    private DificuldadeDAO dificuldadeDAO;

    public ReceitaServiceImpl() {
        receitaDAO = ReceitaDAOImpl.getInstance();
        dificuldadeDAO = DificuldadeDAOImpl.getInstance();
        ingredienteDAO = IngredienteDAOImpl.getInstance();
    }

    @Override
    public Integer insert(Receita receita) {
        return receitaDAO.insert(receita);
    }

    @Override
    public Collection<Receita> list() {
        Collection<Receita> receitas = receitaDAO.list();
        receitas.forEach(receita -> {
            receita.setIngredientes(ingredienteDAO.listByIdReceita(receita.getIdReceita()));
            receita.setDificuldade(dificuldadeDAO.findById(receita.getDificuldade().getIdDificuldade()));
        });
        return receitas;
    }

    @Override
    public Receita findById(Integer idReceita) {
        Receita receita = receitaDAO.findById(idReceita);
        receita.setIngredientes(ingredienteDAO.listByIdReceita(receita.getIdReceita()));
        receita.setDificuldade(dificuldadeDAO.findById(receita.getDificuldade().getIdDificuldade()));
        return receita;
    }

    @Override
    public Receita update(Receita receita) {
        return receitaDAO.update(receita);
    }
}
