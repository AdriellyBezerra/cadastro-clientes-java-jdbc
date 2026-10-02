package br.adryy0.cadastro;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {
    private final List<Cliente> clientes = new ArrayList<>();

    public void adicionar(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> listar() {
        return List.copyOf(clientes);
    }

    public void remover(int id) {
        clientes.removeIf(cliente -> cliente.id() == id);
    }
}
