package com.cronycommunity.inventorymanagementsystem.entities;

import javax.persistence.*;

@Table(name="kullanici")
@Entity
public class User {
	
	@Id
	@Column(name="k_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int kullaniciId;
	
	@Column(name="login_name")
	private String loginName;

	@Column(name="Tc_Kimlik_No")
	private String tcKimlikNo;
	
	@Column(name="parola")
	private String parola;
	
	@Column(name="Sicil_No")
	private int sicilNo;
	
	@Column(name="adi")
	private String ad;
	
	@Column(name="soyadi")
	private String soyad;
	
	@Column(name="eposta")
	private String eposta;
	
	@Column(name="unvan")
	private String unvan;
	
	@Column(name="birim")
	private String birim;
	
	/*
	@Column(name="İşe Başlama Tarihi")
	private String iseBaslamaTarihi;
	
	@Column(name="İşten Ayrılma Tarihi")
	private String istenAyrılmaTarihi;
	*/
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int kullaniciId, String loginName, String tcKimlikNo, String parola, int sicilNo, String ad,
			String soyad, String eposta, String unvan, String birim) {
		super();
		this.kullaniciId = kullaniciId;
		this.loginName = loginName;
		this.tcKimlikNo = tcKimlikNo;
		this.parola = parola;
		this.sicilNo = sicilNo;
		this.ad = ad;
		this.soyad = soyad;
		this.eposta = eposta;
		this.unvan = unvan;
		this.birim = birim;
	}
	
	public int getKullaniciId() {
		return kullaniciId;
	}
	public void setKullaniciId(int kullaniciId) {
		this.kullaniciId = kullaniciId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getTcKimlikNo() {
		return tcKimlikNo;
	}
	public void setTcKimlikNo(String tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	public int getSicilNo() {
		return sicilNo;
	}
	public void setSicilNo(int sicilNo) {
		this.sicilNo = sicilNo;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getEposta() {
		return eposta;
	}
	public void setEposta(String eposta) {
		this.eposta = eposta;
	}
	public String getUnvan() {
		return unvan;
	}
	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	public String getBirim() {
		return birim;
	}
	public void setBirim(String birim) {
		this.birim = birim;
	}

}
