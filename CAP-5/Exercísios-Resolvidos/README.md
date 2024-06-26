# Exercícios resolvidos do capítulo 5 do livro de Fundamentos da Programação da matéria de POO de JAVA

## Enunciados das questões:
1. Um funcionário de uma empresa recebe, anualmente, aumento salarial. Sabe-se que:
a) Esse funcionário foi contratado em 2005, com salário inicial de R$ 1.000,00.
b) Em 2006, ele recebeu aumento de 1,5% sobre seu salário inicial.
c) A partir de 2007 (inclusive), os aumentos salariais sempre corresponderam ao dobro do percentual do ano
anterior.
Faça um programa que determine o salário atual desse funcionário.

2. Faça um programa que leia um valor N inteiro e positivo. Calcule e mostre o valor de E, conforme a fórmula a seguir: E = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N!

3. Faça um programa que leia um número N que indica quantos valores inteiros e positivos devem ser lidos a seguir. Para cada número lido, mostre uma tabela contendo o valor lido e o fatorial desse valor.

4. Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito.

Foram obtidos os seguintes dados:
a) código da cidade;
b) número de veículos de passeio;
c) número de acidentes de trânsito com vítimas.

Deseja-se saber:
a) qual é o maior e qual é o menor índice de acidentes de trânsito e a que cidades pertencem;
b) qual é a média de veículos nas cinco cidades juntas;
c) qual é a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.

5. Faça um programa que leia o número de termos e um valor positivo para X. Calcule e mostre o valor da série a seguir: S = -X2/1! +X3/2! –X4/3! +X5/4! -X6/3! +X7/2! -X8/1! +X9/2! -X10/3! +X11/4! -...

6. Uma empresa possui dez funcionários com as seguintes características: código, número de horas trabalhadas no mês, turno de trabalho (M — matutino; V — vespertino; ou N — Noturno), categoria (O — operário; ou G — gerente), valor da hora trabalhada. Sabendo-se que essa empresa deseja informatizar sua folha de pagamento, faça um programa que:

a) Leia as informações dos funcionários, exceto o valor da hora trabalhada, não permitindo que sejam informa-
dos turnos e nem categorias inexistentes. Trabalhe sempre com a digitação de letras maiúsculas.

b) Calcule o valor da hora trabalhada, conforme a tabela a seguir. Adote o valor de R$ 450,00 para o salário
mínimo.

| Categoria | Turno | Valor da Hora Trabalhada |
|-----------|-------|--------------------------|
| G         | N     | 18% do salário mínimo    |
| G         | M ou V| 15% do salário mínimo    |
| O         | N     | 13% do salário mínimo    |
| O         | M ou V| 10% do salário mínimo    |

c) Calcule o salário inicial dos funcionários com base no valor da hora trabalhada e no número de horas traba-
lhadas.

d) Calcule o valor do auxílio alimentação recebido pelo funcionário de acordo com seu salário inicial, conforme
a tabela a seguir.

| Salário Inicial            | Auxílio Alimentação            |
|----------------------------|--------------------------------|
| Até R$ 300,00              | 20% do salário inicial         |
| Entre R$ 300,00 e R$ 600,00| 15% do salário inicial         |
| Acima de R$ 600,00         | 5% do salário inicial          |

e) Mostre o código, número de horas trabalhadas, valor da hora trabalhada, salário inicial, auxílio alimentação
e salário final (salário inicial + auxílio alimentação).

7. Faça um programa que monte os oito primeiros termos da sequência de Fibonacci. 0-1-1-2-3-5-8-13-21-34-55...

8. Faça um programa que leia o número de termos, determine e mostre os valores de acordo com a série a seguir: Série = 2, 7, 3, 4, 21, 12, 8, 63, 48, 16, 189, 192, 32, 567, 768...

9. Faça um programa que receba duas notas de seis alunos. Calcule e mostre:
- A média aritmética das duas notas de cada aluno;
- A mensagem que está na tabela a seguir:

| Média Aritmética | Mensagem   |
|-------------------|------------|
| Até 3             | Reprovado  |
| Entre 3 e 7       | Exame      |
| De 7 para cima    | Aprovado   |

- O total de alunos aprovados;
- O total de alunos de exame;
- O total de alunos reprovados;
- O média da classe.

10. Em um campeonato de futebol existem cinco times e cada um possui onze jogadores. Faça um programa que receba a idade, o peso e a altura de cada um dos jogadores, calcule e mostre:

- A quantidade de jogadores com idade inferior a 18 anos;
- A média das idades dos jogadores de cada time;
- A média das alturas de todos os jogadores do campeonato; e
- A porcentagem de jogadores com mais de 80 kg entre todos os jogadores do campeonato.

11. Faça um programa que receba um número inteiro maior que 1, verifique se o número fornecido é primo ou não e mostre uma mensagem de número primo ou de número não primo. Um número é primo quando é divisível apenas por 1 e por ele mesmo.

12. Em uma fábrica trabalham homens e mulheres divididos em três classes:

