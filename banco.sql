create database tcd;
use tcd;

create table Professor (
id int primary key,
cpf int,
cpf int primary key,
nome varchar(50),
nascimento varchar(10));

create table Discente (
id int primary key,
cpf int,
cpf int primary key,
nome varchar(50),
nascimento varchar(10));

create table Disciplina (
id int primary key,
nome varchar(20),
conteudo varchar(100));

create table Avaliacao (
id int primary key,
notaParteEscrita int,
notaParteOral char,
comentario varchar(100));

create table DisponibilidadeHorario (
id int primary key,
data varchar(10),
hora varchar(5));

create table Matricula (
id int primary key,
notaParteEscrita int,
notaParteOral char,
comentario varchar(100),
idDiscente int,
idDisciplina int,
foreign key (idDiscente) references Discente(id));
foreign key (idDisciplina) references Disciplina(id));
