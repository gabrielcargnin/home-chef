package src.main.java.br.ufsc.INE5608.homechef.dao;

import src.main.java.br.ufsc.INE5608.homechef.model.Ingrediente;

import java.util.Collection;

public interface IngredienteDAO {

    Integer insert(Ingrediente ingrediente);

    Collection<Ingrediente> list();

    Collection<Ingrediente> listByIdReceita(Integer idReceita);

    Ingrediente findById(Integer idIngrediente);

    Ingrediente update(Ingrediente ingrediente);

    void delete(Integer idIngrediente);
}
