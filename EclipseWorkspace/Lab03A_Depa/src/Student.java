
public class Student implements Comparable<Student> {
	private String name;
	private int id;
	private int birthdate;

	public Student(String name, int id, int birthdate) {
		super();
		this.name = name;
		this.id = id;
		this.birthdate = birthdate;
	}

    public String getName() {
        return name;
    }

	public int getId() {
		return id;
	}

	public int getBirthdate() {
		return birthdate;
	}

	@Override
	public String toString() {
		return name + "\t" + id + "\t" + birthdate;
	}

	@Override
    public int compareTo(Student s) {
        int compare = this.getId() - s.getId();
		// clamp between -1 and 1
		compare = (compare < 0) ? -1 : (compare > 0) ? 1 : 0;
        return compare;
    }

}
