package com.vpm.golfjoust.models;

import java.util.List;

public class Hole extends BaseGolfJoustDomainClass {
	private Long id;
	private Long holeId;
	private Integer par;
	private Double handicap;
	private String description;
	private Boolean isSignatureHole;
	private String proTips;
	private String imageUrl;
	private List<Tee> tees;

	public Hole() {
		super();
	}

	public Hole(Long id, Long holeId, Integer par, Double handicap,
			String description, Boolean isSignatureHole, String proTips,
			String imageUrl, List<Tee> tees) {
		super();
		this.id = id;
		this.holeId = holeId;
		this.par = par;
		this.handicap = handicap;
		this.description = description;
		this.isSignatureHole = isSignatureHole;
		this.proTips = proTips;
		this.imageUrl = imageUrl;
		this.tees = tees;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getHoleId() {
		return holeId;
	}

	public void setHoleId(Long holeId) {
		this.holeId = holeId;
	}

	public Integer getPar() {
		return par;
	}

	public void setPar(Integer par) {
		this.par = par;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIsSignatureHole() {
		return isSignatureHole;
	}

	public void setIsSignatureHole(Boolean isSignatureHole) {
		this.isSignatureHole = isSignatureHole;
	}

	public String getProTips() {
		return proTips;
	}

	public void setProTips(String proTips) {
		this.proTips = proTips;
	}

	public Double getHandicap() {
		return handicap;
	}

	public void setHandicap(Double handicap) {
		this.handicap = handicap;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public List<Tee> getTees() {
		return tees;
	}

	public void setTees(List<Tee> tees) {
		this.tees = tees;
	}
}
