class Director extends Admin{
	private long cbudget;
	
	Director(int eid, String ename, long esalary,String edept,long cbudget){
		super( eid,  ename,  esalary, edept);
		this.cbudget=cbudget;
	}
	public void setcbudget(long budget){
		cbudget=budget;
	}
	public long getcbudget(){
		return cbudget;
	}
}