package Student;

public class Student {
     String name,qualification,streem;
     int yop;
	public Student(String name, String qualification, String streem, int yop) {
		
		this.name = name;
		this.qualification = qualification;
		this.streem = streem;
		this.yop = yop;
	}
	public static void main(String[] args) {
		Student s1=new Student("bharu","btech","ece",2022);
		Student s2=new Student("asifa","btech","cs",2022);
		Student s3=new Student("harshu","btech","ece",2021);
		Student s4=new Student("kavitha","btech","cs",2021);
		Student s5=new Student("sowji","btech","cs",2020);
		Student s6=new Student("chinni","btech","mech",2022);
		Student x[]= {s1,s2,s3,s4,s5,s6};
		for (int i=0;i<=x.length-1;i++) {
			if(x[i].qualification.equals("btech")) {
				System.out.println(x[i].name+" "+"btech:qualification");
			}
			if(x[i].yop==2022 || x[i].yop==2021) {
				System.out.println(x[i].name);
			}
			if(x[i].streem.equals("cs")) {
				System.out.println(x[i].name+" "+"cs:streem");
			}
			if(x[i].yop==2022 && x[i].qualification.equals("btech")&&x[i].streem.equals("cs")) {
				System.out.println(x[i].name+" "+"2022:btech:cs");
			}
			if(x[i].yop==2022 && (x[i].streem.equals("cs")||x[i].streem.equals("ece"))) {
				System.out.println(x[i].name+"  "+"2022:cs or ece");
			}
			
			
			
			
			
			}
		}
     
}
     
