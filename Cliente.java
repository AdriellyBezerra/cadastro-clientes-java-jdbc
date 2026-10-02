package br.adryy0.cadastro;

public record Cliente(int id, String nome, String email) {
    public Cliente {
        if (nome == null || nome.isBlank()) throw new IllegalArgumentException("Nome obrigatório");
        if (email == null || !email.contains("@")) throw new IllegalArgumentException("E-mail inválido");
    }
}
