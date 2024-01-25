
public interface RoleDisplayable {

	public default void displayNameAndRole() {
		if (this instanceof Student) {
			System.out.println(((Student)this).getName() + ", Student");
		}
		
	}
}
