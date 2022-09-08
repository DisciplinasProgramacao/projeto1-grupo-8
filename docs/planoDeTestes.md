# Plano de Testes:

1. Verifica se o compromisso criado sem atributos possui valor nulo para "nome".
  - testNomeCompromissoVazio()
2. Verifica se o compromisso criado sem atributos possui valor nulo para "data".
  - testDataCompromissoVazio()
3. Verifica se, quando criado, um compromisso com atributos armazena o nome correto.
  - testNomeCompromisso()
5. Verifica se, quando criado, um compromisso com atributos armazena a data correta.
  - testDataCompromisso()
6. Verifica se, quando criada, uma data com dia e mês armazena o dia e mês corretamente.
  - testCriaData1()
7. Verifica se, quando criada, uma data com dia, mês e ano armazena esses valores corretamente.
  - testCriaData2()
8. Verifica se as datas criadas estão sendo formatadas corretamente.
  - testFormatoData()
9. Verifica se um valor inválido de mês é detectado na criação de uma data.
  - testDetectaMesInvalido()
10. Verifica se, quando uma data sem valor para ano é criada, armazena o ano atual. 
  - testAnoAtual()
11. Verifica se anos bissextos são detectados no momento de criação de uma data.
  - testDetectaBissexto()
