// Employee Wage Computation Problem 
import java.util.*;
class EmployeeWageBuilder implements IEmpWage{
	private LinkedList<EmployeeWageCompute> companyEmpWageList;
	
	private Map<String,EmployeeWageCompute> companyToEmpWageMap;

	public void EmployeeWageBuilder() {
	  companyEmpWageList = new LinkedList<>();
	  companyToEmpWageMap = new HashMap<>();
	}
	
	public void addCompanyEmpWage(String company,int emp_Rate_PerHr,int total_Work_Day,int working_Hrs)  {
		EmployeeWageCompute employeeWageCompute = new EmployeeWageCompute(company,emp_Rate_PerHr,total_Work_Day,working_Hrs);
		companyEmpWageList.add(employeeWageCompute);
		companyToEmpWageMap.put(company,employeeWageCompute);
	}
	
	public void computeEmpWage() {
		for(int i =0;i<companyEmpWageList.size();i++) {
		EmployeeWageCompute employeeWageCompute = companyEmpWageList.get(i);
		employeeWageCompute.setTotalWage(this.monthlyWageCompute(employeeWageCompute));
		System.out.println("dailyWage for" + employeeWageCompute.getCompany() + "is" + employeeWageCompute.getDailywage());
		System.out.println(employeeWageCompute);
		}
	}
	
public static void welcome(){
		System.out.println("Welcome To Employee Wage Computation ");
	}
	public static void main(String[] args){
		welcome();
		EmployeeWageBuilder emp = new EmployeeWageBuilder();
		emp.addCompanyEmpWage("Dmart",10,5,5);
		emp.addCompanyEmpWage("Kmart",10,2,9);
		emp.computeEmpWage();
		System.out.println("Total wage for Dmart is " + emp.getTotalWage("Dmart"));
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

	public static int dailyWageCompute(int working_Hrs,int emp_Rate_PerHr) {
		int dailyWage = emp_Rate_PerHr * working_Hrs;
		return dailyWage;

	}public int getTotalWage(String companyName) {

		return companyToEmpWageMap.get(companyName).getTotalWage();
	}

	public static int monthlyWageCompute(EmployeeWageCompute employeeWageCompute) {

		int dailyWage = dailyWageCompute(employeeWageCompute.getworking_Hrs(), employeeWageCompute.getEmp_Rate_PerHr());
		employeeWageCompute.setDailywage(dailyWage);
		return dailyWage * employeeWageCompute.gettotal_Work_Day();
	}	
			
	

}
