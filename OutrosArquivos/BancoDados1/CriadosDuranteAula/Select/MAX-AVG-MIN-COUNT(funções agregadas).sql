/*avg, max, min, count, sum*/
use SistemaAcademicoBCC

select avg(CUR_CARGA_HORARIA) as M�dia
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
where ALU_CIDADE like 'Tiangu[a�]'

select * from tbAluno

select max(CUR_CARGA_HORARIA) as 'MAIOR CARGA HOR�RIO'
from tbCurso

select count(distinct ALU_CIDADE) as QTDE
from tbAluno

select sum(/*distinct*/ ALU_CODIGO) MATRICULA
from tbAluno
/* apenas a sintaxe*/

select sum(/*distinct*/ CUR_CARGA_HORARIA) SOMA
from tbCurso