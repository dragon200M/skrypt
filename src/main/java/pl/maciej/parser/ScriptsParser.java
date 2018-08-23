// Generated from /home/maciej/IdeaProjects/skrypt/Scripts.g4 by ANTLR 4.7
package pl.maciej.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScriptsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, LBRACKET=2, RBRACKET=3, THEN=4, ENDIF=5, OR=6, AND=7, EQUALS=8, 
		FASLE=9, TRUE=10, SETOPTION=11, PLUS=12, MINUS=13, ASTERISK=14, DIVISION=15, 
		LEFT=16, RIGHT=17, OPTION=18, CPIECE=19, CPIECE_EX_U=20, SETERROR=21, 
		LET=22, COLOUR=23, COLOR=24, SETNUMERICOPTION=25, GETNUMERICOPTION=26, 
		PIECE_EX_U=27, PIECE=28, SURFACE=29, CSURFACE=30, SURFACE_EX=31, SURFACE_EX_U=32, 
		OUTERCOLOUR=33, INNERCOLOUR=34, CROD=35, CROD_EX=36, CROD_EX_U=37, ROD=38, 
		ROD_EX_U=39, CINNROD_EX_U=40, COUTROD_EX_U=41, MESSAGE=42, SCRIPT=43, 
		WORKFORCE=44, MH=45, ROUND=46, EXISTSVARIABLE=47, SETDIMENSION=48, NUMBER=49, 
		DECIMAL=50, COMMA=51, SEMICOLON=52, ID=53, VAR=54, WS=55, COMMENT=56;
	public static final int
		RULE_compilationUnit = 0, RULE_ifrule = 1, RULE_opcja = 2, RULE_setOpcja = 3, 
		RULE_scriptLink = 4, RULE_vardecl = 5, RULE_vardeclaration = 6, RULE_variable = 7, 
		RULE_color = 8, RULE_colour = 9, RULE_innercolor = 10, RULE_outercolor = 11, 
		RULE_cpiece = 12, RULE_cpiecexu = 13, RULE_seterror = 14, RULE_setnumeric = 15, 
		RULE_getnumeric = 16, RULE_piecex = 17, RULE_piece = 18, RULE_surface = 19, 
		RULE_csurface = 20, RULE_surfacex = 21, RULE_surfacexu = 22, RULE_crod = 23, 
		RULE_crodx = 24, RULE_crodxu = 25, RULE_rod = 26, RULE_rodx = 27, RULE_cinrod = 28, 
		RULE_coutrod = 29, RULE_message = 30, RULE_workforce = 31, RULE_existVar = 32, 
		RULE_setdimension = 33, RULE_arg = 34;
	public static final String[] ruleNames = {
		"compilationUnit", "ifrule", "opcja", "setOpcja", "scriptLink", "vardecl", 
		"vardeclaration", "variable", "color", "colour", "innercolor", "outercolor", 
		"cpiece", "cpiecexu", "seterror", "setnumeric", "getnumeric", "piecex", 
		"piece", "surface", "csurface", "surfacex", "surfacexu", "crod", "crodx", 
		"crodxu", "rod", "rodx", "cinrod", "coutrod", "message", "workforce", 
		"existVar", "setdimension", "arg"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'IF'", "'['", "']'", "'THEN'", "'ENDIF'", "'OR'", "'AND'", "'='", 
		"'FALSE'", "'TRUE'", "'SETOPTION'", "'+'", "'-'", "'*'", "'/'", "'('", 
		"')'", "'OPTION'", "'CPIECE'", "'CPIECE_EX_U'", "'SETERROR'", "'LET'", 
		"'COLOUR'", "'COLOR'", "'SETNUMERICOPTION'", "'GETNUMERICOPTION'", "'PIECE_EX_U'", 
		"'PIECE'", "'SURFACE'", "'CSURFACE'", "'SURFACE_EX'", "'SURFACE_EX_U'", 
		"'OUTERCOLOUR'", "'INNERCOLOUR'", "'CROD'", "'CROD_EX'", "'CROD_EX_U'", 
		"'ROD'", "'ROD_EX_U'", "'CINNROD_EX_U'", "'COUTROD_EX_U'", "'MESSAGE'", 
		"'SCRIPT'", "'WORKFORCE'", "'MH'", "'ROUND'", "'EXISTSVARIABLE'", "'SETDIMENSION'", 
		null, null, "','", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "LBRACKET", "RBRACKET", "THEN", "ENDIF", "OR", "AND", "EQUALS", 
		"FASLE", "TRUE", "SETOPTION", "PLUS", "MINUS", "ASTERISK", "DIVISION", 
		"LEFT", "RIGHT", "OPTION", "CPIECE", "CPIECE_EX_U", "SETERROR", "LET", 
		"COLOUR", "COLOR", "SETNUMERICOPTION", "GETNUMERICOPTION", "PIECE_EX_U", 
		"PIECE", "SURFACE", "CSURFACE", "SURFACE_EX", "SURFACE_EX_U", "OUTERCOLOUR", 
		"INNERCOLOUR", "CROD", "CROD_EX", "CROD_EX_U", "ROD", "ROD_EX_U", "CINNROD_EX_U", 
		"COUTROD_EX_U", "MESSAGE", "SCRIPT", "WORKFORCE", "MH", "ROUND", "EXISTSVARIABLE", 
		"SETDIMENSION", "NUMBER", "DECIMAL", "COMMA", "SEMICOLON", "ID", "VAR", 
		"WS", "COMMENT"
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

	@Override
	public String getGrammarFileName() { return "Scripts.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ScriptsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ScriptsParser.EOF, 0); }
		public List<OpcjaContext> opcja() {
			return getRuleContexts(OpcjaContext.class);
		}
		public OpcjaContext opcja(int i) {
			return getRuleContext(OpcjaContext.class,i);
		}
		public List<SetOpcjaContext> setOpcja() {
			return getRuleContexts(SetOpcjaContext.class);
		}
		public SetOpcjaContext setOpcja(int i) {
			return getRuleContext(SetOpcjaContext.class,i);
		}
		public List<IfruleContext> ifrule() {
			return getRuleContexts(IfruleContext.class);
		}
		public IfruleContext ifrule(int i) {
			return getRuleContext(IfruleContext.class,i);
		}
		public List<ScriptLinkContext> scriptLink() {
			return getRuleContexts(ScriptLinkContext.class);
		}
		public ScriptLinkContext scriptLink(int i) {
			return getRuleContext(ScriptLinkContext.class,i);
		}
		public List<CpieceContext> cpiece() {
			return getRuleContexts(CpieceContext.class);
		}
		public CpieceContext cpiece(int i) {
			return getRuleContext(CpieceContext.class,i);
		}
		public List<CpiecexuContext> cpiecexu() {
			return getRuleContexts(CpiecexuContext.class);
		}
		public CpiecexuContext cpiecexu(int i) {
			return getRuleContext(CpiecexuContext.class,i);
		}
		public List<SeterrorContext> seterror() {
			return getRuleContexts(SeterrorContext.class);
		}
		public SeterrorContext seterror(int i) {
			return getRuleContext(SeterrorContext.class,i);
		}
		public List<SetnumericContext> setnumeric() {
			return getRuleContexts(SetnumericContext.class);
		}
		public SetnumericContext setnumeric(int i) {
			return getRuleContext(SetnumericContext.class,i);
		}
		public List<GetnumericContext> getnumeric() {
			return getRuleContexts(GetnumericContext.class);
		}
		public GetnumericContext getnumeric(int i) {
			return getRuleContext(GetnumericContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ScriptsParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ScriptsParser.SEMICOLON, i);
		}
		public List<PiecexContext> piecex() {
			return getRuleContexts(PiecexContext.class);
		}
		public PiecexContext piecex(int i) {
			return getRuleContext(PiecexContext.class,i);
		}
		public List<PieceContext> piece() {
			return getRuleContexts(PieceContext.class);
		}
		public PieceContext piece(int i) {
			return getRuleContext(PieceContext.class,i);
		}
		public List<SurfaceContext> surface() {
			return getRuleContexts(SurfaceContext.class);
		}
		public SurfaceContext surface(int i) {
			return getRuleContext(SurfaceContext.class,i);
		}
		public List<CsurfaceContext> csurface() {
			return getRuleContexts(CsurfaceContext.class);
		}
		public CsurfaceContext csurface(int i) {
			return getRuleContext(CsurfaceContext.class,i);
		}
		public List<SurfacexContext> surfacex() {
			return getRuleContexts(SurfacexContext.class);
		}
		public SurfacexContext surfacex(int i) {
			return getRuleContext(SurfacexContext.class,i);
		}
		public List<SurfacexuContext> surfacexu() {
			return getRuleContexts(SurfacexuContext.class);
		}
		public SurfacexuContext surfacexu(int i) {
			return getRuleContext(SurfacexuContext.class,i);
		}
		public List<InnercolorContext> innercolor() {
			return getRuleContexts(InnercolorContext.class);
		}
		public InnercolorContext innercolor(int i) {
			return getRuleContext(InnercolorContext.class,i);
		}
		public List<OutercolorContext> outercolor() {
			return getRuleContexts(OutercolorContext.class);
		}
		public OutercolorContext outercolor(int i) {
			return getRuleContext(OutercolorContext.class,i);
		}
		public List<ColorContext> color() {
			return getRuleContexts(ColorContext.class);
		}
		public ColorContext color(int i) {
			return getRuleContext(ColorContext.class,i);
		}
		public List<ColourContext> colour() {
			return getRuleContexts(ColourContext.class);
		}
		public ColourContext colour(int i) {
			return getRuleContext(ColourContext.class,i);
		}
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public List<CrodContext> crod() {
			return getRuleContexts(CrodContext.class);
		}
		public CrodContext crod(int i) {
			return getRuleContext(CrodContext.class,i);
		}
		public List<CrodxContext> crodx() {
			return getRuleContexts(CrodxContext.class);
		}
		public CrodxContext crodx(int i) {
			return getRuleContext(CrodxContext.class,i);
		}
		public List<CrodxuContext> crodxu() {
			return getRuleContexts(CrodxuContext.class);
		}
		public CrodxuContext crodxu(int i) {
			return getRuleContext(CrodxuContext.class,i);
		}
		public List<RodContext> rod() {
			return getRuleContexts(RodContext.class);
		}
		public RodContext rod(int i) {
			return getRuleContext(RodContext.class,i);
		}
		public List<RodxContext> rodx() {
			return getRuleContexts(RodxContext.class);
		}
		public RodxContext rodx(int i) {
			return getRuleContext(RodxContext.class,i);
		}
		public List<CinrodContext> cinrod() {
			return getRuleContexts(CinrodContext.class);
		}
		public CinrodContext cinrod(int i) {
			return getRuleContext(CinrodContext.class,i);
		}
		public List<CoutrodContext> coutrod() {
			return getRuleContexts(CoutrodContext.class);
		}
		public CoutrodContext coutrod(int i) {
			return getRuleContext(CoutrodContext.class,i);
		}
		public List<MessageContext> message() {
			return getRuleContexts(MessageContext.class);
		}
		public MessageContext message(int i) {
			return getRuleContext(MessageContext.class,i);
		}
		public List<WorkforceContext> workforce() {
			return getRuleContexts(WorkforceContext.class);
		}
		public WorkforceContext workforce(int i) {
			return getRuleContext(WorkforceContext.class,i);
		}
		public List<ExistVarContext> existVar() {
			return getRuleContexts(ExistVarContext.class);
		}
		public ExistVarContext existVar(int i) {
			return getRuleContext(ExistVarContext.class,i);
		}
		public List<SetdimensionContext> setdimension() {
			return getRuleContexts(SetdimensionContext.class);
		}
		public SetdimensionContext setdimension(int i) {
			return getRuleContext(SetdimensionContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << SETOPTION) | (1L << OPTION) | (1L << CPIECE) | (1L << CPIECE_EX_U) | (1L << SETERROR) | (1L << LET) | (1L << COLOUR) | (1L << COLOR) | (1L << SETNUMERICOPTION) | (1L << GETNUMERICOPTION) | (1L << PIECE_EX_U) | (1L << PIECE) | (1L << SURFACE) | (1L << CSURFACE) | (1L << SURFACE_EX) | (1L << SURFACE_EX_U) | (1L << OUTERCOLOUR) | (1L << INNERCOLOUR) | (1L << CROD) | (1L << CROD_EX) | (1L << CROD_EX_U) | (1L << ROD) | (1L << ROD_EX_U) | (1L << CINNROD_EX_U) | (1L << COUTROD_EX_U) | (1L << MESSAGE) | (1L << SCRIPT) | (1L << WORKFORCE) | (1L << EXISTSVARIABLE) | (1L << SETDIMENSION))) != 0)) {
				{
				setState(103);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPTION:
					{
					setState(70);
					opcja();
					}
					break;
				case SETOPTION:
					{
					setState(71);
					setOpcja();
					}
					break;
				case IF:
					{
					setState(72);
					ifrule();
					}
					break;
				case SCRIPT:
					{
					setState(73);
					scriptLink();
					}
					break;
				case CPIECE:
					{
					setState(74);
					cpiece();
					}
					break;
				case CPIECE_EX_U:
					{
					setState(75);
					cpiecexu();
					}
					break;
				case SETERROR:
					{
					setState(76);
					seterror();
					}
					break;
				case SETNUMERICOPTION:
					{
					setState(77);
					setnumeric();
					}
					break;
				case GETNUMERICOPTION:
					{
					setState(78);
					getnumeric();
					setState(79);
					match(SEMICOLON);
					}
					break;
				case PIECE_EX_U:
					{
					setState(81);
					piecex();
					}
					break;
				case PIECE:
					{
					setState(82);
					piece();
					}
					break;
				case SURFACE:
					{
					setState(83);
					surface();
					}
					break;
				case CSURFACE:
					{
					setState(84);
					csurface();
					}
					break;
				case SURFACE_EX:
					{
					setState(85);
					surfacex();
					}
					break;
				case SURFACE_EX_U:
					{
					setState(86);
					surfacexu();
					}
					break;
				case INNERCOLOUR:
					{
					setState(87);
					innercolor();
					}
					break;
				case OUTERCOLOUR:
					{
					setState(88);
					outercolor();
					}
					break;
				case COLOR:
					{
					setState(89);
					color();
					}
					break;
				case COLOUR:
					{
					setState(90);
					colour();
					}
					break;
				case LET:
					{
					setState(91);
					vardecl();
					}
					break;
				case CROD:
					{
					setState(92);
					crod();
					}
					break;
				case CROD_EX:
					{
					setState(93);
					crodx();
					}
					break;
				case CROD_EX_U:
					{
					setState(94);
					crodxu();
					}
					break;
				case ROD:
					{
					setState(95);
					rod();
					}
					break;
				case ROD_EX_U:
					{
					setState(96);
					rodx();
					}
					break;
				case CINNROD_EX_U:
					{
					setState(97);
					cinrod();
					}
					break;
				case COUTROD_EX_U:
					{
					setState(98);
					coutrod();
					}
					break;
				case MESSAGE:
					{
					setState(99);
					message();
					}
					break;
				case WORKFORCE:
					{
					setState(100);
					workforce();
					}
					break;
				case EXISTSVARIABLE:
					{
					setState(101);
					existVar();
					}
					break;
				case SETDIMENSION:
					{
					setState(102);
					setdimension();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(EOF);
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

	public static class IfruleContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ScriptsParser.IF, 0); }
		public TerminalNode LBRACKET() { return getToken(ScriptsParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ScriptsParser.RBRACKET, 0); }
		public TerminalNode THEN() { return getToken(ScriptsParser.THEN, 0); }
		public TerminalNode ENDIF() { return getToken(ScriptsParser.ENDIF, 0); }
		public OpcjaContext opcja() {
			return getRuleContext(OpcjaContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExistVarContext existVar() {
			return getRuleContext(ExistVarContext.class,0);
		}
		public List<SetOpcjaContext> setOpcja() {
			return getRuleContexts(SetOpcjaContext.class);
		}
		public SetOpcjaContext setOpcja(int i) {
			return getRuleContext(SetOpcjaContext.class,i);
		}
		public List<IfruleContext> ifrule() {
			return getRuleContexts(IfruleContext.class);
		}
		public IfruleContext ifrule(int i) {
			return getRuleContext(IfruleContext.class,i);
		}
		public IfruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifrule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterIfrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitIfrule(this);
		}
	}

	public final IfruleContext ifrule() throws RecognitionException {
		IfruleContext _localctx = new IfruleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ifrule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(IF);
			setState(111);
			match(LBRACKET);
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPTION:
				{
				setState(112);
				opcja();
				}
				break;
			case VAR:
				{
				setState(113);
				variable();
				}
				break;
			case EXISTSVARIABLE:
				{
				setState(114);
				existVar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(117);
			match(RBRACKET);
			setState(118);
			match(THEN);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF || _la==SETOPTION) {
				{
				setState(121);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SETOPTION:
					{
					setState(119);
					setOpcja();
					}
					break;
				case IF:
					{
					setState(120);
					ifrule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(ENDIF);
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

	public static class OpcjaContext extends ParserRuleContext {
		public TerminalNode OPTION() { return getToken(ScriptsParser.OPTION, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public List<TerminalNode> ID() { return getTokens(ScriptsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ScriptsParser.ID, i);
		}
		public TerminalNode COMMA() { return getToken(ScriptsParser.COMMA, 0); }
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public OpcjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterOpcja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitOpcja(this);
		}
	}

	public final OpcjaContext opcja() throws RecognitionException {
		OpcjaContext _localctx = new OpcjaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_opcja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(OPTION);
			setState(129);
			match(LEFT);
			setState(130);
			match(ID);
			setState(131);
			match(COMMA);
			setState(132);
			match(ID);
			setState(133);
			match(RIGHT);
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

	public static class SetOpcjaContext extends ParserRuleContext {
		public TerminalNode SETOPTION() { return getToken(ScriptsParser.SETOPTION, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public List<TerminalNode> ID() { return getTokens(ScriptsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ScriptsParser.ID, i);
		}
		public TerminalNode COMMA() { return getToken(ScriptsParser.COMMA, 0); }
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScriptsParser.SEMICOLON, 0); }
		public SetOpcjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOpcja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterSetOpcja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitSetOpcja(this);
		}
	}

	public final SetOpcjaContext setOpcja() throws RecognitionException {
		SetOpcjaContext _localctx = new SetOpcjaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_setOpcja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(SETOPTION);
			setState(136);
			match(LEFT);
			setState(137);
			match(ID);
			setState(138);
			match(COMMA);
			setState(139);
			match(ID);
			setState(140);
			match(RIGHT);
			setState(141);
			match(SEMICOLON);
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

	public static class ScriptLinkContext extends ParserRuleContext {
		public TerminalNode SCRIPT() { return getToken(ScriptsParser.SCRIPT, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public List<TerminalNode> ID() { return getTokens(ScriptsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ScriptsParser.ID, i);
		}
		public TerminalNode COMMA() { return getToken(ScriptsParser.COMMA, 0); }
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScriptsParser.SEMICOLON, 0); }
		public ScriptLinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptLink; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterScriptLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitScriptLink(this);
		}
	}

	public final ScriptLinkContext scriptLink() throws RecognitionException {
		ScriptLinkContext _localctx = new ScriptLinkContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_scriptLink);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(SCRIPT);
			setState(144);
			match(LEFT);
			setState(145);
			match(ID);
			setState(146);
			match(COMMA);
			setState(147);
			match(ID);
			setState(148);
			match(RIGHT);
			setState(149);
			match(SEMICOLON);
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

	public static class VardeclContext extends ParserRuleContext {
		public VardeclarationContext vardeclaration() {
			return getRuleContext(VardeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ScriptsParser.SEMICOLON, 0); }
		public GetnumericContext getnumeric() {
			return getRuleContext(GetnumericContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(ScriptsParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ScriptsParser.RBRACKET, 0); }
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitVardecl(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_vardecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			vardeclaration();
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GETNUMERICOPTION:
				{
				setState(152);
				getnumeric();
				}
				break;
			case LBRACKET:
				{
				setState(153);
				match(LBRACKET);
				setState(154);
				getnumeric();
				setState(155);
				match(RBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(159);
			match(SEMICOLON);
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

	public static class VardeclarationContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(ScriptsParser.LET, 0); }
		public TerminalNode VAR() { return getToken(ScriptsParser.VAR, 0); }
		public TerminalNode EQUALS() { return getToken(ScriptsParser.EQUALS, 0); }
		public VardeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterVardeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitVardeclaration(this);
		}
	}

	public final VardeclarationContext vardeclaration() throws RecognitionException {
		VardeclarationContext _localctx = new VardeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_vardeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(LET);
			setState(162);
			match(VAR);
			setState(163);
			match(EQUALS);
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
		public TerminalNode VAR() { return getToken(ScriptsParser.VAR, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(VAR);
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

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(ScriptsParser.COLOR, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public TerminalNode ID() { return getToken(ScriptsParser.ID, 0); }
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitColor(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(COLOR);
			setState(168);
			match(LEFT);
			setState(169);
			match(ID);
			setState(170);
			match(RIGHT);
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

	public static class ColourContext extends ParserRuleContext {
		public TerminalNode COLOUR() { return getToken(ScriptsParser.COLOUR, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public TerminalNode ID() { return getToken(ScriptsParser.ID, 0); }
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public ColourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colour; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterColour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitColour(this);
		}
	}

	public final ColourContext colour() throws RecognitionException {
		ColourContext _localctx = new ColourContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_colour);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(COLOUR);
			setState(173);
			match(LEFT);
			setState(174);
			match(ID);
			setState(175);
			match(RIGHT);
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

	public static class InnercolorContext extends ParserRuleContext {
		public TerminalNode INNERCOLOUR() { return getToken(ScriptsParser.INNERCOLOUR, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public TerminalNode ID() { return getToken(ScriptsParser.ID, 0); }
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public InnercolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innercolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterInnercolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitInnercolor(this);
		}
	}

	public final InnercolorContext innercolor() throws RecognitionException {
		InnercolorContext _localctx = new InnercolorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_innercolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(INNERCOLOUR);
			setState(178);
			match(LEFT);
			setState(179);
			match(ID);
			setState(180);
			match(RIGHT);
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

	public static class OutercolorContext extends ParserRuleContext {
		public TerminalNode OUTERCOLOUR() { return getToken(ScriptsParser.OUTERCOLOUR, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public TerminalNode ID() { return getToken(ScriptsParser.ID, 0); }
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public OutercolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outercolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterOutercolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitOutercolor(this);
		}
	}

	public final OutercolorContext outercolor() throws RecognitionException {
		OutercolorContext _localctx = new OutercolorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_outercolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(OUTERCOLOUR);
			setState(183);
			match(LEFT);
			setState(184);
			match(ID);
			setState(185);
			match(RIGHT);
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

	public static class CpieceContext extends ParserRuleContext {
		public TerminalNode CPIECE() { return getToken(ScriptsParser.CPIECE, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public TerminalNode ID() { return getToken(ScriptsParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(ScriptsParser.COMMA, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScriptsParser.SEMICOLON, 0); }
		public CpieceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpiece; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterCpiece(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitCpiece(this);
		}
	}

	public final CpieceContext cpiece() throws RecognitionException {
		CpieceContext _localctx = new CpieceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cpiece);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(CPIECE);
			setState(188);
			match(LEFT);
			setState(189);
			match(ID);
			setState(190);
			match(COMMA);
			setState(191);
			arg();
			setState(192);
			match(RIGHT);
			setState(193);
			match(SEMICOLON);
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

	public static class CpiecexuContext extends ParserRuleContext {
		public TerminalNode CPIECE_EX_U() { return getToken(ScriptsParser.CPIECE_EX_U, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public List<TerminalNode> ID() { return getTokens(ScriptsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ScriptsParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ScriptsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScriptsParser.COMMA, i);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScriptsParser.SEMICOLON, 0); }
		public CpiecexuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpiecexu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterCpiecexu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitCpiecexu(this);
		}
	}

	public final CpiecexuContext cpiecexu() throws RecognitionException {
		CpiecexuContext _localctx = new CpiecexuContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cpiecexu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(CPIECE_EX_U);
			setState(196);
			match(LEFT);
			setState(197);
			match(ID);
			setState(198);
			match(COMMA);
			setState(199);
			arg();
			setState(200);
			match(COMMA);
			setState(201);
			match(ID);
			setState(202);
			match(COMMA);
			setState(203);
			arg();
			setState(204);
			match(RIGHT);
			setState(205);
			match(SEMICOLON);
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

	public static class SeterrorContext extends ParserRuleContext {
		public TerminalNode SETERROR() { return getToken(ScriptsParser.SETERROR, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScriptsParser.SEMICOLON, 0); }
		public SeterrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seterror; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterSeterror(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitSeterror(this);
		}
	}

	public final SeterrorContext seterror() throws RecognitionException {
		SeterrorContext _localctx = new SeterrorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_seterror);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(SETERROR);
			setState(208);
			match(LEFT);
			setState(209);
			arg();
			setState(210);
			match(RIGHT);
			setState(211);
			match(SEMICOLON);
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

	public static class SetnumericContext extends ParserRuleContext {
		public TerminalNode SETNUMERICOPTION() { return getToken(ScriptsParser.SETNUMERICOPTION, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public TerminalNode ID() { return getToken(ScriptsParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(ScriptsParser.COMMA, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScriptsParser.SEMICOLON, 0); }
		public SetnumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setnumeric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterSetnumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitSetnumeric(this);
		}
	}

	public final SetnumericContext setnumeric() throws RecognitionException {
		SetnumericContext _localctx = new SetnumericContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_setnumeric);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(SETNUMERICOPTION);
			setState(214);
			match(LEFT);
			setState(215);
			match(ID);
			setState(216);
			match(COMMA);
			setState(217);
			arg();
			setState(218);
			match(RIGHT);
			setState(219);
			match(SEMICOLON);
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

	public static class GetnumericContext extends ParserRuleContext {
		public TerminalNode GETNUMERICOPTION() { return getToken(ScriptsParser.GETNUMERICOPTION, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public TerminalNode ID() { return getToken(ScriptsParser.ID, 0); }
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public GetnumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getnumeric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterGetnumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitGetnumeric(this);
		}
	}

	public final GetnumericContext getnumeric() throws RecognitionException {
		GetnumericContext _localctx = new GetnumericContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_getnumeric);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(GETNUMERICOPTION);
			setState(222);
			match(LEFT);
			setState(223);
			match(ID);
			setState(224);
			match(RIGHT);
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

	public static class PiecexContext extends ParserRuleContext {
		public TerminalNode PIECE_EX_U() { return getToken(ScriptsParser.PIECE_EX_U, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public List<TerminalNode> ID() { return getTokens(ScriptsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ScriptsParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ScriptsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScriptsParser.COMMA, i);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScriptsParser.SEMICOLON, 0); }
		public PiecexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_piecex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterPiecex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitPiecex(this);
		}
	}

	public final PiecexContext piecex() throws RecognitionException {
		PiecexContext _localctx = new PiecexContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_piecex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(PIECE_EX_U);
			setState(227);
			match(LEFT);
			setState(228);
			match(ID);
			setState(229);
			match(COMMA);
			setState(230);
			arg();
			setState(231);
			match(COMMA);
			setState(232);
			match(ID);
			setState(233);
			match(COMMA);
			setState(234);
			arg();
			setState(235);
			match(RIGHT);
			setState(236);
			match(SEMICOLON);
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

	public static class PieceContext extends ParserRuleContext {
		public TerminalNode PIECE() { return getToken(ScriptsParser.PIECE, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public TerminalNode ID() { return getToken(ScriptsParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(ScriptsParser.COMMA, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScriptsParser.SEMICOLON, 0); }
		public PieceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_piece; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterPiece(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitPiece(this);
		}
	}

	public final PieceContext piece() throws RecognitionException {
		PieceContext _localctx = new PieceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_piece);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(PIECE);
			setState(239);
			match(LEFT);
			setState(240);
			match(ID);
			setState(241);
			match(COMMA);
			setState(242);
			arg();
			setState(243);
			match(RIGHT);
			setState(244);
			match(SEMICOLON);
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

	public static class SurfaceContext extends ParserRuleContext {
		public TerminalNode SURFACE() { return getToken(ScriptsParser.SURFACE, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public TerminalNode ID() { return getToken(ScriptsParser.ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ScriptsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScriptsParser.COMMA, i);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScriptsParser.SEMICOLON, 0); }
		public SurfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterSurface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitSurface(this);
		}
	}

	public final SurfaceContext surface() throws RecognitionException {
		SurfaceContext _localctx = new SurfaceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_surface);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(SURFACE);
			setState(247);
			match(LEFT);
			setState(248);
			match(ID);
			setState(249);
			match(COMMA);
			setState(250);
			arg();
			setState(251);
			match(COMMA);
			setState(252);
			arg();
			setState(253);
			match(COMMA);
			setState(254);
			arg();
			setState(255);
			match(RIGHT);
			setState(256);
			match(SEMICOLON);
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

	public static class CsurfaceContext extends ParserRuleContext {
		public TerminalNode CSURFACE() { return getToken(ScriptsParser.CSURFACE, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public TerminalNode ID() { return getToken(ScriptsParser.ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ScriptsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScriptsParser.COMMA, i);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScriptsParser.SEMICOLON, 0); }
		public CsurfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csurface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterCsurface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitCsurface(this);
		}
	}

	public final CsurfaceContext csurface() throws RecognitionException {
		CsurfaceContext _localctx = new CsurfaceContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_csurface);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(CSURFACE);
			setState(259);
			match(LEFT);
			setState(260);
			match(ID);
			setState(261);
			match(COMMA);
			setState(262);
			arg();
			setState(263);
			match(COMMA);
			setState(264);
			arg();
			setState(265);
			match(COMMA);
			setState(266);
			arg();
			setState(267);
			match(RIGHT);
			setState(268);
			match(SEMICOLON);
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

	public static class SurfacexContext extends ParserRuleContext {
		public TerminalNode SURFACE_EX() { return getToken(ScriptsParser.SURFACE_EX, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public List<TerminalNode> ID() { return getTokens(ScriptsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ScriptsParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ScriptsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScriptsParser.COMMA, i);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScriptsParser.SEMICOLON, 0); }
		public SurfacexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfacex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterSurfacex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitSurfacex(this);
		}
	}

	public final SurfacexContext surfacex() throws RecognitionException {
		SurfacexContext _localctx = new SurfacexContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_surfacex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(SURFACE_EX);
			setState(271);
			match(LEFT);
			setState(272);
			match(ID);
			setState(273);
			match(COMMA);
			setState(274);
			arg();
			setState(275);
			match(COMMA);
			setState(276);
			arg();
			setState(277);
			match(COMMA);
			setState(278);
			arg();
			setState(279);
			match(COMMA);
			setState(280);
			match(ID);
			setState(281);
			match(RIGHT);
			setState(282);
			match(SEMICOLON);
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

	public static class SurfacexuContext extends ParserRuleContext {
		public TerminalNode SURFACE_EX_U() { return getToken(ScriptsParser.SURFACE_EX_U, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public List<TerminalNode> ID() { return getTokens(ScriptsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ScriptsParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ScriptsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScriptsParser.COMMA, i);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScriptsParser.SEMICOLON, 0); }
		public SurfacexuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfacexu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterSurfacexu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitSurfacexu(this);
		}
	}

	public final SurfacexuContext surfacexu() throws RecognitionException {
		SurfacexuContext _localctx = new SurfacexuContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_surfacexu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(SURFACE_EX_U);
			setState(285);
			match(LEFT);
			setState(286);
			match(ID);
			setState(287);
			match(COMMA);
			setState(288);
			arg();
			setState(289);
			match(COMMA);
			setState(290);
			arg();
			setState(291);
			match(COMMA);
			setState(292);
			arg();
			setState(293);
			match(COMMA);
			setState(294);
			match(ID);
			setState(295);
			match(COMMA);
			setState(296);
			arg();
			setState(297);
			match(RIGHT);
			setState(298);
			match(SEMICOLON);
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

	public static class CrodContext extends ParserRuleContext {
		public TerminalNode CROD() { return getToken(ScriptsParser.CROD, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public TerminalNode ID() { return getToken(ScriptsParser.ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ScriptsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScriptsParser.COMMA, i);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScriptsParser.SEMICOLON, 0); }
		public CrodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterCrod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitCrod(this);
		}
	}

	public final CrodContext crod() throws RecognitionException {
		CrodContext _localctx = new CrodContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_crod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(CROD);
			setState(301);
			match(LEFT);
			setState(302);
			match(ID);
			setState(303);
			match(COMMA);
			setState(304);
			arg();
			setState(305);
			match(COMMA);
			setState(306);
			arg();
			setState(307);
			match(COMMA);
			setState(308);
			arg();
			setState(309);
			match(COMMA);
			setState(310);
			arg();
			setState(311);
			match(RIGHT);
			setState(312);
			match(SEMICOLON);
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

	public static class CrodxContext extends ParserRuleContext {
		public TerminalNode CROD_EX() { return getToken(ScriptsParser.CROD_EX, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public List<TerminalNode> ID() { return getTokens(ScriptsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ScriptsParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ScriptsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScriptsParser.COMMA, i);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScriptsParser.SEMICOLON, 0); }
		public CrodxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crodx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterCrodx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitCrodx(this);
		}
	}

	public final CrodxContext crodx() throws RecognitionException {
		CrodxContext _localctx = new CrodxContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_crodx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(CROD_EX);
			setState(315);
			match(LEFT);
			setState(316);
			match(ID);
			setState(317);
			match(COMMA);
			setState(318);
			arg();
			setState(319);
			match(COMMA);
			setState(320);
			arg();
			setState(321);
			match(COMMA);
			setState(322);
			arg();
			setState(323);
			match(COMMA);
			setState(324);
			arg();
			setState(325);
			match(COMMA);
			setState(326);
			arg();
			setState(327);
			match(COMMA);
			setState(328);
			arg();
			setState(329);
			match(COMMA);
			setState(330);
			arg();
			setState(331);
			match(COMMA);
			setState(332);
			match(ID);
			setState(333);
			match(RIGHT);
			setState(334);
			match(SEMICOLON);
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

	public static class CrodxuContext extends ParserRuleContext {
		public TerminalNode CROD_EX_U() { return getToken(ScriptsParser.CROD_EX_U, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public List<TerminalNode> ID() { return getTokens(ScriptsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ScriptsParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ScriptsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScriptsParser.COMMA, i);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScriptsParser.SEMICOLON, 0); }
		public CrodxuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crodxu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterCrodxu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitCrodxu(this);
		}
	}

	public final CrodxuContext crodxu() throws RecognitionException {
		CrodxuContext _localctx = new CrodxuContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_crodxu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(CROD_EX_U);
			setState(337);
			match(LEFT);
			setState(338);
			match(ID);
			setState(339);
			match(COMMA);
			setState(340);
			arg();
			setState(341);
			match(COMMA);
			setState(342);
			arg();
			setState(343);
			match(COMMA);
			setState(344);
			arg();
			setState(345);
			match(COMMA);
			setState(346);
			arg();
			setState(347);
			match(COMMA);
			setState(348);
			arg();
			setState(349);
			match(COMMA);
			setState(350);
			arg();
			setState(351);
			match(COMMA);
			setState(352);
			arg();
			setState(353);
			match(COMMA);
			setState(354);
			match(ID);
			setState(355);
			match(COMMA);
			setState(356);
			arg();
			setState(357);
			match(RIGHT);
			setState(358);
			match(SEMICOLON);
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

	public static class RodContext extends ParserRuleContext {
		public TerminalNode ROD() { return getToken(ScriptsParser.ROD, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public TerminalNode ID() { return getToken(ScriptsParser.ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ScriptsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScriptsParser.COMMA, i);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScriptsParser.SEMICOLON, 0); }
		public RodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterRod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitRod(this);
		}
	}

	public final RodContext rod() throws RecognitionException {
		RodContext _localctx = new RodContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_rod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(ROD);
			setState(361);
			match(LEFT);
			setState(362);
			match(ID);
			setState(363);
			match(COMMA);
			setState(364);
			arg();
			setState(365);
			match(COMMA);
			setState(366);
			arg();
			setState(367);
			match(COMMA);
			setState(368);
			arg();
			setState(369);
			match(COMMA);
			setState(370);
			arg();
			setState(371);
			match(RIGHT);
			setState(372);
			match(SEMICOLON);
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

	public static class RodxContext extends ParserRuleContext {
		public TerminalNode ROD_EX_U() { return getToken(ScriptsParser.ROD_EX_U, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public List<TerminalNode> ID() { return getTokens(ScriptsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ScriptsParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ScriptsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScriptsParser.COMMA, i);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScriptsParser.SEMICOLON, 0); }
		public RodxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rodx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterRodx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitRodx(this);
		}
	}

	public final RodxContext rodx() throws RecognitionException {
		RodxContext _localctx = new RodxContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_rodx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(ROD_EX_U);
			setState(375);
			match(LEFT);
			setState(376);
			match(ID);
			setState(377);
			match(COMMA);
			setState(378);
			arg();
			setState(379);
			match(COMMA);
			setState(380);
			arg();
			setState(381);
			match(COMMA);
			setState(382);
			arg();
			setState(383);
			match(COMMA);
			setState(384);
			arg();
			setState(385);
			match(COMMA);
			setState(386);
			arg();
			setState(387);
			match(COMMA);
			setState(388);
			arg();
			setState(389);
			match(COMMA);
			setState(390);
			arg();
			setState(391);
			match(COMMA);
			setState(392);
			match(ID);
			setState(393);
			match(COMMA);
			setState(394);
			arg();
			setState(395);
			match(RIGHT);
			setState(396);
			match(SEMICOLON);
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

	public static class CinrodContext extends ParserRuleContext {
		public TerminalNode CINNROD_EX_U() { return getToken(ScriptsParser.CINNROD_EX_U, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public List<TerminalNode> ID() { return getTokens(ScriptsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ScriptsParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ScriptsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScriptsParser.COMMA, i);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScriptsParser.SEMICOLON, 0); }
		public CinrodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cinrod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterCinrod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitCinrod(this);
		}
	}

	public final CinrodContext cinrod() throws RecognitionException {
		CinrodContext _localctx = new CinrodContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cinrod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(CINNROD_EX_U);
			setState(399);
			match(LEFT);
			setState(400);
			match(ID);
			setState(401);
			match(COMMA);
			setState(402);
			arg();
			setState(403);
			match(COMMA);
			setState(404);
			arg();
			setState(405);
			match(COMMA);
			setState(406);
			arg();
			setState(407);
			match(COMMA);
			setState(408);
			arg();
			setState(409);
			match(COMMA);
			setState(410);
			arg();
			setState(411);
			match(COMMA);
			setState(412);
			arg();
			setState(413);
			match(COMMA);
			setState(414);
			arg();
			setState(415);
			match(COMMA);
			setState(416);
			match(ID);
			setState(417);
			match(COMMA);
			setState(418);
			arg();
			setState(419);
			match(RIGHT);
			setState(420);
			match(SEMICOLON);
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

	public static class CoutrodContext extends ParserRuleContext {
		public TerminalNode COUTROD_EX_U() { return getToken(ScriptsParser.COUTROD_EX_U, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public List<TerminalNode> ID() { return getTokens(ScriptsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ScriptsParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ScriptsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScriptsParser.COMMA, i);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScriptsParser.SEMICOLON, 0); }
		public CoutrodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coutrod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterCoutrod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitCoutrod(this);
		}
	}

	public final CoutrodContext coutrod() throws RecognitionException {
		CoutrodContext _localctx = new CoutrodContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_coutrod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(COUTROD_EX_U);
			setState(423);
			match(LEFT);
			setState(424);
			match(ID);
			setState(425);
			match(COMMA);
			setState(426);
			arg();
			setState(427);
			match(COMMA);
			setState(428);
			arg();
			setState(429);
			match(COMMA);
			setState(430);
			arg();
			setState(431);
			match(COMMA);
			setState(432);
			arg();
			setState(433);
			match(COMMA);
			setState(434);
			arg();
			setState(435);
			match(COMMA);
			setState(436);
			arg();
			setState(437);
			match(COMMA);
			setState(438);
			arg();
			setState(439);
			match(COMMA);
			setState(440);
			match(ID);
			setState(441);
			match(COMMA);
			setState(442);
			arg();
			setState(443);
			match(RIGHT);
			setState(444);
			match(SEMICOLON);
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

	public static class MessageContext extends ParserRuleContext {
		public TerminalNode MESSAGE() { return getToken(ScriptsParser.MESSAGE, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public TerminalNode ID() { return getToken(ScriptsParser.ID, 0); }
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScriptsParser.SEMICOLON, 0); }
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitMessage(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(MESSAGE);
			setState(447);
			match(LEFT);
			setState(448);
			match(ID);
			setState(449);
			match(RIGHT);
			setState(450);
			match(SEMICOLON);
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

	public static class WorkforceContext extends ParserRuleContext {
		public TerminalNode WORKFORCE() { return getToken(ScriptsParser.WORKFORCE, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public TerminalNode ID() { return getToken(ScriptsParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(ScriptsParser.COMMA, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScriptsParser.SEMICOLON, 0); }
		public WorkforceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_workforce; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterWorkforce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitWorkforce(this);
		}
	}

	public final WorkforceContext workforce() throws RecognitionException {
		WorkforceContext _localctx = new WorkforceContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_workforce);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(WORKFORCE);
			setState(453);
			match(LEFT);
			setState(454);
			match(ID);
			setState(455);
			match(COMMA);
			setState(456);
			arg();
			setState(457);
			match(RIGHT);
			setState(458);
			match(SEMICOLON);
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

	public static class ExistVarContext extends ParserRuleContext {
		public TerminalNode EXISTSVARIABLE() { return getToken(ScriptsParser.EXISTSVARIABLE, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public TerminalNode ID() { return getToken(ScriptsParser.ID, 0); }
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public ExistVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterExistVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitExistVar(this);
		}
	}

	public final ExistVarContext existVar() throws RecognitionException {
		ExistVarContext _localctx = new ExistVarContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_existVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(EXISTSVARIABLE);
			setState(461);
			match(LEFT);
			setState(462);
			match(ID);
			setState(463);
			match(RIGHT);
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

	public static class SetdimensionContext extends ParserRuleContext {
		public TerminalNode SETDIMENSION() { return getToken(ScriptsParser.SETDIMENSION, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public TerminalNode ID() { return getToken(ScriptsParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(ScriptsParser.COMMA, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScriptsParser.SEMICOLON, 0); }
		public SetdimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setdimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterSetdimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitSetdimension(this);
		}
	}

	public final SetdimensionContext setdimension() throws RecognitionException {
		SetdimensionContext _localctx = new SetdimensionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_setdimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(SETDIMENSION);
			setState(466);
			match(LEFT);
			setState(467);
			match(ID);
			setState(468);
			match(COMMA);
			setState(469);
			arg();
			setState(470);
			match(RIGHT);
			setState(471);
			match(SEMICOLON);
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

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(ScriptsParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ScriptsParser.RBRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(ScriptsParser.NUMBER, 0); }
		public TerminalNode DECIMAL() { return getToken(ScriptsParser.DECIMAL, 0); }
		public TerminalNode VAR() { return getToken(ScriptsParser.VAR, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(LBRACKET);
			setState(474);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << DECIMAL) | (1L << VAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(475);
			match(RBRACKET);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u01e0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\7\2j\n\2\f\2\16\2m\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5"+
		"\3v\n\3\3\3\3\3\3\3\3\3\7\3|\n\3\f\3\16\3\177\13\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a0\n\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\2\2%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDF\2\3\4\2\63\6488\2\u01e0\2k\3\2\2\2\4p\3\2\2"+
		"\2\6\u0082\3\2\2\2\b\u0089\3\2\2\2\n\u0091\3\2\2\2\f\u0099\3\2\2\2\16"+
		"\u00a3\3\2\2\2\20\u00a7\3\2\2\2\22\u00a9\3\2\2\2\24\u00ae\3\2\2\2\26\u00b3"+
		"\3\2\2\2\30\u00b8\3\2\2\2\32\u00bd\3\2\2\2\34\u00c5\3\2\2\2\36\u00d1\3"+
		"\2\2\2 \u00d7\3\2\2\2\"\u00df\3\2\2\2$\u00e4\3\2\2\2&\u00f0\3\2\2\2(\u00f8"+
		"\3\2\2\2*\u0104\3\2\2\2,\u0110\3\2\2\2.\u011e\3\2\2\2\60\u012e\3\2\2\2"+
		"\62\u013c\3\2\2\2\64\u0152\3\2\2\2\66\u016a\3\2\2\28\u0178\3\2\2\2:\u0190"+
		"\3\2\2\2<\u01a8\3\2\2\2>\u01c0\3\2\2\2@\u01c6\3\2\2\2B\u01ce\3\2\2\2D"+
		"\u01d3\3\2\2\2F\u01db\3\2\2\2Hj\5\6\4\2Ij\5\b\5\2Jj\5\4\3\2Kj\5\n\6\2"+
		"Lj\5\32\16\2Mj\5\34\17\2Nj\5\36\20\2Oj\5 \21\2PQ\5\"\22\2QR\7\66\2\2R"+
		"j\3\2\2\2Sj\5$\23\2Tj\5&\24\2Uj\5(\25\2Vj\5*\26\2Wj\5,\27\2Xj\5.\30\2"+
		"Yj\5\26\f\2Zj\5\30\r\2[j\5\22\n\2\\j\5\24\13\2]j\5\f\7\2^j\5\60\31\2_"+
		"j\5\62\32\2`j\5\64\33\2aj\5\66\34\2bj\58\35\2cj\5:\36\2dj\5<\37\2ej\5"+
		"> \2fj\5@!\2gj\5B\"\2hj\5D#\2iH\3\2\2\2iI\3\2\2\2iJ\3\2\2\2iK\3\2\2\2"+
		"iL\3\2\2\2iM\3\2\2\2iN\3\2\2\2iO\3\2\2\2iP\3\2\2\2iS\3\2\2\2iT\3\2\2\2"+
		"iU\3\2\2\2iV\3\2\2\2iW\3\2\2\2iX\3\2\2\2iY\3\2\2\2iZ\3\2\2\2i[\3\2\2\2"+
		"i\\\3\2\2\2i]\3\2\2\2i^\3\2\2\2i_\3\2\2\2i`\3\2\2\2ia\3\2\2\2ib\3\2\2"+
		"\2ic\3\2\2\2id\3\2\2\2ie\3\2\2\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2jm\3\2\2"+
		"\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\2\2\3o\3\3\2\2\2pq\7\3"+
		"\2\2qu\7\4\2\2rv\5\6\4\2sv\5\20\t\2tv\5B\"\2ur\3\2\2\2us\3\2\2\2ut\3\2"+
		"\2\2vw\3\2\2\2wx\7\5\2\2x}\7\6\2\2y|\5\b\5\2z|\5\4\3\2{y\3\2\2\2{z\3\2"+
		"\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080"+
		"\u0081\7\7\2\2\u0081\5\3\2\2\2\u0082\u0083\7\24\2\2\u0083\u0084\7\22\2"+
		"\2\u0084\u0085\7\67\2\2\u0085\u0086\7\65\2\2\u0086\u0087\7\67\2\2\u0087"+
		"\u0088\7\23\2\2\u0088\7\3\2\2\2\u0089\u008a\7\r\2\2\u008a\u008b\7\22\2"+
		"\2\u008b\u008c\7\67\2\2\u008c\u008d\7\65\2\2\u008d\u008e\7\67\2\2\u008e"+
		"\u008f\7\23\2\2\u008f\u0090\7\66\2\2\u0090\t\3\2\2\2\u0091\u0092\7-\2"+
		"\2\u0092\u0093\7\22\2\2\u0093\u0094\7\67\2\2\u0094\u0095\7\65\2\2\u0095"+
		"\u0096\7\67\2\2\u0096\u0097\7\23\2\2\u0097\u0098\7\66\2\2\u0098\13\3\2"+
		"\2\2\u0099\u009f\5\16\b\2\u009a\u00a0\5\"\22\2\u009b\u009c\7\4\2\2\u009c"+
		"\u009d\5\"\22\2\u009d\u009e\7\5\2\2\u009e\u00a0\3\2\2\2\u009f\u009a\3"+
		"\2\2\2\u009f\u009b\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\66\2\2\u00a2"+
		"\r\3\2\2\2\u00a3\u00a4\7\30\2\2\u00a4\u00a5\78\2\2\u00a5\u00a6\7\n\2\2"+
		"\u00a6\17\3\2\2\2\u00a7\u00a8\78\2\2\u00a8\21\3\2\2\2\u00a9\u00aa\7\32"+
		"\2\2\u00aa\u00ab\7\22\2\2\u00ab\u00ac\7\67\2\2\u00ac\u00ad\7\23\2\2\u00ad"+
		"\23\3\2\2\2\u00ae\u00af\7\31\2\2\u00af\u00b0\7\22\2\2\u00b0\u00b1\7\67"+
		"\2\2\u00b1\u00b2\7\23\2\2\u00b2\25\3\2\2\2\u00b3\u00b4\7$\2\2\u00b4\u00b5"+
		"\7\22\2\2\u00b5\u00b6\7\67\2\2\u00b6\u00b7\7\23\2\2\u00b7\27\3\2\2\2\u00b8"+
		"\u00b9\7#\2\2\u00b9\u00ba\7\22\2\2\u00ba\u00bb\7\67\2\2\u00bb\u00bc\7"+
		"\23\2\2\u00bc\31\3\2\2\2\u00bd\u00be\7\25\2\2\u00be\u00bf\7\22\2\2\u00bf"+
		"\u00c0\7\67\2\2\u00c0\u00c1\7\65\2\2\u00c1\u00c2\5F$\2\u00c2\u00c3\7\23"+
		"\2\2\u00c3\u00c4\7\66\2\2\u00c4\33\3\2\2\2\u00c5\u00c6\7\26\2\2\u00c6"+
		"\u00c7\7\22\2\2\u00c7\u00c8\7\67\2\2\u00c8\u00c9\7\65\2\2\u00c9\u00ca"+
		"\5F$\2\u00ca\u00cb\7\65\2\2\u00cb\u00cc\7\67\2\2\u00cc\u00cd\7\65\2\2"+
		"\u00cd\u00ce\5F$\2\u00ce\u00cf\7\23\2\2\u00cf\u00d0\7\66\2\2\u00d0\35"+
		"\3\2\2\2\u00d1\u00d2\7\27\2\2\u00d2\u00d3\7\22\2\2\u00d3\u00d4\5F$\2\u00d4"+
		"\u00d5\7\23\2\2\u00d5\u00d6\7\66\2\2\u00d6\37\3\2\2\2\u00d7\u00d8\7\33"+
		"\2\2\u00d8\u00d9\7\22\2\2\u00d9\u00da\7\67\2\2\u00da\u00db\7\65\2\2\u00db"+
		"\u00dc\5F$\2\u00dc\u00dd\7\23\2\2\u00dd\u00de\7\66\2\2\u00de!\3\2\2\2"+
		"\u00df\u00e0\7\34\2\2\u00e0\u00e1\7\22\2\2\u00e1\u00e2\7\67\2\2\u00e2"+
		"\u00e3\7\23\2\2\u00e3#\3\2\2\2\u00e4\u00e5\7\35\2\2\u00e5\u00e6\7\22\2"+
		"\2\u00e6\u00e7\7\67\2\2\u00e7\u00e8\7\65\2\2\u00e8\u00e9\5F$\2\u00e9\u00ea"+
		"\7\65\2\2\u00ea\u00eb\7\67\2\2\u00eb\u00ec\7\65\2\2\u00ec\u00ed\5F$\2"+
		"\u00ed\u00ee\7\23\2\2\u00ee\u00ef\7\66\2\2\u00ef%\3\2\2\2\u00f0\u00f1"+
		"\7\36\2\2\u00f1\u00f2\7\22\2\2\u00f2\u00f3\7\67\2\2\u00f3\u00f4\7\65\2"+
		"\2\u00f4\u00f5\5F$\2\u00f5\u00f6\7\23\2\2\u00f6\u00f7\7\66\2\2\u00f7\'"+
		"\3\2\2\2\u00f8\u00f9\7\37\2\2\u00f9\u00fa\7\22\2\2\u00fa\u00fb\7\67\2"+
		"\2\u00fb\u00fc\7\65\2\2\u00fc\u00fd\5F$\2\u00fd\u00fe\7\65\2\2\u00fe\u00ff"+
		"\5F$\2\u00ff\u0100\7\65\2\2\u0100\u0101\5F$\2\u0101\u0102\7\23\2\2\u0102"+
		"\u0103\7\66\2\2\u0103)\3\2\2\2\u0104\u0105\7 \2\2\u0105\u0106\7\22\2\2"+
		"\u0106\u0107\7\67\2\2\u0107\u0108\7\65\2\2\u0108\u0109\5F$\2\u0109\u010a"+
		"\7\65\2\2\u010a\u010b\5F$\2\u010b\u010c\7\65\2\2\u010c\u010d\5F$\2\u010d"+
		"\u010e\7\23\2\2\u010e\u010f\7\66\2\2\u010f+\3\2\2\2\u0110\u0111\7!\2\2"+
		"\u0111\u0112\7\22\2\2\u0112\u0113\7\67\2\2\u0113\u0114\7\65\2\2\u0114"+
		"\u0115\5F$\2\u0115\u0116\7\65\2\2\u0116\u0117\5F$\2\u0117\u0118\7\65\2"+
		"\2\u0118\u0119\5F$\2\u0119\u011a\7\65\2\2\u011a\u011b\7\67\2\2\u011b\u011c"+
		"\7\23\2\2\u011c\u011d\7\66\2\2\u011d-\3\2\2\2\u011e\u011f\7\"\2\2\u011f"+
		"\u0120\7\22\2\2\u0120\u0121\7\67\2\2\u0121\u0122\7\65\2\2\u0122\u0123"+
		"\5F$\2\u0123\u0124\7\65\2\2\u0124\u0125\5F$\2\u0125\u0126\7\65\2\2\u0126"+
		"\u0127\5F$\2\u0127\u0128\7\65\2\2\u0128\u0129\7\67\2\2\u0129\u012a\7\65"+
		"\2\2\u012a\u012b\5F$\2\u012b\u012c\7\23\2\2\u012c\u012d\7\66\2\2\u012d"+
		"/\3\2\2\2\u012e\u012f\7%\2\2\u012f\u0130\7\22\2\2\u0130\u0131\7\67\2\2"+
		"\u0131\u0132\7\65\2\2\u0132\u0133\5F$\2\u0133\u0134\7\65\2\2\u0134\u0135"+
		"\5F$\2\u0135\u0136\7\65\2\2\u0136\u0137\5F$\2\u0137\u0138\7\65\2\2\u0138"+
		"\u0139\5F$\2\u0139\u013a\7\23\2\2\u013a\u013b\7\66\2\2\u013b\61\3\2\2"+
		"\2\u013c\u013d\7&\2\2\u013d\u013e\7\22\2\2\u013e\u013f\7\67\2\2\u013f"+
		"\u0140\7\65\2\2\u0140\u0141\5F$\2\u0141\u0142\7\65\2\2\u0142\u0143\5F"+
		"$\2\u0143\u0144\7\65\2\2\u0144\u0145\5F$\2\u0145\u0146\7\65\2\2\u0146"+
		"\u0147\5F$\2\u0147\u0148\7\65\2\2\u0148\u0149\5F$\2\u0149\u014a\7\65\2"+
		"\2\u014a\u014b\5F$\2\u014b\u014c\7\65\2\2\u014c\u014d\5F$\2\u014d\u014e"+
		"\7\65\2\2\u014e\u014f\7\67\2\2\u014f\u0150\7\23\2\2\u0150\u0151\7\66\2"+
		"\2\u0151\63\3\2\2\2\u0152\u0153\7\'\2\2\u0153\u0154\7\22\2\2\u0154\u0155"+
		"\7\67\2\2\u0155\u0156\7\65\2\2\u0156\u0157\5F$\2\u0157\u0158\7\65\2\2"+
		"\u0158\u0159\5F$\2\u0159\u015a\7\65\2\2\u015a\u015b\5F$\2\u015b\u015c"+
		"\7\65\2\2\u015c\u015d\5F$\2\u015d\u015e\7\65\2\2\u015e\u015f\5F$\2\u015f"+
		"\u0160\7\65\2\2\u0160\u0161\5F$\2\u0161\u0162\7\65\2\2\u0162\u0163\5F"+
		"$\2\u0163\u0164\7\65\2\2\u0164\u0165\7\67\2\2\u0165\u0166\7\65\2\2\u0166"+
		"\u0167\5F$\2\u0167\u0168\7\23\2\2\u0168\u0169\7\66\2\2\u0169\65\3\2\2"+
		"\2\u016a\u016b\7(\2\2\u016b\u016c\7\22\2\2\u016c\u016d\7\67\2\2\u016d"+
		"\u016e\7\65\2\2\u016e\u016f\5F$\2\u016f\u0170\7\65\2\2\u0170\u0171\5F"+
		"$\2\u0171\u0172\7\65\2\2\u0172\u0173\5F$\2\u0173\u0174\7\65\2\2\u0174"+
		"\u0175\5F$\2\u0175\u0176\7\23\2\2\u0176\u0177\7\66\2\2\u0177\67\3\2\2"+
		"\2\u0178\u0179\7)\2\2\u0179\u017a\7\22\2\2\u017a\u017b\7\67\2\2\u017b"+
		"\u017c\7\65\2\2\u017c\u017d\5F$\2\u017d\u017e\7\65\2\2\u017e\u017f\5F"+
		"$\2\u017f\u0180\7\65\2\2\u0180\u0181\5F$\2\u0181\u0182\7\65\2\2\u0182"+
		"\u0183\5F$\2\u0183\u0184\7\65\2\2\u0184\u0185\5F$\2\u0185\u0186\7\65\2"+
		"\2\u0186\u0187\5F$\2\u0187\u0188\7\65\2\2\u0188\u0189\5F$\2\u0189\u018a"+
		"\7\65\2\2\u018a\u018b\7\67\2\2\u018b\u018c\7\65\2\2\u018c\u018d\5F$\2"+
		"\u018d\u018e\7\23\2\2\u018e\u018f\7\66\2\2\u018f9\3\2\2\2\u0190\u0191"+
		"\7*\2\2\u0191\u0192\7\22\2\2\u0192\u0193\7\67\2\2\u0193\u0194\7\65\2\2"+
		"\u0194\u0195\5F$\2\u0195\u0196\7\65\2\2\u0196\u0197\5F$\2\u0197\u0198"+
		"\7\65\2\2\u0198\u0199\5F$\2\u0199\u019a\7\65\2\2\u019a\u019b\5F$\2\u019b"+
		"\u019c\7\65\2\2\u019c\u019d\5F$\2\u019d\u019e\7\65\2\2\u019e\u019f\5F"+
		"$\2\u019f\u01a0\7\65\2\2\u01a0\u01a1\5F$\2\u01a1\u01a2\7\65\2\2\u01a2"+
		"\u01a3\7\67\2\2\u01a3\u01a4\7\65\2\2\u01a4\u01a5\5F$\2\u01a5\u01a6\7\23"+
		"\2\2\u01a6\u01a7\7\66\2\2\u01a7;\3\2\2\2\u01a8\u01a9\7+\2\2\u01a9\u01aa"+
		"\7\22\2\2\u01aa\u01ab\7\67\2\2\u01ab\u01ac\7\65\2\2\u01ac\u01ad\5F$\2"+
		"\u01ad\u01ae\7\65\2\2\u01ae\u01af\5F$\2\u01af\u01b0\7\65\2\2\u01b0\u01b1"+
		"\5F$\2\u01b1\u01b2\7\65\2\2\u01b2\u01b3\5F$\2\u01b3\u01b4\7\65\2\2\u01b4"+
		"\u01b5\5F$\2\u01b5\u01b6\7\65\2\2\u01b6\u01b7\5F$\2\u01b7\u01b8\7\65\2"+
		"\2\u01b8\u01b9\5F$\2\u01b9\u01ba\7\65\2\2\u01ba\u01bb\7\67\2\2\u01bb\u01bc"+
		"\7\65\2\2\u01bc\u01bd\5F$\2\u01bd\u01be\7\23\2\2\u01be\u01bf\7\66\2\2"+
		"\u01bf=\3\2\2\2\u01c0\u01c1\7,\2\2\u01c1\u01c2\7\22\2\2\u01c2\u01c3\7"+
		"\67\2\2\u01c3\u01c4\7\23\2\2\u01c4\u01c5\7\66\2\2\u01c5?\3\2\2\2\u01c6"+
		"\u01c7\7.\2\2\u01c7\u01c8\7\22\2\2\u01c8\u01c9\7\67\2\2\u01c9\u01ca\7"+
		"\65\2\2\u01ca\u01cb\5F$\2\u01cb\u01cc\7\23\2\2\u01cc\u01cd\7\66\2\2\u01cd"+
		"A\3\2\2\2\u01ce\u01cf\7\61\2\2\u01cf\u01d0\7\22\2\2\u01d0\u01d1\7\67\2"+
		"\2\u01d1\u01d2\7\23\2\2\u01d2C\3\2\2\2\u01d3\u01d4\7\62\2\2\u01d4\u01d5"+
		"\7\22\2\2\u01d5\u01d6\7\67\2\2\u01d6\u01d7\7\65\2\2\u01d7\u01d8\5F$\2"+
		"\u01d8\u01d9\7\23\2\2\u01d9\u01da\7\66\2\2\u01daE\3\2\2\2\u01db\u01dc"+
		"\7\4\2\2\u01dc\u01dd\t\2\2\2\u01dd\u01de\7\5\2\2\u01deG\3\2\2\2\biku{"+
		"}\u009f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}