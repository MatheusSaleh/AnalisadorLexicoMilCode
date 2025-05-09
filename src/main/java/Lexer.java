/* The following code was generated by JFlex 1.6.1 */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>src/main/java/Lexer.flex</tt>
 */
public class Lexer {

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
    "\11\47\1\43\1\30\1\45\1\45\1\44\22\47\1\43\1\31\1\27"+
    "\1\33\4\47\2\42\1\37\1\35\1\47\1\36\1\26\1\40\12\1"+
    "\2\42\1\47\1\34\1\41\1\32\1\47\32\2\4\47\1\6\1\47"+
    "\1\10\1\16\1\7\1\20\1\12\1\25\1\4\1\22\1\24\2\2"+
    "\1\15\1\21\1\13\1\17\1\11\1\2\1\14\1\3\1\5\1\23"+
    "\5\2\1\42\1\47\1\42\2\47\5\0\1\46\u1fa2\0\1\46\1\46"+
    "\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\13\3\1\4\3\3\4\5\1\3"+
    "\1\6\14\0\1\7\1\10\1\11\1\12\1\13\3\0"+
    "\1\14\15\0\1\15\5\0\1\14\4\0\1\16\7\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[77];
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
    "\0\0\0\50\0\120\0\50\0\170\0\240\0\310\0\360"+
    "\0\u0118\0\u0140\0\u0168\0\u0190\0\u01b8\0\u01e0\0\u0208\0\u0230"+
    "\0\u0258\0\u0280\0\u02a8\0\u02d0\0\50\0\u02f8\0\u0320\0\50"+
    "\0\u0348\0\u0370\0\u0398\0\u03c0\0\u03e8\0\u0410\0\u0438\0\u0460"+
    "\0\u0488\0\u04b0\0\u04d8\0\u01e0\0\50\0\50\0\u0500\0\50"+
    "\0\u0348\0\u0528\0\u0550\0\u0578\0\50\0\u05a0\0\u05c8\0\u05f0"+
    "\0\u0618\0\u0640\0\u0668\0\u0690\0\u06b8\0\u06e0\0\u0708\0\u0730"+
    "\0\u0758\0\u0780\0\u07a8\0\u07d0\0\u07f8\0\u0820\0\u0848\0\u0870"+
    "\0\u0898\0\u08c0\0\u08e8\0\u0910\0\u0938\0\50\0\u0960\0\u0988"+
    "\0\u09b0\0\u09d8\0\u0a00\0\u0a28\0\u0a50";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[77];
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
    "\1\2\1\3\1\4\1\5\1\6\2\4\1\7\1\10"+
    "\1\11\2\4\1\12\2\4\1\13\1\4\1\14\2\4"+
    "\1\15\2\4\1\16\1\17\1\20\1\21\1\22\1\4"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\2\17\1\0"+
    "\1\2\1\4\51\0\1\3\24\0\1\31\25\0\1\32"+
    "\55\0\1\33\45\0\1\34\6\0\1\35\44\0\1\36"+
    "\43\0\1\37\51\0\1\40\51\0\1\41\57\0\1\42"+
    "\36\0\1\43\34\0\27\44\1\45\1\0\17\44\30\0"+
    "\1\17\12\0\2\17\34\0\1\46\50\0\1\46\50\0"+
    "\2\46\50\0\1\25\50\0\1\25\51\0\1\47\50\0"+
    "\1\50\7\0\1\51\53\0\1\52\55\0\1\52\45\0"+
    "\1\52\51\0\1\53\5\0\1\54\33\0\1\55\47\0"+
    "\1\56\51\0\1\57\5\0\1\60\52\0\1\61\32\0"+
    "\1\62\71\0\1\55\22\0\30\47\1\0\13\47\3\0"+
    "\1\47\6\0\1\63\46\0\1\64\52\0\1\65\53\0"+
    "\1\66\45\0\1\67\45\0\1\70\51\0\1\71\40\0"+
    "\1\72\46\0\4\73\1\0\17\73\36\0\1\74\46\0"+
    "\1\75\57\0\1\76\42\0\1\77\36\0\1\100\63\0"+
    "\1\101\36\0\1\102\40\0\25\73\32\0\1\103\57\0"+
    "\1\104\44\0\1\105\42\0\1\106\51\0\1\106\43\0"+
    "\1\107\60\0\1\106\51\0\1\110\36\0\1\111\61\0"+
    "\1\77\30\0\1\100\54\0\1\112\52\0\1\113\50\0"+
    "\1\114\40\0\1\115\51\0\1\105\52\0\1\55\35\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2680];
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
    "\1\0\1\11\1\1\1\11\20\1\1\11\2\1\1\11"+
    "\14\0\2\11\1\1\1\11\1\1\3\0\1\11\15\0"+
    "\1\1\5\0\1\1\4\0\1\11\7\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[77];
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

// enum para os tipos de token
public enum TokenType {
    PALAVRA_CHAVE, TIPO, IDENTIFICADOR, NUMERO_INT, NUMERO_REAL,
    TEXTO, ATRIBUICAO, OP_LOGICO, OP_MATEMATICO,
    DELIMITADOR, COMENTARIO, ERRO, EOF
}

// objeto Token simples
public static class Token {
    public final TokenType tipo;
    public final String lexema;
    public final int linha;
    public final int coluna;

