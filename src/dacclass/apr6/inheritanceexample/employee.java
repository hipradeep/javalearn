package dacclass.apr6.inheritanceexample;
//child class|derived class| sub class 
public class employee extends Person {

	//java support only single inheritance |multilevel 
	//java does not support multiple inheritance 
	 
		int empid;
		void getdata()
		{
			empid=22;
			name="poja";
			age=23;
			address="delhi";
			//code=2444;
		}
		
		void display()
		{
			System.out.println(empid+" "+name+"  "+age);
		}
	 
	public static void main(String[] args) {
		employee e= new employee();
		e.getdata();
		e.display();
	}

}

 