- Trabalhadores que fazem até 30 peças por mês — classe 1;
- Trabalhadores que fazem de 31 a 50 peças por mês — classe 2;
- Trabalhadores que fazem mais de 50 peças por mês — classe 3.

A classe 1 recebe salário mínimo. A classe 2 recebe salário mínimo mais 3% deste salário por peça, acima das 30 peças iniciais. A classe 3 recebe salário mínimo mais 5% desse salário por peça, acima das 30 peças iniciais.

Faça um programa que receba o número do operário, o número de peças fabricadas no mês, o sexo do operário, e que também calcule e mostre:
- O número do operário e seu salário;
- O total da folha de pagamento da fábrica;
- O número total de peças fabricadas no mês;
- A média de peças fabricadas pelos homens;
- A média de peças fabricadas pelas mulheres; e
- A número do operário ou operária de maior salário.
A fábrica possui 15 operários.

13. Foi feita uma pesquisa para determinar o índice de mortalidade infantil em certo período. Faça um
programa que:
- Leia o número de crianças nascidas no período;
- Identifique o sexo (M ou F) e o tempo de vida de cada criança nascida.
O programa deve calcular e mostrar:
- A percentagem de crianças do sexo feminino mortas no período;
- A percentagem de crianças do sexo masculino mortas no período;
- A percentagem de crianças que viveram 24 meses ou menos no período.

14. Faça um programa que receba o valor de uma dívida e mostre uma tabela com os seguintes dados: valor da dívida, valor dos juros, quantidade de parcelas e valor da parcela.
Os juros e a quantidade de parcelas seguem a tabela:

| Quantidade de Parcelas | % de Juros sobre o Valor Inicial da Dívida |
|-------------------------|---------------------------------------------|
| 1                       | 0                                           |
| 3                       | 10                                          |
| 6                       | 15                                          |
| 9                       | 20                                          |
| 12                      | 25                                          |

15. Faça um programa que receba o preço unitário, a refrigeração (S para os produtos que necessitem de refrigeração e N para os que não necessitem) e a categoria (A — alimentação; L — limpeza; e V — vestuário) de doze produtos, e que calcule e mostre:

- O custo de estocagem, calculado de acordo com a tabela a seguir:

| Preço Unitário | Refrigeração | Categoria | Custo de Estocagem |
|----------------|--------------|-----------|--------------------|
| Até 20         |              | A         | R$ 2,00            |
|                |              | L         | R$ 3,00            |
|                |              | V         | R$ 4,00            |
| Entre 20 e 50  |       S      |           | R$ 6,00            |
|                |       N      |           | R$ 0,00            |
| Maior que 50   |       S      | A         | R$ 5,00            |
|                |              | L         | R$ 2,00            |
|                |              | V         | R$ 4,00            |
|                |       N      | A ou V    | R$ 0,00            |
|                |              | L         | R$ 1,00            |

O imposto calculado de acordo com as regras a seguir:
Se o produto não preencher nenhum dos requisitos a seguir, seu imposto será de 2% sobre o preço unitário; caso contrário, será de 4%.
Os requisitos são: categoria — A e refrigeração — S.
- O preço final, ou seja, preço unitário mais custo de estocagem mais imposto.
- A classificação calculada usando a tabela a seguir:

| Preço Final                   | Classificação |
|-------------------------------|---------------|
| Até R$ 20,00                  | Barato        |
| Entre R$ 20,00 e R$ 100,00    | Normal        |
| Acima de R$ 100,00            | Caro          |

- A média dos valores adicionais, ou seja, a média dos custos de estocagem e dos impostos dos doze
produtos.
- O maior preço final.
- O menor preço final.
- O total dos impostos.
- A quantidade de produtos com classificação barato.
- A quantidade de produtos com classificação caro.
- A quantidade de produtos com classificação normal.

16. Faça um programa para calcular a área de um triângulo e que não permita a entrada de dados inválidos, ou seja, medidas menores ou iguais a 0.

17. Faça um programa que receba o salário de um funcionário chamado Carlos. Sabe-se que outro funcionário, João, tem salário equivalente a um terço do salário de Carlos. Carlos aplicará seu salário integralmente na caderneta de poupança, que rende 2% ao mês, e João aplicará seu salário integralmente no fundo de renda fixa, que rende 5% ao mês. O programa deverá calcular e mostrar a quantidade de meses necessários para que o valor pertencente a João iguale ou ultrapasse o valor pertencente a Carlos.

18. Faça um programa que leia um conjunto não determinado de valores e mostre o valor lido, seu quadrado, seu cubo e sua raiz quadrada. Finalize a entrada de dados com um valor negativo ou zero.

19. Faça um programa que leia um número não determinado de pares de valores [m,n], todos inteiros e positivos, um par de cada vez, e que calcule e mostre a soma de todos os números inteiros entre m e n (inclusive). A digitação de pares terminará quando m for maior ou igual a n.

