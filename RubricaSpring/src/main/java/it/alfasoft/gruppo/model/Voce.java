package it.alfasoft.gruppo.model;

import javax.persistence.*;


@Entity
public class Voce {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_Voce;
	private String nomeVoce;
	private String cognomeVoce;
	private String telefono;

	@ManyToOne
	private Rubrica rubrica;

	public Voce() {
	}

	public Voce(String nomeVoce, String cognomeVoce, String telefono) {
		this.nomeVoce = nomeVoce;
		this.cognomeVoce = cognomeVoce;
		this.telefono = telefono;
	}

	public long getId_Voce() {
		return id_Voce;
	}

	public void setId_Voce(long id_Voce) {
		this.id_Voce = id_Voce;
	}

	public String getNomeVoce() {
		return nomeVoce;
	}

	public void setNomeVoce(String nomeVoce) {
		this.nomeVoce = nomeVoce;
	}

	public String getCognomeVoce() {
		return cognomeVoce;
	}

	public void setCognomeVoce(String cognomeVoce) {
		this.cognomeVoce = cognomeVoce;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Rubrica getRubrica() {
		return rubrica;
	}

	public void setRubrica(Rubrica rubrica) {
		this.rubrica = rubrica;
	}
	
}
