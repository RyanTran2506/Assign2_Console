
import java.util.ArrayList;

public class Project {

	
	
	public static void Main(String[] args) {
		ArrayList<Member> groupMembers = new ArrayList<Member>();
		
		Member m1 = new Member();
		m1.setStudentID("300300123");
		m1.setName("Ryan");
		m1.setGender("Male");
		m1.setResponsibility("do code");
		
		groupMembers.add(m1);
		
		//test
		
		Member m2 = new Member();
		m1.setStudentID("300300323");
		m1.setName("Ros");
		m1.setGender("Female");
		m1.setResponsibility("do documents");
		
		groupMembers.add(m2);
	}
}