    public Token(TokenType tipo, String lexema, int linha, int coluna) {
        this.tipo = tipo;
        this.lexema = lexema;
        this.linha = linha;
        this.coluna = coluna;
    }

    @Override
    public String toString() {
        return String.format("Linha %-3d Coluna %-3d | %-15s | %s", linha, coluna, tipo, lexema);
    }
}



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
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
    while (i < 154) {
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
  public Token nextToken() throws java.io.IOException {
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
              {
                return new Token(TokenType.EOF, "EOF", yyline+1, yycolumn+1);
              }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return new Token(TokenType.ERRO, "CARACTERE_INVALIDO: " + yytext(), yyline+1, yycolumn+1);
            }
          case 15: break;
          case 2: 
            { return new Token(TokenType.NUMERO_INT, yytext(), yyline+1, yycolumn+1);
            }
          case 16: break;
          case 3: 
            { return new Token(TokenType.ERRO, yytext(), yyline+1, yycolumn+1);
            }
          case 17: break;
          case 4: 
            { /* ignora */
            }
          case 18: break;
          case 5: 
            { return new Token(TokenType.OP_MATEMATICO, yytext(), yyline+1, yycolumn+1);
            }
          case 19: break;
          case 6: 
            { return new Token(TokenType.DELIMITADOR, yytext(), yyline+1, yycolumn+1);
            }
          case 20: break;
          case 7: 
            { return new Token(TokenType.TEXTO, yytext(), yyline+1, yycolumn+1);
            }
          case 21: break;
          case 8: 
            { return new Token(TokenType.OP_LOGICO, yytext(), yyline+1, yycolumn+1);
            }
          case 22: break;
          case 9: 
            { /* ignora comentários */
            }
          case 23: break;
          case 10: 
            { return new Token(TokenType.ATRIBUICAO, yytext(), yyline+1, yycolumn+1);
            }
          case 24: break;
          case 11: 
            { return new Token(TokenType.NUMERO_REAL, yytext(), yyline+1, yycolumn+1);
            }
          case 25: break;
          case 12: 
            { return new Token(TokenType.TIPO, yytext(), yyline+1, yycolumn+1);
            }
          case 26: break;
          case 13: 
            { return new Token(TokenType.IDENTIFICADOR, yytext(), yyline+1, yycolumn+1);
            }
          case 27: break;
          case 14: 
            { return new Token(TokenType.PALAVRA_CHAVE, yytext(), yyline+1, yycolumn+1);
            }
          case 28: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
