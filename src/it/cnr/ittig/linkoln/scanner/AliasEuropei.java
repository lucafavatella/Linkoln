/* The following code was generated by JFlex 1.5.1 */

package it.cnr.ittig.linkoln.scanner;



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.5.1
 * from the specification file <tt>AliasEuropei.jflex</tt>
 */
public class AliasEuropei {

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
    "\11\0\1\5\1\2\1\35\1\36\1\1\22\0\1\5\6\0\1\0"+
    "\4\0\1\0\1\3\1\32\1\31\12\0\2\0\1\26\1\0\1\30"+
    "\2\0\1\11\1\4\1\16\1\14\1\13\1\25\1\4\1\4\1\7"+
    "\1\4\1\4\1\10\1\34\1\15\1\12\1\22\1\4\1\23\1\20"+
    "\1\24\1\21\2\4\1\27\1\4\1\33\4\0\1\3\1\0\1\11"+
    "\1\4\1\16\1\14\1\13\1\25\1\4\1\4\1\7\2\4\1\10"+
    "\1\34\1\15\1\12\1\22\1\4\1\23\1\20\1\24\1\21\2\4"+
    "\1\27\1\4\1\33\12\0\1\35\56\0\1\0\13\0\2\0\6\0"+
    "\2\0\2\0\2\0\4\0\2\0\5\0\2\0\5\0\2\0\6\0"+
    "\2\0\2\0\2\0\4\0\2\0\5\0\2\0\65\0\2\6\115\0"+
    "\1\17\u1e93\0\1\3\1\3\4\0\1\0\16\0\1\35\1\35\udfd6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\3\1\1\2\35\0\3\3\3\0\1\3\2\4"+
    "\1\0\1\4\13\0\1\3\3\0\2\5\1\0\1\5"+
    "\10\0\2\6\1\0\1\6\13\0\3\7\33\0\2\10"+
    "\1\0\1\10\24\0\1\3\142\0\2\11\1\0\1\11"+
    "\32\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[270];
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
    "\0\0\0\37\0\76\0\135\0\37\0\174\0\233\0\272"+
    "\0\331\0\370\0\u0117\0\u0136\0\u0155\0\u0174\0\u0193\0\u01b2"+
    "\0\u01d1\0\u01f0\0\u020f\0\u022e\0\u024d\0\u026c\0\u028b\0\u02aa"+
    "\0\u02c9\0\u02e8\0\u0307\0\u0326\0\u0345\0\u0364\0\u0383\0\u03a2"+
    "\0\u03c1\0\u03e0\0\135\0\u03ff\0\u041e\0\u043d\0\u045c\0\u047b"+
    "\0\u049a\0\135\0\u04b9\0\u04d8\0\u04f7\0\u0516\0\u0535\0\u0554"+
    "\0\u0573\0\u0592\0\u05b1\0\u05d0\0\u05ef\0\u060e\0\u062d\0\u064c"+
    "\0\u066b\0\u068a\0\u06a9\0\u041e\0\135\0\u06c8\0\u06e7\0\u0706"+
    "\0\u0725\0\u0744\0\u0763\0\u0782\0\u07a1\0\u07c0\0\u07df\0\u07fe"+
    "\0\135\0\u081d\0\u083c\0\u085b\0\u087a\0\u0899\0\u08b8\0\u08d7"+
    "\0\u08f6\0\u0915\0\u0934\0\u0953\0\u0972\0\u0991\0\u09b0\0\135"+
    "\0\u09cf\0\u09ee\0\u0a0d\0\u0a2c\0\u0a4b\0\u0a6a\0\u0a89\0\u0aa8"+
    "\0\u0ac7\0\u0ae6\0\u0b05\0\u0b24\0\u0b43\0\u0b62\0\u0b81\0\u0ba0"+
    "\0\u0bbf\0\u0bde\0\u0bfd\0\u0c1c\0\u0c3b\0\u0c5a\0\u0c79\0\u0c98"+
    "\0\u0cb7\0\u0cd6\0\u0cf5\0\u0d14\0\u0d33\0\135\0\u0d52\0\u0d71"+
    "\0\u0d90\0\u0daf\0\u0dce\0\u0ded\0\u0e0c\0\u0e2b\0\u0e4a\0\u04f7"+
    "\0\u0e69\0\u0e88\0\u0ea7\0\u0ec6\0\u0ee5\0\u0f04\0\u0f23\0\u0f42"+
    "\0\u0f61\0\u0f80\0\u0706\0\u0f9f\0\u0fbe\0\u0fdd\0\u085b\0\u0ffc"+
    "\0\u101b\0\u103a\0\u1059\0\u1078\0\u1097\0\u10b6\0\u10d5\0\u10f4"+
    "\0\u1113\0\u1132\0\u1151\0\u1170\0\u118f\0\u11ae\0\u11cd\0\u11ec"+
    "\0\u120b\0\u122a\0\u1249\0\u1268\0\u1287\0\u12a6\0\u12c5\0\u12e4"+
    "\0\u0d90\0\u1303\0\u1322\0\u1341\0\u1360\0\u137f\0\u139e\0\u13bd"+
    "\0\u13dc\0\u13fb\0\u141a\0\u1439\0\u1458\0\u1477\0\u1496\0\u14b5"+
    "\0\u14d4\0\u14f3\0\u1512\0\u1531\0\u1550\0\u156f\0\u158e\0\u15ad"+
    "\0\u15cc\0\u15eb\0\u160a\0\u1629\0\u1648\0\u1667\0\u1686\0\u16a5"+
    "\0\u16c4\0\u16e3\0\u1702\0\u1721\0\u1740\0\u175f\0\u177e\0\u179d"+
    "\0\u17bc\0\u17db\0\u17fa\0\u1819\0\u1838\0\u1857\0\u1876\0\u1895"+
    "\0\u18b4\0\u18d3\0\u18f2\0\u1911\0\u1930\0\u194f\0\u196e\0\u198d"+
    "\0\u19ac\0\u19cb\0\u19ea\0\u1a09\0\u1a28\0\u1a47\0\u1a66\0\u1a85"+
    "\0\u1aa4\0\u1ac3\0\u1ae2\0\u1b01\0\u1b20\0\u1b3f\0\u1b5e\0\u1b7d"+
    "\0\135\0\u1b9c\0\u1bbb\0\u1bda\0\u1bf9\0\u1c18\0\u1c37\0\u1c56"+
    "\0\u1c75\0\u1c94\0\u1cb3\0\u1cd2\0\u1cf1\0\u1d10\0\u1d2f\0\u1d4e"+
    "\0\u1d6d\0\u1bda\0\u1d8c\0\u1dab\0\u1dca\0\u1de9\0\u1e08\0\u1e27"+
    "\0\u1e46\0\u1e65\0\u1e84\0\u1ea3\0\u1ec2\0\u1ee1";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[270];
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
    "\1\2\1\3\2\2\1\4\2\2\10\4\1\2\6\4"+
    "\1\2\1\4\3\2\2\4\2\5\16\0\1\6\5\0"+
    "\1\7\14\0\1\2\13\0\1\6\5\0\1\7\62\0"+
    "\1\10\50\0\1\11\36\0\1\12\14\0\3\13\1\0"+
    "\1\13\3\0\1\14\4\0\1\15\2\0\1\16\3\0"+
    "\1\17\1\20\3\0\1\13\3\0\1\13\24\0\1\21"+
    "\13\0\3\13\1\0\1\13\10\0\1\15\2\0\1\16"+
    "\3\0\1\17\1\20\7\0\1\13\24\0\1\22\13\0"+
    "\2\23\2\0\1\23\4\0\1\24\1\25\16\0\1\26"+
    "\3\0\1\23\1\0\2\27\2\0\1\27\5\0\1\30"+
    "\1\0\1\31\14\0\1\27\3\0\1\27\1\0\3\32"+
    "\1\0\1\32\13\0\1\33\4\0\1\34\3\0\1\32"+
    "\3\0\1\32\10\0\1\35\37\0\1\36\51\0\1\37"+
    "\13\0\2\23\2\0\1\23\5\0\1\40\22\0\1\23"+
    "\17\0\2\41\13\0\1\42\2\0\1\43\1\44\1\45"+
    "\1\43\1\0\1\45\1\43\4\0\1\46\2\0\1\47"+
    "\1\43\1\0\1\50\4\0\1\43\1\0\2\43\1\51"+
    "\2\0\1\43\1\45\1\0\2\23\2\0\1\23\5\0"+
    "\1\25\22\0\1\23\1\0\2\27\2\0\1\27\5\0"+
    "\1\30\22\0\1\27\1\52\1\53\2\52\1\0\2\52"+
    "\10\0\1\52\1\0\1\54\4\0\1\52\1\0\2\52"+
    "\1\55\2\0\2\52\6\0\2\56\30\0\3\32\1\0"+
    "\1\32\13\0\1\57\4\0\1\34\7\0\1\32\1\0"+
    "\2\60\2\0\1\60\5\0\1\61\1\0\1\62\14\0"+
    "\1\60\3\0\1\60\10\0\1\63\41\0\1\64\24\0"+
    "\3\36\1\0\1\36\6\0\1\65\11\0\1\66\7\0"+
    "\1\36\1\0\3\13\1\0\1\13\3\0\1\67\4\0"+
    "\1\15\2\0\1\16\3\0\1\17\1\20\3\0\1\13"+
    "\3\0\1\13\1\43\1\44\1\45\1\43\1\0\1\45"+
    "\1\43\4\0\1\46\2\0\1\70\1\43\1\0\1\50"+
    "\4\0\1\43\1\0\2\43\1\71\2\0\1\43\1\45"+
    "\24\0\1\72\33\0\1\73\16\0\1\74\1\45\2\0"+
    "\1\74\5\0\1\46\22\0\1\74\1\0\2\74\2\0"+
    "\1\74\5\0\1\46\22\0\1\74\1\75\1\76\2\75"+
    "\1\0\2\75\10\0\1\75\1\0\1\77\4\0\1\75"+
    "\1\0\2\75\1\100\2\0\2\75\11\0\1\101\1\102"+
    "\17\0\1\103\27\0\1\104\13\0\1\43\1\44\1\45"+
    "\1\43\1\0\1\45\1\43\4\0\1\46\2\0\1\105"+
    "\1\43\6\0\1\43\1\0\3\43\2\0\1\43\1\45"+
    "\2\0\1\52\57\0\1\106\13\0\1\52\1\53\2\52"+
    "\1\0\2\52\10\0\1\52\6\0\1\52\1\0\3\52"+
    "\2\0\2\52\12\0\1\107\25\0\2\60\2\0\1\60"+
    "\5\0\1\61\1\0\1\110\14\0\1\60\3\0\1\60"+
    "\1\0\2\60\2\0\1\60\5\0\1\61\22\0\1\60"+
    "\1\111\1\112\2\111\1\0\2\111\10\0\1\111\1\0"+
    "\1\113\4\0\1\111\1\0\2\111\1\114\2\0\2\111"+
    "\6\0\2\115\23\0\1\116\16\0\1\117\52\0\1\120"+
    "\15\0\2\121\37\0\1\122\52\0\1\123\24\0\1\102"+
    "\24\0\1\43\1\44\1\45\1\43\1\0\1\45\1\43"+
    "\4\0\1\46\3\0\1\43\6\0\1\43\1\0\3\43"+
    "\2\0\1\43\1\45\6\0\2\124\22\0\1\125\21\0"+
    "\1\126\23\0\1\75\57\0\1\127\13\0\1\75\1\76"+
    "\2\75\1\0\2\75\10\0\1\75\6\0\1\75\1\0"+
    "\3\75\2\0\2\75\1\130\1\131\2\130\1\0\2\130"+
    "\10\0\1\130\6\0\1\130\1\0\2\130\1\132\2\0"+
    "\2\130\15\0\1\133\32\0\1\101\37\0\1\134\35\0"+
    "\1\101\20\0\1\103\16\0\1\135\41\0\1\136\27\0"+
    "\2\115\31\0\1\111\57\0\1\137\13\0\1\111\1\112"+
    "\2\111\1\0\2\111\10\0\1\111\6\0\1\111\1\0"+
    "\3\111\2\0\2\111\12\0\1\140\25\0\3\32\1\0"+
    "\1\32\2\141\11\0\1\57\4\0\1\34\3\0\1\32"+
    "\3\0\1\32\27\0\1\142\26\0\2\143\41\0\1\144"+
    "\26\0\1\145\35\0\1\13\50\0\1\146\13\0\3\125"+
    "\1\0\1\125\5\0\1\147\12\0\1\150\7\0\1\125"+
    "\6\0\2\151\41\0\1\152\26\0\1\130\34\0\1\130"+
    "\1\131\2\130\1\0\2\130\10\0\1\130\6\0\1\130"+
    "\1\0\3\130\2\0\2\130\12\0\1\153\46\0\1\154"+
    "\36\0\1\155\27\0\1\27\35\0\1\156\41\0\1\157"+
    "\33\0\1\160\43\0\2\161\31\0\1\162\31\0\2\163"+
    "\56\0\1\164\30\0\1\165\15\0\1\166\1\167\2\166"+
    "\1\0\2\166\10\0\1\166\1\0\1\170\4\0\1\166"+
    "\1\0\2\166\1\171\2\0\2\166\10\0\1\172\52\0"+
    "\1\173\34\0\1\174\50\0\1\175\13\0\1\176\1\0"+
    "\1\177\34\0\1\200\1\0\1\201\45\0\1\202\27\0"+
    "\1\60\40\0\1\203\34\0\1\204\45\0\1\205\40\0"+
    "\1\206\31\0\2\207\51\0\1\210\5\0\1\166\57\0"+
    "\1\211\13\0\1\166\1\167\2\166\1\0\2\166\10\0"+
    "\1\166\6\0\1\166\1\0\3\166\2\0\2\166\13\0"+
    "\1\212\23\0\1\23\2\0\32\23\13\0\1\213\1\0"+
    "\1\214\31\0\2\215\27\0\1\43\1\216\2\43\1\0"+
    "\2\43\10\0\1\43\6\0\1\43\1\0\3\43\2\0"+
    "\2\43\11\0\2\176\35\0\2\200\35\0\1\217\1\0"+
    "\1\220\34\0\1\221\47\0\1\222\44\0\1\223\32\0"+
    "\1\224\25\0\1\225\31\0\2\226\22\0\1\125\16\0"+
    "\1\227\53\0\1\230\20\0\2\213\42\0\1\231\22\0"+
    "\1\43\45\0\2\217\60\0\1\232\32\0\1\233\6\0"+
    "\26\234\1\0\10\234\6\0\2\235\51\0\1\236\26\0"+
    "\1\237\46\0\1\240\33\0\2\241\27\0\1\74\40\0"+
    "\1\242\23\0\26\243\1\0\10\243\26\234\1\244\10\234"+
    "\1\0\3\235\1\0\1\235\17\0\1\245\1\246\7\0"+
    "\1\235\30\0\1\247\23\0\1\250\32\0\1\251\1\0"+
    "\1\252\36\0\1\253\40\0\1\254\21\0\26\243\1\255"+
    "\10\243\31\0\1\256\17\0\1\257\34\0\1\260\26\0"+
    "\26\261\1\0\10\261\11\0\1\262\36\0\2\251\46\0"+
    "\1\263\40\0\1\264\43\0\1\265\15\0\1\266\43\0"+
    "\1\267\34\0\1\270\23\0\26\261\1\271\10\261\10\0"+
    "\1\272\56\0\1\273\20\0\1\32\34\0\1\274\41\0"+
    "\1\275\37\0\1\276\51\0\1\277\40\0\1\300\20\0"+
    "\1\125\23\0\26\301\1\0\10\301\13\0\1\302\52\0"+
    "\1\303\20\0\1\304\44\0\2\305\26\0\1\306\26\0"+
    "\26\301\1\307\10\301\27\0\1\310\26\0\2\311\52\0"+
    "\1\312\15\0\1\313\36\0\1\314\54\0\1\315\24\0"+
    "\2\316\31\0\1\317\36\0\1\320\45\0\1\321\43\0"+
    "\1\322\17\0\1\323\41\0\1\324\45\0\1\325\31\0"+
    "\1\326\51\0\1\327\25\0\2\330\31\0\1\331\45\0"+
    "\1\332\44\0\1\13\32\0\1\333\12\0\26\334\1\0"+
    "\10\334\13\0\1\335\52\0\1\336\37\0\1\32\17\0"+
    "\1\337\25\0\26\334\1\340\10\334\22\0\1\341\33\0"+
    "\2\342\26\0\1\343\57\0\1\344\35\0\1\36\21\0"+
    "\1\345\31\0\2\346\37\0\1\347\50\0\1\350\15\0"+
    "\3\346\1\0\1\346\13\0\1\351\4\0\1\352\7\0"+
    "\1\346\13\0\1\353\53\0\1\125\7\0\2\354\2\0"+
    "\1\354\5\0\1\355\1\0\1\356\14\0\1\354\3\0"+
    "\1\354\10\0\1\357\55\0\1\360\10\0\2\354\2\0"+
    "\1\354\5\0\1\355\22\0\1\354\1\361\1\362\2\361"+
    "\1\0\2\361\10\0\1\361\1\0\1\363\4\0\1\361"+
    "\1\0\2\361\1\364\2\0\2\361\6\0\2\365\42\0"+
    "\1\366\42\0\2\367\20\0\1\361\57\0\1\370\13\0"+
    "\1\361\1\362\2\361\1\0\2\361\10\0\1\361\6\0"+
    "\1\361\1\0\3\361\2\0\2\361\12\0\1\371\53\0"+
    "\1\372\22\0\1\373\35\0\1\374\41\0\1\375\40\0"+
    "\2\376\40\0\1\377\36\0\1\u0100\27\0\1\354\36\0"+
    "\1\u0101\53\0\1\235\17\0\1\u0102\1\0\1\u0103\45\0"+
    "\1\u0104\25\0\2\u0102\54\0\1\u0105\6\0\26\u0106\1\0"+
    "\36\u0106\1\u0107\10\u0106\31\0\1\u0108\15\0\1\u0109\41\0"+
    "\1\u010a\52\0\1\u010b\26\0\2\u010c\31\0\1\u010d\45\0"+
    "\1\u010e\44\0\1\346\6\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7936];
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
    "\1\0\2\1\1\11\1\1\35\0\1\11\2\1\3\0"+
    "\1\1\1\11\1\1\1\0\1\1\13\0\1\1\3\0"+
    "\1\11\1\1\1\0\1\1\10\0\1\11\1\1\1\0"+
    "\1\1\13\0\1\11\2\1\33\0\1\11\1\1\1\0"+
    "\1\1\24\0\1\1\142\0\1\11\1\1\1\0\1\1"+
    "\32\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[270];
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
	
