package src.main.java.br.ufsc.INE5608.homechef.dao.impl;

import org.jooq.DSLContext;
import src.main.java.br.ufsc.INE5608.homechef.connection.Connection;
import src.main.java.br.ufsc.INE5608.homechef.dao.DificuldadeDAO;
import src.main.java.br.ufsc.INE5608.homechef.model.Dificuldade;

import java.util.Collection;

import static br.ufsc.INE5608.homechef.Tables.EN_DIFICULDADE;

public class DificuldadeDAOImpl implements DificuldadeDAO {

    private static DificuldadeDAOImpl mInstance;
    private DSLContext dslContext;

    private DificuldadeDAOImpl() {
        dslContext = Connection.getInstance().getDslContext();
    }

    public static DificuldadeDAOImpl getInstance() {
        if (mInstance == null) {
            mInstance = new DificuldadeDAOImpl();
        }
        return mInstance;
    }


    public Integer insert(Dificuldade dificuldade) {
        return dslContext
                .insertInto(EN_DIFICULDADE)
                .columns(
                        EN_DIFICULDADE.NOME
                ).values(
                        dificuldade.getNome()
                ).returning(EN_DIFICULDADE.ID_DIFICULDADE)
                .fetchOne()
                .getValue(EN_DIFICULDADE.ID_DIFICULDADE);
    }

    public Collection<Dificuldade> list() {
        return dslContext
                .select(
                        EN_DIFICULDADE.ID_DIFICULDADE,
                        EN_DIFICULDADE.NOME
                )
                .from(EN_DIFICULDADE)
                .fetchInto(Dificuldade.class);
    }

    public Dificuldade findById(Integer idDificuldade) {
        return dslContext
                .select(
                        EN_DIFICULDADE.ID_DIFICULDADE,
                        EN_DIFICULDADE.NOME
                )
                .from(EN_DIFICULDADE)
                .where(EN_DIFICULDADE.ID_DIFICULDADE.eq(idDificuldade))
                .fetchOne()
                .into(Dificuldade.class);
    }

    public Dificuldade update(Dificuldade dificuldade) {
        return dslContext
                .update(EN_DIFICULDADE)
                .set(EN_DIFICULDADE.NOME, dificuldade.getNome())
                .where(EN_DIFICULDADE.ID_DIFICULDADE.eq(dificuldade.getIdDificuldade()))
                .returning()
                .fetchOne()
                .into(Dificuldade.class);
    }
}
