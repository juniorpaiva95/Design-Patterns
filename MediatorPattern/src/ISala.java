
public interface ISala {
	public void registerUser(UserAbstract user);
	public void sendMessage(UserAbstract userEmitter, UserAbstract userReceptor, String message);
}
