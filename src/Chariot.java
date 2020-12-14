import java.util.ArrayList;

public class Chariot {
	
	ArrayList<Achat>  chario = new ArrayList <Achat>();
	
	public void addAchat(Achat achat){
		chario.add(achat);
		//System.out.println(chario);
	}
	
	// return chario element
	public ArrayList<Achat> getChario() {
		return chario;
	}
	
	//loop over chariot
}
