create database tcd;
use tcd;

create table professor (
id int primary key auto_increment NOT NULL,
cpf int,
nome varchar(50),
nascimento date);

create table discente (
id int primary key auto_increment NOT NULL,
cpf int,
nome varchar(50),
nascimento varchar(15));

create table disciplina (
id int primary key auto_increment NOT NULL,
nome varchar(20),
conteudo varchar(100));

create table avaliacao (
id int primary key auto_increment NOT NULL,
notaParteEscrita int,
notaParteOral char,
comentario varchar(100));

create table disponibilidadeHorario (
id int primary key auto_increment NOT NULL,
data date,
hora varchar(5));

create table matricula (
id int primary key auto_increment NOT NULL,
notaParteEscrita int,
notaParteOral char,
comentario varchar(100),
idDiscente int,
idDisciplina int,
foreign key (idDiscente) references discente(id),
foreign key (idDisciplina) references disciplina(id));