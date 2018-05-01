package src.main.java.br.ufsc.INE5608.homechef.service;

import src.main.java.br.ufsc.INE5608.homechef.model.Ingrediente;

import java.util.Collection;

public interface IngredienteService {

    Integer insert(Ingrediente ingrediente);

    Collection<Ingrediente> list();

    Ingrediente findById(Integer idIngrediente);

    Ingrediente update(Ingrediente ingrediente);
}
