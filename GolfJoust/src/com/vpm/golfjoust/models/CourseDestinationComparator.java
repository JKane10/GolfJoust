package com.vpm.golfjoust.models;

import java.util.Comparator;

public class CourseDestinationComparator implements Comparator<Course> {
	
	public int compare(Course object1, Course object2) {
		return object1.getRelativeDistance().compareTo(
				object2.getRelativeDistance());
	}

}
