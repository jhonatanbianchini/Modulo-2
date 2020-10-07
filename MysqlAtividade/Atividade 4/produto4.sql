create table tb_produto4 (
	id bigint(3) auto_increment,
    nome varchar(20) not null,
    preco decimal(10,2) not null,
    quantidade integer(3),
    categoria_id bigint not null,
    primary key(id),
    foreign key(categoria_id) references tb_categoria4(id)
    
)