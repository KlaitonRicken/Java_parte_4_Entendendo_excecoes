package main;

public class TesteConexao {

	public static void main(String[] args) {
		
		try(Conexao con = new Conexao()){
			con.leDados();
		} catch (IllegalStateException e) {
			System.out.print("Erro na conex�o\n");
		}
		
//		Conexao con = null;
//		
//		try {
//			con = new Conexao();
//			con.leDados();
//		}catch (IllegalStateException e) {
//			System.out.print("Erro na conex�o\n");
//		}finally {
//			if(con != null)
//				con.fecha();
//		}
		
	}

}
