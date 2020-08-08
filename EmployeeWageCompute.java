public class EmployeeWageCompute{
	private String company;
	private int emp_Rate_PerHr;
	private int total_Work_Day;
	private int working_Hrs;
	private int totalWage;
	private int dailywage;

	public int getDailywage(){
		return dailywage;
	}
	public void setDailywage(int dailywage){
		this.dailywage = dailywage;
	}

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

	public void setTotalWage(int totalWage){
		this.totalWage=totalWage;
	}

	public int getTotalWage(){
		return totalWage;
	}

	public EmployeeWageCompute (String company,int emp_Rate_PerHr, int total_Work_Day,int working_Hrs){
		this.company = company;
		this.total_Work_Day = total_Work_Day;
		this.working_Hrs = working_Hrs;
		this.emp_Rate_PerHr = emp_Rate_PerHr;
	}
		@Override

	public String toString() {

	return "Total Employee wage for company "+ this.company+ " is " + this.totalWage;

	}



}
