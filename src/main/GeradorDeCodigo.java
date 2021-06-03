package main;

/**
 *
 * @author Luiz Flávio
 */
public class GeradorDeCodigo {
    
    public String gerardorDeCodigoCombinacao(int n, int m){
        StringBuilder sb = new StringBuilder();
        
        if(n < m || n == 0 || m == 0){
            System.out.println("N e M devem ser maiores que zero e o valor de M deve, obrigatoriamente, ser menor ou igual a N.");
            return "";
        }
        
        //Variáveis auxiliares
        int contador = 1;
        int contadorAntes = (contador - 1);
        int contadorLoop = (n - m);
        
        //Laço para criação de estrutura/código
        while(contador <= m){
            
            //Montando estrutura de loop/For
            sb.append("for(int _")
              .append(contador)
              .append(" = ")
              .append((contador == 1? "0" : 
                                      "(_".concat(String.valueOf(contadorAntes)).concat(" + 1)")))
              .append(" ; _")
              .append(contador)
              .append(" <= ")
              .append(contadorLoop)
              .append("; _")
              .append(contador)
              .append("++){");

            //Montando formato de impressão
            if(contador == m){
                sb.append("System.out.print(");
                for(int _0 = 1; _0 <= m; _0++){
                    sb.append(" _")
                      .append(_0);
                    if(_0 < m){
                         sb.append("+ \" \" +");
                    }       
                }
                sb.append("+ \" \\n\");");
            }
            
            contador++;
            contadorLoop++;
            contadorAntes++;
            
        }
        
        //Fechando chaves "}"
        for(int _0 = 0; _0 < m; _0++){
            sb.append("}");
        }

        //Retornando string contendo código que gera as combinações C n, m
        return sb.toString();
    }
}
