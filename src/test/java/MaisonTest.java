import static org.junit.Assert.*;
import org.junit.Test;

import fr.diginamic.immobilier.entites.Maison;
import fr.diginamic.immobilier.entites.Piece;
import fr.diginamic.immobilier.entites.Salon;
import fr.diginamic.immobilier.entites.Chambre;
import fr.diginamic.immobilier.entites.Cuisine;
import fr.diginamic.immobilier.entites.WC;
import fr.diginamic.immobilier.entites.SalleDeBain;
//Tester les differentes fonctions de la classe maison
public class MaisonTest {
	//
	Maison maison = new Maison();//Pour les test d'ajout de pieces
	@Test
	public void ChambreOKTest() {
		//tester le constructeur de chaque piece-> 2 arguments(int etage,double superficie)
		//type fait partie de l'enumeration des types de pieces
		int etage = 0;
		double superficie = 18.5;
		Chambre chambre = new Chambre(etage,superficie);
		String type = chambre.getType();
		assertEquals("Chambre",type);
		int etagechambre = chambre.getNumEtage();
		assertEquals(0,etagechambre);
		Object surface = chambre.getSuperficie();
		assertEquals(18.5,surface);
		System.out.println("type: "+chambre.getType());//Pour vérifier la valeur
	}
	@Test
	public void ChambreEtageNegatifTest() {
		//tester le constructeur de chaque piece-> 2 arguments(int etage,double superficie)
		//type fait partie de l'enumeration des types de pieces
		int etage = -1;
		double superficie = 22.5;
		Chambre chambre = new Chambre(etage,superficie);
		String type = chambre.getType();
		assertEquals("Chambre",type);
		int etagechambre = chambre.getNumEtage();
		assertEquals(0,etagechambre);//valeur négative pour le sous-sol
		Object surface = chambre.getSuperficie();
		assertEquals(0.0,surface);//cf traitement dans le constructeur
		//System.out.println("type: "+chambre.getType()+" etage: "+chambre.getNumEtage()+" superficie: "+chambre.getSuperficie());
	}
	@Test
	public void ChambreSuperficieNegatifTest() {
		//tester le constructeur de chaque piece-> 2 arguments(int etage,double superficie)
		//type fait partie de l'enumeration des types de pieces
		int etage = 2;
		double superficie = -22.5;
		Chambre chambre = new Chambre(etage,superficie);
		String type = chambre.getType();
		assertEquals("Chambre",type);
		int etagechambre = chambre.getNumEtage();
		assertEquals(0,etagechambre);
		Double surface = chambre.getSuperficie();
		assertFalse(surface<0.0);//cf traitement dans le constructeur
		//System.out.println("type: "+chambre.getType()+" etage: "+chambre.getNumEtage()+" superficie: "+chambre.getSuperficie());
	}
	//Tests des Cuisine
	@Test
	public void CuisineOKTest() {
		//tester le constructeur de chaque piece-> 2 arguments(int etage,double superficie)
		//type fait partie de l'enumeration des types de pieces
		int etage = 0;
		double superficie = 20.0;
		Cuisine cuisine = new Cuisine(etage,superficie);
		String type = cuisine.getType();
		assertEquals("Cuisine",type);
		int etagecuisine = cuisine.getNumEtage();
		assertEquals(0,etagecuisine);
		Object surface = cuisine.getSuperficie();
		assertEquals(20.0,surface);
		System.out.println("type: "+cuisine.getType());//Pour vérifier la valeur
	}
	@Test
	public void CuisineEtageNegatifTest() {
		//tester le constructeur de chaque piece-> 2 arguments(int etage,double superficie)
		//type fait partie de l'enumeration des types de pieces
		int etage = -1;
		double superficie = 22.5;
		Cuisine cuisine = new Cuisine(etage,superficie);
		String type = cuisine.getType();
		assertEquals("Cuisine",type);
		int etagecuisine = cuisine.getNumEtage();
		assertEquals(0,etagecuisine);//valeur négative pour le sous-sol
		Object surface = cuisine.getSuperficie();
		assertEquals(0.0,surface);//cf traitement dans le constructeur
		//System.out.println("type: "+chambre.getType()+" etage: "+chambre.getNumEtage()+" superficie: "+chambre.getSuperficie());
	}
	@Test
	public void CuisineSuperficieNegatifTest() {
		//tester le constructeur de chaque piece-> 2 arguments(int etage,double superficie)
		//type fait partie de l'enumeration des types de pieces
		int etage = 2;
		double superficie = -22.5;
		Cuisine cuisine = new Cuisine(etage,superficie);
		String type = cuisine.getType();
		assertEquals("Cuisine",type);
		int etagecuisine = cuisine.getNumEtage();
		assertEquals(0,etagecuisine);
		Double surface = cuisine.getSuperficie();
		assertFalse(surface<0.0);//cf traitement dans le constructeur
		//System.out.println("type: "+chambre.getType()+" etage: "+chambre.getNumEtage()+" superficie: "+chambre.getSuperficie());
	}
	@Test
	public void SalonOKTest() {
		//tester le constructeur de chaque piece-> 2 arguments(int etage,double superficie)
		//type fait partie de l'enumeration des types de pieces
		int etage = 0;
		double superficie = 18.5;
		Salon salon = new Salon(etage,superficie);
		String type = salon.getType();
		assertEquals("Salon",type);
		int etagesalon = salon.getNumEtage();
		assertEquals(0,etagesalon);
		Object surface = salon.getSuperficie();
		assertEquals(18.5,surface);
		System.out.println("type: "+salon.getType());//Pour vérifier la valeur
	}
	@Test
	public void SalonEtageNegatifTest() {
		//tester le constructeur de chaque piece-> 2 arguments(int etage,double superficie)
		//type fait partie de l'enumeration des types de pieces
		int etage = -1;
		double superficie = 22.5;
		Salon salon = new Salon(etage,superficie);
		String type = salon.getType();
		assertEquals("Salon",type);
		int etagesalon = salon.getNumEtage();
		assertEquals(0,etagesalon);//valeur négative pour le sous-sol
		Object surface = salon.getSuperficie();
		assertEquals(0.0,surface);//cf traitement dans le constructeur
		//System.out.println("type: "+chambre.getType()+" etage: "+chambre.getNumEtage()+" superficie: "+chambre.getSuperficie());
	}
	@Test
	public void SalonSuperficieNegatifTest() {
		//tester le constructeur de chaque piece-> 2 arguments(int etage,double superficie)
		//type fait partie de l'enumeration des types de pieces
		int etage = 2;
		double superficie = -22.5;
		Salon salon = new Salon(etage,superficie);
		String type = salon.getType();
		assertEquals("Salon",type);
		int etagesalon = salon.getNumEtage();
		assertEquals(0,etagesalon);
		Double surface = salon.getSuperficie();
		assertFalse(surface<0.0);//cf traitement dans le constructeur
		//System.out.println("type: "+chambre.getType()+" etage: "+chambre.getNumEtage()+" superficie: "+chambre.getSuperficie());
	}
	//
	@Test
	public void SalleDeBainOKTest() {
		//tester le constructeur de chaque piece-> 2 arguments(int etage,double superficie)
		//type fait partie de l'enumeration des types de pieces
		int etage = 0;
		double superficie = 18.5;
		SalleDeBain salle_de_bains = new SalleDeBain(etage,superficie);
		String type = salle_de_bains.getType();
		assertEquals("Salle de bain",type);
		int etagesalle_de_bains = salle_de_bains.getNumEtage();
		assertEquals(0,etagesalle_de_bains);
		Object surface = salle_de_bains.getSuperficie();
		assertEquals(18.5,surface);
		System.out.println("type: "+salle_de_bains.getType());//Pour vérifier la valeur
	}
	@Test
	public void SalleDeBainsEtageNegatifTest() {
		//tester le constructeur de chaque piece-> 2 arguments(int etage,double superficie)
		//type fait partie de l'enumeration des types de pieces
		int etage = -1;
		double superficie = 22.5;
		SalleDeBain salle_de_bains = new SalleDeBain(etage,superficie);
		String type = salle_de_bains.getType();
		assertEquals("Salle de bain",type);
		int etagesalle_de_bains = salle_de_bains.getNumEtage();
		assertEquals(0,etagesalle_de_bains);//valeur négative pour le sous-sol
		Object surface = salle_de_bains.getSuperficie();
		assertEquals(0.0,surface);//cf traitement dans le constructeur
		//System.out.println("type: "+chambre.getType()+" etage: "+chambre.getNumEtage()+" superficie: "+chambre.getSuperficie());
	}
	@Test
	public void SalleDeBainSuperficieNegatifTest() {
		//tester le constructeur de chaque piece-> 2 arguments(int etage,double superficie)
		//type fait partie de l'enumeration des types de pieces
		int etage = 2;
		double superficie = -22.5;
		SalleDeBain salle_de_bains = new SalleDeBain(etage,superficie);
		String type = salle_de_bains.getType();
		assertEquals("Salle de bain",type);
		int etagesalle_de_bain = salle_de_bains.getNumEtage();
		assertEquals(0,etagesalle_de_bain);
		Double surface = salle_de_bains.getSuperficie();
		assertFalse(surface<0.0);//cf traitement dans le constructeur
		//System.out.println("type: "+chambre.getType()+" etage: "+chambre.getNumEtage()+" superficie: "+chambre.getSuperficie());
	}
	//
	@Test
	public void WCOKTest() {
		//tester le constructeur de chaque piece-> 2 arguments(int etage,double superficie)
		//type fait partie de l'enumeration des types de pieces
		int etage = 0;
		double superficie = 18.5;
		WC wc = new WC(etage,superficie);
		String type = wc.getType();
		assertEquals("WC",type);
		int etagewc = wc.getNumEtage();
		assertEquals(0,etagewc);
		Object surface = wc.getSuperficie();
		assertEquals(18.5,surface);
		System.out.println("type: "+wc.getType());//Pour vérifier la valeur
	}
	@Test
	public void WCEtageNegatifTest() {
		//tester le constructeur de chaque piece-> 2 arguments(int etage,double superficie)
		//type fait partie de l'enumeration des types de pieces
		int etage = -1;
		double superficie = 22.5;
		WC wc = new WC(etage,superficie);
		String type = wc.getType();
		assertEquals("WC",type);
		int etagewc = wc.getNumEtage();
		assertEquals(0,etagewc);//valeur négative pour le sous-sol
		Object surface = wc.getSuperficie();
		assertEquals(0.0,surface);//cf traitement dans le constructeur
		//System.out.println("type: "+chambre.getType()+" etage: "+chambre.getNumEtage()+" superficie: "+chambre.getSuperficie());
	}
	@Test
	public void WCSuperficieNegatifTest() {
		//tester le constructeur de chaque piece-> 2 arguments(int etage,double superficie)
		//type fait partie de l'enumeration des types de pieces
		int etage = 2;
		double superficie = -22.5;
		WC wc = new WC(etage,superficie);
		String type = wc.getType();
		assertEquals("WC",type);
		int etagewc = wc.getNumEtage();
		assertEquals(0,etagewc);
		Double surface = wc.getSuperficie();
		assertFalse(surface<0.0);//cf traitement dans le constructeur
		//System.out.println("type: "+chambre.getType()+" etage: "+chambre.getNumEtage()+" superficie: "+chambre.getSuperficie());
	}
	//
	
