package InterfacePractice;

public class CourseSession implements Comparable<CourseSession>{
	public int compareTo(CourseSession that) {
		return this.getDepartment().compareTo((that.getDepartment());
	}

	private CourseSession getDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

}
