package day12;

public class IntelliQ {
	int fee;
	String course;
	public void courseDetails(int fee,String course)
	{
		this.fee=fee;
		this.course=course;
	}
	public static void main(String[] args) {
		IntelliQ i=new IntelliQ();
		i.courseDetails(5000,"Selenium");
		System.out.println(i.fee+"---"+i.course);

	}

}


