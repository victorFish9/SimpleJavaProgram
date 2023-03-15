package array;

public class Contact {
	private String name;
    private String email;
    private String phone;
    public Contact() {
    	
    }

    public Contact(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    
	public String getName() {
        return this.name;
    }


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name + " (email: " + this.email + ", phone: " + this.phone + ")";
	}
}
