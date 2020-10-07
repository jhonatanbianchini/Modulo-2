select tb_produto4.nome, tb_produto4.preco, tb_categoria4.tipo from tb_produto4
inner join tb_categoria4 on tb_categoria4.id = tb_produto4.categoria_id
