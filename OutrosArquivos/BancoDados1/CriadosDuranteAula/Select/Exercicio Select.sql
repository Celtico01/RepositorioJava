use Empresa

 --? Quest�o 1

select * from Categorias

--? Quest�o 2

select Nome from Clientes
order by Nome

--? Quest�o 3

select Nome Nome from Funcionarios
where Pais like '[Bb]rasil' and Salario > 1500 and Cargo like '[Gg]erente%'

--? Quest�o 4

select * from Produtos 
where Preco between 10 and 100 and Descontinuado = 0 and Unidades is not null

--? Quest�o 5

select Empresa Fornecedor, Contato Telefone from Fornecedores
where Pais in('It�lia', 'Noruega', 'Alemanha', 'Reino Unido')
order by Empresa

--? Quest�o 6

select Pais, max(Salario) 'Maior Sal�rio', min(Salario) 'Menor Sal�rio', avg(Salario) 'Media dos Sal�rios' from Funcionarios
group by Pais

--? Quest�o 7

select Cargo, max(Salario) 'Maior Sal�rio' from Funcionarios
where Cargo like '[Gg]erente %' and Pais like '[Bb]rasil'
group by Cargo

--? Quest�o 8

select max(Salario) 'Maior Sal�rio' from Funcionarios
where Cidade like 'Tiangu[a�]' or
	  Cidade like 'Vi[c�]osa' or
	  Cidade like 'Vi[c�]osa do Cear[a�]' or 
	  Cidade like 'Ubajara' or
	  Cidade like 'Ibiapina'
group by Salario
order by Salario DESC

--? Quest�o 9

select Cidade, avg(Salario) 'M�dio dos Sal�rios' from Funcionarios
where Cargo like 'Coordenador%'
group by Cidade
order by avg(Salario)

--? Quest�o 10

select NumPed 'N�mero do Pedido', sum(Preco * Qtde -  Desconto) 'Valor total do pedido' from DetalhesPed
group by NumPed
order by NumPed

--? Quest�o 11

select CodCategoria, count(Unidades) QTDE from Produtos
group by CodCategoria
having count(Unidades) > 10
order by QTDE

--? Quest�o 12

select CodFor Fornecedor, count(Preco) QTDE from Produtos
where preco > 5 and preco < 10
group by CodFor
having count(Preco) > 1
order by QTDE

--? Quest�o 13

select Cargo, sum(Salario) Total from Funcionarios
where Cargo like 'Gerente%' or
	  Cargo like 'Coordenador%'
group by Cargo
order by Total

--? Quest�o 14

select Pais, avg(Salario) 'M�dia do Sal�rio' from Funcionarios
group by Pais
having count(Pais) > 5

--? Quest�o 15

select CodCategoria, count(*) QTDE, avg(Preco) 'M�dia dos Pre�os' from Produtos
where Descontinuado = 1
group by CodCategoria
having count(*) > 10
order by avg(Preco)

