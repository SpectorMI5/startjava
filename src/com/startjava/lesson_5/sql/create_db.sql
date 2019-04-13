CREATE DATABASE Jaegers;

CREATE TABLE Jaegers(
	id		SERIAL PRIMARY KEY,
	modelName 	TEXT,
	mark 		CHAR(6),
	height 		REAL,
	weight 		INTEGER,
	status 		TEXT,
	origin 		TEXT,
	launch 		DATE,
	kaijuKill 	INTEGER);