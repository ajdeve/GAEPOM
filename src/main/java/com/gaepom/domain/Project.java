package com.gaepom.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Project {
	@Id
	@GeneratedValue
	@Column(name = "pj_seq")
	private Long pjSeq;
	
	@OneToOne
	@JoinColumn(name="rec_seq")
	private ProjectRecruit recSeq;
	
	@OneToOne
	@JoinColumn(name="track_seq", nullable= true)
	private ProjectTracking trackSeq;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User userId;
	
	@Column(name = "pj_title")
	private String pjTitle;
	
	@Column(name = "pj_description")
	private String pjDescription;
	
	@Column(name = "pj_duration")
	private String pjDuration;
	
	@Column(name = "pj_tools")
	private String pjTools;
	
	@Column(name = "pj_category")
	private String pjCategory;
	
	@Column(name = "pj_lang")
	private String pjLang;
	
	@Column(name = "pj_dbms")
	private String pjDbms;
	
	@OneToMany(mappedBy="pjSeq")
	private List<Application> applications;
}	