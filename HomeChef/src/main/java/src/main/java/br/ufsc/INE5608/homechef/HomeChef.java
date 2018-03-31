/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.java.br.ufsc.INE5608.homechef;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import src.main.java.br.ufsc.INE5608.homechef.dao.UnidadeDAO;
import src.main.java.br.ufsc.INE5608.homechef.dao.impl.UnidadeDAOImpl;

import java.sql.DriverManager;
import java.sql.SQLException;

import static src.main.java.br.ufsc.INE5608.homechef.constants.Config.URL_CONEXAO;

/**
 * @author Gabriel
 */
public class HomeChef {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            DSLContext dslContext = DSL.using(DriverManager.getConnection(URL_CONEXAO), SQLDialect.POSTGRES);
            UnidadeDAO unidadeDAO = new UnidadeDAOImpl(dslContext);
            System.out.println(unidadeDAO.findById(2).toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
