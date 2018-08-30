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
        Reader reader = new BufferedReader(new FileReader("fileC#.txt"));

        lexicalRules lexer = new lexicalRules(reader);
        String resultado="";
        while (true){
            Token token = lexer.yylex();
            
            if (token == null)
                break;
            
            
            switch (token){
                case WHITESPACE:
                    System.out.print(lexer.lexeme);
                    break;                    
                case KEYWORDS:
                    System.out.print(lexer.lexeme);
                    jTextArea1.append(Utilities.getVariables(lexer.lexeme, "T_KEYWORDS", false));
                    break;
                case ID:
                    System.out.print(lexer.lexeme);
                    String id = lexer.lexeme.split(",")[1];
                    if (id.length() <= 31 )
                        jTextArea1.append(Utilities.getVariables(lexer.lexeme, "ID", false));
                    else
                        listOfErrors.add("El ID: " + id + " supera los 31 caracteres en la linea " + lexer.lexeme.split(",")[0]);
                    break;    
                case SYMBOLS:
                    System.out.print(lexer.lexeme);
                    jTextArea1.append(Utilities.getVariables(lexer.lexeme, "T_SYMBOLS", false));
                    break;
                case BOOLCONST:
                    System.out.print(lexer.lexeme);
                    jTextArea1.append(Utilities.getVariables(lexer.lexeme, "T_BOOLCONST", false));
                    break;
                case INTEGERCONST:
                    System.out.print(lexer.lexeme);
                    jTextArea1.append(Utilities.getVariables(lexer.lexeme, "T_INTEGERCONST", true));
                    break;
                case HEXCONST:
                    System.out.print(lexer.lexeme);
                    jTextArea1.append(Utilities.getVariables(lexer.lexeme, "T_HEXCONST", true));
                    break;
                case DOUBLECONST:
                    System.out.print(lexer.lexeme);
                    jTextArea1.append(Utilities.getVariables(lexer.lexeme, "T_DOUBLECONST", true));
                    break;
                case STRINGCONST:
                    System.out.print(lexer.lexeme);
                    jTextArea1.append(Utilities.getVariables(lexer.lexeme, "T_STRINGCONST", false));
                    break;
                case MULTILINEERROR:
                    String[] errorMultiline = lexer.lexeme.split(",");
                    String multilineError = lexer.lexeme.split(",")[1];
                    String line = errorMultiline[0];
                    listOfErrors.add("No se finalizo el comentario " + multilineError + " en la linea " + line);
                    break;
                case ERROR:
                    String[] error = lexer.lexeme.split(",");
                    String tokenThatFailedError = error[1];
                    String lineError = error[0];
                    listOfErrors.add("No se reconocio el siguiente token " + tokenThatFailedError  + " en la linea " + lineError);
                    break;
                default:
                    resultado=resultado;
            }
        }
        if (!listOfErrors.isEmpty()){
            jTextArea1.append("\n ERRORES: \n");
            while(!listOfErrors.isEmpty())
                jTextArea1.append(listOfErrors.removeFirst() + "\n");
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
