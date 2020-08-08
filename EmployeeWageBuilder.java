// Employee Wage Computation Problem 
class EmployeeWageBuilder implements IEmpWage{
	private int numOfCompany=0;
	private EmployeeWageCompute[] companyEmpWageArray;
	
	public void EmployeeWageBuilder() {
	  companyEmpWageArray = new EmployeeWageCompute[5];
	}
	
	public void addCompanyEmpWage(String company, int emp_Rate_PerHr, int total_Work_Day, int working_Hrs)  {
		companyEmpWageArray[numOfCompany]= new EmployeeWageCompute(company, emp_Rate_PerHr, total_Work_Day, working_Hrs);
		numOfCompany++;
	}
	
	public void computeEmpWage() {
		for(int i =0;i<numOfCompany;i++) {
			companyEmpWageArray[i].setTotalWage(this.monthlyWageCompute(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}
	
public static void welcome(){
		System.out.println("Welcome To Employee Wage Computation ");
	}
	public static void main(String[] args){
		welcome();
		EmployeeWageBuilder emp = new EmployeeWageBuilder();
		emp.addCompanyEmpWage("Dmart", 5, 15, 7);
		emp.addCompanyEmpWage("Kmart", 10, 20, 9);
		emp.computeEmpWage();
	}

	public static void wageComputeforEmp(int emp_Rate_PerHr){
		int emp_FullDay_Hr = 8 ;
		int emp_PartDay_Hr = 4 ;
		int working_Hrs = 0;
		int empCheck = (int) Math.floor(Math.random()*10) % 3 ;		
			switch (empCheck){
				case 0 :
					working_Hrs = emp_FullDay_Hr;
				break ;
		    	case 1 :
					working_Hrs = emp_PartDay_Hr ;
				break ;
				default:
					working_Hrs = 0 ;
					break ;
			}
		int dailyWage = dailyWageCompute(working_Hrs, emp_Rate_PerHr);
		System.out.println("Daily full time employee wage is " + dailyWage);
		int monthlyWage = 20 * dailyWage;
		System.out.println("Monthly wage of an employee is " + monthlyWage);
	}

	public static int dailyWageCompute(int emp_Rate_PerHr,int working_Hrs) {
		int dailyWage = emp_Rate_PerHr * working_Hrs;
		return dailyWage;

	}

	public static int monthlyWageCompute(EmployeeWageCompute employeeWageCompute) {

		int dailyWage = dailyWageCompute(employeeWageCompute.getworking_Hrs(), employeeWageCompute.getEmp_Rate_PerHr());
		return dailyWage * employeeWageCompute.gettotal_Work_Day();
	}	
			
	

}
