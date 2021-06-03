# Calculadora Combinatória

## Descrição

```bash
Esta aplicação visa gerar as combinações possíveis dados como entrada os valores N e M, onde N 
é o total de registros numéricos recebidos como entrada e M é a quantidade de elementos
selecionados dentre os N elementos possíveis.

Aqui a ordem NÃO importa(embora os elementos sejam apresentados em ordem) e os elementos NÃO podem
ser repetidos.

Portanto, se N = 3 e M = 2, temos as seguintes combinações:
		- 0 e 1 
		- 0 e 2 
		- 1 e 2
	
Note que os valores apresentados vão de 0 a N-1, e NÃO de 1 a N.	
```

## Diferencial

```bash
O diferencial desta aplicação é sua capacidade de gerar código Java dinamicamente e executá-lo,
isso é feito em tempo de execução, tendo como base os valores N e M informados pelo usuário.

Deste modo, independente dos valores informados, a aplicação conseguirá resolvê-lo e apresentará os 
resultados em tela aos usuário.

A possibilidade de geração e execução de código Java totalmente dinâmica se deve ao uso da biblioteca/lib
BeanShell.

https://beanshell.github.io/
```

## Executar Projeto

```bash
Passos para execução:
	
	- Clonar este repositório
	- Ter NetBeans 8.2(ou superior) instalado em seu computador
	- Importar o projeto em NetBeans / Arquivo(File) / Abrir Projeto(Open Project) / ...
	- Limpar e Contruir o projeto(Shift + F11)
	- Executar projeto(F6)
```