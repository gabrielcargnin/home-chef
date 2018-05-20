package src.main.java.br.ufsc.INE5608.homechef.dao.impl;

import org.jooq.DSLContext;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.NameTokenizers;
import org.modelmapper.jooq.RecordValueReader;
import src.main.java.br.ufsc.INE5608.homechef.connection.Connection;
import src.main.java.br.ufsc.INE5608.homechef.dao.IngredienteDAO;
import src.main.java.br.ufsc.INE5608.homechef.model.Ingrediente;

import java.math.BigDecimal;
import java.util.Collection;

import static br.ufsc.INE5608.homechef.Tables.*;

public class IngredienteDAOImpl implements IngredienteDAO {

    private static IngredienteDAOImpl mInstance;
    private DSLContext dslContext;

    private IngredienteDAOImpl() {
        dslContext = Connection.getInstance().getDslContext();
    }

    public static IngredienteDAOImpl getInstance() {
        if (mInstance == null) {
            mInstance = new IngredienteDAOImpl();
        }
        return mInstance;
    }

    public Integer insert(Ingrediente ingrediente) {
        return dslContext
                .insertInto(EN_INGREDIENTE)
                .columns(
                        EN_INGREDIENTE.NOME,
                        EN_INGREDIENTE.PRECO,
                        EN_INGREDIENTE.ID_UNIDADE,
                        EN_INGREDIENTE.ID_UNIDADE_PRECO,
                        EN_INGREDIENTE.QUANTIDADE_PRECO
                ).values(
                        ingrediente.getNome(),
                        BigDecimal.valueOf(ingrediente.getPreco()),
                        ingrediente.getUnidade().getIdUnidade(),
                        ingrediente.getUnidadePreco().getIdUnidade(),
                        ingrediente.getQuantidadePreco()
                ).returning(EN_INGREDIENTE.ID_INGREDIENTE)
                .fetchOne()
                .getValue(EN_INGREDIENTE.ID_INGREDIENTE);
    }

    public Collection<Ingrediente> list() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().addValueReader(new RecordValueReader());
        modelMapper.getConfiguration().setSourceNameTokenizer(NameTokenizers.UNDERSCORE);
        modelMapper.getConfiguration().setDestinationNameTokenizer(NameTokenizers.CAMEL_CASE);
        return dslContext.select()
                .from(EN_INGREDIENTE)
                .join(EN_UNIDADE).on(EN_UNIDADE.ID_UNIDADE.eq(EN_INGREDIENTE.ID_UNIDADE))
                .fetch()
                .map(record -> modelMapper.map(record, Ingrediente.class));
    }

    @Override
    public Collection<Ingrediente> listByIdReceita(Integer idReceita) {
        return dslContext
                .select(
                        EN_INGREDIENTE.ID_INGREDIENTE,
                        EN_INGREDIENTE.NOME,
                        EN_INGREDIENTE.PRECO,
                        EN_INGREDIENTE.ID_UNIDADE
                )
                .from(EN_RECEITA)
                .join(RE_INGREDIENTE_RECEITA).on(RE_INGREDIENTE_RECEITA.ID_RECEITA.eq(EN_RECEITA.ID_RECEITA))
                .join(EN_INGREDIENTE).on(EN_INGREDIENTE.ID_INGREDIENTE.eq(RE_INGREDIENTE_RECEITA.ID_INGREDIENTE))
                .fetchInto(Ingrediente.class);
    }

    public Ingrediente findById(Integer idIngrediente) {
        return dslContext
                .select(
                        EN_INGREDIENTE.ID_INGREDIENTE,
                        EN_INGREDIENTE.NOME,
                        EN_INGREDIENTE.PRECO,
                        EN_INGREDIENTE.ID_UNIDADE
                )
                .from(EN_INGREDIENTE)
                .where(EN_INGREDIENTE.ID_INGREDIENTE.eq(idIngrediente))
                .fetchOne()
                .into(Ingrediente.class);
    }

    public Ingrediente update(Ingrediente ingrediente) {
        return dslContext
                .update(EN_INGREDIENTE)
                .set(EN_INGREDIENTE.NOME, ingrediente.getNome())
                .set(EN_INGREDIENTE.PRECO, BigDecimal.valueOf(ingrediente.getPreco()))
                .set(EN_INGREDIENTE.ID_UNIDADE, ingrediente.getUnidade().getIdUnidade())
                .set(EN_INGREDIENTE.ID_UNIDADE_PRECO, ingrediente.getUnidadePreco().getIdUnidade())
                .set(EN_INGREDIENTE.QUANTIDADE_PRECO, ingrediente.getQuantidadePreco())
                .where(EN_INGREDIENTE.ID_INGREDIENTE.eq(ingrediente.getIdIngrediente()))
                .returning()
                .fetchOne()
                .into(Ingrediente.class);
    }

    @Override
    public void delete(Integer idIngrediente) {
        dslContext.deleteFrom(EN_INGREDIENTE).where(EN_INGREDIENTE.ID_INGREDIENTE.eq(idIngrediente)).execute();
    }
}
