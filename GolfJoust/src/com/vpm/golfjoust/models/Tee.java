package com.vpm.golfjoust.models;

public class Tee extends BaseGolfJoustDomainClass {

	private Integer id;
	private String name;
	private Double avgYardage;
	private Double totalYardage;
	private Double slope;
	private Double rating;

	public Tee() {
		super();
	}

	public Tee(Integer id, String name, Double avgYardage, Double totalYardage,
			Double slope, Double rating) {
		super();
		this.id = id;
		this.name = name;
		this.avgYardage = avgYardage;
		this.totalYardage = totalYardage;
		this.slope = slope;
		this.rating = rating;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAvgYardage() {
		return avgYardage;
	}

	public void setAvgYardage(Double avgYardage) {
		this.avgYardage = avgYardage;
	}

	public Double getTotalYardage() {
		return totalYardage;
	}

	public void setTotalYardage(Double totalYardage) {
		this.totalYardage = totalYardage;
	}

	public Double getSlope() {
		return slope;
	}

	public void setSlope(Double slope) {
		this.slope = slope;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}
}
