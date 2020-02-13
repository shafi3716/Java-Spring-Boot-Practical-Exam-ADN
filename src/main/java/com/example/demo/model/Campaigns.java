package com.example.demo.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "campaigns")
public class Campaigns {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column(name="campaigns_title")
    private String campaignsTitle;
    
    private String sender;
    
    @Column(name="message_body")
    private String messageBody;
    
//    @Enumerated(StatusType.ORDINAL)
//    private StatusType status;
    
    private String status;
    
    @JsonIgnore
    @OneToMany(mappedBy = "campaigns")
    private Set<Campaigns> campaigns = new HashSet<>();
  

	public Set<Campaigns> getCampaigns() {
		return campaigns;
	}

	public void setCampaigns(Set<Campaigns> campaigns) {
		this.campaigns = campaigns;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCampaignsTitle() {
		return campaignsTitle;
	}

	public void setCampaignsTitle(String campaignsTitle) {
		this.campaignsTitle = campaignsTitle;
	}


	public String getMessageBody() {
		return messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

    
    
}
