/*******************************************************************************
 * Copyright (c) 2016 Institute of Legal Information Theory and Techniques (ITTIG).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU GPL license v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.en.html
 *
 * Contributors: 
 *   Institute of Legal Information Theory and Techniques (ITTIG/CNR)
 *******************************************************************************/
/* The following code was generated by JFlex 1.5.1 */

package it.cnr.ittig.linkoln.scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.5.1
 * from the specification file <tt>EmanantiNumeri.jflex</tt>
 */
public class EmanantiNumeri {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int AH = 2;
  public static final int LK = 4;
  public static final int inNumeroEma = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\5\1\2\1\27\1\30\1\1\22\0\1\5\6\0\1\0"+
    "\4\0\1\0\1\0\1\26\1\22\12\4\2\0\1\20\1\0\1\21"+
    "\2\0\1\10\1\3\1\14\1\3\1\12\1\3\1\3\1\3\1\7"+
    "\1\3\1\24\1\23\1\25\1\13\1\11\1\16\1\3\1\17\1\3"+
    "\1\3\1\15\2\3\1\3\2\3\4\0\1\0\1\0\1\10\1\3"+
    "\1\14\1\3\1\12\1\3\1\3\1\3\1\7\2\3\1\3\1\25"+
    "\1\13\1\11\1\16\1\3\1\17\1\3\1\3\1\15\2\3\1\3"+
    "\2\3\12\0\1\27\56\0\1\0\13\0\2\0\6\0\2\0\2\0"+
    "\2\0\4\0\2\0\5\0\2\0\5\0\2\0\6\0\2\0\2\0"+
    "\2\0\4\0\2\0\5\0\2\0\65\0\2\6\115\0\1\0\u1e93\0"+
    "\1\0\1\0\4\0\1\0\16\0\1\27\1\27\udfd6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\4\1\1\2\2\3\1\1\1\2\1\1\3\4"+
    "\24\0\1\5\1\6\10\0\1\7\30\0\1\10\7\0"+
    "\1\11\3\12\2\0\3\13\3\14";

