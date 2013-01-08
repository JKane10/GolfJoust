package com.vpm.golfjoust.models;

public class StatsPerGame extends Stats {
	private Long opponentId;
	private Boolean golferFinished;
	private Boolean opponentFinished;
	private Long winnerGolferId;

	public StatsPerGame() {
		super();
	}

	public StatsPerGame(Long golferId, Double drivingAccuracyMe,
			Double drivingAccuracyGj, Double girMe, Double girGj,
			Double puttsGreenMe, Double puttsGreenGj, Double upDownMe,
			Double upDownGj, Double sandSavesMe, Double sandSavesGj,
			Double netScoreAvgMe, Double netScoreAvgGj,
			Integer positionInCurrentLevel, Long opponentId,
			Boolean golferFinished, Boolean opponentFinished,
			Long winnerGolferId) {
		super(golferId, drivingAccuracyMe, drivingAccuracyGj, girMe, girGj,
				puttsGreenMe, puttsGreenGj, upDownMe, upDownGj, sandSavesMe,
				sandSavesGj, netScoreAvgMe, netScoreAvgGj,
				positionInCurrentLevel);

		this.opponentId = opponentId;
		this.golferFinished = golferFinished;
		this.opponentFinished = opponentFinished;
		this.winnerGolferId = winnerGolferId;
	}

	public Long getOpponentId() {
		return opponentId;
	}

	public void setOpponentId(Long opponentId) {
		this.opponentId = opponentId;
	}

	public Boolean getGolferFinished() {
		return golferFinished;
	}

	public void setGolferFinished(Boolean golferFinished) {
		this.golferFinished = golferFinished;
	}

	public Boolean getOpponentFinished() {
		return opponentFinished;
	}

	public void setOpponentFinished(Boolean opponentFinished) {
		this.opponentFinished = opponentFinished;
	}

	public Long getWinnerGolferId() {
		return winnerGolferId;
	}

	public void setWinnerGolferId(Long winnerGolferId) {
		this.winnerGolferId = winnerGolferId;
	}

}
