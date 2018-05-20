package src.main.java.br.ufsc.INE5608.homechef.service.impl;

import src.main.java.br.ufsc.INE5608.homechef.dao.IngredienteDAO;
import src.main.java.br.ufsc.INE5608.homechef.dao.UnidadeDAO;
import src.main.java.br.ufsc.INE5608.homechef.dao.impl.IngredienteDAOImpl;
import src.main.java.br.ufsc.INE5608.homechef.dao.impl.UnidadeDAOImpl;
import src.main.java.br.ufsc.INE5608.homechef.model.Ingrediente;
import src.main.java.br.ufsc.INE5608.homechef.service.IngredienteService;

import java.util.Collection;

public class IngredienteServiceImpl implements IngredienteService {

    private IngredienteDAO ingredienteDAO;
    private UnidadeDAO unidadeDAO;

    public IngredienteServiceImpl() {
        ingredienteDAO = IngredienteDAOImpl.getInstance();
        unidadeDAO = UnidadeDAOImpl.getInstance();
    }

    @Override
    public Integer insert(Ingrediente ingrediente) {
        return ingredienteDAO.insert(ingrediente);
    }

    @Override
    public Collection<Ingrediente> list() {
        Collection<Ingrediente> ingredientes = ingredienteDAO.list();
        ingredientes.forEach(ingrediente -> ingrediente.setUnidade(unidadeDAO.findById(ingrediente.getUnidade().getIdUnidade())));
        ingredientes.forEach(ingrediente -> ingrediente.setUnidadePreco(unidadeDAO.findById(ingrediente.getUnidadePreco().getIdUnidade())));
        return ingredientes;
    }

    @Override
    public Ingrediente findById(Integer idIngrediente) {
        Ingrediente ingrediente = ingredienteDAO.findById(idIngrediente);
        ingrediente.setUnidade(unidadeDAO.findById(ingrediente.getUnidade().getIdUnidade()));
        return ingrediente;
    }

    @Override
    public Ingrediente update(Ingrediente ingrediente) {
        return ingredienteDAO.update(ingrediente);
    }

    @Override
    public void delete(Integer idIngrediente) {
        ingredienteDAO.delete(idIngrediente);
    }
}
