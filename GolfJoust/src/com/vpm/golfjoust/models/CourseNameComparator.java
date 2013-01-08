package com.vpm.golfjoust.models;

/* TODO Refactor the comparators in this package and replace all of them
 * with one generic comparator
 */

/**
 * Custom comparator which is used in sorting the courses by name
 */
import java.util.Comparator;

public class CourseNameComparator implements Comparator<Course> {

	public int compare(Course object1, Course object2) {
		return object1.getCourseName().compareTo(object2.getCourseName());
	}

}
