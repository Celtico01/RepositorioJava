use SistemaAcademicoBCC

insert into tbCurso
(CUR_NOME, CUR_SIGLA, CUR_CARGA_HORARIA, CUR_NIVEL)
values
('Engenharia de Aquicultura', 'EAQ', 3200, 'Superior'),
('Licenciatura em Qu�mica', 'QUI', 3000, 'Superior'),
('Licenciatura em F�sica', 'FIS', 3200, 'Superior'),
('T�cnico em Agricultura', 'AGR', 1200, 'T�cnico')

insert into tbDisciplina
(DIS_NOME, DIS_CARGA_HORARIA, CUR_CODIGO)
values
('Portugu�s Aplicado', 40, 12),
('Inform�tica Aplicado', 80, 12),
('Qu�mica Org�nica', 120, 9),
('Qu�mica Inorg�nica', 80, 9),
('F�sica Qu�ntica', 80, 10)

insert into tbProfessor
(PRO_NOME, PRO_EMAIL, PRO_DATA_ADMISSAO)
values
('Raimundo Jos�', 'raimundojose@ifce.edu.br', '01/01/2010'),
('Maria Esmeralda', 'esmeralda@ifce.edu.br', '05/10/2012'),
('Pedro Emanuel', 'pedroe@ifce.edu.br', '10/02/2015'),
('Jos� Augusto', 'jaugusto@ifce.edu.br', '15/04/2017')

insert into tbAluno
(ALU_NOME, ALU_MATRICULA, ALU_CIDADE, ALU_SEXO, CUR_CODIGO)
values
('Augusto Nascimento', 2018101, 'Tiangu�', 'M', 10),
('Carla Albuquerque', 2018102, 'Vi�osa', 'F', 9),
('Maria Aparecida', 2018103, 'Tiangu�', 'F', 11),
('Marcos Aur�lio', 2018104, 'Ibiapina', 'M', 10),
('Paula Fernanda', 2018105, 'Tiangu�', 'F', 9)


insert into tbOfertaDisciplina
(DIS_CODIGO, PRO_CODIGO, ODI_ANO, ODI_SEMESTRE, ODI_TURNO, ODI_CAPACIDADE)
values
(42, 11, 2018, 1, 'Tarde', 30),
(43, 12, 2018, 1, 'Noite', 40),
(44, 13, 2018, 1, 'Tarde', 30),
(45, 13, 2018, 1, 'Tarde', 30),
(46, 14, 2018, 1, 'Noite', 40)

insert into tbAlunoMatricula
(ALU_CODIGO, ODI_CODIGO)
values
(46, 29),
(47, 30),
(48, 31),
(49, 32),
(50, 33)

