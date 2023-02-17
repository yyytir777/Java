package object;

class Student{
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return studentId + ", " + studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId) {
				return true;
			}
			else return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentId;
	}
}


public class EqualsTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "Lee");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "Sang");
		
		if(studentLee == studentLee2) { //인스턴스 주소값이 같은지 비교
			System.out.println("Equal studentLee to studentLee2");
		}
		else {
			System.out.println("Not equal studentLee to studentLee2");
		}
		
		if(studentLee.equals(studentLee2)) { //재정의한 equals()로 학생id가 같은지 비교
			System.out.println("Equal studentLee to studentLee2");
		}
		else {
			System.out.println("Not equal studentLee to studentLee2");
		}
		
		System.out.println("studentLee의 hashCode : " + studentLee.hashCode());
		System.out.println("studentSang의 hashCode : " + studentSang.hashCode());
		
		//실제 인스턴스의 주소값
		System.out.println("studentLee의 실제 주소값 : " + System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 주소값 : " + System.identityHashCode(studentSang));
		
	}

}
