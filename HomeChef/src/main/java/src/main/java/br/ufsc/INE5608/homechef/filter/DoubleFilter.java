package src.main.java.br.ufsc.INE5608.homechef.filter;

public class DoubleFilter extends BaseFilter {

    @Override
    protected boolean test(String text) {
        return text.matches("[0-9]+[.]?([0-9]+)?") || text.equals("");
    }
}