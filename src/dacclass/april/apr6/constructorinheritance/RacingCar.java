package dacclass.april.apr6.constructorinheritance;

// whenwe make object base class no argument constructor is always called 
class vehicle   {
	 vehicle()	   {System.out.println("vehicle"); }
	vehicle(int r)	   {System.out.println("vehicle parameter"); }
}
class car extends vehicle  {
	
	 car(){ 	  System.out.println("car");	  }
	 car(int y){ 	  System.out.println("car parameter");	  }
}


public class RacingCar extends car
{
	
RacingCar()     {	System.out.println("racingcar");}
RacingCar(int y){	System.out.println("racingcar parameter");}

public static void main(String[] args) {
		//vehicle v= new vehicle();
	   // car c= new car(44);
	   RacingCar c= new RacingCar(22);
	}

}
//output  
//vehicle no argument constructor wil be called 
//then car no argument 
// racingcar parameter