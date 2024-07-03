package com.rohith.web;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mobile_dtls")
public class Mobile {
	@Id
	@Column(name="model_no")
	private int modelId;
	private String modelName;
	private String companyName;
	private String RAM_size;
	private String ROM_size;
	private String os_name;
	private String processor;
	private String IMEI_no;
	private double price;
	private int cam_size;
	public Mobile() {
		super();
	}
	public Mobile(int modelId, String modelName, String companyName, String rAM_size, String rOM_size, String os_name,
			String processor, String iMEI_no, double price, int cam_size) {
		super();
		this.modelId = modelId;
		this.modelName = modelName;
		this.companyName = companyName;
		RAM_size = rAM_size;
		ROM_size = rOM_size;
		this.os_name = os_name;
		this.processor = processor;
		IMEI_no = iMEI_no;
		this.price = price;
		this.cam_size = cam_size;
	}
	public int getModelId() {
		return modelId;
	}
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getRAM_size() {
		return RAM_size;
	}
	public void setRAM_size(String rAM_size) {
		RAM_size = rAM_size;
	}
	public String getROM_size() {
		return ROM_size;
	}
	public void setROM_size(String rOM_size) {
		ROM_size = rOM_size;
	}
	public String getOs_name() {
		return os_name;
	}
	public void setOs_name(String os_name) {
		this.os_name = os_name;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getIMEI_no() {
		return IMEI_no;
	}
	public void setIMEI_no(String iMEI_no) {
		IMEI_no = iMEI_no;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCam_size() {
		return cam_size;
	}
	public void setCam_size(int cam_size) {
		this.cam_size = cam_size;
	}
	
	
	

}
