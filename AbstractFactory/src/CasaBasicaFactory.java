import louca.Louca;
import louca.LoucaBasica;
import metal.Metal;
import metal.MetalBasico;
import parede.Parede;
import parede.ParedeBasico;
import piso.Piso;
import piso.PisoBasico;
import porta.Porta;
import porta.PortaBasica;
import tinta.Tinta;
import tinta.TintaBasico;

public class CasaBasicaFactory extends CasaFactory {

	@Override
	public Piso criarPiso() {
		return new PisoBasico();
	}

	@Override
	public Parede criarParede() {
		return new ParedeBasico();
	}

	@Override
	public Porta criarPorta() {
		return new PortaBasica();
	}

	@Override
	public Tinta criarTinta() {
		return new TintaBasico();
	}

	@Override
	public Metal criarMetal() {
		return new MetalBasico();
	}

	@Override
	public Louca criarLouca() {
		return new LoucaBasica();
	}

}
