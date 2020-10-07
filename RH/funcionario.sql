Create table tb_funcionario(
id bigint(3) auto_increment,
nome varchar(20) not null,
idade int(2) not null,
sexo varchar(10) not null,
id_cargo bigint not null,
salario float(10,2)not null,
primary key(id),
foreign key (id_cargo) references tb_cargo(id)
)