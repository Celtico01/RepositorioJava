use SistemaAcademicoBCC

insert into tbCurso
(CUR_NOME, CUR_SIGLA, CUR_CARGA_HORARIA, CUR_NIVEL)
values
('Informática para Internet', 'IFINT', 1000, 'Técnico')

insert into tbCurso
(CUR_NOME, CUR_CARGA_HORARIA, CUR_NIVEL)
values
('Aquicultura', 1200, 'Técnico')

/*ou
insert into tbCurso
(CUR_NOME, CUR_SIGLA, CUR_CARGA_HORARIA, CUR_NIVEL)
values
('Aquicultura', NULL, 1200, 'Técnico')*/

insert into tbDisciplina
(DIS_NOME, DIS_CARGA_HORARIA, CUR_CODIGO)
values
('Desenvolvimento Web', 80, 6)