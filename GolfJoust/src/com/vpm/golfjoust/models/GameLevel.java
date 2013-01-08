package com.vpm.golfjoust.models;

public class GameLevel extends BaseGolfJoustDomainClass {
	private Integer currentLevelId;
	private String currentLevel;
	private Integer gamesPlayedTotal;
	private Integer gamesPlayedInCurrentLevel;
	private Integer winsInCurrentLevel;
	private Integer winsTotal;
	private Integer gamesForNextLevel;
	private Integer winsForNextLevel;
	private Integer gamesForRetainingLevel;
	private Integer winsForRetainingLevel;
	private String currentLevelValidBy; // TODO Ask about the string format

	public GameLevel() {
		super();
	}

	public GameLevel(Integer currentLevelId, String currentLevel,
			Integer gamesPlayedTotal, Integer gamesPlayedInCurrentLevel,
			Integer winsInCurrentLevel, Integer winsTotal,
			Integer gamesForNextLevel, Integer winsForNextLevel,
			Integer gamesForRetainingLevel, Integer winsForRetainingLevel,
			String currentLevelValidBy) {
		super();
		this.currentLevelId = currentLevelId;
		this.currentLevel = currentLevel;
		this.gamesPlayedTotal = gamesPlayedTotal;
		this.gamesPlayedInCurrentLevel = gamesPlayedInCurrentLevel;
		this.winsInCurrentLevel = winsInCurrentLevel;
		this.winsTotal = winsTotal;
		this.gamesForNextLevel = gamesForNextLevel;
		this.winsForNextLevel = winsForNextLevel;
		this.gamesForRetainingLevel = gamesForRetainingLevel;
		this.winsForRetainingLevel = winsForRetainingLevel;
		this.currentLevelValidBy = currentLevelValidBy;
	}

	public Integer getCurrentLevelId() {
		return currentLevelId;
	}

	public void setCurrentLevelId(Integer currentLevelId) {
		this.currentLevelId = currentLevelId;
	}

	public String getCurrentLevel() {
		return currentLevel;
	}

	public void setCurrentLevel(String currentLevel) {
		this.currentLevel = currentLevel;
	}

	public Integer getGamesPlayedTotal() {
		return gamesPlayedTotal;
	}

	public void setGamesPlayedTotal(Integer gamesPlayedTotal) {
		this.gamesPlayedTotal = gamesPlayedTotal;
	}

	public Integer getGamesPlayedInCurrentLevel() {
		return gamesPlayedInCurrentLevel;
	}

	public void setGamesPlayedInCurrentLevel(Integer gamesPlayedInCurrentLevel) {
		this.gamesPlayedInCurrentLevel = gamesPlayedInCurrentLevel;
	}

	public Integer getWinsInCurrentLevel() {
		return winsInCurrentLevel;
	}

	public void setWinsInCurrentLevel(Integer winsInCurrentLevel) {
		this.winsInCurrentLevel = winsInCurrentLevel;
	}

	public Integer getWinsTotal() {
		return winsTotal;
	}

	public void setWinsTotal(Integer winsTotal) {
		this.winsTotal = winsTotal;
	}

	public Integer getGamesForNextLevel() {
		return gamesForNextLevel;
	}

	public void setGamesForNextLevel(Integer gamesForNextLevel) {
		this.gamesForNextLevel = gamesForNextLevel;
	}

	public Integer getWinsForNextLevel() {
		return winsForNextLevel;
	}

	public void setWinsForNextLevel(Integer winsForNextLevel) {
		this.winsForNextLevel = winsForNextLevel;
	}

	public Integer getGamesForRetainingLevel() {
		return gamesForRetainingLevel;
	}

	public void setGamesForRetainingLevel(Integer gamesForRetainingLevel) {
		this.gamesForRetainingLevel = gamesForRetainingLevel;
	}

	public Integer getWinsForRetainingLevel() {
		return winsForRetainingLevel;
	}

	public void setWinsForRetainingLevel(Integer winsForRetainingLevel) {
		this.winsForRetainingLevel = winsForRetainingLevel;
	}

	public String getCurrentLevelValidBy() {
		return currentLevelValidBy;
	}

	public void setCurrentLevelValidBy(String currentLevelValidBy) {
		this.currentLevelValidBy = currentLevelValidBy;
	}
}
