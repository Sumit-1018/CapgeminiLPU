package in.cg.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.cg.beans.Address;
import in.cg.beans.Student;
import in.cg.beans.Subject;

@Configuration
public class JavaConfigFile {
	
	@Bean
	public Address createAddressObj() {
		Address a=new Address();
		a.sethNo(123);
		a.setCity("Pune");
		a.setPincode(11045);
		return a;
	}
	@Bean
	public Address createAddressObj2() {
		Address a=new Address();
		a.sethNo(123);
		a.setCity("Puneaaa");
		a.setPincode(11045);
		return a;
	}
	
	@Bean
	public Subject createSubjectObj() {
		Subject s=new Subject();
		s.setSubName("Java");
		return s;
		
	}
	@Bean
	public Subject subject2(){
	   Subject s=new Subject();
	   s.setSubName("Spring");
	   return s;
	}
	@Bean
	public Subject subject3(){
	   Subject s=new Subject();
	   s.setSubName("React");
	   return s;
	}
	@Bean
	public Subject subject4(){
	   Subject s=new Subject();
	   s.setSubName("Docker");
	   return s;
	}
	
	@Bean
	public Student stdId() {
		Student std=new Student();
		std.setId(101);
		std.setName("Sumit");
		std.setEmail("random@email.com");
		//std.setAddr(createAddressObj());      //manual wiring
		return std;	
	}
	
	
}
