package com.gaepom.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class User {
	@Id
	@Column(name="user_id")
	private String userId;

	private String password;

	private String name;

	private int age;

	private String email;

	@Column(name="phone_num")
	private String phoneNum; 

	private String address;

	private String stack;

	@Column(name="user_image", nullable=true)
	private String userImage;

	private String position;
	
	@OneToMany(mappedBy="userId")
	private List<Portfolio> portfolios;
	
	@OneToMany(mappedBy="userId")
	private List<Project> projects;

}
