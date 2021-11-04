// création d’une liste d’éléments

ArrayList persons = new ArrayList();

// remplir la liste d’éléments

Person p= new Person("khadre", "Fallou");

persons.add(p);

// demande un itérateur au conteneur

Iterator i = persons.iterator();

// tant qu’il un élément suivant dans la collection

while(i.hasNext())

{

// extrait (une référence sur) l’élément suivant

Person p= (Person)i.next();

// traite l’élément extrait: l’affiche

p.print();