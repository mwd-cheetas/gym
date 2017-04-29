
public abstract class Trainee {
	public Trainee(String name,int age,int weight,String phone,String email) 
	{
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.phone=phone;
		this.email=email;
	}
public Trainer t;
protected String name;
protected int age;
protected int weight; 
protected String phone;
protected String email;
protected String pass = "123";
/////////////
public void viewplan()
{
     if(t!=null)
	 System.out.println("Trainer Not Hired !!!");
     else
     System.out.println(t.dietplan);	

}
public void viewschedule()
{
	   if(t!=null)
			 System.out.println("Trainer Not Hired !!!");
		     else
		     System.out.println(t.schedule);	
}

}
/////////////////////////////////////

//////////////////////////////////////////
class Regular extends Trainee
{
	public Regular(String name,int age,int weight,String phone,String email)
	{
		super(name,age,weight,phone,email);		
	}
}
/////////////////////////////////////////
class Premium extends Trainee
{
	public Premium(String name,int age,int weight,String phone,String email)
	{
		super(name,age,weight,phone,email);
	}
} 
