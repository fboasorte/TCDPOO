create database tcd;
use tcd;

create table Professor (
id int primary key,
cpf int,
nome varchar(50),
nascimento date);

create table Discente (
id int primary key,
cpf int,
nome varchar(50),
nascimento date);

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
data date,
hora varchar(5));

create table Matricula (
id int primary key,
notaParteEscrita int,
notaParteOral char,
comentario varchar(100),
cpfDiscente int,
idDisciplina int,
foreign key (cpfDiscente) references Discente(cpf),
foreign key (idDisciplina) references Disciplina(id));