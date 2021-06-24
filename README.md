# Trabalho 1 da disciplina de Paradigmas UFPR.
Gustavo Valente - GRR: 20182557
Kokouvi hola kanyi kodjovi - GRR: 20170300
Bruno Oshiro Vieira - GRR: 20171902

Explicando como que as classes do trabalho foram implementadas: 
Classe Usuario: 
	1. nome: Indica o nome do usuário.
	2. telefone: Indica o número de telefone do usuário.
	3. status: Indica qual o status do usuário no momento.
	4. foto: É um campo, apenas para simular que o usuário possui uma foto
	5. ArrayList<Grupo>: Indica a quais grupos o usário pertence.
	6. ArrayList<Mensagem>: Indica para quais grupos o usuário enviou as mensagens.

Classe Grupo:
    1. descricao: Indica a descrição do grupo.
    2. ArrayList<Usuario> usuarios: Indica todos os usuários pertencentes ao grupo.
    3. ArrayList<Mensagem> mensagens: Indica as mensagens pertencentes ao grupo.
    4. ArrayList<Usuario> arrayAdm: Indica todos os adminstratores do grupo.

enum TipoMensagem
	1. O TipoMensagem indica se vai ser enviado um video, texto, audio ou foto.

Classe mensagem:
    1. Autor: Indica o autor da mensagem.
    2. tipoMsg: Indica o tipo da mensagem enviada se for uma foto, audio, texto e video.
	3. corpoMsg: Indica o conteudo da mensagem.
   	4. dataEnvio: Indica que horario foi enviado a mensagem. 
	5. mensagemGrupo: Indica as mensagens dos grupos.
	
Comportamento do trabalho:
	-> Os grupos, podem conter vários usuários, e todos os usários podem enviar mensagens nos grupos, 
		nos quais pertecem.
	-> Quando algum usuário cria um grupo, ele é automaticamente promovido a administrador do grupo.
	-> Todos no grupo podem visualizar o histórico das mensagens.

Simulação:
	-> O trabalho foi testado de acordo com a simulação indicada na descrição do trabalho.
	-> Além dos testes oferecidos na descrição do trabalho, foi adicionado uma exclusões como exemplo.