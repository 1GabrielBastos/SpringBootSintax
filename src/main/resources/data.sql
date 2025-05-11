create table tb_produto(-- Cria a tabela chamada 'tb_produto'
id varchar(255) not null primary key, -- Coluna 'id' (chave primária), tipo texto (até 255 caracteres), obrigatória
nome varchar(50) not null,-- Coluna 'nome' (nome do produto), texto com até 50 caracteres, obrigatória
desc varchar(300),-- Coluna 'desc' (descrição do produto), texto até 300 caracteres, opcional
preco numeric(18, 2)-- Coluna 'preco' (preço do produto), número com até 18 dígitos, 2 casas decimais
);
