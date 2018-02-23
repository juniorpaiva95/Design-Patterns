
public class ChatDemo {

	public static void main(String[] args) {
		
		ISala sala = new Sala();
		
		UserAbstract junior = new Human("Junior");
		UserAbstract alguem = new Human("Alguem");
		UserAbstract robot = new Robot("Robot");
		
		sala.registerUser(junior);
		sala.registerUser(alguem);
		sala.registerUser(robot);
		
		junior.sendMessage(alguem, "OI");
		alguem.sendMessage(junior, "Olá!");
		robot.sendMessage(junior, "Message from Robot.");
	}

}
