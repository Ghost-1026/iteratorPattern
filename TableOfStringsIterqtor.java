import java.util.Iterator;
public class MyTableOfStrings_Iterator implements Iterator<String> {

    // creer l'index de parcours
	private int index;

    // On cree un objet de type MyTableOfStrings  qu'on peut iterer
	private MyTableOfStrings table;

    // On cree un iterateur 
	public MyTableOfStrings_Iterator(MyTableOfStrings tab) {
		index = tab.length()-1;
		table = tab;
	}

    // methode next pour recuperer le l'element suivant (ici on part du dernier element )
	public String next() {
		index--;
		return table.data[index +1];
	}

    // On verifie si l'element a un suivant dans la collection
	public boolean hasNext() {
		return index >= 0;
	}

}
