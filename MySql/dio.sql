/* criar tabela */
CREATE TABLE pessoas (
   id INT NOT NULL PRIMARY KEY AUTOINCREMENT,
   nome VARCHAR(30) NOT NULL,
   nascimento DATE
)

/* inserir dados */
INSERT INTO pessoas (nome, nascimento) VALUES ("Matheus", "1997-08-23");
INSERT INTO pessoas (nome, nascimento) VALUES ("Pedro", "1995-07-17");
INSERT INTO pessoas (nome, nascimento) VALUES ("Marcela", "2000-04-05");
INSERT INTO pessoas (nome, nascimento) VALUES ("Flávio", "2002-12-01");

/* atualizar dados */
UPDATE pessoas SET nome="Matheus Fantinato" WHERE id=1;

/* deleta dados; Sempre verificar o dado antes de deletar */
DELETE FROM pessoas WHERE id=4;

/* ordenar de forma crescente(default) e decrescente */
SELECT * FROM pessoas ORDER BY nome
SELECT * FROM pessoas ORDER BY nome DESC

/* conta a quantidade de elementos de uma tabela */
SELECT COUNT(id) FROM pessoas

/* agrupa e conta dados de uma tabela */
SELECT COUNT(qtd), GENERO FROM pessoas GROUP BY genero;