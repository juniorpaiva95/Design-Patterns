import louca.Louca;
import louca.LoucaConforto;
import metal.Metal;
import metal.MetalConforto;
import parede.Parede;
import parede.ParedeConforto;
import piso.Piso;
import piso.PisoConforto;
import porta.Porta;
import porta.PortaConforto;
import tinta.Tinta;
import tinta.TintaConforto;

public class CasaConfortoFactory extends CasaFactory {

	@Override
	public Piso criarPiso() {
		return new PisoConforto();
	}

	@Override
	public Parede criarParede() {
		return new ParedeConforto();
	}

	@Override
	public Porta criarPorta() {
		return new PortaConforto();
	}

	@Override
	public Tinta criarTinta() {
		return new TintaConforto();
	}

	@Override
	public Metal criarMetal() {
		return new MetalConforto();
	}

	@Override
	public Louca criarLouca() {
		return new LoucaConforto();
	}
	
}
