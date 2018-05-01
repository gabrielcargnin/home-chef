/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.java.br.ufsc.INE5608.homechef;

import src.main.java.br.ufsc.INE5608.homechef.model.Ingrediente;
import src.main.java.br.ufsc.INE5608.homechef.model.ListarIngredientesTableModel;
import src.main.java.br.ufsc.INE5608.homechef.service.IngredienteService;
import src.main.java.br.ufsc.INE5608.homechef.service.impl.IngredienteServiceImpl;
import src.main.java.br.ufsc.INE5608.homechef.view.ListarIngredientes;

import java.util.Collection;

/**
 * @author Gabriel
 */
public class HomeChef {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IngredienteService ingredienteService = new IngredienteServiceImpl();
        Collection<Ingrediente> ingredientes = ingredienteService.list();
        ListarIngredientes listarIngredientes = new ListarIngredientes();
        ListarIngredientesTableModel listarIngredientesTableModel = new ListarIngredientesTableModel(ingredientes);
    }
}
