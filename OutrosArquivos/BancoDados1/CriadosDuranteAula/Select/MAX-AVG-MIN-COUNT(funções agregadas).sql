/*avg, max, min, count, sum*/
use SistemaAcademicoBCC

select avg(CUR_CARGA_HORARIA) as Média
from tbCurso

select count(CUR_CARGA_HORARIA) as QTDE
from tbCurso

select count (*) as QTDE
from tbCurso

select * from tbCurso

select count(distinct CUR_NIVEL) as QTDE
from tbCurso

select count(ALU_CIDADE) as QTDE
from tbAluno
where ALU_CIDADE like 'Tiangu[aá]'

select * from tbAluno

select max(CUR_CARGA_HORARIA) as 'MAIOR CARGA HORÁRIO'
from tbCurso

select count(distinct ALU_CIDADE) as QTDE
from tbAluno

select sum(/*distinct*/ ALU_CODIGO) MATRICULA
from tbAluno
/* apenas a sintaxe*/

select sum(/*distinct*/ CUR_CARGA_HORARIA) SOMA
from tbCurso