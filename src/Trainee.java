
public abstract class Trainee {
	public Trainee(String name,int age,int weight,String phone,String email)
	{
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.phone=phone;
		this.email=email;
	}
Trainer t;
protected String name;
protected int age;
protected int weight; 
protected String phone;
protected String email;
protected String pass = "123";
}
class Regular extends Trainee
{
	public Regular(String name,int age,int weight,String phone,String email)
	{
		super(name,age,weight,phone,email);		
	}
}
class Premium extends Trainee
{
	public Premium(String name,int age,int weight,String phone,String email)
	{
		super(name,age,weight,phone,email);
	}
}
