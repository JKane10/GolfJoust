package com.vpm.golfjoust.models;

public class Stats extends BaseGolfJoustDomainClass {
	private Long golferId;
	private Double drivingAccuracyMe;
	private Double drivingAccuracyGj;
	private Double girMe;
	private Double girGj;
	private Double puttsGreenMe;
	private Double puttsGreenGj;
	private Double upDownMe;
	private Double upDownGj;
	private Double sandSavesMe;
	private Double sandSavesGj;
	private Double netScoreAvgMe;
	private Double netScoreAvgGj;
	private Integer positionInCurrentLevel;

	public Stats() {
		super();
	}

	public Stats(Long golferId, Double drivingAccuracyMe,
			Double drivingAccuracyGj, Double girMe, Double girGj,
			Double puttsGreenMe, Double puttsGreenGj, Double upDownMe,
			Double upDownGj, Double sandSavesMe, Double sandSavesGj,
			Double netScoreAvgMe, Double netScoreAvgGj,
			Integer positionInCurrentLevel) {
		super();
		this.golferId = golferId;
		this.drivingAccuracyMe = drivingAccuracyMe;
		this.drivingAccuracyGj = drivingAccuracyGj;
		this.girMe = girMe;
		this.girGj = girGj;
		this.puttsGreenMe = puttsGreenMe;
		this.puttsGreenGj = puttsGreenGj;
		this.upDownMe = upDownMe;
		this.upDownGj = upDownGj;
		this.sandSavesMe = sandSavesMe;
		this.sandSavesGj = sandSavesGj;
		this.netScoreAvgMe = netScoreAvgMe;
		this.netScoreAvgGj = netScoreAvgGj;
		this.positionInCurrentLevel = positionInCurrentLevel;
	}

	public Long getGolferId() {
		return golferId;
	}

	public void setGolferId(Long golferId) {
		this.golferId = golferId;
	}

	public Double getDrivingAccuracyMe() {
		return drivingAccuracyMe;
	}

	public void setDrivingAccuracyMe(Double drivingAccuracyMe) {
		this.drivingAccuracyMe = drivingAccuracyMe;
	}

	public Double getDrivingAccuracyGj() {
		return drivingAccuracyGj;
	}

	public void setDrivingAccuracyGj(Double drivingAccuracyGj) {
		this.drivingAccuracyGj = drivingAccuracyGj;
	}

	public Double getGirMe() {
		return girMe;
	}

	public void setGirMe(Double girMe) {
		this.girMe = girMe;
	}

	public Double getGirGj() {
		return girGj;
	}

	public void setGirGj(Double girGj) {
		this.girGj = girGj;
	}

	public Double getPuttsGreenMe() {
		return puttsGreenMe;
	}

	public void setPuttsGreenMe(Double puttsGreenMe) {
		this.puttsGreenMe = puttsGreenMe;
	}

	public Double getPuttsGreenGj() {
		return puttsGreenGj;
	}

	public void setPuttsGreenGj(Double puttsGreenGj) {
		this.puttsGreenGj = puttsGreenGj;
	}

	public Double getUpDownMe() {
		return upDownMe;
	}

	public void setUpDownMe(Double upDownMe) {
		this.upDownMe = upDownMe;
	}

	public Double getUpDownGj() {
		return upDownGj;
	}

	public void setUpDownGj(Double upDownGj) {
		this.upDownGj = upDownGj;
	}

	public Double getSandSavesMe() {
		return sandSavesMe;
	}

	public void setSandSavesMe(Double sandSavesMe) {
		this.sandSavesMe = sandSavesMe;
	}

	public Double getSandSavesGj() {
		return sandSavesGj;
	}

	public void setSandSavesGj(Double sandSavesGj) {
		this.sandSavesGj = sandSavesGj;
	}

	public Double getNetScoreAvgMe() {
		return netScoreAvgMe;
	}

	public void setNetScoreAvgMe(Double netScoreAvgMe) {
		this.netScoreAvgMe = netScoreAvgMe;
	}

	public Double getNetScoreAvgGj() {
		return netScoreAvgGj;
	}

	public void setNetScoreAvgGj(Double netScoreAvgGj) {
		this.netScoreAvgGj = netScoreAvgGj;
	}

	public Integer getPositionInCurrentLevel() {
		return positionInCurrentLevel;
	}

	public void setPositionInCurrentLevel(Integer positionInCurrentLevel) {
		this.positionInCurrentLevel = positionInCurrentLevel;
	}

}
