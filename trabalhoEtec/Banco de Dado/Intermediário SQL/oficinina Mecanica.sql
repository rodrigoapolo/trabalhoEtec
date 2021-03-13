CREATE DATABASE bdOficinaMecanica

USE bdOficinaMecanica

CREATE TABLE tbMarca (
	idMarca INT PRIMARY KEY IDENTITY (1,1)
	, nomeMarca VARCHAR (15) NOT NULL
	)

CREATE TABLE tbModelo (
	idModelo INT PRIMARY KEY IDENTITY (1,1) NOT NULL
	, nomeModelo VARCHAR (60) NOT NULL
	,idMarca INT FOREIGN KEY REFERENCES tbMarca(idMarca)
	)

CREATE TABLE tbClinte (
	idClinte INT PRIMARY KEY IDENTITY (1,1)
	, nomeClinte VARCHAR (120) NOT NULL
	, rgClinte VARCHAR (15) NOT NULL
	)

CREATE TABLE tbFoneClinte (
	idFoneCliente INT PRIMARY KEY IDENTITY (1,1)
	, numFoneCliene VARCHAR (15) NOT NULL
	, idClinte INT FOREIGN KEY REFERENCES tbClinte(idClinte)
	)

CREATE TABLE tbCor(
	idCor INT PRIMARY KEY IDENTITY (1,1)
	, nomeCor VARCHAR (20) NOT NULL
	)

CREATE TABLE tbVeiculo (
	idVeiculo INT PRIMARY KEY IDENTITY (1,1)
	, placaVeiculo VARCHAR (8) NOT NULL
	, kmVeiculo VARCHAR (7) NOT NULL 
	, chassiVeiculo VARCHAR (17) NOT NULL
	, idCor INT FOREIGN KEY REFERENCES tbCor(idCor)
	, idClinte INT FOREIGN KEY REFERENCES tbClinte(idClinte)
	, idModelo INT FOREIGN KEY REFERENCES tbModelo (idModelo),
	)

CREATE TABLE tbOrcamento (
	idOrcamento INT PRIMARY KEY IDENTITY (1,1)
	, dataOrcamento SMALLDATETIME NOT NULL
	, dataValidade SMALLDATETIME NOT NULL
	, valorTotal INT NOT NULL
	, idVeiculo INT FOREIGN KEY REFERENCES tbVeiculo (idVeiculo)
	)

CREATE TABLE tbServico(
	idServico INT PRIMARY KEY IDENTITY (1,1)
	, descServico VARCHAR (30) NOT NULL
	, valorServico INT NOT NULL
	)

CREATE TABLE tbOrdemServico (
	idOrdemServico INT PRIMARY KEY IDENTITY (1,1)
	, dataIncio SMALLDATETIME NOT NULL
	, dataFinal SMALLDATETIME NOT NULL
	, idOrcamento INT FOREIGN KEY REFERENCES tbOrcamento (idOrcamento)
	)

CREATE TABLE tbIntmOrcamento (
	idIntemOrcamento INT PRIMARY KEY IDENTITY (1,1)
	, subTotal INT NOT NULL
	, idOrcamento INT FOREIGN KEY REFERENCES tbOrcamento (idOrcamento)
	, idServico INT FOREIGN KEY REFERENCES tbServico (idServico)
	)

	DROP TABLE tbOramento 