package src.main.java.br.ufsc.INE5608.homechef.exception;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class BusinessException extends Exception {

    public BusinessException(ArrayList<String> errors) {
        super(errors.stream().collect(Collectors.joining(" ")));
    }
}
