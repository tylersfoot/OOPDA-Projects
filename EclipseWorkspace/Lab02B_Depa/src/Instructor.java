
public class Instructor implements RoleDisplayable {
	private String name;

	public Instructor(String n) {
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

	@Override
	public void displayNameAndRole() {
		System.out.println(this.getName() + ", Instructor");
	}
}
