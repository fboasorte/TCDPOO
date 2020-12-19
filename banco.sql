create database tcd;
use tcd;

create table professor (
id int primary key auto_increment NOT NULL,
cpf int,
nome varchar(50),
nascimento varchar(10));

create table discente (
id int primary key auto_increment NOT NULL,
cpf int,
nome varchar(50),
nascimento varchar(10));

create table aula (
id int primary key auto_increment NOT NULL,
nome varchar(20),
conteudo varchar(100),
idProfessor int,
data varchar(10),
hora varchar(5),
foreign key (idProfessor) references professor(id));

create table avaliacao (
id int primary key auto_increment NOT NULL,
notaParteEscrita int,
notaParteOral char,
comentario varchar(100),
idDiscente int,
idAula int,
foreign key (idDiscente) references discente(id),
foreign key (idAula) references aula(id));

create table matricula (
id int primary key auto_increment NOT NULL,
notaParteEscrita int,
notaParteOral char,
comentario varchar(100),
idDiscente int,
idAula int,
foreign key (idDiscente) references discente(id),
foreign key (idAula) references aula(id));
