package in.cg.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private int id;
	private String name;
	private String email;
	@Autowired
	@Qualifier("createAddressObj2")
	private Address addr;
	@Autowired
	private Subject[] subjects;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	public void display() {
		System.out.println("Id: "+id
				+ "\nName: "+name
				+ "\nEmail: "+email
				+"\nAddress: "+addr
				);
		for(Subject s: subjects) {
			System.out.println(s);
		}
	}
}
