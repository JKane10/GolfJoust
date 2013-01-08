package com.vpm.golfjoust.models;

import java.util.List;

public class Score extends BaseGolfJoustDomainClass {
	private Long grossScore;
	private Long netScore;
	private Boolean isScoreFinal;
	private List<HoleScore> holeScores;

	public Score() {
		super();
	}

	public Score(Long grossScores, Long netScores, Boolean isScoreFinal,
			List<HoleScore> holeScores) {
		super();
		this.grossScore = grossScores;
		this.netScore = netScores;
		this.isScoreFinal = isScoreFinal;
		this.holeScores = holeScores;
	}

	public Long getGrossScore() {
		return grossScore;
	}

	public void setGrossScore(Long grossScores) {
		this.grossScore = grossScores;
	}

	public Long getNetScore() {
		return netScore;
	}

	public void setNetScore(Long netScores) {
		this.netScore = netScores;
	}

	public Boolean getIsScoreFinal() {
		return isScoreFinal;
	}

	public void setIsScoreFinal(Boolean isScoreFinal) {
		this.isScoreFinal = isScoreFinal;
	}

	public List<HoleScore> getHoleScores() {
		return holeScores;
	}

	public void setHoleScores(List<HoleScore> holeScores) {
		this.holeScores = holeScores;
	}
}
