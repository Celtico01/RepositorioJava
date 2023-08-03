/* group by */ 

use SistemaAcademicoBCC

select count(*) QTDE
from tbAluno

select * from tbAluno

select count(*) QTDE, ALU_CIDADE 
from tbAluno
group by ALU_CIDADE

select CUR_CODIGO, count (*) QTDE
from tbDisciplina
group by CUR_CODIGO

/*exemplos*/

select * from tbCurso

select count(*) QTDE
from tbCurso

select avg(CUR_CARGA_HORARIA) 'MEDIA CARGA HORARIA'
from tbCurso

select * from tbAluno

select count(ALU_SEXO) 'Quantidade Alunos'
from tbAluno
where 
	ALU_SEXO = 'M' and
	ALU_CIDADE in ('tianguá', 'tiangua') /*pode ser like tbm...*/

select CUR_NIVEL, 
	   max(CUR_CARGA_HORARIA) 'MAIOR CARGA HORARIA', 
	   min(CUR_CARGA_HORARIA) 'MENOR CARGA HORARIO', 
	   avg(CUR_CARGA_HORARIA) 'MEDIA DAS CARGAS HORARIAS'
from tbCurso
group by CUR_NIVEL

select ALU_CIDADE, count(ALU_SEXO) 'QUANTIDADE DE MULHERES'
from tbAluno
where ALU_SEXO = 'F'
group by ALU_CIDADE
order by count(*) DESC

select * from tbDisciplina

select avg(DIS_CARGA_HORARIA) 'MEDIA CARGA HORARIA'
from tbDisciplina
where CUR_CODIGO is not null
