package it.marco.angularspringboot.pojo;

import java.util.Date;

public class DipendentePOJO {
	
	Long id;
	
	Long id_dipendente;
	
	String matricola;
	
	String nome;
	
	String cognome;
	
	Date data_di_nascita;
	
	Date data_inizio;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId_dipendente() {
		return id_dipendente;
	}
	public void setId_dipendente(Long id_dipendente) {
		this.id_dipendente = id_dipendente;
	}
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Date getData_di_nascita() {
		return data_di_nascita;
	}
	public void setData_di_nascita(Date data_di_nascita) {
		this.data_di_nascita = data_di_nascita;
	}
	public Date getData_inizio() {
		return data_inizio;
	}
	public void setData_inizio(Date data_inizio) {
		this.data_inizio = data_inizio;
	}


}
