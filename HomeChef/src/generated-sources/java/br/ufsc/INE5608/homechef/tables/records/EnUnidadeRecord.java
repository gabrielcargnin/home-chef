/*
 * This file is generated by jOOQ.
*/
package br.ufsc.INE5608.homechef.tables.records;


import br.ufsc.INE5608.homechef.tables.EnUnidade;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class EnUnidadeRecord extends UpdatableRecordImpl<EnUnidadeRecord> implements Record4<Integer, String, String, String> {

    private static final long serialVersionUID = -1580787062;

    /**
     * Setter for <code>homechef.en_unidade.id_unidade</code>.
     */
    public void setIdUnidade(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>homechef.en_unidade.id_unidade</code>.
     */
    public Integer getIdUnidade() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>homechef.en_unidade.nome_plural</code>.
     */
    public void setNomePlural(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>homechef.en_unidade.nome_plural</code>.
     */
    public String getNomePlural() {
        return (String) get(1);
    }

    /**
     * Setter for <code>homechef.en_unidade.nome_singular</code>.
     */
    public void setNomeSingular(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>homechef.en_unidade.nome_singular</code>.
     */
    public String getNomeSingular() {
        return (String) get(2);
    }

    /**
     * Setter for <code>homechef.en_unidade.unidade</code>.
     */
    public void setUnidade(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>homechef.en_unidade.unidade</code>.
     */
    public String getUnidade() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return EnUnidade.EN_UNIDADE.ID_UNIDADE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return EnUnidade.EN_UNIDADE.NOME_PLURAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EnUnidade.EN_UNIDADE.NOME_SINGULAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EnUnidade.EN_UNIDADE.UNIDADE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getIdUnidade();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getNomePlural();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getNomeSingular();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUnidade();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnUnidadeRecord value1(Integer value) {
        setIdUnidade(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnUnidadeRecord value2(String value) {
        setNomePlural(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnUnidadeRecord value3(String value) {
        setNomeSingular(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnUnidadeRecord value4(String value) {
        setUnidade(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnUnidadeRecord values(Integer value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EnUnidadeRecord
     */
    public EnUnidadeRecord() {
        super(EnUnidade.EN_UNIDADE);
    }

    /**
     * Create a detached, initialised EnUnidadeRecord
     */
    public EnUnidadeRecord(Integer idUnidade, String nomePlural, String nomeSingular, String unidade) {
        super(EnUnidade.EN_UNIDADE);

        set(0, idUnidade);
        set(1, nomePlural);
        set(2, nomeSingular);
        set(3, unidade);
    }
}