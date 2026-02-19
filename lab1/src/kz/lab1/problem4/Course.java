package kz.lab1.problem4;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
	private String name;
	private String description;
	private int credits;
	private List<Course> prerequisites;
	
	public Course(String name) {
		this(name, "no description", 0, new ArrayList<>());
	}
	
	public Course(String name, String description) {
		this(name, description, 0, new ArrayList<>());
	}
	
	public Course(String name, String description, int credits) {
		this(name, description, credits, new ArrayList<>());
	}
	
	public Course(String name, String description, int credits, List<Course> prerequisites) {
		this.name = name;
		this.description = description;
		this.credits = credits;
		this.prerequisites = prerequisites != null ? prerequisites : new ArrayList<>();
	}
	
	public String getName() { return name; }
	public String getDescription() { return description; }
	public int getCredits() { return credits; }
	public List<Course> getPrerequisites() { return prerequisites; }
	
	@Override
	public String toString() {
		return String.format("Course{name = '%s', description = '%s', credits = %d, prerequisites = %s}", name, description, credits, getPrerequisitesNames());
	}
	
	private String getPrerequisitesNames() {
		if (prerequisites.isEmpty()) {
			return "None";
		}
		List<String> names = new ArrayList<>();
		for (Course c : prerequisites) {
			names.add(c.getName());
		}
		return String.join(", ", names);
	}

}
