import static org.junit.Assert.*;
import org.junit.Test;

import fr.diginamic.enumerations.Saison;
//
public class SaisonTest {

	//
	@Test
	public void testvalueOfLibelle() {
		//Tester les cas nominaux et les bornes
		//creation d'une instance de la classe/enum?? a tester-> type static
		//doit retourner un objet saison
		String[] libelle = {"Printemps","Eté","Automne","Hiver"};//Pour les données a tester valides uniquements
		//Saison saison = Saison.valueOf("HIVER");
		//assertEquals("3. Automne",saison.toString());
		//Test en dur pour les différentes valeurs passées en argument a la fonction: valueOfLibelle()
			/*
			Saison saison = Saison.valueOfLibelle(libelle[0]);
			assertEquals((libelle[0].toString()),saison.getLibelle());
			System.out.println(">"+libelle[0].toString());
			
			Saison saison1 = Saison.valueOfLibelle(libelle[1]);
			assertEquals((libelle[1].toString()),saison1.getLibelle());
			System.out.println(">"+libelle[1].toString());
			Saison saison2 = Saison.valueOfLibelle(libelle[2]);
			assertEquals((libelle[2].toString()),saison2.getLibelle());
			System.out.println(">"+libelle[2].toString());
			
			Saison saison3 = Saison.valueOfLibelle(libell[3]);
			assertEquals((libelle[3].toString()),saison3.getLibelle());
			System.out.println(">"+saison3.toString());
			*/
			
			for(int i =0; i<libelle.length;i++) {
				//le test échoue si une des conditions n'est pas remplie(valeur passée ou prédicat)
				Saison saison = Saison.valueOfLibelle(libelle[i]);
				assertEquals((libelle[i].toString()),saison.getLibelle());
				//affichage pour vérifier les valeurs 
				System.out.println(">"+libelle[i].toString());
			}
		//parait ok , valueOfLibelle(String libelle), saison.toString()
		//test des bornes !OK
	}
	//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tester la methode valueOfLibelle()
		
	}

}
