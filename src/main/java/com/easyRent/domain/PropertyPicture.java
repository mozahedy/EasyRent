package com.easyRent.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PropertyPicture {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
    
    @Column
	private String link;
    
    @Column
	private String description;
	
	
	@ManyToOne
    @JoinColumn(name="property_id", nullable=false)
	private Property property;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
