import java.util.List; 
public abstract class Trainer {

	protected int age;
	protected String name;
	protected int weight;
	protected int experience;
	protected String phone;
	protected String pass="123";
	protected int comission=0;
	/////////// 
	public int account=0;
	protected String schedule=null;
	/////////////
	public List<Trainee> tt;
	
	protected   String dietplan=null;
public Trainer(int age,String name,int weight,int experience,String phone)
{
	this.age = age;
	this.weight=weight;
	this.experience=experience;
	this.phone=phone;
	this.name=name;
	
}
public void addplan(String plan)
{
	this.dietplan=plan;
}
public void removeplan()
{dietplan=null;}
public void cls(){
	for(int i=0;i<=7;i++){
		System.out.println("");
	}
	System.out.println("\t ********** \t");
}
public void viewtrainer()
{
	cls();
	System.out.println("Name: "+ name+"\t Age: "+age);
	System.out.println("Weight: "+ weight+"\t Experience: "+ experience);
	
}
public void addschedule(String sche)
{
	this.schedule=sche;
}
public void removeschedule()
{
	this.schedule=null;
}
}
 class FitnessTrainer extends Trainer
{
		
	public  FitnessTrainer(int age,String name,int weight,int experience,String phone)
	{
		super(age,name,weight,experience,phone);
	}
	
}
 class MassGain extends Trainer
{
	 public  MassGain(int age,String name,int weight,int experience,String phone)
		{
			super(age,name,weight,experience,phone);
		}
}
