import java.util.ArrayList;

public class Sala implements ISala{
	private ArrayList<UserAbstract> users = new ArrayList<UserAbstract>();
	
	@Override
	public void registerUser(UserAbstract user) {
		this.users.add(user);
		user.enterRoom(this);
		
	}

	@Override
	public void sendMessage(UserAbstract userEmitter, UserAbstract userReceptor, String message) {
		UserAbstract user = null;
		for (UserAbstract userAbstract: users) {
			if(userAbstract.equals(userReceptor)) {
				user = userAbstract;
			}
		}
		if(user != null) {
			user.receiveMessage(userEmitter, message);
		}
		
		
	}

}
