CREATE TABLE IF NOT EXISTS FILMES(
    id SERIAL,    
    titulo VARCHAR(100) NOT NULL,
    dataLancamento DATE NOT NULL,
    nota INTEGER NOT NULL,
    descricao VARCHAR (200) NOT NULL,
    quantidade INTEGER NOT NULL,
    PRIMARY KEY(id)
);