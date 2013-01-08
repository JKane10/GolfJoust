package com.vpm.golfjoust.models;

/**
 * GolfJoust User Class
 */
public class User extends BaseGolfJoustDomainClass {
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private Integer golferLevelId;
	private Integer homeCourseId;
	private String homeCourse;
	private String course;
	private Double currentHandicap;
	private String password;
	private String token;
	private String linkedInId;
	private String facebookId;
	private String twitterId;
	private Integer hasUnfinishedGame;
	private Long unfinishedGameId;
	private String lastGameActivity;
	private String golfCourseName;
	private GameLevel gameLevel;

	public User(Long id, String firstName, String lastName, String email,
			Integer golferLevelId, Integer homeCourseId, String homeCourse,
			String course, Double currentHandicap, String password,
			String token, String linkedInId, String facebookId,
			String twitterId, Integer hasUnfinishedGame, Long unfinishedGameId,
			String lastGameActivity, String golfCourseName, GameLevel gameLevel) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.golferLevelId = golferLevelId;
		this.homeCourseId = homeCourseId;
		this.homeCourse = homeCourse;
		this.course = course;
		this.currentHandicap = currentHandicap;
		this.password = password;
		this.token = token;
		this.linkedInId = linkedInId;
		this.facebookId = facebookId;
		this.twitterId = twitterId;
		this.hasUnfinishedGame = hasUnfinishedGame;
		this.unfinishedGameId = unfinishedGameId;
		this.lastGameActivity = lastGameActivity;
		this.golfCourseName = golfCourseName;
		this.gameLevel = gameLevel;
	}

	public User() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getGolferLevelId() {
		return golferLevelId;
	}

	public void setGolferLevelId(Integer golferLevelId) {
		this.golferLevelId = golferLevelId;
	}

	public Integer getHomeCourseId() {
		return homeCourseId;
	}

	public void setHomeCourseId(Integer homeCourseId) {
		this.homeCourseId = homeCourseId;
	}

	public String getHomeCourse() {
		return homeCourse;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public void setHomeCourse(String homeCourse) {
		this.homeCourse = homeCourse;
	}

	public String getLinkedInId() {
		return linkedInId;
	}

	public void setLinkedInId(String linkedInId) {
		this.linkedInId = linkedInId;
	}

	public String getFacebookId() {
		return facebookId;
	}

	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}

	public String getTwitterId() {
		return twitterId;
	}

	public void setTwitterId(String twitterId) {
		this.twitterId = twitterId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setCurrentHandicap(Double handicap) {
		this.currentHandicap = handicap;
	}

	public Double getCurrentHandicap() {
		return currentHandicap;
	}

	public GameLevel getGameLevel() {
		return gameLevel;
	}

	public void setGameLevel(GameLevel gameLevel) {
		this.gameLevel = gameLevel;
	}

	public Long getUnfinishedGameId() {
		return unfinishedGameId;
	}

	public void setUnfinishedGameId(Long unfinishedGameId) {
		this.unfinishedGameId = unfinishedGameId;
	}

	public Integer getHasUnfinishedGame() {
		return hasUnfinishedGame;
	}

	public void setHasUnfinishedGame(Integer hasUnfinishedGame) {
		this.hasUnfinishedGame = hasUnfinishedGame;
	}

	public String getLastGameActivity() {
		return lastGameActivity;
	}

	public void setLastGameActivity(String lastGameActivity) {
		this.lastGameActivity = lastGameActivity;
	}

	public String getGolfCourseName() {
		return golfCourseName;
	}

	public void setGolfCourseName(String golfCourseName) {
		this.golfCourseName = golfCourseName;
	}
}
