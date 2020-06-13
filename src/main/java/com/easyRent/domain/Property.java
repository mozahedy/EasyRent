package com.easyRent.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Property {
	@Id 
	private long id;
	
	private String title;
	private String description;
	private float price;
	private float area;
	private LocalDate expireDate;
	private int bathCount;
	
	private int bedCount;
	private int garageCount;
	private boolean airConditioning;
	private boolean grill;
	private boolean oven;
	private boolean parking;
	private PropertyType propertyType;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public LocalDate getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}
	public int getBathCount() {
		return bathCount;
	}
	public void setBathCount(int bathCount) {
		this.bathCount = bathCount;
	}
	public int getBedCount() {
		return bedCount;
	}
	public void setBedCount(int bedCount) {
		this.bedCount = bedCount;
	}
	public int getGarageCount() {
		return garageCount;
	}
	public void setGarageCount(int garageCount) {
		this.garageCount = garageCount;
	}
	public boolean isAirConditioning() {
		return airConditioning;
	}
	public void setAirConditioning(boolean airConditioning) {
		this.airConditioning = airConditioning;
	}
	public boolean isGrill() {
		return grill;
	}
	public void setGrill(boolean grill) {
		this.grill = grill;
	}
	public boolean isOven() {
		return oven;
	}
	public void setOven(boolean oven) {
		this.oven = oven;
	}
	public boolean isParking() {
		return parking;
	}
	public void setParking(boolean parking) {
		this.parking = parking;
	}
	public PropertyType getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(PropertyType propertyType) {
		this.propertyType = propertyType;
	}
	public Property(String title, String description, float price, float area, int bedCount) {
		super();
		this.title = title;
		this.description = description;
		this.price = price;
		this.area = area;
		this.bedCount = bedCount;
	}
	
	
	
}
	
