// Employee Wage Computation Problem //

class Wage_Cal{
	public static final int Is_Full_Time = 1 ;
	public static final int Is_Part_Time = 2;
	public static final int Total_Work_Day = 20;
	static final int Total_Working_Hr_Month = 100;
	int emp_FullDay_Hr = 0 ;
	int emp_Wage = 0 ;
	int total_EmpWage=0;		
	int total_working_day=0;
	int total_empHrs = 0;
	
	public void wage_Compute(int Emp_Rate_PerHr){
			emp_Wage = Emp_Rate_PerHr * emp_FullDay_Hr ;		
	}
	public void wage_display(String company){
		System.out.println("Wages for " + company);
		System.out.println("Totla Working hours " + total_empHrs );
		System.out.println("Employee Total wage For a Month : " + total_EmpWage);
	}
	public void emp_Wage_Cal(String company, int Emp_Rate_PerHr){
		while(total_working_day < Total_Work_Day && total_empHrs < Total_Working_Hr_Month ){
			total_working_day++;
			int empCheck = (int) Math.floor(Math.random()*10) % 3 ;		
			switch (empCheck){
				case Is_Full_Time :
					emp_FullDay_Hr = 8;
				break ;
		    	case Is_Part_Time :
					emp_FullDay_Hr = 4 ;
				break ;
				default:
					emp_FullDay_Hr = 0;
				break ;
			}
			total_EmpWage += emp_Wage ;
			total_empHrs += emp_FullDay_Hr;
			wage_Compute(Emp_Rate_PerHr);	
		}	
			wage_display(company);
	}
}
class EmployeeWageBuilder {
	public static void welcome(){
		System.out.println("Welcome To Employee Wage Computation ");
	}
	public static void main(String[] args){
		welcome();
		Wage_Cal d_wagecal= new Wage_Cal();
		Wage_Cal k_wagecal= new Wage_Cal();
		d_wagecal.emp_Wage_Cal("Dmart",20);
		k_wagecal.emp_Wage_Cal("Kmart",20);
	}
}