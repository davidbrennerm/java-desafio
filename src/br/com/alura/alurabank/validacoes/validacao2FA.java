package br.com.alura.alurabank.validacoes;

public interface validacao2FA {
    default boolean getvalidaConta() {
        return true;
    }
}