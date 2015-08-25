// Generated from /Users/eipifi/Sources/z3fol/src/main/java/z3fol/xpr/XPR.g4 by ANTLR 4.5.1
package z3fol.xpr;
package z3fol.xpr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XPRLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, CHAR_LC=3, CHAR_UC=4, LETTER=5, DIGIT=6, CHAR_ANY=7, DIGITS_DECIMAL=8, 
		DIGITS_OCTAL=9, DIGITS_HEX=10, LPAREN=11, RPAREN=12, PLUS=13, MINUS=14, 
		TIMES=15, DIV=16, GT=17, LT=18, EQ=19, POINT=20, POW=21, EXISTS=22, FORALL=23, 
		OR=24, AND=25, NOT=26, WS=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "CHAR_LC", "CHAR_UC", "LETTER", "DIGIT", "CHAR_ANY", "DIGITS_DECIMAL", 
		"DIGITS_OCTAL", "DIGITS_HEX", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", 
		"DIV", "GT", "LT", "EQ", "POINT", "POW", "EXISTS", "FORALL", "OR", "AND", 
		"NOT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "':'", null, null, null, null, null, null, null, null, "'('", 
		"')'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'='", "'.'", "'^'", 
		"'Exists'", "'Forall'", "'|'", "'&'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "CHAR_LC", "CHAR_UC", "LETTER", "DIGIT", "CHAR_ANY", 
		"DIGITS_DECIMAL", "DIGITS_OCTAL", "DIGITS_HEX", "LPAREN", "RPAREN", "PLUS", 
		"MINUS", "TIMES", "DIV", "GT", "LT", "EQ", "POINT", "POW", "EXISTS", "FORALL", 
		"OR", "AND", "NOT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public XPRLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XPR.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u0092\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\5\6D\n\6\3\7\3\7\3\b\3\b\3\b\5\bK\n\b\3\t\3\t\7\tO\n\t\f\t\16\t"+
		"R\13\t\3\n\3\n\6\nV\n\n\r\n\16\nW\3\13\3\13\3\13\3\13\6\13^\n\13\r\13"+
		"\16\13_\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\6\34\u008d\n\34\r\34\16\34\u008e\3\34\3\34\2\2\35\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\4\5\2\62;CHch\5"+
		"\2\13\f\17\17\"\"\u0098\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13C\3\2\2\2\rE\3\2"+
		"\2\2\17J\3\2\2\2\21L\3\2\2\2\23S\3\2\2\2\25Y\3\2\2\2\27a\3\2\2\2\31c\3"+
		"\2\2\2\33e\3\2\2\2\35g\3\2\2\2\37i\3\2\2\2!k\3\2\2\2#m\3\2\2\2%o\3\2\2"+
		"\2\'q\3\2\2\2)s\3\2\2\2+u\3\2\2\2-w\3\2\2\2/~\3\2\2\2\61\u0085\3\2\2\2"+
		"\63\u0087\3\2\2\2\65\u0089\3\2\2\2\67\u008c\3\2\2\29:\7.\2\2:\4\3\2\2"+
		"\2;<\7<\2\2<\6\3\2\2\2=>\4c|\2>\b\3\2\2\2?@\4C\\\2@\n\3\2\2\2AD\5\7\4"+
		"\2BD\5\t\5\2CA\3\2\2\2CB\3\2\2\2D\f\3\2\2\2EF\4\62;\2F\16\3\2\2\2GK\5"+
		"\13\6\2HK\5\r\7\2IK\7a\2\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\20\3\2\2\2L"+
		"P\4\63;\2MO\4\62;\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\22\3\2\2"+
		"\2RP\3\2\2\2SU\7\62\2\2TV\4\629\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2"+
		"\2\2X\24\3\2\2\2YZ\7\62\2\2Z[\7z\2\2[]\3\2\2\2\\^\t\2\2\2]\\\3\2\2\2^"+
		"_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\26\3\2\2\2ab\7*\2\2b\30\3\2\2\2cd\7+\2"+
		"\2d\32\3\2\2\2ef\7-\2\2f\34\3\2\2\2gh\7/\2\2h\36\3\2\2\2ij\7,\2\2j \3"+
		"\2\2\2kl\7\61\2\2l\"\3\2\2\2mn\7@\2\2n$\3\2\2\2op\7>\2\2p&\3\2\2\2qr\7"+
		"?\2\2r(\3\2\2\2st\7\60\2\2t*\3\2\2\2uv\7`\2\2v,\3\2\2\2wx\7G\2\2xy\7z"+
		"\2\2yz\7k\2\2z{\7u\2\2{|\7v\2\2|}\7u\2\2}.\3\2\2\2~\177\7H\2\2\177\u0080"+
		"\7q\2\2\u0080\u0081\7t\2\2\u0081\u0082\7c\2\2\u0082\u0083\7n\2\2\u0083"+
		"\u0084\7n\2\2\u0084\60\3\2\2\2\u0085\u0086\7~\2\2\u0086\62\3\2\2\2\u0087"+
		"\u0088\7(\2\2\u0088\64\3\2\2\2\u0089\u008a\7#\2\2\u008a\66\3\2\2\2\u008b"+
		"\u008d\t\3\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\b\34\2\2\u0091"+
		"8\3\2\2\2\t\2CJPW_\u008e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}