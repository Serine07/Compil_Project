// Generated from C:/Users/HP/IdeaProjects/ProjectCompil/src\Lang.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, COMPIL=9, 
		START=10, IF=11, THEN=12, ELSE=13, DO=14, WHILE=15, SCAN=16, PRINT=17, 
		INTC=18, FLOATC=19, STRINGC=20, PROGRAME=21, ID=22, INT=23, FLOAT=24, 
		PLUS=25, MINUS=26, MUL=27, DIV=28, BIGER=29, LOWER=30, EQUAL=31, NOTEQUAL=32, 
		DISPLAY=33, STR=34, COMMENTS=35, COMMENT=36, WS=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "COMPIL", 
			"START", "IF", "THEN", "ELSE", "DO", "WHILE", "SCAN", "PRINT", "INTC", 
			"FLOATC", "STRINGC", "PROGRAME", "ID", "INT", "FLOAT", "PLUS", "MINUS", 
			"MUL", "DIV", "BIGER", "LOWER", "EQUAL", "NOTEQUAL", "DISPLAY", "STR", 
			"COMMENTS", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "','", "'='", "'\"'", "'compil'", 
			"'start'", "'if'", "'then'", "'else'", "'do'", "'while'", "'scanCompil'", 
			"'printCompil'", "'intCompil'", "'floatCompil'", "'stringCompil'", null, 
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "COMPIL", "START", 
			"IF", "THEN", "ELSE", "DO", "WHILE", "SCAN", "PRINT", "INTC", "FLOATC", 
			"STRINGC", "PROGRAME", "ID", "INT", "FLOAT", "PLUS", "MINUS", "MUL", 
			"DIV", "BIGER", "LOWER", "EQUAL", "NOTEQUAL", "DISPLAY", "STR", "COMMENTS", 
			"COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public LangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0122\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\6\26"+
		"\u00bc\n\26\r\26\16\26\u00bd\3\26\7\26\u00c1\n\26\f\26\16\26\u00c4\13"+
		"\26\3\27\6\27\u00c7\n\27\r\27\16\27\u00c8\3\27\7\27\u00cc\n\27\f\27\16"+
		"\27\u00cf\13\27\3\30\6\30\u00d2\n\30\r\30\16\30\u00d3\3\31\5\31\u00d7"+
		"\n\31\3\31\6\31\u00da\n\31\r\31\16\31\u00db\3\31\3\31\6\31\u00e0\n\31"+
		"\r\31\16\31\u00e1\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\3 \3 \3 \3!\3!\3!\3\"\6\"\u00f7\n\"\r\"\16\"\u00f8\3#\3#\3#\3"+
		"#\7#\u00ff\n#\f#\16#\u0102\13#\3#\3#\3$\3$\3$\3$\7$\u010a\n$\f$\16$\u010d"+
		"\13$\3$\3$\3$\3$\3$\3%\3%\3%\3%\7%\u0118\n%\f%\16%\u011b\13%\3%\3%\3&"+
		"\3&\3&\3&\4\u010b\u0119\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\t\3\2C\\\6\2\62;C\\a"+
		"ac|\4\2C\\c|\3\2\62;\4\2--//\3\2$$\5\2\13\f\17\17\"\"\2\u012e\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7Q\3\2\2\2\tS\3\2\2\2\13U\3\2"+
		"\2\2\rW\3\2\2\2\17Y\3\2\2\2\21[\3\2\2\2\23]\3\2\2\2\25d\3\2\2\2\27j\3"+
		"\2\2\2\31m\3\2\2\2\33r\3\2\2\2\35w\3\2\2\2\37z\3\2\2\2!\u0080\3\2\2\2"+
		"#\u008b\3\2\2\2%\u0097\3\2\2\2\'\u00a1\3\2\2\2)\u00ad\3\2\2\2+\u00bb\3"+
		"\2\2\2-\u00c6\3\2\2\2/\u00d1\3\2\2\2\61\u00d6\3\2\2\2\63\u00e3\3\2\2\2"+
		"\65\u00e5\3\2\2\2\67\u00e7\3\2\2\29\u00e9\3\2\2\2;\u00eb\3\2\2\2=\u00ed"+
		"\3\2\2\2?\u00ef\3\2\2\2A\u00f2\3\2\2\2C\u00f6\3\2\2\2E\u00fa\3\2\2\2G"+
		"\u0105\3\2\2\2I\u0113\3\2\2\2K\u011e\3\2\2\2MN\7*\2\2N\4\3\2\2\2OP\7+"+
		"\2\2P\6\3\2\2\2QR\7}\2\2R\b\3\2\2\2ST\7\177\2\2T\n\3\2\2\2UV\7=\2\2V\f"+
		"\3\2\2\2WX\7.\2\2X\16\3\2\2\2YZ\7?\2\2Z\20\3\2\2\2[\\\7$\2\2\\\22\3\2"+
		"\2\2]^\7e\2\2^_\7q\2\2_`\7o\2\2`a\7r\2\2ab\7k\2\2bc\7n\2\2c\24\3\2\2\2"+
		"de\7u\2\2ef\7v\2\2fg\7c\2\2gh\7t\2\2hi\7v\2\2i\26\3\2\2\2jk\7k\2\2kl\7"+
		"h\2\2l\30\3\2\2\2mn\7v\2\2no\7j\2\2op\7g\2\2pq\7p\2\2q\32\3\2\2\2rs\7"+
		"g\2\2st\7n\2\2tu\7u\2\2uv\7g\2\2v\34\3\2\2\2wx\7f\2\2xy\7q\2\2y\36\3\2"+
		"\2\2z{\7y\2\2{|\7j\2\2|}\7k\2\2}~\7n\2\2~\177\7g\2\2\177 \3\2\2\2\u0080"+
		"\u0081\7u\2\2\u0081\u0082\7e\2\2\u0082\u0083\7c\2\2\u0083\u0084\7p\2\2"+
		"\u0084\u0085\7E\2\2\u0085\u0086\7q\2\2\u0086\u0087\7o\2\2\u0087\u0088"+
		"\7r\2\2\u0088\u0089\7k\2\2\u0089\u008a\7n\2\2\u008a\"\3\2\2\2\u008b\u008c"+
		"\7r\2\2\u008c\u008d\7t\2\2\u008d\u008e\7k\2\2\u008e\u008f\7p\2\2\u008f"+
		"\u0090\7v\2\2\u0090\u0091\7E\2\2\u0091\u0092\7q\2\2\u0092\u0093\7o\2\2"+
		"\u0093\u0094\7r\2\2\u0094\u0095\7k\2\2\u0095\u0096\7n\2\2\u0096$\3\2\2"+
		"\2\u0097\u0098\7k\2\2\u0098\u0099\7p\2\2\u0099\u009a\7v\2\2\u009a\u009b"+
		"\7E\2\2\u009b\u009c\7q\2\2\u009c\u009d\7o\2\2\u009d\u009e\7r\2\2\u009e"+
		"\u009f\7k\2\2\u009f\u00a0\7n\2\2\u00a0&\3\2\2\2\u00a1\u00a2\7h\2\2\u00a2"+
		"\u00a3\7n\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7v\2\2"+
		"\u00a6\u00a7\7E\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7o\2\2\u00a9\u00aa"+
		"\7r\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7n\2\2\u00ac(\3\2\2\2\u00ad\u00ae"+
		"\7u\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7k\2\2\u00b1"+
		"\u00b2\7p\2\2\u00b2\u00b3\7i\2\2\u00b3\u00b4\7E\2\2\u00b4\u00b5\7q\2\2"+
		"\u00b5\u00b6\7o\2\2\u00b6\u00b7\7r\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9"+
		"\7n\2\2\u00b9*\3\2\2\2\u00ba\u00bc\t\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c2\3\2\2\2\u00bf"+
		"\u00c1\t\3\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3,\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7"+
		"\t\4\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00cd\3\2\2\2\u00ca\u00cc\t\3\2\2\u00cb\u00ca\3\2"+
		"\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		".\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d2\t\5\2\2\u00d1\u00d0\3\2\2\2"+
		"\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\60"+
		"\3\2\2\2\u00d5\u00d7\t\6\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00da\t\5\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00df\7\60\2\2\u00de\u00e0\t\5\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3"+
		"\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\62\3\2\2\2\u00e3"+
		"\u00e4\7-\2\2\u00e4\64\3\2\2\2\u00e5\u00e6\7/\2\2\u00e6\66\3\2\2\2\u00e7"+
		"\u00e8\7,\2\2\u00e88\3\2\2\2\u00e9\u00ea\7\61\2\2\u00ea:\3\2\2\2\u00eb"+
		"\u00ec\7@\2\2\u00ec<\3\2\2\2\u00ed\u00ee\7>\2\2\u00ee>\3\2\2\2\u00ef\u00f0"+
		"\7?\2\2\u00f0\u00f1\7?\2\2\u00f1@\3\2\2\2\u00f2\u00f3\7#\2\2\u00f3\u00f4"+
		"\7?\2\2\u00f4B\3\2\2\2\u00f5\u00f7\t\3\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9D\3\2\2\2\u00fa"+
		"\u0100\7$\2\2\u00fb\u00ff\n\7\2\2\u00fc\u00fd\7^\2\2\u00fd\u00ff\7$\2"+
		"\2\u00fe\u00fb\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe"+
		"\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103"+
		"\u0104\7$\2\2\u0104F\3\2\2\2\u0105\u0106\7\61\2\2\u0106\u0107\7,\2\2\u0107"+
		"\u010b\3\2\2\2\u0108\u010a\13\2\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3"+
		"\2\2\2\u010b\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010e\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u010f\7,\2\2\u010f\u0110\7\61\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0112\b$\2\2\u0112H\3\2\2\2\u0113\u0114\7\61\2\2\u0114\u0115"+
		"\7\61\2\2\u0115\u0119\3\2\2\2\u0116\u0118\13\2\2\2\u0117\u0116\3\2\2\2"+
		"\u0118\u011b\3\2\2\2\u0119\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011c"+
		"\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\b%\2\2\u011dJ\3\2\2\2\u011e\u011f"+
		"\t\b\2\2\u011f\u0120\3\2\2\2\u0120\u0121\b&\3\2\u0121L\3\2\2\2\20\2\u00bd"+
		"\u00c2\u00c8\u00cd\u00d3\u00d6\u00db\u00e1\u00f8\u00fe\u0100\u010b\u0119"+
		"\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}