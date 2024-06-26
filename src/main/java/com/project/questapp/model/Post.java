package com.project.questapp.model;



import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "post")
@Data
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	//EAGER-Postu çektiğimde user da beraber gelsin
	//LAZY - Postu çektiğimde user i hemen getirme
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	//user silinirse ilgili postlarıda sil
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
	User user;

	String title;
	@Lob
	@Column(columnDefinition = "text")
	String text;
}
