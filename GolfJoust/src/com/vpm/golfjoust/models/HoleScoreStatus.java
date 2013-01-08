package com.vpm.golfjoust.models;

public class HoleScoreStatus extends BaseGolfJoustDomainClass {
	public HoleScore holeScore;
	public boolean scoreUploaded;

	public HoleScoreStatus() {
		this.holeScore = new HoleScore();
	}
}
