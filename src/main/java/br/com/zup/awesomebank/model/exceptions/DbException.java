package br.com.zup.awesomebank.model.exceptions;

public class DbException extends RuntimeException{
    public DbException(String mensagem) {
        super(mensagem);
    }
}


