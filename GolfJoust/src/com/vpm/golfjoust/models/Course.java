package com.vpm.golfjoust.models;

/**
 * GolfJoust Course Class
 */

public class Course extends BaseGolfJoustDomainClass {
	private Long id;
	private String name;
	private String contactFirstName;
	private String contactPosition;
	private String email;
	private String website;
	private String courseAddress;
	private String city;
	private String zipcode;
	private String state;
	private String phones;
	private Double longitude;
	private Double latitude;
	private String directions;
	private Integer golfClubId;
	private String contactLastname;
	private String mailingAddress;
	private String facebookLink;
	private String twitterHandle;
	private String rates;
	private Double rateWeekday;
	private Double rateWeekend;
	private Boolean amGolfCarts;
	private Boolean amPullCarts;
	private Boolean amWalkingAllowedWeekday;
	private Boolean amWalkingAllowedWeekend;
	private Boolean amFullServiceBar;
	private Boolean amProShop;
	private Boolean amRestaurantOnSite;
	private Boolean amOnCourseBeverageCart;
	private Boolean amBagDrop;
	private Boolean amRentalClubs;
	private Integer slope;
	private Double rating;
	private Double relativeDistance;
	private String description;
	private String logoUrl;

	public Course(Long id, String name, String contactFirstName,
			String contactPosition, String email, String website,
			String courseAddress, String city, String zipcode, String state,
			String phones, Double longitude, Double latitude,
			String directions, Integer golfClubId, String contactLastname,
			String mailingAddress, String facebookLink, String twitterHandle,
			String rates, Double rateWeekday, Double rateWeekend,
			Boolean amGolfCarts, Boolean amPullCarts,
			Boolean amWalkingAllowedWeekday, Boolean amWalkingAllowedWeekend,
			Boolean amFullServiceBar, Boolean amProShop,
			Boolean amRestaurantOnSite, Boolean amOnCourseBeverageCart,
			Boolean amBagDrop, Boolean amRentalClubs, Integer slope,
			Double rating, Double relativeDistance, String description,
			String logoUrl) {
		super();
		this.id = id;
		this.name = name;
		this.contactFirstName = contactFirstName;
		this.contactPosition = contactPosition;
		this.email = email;
		this.website = website;
		this.courseAddress = courseAddress;
		this.city = city;
		this.zipcode = zipcode;
		this.state = state;
		this.phones = phones;
		this.longitude = longitude;
		this.latitude = latitude;
		this.directions = directions;
		this.golfClubId = golfClubId;
		this.contactLastname = contactLastname;
		this.mailingAddress = mailingAddress;
		this.facebookLink = facebookLink;
		this.twitterHandle = twitterHandle;
		this.rates = rates;
		this.rateWeekday = rateWeekday;
		this.rateWeekend = rateWeekend;
		this.amGolfCarts = amGolfCarts;
		this.amPullCarts = amPullCarts;
		this.amWalkingAllowedWeekday = amWalkingAllowedWeekday;
		this.amWalkingAllowedWeekend = amWalkingAllowedWeekend;
		this.amFullServiceBar = amFullServiceBar;
		this.amProShop = amProShop;
		this.amRestaurantOnSite = amRestaurantOnSite;
		this.amOnCourseBeverageCart = amOnCourseBeverageCart;
		this.amBagDrop = amBagDrop;
		this.amRentalClubs = amRentalClubs;
		this.slope = slope;
		this.rating = rating;
		this.relativeDistance = relativeDistance;
		this.description = description;
		this.logoUrl = logoUrl;
	}

	public Course() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourseName() {
		return name;
	}

	public void setCourseName(String name) {
		this.name = name;
	}

