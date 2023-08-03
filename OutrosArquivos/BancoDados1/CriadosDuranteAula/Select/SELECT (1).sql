use SistemaAcademicoBCC

select * from tbDisciplina

select DIS_NOME, DIS_CARGA_HORARIA from tbDisciplina

select DIS_CARGA_HORARIA from tbDisciplina

select distinct DIS_CARGA_HORARIA from tbDisciplina

select all DIS_CARGA_HORARIA from tbDisciplina

select DIS_CARGA_HORARIA as CARGA_HORÁRIA from tbDisciplina

select DIS_CARGA_HORARIA CARGA_HORÁRIA from tbDisciplina

/*as:mudar nome da coluna|||OPICIONAL!*/

select DIS_CARGA_HORARIA 'CARGA HORÁRIA' from tbDisciplina

/*exercicio*/

select ALU_NOME NOME, ALU_MATRICULA MATRICULA, ALU_CIDADE CIDADE from tbAluno

select distinct ALU_CIDADE CIDADES from tbAluno

select distinct ALU_NOME 'NOME DO ALUNO' from tbAluno
	where ALU_CIDADE in('Ibiapina') OR 
	ALU_CIDADE LIKE 'Vi[cç]osa do Cear[aá]' or 
	ALU_CIDADE LIKE 'Tiangú[áa]' or
	ALU_CIDADE LIKE 'Vi[cç]osa'

select ALU_NOME NOMES from tbAluno
order by ALU_NOME


