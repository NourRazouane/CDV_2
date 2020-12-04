public class File {
	Object[] tab;
	int head, tail, elements;

	public File(int taille){
		tab = new Object[taille];
		head=tail=elements=0;
	} 
	public File(){ this(50); }

	public boolean estPleine(){ return elements==tab.length;}
	public boolean empty(){ return tail==head;}

	public void push(Object o){
		if(estPleine()) return;
		tab[head%tab.length]=o;
		head++;
		elements++;
	}

	public Object pop(){
		if(empty()) return null;
		tail++;
		elements--;
		return(tab[(tail-1)%tab.length]);
	}
}