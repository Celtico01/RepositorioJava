use SistemaAcademicoBCC

update tbDisciplina
set DIS_NOME = 'Banco de Dados Não Relacional'/* separa por virgula se quiser alterar mais de 1 uma coluna*/
where
DIS_NOME = 'Banco de Dados NoSQL'

select * from tbDisciplina


delete from tbCoordenador
where
COO_NOME like '% Silva %' or COO_NOME like '% Silva'

delete from tbCoordenador
where
COO_UF not like '[A-Z][A-Z]'

select * from tbCoordenador 

delete from tbCoordenador

INSERT INTO tbCoordenador
(COO_NOME, COO_CPF, COO_RUA, COO_NUMERO, COO_CIDADE, COO_UF)
VALUES
('João da Silva', '001.001.001-01', 'Rua A', 1, 'Viçosa do Ceará', 'CE'),
('Pedro José', '002.002.002-02', 'Rua A', 12, 'Viçosa', 'CE'),
('Maria Joaquina', '003.003.003-03', 'Av. Central', 123, 'Tianguá', 'C'),
('Carla Emanoela', '004.004.004', 'Av. Central', 125, 'Tianguá', 'CE'),
('Carlos Eduardo', '005.005.005-05', 'Rua B', 28, 'Vicosa do Ceara', 'CE'),
('Francisco José', '006.006.006-06', 'Rua B', NULL, 'Viçosa do Ceara', 'CE'),
('João José', '007.007.007-07', 'Rua B', 32, 'Viçosa do Ceara', 'CE'),
('Pedro Pereira', '008.008.008-08', 'Rua Lateral', NULL, 'Ubajara', 'CE'),
('Carol Silva', '009.009.009-09', 'Rua X', 12, 'Ubajara', 'CE'),
('Maria Joaquina', '010.010.010-10', 'Rua ABC', 135, 'Ibiapina', 'CE')

GO
ALTER TABLE tbCoordenador 
ADD COO_TEMPO_SERVICO INT NULL
GO
ALTER TABLE tbCoordenador
ADD COO_OBSERVACAO VARCHAR(50)
GO
UPDATE tbCoordenador SET COO_TEMPO_SERVICO = 1
GO



SELECT * FROM tbCoordenador

update tbCoordenador
set COO_UF = 'CE'
where 
	COO_UF not like '[A-Z][A-Z]'

update tbCoordenador
set COO_NUMERO = 0
where 
	COO_NUMERO is null


update tbCoordenador 
set COO_CIDADE = 'Viçosa do Ceará'
where
	COO_CIDADE like 'Vi[çc]osa do Cear[aá]' or 
	COO_CIDADE like 'Vi[cç]osa%'