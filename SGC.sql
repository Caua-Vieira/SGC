drop database if exists SGC;
create database if not exists SGC;
Use SGC;
set sql_safe_updates=0;

create table Membros(
id		int			primary key		auto_increment,
nome	varchar(50)	not null,
idade	int			not null,
tipo 	varchar(30)	not null,
funcao 	varchar(30)	not null,
unidade	varchar(30)	not null
);

create table Unidades(
id		int			primary key		auto_increment,
nome	varchar(30)	not null		unique,
qtd		int			not null
);

create table Mensalidades(
id				int			primary key		auto_increment,
valor			int			not null,
dataPagamento	date		not null,
membros_id		int	
);

create table Patrimonios(
id			int				primary key		auto_increment,
nome		varchar(50)		not null,
descricao 	varchar(100)
);

create table Especialidades(
id			int			primary key		auto_increment,
nome 		varchar(50)	not null,
tipo		varchar(50)	not null,
membros_id	int
);

create table ControleCaixa(
id				int							primary key		auto_increment,
total			decimal(10,2)				not null,
valor			decimal(10,2),
tipoOperacao	enum('Entrada', 'Saida')	not null
);

create table AutorizacoesESaidas(
id				int			primary key		auto_increment,
evento			varchar(50)	not null,
dataRegistro	date		not null,
membros_id		int
);

alter table Mensalidades 		add foreign key (membros_id) references Membros(id); 
alter table Especialidades 		add foreign key (membros_id) references Membros(id); 
alter table AutorizacoesESaidas add foreign key (membros_id) references Membros(id); 




