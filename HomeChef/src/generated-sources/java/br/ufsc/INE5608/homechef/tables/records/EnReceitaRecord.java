/*
 * This file is generated by jOOQ.
*/
package br.ufsc.INE5608.homechef.tables.records;


import br.ufsc.INE5608.homechef.tables.EnReceita;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class EnReceitaRecord extends UpdatableRecordImpl<EnReceitaRecord> implements Record5<Integer, Integer, String, String, Integer> {

    private static final long serialVersionUID = -529177419;

    /**
     * Setter for <code>homechef.en_receita.id_receita</code>.
     */
    public void setIdReceita(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>homechef.en_receita.id_receita</code>.
     */
    public Integer getIdReceita() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>homechef.en_receita.id_dificuldade</code>.
     */
    public void setIdDificuldade(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>homechef.en_receita.id_dificuldade</code>.
     */
    public Integer getIdDificuldade() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>homechef.en_receita.modo_preparo</code>.
     */
    public void setModoPreparo(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>homechef.en_receita.modo_preparo</code>.
     */
    public String getModoPreparo() {
        return (String) get(2);
    }

    /**
     * Setter for <code>homechef.en_receita.nome</code>.
     */
    public void setNome(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>homechef.en_receita.nome</code>.
     */
    public String getNome() {
        return (String) get(3);
    }

    /**
     * Setter for <code>homechef.en_receita.tempo</code>.
     */
    public void setTempo(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>homechef.en_receita.tempo</code>.
     */
    public Integer getTempo() {
        return (Integer) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, String, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, String, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return EnReceita.EN_RECEITA.ID_RECEITA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return EnReceita.EN_RECEITA.ID_DIFICULDADE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EnReceita.EN_RECEITA.MODO_PREPARO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EnReceita.EN_RECEITA.NOME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return EnReceita.EN_RECEITA.TEMPO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getIdReceita();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getIdDificuldade();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getModoPreparo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getNome();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getTempo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnReceitaRecord value1(Integer value) {
        setIdReceita(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnReceitaRecord value2(Integer value) {
        setIdDificuldade(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnReceitaRecord value3(String value) {
        setModoPreparo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnReceitaRecord value4(String value) {
        setNome(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnReceitaRecord value5(Integer value) {
        setTempo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnReceitaRecord values(Integer value1, Integer value2, String value3, String value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EnReceitaRecord
     */
    public EnReceitaRecord() {
        super(EnReceita.EN_RECEITA);
    }

    /**
     * Create a detached, initialised EnReceitaRecord
     */
    public EnReceitaRecord(Integer idReceita, Integer idDificuldade, String modoPreparo, String nome, Integer tempo) {
        super(EnReceita.EN_RECEITA);

        set(0, idReceita);
        set(1, idDificuldade);
        set(2, modoPreparo);
        set(3, nome);
        set(4, tempo);
    }
}
