import louca.Louca;
import louca.LoucaLuxo;
import metal.Metal;
import metal.MetalLuxo;
import parede.Parede;
import parede.ParedeLuxo;
import piso.Piso;
import piso.PisoLuxo;
import porta.Porta;
import porta.PortaLuxo;
import tinta.Tinta;
import tinta.TintaLuxo;

public class CasaLuxoFactory extends CasaFactory{

	@Override
	public Piso criarPiso() {
		return new PisoLuxo();
	}

	@Override
	public Parede criarParede() {
		return new ParedeLuxo();
	}

	@Override
	public Porta criarPorta() {
		return new PortaLuxo();
	}

	@Override
	public Tinta criarTinta() {
		return new TintaLuxo();
	}

	@Override
	public Metal criarMetal() {
		return new MetalLuxo();
	}

	@Override
	public Louca criarLouca() {
		return new LoucaLuxo();
	}

}
