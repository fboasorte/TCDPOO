create database tcd;
use tcd;

create table Professor (
<<<<<<< HEAD
id int primary key,
cpf int,
=======
cpf int primary key,
>>>>>>> master
nome varchar(50),
nascimento date);

create table Discente (
<<<<<<< HEAD
id int primary key,
cpf int,
=======
cpf int primary key,
>>>>>>> master
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
<<<<<<< HEAD
foreign key (idDisciplina) references Disciplina(id));
=======
foreign key (idDisciplina) references Disciplina(id));
>>>>>>> master