  private static int [] zzUnpackAction() {
    int [] result = new int[92];
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
    "\0\0\0\31\0\62\0\113\0\144\0\175\0\226\0\257"+
    "\0\144\0\310\0\226\0\341\0\226\0\372\0\226\0\u0113"+
    "\0\u012c\0\u0145\0\u015e\0\u0177\0\u0190\0\u01a9\0\u01c2\0\341"+
    "\0\u01db\0\372\0\u01f4\0\u020d\0\u0226\0\u023f\0\u0258\0\u0271"+
    "\0\u028a\0\u02a3\0\u02bc\0\u02d5\0\u02ee\0\u02ee\0\226\0\u0307"+
    "\0\u0320\0\u0339\0\u0352\0\u036b\0\u0384\0\u039d\0\u03b6\0\226"+
    "\0\u03cf\0\u03e8\0\u0401\0\u041a\0\u0433\0\u044c\0\u0465\0\u047e"+
    "\0\u0497\0\u04b0\0\u04c9\0\u04e2\0\u04fb\0\u0514\0\u052d\0\u0546"+
    "\0\u055f\0\u0578\0\u0591\0\u05aa\0\u05c3\0\u05dc\0\u05f5\0\u060e"+
    "\0\u0627\0\u0640\0\u0659\0\u0672\0\u068b\0\u06a4\0\u06bd\0\u06d6"+
    "\0\u06ef\0\226\0\u0708\0\u0672\0\u0721\0\u073a\0\226\0\u0753"+
    "\0\u0721\0\226\0\u076c\0\u073a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[92];
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
    "\1\5\1\6\1\5\1\7\3\5\11\7\1\10\2\5"+
    "\3\7\1\5\2\11\1\7\1\12\1\13\15\7\1\14"+
    "\6\7\2\15\1\7\1\12\1\13\15\7\1\16\6\7"+
    "\2\15\10\17\1\20\3\17\1\21\14\17\10\0\1\22"+
    "\2\0\1\23\1\24\16\0\1\5\5\0\1\22\2\0"+
    "\1\23\1\24\46\0\2\25\2\0\1\25\2\0\1\26"+
    "\2\0\1\23\1\24\6\0\1\27\4\0\1\25\2\0"+
    "\1\13\27\0\2\30\2\0\1\30\14\0\1\31\5\0"+
    "\1\30\1\0\2\32\2\0\1\32\14\0\1\33\5\0"+
    "\1\32\6\0\2\34\34\0\1\35\23\0\2\36\22\0"+
    "\2\37\2\0\1\37\2\0\1\40\2\0\1\41\1\42"+
    "\1\43\1\0\1\41\6\0\1\37\1\0\1\37\13\0"+
    "\1\44\16\0\2\25\2\0\1\25\2\0\1\45\12\0"+
    "\1\27\4\0\1\25\1\0\2\46\2\0\1\46\2\36"+
    "\20\0\1\46\24\0\1\47\14\0\1\50\43\0\1\51"+
    "\23\0\1\52\20\0\2\53\37\0\1\54\13\0\2\37"+
    "\2\0\1\37\2\0\1\40\3\0\1\42\13\0\1\37"+
    "\6\0\2\55\22\0\2\37\2\0\1\37\2\0\1\40"+
    "\3\0\1\42\11\0\1\37\1\0\1\37\13\0\1\40"+
    "\42\0\1\56\11\0\2\57\22\0\2\46\2\0\1\46"+
    "\22\0\1\46\21\0\1\60\33\0\1\60\14\0\1\61"+
    "\36\0\1\62\22\0\1\63\36\0\1\64\13\0\2\37"+
    "\2\0\1\37\2\0\1\40\1\0\1\65\1\0\1\42"+
    "\11\0\1\37\1\0\1\37\16\0\1\66\13\0\2\61"+
    "\2\0\1\61\14\0\1\67\5\0\1\61\10\0\1\70"+
    "\21\0\2\63\2\0\1\63\14\0\1\71\5\0\1\63"+
    "\10\0\1\72\37\0\1\73\21\0\1\74\21\0\2\67"+
    "\1\75\1\0\1\67\1\0\11\75\3\0\3\75\2\0"+
    "\1\67\1\0\2\70\2\0\1\70\14\0\1\76\5\0"+
    "\1\70\1\0\2\71\1\77\1\0\1\71\1\0\11\77"+
    "\3\0\3\77\2\0\1\71\1\0\2\72\2\0\1\72"+
    "\14\0\1\100\5\0\1\72\6\0\2\37\1\0\1\37"+
    "\20\0\2\74\2\0\1\74\14\0\1\101\5\0\1\74"+
    "\1\0\2\102\1\75\1\0\1\102\1\0\11\75\2\0"+
    "\1\103\3\75\2\0\1\102\1\0\2\76\1\104\1\0"+
    "\1\76\1\0\11\104\3\0\3\104\2\0\1\76\1\0"+
    "\2\105\1\77\1\0\1\105\1\0\11\77\2\0\1\106"+
    "\3\77\2\0\1\105\1\0\2\100\1\107\1\0\1\100"+
    "\1\0\11\107\3\0\3\107\2\0\1\100\1\0\2\101"+
    "\1\110\1\0\1\101\1\0\11\110\3\0\3\110\2\0"+
    "\1\101\1\0\2\102\2\0\1\102\14\0\1\103\5\0"+
    "\1\102\1\0\2\103\1\0\1\111\1\103\22\0\1\103"+
    "\1\0\2\112\1\104\1\0\1\112\1\0\11\104\2\0"+
    "\1\113\3\104\2\0\1\112\1\0\2\105\2\0\1\105"+
    "\14\0\1\106\5\0\1\105\1\0\2\106\1\0\1\114"+
    "\1\106\22\0\1\106\1\0\2\115\1\107\1\0\1\115"+
    "\1\0\11\107\2\0\1\116\3\107\2\0\1\115\1\0"+
    "\2\117\1\110\1\0\1\117\1\0\11\110\2\0\1\120"+
    "\3\110\2\0\1\117\4\0\1\111\25\0\2\112\2\0"+
    "\1\112\14\0\1\113\5\0\1\112\1\0\2\113\1\0"+
    "\1\121\1\113\22\0\1\113\1\122\1\123\1\122\1\0"+
    "\1\124\2\122\11\0\3\122\3\0\3\122\1\0\2\115"+
    "\2\0\1\115\14\0\1\116\5\0\1\115\1\0\2\116"+
    "\1\0\1\125\1\116\22\0\1\116\1\0\2\117\2\0"+
    "\1\117\14\0\1\120\5\0\1\117\1\0\2\120\1\0"+
    "\1\126\1\120\22\0\1\120\4\0\1\121\26\0\1\122"+
    "\26\0\1\127\1\130\1\127\1\0\1\131\2\127\11\0"+
    "\3\127\3\0\3\127\1\132\1\133\1\132\1\0\1\134"+
    "\2\132\11\0\3\132\3\0\3\132\2\0\1\127\30\0"+
    "\1\132\26\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1925];
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
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\2\1\1\11\3\1\1\11\1\1\1\11\1\1"+
    "\1\11\2\1\24\0\1\1\1\11\10\0\1\11\30\0"+
    "\1\1\7\0\1\1\1\11\2\1\2\0\1\11\2\1"+
    "\1\11\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[92];
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

  /* user code: */
	
	static final private Pattern ints = Pattern.compile("\\d+");

	private String openTag = "<font color=\"magenta\"><LK:NUMDOC";  
	private String closeTag = "</LK:NUMDOC></font>"; 
		
	private StringBuilder output = new StringBuilder();

	String numero = "";
	int length = 0;
	int offset = 0;
	
	public String getOutput() {
		return output.toString();
	}
	
	private String getNumber(String text) {
		
		return getNumber(text, true, false);
	}
	
	private String getNumber(String text, boolean first, boolean second) {
		
		Matcher matcher = ints.matcher(text);
		
		if( matcher.find() && first ) {
			return text.substring(matcher.start(), matcher.end());
		}

		if( matcher.find() && second ) {
			return text.substring(matcher.start(), matcher.end());
		}

		return "";
	}

	private void saveNumero(String text, String emanante) {
		
		//La variabile globale numero contiene il testo complessivo che va messo nel tag NUMDOC, comprensivo di {NA} iniziale e finale;
		//'text' è il numero, senza eventuali prefissi come "n. " e senza {NA};
		//Si salva l'emanante nell'attributo 'emanante' di NUMDOC
		//Salva il numero come mixed 
		
		System.out.println("saveNumero numero:\"" + numero + "\" text:\"" + text + "\"");
		
		String mixedValue = text.replaceAll(" ", "").replaceAll("/", "-").toLowerCase();
		
		String value = " value=\"" + getNumber(mixedValue) + "\" mixed=\"" + mixedValue 
											+ "\" emanante=\"" + emanante + "\">";
		
		String out = numero.substring(0,1) + openTag + value + numero.substring(1,numero.length()-1) 
							+ closeTag + numero.substring(numero.length()-1, numero.length());
		
		output.append(out);	
	}




  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public EmanantiNumeri(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
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
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

    // numRead < 0
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
  public int yylex() throws java.io.IOException {
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
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
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
          yycolumn++;
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
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
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

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { output.append(yytext());
          }
        case 13: break;
        case 2: 
          { System.out.print(yytext());
          }
        case 14: break;
        case 3: 
          { 
          }
        case 15: break;
        case 4: 
          { offset++;
				
				if( offset >= length ) {
					
					yypushback(1);
					yybegin(YYINITIAL);
				}
          }
        case 16: break;
        case 5: 
          { output.append(yytext()); yybegin(AH);
          }
        case 17: break;
        case 6: 
          { output.append(yytext()); yybegin(LK);
          }
        case 18: break;
        case 7: 
          { output.append(yytext()); yybegin(YYINITIAL);
          }
        case 19: break;
        case 8: 
          { saveNumero(yytext(), "autorita.informatica.pubblica.amministrazione");
          }
        case 20: break;
        case 9: 
          { saveNumero(yytext(), "centro.nazionale.informatica.pubblica.amministrazione");
          }
        case 21: break;
        case 10: 
          { numero = yytext();
					saveNumero(yytext().substring(1,yylength()-1), "autorita.informatica.pubblica.amministrazione");
					/*
					output.append(yytext().substring(0,1));
					saveNumero(yytext().substring(1, yylength()-1), "aipa");
					output.append(yytext().substring(yylength()-1,yylength()));
					*/
          }
        case 22: break;
        case 11: 
          { numero = yytext();
											length = yylength();
											offset = 0;
											yypushback(yylength());
											yybegin(inNumeroEma);
          }
        case 23: break;
        case 12: 
          { numero = yytext();
					saveNumero(yytext().substring(1,yylength()-1), "centro.nazionale.informatica.pubblica.amministrazione");
					/*
					output.append(yytext().substring(0,1));
					saveNumero(yytext().substring(1, yylength()-1), "cnipa");
					output.append(yytext().substring(yylength()-1,yylength()));
					*/
          }
        case 24: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return YYEOF;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java EmanantiNumeri [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        EmanantiNumeri scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new EmanantiNumeri(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
