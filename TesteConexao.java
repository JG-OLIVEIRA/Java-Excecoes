public class TesteConexao {
    
    public static void main(String[] args){

        try(Conexao conexao = new Conexao()){
            conexao.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Deu erro na conexão");
        }

        
        
        //------------------------------/----------------------------//
        
       /*  Conexao conexao = null;

        try {
            conexao = new Conexao();
            conexao.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Deu erro na conexão");
        } finally {
            System.out.println("Finally");
            if(conexao != null){
                conexao.close();
            }
        }

 */
    }
}
