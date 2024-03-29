// Generated from C:/Users/HP/IdeaProjects/Compil_Project/src\Lang.g4 by ANTLR 4.9.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, COMPIL=8, START=9, 
		IF=10, THEN=11, ELSE=12, DO=13, WHILE=14, SCAN=15, PRINT=16, INTC=17, 
		FLOATC=18, STRINGC=19, PROGRAME=20, ID=21, INT=22, FLOAT=23, PLUS=24, 
		MINUS=25, MUL=26, DIV=27, BIGER=28, LOWER=29, EQUAL=30, NOTEQUAL=31, DISPLAY=32, 
		COMMENTS=33, COMMENT=34, WS=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "COMPIL", "START", 
			"IF", "THEN", "ELSE", "DO", "WHILE", "SCAN", "PRINT", "INTC", "FLOATC", 
			"STRINGC", "PROGRAME", "ID", "INT", "FLOAT", "PLUS", "MINUS", "MUL", 
			"DIV", "BIGER", "LOWER", "EQUAL", "NOTEQUAL", "DISPLAY", "COMMENTS", 
			"COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "','", "'='", "'compil'", "'start'", 
			"'if'", "'then'", "'else'", "'do'", "'while'", "'scanCompil'", "'printCompil'", 
			"'intCompil'", "'floatCompil'", "'stringCompil'", null, null, null, null, 
			"'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "COMPIL", "START", "IF", 
			"THEN", "ELSE", "DO", "WHILE", "SCAN", "PRINT", "INTC", "FLOATC", "STRINGC", 
			"PROGRAME", "ID", "INT", "FLOAT", "PLUS", "MINUS", "MUL", "DIV", "BIGER", 
			"LOWER", "EQUAL", "NOTEQUAL", "DISPLAY", "COMMENTS", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u011e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\6\25\u00b6\n\25\r\25\16\25\u00b7"+
		"\3\25\7\25\u00bb\n\25\f\25\16\25\u00be\13\25\3\26\6\26\u00c1\n\26\r\26"+
		"\16\26\u00c2\3\26\7\26\u00c6\n\26\f\26\16\26\u00c9\13\26\3\27\3\27\3\27"+
		"\7\27\u00ce\n\27\f\27\16\27\u00d1\13\27\5\27\u00d3\n\27\3\30\5\30\u00d6"+
		"\n\30\3\30\6\30\u00d9\n\30\r\30\16\30\u00da\3\30\3\30\6\30\u00df\n\30"+
		"\r\30\16\30\u00e0\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\7!\u00f9\n!\f!\16!\u00fc"+
		"\13!\3!\3!\3\"\3\"\3\"\3\"\7\"\u0104\n\"\f\"\16\"\u0107\13\"\3\"\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\7#\u0112\n#\f#\16#\u0115\13#\3#\3#\3#\3#\3$\3$"+
		"\3$\3$\4\u0105\u0113\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\n\3\2C\\\6\2\62;C\\aac|\4\2C"+
		"\\c|\3\2\63;\3\2\62;\4\2--//\3\2$$\5\2\13\f\17\17\"\"\2\u012a\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3"+
		"\2\2\2\5K\3\2\2\2\7M\3\2\2\2\tO\3\2\2\2\13Q\3\2\2\2\rS\3\2\2\2\17U\3\2"+
		"\2\2\21W\3\2\2\2\23^\3\2\2\2\25d\3\2\2\2\27g\3\2\2\2\31l\3\2\2\2\33q\3"+
		"\2\2\2\35t\3\2\2\2\37z\3\2\2\2!\u0085\3\2\2\2#\u0091\3\2\2\2%\u009b\3"+
		"\2\2\2\'\u00a7\3\2\2\2)\u00b5\3\2\2\2+\u00c0\3\2\2\2-\u00d2\3\2\2\2/\u00d5"+
		"\3\2\2\2\61\u00e2\3\2\2\2\63\u00e4\3\2\2\2\65\u00e6\3\2\2\2\67\u00e8\3"+
		"\2\2\29\u00ea\3\2\2\2;\u00ec\3\2\2\2=\u00ee\3\2\2\2?\u00f1\3\2\2\2A\u00f4"+
		"\3\2\2\2C\u00ff\3\2\2\2E\u010d\3\2\2\2G\u011a\3\2\2\2IJ\7*\2\2J\4\3\2"+
		"\2\2KL\7+\2\2L\6\3\2\2\2MN\7}\2\2N\b\3\2\2\2OP\7\177\2\2P\n\3\2\2\2QR"+
		"\7=\2\2R\f\3\2\2\2ST\7.\2\2T\16\3\2\2\2UV\7?\2\2V\20\3\2\2\2WX\7e\2\2"+
		"XY\7q\2\2YZ\7o\2\2Z[\7r\2\2[\\\7k\2\2\\]\7n\2\2]\22\3\2\2\2^_\7u\2\2_"+
		"`\7v\2\2`a\7c\2\2ab\7t\2\2bc\7v\2\2c\24\3\2\2\2de\7k\2\2ef\7h\2\2f\26"+
		"\3\2\2\2gh\7v\2\2hi\7j\2\2ij\7g\2\2jk\7p\2\2k\30\3\2\2\2lm\7g\2\2mn\7"+
		"n\2\2no\7u\2\2op\7g\2\2p\32\3\2\2\2qr\7f\2\2rs\7q\2\2s\34\3\2\2\2tu\7"+
		"y\2\2uv\7j\2\2vw\7k\2\2wx\7n\2\2xy\7g\2\2y\36\3\2\2\2z{\7u\2\2{|\7e\2"+
		"\2|}\7c\2\2}~\7p\2\2~\177\7E\2\2\177\u0080\7q\2\2\u0080\u0081\7o\2\2\u0081"+
		"\u0082\7r\2\2\u0082\u0083\7k\2\2\u0083\u0084\7n\2\2\u0084 \3\2\2\2\u0085"+
		"\u0086\7r\2\2\u0086\u0087\7t\2\2\u0087\u0088\7k\2\2\u0088\u0089\7p\2\2"+
		"\u0089\u008a\7v\2\2\u008a\u008b\7E\2\2\u008b\u008c\7q\2\2\u008c\u008d"+
		"\7o\2\2\u008d\u008e\7r\2\2\u008e\u008f\7k\2\2\u008f\u0090\7n\2\2\u0090"+
		"\"\3\2\2\2\u0091\u0092\7k\2\2\u0092\u0093\7p\2\2\u0093\u0094\7v\2\2\u0094"+
		"\u0095\7E\2\2\u0095\u0096\7q\2\2\u0096\u0097\7o\2\2\u0097\u0098\7r\2\2"+
		"\u0098\u0099\7k\2\2\u0099\u009a\7n\2\2\u009a$\3\2\2\2\u009b\u009c\7h\2"+
		"\2\u009c\u009d\7n\2\2\u009d\u009e\7q\2\2\u009e\u009f\7c\2\2\u009f\u00a0"+
		"\7v\2\2\u00a0\u00a1\7E\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7o\2\2\u00a3"+
		"\u00a4\7r\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7n\2\2\u00a6&\3\2\2\2\u00a7"+
		"\u00a8\7u\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7k\2\2"+
		"\u00ab\u00ac\7p\2\2\u00ac\u00ad\7i\2\2\u00ad\u00ae\7E\2\2\u00ae\u00af"+
		"\7q\2\2\u00af\u00b0\7o\2\2\u00b0\u00b1\7r\2\2\u00b1\u00b2\7k\2\2\u00b2"+
		"\u00b3\7n\2\2\u00b3(\3\2\2\2\u00b4\u00b6\t\2\2\2\u00b5\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bc\3\2"+
		"\2\2\u00b9\u00bb\t\3\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd*\3\2\2\2\u00be\u00bc\3\2\2\2"+
		"\u00bf\u00c1\t\4\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c7\3\2\2\2\u00c4\u00c6\t\3\2\2\u00c5"+
		"\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8,\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00d3\7\62\2\2\u00cb\u00cf"+
		"\t\5\2\2\u00cc\u00ce\t\6\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2"+
		"\2\2\u00d2\u00ca\3\2\2\2\u00d2\u00cb\3\2\2\2\u00d3.\3\2\2\2\u00d4\u00d6"+
		"\t\7\2\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7"+
		"\u00d9\t\6\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\7\60\2\2\u00dd"+
		"\u00df\t\6\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2"+
		"\2\2\u00e0\u00e1\3\2\2\2\u00e1\60\3\2\2\2\u00e2\u00e3\7-\2\2\u00e3\62"+
		"\3\2\2\2\u00e4\u00e5\7/\2\2\u00e5\64\3\2\2\2\u00e6\u00e7\7,\2\2\u00e7"+
		"\66\3\2\2\2\u00e8\u00e9\7\61\2\2\u00e98\3\2\2\2\u00ea\u00eb\7@\2\2\u00eb"+
		":\3\2\2\2\u00ec\u00ed\7>\2\2\u00ed<\3\2\2\2\u00ee\u00ef\7?\2\2\u00ef\u00f0"+
		"\7?\2\2\u00f0>\3\2\2\2\u00f1\u00f2\7#\2\2\u00f2\u00f3\7?\2\2\u00f3@\3"+
		"\2\2\2\u00f4\u00fa\7$\2\2\u00f5\u00f9\n\b\2\2\u00f6\u00f7\7^\2\2\u00f7"+
		"\u00f9\7$\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fd\u00fe\7$\2\2\u00feB\3\2\2\2\u00ff\u0100\7\61\2\2"+
		"\u0100\u0101\7,\2\2\u0101\u0105\3\2\2\2\u0102\u0104\13\2\2\2\u0103\u0102"+
		"\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106"+
		"\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7,\2\2\u0109\u010a\7\61"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\u010c\b\"\2\2\u010cD\3\2\2\2\u010d\u010e"+
		"\7\61\2\2\u010e\u010f\7\61\2\2\u010f\u0113\3\2\2\2\u0110\u0112\13\2\2"+
		"\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0114\3\2\2\2\u0113\u0111"+
		"\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7\f\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0119\b#\2\2\u0119F\3\2\2\2\u011a\u011b\t\t\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011d\b$\2\2\u011dH\3\2\2\2\20\2\u00b7\u00bc\u00c2"+
		"\u00c7\u00cf\u00d2\u00d5\u00da\u00e0\u00f8\u00fa\u0105\u0113\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}