package Classes;

public class User {

	public int id;
	public String username;
	public String fullName;
	public String nif;
	public String email;
	public String address;
	public String birthdate;
	public String role;
	public String password;

	public User(int id, String username, String fullName, String nif, String email, String address, String birthdate,
			String role, String password) {
		this.id = id;
		this.username = username;
		this.fullName = fullName;
		this.nif = nif;
		this.email = email;
		this.address = address;
		this.birthdate = birthdate;
		this.role = role;
		this.password=password;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}
}