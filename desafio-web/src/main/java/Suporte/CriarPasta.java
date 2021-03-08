package Suporte;

import java.io.File;

public class CriarPasta {

    public static void criarPastaDoRelatorio(String caminho){

        File caminhoRelatorio = new File(caminho);
        if(!caminhoRelatorio.exists()){

            caminhoRelatorio.mkdir();
        }
    }
}
