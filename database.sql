CREATE TABLE cliente (
    id INTEGER PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(150) NOT NULL UNIQUE
);

INSERT INTO cliente (id, nome, email) VALUES
(1, 'Ana Souza', 'ana@email.com'),
(2, 'João Silva', 'joao@email.com');

SELECT id, nome, email
FROM cliente
ORDER BY nome;
