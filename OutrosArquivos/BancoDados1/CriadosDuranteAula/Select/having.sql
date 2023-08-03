/* having */

use SistemaAcademicoBCC

--? seleciona os cursos com quantidade inferior a 2 disciplinas
select CUR_CODIGO, count(*) QTDE
from tbDisciplina
group by CUR_CODIGO
having count(*) < 2

select * from tbDisciplina

select ALU_CIDADE, count(*) 'QTDE DE ALUNOS'
from tbAluno
group by ALU_CIDADE
having count(*) > 10

select sum(DIS_CARGA_HORARIA) SOMA, count(*) QTDE, CUR_CODIGO
from tbDisciplina
group by CUR_CODIGO
having count(*) > 2