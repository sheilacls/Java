package qintess.academiajava.classes;

import java.util.Comparator;

public class OrdenadorCategoria implements Comparator<Produto>{

	@Override
	public int compare(Produto o1, Produto o2) {
		return o1.getCategoria().compareTo(o2.getCategoria());
	}
	

}
