package main;

public class TesteContaExceptionChecked {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		try {
			c.depositta(243);
		} catch (MinhaException e) {
			e.printStackTrace();
		}
		
	}

}
