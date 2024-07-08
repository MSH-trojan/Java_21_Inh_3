package inh_3;

public class Inh_3 {
	public static void main(String[] args) {
		Student[] s = new Student[20];
		
		char[] c = new char[20];
		
		s[0] = new Undergrad("John", 201234567, "ITEC", 1);
		c[0] = 'u';
		s[1] = new Undergrad("Mary", 212534597, "MATH", 2);
		c[1] = 'u';
		s[2] = new PhdStudent("Tom", 244433811, "Prince", 5000.0);
		c[2] = 'u';
		s[3] = new Undergrad("Jimmy", 251234569, "ITEC", 1);
		c[3] = 'p';
		System.out.println("List:");
				
		for(int i = 0 ; i <= 3 ; i++) {			//if you put i < s.length() it would make just 96 more empty lines above the information.
			if(c[i] == 'u')
			System.out.println(s[i] + "	fees: $: " + s[i].calculateFees());
			else if(c[i] == 'p')
			System.out.println(s[i] + "	fees: $: " + s[i].getFee());
			
			System.out.println();
		}
	}
}

class Student{
	
	private String name;
	private long number;
	
	
	
	public Student(String aName , long aNumber) {
		name = aName;
		number = aNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public long getNumber() {
		return number;
	}
	
	public String toString() {
		return "Student_Specs: \n[Name: " + name + "   STD_Number: " + number + "]";
	}
	
	public double calculateFees() {
		double courseload = 5.0;
		double fee = 800.0;
		return fee * courseload;
	}
	
	public double getFee() {
		return   0.0;
	}
	
}

class Undergrad extends Student{
	private String major;
	private int year;
	
	public Undergrad(String aName , long aNumber , String aMajor , int aYear) {
		super(aName , aNumber);
		major = aMajor;
		year = aYear;
	}
	
	
	public String toString() {
		return "Undergrad_Student_Specs: \n[Name: " + getName() + "   STD_Number: " + getNumber() + "   Major: " + major + "   Year_of_Study: " + year + "]";
	}
	
	


	public double calculateFees() {
		double fee = super.calculateFees();
		
		if(year == 1) {
			return fee += 100;
		}
		else {
			return fee += 150;
		}
		
	}
}


class PhdStudent extends Student{
	
	private String supervisor_name;
	private double yearly_fee;
	
	public  PhdStudent(String aName , long aNumber , String SN , double YF) {
		super(aName , aNumber);
		supervisor_name = SN;
		yearly_fee = YF;
	}
	
	public String toString() {
		return "PHD_Student_Specs: \n[Name: " + getName() + "   STD_Number: " + getNumber() + "   supervisor_name " + supervisor_name + "   Yearly_fee: " + yearly_fee + "]";
	}
	
	public double getFee() {
		return yearly_fee;
	}
	
	
	
	
}