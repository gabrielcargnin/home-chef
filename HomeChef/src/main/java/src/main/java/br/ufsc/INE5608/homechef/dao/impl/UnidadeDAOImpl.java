package src.main.java.br.ufsc.INE5608.homechef.dao.impl;

import org.jooq.DSLContext;
import src.main.java.br.ufsc.INE5608.homechef.dao.UnidadeDAO;
import src.main.java.br.ufsc.INE5608.homechef.model.Unidade;

import java.util.Collection;

import static br.ufsc.INE5608.homechef.Tables.EN_UNIDADE;

public class UnidadeDAOImpl implements UnidadeDAO {

    private DSLContext dslContext;

    public UnidadeDAOImpl(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    public Integer insert(Unidade unidade) {
        return dslContext
                .insertInto(EN_UNIDADE)
                .columns(
                        EN_UNIDADE.NOME_PLURAL,
                        EN_UNIDADE.NOME_SINGULAR,
                        EN_UNIDADE.UNIDADE
                ).values(
                        unidade.getNomePlural(),
                        unidade.getNomeSingular(),
                        unidade.getUnidade()
                ).returning(EN_UNIDADE.ID_UNIDADE)
                .fetchOne()
                .getValue(EN_UNIDADE.ID_UNIDADE);
    }

    public Collection<Unidade> list() {
        return dslContext
                .select(
                        EN_UNIDADE.ID_UNIDADE,
                        EN_UNIDADE.NOME_PLURAL,
                        EN_UNIDADE.NOME_SINGULAR,
                        EN_UNIDADE.UNIDADE
                )
                .from(EN_UNIDADE)
                .fetchInto(Unidade.class);
    }

    public Unidade findById(Integer idUnidade) {
        return dslContext
                .select(
                        EN_UNIDADE.ID_UNIDADE,
                        EN_UNIDADE.NOME_PLURAL,
                        EN_UNIDADE.NOME_SINGULAR,
                        EN_UNIDADE.UNIDADE
                )
                .from(EN_UNIDADE)
                .where(EN_UNIDADE.ID_UNIDADE.eq(idUnidade))
                .fetchOne()
                .into(Unidade.class);
    }

    public Unidade update(Unidade unidade) {
        return dslContext
                .update(EN_UNIDADE)
                .set(EN_UNIDADE.NOME_PLURAL, unidade.getNomePlural())
                .set(EN_UNIDADE.NOME_SINGULAR, unidade.getNomeSingular())
                .set(EN_UNIDADE.UNIDADE, unidade.getUnidade())
                .where(EN_UNIDADE.ID_UNIDADE.eq(unidade.getIdUnidade()))
                .returning()
                .fetchOne()
                .into(Unidade.class);
    }
}
