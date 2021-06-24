package entities;

import java.util.Date;

public class Mensagem {
	public Usuario autor;
   	public TipoMensagem tipoMsg;
	public String corpoMsg;
   	public Date dataEnvio;
	public String mensagemGrupo;

	public Mensagem() {}
	public Mensagem(Usuario autor, TipoMensagem tipoMsg, String corpoMsg, Date dataEnvio, String mensagemGrupo) {
		this.autor = autor;
		this.tipoMsg = tipoMsg;
		this.corpoMsg = corpoMsg;
		this.dataEnvio = dataEnvio;
		this.mensagemGrupo = mensagemGrupo;
	}
}

