use Empresa

 --? Questão 1

select * from Categorias

--? Questão 2

select Nome from Clientes
order by Nome

--? Questão 3

select Nome Nome from Funcionarios
where Pais like '[Bb]rasil' and Salario > 1500 and Cargo like '[Gg]erente%'

--? Questão 4

select * from Produtos 
where Preco between 10 and 100 and Descontinuado = 0 and Unidades is not null

--? Questão 5

select Empresa Fornecedor, Contato Telefone from Fornecedores
where Pais in('Itália', 'Noruega', 'Alemanha', 'Reino Unido')
order by Empresa

--? Questão 6

select Pais, max(Salario) 'Maior Salário', min(Salario) 'Menor Salário', avg(Salario) 'Media dos Salários' from Funcionarios
group by Pais

--? Questão 7

select Cargo, max(Salario) 'Maior Salário' from Funcionarios
where Cargo like '[Gg]erente %' and Pais like '[Bb]rasil'
group by Cargo

--? Questão 8

select max(Salario) 'Maior Salário' from Funcionarios
where Cidade like 'Tiangu[aá]' or
	  Cidade like 'Vi[cç]osa' or
	  Cidade like 'Vi[cç]osa do Cear[aá]' or 
	  Cidade like 'Ubajara' or
	  Cidade like 'Ibiapina'
group by Salario
order by Salario DESC

--? Questão 9

select Cidade, avg(Salario) 'Médio dos Salários' from Funcionarios
where Cargo like 'Coordenador%'
group by Cidade
order by avg(Salario)

--? Questão 10

select NumPed 'Número do Pedido', sum(Preco * Qtde -  Desconto) 'Valor total do pedido' from DetalhesPed
group by NumPed
order by NumPed

--? Questão 11

select CodCategoria, count(Unidades) QTDE from Produtos
group by CodCategoria
having count(Unidades) > 10
order by QTDE

--? Questão 12

select CodFor Fornecedor, count(Preco) QTDE from Produtos
where preco > 5 and preco < 10
group by CodFor
having count(Preco) > 1
order by QTDE

--? Questão 13

select Cargo, sum(Salario) Total from Funcionarios
where Cargo like 'Gerente%' or
	  Cargo like 'Coordenador%'
group by Cargo
order by Total

--? Questão 14

select Pais, avg(Salario) 'Média do Salário' from Funcionarios
group by Pais
having count(Pais) > 5

--? Questão 15

select CodCategoria, count(*) QTDE, avg(Preco) 'Média dos Preços' from Produtos
where Descontinuado = 1
group by CodCategoria
having count(*) > 10
order by avg(Preco)