	public String getContactFirstName() {
		return contactFirstName;
	}

	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}

	public String getContactPosition() {
		return contactPosition;
	}

	public void setContactPosition(String contactPosition) {
		this.contactPosition = contactPosition;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getCourseAddress() {
		return courseAddress;
	}

	public void setCourseAddress(String courseAddress) {
		this.courseAddress = courseAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhones() {
		return phones;
	}

	public void setPhones(String phones) {
		this.phones = phones;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public String getDirections() {
		return directions;
	}

	public void setDirections(String directions) {
		this.directions = directions;
	}

	public Integer getGolfClubId() {
		return golfClubId;
	}

	public void setGolfClubId(Integer golfClubId) {
		this.golfClubId = golfClubId;
	}

	public String getContactLastname() {
		return contactLastname;
	}

	public void setContactLastname(String contactLastname) {
		this.contactLastname = contactLastname;
	}

	public String getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public String getFacebookLink() {
		return facebookLink;
	}

	public void setFacebookLink(String facebookLink) {
		this.facebookLink = facebookLink;
	}

	public String getTwitterHandle() {
		return twitterHandle;
	}

	public void setTwitterHandle(String twitterHandle) {
		this.twitterHandle = twitterHandle;
	}

	public String getRates() {
		return rates;
	}

	public void setRates(String rates) {
		this.rates = rates;
	}

	public Double getRateWeekday() {
		return rateWeekday;
	}

	public void setRateWeekday(Double rateWeekday) {
		this.rateWeekday = rateWeekday;
	}

	public Double getRateWeekend() {
		return rateWeekend;
	}

	public void setRateWeekend(Double rateWeekend) {
		this.rateWeekend = rateWeekend;
	}

	public Boolean getAmGolfCarts() {
		return amGolfCarts;
	}

	public void setAmGolfCarts(Boolean amGolfCarts) {
		this.amGolfCarts = amGolfCarts;
	}

	public Boolean getAmPullCarts() {
		return amPullCarts;
	}

	public void setAmPullCarts(Boolean amPullCarts) {
		this.amPullCarts = amPullCarts;
	}

	public Boolean getAmWalkingAllowedWeekday() {
		return amWalkingAllowedWeekday;
	}

	public void setAmWalkingAllowedWeekday(Boolean amWalkingAllowedWeekday) {
		this.amWalkingAllowedWeekday = amWalkingAllowedWeekday;
	}

	public Boolean getAmWalkingAllowedWeekend() {
		return amWalkingAllowedWeekend;
	}

	public void setAmWalkingAllowedWeekend(Boolean amWalkingAllowedWeekend) {
		this.amWalkingAllowedWeekend = amWalkingAllowedWeekend;
	}

	public Boolean getAmFullServiceBar() {
		return amFullServiceBar;
	}

	public void setAmFullServiceBar(Boolean amFullServiceBar) {
		this.amFullServiceBar = amFullServiceBar;
	}

	public Boolean getAmProShop() {
		return amProShop;
	}

	public void setAmProShop(Boolean amProShop) {
		this.amProShop = amProShop;
	}

	public Boolean getAmRestaurantOnSite() {
		return amRestaurantOnSite;
	}

	public void setAmRestaurantOnSite(Boolean amRestaurantOnSite) {
		this.amRestaurantOnSite = amRestaurantOnSite;
	}

	public Boolean getAmOnCourseBeverageCart() {
		return amOnCourseBeverageCart;
	}

	public void setAmOnCourseBeverageCart(Boolean amOnCourseBeverageCart) {
		this.amOnCourseBeverageCart = amOnCourseBeverageCart;
	}

	public Boolean getAmBagDrop() {
		return amBagDrop;
	}

	public void setAmBagDrop(Boolean amBagDrop) {
		this.amBagDrop = amBagDrop;
	}

	public Boolean getAmRentalClubs() {
		return amRentalClubs;
	}

	public void setAmRentalClubs(Boolean amRentalClubs) {
		this.amRentalClubs = amRentalClubs;
	}

	public Integer getSlope() {
		return slope;
	}

	public void setSlope(Integer slope) {
		this.slope = slope;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Double getRelativeDistance() {
		return relativeDistance;
	}

	public void setRelativeDistance(Double distance) {
		this.relativeDistance = distance;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
}
