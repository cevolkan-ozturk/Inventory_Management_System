package com.cronycommunity.inventorymanagementsystem.dtos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.JsonDeserializer;

public class VInventoryDto  {

	private int inventoryId;
	
	private String kayitTarihi;

	private String sistemNo;
	
	private int tipId;

	public String getDurum() {
		return durum;
	}

	public void setDurum(String durum) {
		this.durum = durum;
	}

	private String durum;


	public int getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}

	public String getKayitTarihi() {
		return kayitTarihi;
	}

	public void setKayitTarihi(String kayitTarihi) {
		this.kayitTarihi = kayitTarihi;
	}

	public String getSistemNo() {
		return sistemNo;
	}

	public void setSistemNo(String sistemNo) {
		this.sistemNo = sistemNo;
	}

	public int getTipId() {
		return tipId;
	}

	public void setTipId(int tipId) {
		this.tipId = tipId;
	}

	public String getSeriNo() {
		return seriNo;
	}

	public void setSeriNo(String seriNo) {
		this.seriNo = seriNo;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getEnvanterAdi() {
		return envanterAdi;
	}

	public void setEnvanterAdi(String envanterAdi) {
		this.envanterAdi = envanterAdi;
	}

	public String getGenelTip() {
		return genelTip;
	}

	public void setGenelTip(String genelTip) {
		this.genelTip = genelTip;
	}

	private String seriNo;
	
	private String aciklama;
	
	private String marka;
	
	private String model;
	
	private String envanterAdi;
	
	private String genelTip;
	
}
