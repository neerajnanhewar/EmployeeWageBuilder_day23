// Employee Wage Computation Problem //

class EmployeeWageBuilder {
	private String company;
	private int emp_Rate_PerHr;
	private int total_Work_Day;
	private int working_Hrs;

	public String getCompany(){
		return company;
	}

	public int gettotal_Work_Day(){
		return total_Work_Day;
	}
	public int getworking_Hrs(){
		return working_Hrs;
	}

	public int getEmp_Rate_PerHr(){
		return emp_Rate_PerHr;
	}

	public EmployeeWageBuilder (String company,int total_Work_Day,int working_Hrs,int emp_Rate_PerHr){
		this.company = company;
		this.total_Work_Day = total_Work_Day;
		this.working_Hrs = working_Hrs;
		this.emp_Rate_PerHr = emp_Rate_PerHr;
	}
		
	public void emp_EmployeeWageBuilder(int emp_Rate_PerHr){
		int emp_FullDay_Hr = 0 ;
		int emp_Wage = 0 ;
		int total_EmpWage=0;		
		int total_working_day=0;
		int empCheck = (int) Math.floor(Math.random()*10) % 3 ;		
			switch (empCheck){
				case 0 :
					emp_FullDay_Hr = 8;
				break ;
		    	case 1 :
					emp_FullDay_Hr = 4 ;
				break ;
				default:
					emp_FullDay_Hr = 0;
				break ;
			}
		int dailyWage = dailyWageCompute(working_Hrs,emp_Rate_PerHr);
		System.out.println("Daily full time employee wage is " + dailyWage);
		int monthlyWage = 20 * dailyWage;
		System.out.println("Monthly wage of an employee is " + monthlyWage);
	}

	public static int dailyWageCompute(int working_Hrs, int emp_Rate_PerHr) {
		int dailyWage = emp_Rate_PerHr * working_Hrs;
		return dailyWage;

	}

	public static int monthlyWageCompute(EmployeeWageBuilder empwagecompute) {

		int dailyWage = dailyWageCompute(empwagecompute.working_Hrs, empwagecompute.emp_Rate_PerHr);
		return dailyWage * empwagecompute.total_Work_Day;
	}	
			
	
public static void welcome(){
		System.out.println("Welcome To Employee Wage Computation ");
	}
	public static void main(String[] args){
		welcome();
		EmployeeWageBuilder d_wagecal= new EmployeeWageBuilder("Dmart", 8, 11, 20);
		System.out.print("Company " + d_wagecal.getCompany() + " Total wage is ");
		System.out.println(monthlyWageCompute(d_wagecal));
		EmployeeWageBuilder k_wagecal= new EmployeeWageBuilder("Kmart", 10, 8,15);
		System.out.print("Company " + d_wagecal.getCompany() + " Total wage is ");
		System.out.println(monthlyWageCompute(k_wagecal));
	}
}