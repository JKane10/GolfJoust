package com.vpm.golfjoust.models;

import java.util.List;

public class CheckedInCourse extends BaseGolfJoustDomainClass {
	private Long courseId;
	private String name;
	private Integer numberOfHoles;
	private Integer totalPar;
	private List<Tee> tees;
	private List<Hole> holes;

	public CheckedInCourse() {
		super();
	}

	public CheckedInCourse(Long id, String name, Integer numberOfHoles,
			Integer totalPar, List<Tee> tees, List<Hole> holes) {
		super();
		this.courseId = id;
		this.name = name;
		this.numberOfHoles = numberOfHoles;
		this.totalPar = totalPar;
		this.tees = tees;
		this.holes = holes;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumberOfHoles() {
		return numberOfHoles;
	}

	public void setNumberOfHoles(Integer numberOfHoles) {
		this.numberOfHoles = numberOfHoles;
	}

	public Integer getTotalPar() {
		return totalPar;
	}

	public void setTotalPar(Integer totalPar) {
		this.totalPar = totalPar;
	}

	public List<Tee> getTees() {
		return tees;
	}

	public void setTees(List<Tee> tees) {
		this.tees = tees;
	}

	public List<Hole> getHoles() {
		return holes;
	}

	public void setHoles(List<Hole> holes) {
		this.holes = holes;
	}
}
