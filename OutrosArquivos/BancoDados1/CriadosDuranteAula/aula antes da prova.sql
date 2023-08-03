use SistemaAcademicoBCC

select * from tbCoordenador

delete from tbCoordenador
where COO_NUMERO is null

delete from tbCoordenador
where COO_CODIGO between 8 and 10

delete from tbCoordenador
where COO_NOME like '% SILVA %' OR
	  COO_NOME like '% SILVA%'

delete from tbCoordenador
where COO_RUA like 'Av. %'

delete from tbCoordenador
where COO_UF not like '[A-Z][A-Z]'

delete from tbCoordenador
where COO_CIDADE like 'Vi[c�]osa' or
	  COO_CIDADE like 'Vi[c�]osa do Cear[a�]' or
	  COO_CIDADE like 'tiangu[a�]' or 
	  COO_CIDADE like 'ibiapina'


GO
INSERT INTO tbCoordenador
(COO_NOME, COO_CPF, COO_RUA, COO_NUMERO, COO_CIDADE, COO_UF)
VALUES
('Jo�o da Silva', '001.001.001-01', 'Rua A', 1, 'Vi�osa do Cear�', 'CE'),
('Pedro Jos�', '002.002.002-02', 'Rua A', 12, 'Vi�osa', 'CE'),
('Maria Joaquina', '003.003.003-03', 'Av. Central', 123, 'Tiangu�', 'C'),
('Carla Emanoela', '004.004.004', 'Av. Central', 125, 'Tiangu�', 'CE'),
('Carlos Eduardo', '005.005.005-05', 'Rua B', 28, 'Vicosa do Ceara', 'CE'),
('Francisco Jos�', '006.006.006-06', 'Rua B', NULL, 'Vi�osa do Ceara', 'CE'),
('Jo�o Jos�', '007.007.007-07', 'Rua B', 32, 'Vi�osa do Ceara', 'CE'),
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
	  
delete from tbCoordenador
where COO_RUA like 'rua %' and
	  COO_NUMERO is not null

delete from tbCoordenador
where COO_CODIGO > 25 and
	  (COO_CIDADE like 'VI[C�]OSA' or
	  COO_CIDADE like 'VI[C�]OSA DO CEAR[A�]')