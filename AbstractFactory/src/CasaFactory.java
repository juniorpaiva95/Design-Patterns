import louca.Louca;
import metal.Metal;
import parede.Parede;
import piso.Piso;
import porta.Porta;
import tinta.Tinta;

public abstract class CasaFactory {
	
	public abstract Piso criarPiso();
	
	public abstract Parede criarParede();
	
	public abstract Porta criarPorta();
	
	public abstract Tinta criarTinta();
	
	public abstract Metal criarMetal();
	
	public abstract Louca criarLouca();
	
}
