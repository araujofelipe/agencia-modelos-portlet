create table agenciamodelos_Modelo (
	modeloId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nome VARCHAR(75) null,
	idade INTEGER,
	altura DOUBLE,
	peso DOUBLE,
	etinia INTEGER
);