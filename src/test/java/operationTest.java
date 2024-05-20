import static org.junit.Assert.*;
import org.junit.Test;

import fr.diginamic.enumerations.operation;
//
public class operationTest {
//
	
	@Test
	public void testaddition() {
		int a=2;
		int b=3;
		//int res = operation.addition(a,b);
		operation op = new operation();
		int res = op.addition(a,b);
		assertEquals(5,res);
		//System.out.println("res: "+res);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Classe personnelle pour tester le méchanisme d'assertion
		
	}

}
