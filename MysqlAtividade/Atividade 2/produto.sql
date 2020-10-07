Create table tb_produto(
id bigint (3) auto_increment,
nome varchar (20) not null,
cor varchar (10) not null,
preco float(10,2) not null,
id_categoria bigint(2) not null,
primary key(id),
foreign key (id_categoria) references tb_categoria(id)
)