20. Faça um programa para ler o código, o sexo (M — masculino; F — feminino) e o número de horas/aula dadas mensalmente pelos professores de uma universidade, sabendo-se que cada hora/aula vale R$ 30,00. Emita uma listagem contendo o código, o salário bruto e o salário líquido (levando em consideração os descontos explicados a seguir) de todos os professores. Mostre também a média dos salários líquidos dos professores do sexo masculino e a média dos salários líquidos dos professores do sexo feminino. Considere:
- desconto para homens, 10%, e, para mulheres, 5%;
- as informações terminarão quando for lido o código = 99999.

21. Faça um programa que receba vários números, calcule e mostre:
- a soma dos números digitados;
- a quantidade de números digitados;
- a média dos números digitados;
- o maior número digitado;
- o menor número digitado;
- a média dos números pares;
- a porcentagem dos números ímpares entre todos os números digitados.
Finalize a entrada de dados com a digitação do número 30.000.

22. Uma empresa decidiu fazer um levantamento em relação aos candidatos que se apresentarem para preenchimento de vagas em seu quadro de funcionários. Supondo que você seja o programador dessa empresa, faça um programa que leia, para cada candidato, a idade, o sexo (M ou F) e a experiência no serviço (S ou N). Para encerrar a entrada de dados, digite zero para a idade.
O programa também deve calcular e mostrar:
- o número de candidatos do sexo feminino;
- o número de candidatos do sexo masculino;
- a idade média dos homens que já têm experiência no serviço;
- a porcentagem dos homens com mais de 45 anos entre o total dos homens;
- o número de mulheres com idade inferior a 21 anos e com experiência no serviço;
- a menor idade entre as mulheres que já têm experiência no serviço.

23. Faça um programa que receba o valor do salário mínimo, uma lista contendo a quantidade de quilowatts gasta por consumidor e o tipo de consumidor (1 — residencial; 2 —comercial; ou 3 — industrial) e que calcule e mostre:

- O valor de cada quilowatt, sabendo que o quilowatt custa um oitavo do salário mínimo;
- O valor a ser pago por consumidor (conta final mais acréscimo). O acréscimo encontra-se na tabela a seguir:

| Tipo | % de Acréscimo sobre o Valor Gasto |
|------|-------------------------------------|
| 1    | 5                                   |
| 2    | 10                                  |
| 3    | 15                                  |

- o faturamento geral da empresa;
- a quantidade de consumidores que pagam entre R$ 500,00 e R$ 1.000,00.
Termine a entrada de dados com quantidade de quilowats igual a zero.

24. Faça um programa que apresente o menu de opções a seguir, permita ao usuário escolher a opção desejada, receba os dados necessários para executar a operação e mostre o resultado. Verifique a possibilidade de opção inválida e não se preocupe com restrições do tipo salário inválido.

Menu de opções:
1- Imposto
2- Novo salário
3- Classificação
4- Finalizar o programa
Digite a opção desejada.

Na opção 1: receber o salário de um funcionário, calcular e mostrar o valor do imposto usando as regras a seguir.

| Salários                | % do Imposto |
|-------------------------|--------------|
| Menor que R$ 500,00    | 5            |
| De R$ 500,00 a R$ 850,00 | 10           |
| Acima de R$ 850,00      | 15           |

Na opção 2: receber o salário de um funcionário, calcular e mostrar o valor do novo salário usando as regras a seguir.

| Salários                          | Aumento  |
|-----------------------------------|----------|
| Maiores que R$ 1.500,00          | R$ 25,00 |
| De R$ 750,00 a R$ 1.500,00       | R$ 50,00 |
| De R$ 450,00 a R$ 750,00         | R$ 75,00 |
| Menores que R$ 450,00            | R$ 100,00|

Na opção 3: receber o salário de um funcionário e mostrar sua classificação usando esta tabela:

| Salários                      | Classificação   |
|-------------------------------|-----------------|
| Até R$ 700,00                | Mal remunerado  |
| Maiores que R$ 700,00        | Bem remunerado  |

25. Faça um programa que receba os dados a seguir de vários produtos: preço unitário, país de origem (1 – Estados Unidos; 2 — México; e 3 — outros), meio de transporte (T — terrestre; F — fluvial; e A — aéreo), carga perigosa (S — sim; N — não), finalize a entrada de dados com um preço inválido, ou seja, menor ou igual a zero. O programa deve calcular e mostrar os itens a seguir:

- O valor do imposto, usando a tabela a seguir:

| Preço Unitário          | Percentual de Imposto sobre o Preço Unitário |
|-------------------------|---------------------------------------------|
| Até R$ 100,00           | 5%                                          |
| Maior que R$ 100,00     | 10%                                         |

- O valor do transporte usando a tabela a seguir:

| Carga Perigosa | País de Origem | Valor do Transporte |
|----------------|----------------|----------------------|
| S              | 1              | R$ 50,00             |
|                | 2              | R$ 21,00             |
|                | 3              | R$ 24,00             |
| N              | 1              | R$ 12,00             |
|                | 2              | R$ 21,00             |
|                | 3              | R$ 60,00             |

- O valor do seguro, usando a regra a seguir:
### Os produtos que vêm do México e os produtos que utilizam transporte aéreo pagam metade do valor do seu preço unitário como seguro.
- O preço final, ou seja, preço unitário mais imposto mais valor do transporte mais valor do seguro.

