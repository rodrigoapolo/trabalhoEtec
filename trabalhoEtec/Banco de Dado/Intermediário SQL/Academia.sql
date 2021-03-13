CREATE DATABASE bdAcademia

USE bdAcademia

CREATE TABLE tbProfessor (
	codProfessor INT PRIMARY KEY IDENTITY (1,1)
	, nomeProfessor VARCHAR (120) NOT NULL
	)

CREATE TABLE tbFoneProfessor (
	codFoneProfessor INT PRIMARY KEY IDENTITY (1,1)
	, numFoneProfessor VARCHAR (9) NOT NULL
	, codProfessor INT FOREIGN KEY REFERENCES tbProfessor(codProfessor)
	)

CREATE TABLE tbHorario (
	codHorario INT PRIMARY KEY IDENTITY (1,1)
	, descHorario SMALLDATETIME NOT NULL
	)

CREATE TABLE tbModalidade (
	codModalidade INT PRIMARY KEY IDENTITY (1,1)
	, nomeModalidade VARCHAR (120) NOT NULL
	, codProfessor INT FOREIGN KEY REFERENCES tbProfessor (codProfessor)
	, codHoraio INT FOREIGN KEY REFERENCES tbHorario (codHorario)
	)

CREATE TABLE tbTipoPlano (
	codTipoPlano INT PRIMARY KEY IDENTITY (1,1)
	, descTipoPlano VARCHAR (30) NOT NULL
	)

CREATE TABLE tbAluno (
	codAluno INT PRIMARY KEY IDENTITY (1,1)
	, nomeAluno VARCHAR (120)NOT NULL
	, rgAluno VARCHAR (15) NOT NULL
	, cpfAluno VARCHAR (10) UNIQUE
	)

CREATE TABLE tbFoneAluno (
	codFoneAluno INT PRIMARY KEY IDENTITY (1,1)
	, numFoneAluno VARCHAR (120) NOT NULL
	, codAluno INT FOREIGN KEY REFERENCES tbAluno (codAluno)
	)

CREATE TABLE tbMatricula (
	codMatricula INT PRIMARY KEY IDENTITY (1,1)
	, dataMatricula SMALLDATETIME NOT NULL
	, codAluno INT FOREIGN KEY REFERENCES tbAluno (codAluno)
	, codTipoPlano INT FOREIGN KEY REFERENCES tbTipoPlano (codTipoPlano)
	, codModalidade INT FOREIGN KEY REFERENCES tbModalidade (codModalidade)
	)