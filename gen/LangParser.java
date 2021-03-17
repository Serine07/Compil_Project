// Generated from C:/Users/HP/IdeaProjects/Compil_Project/src\Lang.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangParser extends Parser {
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
	public static final int
		RULE_body = 0, RULE_declaration = 1, RULE_type = 2, RULE_variable = 3, 
		RULE_inst = 4, RULE_instructions = 5, RULE_instruction = 6, RULE_assignmant = 7, 
		RULE_expretions = 8, RULE_expretion = 9, RULE_operation = 10, RULE_values = 11, 
		RULE_value = 12, RULE_read = 13, RULE_write = 14, RULE_ifstat = 15, RULE_dowhilestat = 16, 
		RULE_condition = 17, RULE_compare = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"body", "declaration", "type", "variable", "inst", "instructions", "instruction", 
			"assignmant", "expretions", "expretion", "operation", "values", "value", 
			"read", "write", "ifstat", "dowhilestat", "condition", "compare"
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

	@Override
	public String getGrammarFileName() { return "Lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode COMPIL() { return getToken(LangParser.COMPIL, 0); }
		public TerminalNode PROGRAME() { return getToken(LangParser.PROGRAME, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode START() { return getToken(LangParser.START, 0); }
		public InstContext inst() {
			return getRuleContext(InstContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(COMPIL);
			setState(39);
			match(PROGRAME);
			setState(40);
			match(T__0);
			setState(41);
			match(T__1);
			setState(42);
			match(T__2);
			setState(43);
			declaration();
			setState(44);
			match(START);
			setState(45);
			inst();
			setState(46);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTC:
			case FLOATC:
			case STRINGC:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				type();
				setState(49);
				variable();
				setState(50);
				match(T__4);
				}
				break;
			case START:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTC() { return getToken(LangParser.INTC, 0); }
		public TerminalNode FLOATC() { return getToken(LangParser.FLOATC, 0); }
		public TerminalNode STRINGC() { return getToken(LangParser.STRINGC, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTC) | (1L << FLOATC) | (1L << STRINGC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(ID);
				setState(59);
				match(T__5);
				setState(60);
				variable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstContext extends ParserRuleContext {
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public InstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitInst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_inst);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				instructions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionsContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instructions);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				instruction();
				setState(68);
				instructions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				instruction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public AssignmantContext assignmant() {
			return getRuleContext(AssignmantContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public IfstatContext ifstat() {
			return getRuleContext(IfstatContext.class,0);
		}
		public DowhilestatContext dowhilestat() {
			return getRuleContext(DowhilestatContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instruction);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				assignmant();
				}
				break;
			case SCAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				read();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				write();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				ifstat();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				dowhilestat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmantContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public ExpretionsContext expretions() {
			return getRuleContext(ExpretionsContext.class,0);
		}
		public AssignmantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterAssignmant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitAssignmant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitAssignmant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmantContext assignmant() throws RecognitionException {
		AssignmantContext _localctx = new AssignmantContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignmant);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(ID);
				setState(82);
				match(T__6);
				setState(83);
				values();
				setState(84);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(ID);
				setState(87);
				match(T__6);
				setState(88);
				expretions();
				setState(89);
				match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpretionsContext extends ParserRuleContext {
		public ExpretionContext expretion() {
			return getRuleContext(ExpretionContext.class,0);
		}
		public ExpretionsContext expretions() {
			return getRuleContext(ExpretionsContext.class,0);
		}
		public ExpretionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expretions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterExpretions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitExpretions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitExpretions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpretionsContext expretions() throws RecognitionException {
		ExpretionsContext _localctx = new ExpretionsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expretions);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				expretion();
				setState(94);
				expretions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				expretion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpretionContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode DIV() { return getToken(LangParser.DIV, 0); }
		public ExpretionContext expretion() {
			return getRuleContext(ExpretionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(LangParser.MUL, 0); }
		public TerminalNode PLUS() { return getToken(LangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LangParser.MINUS, 0); }
		public ExpretionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expretion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterExpretion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitExpretion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitExpretion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpretionContext expretion() throws RecognitionException {
		ExpretionContext _localctx = new ExpretionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expretion);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				operation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				operation();
				setState(101);
				match(DIV);
				setState(102);
				expretion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				operation();
				setState(105);
				match(MUL);
				setState(106);
				expretion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				operation();
				setState(109);
				match(PLUS);
				setState(110);
				expretion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				operation();
				setState(113);
				match(MINUS);
				setState(114);
				expretion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public TerminalNode DIV() { return getToken(LangParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(LangParser.MUL, 0); }
		public TerminalNode PLUS() { return getToken(LangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LangParser.MINUS, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operation);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				values();
				setState(119);
				match(DIV);
				setState(120);
				values();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				values();
				setState(123);
				match(MUL);
				setState(124);
				values();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				values();
				setState(127);
				match(PLUS);
				setState(128);
				values();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				values();
				setState(131);
				match(MINUS);
				setState(132);
				values();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_values);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(ID);
				}
				break;
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LangParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LangParser.FLOAT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(LangParser.SCAN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(SCAN);
			setState(143);
			match(T__0);
			setState(144);
			variable();
			setState(145);
			match(T__1);
			setState(146);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(LangParser.PRINT, 0); }
		public TerminalNode DISPLAY() { return getToken(LangParser.DISPLAY, 0); }
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_write);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(PRINT);
				setState(149);
				match(T__0);
				setState(150);
				match(DISPLAY);
				setState(151);
				match(T__1);
				setState(152);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(PRINT);
				setState(154);
				match(T__0);
				setState(155);
				match(ID);
				setState(156);
				match(T__1);
				setState(157);
				match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstatContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LangParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(LangParser.THEN, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(LangParser.ELSE, 0); }
		public IfstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIfstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIfstat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIfstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatContext ifstat() throws RecognitionException {
		IfstatContext _localctx = new IfstatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifstat);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(IF);
				setState(161);
				match(T__0);
				setState(162);
				condition();
				setState(163);
				match(T__1);
				setState(164);
				match(THEN);
				setState(165);
				match(T__2);
				setState(166);
				inst();
				setState(167);
				match(T__3);
				setState(168);
				match(ELSE);
				setState(169);
				match(T__2);
				setState(170);
				inst();
				setState(171);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(IF);
				setState(174);
				match(T__0);
				setState(175);
				condition();
				setState(176);
				match(T__1);
				setState(177);
				match(THEN);
				setState(178);
				match(T__2);
				setState(179);
				inst();
				setState(180);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DowhilestatContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(LangParser.DO, 0); }
		public InstContext inst() {
			return getRuleContext(InstContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(LangParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public DowhilestatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhilestat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterDowhilestat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitDowhilestat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitDowhilestat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DowhilestatContext dowhilestat() throws RecognitionException {
		DowhilestatContext _localctx = new DowhilestatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dowhilestat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(DO);
			setState(185);
			match(T__2);
			setState(186);
			inst();
			setState(187);
			match(T__3);
			setState(188);
			match(WHILE);
			setState(189);
			match(T__0);
			setState(190);
			condition();
			setState(191);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			values();
			setState(194);
			compare();
			setState(195);
			values();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompareContext extends ParserRuleContext {
		public TerminalNode BIGER() { return getToken(LangParser.BIGER, 0); }
		public TerminalNode LOWER() { return getToken(LangParser.LOWER, 0); }
		public TerminalNode EQUAL() { return getToken(LangParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(LangParser.NOTEQUAL, 0); }
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGER) | (1L << LOWER) | (1L << EQUAL) | (1L << NOTEQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00ca\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\5\38\n\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5@\n\5\3\6\3\6\5\6D\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\5\7K\n\7\3\b\3\b\3\b\3\b\3\b\5\bR\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t^\n\t\3\n\3\n\3\n\3\n\5\nd\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13w\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u0089\n\f\3\r\3\r\5\r\u008d\n\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00a1\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b9\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\5\3\2"+
		"\23\25\3\2\30\31\3\2\36!\2\u00cb\2(\3\2\2\2\4\67\3\2\2\2\69\3\2\2\2\b"+
		"?\3\2\2\2\nC\3\2\2\2\fJ\3\2\2\2\16Q\3\2\2\2\20]\3\2\2\2\22c\3\2\2\2\24"+
		"v\3\2\2\2\26\u0088\3\2\2\2\30\u008c\3\2\2\2\32\u008e\3\2\2\2\34\u0090"+
		"\3\2\2\2\36\u00a0\3\2\2\2 \u00b8\3\2\2\2\"\u00ba\3\2\2\2$\u00c3\3\2\2"+
		"\2&\u00c7\3\2\2\2()\7\n\2\2)*\7\26\2\2*+\7\3\2\2+,\7\4\2\2,-\7\5\2\2-"+
		".\5\4\3\2./\7\13\2\2/\60\5\n\6\2\60\61\7\6\2\2\61\3\3\2\2\2\62\63\5\6"+
		"\4\2\63\64\5\b\5\2\64\65\7\7\2\2\658\3\2\2\2\668\3\2\2\2\67\62\3\2\2\2"+
		"\67\66\3\2\2\28\5\3\2\2\29:\t\2\2\2:\7\3\2\2\2;@\7\27\2\2<=\7\27\2\2="+
		">\7\b\2\2>@\5\b\5\2?;\3\2\2\2?<\3\2\2\2@\t\3\2\2\2AD\5\f\7\2BD\3\2\2\2"+
		"CA\3\2\2\2CB\3\2\2\2D\13\3\2\2\2EF\5\16\b\2FG\5\f\7\2GK\3\2\2\2HK\5\16"+
		"\b\2IK\3\2\2\2JE\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\r\3\2\2\2LR\5\20\t\2MR\5"+
		"\34\17\2NR\5\36\20\2OR\5 \21\2PR\5\"\22\2QL\3\2\2\2QM\3\2\2\2QN\3\2\2"+
		"\2QO\3\2\2\2QP\3\2\2\2R\17\3\2\2\2ST\7\27\2\2TU\7\t\2\2UV\5\30\r\2VW\7"+
		"\7\2\2W^\3\2\2\2XY\7\27\2\2YZ\7\t\2\2Z[\5\22\n\2[\\\7\7\2\2\\^\3\2\2\2"+
		"]S\3\2\2\2]X\3\2\2\2^\21\3\2\2\2_`\5\24\13\2`a\5\22\n\2ad\3\2\2\2bd\5"+
		"\24\13\2c_\3\2\2\2cb\3\2\2\2d\23\3\2\2\2ew\5\26\f\2fg\5\26\f\2gh\7\35"+
		"\2\2hi\5\24\13\2iw\3\2\2\2jk\5\26\f\2kl\7\34\2\2lm\5\24\13\2mw\3\2\2\2"+
		"no\5\26\f\2op\7\32\2\2pq\5\24\13\2qw\3\2\2\2rs\5\26\f\2st\7\33\2\2tu\5"+
		"\24\13\2uw\3\2\2\2ve\3\2\2\2vf\3\2\2\2vj\3\2\2\2vn\3\2\2\2vr\3\2\2\2w"+
		"\25\3\2\2\2xy\5\30\r\2yz\7\35\2\2z{\5\30\r\2{\u0089\3\2\2\2|}\5\30\r\2"+
		"}~\7\34\2\2~\177\5\30\r\2\177\u0089\3\2\2\2\u0080\u0081\5\30\r\2\u0081"+
		"\u0082\7\32\2\2\u0082\u0083\5\30\r\2\u0083\u0089\3\2\2\2\u0084\u0085\5"+
		"\30\r\2\u0085\u0086\7\33\2\2\u0086\u0087\5\30\r\2\u0087\u0089\3\2\2\2"+
		"\u0088x\3\2\2\2\u0088|\3\2\2\2\u0088\u0080\3\2\2\2\u0088\u0084\3\2\2\2"+
		"\u0089\27\3\2\2\2\u008a\u008d\7\27\2\2\u008b\u008d\5\32\16\2\u008c\u008a"+
		"\3\2\2\2\u008c\u008b\3\2\2\2\u008d\31\3\2\2\2\u008e\u008f\t\3\2\2\u008f"+
		"\33\3\2\2\2\u0090\u0091\7\21\2\2\u0091\u0092\7\3\2\2\u0092\u0093\5\b\5"+
		"\2\u0093\u0094\7\4\2\2\u0094\u0095\7\7\2\2\u0095\35\3\2\2\2\u0096\u0097"+
		"\7\22\2\2\u0097\u0098\7\3\2\2\u0098\u0099\7\"\2\2\u0099\u009a\7\4\2\2"+
		"\u009a\u00a1\7\7\2\2\u009b\u009c\7\22\2\2\u009c\u009d\7\3\2\2\u009d\u009e"+
		"\7\27\2\2\u009e\u009f\7\4\2\2\u009f\u00a1\7\7\2\2\u00a0\u0096\3\2\2\2"+
		"\u00a0\u009b\3\2\2\2\u00a1\37\3\2\2\2\u00a2\u00a3\7\f\2\2\u00a3\u00a4"+
		"\7\3\2\2\u00a4\u00a5\5$\23\2\u00a5\u00a6\7\4\2\2\u00a6\u00a7\7\r\2\2\u00a7"+
		"\u00a8\7\5\2\2\u00a8\u00a9\5\n\6\2\u00a9\u00aa\7\6\2\2\u00aa\u00ab\7\16"+
		"\2\2\u00ab\u00ac\7\5\2\2\u00ac\u00ad\5\n\6\2\u00ad\u00ae\7\6\2\2\u00ae"+
		"\u00b9\3\2\2\2\u00af\u00b0\7\f\2\2\u00b0\u00b1\7\3\2\2\u00b1\u00b2\5$"+
		"\23\2\u00b2\u00b3\7\4\2\2\u00b3\u00b4\7\r\2\2\u00b4\u00b5\7\5\2\2\u00b5"+
		"\u00b6\5\n\6\2\u00b6\u00b7\7\6\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00a2\3\2"+
		"\2\2\u00b8\u00af\3\2\2\2\u00b9!\3\2\2\2\u00ba\u00bb\7\17\2\2\u00bb\u00bc"+
		"\7\5\2\2\u00bc\u00bd\5\n\6\2\u00bd\u00be\7\6\2\2\u00be\u00bf\7\20\2\2"+
		"\u00bf\u00c0\7\3\2\2\u00c0\u00c1\5$\23\2\u00c1\u00c2\7\4\2\2\u00c2#\3"+
		"\2\2\2\u00c3\u00c4\5\30\r\2\u00c4\u00c5\5&\24\2\u00c5\u00c6\5\30\r\2\u00c6"+
		"%\3\2\2\2\u00c7\u00c8\t\4\2\2\u00c8\'\3\2\2\2\16\67?CJQ]cv\u0088\u008c"+
		"\u00a0\u00b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}