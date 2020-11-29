package it.marco.angularspringboot.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tipskill database table.
 * 
 */
@Entity
@NamedQuery(name="Tipskill.findAll", query="SELECT t FROM Tipskill t")
public class Tipskill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tip_skill")
	private int idTipSkill;

	@Temporal(TemporalType.DATE)
	@Column(name="data_fine")
	private Date dataFine;

	@Temporal(TemporalType.DATE)
	@Column(name="data_inizio")
	private Date dataInizio;

	@Column(name="tipologia_skill")
	private String tipologiaSkill;

	public Tipskill() {
	}

	public int getIdTipSkill() {
		return this.idTipSkill;
	}

	public void setIdTipSkill(int idTipSkill) {
		this.idTipSkill = idTipSkill;
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

	public String getTipologiaSkill() {
		return this.tipologiaSkill;
	}

	public void setTipologiaSkill(String tipologiaSkill) {
		this.tipologiaSkill = tipologiaSkill;
	}

}