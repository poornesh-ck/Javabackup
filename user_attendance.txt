import java.util.Scanner;
class att{
	string name;
	
	att(){
	}
	att(string name){
		this.name=name;
	}
	public String toString(){
		return name;
	}
	public void atted(att...a){
		System.out.println(a.length);
		for(att as:a){
			system.out.println(as);
		}
	}
	
	public static void main(String args[]){
		att ob =new ob[5];
		att stor[]=new att[5];
		for(int i=0;i<3;i++){
			string name=s.next();
			att uv = new att(name);
			stor[i]=uv;
		}
		att ws = new att();
		ws.atted(stor);
		
	
	}

}