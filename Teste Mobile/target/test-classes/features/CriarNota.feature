#language: pt
#encoding: UTF-8
@nota
Funcionalidade: Color Note Notas

Contexto: criar uma nota de texto
Quando eu clicar no botao permitir
E clicar no botao skip
E eu clicar no botao add note
E clicar na aba Text
E digitar "Teste"
E clicar no botao back
E clicar no botao back
Entao a nota "Teste" sera salva no aplicativo

@cornota
Cenario: alterar cor da nota
Quando eu clicar e segurar na nota
E clicar no botao color
E clicar na cor vermelha
E clica na aba de filtro por cores
E seleciono a cor vermelha
Entao a cor da nota fica vermelha

@lembretenota
Cenario: colocar um lembrete de quinze minutos na nota
Quando eu clicar e segurar na nota
E clicar no botao lembrete
E clicar no botao remind me in fifteen minutes
E clicar no botao done
Entao o alarme sera programado para tocar em quinze minutos

@excluirnota
Cenario: excluir uma nota e esvaziar a lixeira
Quando eu clicar e segurar na nota
E clicar no botao delete
E clicar no botao OK
E clicar no botao menu
E clicar no botao trash can
E clicar no botao esvaziar lixeira
E clicar no botao OK
Entao a nota foi excluida permanentemente