	@Test
	public void ajouterChambreOKTest() {
		//1 argument de type Piece-> enumeration du type piece, etage, superficie
		String[] typePiece = {"Chambre","Salon","Cuisine","WC","Salle de bain"};
		//verifier si Chambre est une instance de Piece
		//Maison maison = new Maison();
		maison.ajouterPiece(new Cuisine(2,25.5));
		assertEquals(1,maison.nbPieces());
	}
	@Test
	public void ajouterCuisineOKTest() {
		//1 argument de type Piece-> enumeration du type piece, etage, superficie
		String[] typePiece = {"Chambre","Salon","Cuisine","WC","Salle de bain"};
		//verifier si Chambre est une instance de Piece
		//Maison maison = new Maison();
		maison.ajouterPiece(new Cuisine(1,25));
		assertEquals(1,maison.nbPieces());
	}
	@Test
	public void ajouterSalleDeBainsOKTest() {
		//1 argument de type Piece-> enumeration du type piece, etage, superficie
		String[] typePiece = {"Chambre","Salon","Cuisine","WC","Salle de bain"};
		//verifier si Chambre est une instance de Piece
		//Maison maison = new Maison();
		maison.ajouterPiece(new SalleDeBain(0,31));
		assertEquals(1,maison.nbPieces());
	}
	@Test
	public void ajouterWCOKTest() {
		//1 argument de type Piece-> enumeration du type piece, etage, superficie
		String[] typePiece = {"Chambre","Salon","Cuisine","WC","Salle de bain"};
		//verifier si Chambre est une instance de Piece
		//Maison maison = new Maison();
		maison.ajouterPiece(new WC(0,15.5));
		assertEquals(1,maison.nbPieces());
	}
	@Test
	public void ajouterSalonOKTest() {
		//1 argument de type Piece-> enumeration du type piece, etage, superficie
		String[] typePiece = {"Chambre","Salon","Cuisine","WC","Salle de bain"};
		//verifier si Chambre est une instance de Piece
		//Maison maison = new Maison();
		maison.ajouterPiece(new Salon(2,25.5));
		assertEquals(1,maison.nbPieces());
	}
	@Test
	public void NbPiecesTest() {
		//1 argument de type Piece-> enumeration du type piece
		maison.ajouterPiece(new WC(2,15.5));
		maison.ajouterPiece(new Chambre(2,25.5));
		maison.ajouterPiece(new Salon(2,30));
		maison.ajouterPiece(new Cuisine(2,20.5));
		System.out.println("nb: "+maison.nbPieces());
		assertEquals(4,maison.nbPieces());
	}
}
