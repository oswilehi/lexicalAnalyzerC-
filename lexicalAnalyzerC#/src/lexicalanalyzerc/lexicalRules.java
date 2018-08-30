/* The following code was generated by JFlex 1.6.1 */

package lexicalanalyzerc;
import static lexicalanalyzerc.Token.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>C:/Users/Oscar/Google Drive/Sexto Ciclo/Compiladores/Analizador Léxico/lexicalAnalyzerC-/lexicalAnalyzerC#/src/lexicalanalyzerc/lexicalRules.jflex</tt>
 */
class lexicalRules {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\66\1\62\1\64\1\64\1\63\22\0\1\66\1\41\1\65"+
    "\2\0\1\40\1\43\1\60\1\50\1\51\1\36\1\35\1\40\1\35"+
    "\1\45\1\37\1\32\11\54\1\0\1\40\1\41\1\42\1\41\2\0"+
    "\1\30\3\56\1\57\1\56\7\33\1\27\11\33\1\55\2\33\1\46"+
    "\1\61\1\47\1\0\1\34\1\0\1\17\1\10\1\16\1\4\1\12"+
    "\1\20\1\15\1\21\1\3\1\33\1\26\1\11\1\23\1\5\1\2"+
    "\1\24\1\33\1\14\1\13\1\6\1\7\1\1\1\25\1\22\1\31"+
    "\1\33\1\52\1\44\1\53\7\0\1\64\32\0\1\66\u15df\0\1\66"+
    "\u097f\0\13\66\35\0\1\64\1\64\5\0\1\66\57\0\1\66\u0fa0\0"+
    "\1\66\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\ud00f\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\16\2\1\1\3\3\2\1\3\3\1\4"+
    "\1\1\2\5\1\1\2\2\1\6\16\2\2\0\1\5"+
    "\2\0\1\7\3\0\1\2\1\6\13\2\1\6\2\0"+
    "\1\1\1\0\7\2\1\10\1\5\3\0\1\11\6\2"+
    "\2\0\3\2\1\11\4\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[103];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\67\0\156\0\245\0\334\0\u0113\0\u014a\0\u0181"+
    "\0\u01b8\0\u01ef\0\u0226\0\u025d\0\u0294\0\u02cb\0\u0302\0\u0339"+
    "\0\u0370\0\67\0\u03a7\0\u03de\0\u0415\0\u044c\0\u0483\0\u04ba"+
    "\0\u04f1\0\u0528\0\u055f\0\67\0\u0596\0\u05cd\0\u0604\0\u063b"+
    "\0\245\0\u0672\0\u06a9\0\u06e0\0\u0717\0\u074e\0\u0785\0\u07bc"+
    "\0\u07f3\0\u082a\0\u0861\0\u0898\0\u08cf\0\u0906\0\u093d\0\u0974"+
    "\0\u09ab\0\u09e2\0\u0a19\0\u055f\0\67\0\u0a50\0\u05cd\0\u0a87"+
    "\0\u0abe\0\u0af5\0\u0b2c\0\u0b63\0\u0b9a\0\u0bd1\0\u0c08\0\u0c3f"+
    "\0\u0c76\0\u0cad\0\u0ce4\0\u0d1b\0\u0d52\0\u0d89\0\u0dc0\0\u0df7"+
    "\0\u0e2e\0\u0e65\0\u0e9c\0\u0ed3\0\u0f0a\0\u0f41\0\u0f78\0\u0faf"+
    "\0\u0fe6\0\u0974\0\u101d\0\u0e2e\0\u1054\0\u108b\0\u0e65\0\u10c2"+
    "\0\u10f9\0\u1130\0\u1167\0\u119e\0\u11d5\0\u101d\0\u120c\0\u1243"+
    "\0\u127a\0\u12b1\0\u120c\0\u12e8\0\u131f\0\u1356\0\u138d";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[103];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\4"+
    "\1\11\1\4\1\12\1\13\1\14\1\4\1\15\1\4"+
    "\1\16\4\4\1\17\1\4\1\20\2\4\1\21\1\4"+
    "\1\2\2\22\1\23\1\22\2\24\1\25\1\26\1\22"+
    "\1\27\1\22\1\30\1\22\1\31\1\22\1\32\3\4"+
    "\1\33\1\2\1\34\1\35\1\34\1\36\1\34\70\0"+
    "\1\4\1\37\32\4\17\0\4\4\10\0\34\4\17\0"+
    "\4\4\10\0\4\4\1\40\12\4\1\41\2\4\1\42"+
    "\11\4\17\0\4\4\10\0\1\4\1\43\32\4\17\0"+
    "\4\4\10\0\6\4\1\44\25\4\17\0\4\4\10\0"+
    "\20\4\1\45\13\4\17\0\4\4\10\0\1\4\1\46"+
    "\11\4\1\47\20\4\17\0\4\4\10\0\10\4\1\50"+
    "\10\4\1\51\12\4\17\0\4\4\10\0\5\4\1\52"+
    "\26\4\17\0\4\4\10\0\11\4\1\53\22\4\17\0"+
    "\4\4\10\0\10\4\1\54\23\4\17\0\4\4\10\0"+
    "\1\4\1\55\32\4\17\0\4\4\10\0\20\4\1\56"+
    "\13\4\17\0\4\4\10\0\11\4\1\57\22\4\17\0"+
    "\4\4\31\0\1\60\32\0\1\60\47\0\1\61\1\62"+
    "\71\0\1\22\67\0\1\22\67\0\1\22\71\0\1\22"+
    "\70\0\1\22\70\0\1\22\45\0\1\32\12\0\1\63"+
    "\6\0\1\32\12\0\60\64\1\65\1\66\5\64\62\0"+
    "\1\34\4\0\61\67\1\70\3\67\1\65\1\67\1\0"+
    "\2\4\1\71\31\4\17\0\4\4\10\0\5\4\1\72"+
    "\26\4\17\0\4\4\10\0\23\4\1\73\10\4\17\0"+
    "\4\4\10\0\6\4\1\74\25\4\17\0\4\4\10\0"+
    "\10\4\1\75\23\4\17\0\4\4\10\0\2\4\1\76"+
    "\31\4\17\0\4\4\10\0\1\4\1\75\32\4\17\0"+
    "\4\4\10\0\11\4\1\77\22\4\17\0\4\4\10\0"+
    "\12\4\1\100\21\4\17\0\4\4\10\0\5\4\1\101"+
    "\26\4\17\0\4\4\10\0\13\4\1\102\20\4\17\0"+
    "\4\4\10\0\5\4\1\103\26\4\17\0\4\4\10\0"+
    "\16\4\1\104\15\4\17\0\4\4\10\0\13\4\1\41"+
    "\20\4\17\0\4\4\10\0\2\4\1\105\31\4\17\0"+
    "\4\4\10\0\24\4\1\106\7\4\17\0\4\4\63\0"+
    "\1\107\12\0\36\61\1\110\23\61\1\111\4\61\62\62"+
    "\2\0\3\62\54\0\1\112\12\0\62\64\3\0\2\64"+
    "\62\67\3\0\2\67\1\0\3\4\1\41\30\4\17\0"+
    "\4\4\10\0\11\4\1\113\22\4\17\0\4\4\10\0"+
    "\10\4\1\114\23\4\17\0\4\4\10\0\7\4\1\105"+
    "\24\4\17\0\4\4\10\0\10\4\1\41\23\4\17\0"+
    "\4\4\10\0\12\4\1\41\21\4\17\0\4\4\10\0"+
    "\16\4\1\115\15\4\17\0\4\4\10\0\11\4\1\41"+
    "\22\4\17\0\4\4\10\0\11\4\1\116\22\4\17\0"+
    "\4\4\10\0\2\4\1\117\31\4\17\0\4\4\10\0"+
    "\6\4\1\120\25\4\17\0\4\4\10\0\12\4\1\76"+
    "\21\4\17\0\4\4\10\0\10\4\1\100\23\4\17\0"+
    "\4\4\10\0\27\4\1\121\4\4\17\0\4\4\13\0"+
    "\1\122\3\0\1\122\1\0\1\122\3\0\3\122\7\0"+
    "\1\122\1\0\1\107\21\0\1\107\1\0\2\122\7\0"+
    "\36\61\1\110\1\123\22\61\1\111\4\61\36\124\1\125"+
    "\30\124\12\0\1\126\17\0\1\127\21\0\1\127\2\0"+
    "\1\126\10\0\13\4\1\130\20\4\17\0\4\4\10\0"+
    "\11\4\1\131\22\4\17\0\4\4\10\0\25\4\1\41"+
    "\6\4\17\0\4\4\10\0\4\4\1\132\27\4\17\0"+
    "\4\4\10\0\4\4\1\133\27\4\17\0\4\4\10\0"+
    "\13\4\1\134\20\4\17\0\4\4\10\0\13\4\1\135"+
    "\20\4\17\0\4\4\7\0\62\136\1\2\4\136\36\124"+
    "\1\125\1\34\27\124\35\0\1\137\32\0\17\4\1\140"+
    "\14\4\17\0\4\4\10\0\22\4\1\141\11\4\17\0"+
    "\4\4\10\0\3\4\1\76\30\4\17\0\4\4\10\0"+
    "\14\4\1\41\17\4\17\0\4\4\10\0\4\4\1\41"+
    "\27\4\17\0\4\4\10\0\13\4\1\142\20\4\17\0"+
    "\4\4\41\0\1\143\21\0\1\143\13\0\16\4\1\144"+
    "\15\4\17\0\4\4\10\0\11\4\1\145\22\4\17\0"+
    "\4\4\10\0\16\4\1\146\15\4\17\0\4\4\10\0"+
    "\15\4\1\100\16\4\17\0\4\4\10\0\4\4\1\147"+
    "\27\4\17\0\4\4\10\0\30\4\1\41\3\4\17\0"+
    "\4\4\10\0\5\4\1\76\26\4\17\0\4\4\7\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5060];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\17\1\1\11\11\1\1\11\23\1\2\0"+
    "\1\1\2\0\1\11\3\0\16\1\2\0\1\1\1\0"+
    "\11\1\3\0\7\1\2\0\10\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[103];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
public String lexeme="";


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  lexicalRules(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 216) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { lexeme = Integer.toString(yyline + 1) + "," + yytext(); return ERROR;
            }
          case 10: break;
          case 2: 
            { lexeme= Integer.toString(yyline + 1) + "," + (yycolumn + 1)+ "," + Integer.toString(yylength() + yycolumn) + "," + yytext(); return ID;
            }
          case 11: break;
          case 3: 
            { lexeme= Integer.toString(yyline + 1) + "," + (yycolumn + 1) + "," + Integer.toString(yylength() + yycolumn) + "," + yytext(); return SYMBOLS;
            }
          case 12: break;
          case 4: 
            { lexeme= Integer.toString(yyline + 1) + "," + (yycolumn + 1) + "," + Integer.toString(yylength() + yycolumn) + "," + yytext(); return INTEGERCONST;
            }
          case 13: break;
          case 5: 
            { lexeme=yytext(); return WHITESPACE;
            }
          case 14: break;
          case 6: 
            { lexeme= Integer.toString(yyline + 1) + "," + (yycolumn + 1) + "," + Integer.toString(yylength() + yycolumn) + "," + yytext(); return KEYWORDS;
            }
          case 15: break;
          case 7: 
            { lexeme= Integer.toString(yyline + 1) + "," + (yycolumn + 1) + "," + Integer.toString(yylength() + yycolumn) + "," + yytext(); return STRINGCONST;
            }
          case 16: break;
          case 8: 
            { lexeme= Integer.toString(yyline + 1) + "," + (yycolumn + 1) + "," + Integer.toString(yylength() + yycolumn) + "," + yytext(); return HEXCONST;
            }
          case 17: break;
          case 9: 
            { lexeme= Integer.toString(yyline + 1) + "," + (yycolumn + 1) + "," + Integer.toString(yylength() + yycolumn) + "," + yytext(); return DOUBLECONST;
            }
          case 18: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}