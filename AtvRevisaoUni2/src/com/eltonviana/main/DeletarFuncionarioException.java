package com.eltonviana.main;

public class DeletarFuncionarioException extends Exception {

    public DeletarFuncionarioException(String message) {
        super("CustomException: " + message);
    }
}
