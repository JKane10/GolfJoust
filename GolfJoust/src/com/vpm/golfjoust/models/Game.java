package com.vpm.golfjoust.models;

import java.util.List;

public class Game extends BaseGolfJoustDomainClass {

	private Long id;
	private Boolean hasOpponent;
	private Long opponentGolferId;
	private String opponentGolferName;
	private Double opponentHandicap;
	private Double opponentTotalGrossScore;
	private Double opponentTotalNetScore;
	private Long golfCourseId;
	private String golfCourseName;
	private String dateStarted;
	private Integer gameTypeId; // 1 = plays alone, 2 = against opponent
	private List<HoleScore> holeScores;
	private Integer numberOfGolfCourseHoles;
	private List<Hole> holes;

	public Game() {
		super();
	}

	public Game(Long id, Long opponentGolferId, Boolean hasOpponent,
			String opponentGolferName, Double opponentHandicap,
			Double opponentTotalGrossScore, Double opponentTotalNetScore,
			Long golfCourseId, String golfCourseName, String dateStarted,
			Integer gameTypeId, List<HoleScore> holeScores,
			Integer numberOfGolfCourseHoles, List<Hole> holes) {
		super();
		this.id = id;
		this.opponentGolferId = opponentGolferId;
		this.hasOpponent = hasOpponent;
		this.opponentGolferName = opponentGolferName;
		this.opponentHandicap = opponentHandicap;
		this.opponentTotalGrossScore = opponentTotalGrossScore;
		this.opponentTotalNetScore = opponentTotalNetScore;
		this.golfCourseId = golfCourseId;
		this.golfCourseName = golfCourseName;
		this.dateStarted = dateStarted;
		this.gameTypeId = gameTypeId;
		this.holeScores = holeScores;
		this.numberOfGolfCourseHoles = numberOfGolfCourseHoles;
		this.holes = holes;
	}

	public Game(Long id, Long opponentGolferId) {
		super();
		this.id = id;
		this.opponentGolferId = opponentGolferId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOpponentGolferId() {
		return opponentGolferId;
	}

	public void setOpponentGolferId(Long opponentGolferId) {
		this.opponentGolferId = opponentGolferId;
	}

	public Boolean getHasOpponent() {
		return hasOpponent;
	}

	public void setHasOpponent(Boolean hasOpponent) {
		this.hasOpponent = hasOpponent;
	}

	public String getOpponentGolferName() {
		return opponentGolferName;
	}

	public void setOpponentGolferName(String opponentGolferName) {
		this.opponentGolferName = opponentGolferName;
	}

	public Double getOpponentHandicap() {
		return opponentHandicap;
	}

	public void setOpponentHandicap(Double opponentHandicap) {
		this.opponentHandicap = opponentHandicap;
	}

	public Double getOpponentTotalGrossScore() {
		return opponentTotalGrossScore;
	}

	public void setOpponentTotalGrossScore(Double opponentTotalGrossScore) {
		this.opponentTotalGrossScore = opponentTotalGrossScore;
	}

	public Double getOpponentTotalNetScore() {
		return opponentTotalNetScore;
	}

	public void setOpponentTotalNetScore(Double opponentTotalNetScore) {
		this.opponentTotalNetScore = opponentTotalNetScore;
	}

	public Long getGolfCourseId() {
		return golfCourseId;
	}

	public void setGolfCourseId(Long golfCourseId) {
		this.golfCourseId = golfCourseId;
	}

	public String getGolfCourseName() {
		return golfCourseName;
	}

	public void setGolfCourseName(String golfCourseName) {
		this.golfCourseName = golfCourseName;
	}

	public String getDateStarted() {
		return dateStarted;
	}

	public void setDateStarted(String dateStarted) {
		this.dateStarted = dateStarted;
	}

	public Integer getGameTypeId() {
		return gameTypeId;
	}

	public void setGameTypeId(Integer gameTypeId) {
		this.gameTypeId = gameTypeId;
	}

	public List<HoleScore> getHoleScores() {
		return holeScores;
	}

	public void setHoleScores(List<HoleScore> holeScores) {
		this.holeScores = holeScores;
	}

	public Integer getNumberOfGolfCourseHoles() {
		return numberOfGolfCourseHoles;
	}

	public void setNumberOfGolfCourseHoles(Integer numberOfGolfCourseHoles) {
		this.numberOfGolfCourseHoles = numberOfGolfCourseHoles;
	}

	public List<Hole> getHoles() {
		return holes;
	}

	public void setHoles(List<Hole> holes) {
		this.holes = holes;
	}

}
