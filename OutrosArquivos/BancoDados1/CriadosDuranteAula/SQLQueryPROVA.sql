create database AV2N1

use AV2N1

create table tbAluno(
	ALU_CODIGO int not null primary key identity,
	ALU_NOME varchar(50) not null unique,
	ALU_NOME_MAE varchar(50) not null
)

create table tbMatricula(
	MAT_CODIGO int not null primary key identity,
	MAT_NOTA decimal null,
	MAT_FALTAS int null,
	ALU_CODIGO int not null foreign key references tbAluno(ALU_CODIGO)
)

create table tbProfessor(
	PRO_CODIGO int not null primary key identity,
	PRO_NOME varchar(50) not null,
	PRO_TELEFONE int null
)

create table tbDisciplina(
	DIS_CODIGO int not null primary key identity,
	DIS_NOME varchar(20) not null,
	DIS_CARGA_HORARIA int not null,
	PRO_CODIGO int not null
)

alter table tbDisciplina
add DIS_SIGLA char(3) not null
alter table tbDisciplina
add DIS_AREA varchar(15) not null

alter table tbDisciplina
add constraint PK_tbDisciplina_tbProfessor foreign key (PRO_CODIGO) references tbProfessor(PRO_CODIGO)

alter table tbMatricula
alter column MAT_NOTA decimal(4,1) null

alter table tbProfessor
drop column PRO_TELEFONE