package com.cronycommunity.inventorymanagementsystem.entities;

import javax.persistence.*;

@Table(name="markalar")
@Entity
public class Brand {
	
	@Id
	@Column(name="m_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int markaId;
	
	@Column(name="t_id")
	private int tipId;

	@Column(name="marka")
	private String markaName;
	
	@Column(name="model")
	private String modelName;
	
	@Column(name="aciklama")
	private String aciklama;
	
	
	public Brand() {
		super();
	}

	public Brand(int markaId, int tipId, String markaName, String modelName, String aciklama) {
		super();
		this.markaId = markaId;
		this.tipId = tipId;
		this.markaName = markaName;
		this.modelName = modelName;
		this.aciklama = aciklama;
	}

	public int getMarkaId() {
		return markaId;
	}

	public void setMarkaId(int markaId) {
		this.markaId = markaId;
	}

	public int getTipId() {
		return tipId;
	}

	public void setTipId(int tipId) {
		this.tipId = tipId;
	}

	public String getMarkaName() {
		return markaName;
	}

	public void setMarkaName(String markaName) {
		this.markaName = markaName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}


	
	
}
