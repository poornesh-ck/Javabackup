class Manager extends Employee{
	private String edept;
	Manager(){}
	Manager(int eid, String ename, long esalary,String edept){
		super(eid,  ename,esalary);
		this.edept=edept;
	}
	public void setedept(String dept){
		edept=dept;
	}
	public String getedept(){
		return edept;
	}
}