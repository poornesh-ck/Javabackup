class Employee{
	private int eid;
	private String ename;
	private long esalary;
	Employee(){}
	Employee(int eid, String ename, long esalary){
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
		
	}
	public void seteid(int id){
		eid=id;
	}
	public int geteid(){
		return eid;
	}
	public void setename(String name){
		ename=name;
	}
	public String getename(){
		return ename;
	}
	public void setesalary(long salary){
		esalary=salary;
	}
	public long getesalary(){
		return esalary;
	}
}