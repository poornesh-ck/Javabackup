class Mclass{
	public static void main(String args[]){
		System.out.println("gogo");
		System.out.println("--------------------------------");

		Director d;
		d=new Director(12,"poornesh",40_000,"trainee",1000000);
		//er.seteid(12);
		//System.out.println(er.geteid());
		Admin a= new Admin(13,"Jeeva",50_000,"Trainee");
		Engineer e= new Engineer(15,"Jerish",50_000);
		Manager m= new Manager(17,"lokesh",50_000,"Trainee");
		employeePrit(d);
		employeePrit(a);
		employeePrit(e);
		employeePrit(m);
		

	}
	public static void employeePrit(Employee er){
		if(er instanceof Director){
			Director d= (Director) er;
			System.out.println("Name"+d.getename());
			System.out.println("Emp Id"+d.geteid());
			System.out.println("Salaray"+d.getesalary());
			System.out.println("Department"+d.getedept());
			System.out.println("Budget"+d.getcbudget());
			System.out.println("--------------------------------");



		}
		else if(er instanceof Admin){
			Admin a= (Admin) er;
			System.out.println("Name"+a.getename());
			System.out.println("Emp Id"+a.geteid());
			System.out.println("Salaray"+a.getesalary());
			System.out.println("Department"+a.getedept());
			System.out.println("--------------------------------");
		}
		else if(er instanceof Manager){
			Manager m= (Manager) er;
			System.out.println("Name"+m.getename());
			System.out.println("Emp Id"+m.geteid());
			System.out.println("Salaray"+m.getesalary());
			System.out.println("Department"+m.getedept());
			System.out.println("--------------------------------");
		}
		else if(er instanceof Engineer){
			Engineer e= (Engineer) er;
			System.out.println("Name"+e.getename());
			System.out.println("Emp Id"+e.geteid());
			System.out.println("Salaray"+e.getesalary());
			//System.out.println("Department"+e.getedept());
			System.out.println("--------------------------------");
		}
			
			
		
		
		
	}
}