package com.cronycommunity.inventorymanagementsystem.entities;

import javax.persistence.*;

@Table(name="tip")
@Entity
public class Type {
	
	@Id
	@Column(name="t_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int typeId;
	
	@Column(name="sis_kod")
	private String systemCode;

	
	@Column(name="envanter_adi")
	private String envanterAdi;
	
	@Column(name="genel_tip")
	private String genelType;
	
	
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Type(int typeId, String systemCode, String envanterAdi, String genelType) {
		super();
		this.typeId = typeId;
		this.systemCode = systemCode;
		this.envanterAdi = envanterAdi;
		this.genelType = genelType;
	}


	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

	public String getEnvanterAdi() {
		return envanterAdi;
	}

	public void setEnvanterAdi(String envanterAdi) {
		this.envanterAdi = envanterAdi;
	}

	public String getGenelType() {
		return genelType;
	}

	public void setGenelType(String genelType) {
		this.genelType = genelType;
	}

	
	
}