	private StringBuilder output = new StringBuilder();

	public String getOutput() {
		return output.toString();
	}

	private String openTag = "<font color=\"lime\"><LK:ALIAS";  
	private String closeTag = "</LK:ALIAS></font>"; 
		
	
	private void saveAlias(String text, String emanante, String value, String data, String numero) {
	
		String out = text.substring(0,1) + openTag + " emanante=\"" + emanante + "\" value=\"" + value + "\" ";
		
		if( !data.equals("") ) {
			
			out += "data=\"" + data + "\" ";
		}
		
		if( !numero.equals("") ) {
			
			out += "numero=\"" + numero + "\"";
		}
		
		out += ">" + text.substring(1, text.length()-1) + closeTag + text.substring(text.length()-1);

		output.append(out);	
	}
	



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AliasEuropei(java.io.Reader in) {
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
    while (i < 220) {
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
        case 10: break;
        case 2: 
          { System.out.print(yytext());
          }
        case 11: break;
        case 3: 
          { saveAlias(yytext(), "11992E", "trattato", "", "");
          }
        case 12: break;
        case 4: 
          { saveAlias(yytext(), "12002E", "trattato", "", "");
          }
        case 13: break;
        case 5: 
          { saveAlias(yytext(), "11957E", "trattato", "", "");
          }
        case 14: break;
        case 6: 
          { saveAlias(yytext(), "12012E", "trattato", "", "");
          }
        case 15: break;
        case 7: 
          { saveAlias(yytext(), "11951K", "trattato", "", "");
          }
        case 16: break;
        case 8: 
          { saveAlias(yytext(), "12004V", "trattato", "", "");
          }
        case 17: break;
        case 9: 
          { saveAlias(yytext(), "12012P", "trattato", "", "");
          }
        case 18: break;
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
      System.out.println("Usage : java AliasEuropei [ --encoding <name> ] <inputfile(s)>");
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
        AliasEuropei scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new AliasEuropei(reader);
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
