# Trabalho P2 - Sistema Eventos VIP

Trabalho da disciplina de Programaçao Orientada a Objetos. 
Sistema para gerenciar eventos da empresa "Eventos VIP".

## Grupo
- Luna Mendes
- Lígia Santos

## Matéria
Programaçao Orientada a Objetos - Professor [Nome]

## Sobre o Projeto
Sistema desenvolvido em Java para gerenciar eventos, controlando convidados, mesas, garçons, pedidos e pagamentos.

## Funcionalidades Principais
- Cadastro de convidados (VIP e Regular)
- Controle de mesas com limite de 8 pessoas
- Sistema de pedidos com itens exclusivos para VIP
- Calculo automatico de descontos
- Relatorios de faturamento

## Como Executar

1. **Baixar o projeto**
   - Faça download dos arquivo
   - Extraia em uma pasta

2. **Compilar** (pelo terminal):
   ``javac -d bin src/entidade/.java src/Desconto/.java src/Main.java``

3. **Executar**:
   ``java -cp bin Main``
   
## Classes Principais
- `Convidado` - controle de convidados VIP/Regular
- `Mesa` - gerencia mesas e convidados
- `Pedido` - controle de pedidos
- `Garcom` - atendimento das mesas
- `Evento` - configuração do evento

## Estrutura de Pastas
```markdown
src/
├── entidade/     - Classes do sistema
├── Desconto/     - Classes de desconto  
└── Main.java     - Programa principal

