/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.java.br.ufsc.INE5608.homechef;

import src.main.java.br.ufsc.INE5608.homechef.controller.ControladorIngrediente;

/**
 * @author Gabriel
 */
public class HomeChef {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControladorIngrediente.getInstance().abreListaIngredientes();

    }
}
