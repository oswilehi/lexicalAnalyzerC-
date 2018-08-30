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
        generateJavaFile(tempFile.getAbsolutePath()+jflexString);
        tempFile.delete();
        frameAnalyzer analyzerWindow = new frameAnalyzer();
        analyzerWindow.setVisible(true);
        
    }
    
    public static void generateJavaFile(String path){
        File file = new File(path);
        jflex.Main.generate(file);
    }
    
}
