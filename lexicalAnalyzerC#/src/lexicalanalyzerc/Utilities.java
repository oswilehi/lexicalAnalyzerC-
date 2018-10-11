/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicalanalyzerc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Oscar
 */


public class Utilities {
    
    ///String lexemaToAnalyze, String line, String columns, String typeOfToken, int val
    static String lexemaToAnalyze;
    static String line;
    static String columns;
    static String typeOfToken;
    static String val;
    static String ruta;
    static File File;
    
    public static String removeExtension (String word){
        char[] wordChar = word.toCharArray();
        String[] wordToChange = new String[word.length()];
        String wordWithoutExtension = "";
        for (int i = 0; i < word.length(); i++){
            wordToChange[i] = Character.toString(wordChar[i]);
            if (wordToChange[i].equals("."))
                break;
            else
                wordWithoutExtension = wordWithoutExtension + wordToChange[i];
        }    
       return wordWithoutExtension; 
    }
    public static void analyzeFile(JTextArea jTextArea2, JTextArea jTextArea1) throws FileNotFoundException, IOException{
        LinkedList<String> listOfErrors = new LinkedList<String>();
        File fichero = new File ("fileC#.txt");       
        PrintWriter writer;
        try {
            writer = new PrintWriter(fichero);
            writer.print(jTextArea2.getText());
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frameAnalyzer.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Reader reader = new FileReader("fileC#.txt
        
        
        
        Reader targetReader = new FileReader(File);
           
        lexicalRules lexer = new lexicalRules(targetReader);
        syntacticRules rules = new syntacticRules(lexer);
        try
        {
            rules.debug_parse();
            
            if(rules.listaErrores.equals(""))
                jTextArea1.append("No hay errores");
            else
                jTextArea1.append(rules.listaErrores);  
        }
        catch (Exception e)
        {
            
        }                                 
    }
    
    public static String constanstDefine(int simpleComma, int doubleComma, String word){
        int indexOfComma;
        String correctConstant = "";
        if (simpleComma == -1)
            indexOfComma = doubleComma+1;
        else
            indexOfComma = simpleComma+1;
        
        char[] wordArray = word.toCharArray();
        
        for(int i = 0; i < indexOfComma; i++)
            correctConstant = correctConstant + wordArray[i];
        
        int c = indexOfComma;
        while(!Character.toString(wordArray[c]).equals("'") && !Character.toString(wordArray[c]).equals('"')){
            correctConstant = correctConstant + Character.toString(wordArray[c]).toUpperCase();
            c++;
        }
        
        for(int i = c; i < wordArray.length; i++)
            correctConstant = correctConstant + wordArray[i];
               
        return correctConstant;
    }
    
    public static String getVariables(String lexema, String tokenType, boolean value){
        line = lexema.split(",")[0];
        columns = lexema.split(",")[3] + "-" + lexema.split(",")[2];
        typeOfToken = tokenType;
        if (value)
            val = lexema.split(",")[1];
        else
            val = "-1";
        lexemaToAnalyze = lexema.split(",")[1];
        
        return shapeSentence(lexemaToAnalyze, line, columns, typeOfToken, val);
        
    }
    
    public static String shapeSentence(String lexemaToAnalyze, String line, String columns, String typeOfToken, String val){
        String sentence;
        if (val.equals("-1"))
            sentence = lexemaToAnalyze + "  line " + line + "   cols    " + columns + " is  " + typeOfToken + "\n";
        else
            sentence = lexemaToAnalyze + "  line " + line + "   cols    " + columns + " is  " + typeOfToken + " (value = " + val + ")\n";
        
        return sentence;
        
    }
}
