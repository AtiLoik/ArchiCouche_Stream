package Presentation;

import java.util.ArrayList;
import java.util.stream.Stream;

import Metier.Personne;
public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Personne> listP = Personne.Listepersonne();
		
		Stream<Personne> sp = listP.stream();
		sp.forEach(System.out::println);
	}

}
