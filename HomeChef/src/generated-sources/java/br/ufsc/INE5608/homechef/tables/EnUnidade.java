/*
 * This file is generated by jOOQ.
*/
package br.ufsc.INE5608.homechef.tables;


import br.ufsc.INE5608.homechef.Homechef;
import br.ufsc.INE5608.homechef.Keys;
import br.ufsc.INE5608.homechef.tables.records.EnUnidadeRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EnUnidade extends TableImpl<EnUnidadeRecord> {

    private static final long serialVersionUID = 821118962;

    /**
     * The reference instance of <code>homechef.en_unidade</code>
     */
    public static final EnUnidade EN_UNIDADE = new EnUnidade();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EnUnidadeRecord> getRecordType() {
        return EnUnidadeRecord.class;
    }

    /**
     * The column <code>homechef.en_unidade.id_unidade</code>.
     */
    public final TableField<EnUnidadeRecord, Integer> ID_UNIDADE = createField("id_unidade", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('homechef.en_unidade_id_unidade_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>homechef.en_unidade.nome_plural</code>.
     */
    public final TableField<EnUnidadeRecord, String> NOME_PLURAL = createField("nome_plural", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>homechef.en_unidade.nome_singular</code>.
     */
    public final TableField<EnUnidadeRecord, String> NOME_SINGULAR = createField("nome_singular", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>homechef.en_unidade.unidade</code>.
     */
    public final TableField<EnUnidadeRecord, String> UNIDADE = createField("unidade", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>homechef.en_unidade</code> table reference
     */
    public EnUnidade() {
        this("en_unidade", null);
    }

    /**
     * Create an aliased <code>homechef.en_unidade</code> table reference
     */
    public EnUnidade(String alias) {
        this(alias, EN_UNIDADE);
    }

    private EnUnidade(String alias, Table<EnUnidadeRecord> aliased) {
        this(alias, aliased, null);
    }

    private EnUnidade(String alias, Table<EnUnidadeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Homechef.HOMECHEF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<EnUnidadeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_EN_UNIDADE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EnUnidadeRecord> getPrimaryKey() {
        return Keys.EN_UNIDADE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EnUnidadeRecord>> getKeys() {
        return Arrays.<UniqueKey<EnUnidadeRecord>>asList(Keys.EN_UNIDADE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnUnidade as(String alias) {
        return new EnUnidade(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EnUnidade rename(String name) {
        return new EnUnidade(name, null);
    }
}