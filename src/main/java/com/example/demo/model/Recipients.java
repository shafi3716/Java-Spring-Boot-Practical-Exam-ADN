package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "recipients")
public class Recipients {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;
	
	@ManyToOne()
    private Campaigns campaigns;
	

    @Column(name="recipient_number")
	private String recipientNumber;
    
    private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Campaigns getCampaigns() {
		return campaigns;
	}

	public void setCampaigns(Campaigns campaigns) {
		this.campaigns = campaigns;
	}

	public String getRecipientNumber() {
		return recipientNumber;
	}

	public void setRecipientNumber(String recipientNumber) {
		this.recipientNumber = recipientNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
    
}
