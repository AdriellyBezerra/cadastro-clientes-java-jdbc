package br.adryy0.cadastro;

public class App {
    public static void main(String[] args) {
        ClienteRepository repository = new ClienteRepository();

        repository.adicionar(new Cliente(1, "Ana Souza", "ana@email.com"));
        repository.adicionar(new Cliente(2, "João Silva", "joao@email.com"));

        System.out.println("Clientes cadastrados:");
        repository.listar().forEach(System.out::println);
    }
}
