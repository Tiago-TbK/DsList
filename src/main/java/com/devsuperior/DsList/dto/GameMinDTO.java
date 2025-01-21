package com.devsuperior.DsList.dto;

import com.devsuperior.DsList.entities.Game;

import jakarta.persistence.Column;


public class GameMinDTO {


	private Long id;
	private String title;
	@Column(name = "game_year")
	private Integer year;
	private Double score;
	@Column(name = "IMG_Url")
	private String imgUlr;
	@Column(columnDefinition = "TEXT")
	private String shortDescription;
	
	public GameMinDTO() {
		
	}

	public GameMinDTO(Game entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.score = entity.getScore();
		this.imgUlr = entity.getImgUlr();
		this.shortDescription = entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public Double getScore() {
		return score;
	}

	public String getImgUlr() {
		return imgUlr;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
	
}
