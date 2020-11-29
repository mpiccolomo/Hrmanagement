package it.marco.angularspringboot.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tipassenza database table.
 * 
 */
@Entity
@NamedQuery(name="Tipassenza.findAll", query="SELECT t FROM Tipassenza t")
public class Tipassenza implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tip_assenza")
	private int idTipAssenza;

	@Temporal(TemporalType.DATE)
	@Column(name="data_fine")
	private Date dataFine;

	@Temporal(TemporalType.DATE)
	@Column(name="data_inizio")
	private Date dataInizio;

	@Column(name="tipologia_assenza")
	private String tipologiaAssenza;

	public Tipassenza() {
	}

	public int getIdTipAssenza() {
		return this.idTipAssenza;
	}

	public void setIdTipAssenza(int idTipAssenza) {
		this.idTipAssenza = idTipAssenza;
	}

	public Date getDataFine() {
		return this.dataFine;
	}

	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}

	public Date getDataInizio() {
		return this.dataInizio;
	}

	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}

	public String getTipologiaAssenza() {
		return this.tipologiaAssenza;
	}

	public void setTipologiaAssenza(String tipologiaAssenza) {
		this.tipologiaAssenza = tipologiaAssenza;
	}

}