
public abstract class UserAbstract {
	protected String nome;
	protected ISala sala;
	
	public UserAbstract(String nome) {
		this.nome = nome;
	}

	public void enterRoom(ISala sala){
		this.sala = sala;
	}
	
	public void receiveMessage(UserAbstract userEmitter, String message){
		System.out.println(this.nome.toUpperCase() + " received: '" + message + "' from " + userEmitter.getNome().toUpperCase());
	}
	
	public void sendMessage(UserAbstract userReceptor, String message){
		this.sala.sendMessage(this, userReceptor, message);
	}
	
	public String getNome(){
		return this.nome;
	}
}
