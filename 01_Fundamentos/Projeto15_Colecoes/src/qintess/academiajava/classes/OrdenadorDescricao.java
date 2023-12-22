package qintess.academiajava.classes;

import java.util.Comparator;

public class OrdenadorDescricao implements  Comparator<Produto>{

	@Override
	public int compare(Produto o1, Produto o2) {
		return o1.getDescricao().compareTo(o2.getDescricao());
	}
	
}
