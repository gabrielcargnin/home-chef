package src.main.java.br.ufsc.INE5608.homechef.service.impl;

import src.main.java.br.ufsc.INE5608.homechef.dao.ItemEstoqueDAO;
import src.main.java.br.ufsc.INE5608.homechef.dao.impl.IngredienteDAOImpl;
import src.main.java.br.ufsc.INE5608.homechef.dao.impl.ItemEstoqueDAOImpl;
import src.main.java.br.ufsc.INE5608.homechef.dao.impl.UnidadeDAOImpl;
import src.main.java.br.ufsc.INE5608.homechef.model.ItemEstoque;
import src.main.java.br.ufsc.INE5608.homechef.service.ItemEstoqueService;

import java.util.Collection;

public class ItemEstoqueServiceImpl implements ItemEstoqueService {

    private final UnidadeDAOImpl unidadeDAO;
    private final IngredienteDAOImpl ingredienteDAO;
    private ItemEstoqueDAO itemEstoqueDAO;

    public ItemEstoqueServiceImpl() {
        itemEstoqueDAO = ItemEstoqueDAOImpl.getInstance();
        unidadeDAO = UnidadeDAOImpl.getInstance();
        ingredienteDAO = IngredienteDAOImpl.getInstance();
    }

    @Override
    public Integer insert(ItemEstoque unidade) {
        return itemEstoqueDAO.insert(unidade);
    }

    @Override
    public Collection<ItemEstoque> list() {

        Collection<ItemEstoque> itensEstoque = itemEstoqueDAO.list();
        itensEstoque.forEach(itemEstoque -> {
            itemEstoque.setIngrediente(ingredienteDAO.findById(itemEstoque.getIngrediente().getIdIngrediente()));
            itemEstoque.setUnidade(unidadeDAO.findById(itemEstoque.getUnidade().getIdUnidade()));
        });
        return itensEstoque;
    }

    @Override
    public ItemEstoque findById(Integer idItemEstoque) {
        return itemEstoqueDAO.findById(idItemEstoque);
    }

    @Override
    public ItemEstoque update(ItemEstoque unidade) {
        return itemEstoqueDAO.update(unidade);
    }
}
