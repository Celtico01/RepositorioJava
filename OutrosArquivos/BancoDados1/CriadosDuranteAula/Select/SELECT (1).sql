use SistemaAcademicoBCC

select * from tbDisciplina

select DIS_NOME, DIS_CARGA_HORARIA from tbDisciplina

select DIS_CARGA_HORARIA from tbDisciplina

select distinct DIS_CARGA_HORARIA from tbDisciplina

select all DIS_CARGA_HORARIA from tbDisciplina

select DIS_CARGA_HORARIA as CARGA_HOR�RIA from tbDisciplina

select DIS_CARGA_HORARIA CARGA_HOR�RIA from tbDisciplina

/*as:mudar nome da coluna|||OPICIONAL!*/

select DIS_CARGA_HORARIA 'CARGA HOR�RIA' from tbDisciplina

/*exercicio*/

select ALU_NOME NOME, ALU_MATRICULA MATRICULA, ALU_CIDADE CIDADE from tbAluno

select distinct ALU_CIDADE CIDADES from tbAluno

select distinct ALU_NOME 'NOME DO ALUNO' from tbAluno
	where ALU_CIDADE in('Ibiapina') OR 
	ALU_CIDADE LIKE 'Vi[c�]osa do Cear[a�]' or 
	ALU_CIDADE LIKE 'Tiang�[�a]' or
	ALU_CIDADE LIKE 'Vi[c�]osa'

select ALU_NOME NOMES from tbAluno
order by ALU_NOME


