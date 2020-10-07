select tb_produto3.nome, tb_produto3.preco, tb_categoria3.tipo from tb_produto3
inner join tb_categoria3 on tb_categoria3.id = tb_produto3.categoria_id