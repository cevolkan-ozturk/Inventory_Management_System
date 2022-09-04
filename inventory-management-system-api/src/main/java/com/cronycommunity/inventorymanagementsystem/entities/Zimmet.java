package com.cronycommunity.inventorymanagementsystem.entities;

import java.time.LocalDateTime;

import javax.persistence.*;

@Table(name="zimmet")
@Entity
public class Zimmet {
	
	@Id
	@Column(name="z_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int zimmetId;
	
	@Column(name="e_id")
	private int inventoryId;

	@Column(name="k_id")
	private int kullaniciId;
	
	@Column(name="eposta")
	private String eposta;
	
	@Column(name="p_id_zimmetleyen")
	private String p_id_zimmetleyen;
	
	@Column(name="verilis_tarihi")
	private LocalDateTime verilisTarihi;
	
	@Column(name="aciklama")
	private String aciklama;

	
	public Zimmet() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Zimmet(int zimmetId, int typeId, int kullaniciId, String eposta, String p_id_zimmetleyen,
			LocalDateTime verilisTarihi, String aciklama) {
		super();
		this.zimmetId = zimmetId;
		this.inventoryId = inventoryId;
		this.kullaniciId = kullaniciId;
		this.eposta = eposta;
		this.p_id_zimmetleyen = p_id_zimmetleyen;
		this.verilisTarihi = verilisTarihi;
		this.aciklama = aciklama;
	}


	public int getZimmetId() {
		return zimmetId;
	}

	public void setZimmetId(int zimmetId) {
		this.zimmetId = zimmetId;
	}

	public int getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}

	public int getKullaniciId() {
		return kullaniciId;
	}

	public void setKullaniciId(int kullaniciId) {
		this.kullaniciId = kullaniciId;
	}

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}

	public String getP_id_zimmetleyen() {
		return p_id_zimmetleyen;
	}

	public void setP_id_zimmetleyen(String p_id_zimmetleyen) {
		this.p_id_zimmetleyen = p_id_zimmetleyen;
	}

	public LocalDateTime getVerilisTarihi() {
		return verilisTarihi;
	}

	public void setVerilisTarihi(LocalDateTime verilisTarihi) {
		this.verilisTarihi = verilisTarihi;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}		
	
}