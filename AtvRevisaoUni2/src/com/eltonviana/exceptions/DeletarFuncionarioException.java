package com.eltonviana.exceptions;

public class DeletarFuncionarioException extends Exception {

    public DeletarFuncionarioException(String message) {
        super("CustomException: " + message);
    }
}
