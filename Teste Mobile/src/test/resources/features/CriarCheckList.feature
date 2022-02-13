#language: pt
#encoding: UTF-8
@checklist
Funcionalidade: Color Note Checklist

Contexto: criar um checklist com tres itens
Quando eu clicar no botao permitir
E clicar no botao skip
E eu clicar no botao add note
E clicar no botao Checklist
E digitar o titulo "CheckTeste"
E clicar no botao Add Item
E informar "Teste1"
E clicar no botao OK
E clicar no botao Add Item
E informar "Teste2"
E clicar no botao OK
E clicar no botao Add Item
E informar "Teste3"
E clicar no botao OK
E clicar no botao back
E clicar no botao back
Entao sera criado um checklist com os itens "Teste1" "Teste2" e "Teste3"

@corchecklist
Cenario: alterar cor da lista
Quando eu clicar e segurar no checklist
E clicar no botao color
E clicar na cor vermelha
E clica na aba de filtro por cores
E seleciono a cor vermelha
Entao a cor do checklist fica vermelha

@concluidochecklist
Cenario: marcar como concluido um item do checklist
Quando eu clicar no checklist
E clicar no "Teste1"
Entao o item fica marcado como checked

@lembretechecklist
Cenario: colocar lembrete de quinze minutos no checklist
Quando eu clicar e segurar no checklist
E clicar no botao lembrete
E clicar no botao remind me in fifteen minutes
E clicar no botao done
Entao o alarme tocara em quinze minutos

@excluirchecklist
Cenario: excluir o checklist e esvaziar a lixeira
Quando eu clicar e segurar no checklist
E clicar no botao delete
E clicar no botao OK
E clicar no botao menu
E clicar no botao trash can
E clicar no botao esvaziar lixeira
E clicar no botao OK
Entao o checklist foi excluido permanentemente




