package src.main.java.br.ufsc.INE5608.homechef.dao.impl;

import org.jooq.DSLContext;
import src.main.java.br.ufsc.INE5608.homechef.connection.Connection;
import src.main.java.br.ufsc.INE5608.homechef.dao.ItemEstoqueDAO;
import src.main.java.br.ufsc.INE5608.homechef.model.ItemEstoque;

import java.util.Collection;

import static br.ufsc.INE5608.homechef.Tables.EN_ITEM_ESTOQUE;

public class ItemEstoqueDAOImpl implements ItemEstoqueDAO {

    private static ItemEstoqueDAOImpl mInstance;
    private DSLContext dslContext;

    private ItemEstoqueDAOImpl() {
        dslContext = Connection.getInstance().getDslContext();
    }

    public static ItemEstoqueDAOImpl getInstance() {
        if (mInstance == null) {
            mInstance = new ItemEstoqueDAOImpl();
        }
        return mInstance;
    }

    public Integer insert(ItemEstoque itemEstoque) {
        return dslContext
                .insertInto(EN_ITEM_ESTOQUE)
                .columns(
                        EN_ITEM_ESTOQUE.ID_UNIDADE,
                        EN_ITEM_ESTOQUE.ID_INGREDIENTE,
                        EN_ITEM_ESTOQUE.QUANTIDADE,
                        EN_ITEM_ESTOQUE.VALIDADE
                ).values(
                        itemEstoque.getUnidade().getIdUnidade(),
                        itemEstoque.getIngrediente().getIdIngrediente(),
                        itemEstoque.getQuantidade(),
                        itemEstoque.getValidade()
                ).returning(EN_ITEM_ESTOQUE.ID_ITEM_ESTOQUE)
                .fetchOne()
                .getValue(EN_ITEM_ESTOQUE.ID_ITEM_ESTOQUE);
    }

    public Collection<ItemEstoque> list() {
        return dslContext
                .select(
                        EN_ITEM_ESTOQUE.ID_ITEM_ESTOQUE,
                        EN_ITEM_ESTOQUE.ID_UNIDADE,
                        EN_ITEM_ESTOQUE.ID_INGREDIENTE,
                        EN_ITEM_ESTOQUE.QUANTIDADE,
                        EN_ITEM_ESTOQUE.VALIDADE
                )
                .from(EN_ITEM_ESTOQUE)
                .fetchInto(ItemEstoque.class);
    }

    public ItemEstoque findById(Integer idItemEstoque) {
        return dslContext
                .select(
                        EN_ITEM_ESTOQUE.ID_ITEM_ESTOQUE,
                        EN_ITEM_ESTOQUE.ID_UNIDADE,
                        EN_ITEM_ESTOQUE.ID_INGREDIENTE,
                        EN_ITEM_ESTOQUE.QUANTIDADE,
                        EN_ITEM_ESTOQUE.VALIDADE
                )
                .from(EN_ITEM_ESTOQUE)
                .where(EN_ITEM_ESTOQUE.ID_ITEM_ESTOQUE.eq(idItemEstoque))
                .fetchOne()
                .into(ItemEstoque.class);
    }

    public ItemEstoque update(ItemEstoque itemEstoque) {
        return dslContext
                .update(EN_ITEM_ESTOQUE)
                .set(EN_ITEM_ESTOQUE.ID_INGREDIENTE, itemEstoque.getIngrediente().getIdIngrediente())
                .set(EN_ITEM_ESTOQUE.ID_UNIDADE, itemEstoque.getUnidade().getIdUnidade())
                .set(EN_ITEM_ESTOQUE.QUANTIDADE, itemEstoque.getQuantidade())
                .set(EN_ITEM_ESTOQUE.VALIDADE, itemEstoque.getValidade())
                .where(EN_ITEM_ESTOQUE.ID_ITEM_ESTOQUE.eq(itemEstoque.getIdItemEstoque()))
                .returning()
                .fetchOne()
                .into(ItemEstoque.class);
    }
}
