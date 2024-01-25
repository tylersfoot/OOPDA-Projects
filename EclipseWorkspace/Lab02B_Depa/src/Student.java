
public class Student implements RoleDisplayable {
	private String name;

	public Student(String n) {
		super();
		this.name = n;
	}

    public String getName() {
        return name;
    }

    @Override
	public String toString() {
		return name;
	}
}
