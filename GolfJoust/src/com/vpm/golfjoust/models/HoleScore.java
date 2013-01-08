package com.vpm.golfjoust.models;

public class HoleScore extends BaseGolfJoustDomainClass {
	private Integer holeNumber;
	private Integer par;
	private Integer grossScore;
	private Integer netScore;
	private Integer totalPutts;
	private Integer fairwayHit;
	private Integer gir;
	private Integer upDown;
	private Integer sandSave;

	public HoleScore() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HoleScore(Integer holeNumber, Integer par, Integer grossScore,
			Integer netScore, Integer totalPutts, Integer fairwayHit,
			Integer gir, Integer upDown, Integer sandSave) {
		super();
		this.holeNumber = holeNumber;
		this.par = par;
		this.grossScore = grossScore;
		this.netScore = netScore;
		this.totalPutts = totalPutts;
		this.fairwayHit = fairwayHit;
		this.gir = gir;
		this.upDown = upDown;
		this.sandSave = sandSave;
	}

	public Integer getHoleNumber() {
		return holeNumber;
	}

	public void setHoleNumber(Integer holeNumber) {
		this.holeNumber = holeNumber;
	}

	public Integer getPar() {
		return par;
	}

	public void setPar(Integer par) {
		this.par = par;
	}

	public Integer getGrossScore() {
		return grossScore;
	}

	public void setGrossScore(Integer grossScore) {
		this.grossScore = grossScore;
	}

	public Integer getTotalPutts() {
		return totalPutts;
	}

	public void setTotalPutts(Integer totalPutts) {
		this.totalPutts = totalPutts;
	}

	public Integer getNetScore() {
		return netScore;
	}

	public void setNetScore(Integer netScore) {
		this.netScore = netScore;
	}

	public Integer getFairwayHit() {
		return fairwayHit;
	}

	public void setFairwayHit(Integer fairwayHit) {
		this.fairwayHit = fairwayHit;
	}

	public Integer getGir() {
		return gir;
	}

	public void setGir(Integer gir) {
		this.gir = gir;
	}

	public Integer getUpDown() {
		return upDown;
	}

	public void setUpDown(Integer upDown) {
		this.upDown = upDown;
	}

	public Integer getSandSave() {
		return sandSave;
	}

	public void setSandSave(Integer sandSave) {
		this.sandSave = sandSave;
	}
}
