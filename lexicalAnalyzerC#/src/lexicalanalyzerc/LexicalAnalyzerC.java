/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicalanalyzerc;

import java.io.File;

/**
 *
 * @author Oscar
 */
public class LexicalAnalyzerC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File tempFile = new File("");
        String jflexString = "/src/lexicalanalyzerc/lexicalRules.jflex";
        String cupString = "/src/lexicalanalyzerc/Grammar.cup";
        generateJavaFiles(tempFile.getAbsolutePath()+jflexString, tempFile.getAbsolutePath() + cupString);
        tempFile.delete();
        frameAnalyzer analyzerWindow = new frameAnalyzer();
        analyzerWindow.setVisible(true);
        
    }
    
    public static void generateJavaFiles(String path, String path1){
        try
        {
                     
            File file = new File(path);
            jflex.Main.generate(file);
            
            String[] cupCommands = {"-destdir", "C:\\Users\\Oscar\\Google Drive\\Sexto Ciclo\\Compiladores\\Analizador Sintáctico\\lexicalAnalyzerC-\\lexicalAnalyzerC#\\src\\lexicalanalyzerc\\" ,"-parser", "Rules", path1};
        
            java_cup.Main.main(cupCommands); 
        
            
        }
        catch(Exception e)
        {
            
        }              
    }
    
}
