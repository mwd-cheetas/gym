
public class Register {
	RegisterTrainer rr ;
	RegisterTrainee re;
public Register(){
	rr= new RegisterTrainer();
	re=new RegisterTrainee();
}

}
class RegisterTrainer{
	ManageTrainer mm = new ManageTrainer();
	public void registertrainer(String name){
		for (int i = 0; i < mm.trainers.size(); i++) {
			System.out.println("Name: "+mm.trainers.get(i).name+"Age: "+mm.trainers.get(i).age+"Experience: "+mm.trainers.get(i).experience+"Phone: "+mm.trainers.get(i).phone);
		}
		System.out.println("Enter Name of Traineer to Register");
	}
}
class RegisterTrainee{
	
}