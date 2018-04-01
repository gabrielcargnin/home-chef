package src.main.java.br.ufsc.INE5608.homechef.connection;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.DriverManager;
import java.sql.SQLException;

import static src.main.java.br.ufsc.INE5608.homechef.constants.Config.URL_CONEXAO;

public class Connection {

    private static Connection mInstance;
    private DSLContext dslContext = null;

    private Connection() {
        try {
            dslContext = DSL.using(DriverManager.getConnection(URL_CONEXAO), SQLDialect.POSTGRES);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getInstance() {
        if (mInstance == null) {
            mInstance = new Connection();
        }
        return mInstance;
    }

    public DSLContext getDslContext() {
        return dslContext;
    }
}
