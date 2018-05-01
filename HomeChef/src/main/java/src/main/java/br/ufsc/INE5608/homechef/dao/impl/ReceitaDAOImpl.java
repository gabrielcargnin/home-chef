package src.main.java.br.ufsc.INE5608.homechef.dao.impl;

import org.jooq.DSLContext;
import src.main.java.br.ufsc.INE5608.homechef.connection.Connection;
import src.main.java.br.ufsc.INE5608.homechef.dao.ReceitaDAO;
import src.main.java.br.ufsc.INE5608.homechef.model.Receita;

import java.util.Collection;

import static br.ufsc.INE5608.homechef.Tables.EN_RECEITA;

public class ReceitaDAOImpl implements ReceitaDAO {

    private static ReceitaDAOImpl mInstance;
    private DSLContext dslContext;

    private ReceitaDAOImpl() {
        dslContext = Connection.getInstance().getDslContext();
    }

    public static ReceitaDAOImpl getInstance() {
        if (mInstance == null) {
            mInstance = new ReceitaDAOImpl();
        }
        return mInstance;
    }

    public Integer insert(Receita receita) {
        return dslContext
                .insertInto(EN_RECEITA)
                .columns(
                        EN_RECEITA.NOME,
                        EN_RECEITA.MODO_PREPARO,
                        EN_RECEITA.TEMPO,
                        EN_RECEITA.ID_DIFICULDADE
                ).values(
                        receita.getNome(),
                        receita.getModoPreparo(),
                        receita.getTempo(),
                        receita.getDificuldade().getIdDificuldade()
                ).returning(EN_RECEITA.ID_RECEITA)
                .fetchOne()
                .getValue(EN_RECEITA.ID_RECEITA);
    }

    public Collection<Receita> list() {
        return dslContext
                .select(
                        EN_RECEITA.NOME,
                        EN_RECEITA.MODO_PREPARO,
                        EN_RECEITA.TEMPO,
                        EN_RECEITA.ID_DIFICULDADE
                )
                .from(EN_RECEITA)
                .fetchInto(Receita.class);
    }

    public Receita findById(Integer idReceita) {
        return dslContext
                .select(
                        EN_RECEITA.NOME,
                        EN_RECEITA.MODO_PREPARO,
                        EN_RECEITA.TEMPO,
                        EN_RECEITA.ID_DIFICULDADE
                )
                .from(EN_RECEITA)
                .where(EN_RECEITA.ID_RECEITA.eq(idReceita))
                .fetchOne()
                .into(Receita.class);
    }

    public Receita update(Receita receita) {
        return dslContext
                .update(EN_RECEITA)
                .set(EN_RECEITA.NOME, receita.getNome())
                .set(EN_RECEITA.TEMPO, receita.getTempo())
                .set(EN_RECEITA.MODO_PREPARO, receita.getModoPreparo())
                .set(EN_RECEITA.ID_DIFICULDADE, receita.getDificuldade().getIdDificuldade())
                .where(EN_RECEITA.ID_RECEITA.eq(receita.getIdReceita()))
                .returning()
                .fetchOne()
                .into(Receita.class);
    }
}
