package com.cronycommunity.inventorymanagementsystem.entities;
	
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.*;

	@Table(name="envanter")
	@Entity
	public class Inventory {
		
		@Id
		@Column(name="e_id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int inventoryId;
		
		@Column(name="kayit_tar")
		private LocalDateTime kayitTarihi;

		@Column(name="t_id")
		private int tipId;
		
		@Column(name="sis_no")
		private String sistemNo;
		
		@Column(name="marka")
		private String markaName;
		
		@Column(name="model")
		private String modelName;
		
		@Column(name="seri_no")
		private String seriNo;
		
		@Column(name="aciklama")
		private String aciklama;
		
		
		
		public Inventory() {
			super();
			// TODO Auto-generated constructor stub
		}



		public Inventory(int inventoryId, LocalDateTime kayitTarihi, int tipId, String sistemNo, String markaName,
				String modelName, String seriNo, String aciklama) {
			super();
			this.inventoryId = inventoryId;
			this.kayitTarihi = kayitTarihi;
			this.tipId = tipId;
			this.sistemNo = sistemNo;
			this.markaName = markaName;
			this.modelName = modelName;
			this.seriNo = seriNo;
			this.aciklama = aciklama;
		}



		public int getInventoryId() {
			return inventoryId;
		}



		public void setInventoryId(int inventoryId) {
			this.inventoryId = inventoryId;
		}

		public LocalDateTime getKayitTarihi() {
			return kayitTarihi;
		}

		public void setKayitTarihi(LocalDateTime kayitTarihi) {
			this.kayitTarihi = kayitTarihi;
		}

		public int getTipId() {
			return tipId;
		}

		public void setTipId(int tipId) {
			this.tipId = tipId;
		}

		public String getSistemNo() {
			return sistemNo;
		}

		public void setSistemNo(String sistemNo) {
			this.sistemNo = sistemNo;
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
	
	

}
