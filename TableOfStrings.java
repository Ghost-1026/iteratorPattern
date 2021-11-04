import java.util.Iterator;
public class MyTableOfStrings implements Iterable<String>
{
	//creation d'un tableau de chaines de caracteres
	protected String[] data;

    //constructeur avec parametre
	public MyTableOfStrings(String [] data) 
	{
		this.data = data;
	}

    // recuperer la longueur de la collection
	public int length(){ return data.length; }

    //recuperer un iterateur pour la collection
	public Iterator<String> iterator() 
	{
		return new MyTableOfStrings_Iterator(this);
	}
}

