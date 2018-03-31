/*
 * This file is generated by jOOQ.
*/
package br.ufsc.INE5608.homechef.tables.records;


import br.ufsc.INE5608.homechef.tables.ReIngredienteReceita;

import java.math.BigDecimal;

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
public class ReIngredienteReceitaRecord extends UpdatableRecordImpl<ReIngredienteReceitaRecord> implements Record4<Integer, Integer, Integer, BigDecimal> {

    private static final long serialVersionUID = 1025733685;

    /**
     * Setter for <code>homechef.re_ingrediente_receita.id_ingrediente_receita</code>.
     */
    public void setIdIngredienteReceita(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>homechef.re_ingrediente_receita.id_ingrediente_receita</code>.
     */
    public Integer getIdIngredienteReceita() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>homechef.re_ingrediente_receita.id_ingrediente</code>.
     */
    public void setIdIngrediente(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>homechef.re_ingrediente_receita.id_ingrediente</code>.
     */
    public Integer getIdIngrediente() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>homechef.re_ingrediente_receita.id_receita</code>.
     */
    public void setIdReceita(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>homechef.re_ingrediente_receita.id_receita</code>.
     */
    public Integer getIdReceita() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>homechef.re_ingrediente_receita.quantidade</code>.
     */
    public void setQuantidade(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>homechef.re_ingrediente_receita.quantidade</code>.
     */
    public BigDecimal getQuantidade() {
        return (BigDecimal) get(3);
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
    public Row4<Integer, Integer, Integer, BigDecimal> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, BigDecimal> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ReIngredienteReceita.RE_INGREDIENTE_RECEITA.ID_INGREDIENTE_RECEITA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ReIngredienteReceita.RE_INGREDIENTE_RECEITA.ID_INGREDIENTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ReIngredienteReceita.RE_INGREDIENTE_RECEITA.ID_RECEITA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return ReIngredienteReceita.RE_INGREDIENTE_RECEITA.QUANTIDADE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getIdIngredienteReceita();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getIdIngrediente();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getIdReceita();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getQuantidade();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReIngredienteReceitaRecord value1(Integer value) {
        setIdIngredienteReceita(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReIngredienteReceitaRecord value2(Integer value) {
        setIdIngrediente(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReIngredienteReceitaRecord value3(Integer value) {
        setIdReceita(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReIngredienteReceitaRecord value4(BigDecimal value) {
        setQuantidade(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReIngredienteReceitaRecord values(Integer value1, Integer value2, Integer value3, BigDecimal value4) {
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
     * Create a detached ReIngredienteReceitaRecord
     */
    public ReIngredienteReceitaRecord() {
        super(ReIngredienteReceita.RE_INGREDIENTE_RECEITA);
    }

    /**
     * Create a detached, initialised ReIngredienteReceitaRecord
     */
    public ReIngredienteReceitaRecord(Integer idIngredienteReceita, Integer idIngrediente, Integer idReceita, BigDecimal quantidade) {
        super(ReIngredienteReceita.RE_INGREDIENTE_RECEITA);

        set(0, idIngredienteReceita);
        set(1, idIngrediente);
        set(2, idReceita);
        set(3, quantidade);
    }
}