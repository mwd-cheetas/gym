import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Manage {
	public Manage(){
		mtr = new ManageTrainer();
		mte = new ManageTrainee();
	}
public ManageTrainer mtr ;//= new ManageTrainer();
public ManageTrainee mte ;//= new ManageTrainee();
}
class ManageTrainer {
	List<Trainer>trainers=new ArrayList<Trainer>();
	public void addtrainer(){
		
		Scanner  s = new Scanner(System.in);///(int age,String name,int weight,int experience,String phone)
		System.out.println("Enter Name: ");
		String name=s.next();
		System.out.println("Enter Age: ");
		int age=s.nextInt();
		System.out.println("Enter Weight: ");
		int weight=s.nextInt();
		System.out.println("Enter Experience in Years: ");
		int exp=s.nextInt();
		System.out.println("Enter Phone: ");
		String phone=s.next();
		System.out.println("Enter Type of Training Press 1 for Fitness press 2 for MassGain");
		int type=s.nextInt();
		s.close();
		for (int i = 0; i < trainers.size(); i++) {
			if (trainers.get(i).name==name) {
				System.out.println("Trainer with same name already found !!! ");
				return;
			}
		}
	if (type==1) {
		addttt(new FitnessTrainer(age,name,weight,exp,phone));
	} else if (type==2) {
		addttt(new MassGain(age,name,weight,exp,phone));
	}
	else {
		System.out.println("Wrong details try again ");
		addtrainer();
	}
	
	}
	private void addttt(Trainer g)
	{
		trainers.add(g);
	}
	public void removetrainer(String name)
	{
		for (int i = 0; i < trainers.size(); i++) {
			if (trainers.get(i).name==name) {
				trainers.remove(i);
				break;
			} else {
				System.out.println("Trainer not Found");
			}
		}
	}
}
class ManageTrainee {
	List<Trainee>trainees=new ArrayList<Trainee>();
	public void addttt(Trainee g)
	{
		trainees.add(g);
	}
	public void addtrainee(){
		
		Scanner  s = new Scanner(System.in);///(String name,int age,int weight,String phone,String email)
		System.out.println("Enter Name: ");
		String name=s.next();
		System.out.println("Enter Age: ");
		int age=s.nextInt();
		System.out.println("Enter Weight: ");
		int weight=s.nextInt();
		System.out.println("Enter Email: ");
		String email=s.next();
		System.out.println("Enter Phone: ");
		String phone=s.next();
		System.out.println("Enter Type of Training Press 1 for Regular press 2 for Premium");
		int type=s.nextInt();
		s.close();
		for (int i = 0; i < trainees.size(); i++) {
			if (trainees.get(i).name==name) {
				System.out.println("Trainee with same name already found !!! ");
				return;
			}
		}
	if (type==1) {
		addttt(new Regular(name,age,weight,phone,email));
	} else if (type==2) {
		addttt(new Premium(name,age,weight,phone,email));
	}
	else {
		System.out.println("Wrong details try again ");
		addtrainee();
	}
	
	}
	public void removetrainer(String name)
	{
		for (int i = 0; i < trainees.size(); i++) {
			if (trainees.get(i).name==name) {
				trainees.remove(i);
				break;
			} else {
				System.out.println("Trainee not Found");
			}
		}
	}
}