/*CREATE DATABASE BD1_AP1_N2
GO
USE BD1_AP1_N2
GO
CREATE TABLE tbCategoria
(
CAT_CODIGO INT NOT NULL PRIMARY KEY IDENTITY,
CAT_DESCRICAO VARCHAR(50) NOT NULL
)
GO
CREATE TABLE tbUnidade
(
UNI_CODIGO INT NOT NULL PRIMARY KEY IDENTITY,
UNI_DESCRICAO VARCHAR(50) NOT NULL
)
GO
CREATE TABLE tbMarca
(
MAR_CODIGO INT NOT NULL PRIMARY KEY IDENTITY,
MAR_NOME VARCHAR(50) NOT NULL
)
GO
CREATE TABLE tbProduto
(
PRO_CODIGO INT NOT NULL PRIMARY KEY IDENTITY,
PRO_DESCRICAO VARCHAR(50) NOT NULL,
PRO_PRECO_CUSTO DECIMAL(10,2) NOT NULL,
PRO_PRECO_VENDA DECIMAL(10,2) NOT NULL,
PRO_QTDE_ESTOQUE INT NOT NULL,
PRO_QTDE_MINIMA INT NOT NULL,
CAT_CODIGO INT NOT NULL FOREIGN KEY REFERENCES tbCategoria (CAT_CODIGO),
UNI_CODIGO INT NOT NULL FOREIGN KEY REFERENCES tbUnidade (UNI_CODIGO),
MAR_CODIGO INT NOT NULL FOREIGN KEY REFERENCES tbMarca (MAR_CODIGO),
PRO_RESUMO VARCHAR(50) NULL
)
*/

create database teste

use teste

create table tbAluno(
	ALU_NOME varchar(40) not null,
	ALU_CODIGO int not null primary key identity
)

insert into tbAluno
(ALU_NOME)
values
('Antônio Costa'),
('Francisco Antônio'),
('Antonio')

select * from tbAluno

DELETE FROM tbAluno WHERE ALU_NOME LIKE '%Ant_nio%'

USE BD1_AP1_N2

insert into tbCategoria
(CAT_DESCRICAO)
values
('Calçado')

insert into tbUnidade
(UNI_DESCRICAO)
values
('peça')

insert into tbMarca
(MAR_NOME)
values
('Arezo')

insert into tbProduto
(PRO_DESCRICAO, PRO_PRECO_CUSTO, PRO_PRECO_VENDA, PRO_QTDE_ESTOQUE, PRO_QTDE_MINIMA, CAT_CODIGO, UNI_CODIGO, MAR_CODIGO, PRO_RESUMO)
values
('Sapato', 51.25, 85.50, 5, 1, 1, 1, 1, null)

select * from tbCategoria
select * from tbMarca
select * from tbUnidade
select * from tbProduto

update tbProduto
set PRO_PRECO_VENDA = PRO_PRECO_CUSTO * 1.2
where
       PRO_QTDE_ESTOQUE > PRO_QTDE_MINIMA AND 
       PRO_PRECO_VENDA > PRO_PRECO_CUSTO


delete from tbProduto
where PRO_QTDE_ESTOQUE < PRO_QTDE_MINIMA and PRO_DESCRICAO like ('[A-Z][A-Z][A-Z][A-Z][A-Z][A-Z]')


delete from tbProduto
where
	PRO_DESCRICAO in ('sapato', 'calçado', 'chinelo') and PRO_CODIGO between 2 and 5 and PRO_RESUMO is null