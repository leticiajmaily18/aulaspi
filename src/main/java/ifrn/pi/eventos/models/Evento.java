package ifrn.pi.eventos.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String localF;
	private String dataF;
	private String horario;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return localF;
	}

	public void setLocal(String local) {
		this.localF = local;
	}

	public String getData() {
		return dataF;
	}

	public void setData(String data) {
		this.dataF = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", nome=" + nome + ", local=" + localF + ", data=" + dataF + ", horario=" + horario
				+ "]";
	}
	
}
