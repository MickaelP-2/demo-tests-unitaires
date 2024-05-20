import static org.junit.Assert.*;
import org.junit.Test;

import fr.diginamic.utils.StringUtils;
public class levenshteinDistanceTest {
//
	@Test
	public void StringUtilsTest() {
		//2 arguments de type String passés en paramétres
		String str1 = "Chine";
		String str2 = "Chien";
		//doit retourner 2
		//pas d'arguments null ou de mauvais type
		int res = StringUtils.levenshteinDistance(str1,str2);
		assertEquals(2,res);
		System.out.println("str1: "+str1+" str2: "+str2+" res: "+res);
		//
	}
	@Test
	public void StringUtils1VarNullGaucheTest() {
		String str1 = null;
		String str2 = "Chien";
		int res = StringUtils.levenshteinDistance(str1, str2);
		assertEquals(0,res);
		System.out.println("str1: "+str1+" str2: "+str2+" res: "+res);
		//exception ajoutée dans le constructeur, sinon ne compile pas
	}
	@Test
	public void StringUtils1VarNullDroiteTest() {
		String str1 = "Chine";
		String str2 = null;
		int res = StringUtils.levenshteinDistance(str1, str2);
		assertEquals(0,res);
		System.out.println("str1: "+str1+" str2: "+str2+" res: "+res);
		//exception ajoutée dans le constructeur, sinon ne compile pas
	}
	@Test
	public void StringUtils1VarMajTest() {
		//La fonction ne garde que les lettres commune pour le résultat: ici C
		String str1 = "CHIEN";
		String str2 = "Chien";
		int res = StringUtils.levenshteinDistance(str1,str2);
		assertEquals(4,res);//retourne le nb de lettre de l'argument non vide
		System.out.println("str1: "+str1+" str2: "+str2+" res: "+res);
	}
	@Test
	public void StringUtils1VarEmptyTest() {
		String str1 = "";
		String str2 = "Chien";
		int res = StringUtils.levenshteinDistance(str1,str2);
		assertEquals(5,res);//retourne le nb de lettre de l'argument non vide
		System.out.println("str1: "+str1+" str2: "+str2+" res: "+res);
	}
	/*Ne compile pas si un seul argument ou zéro passé en argument-> Robuste??
	@Test
	public void StringUtils1VarTest() {
		//String str1 = "";
		String str2 = "Chien";
		int res = StringUtils.levenshteinDistance();
		assertEquals(-1,res);
		System.out.println("str1: "+str1+" str2: "+str2+" res: "+res);
	}
	*/
}
