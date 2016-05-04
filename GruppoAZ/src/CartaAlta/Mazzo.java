package CartaAlta;

import java.util.Vector;
import IOUtils.*;

public class Mazzo {
	private Vector<Carta> mazzo=new Vector<Carta>(52);
	private String[] semi={"cuori","quadri","fiori","picche"};
	
	public Mazzo()
	{
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<13;j++)
			{
				mazzo.addElement(new Carta(semi[i],j+1));
			}
		}
		
	}
	
	public Carta cartaCasuale()
	{
		return mazzo.get(IOUtils.estraiIntero(0, 52));
	}
}
