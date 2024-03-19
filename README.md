# Trabalho-de-Lab-Estrutura-de-Dados
Relatório de Comparação Sobre os Algoritmos Insertion sort, Selection Sort, Bubble Sort.

<h3>Selection Sort - Ordenação por Seleção</h3>

Este algoritmo divide a lista de entrada em duas seguintes partes: a parte ordenada que ocupa a extremidade esquerda da lista e a parte não ordenada que ocupa a extremidade direita da lista. Inicialmente, a parte ordenada está vazia e a parte não ordenada é a lista inteira. O algoritmo procede encontrando o menor, mas também pode ser o maior maior dependendo da ordem de classificação, elemento na parte não ordenada, trocando-o com o elemento não ordenado mais à esquerda e movendo os limites da sublista um elemento para a direita.

<h3>Insertion Sort - Ordenação por Inserção</h3> 

Este algoritmo divide a lista de entrada em duas partes: a parte ordenada que ocupa a extremidade esquerda da lista e a parte não ordenada que ocupa a extremidade direita da lista. Inicialmente, a parte ordenada contém o primeiro elemento da lista e a parte não ordenada contém o restante. O algoritmo procede pegando o primeiro elemento da parte não ordenada e inserindo-o na posição correta na parte ordenada.

<h3>Bubble Sort - Ordenação por Bolha</h3>

Este é um algoritmo de ordenação simples que percorre repetidamente a lista, compara elementos adjacentes e os troca se estiverem na ordem errada. A passagem pela lista é repetida até que a lista seja ordenada.

<h3>Sobre os algortimos de Ordenação:</h3>

Todos eles possuem uma complexidade quadrática, segue alguns exemplos dos que foram citados anteriormente:

![Texto Alternativo](https://miro.medium.com/v2/resize:fit:720/format:webp/1*sav5YXtt9R_3jmw7TBcSMg.png)

<h3>Como Funciona o Programa ?</h3>

<p>Inicialmente, o código cria uma lista chamada <strong>arrayInsertion</strong> usando a função gerarLista(10000), ela irá gerar uma lista de 10.000 números aleatórios. Em seguida, o código cria dois arrays, <strong>arraySelection</strong> e <strong>arrayBubble</strong>, e preenche cada um com os mesmos números que estão em <strong>arrayInsertion</strong>. O código então inicializará contadores para as comparações e trocas que serão feitas por cada algoritmo de ordenação, e também iniciará um cronômetro para medir o tempo de execução de cada algoritmo apresentado.</p>

<p> - O primeiro algoritmo de ordenação a ser executado é o Insertion Sort. Este algoritmo percorre a lista arrayInsertion da esquerda para a direita. Para cada número, ele o move para a esquerda até encontrar um número menor.</p>

<p> - O próximo algoritmo de ordenação a ser executado é o Selection Sort. Este algoritmo percorre o array arraySelection e para cada posição, ele procura o menor número no restante do array e o troca com o número na posição atual.</p>

<p> - Por fim, o último algoritmo de ordenação a ser executado é o Bubble Sort. Este algoritmo percorre o array arrayBubble várias vezes. Em cada passagem, ele compara cada par de números adjacentes e os troca se estiverem na ordem errada.</p>

<h3>Como Faço Para Executar o Programa ?</h3>

Para executar o Programa, basta baixá-lo, ou somente copiá-lo, colá-lo e executá-lo na IDE que preferir ou mesmo em um compilador online.



