package src.main.java.br.ufsc.INE5608.homechef.dao;

import src.main.java.br.ufsc.INE5608.homechef.model.ItemEstoque;

import java.util.Collection;

public interface ItemEstoqueDAO {

    Integer insert(ItemEstoque itemEstoque);

    Collection<ItemEstoque> list();

    ItemEstoque findById(Integer idItemEstoque);

    ItemEstoque update(ItemEstoque itemEstoque);
}
