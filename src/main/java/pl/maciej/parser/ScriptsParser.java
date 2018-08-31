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
		NAZWA=44, WORKFORCE=45, MH=46, ROUND=47, EXISTSVARIABLE=48, SETDIMENSION=49, 
		NUMBER=50, DECIMAL=51, COMMA=52, SEMICOLON=53, ID=54, VAR=55, WS=56, COMMENT=57;
	public static final int
		RULE_compilationUnit = 0, RULE_ifrule = 1, RULE_opcja = 2, RULE_setOpcja = 3, 
		RULE_scriptLink = 4, RULE_vardecl = 5, RULE_vardeclaration = 6, RULE_variable = 7, 
		RULE_color = 8, RULE_colour = 9, RULE_innercolor = 10, RULE_outercolor = 11, 
		RULE_cpiece = 12, RULE_cpiecexu = 13, RULE_seterror = 14, RULE_setnumeric = 15, 
		RULE_getnumeric = 16, RULE_piecex = 17, RULE_piece = 18, RULE_surface = 19, 
		RULE_csurface = 20, RULE_surfacex = 21, RULE_surfacexu = 22, RULE_crod = 23, 
		RULE_crodx = 24, RULE_crodxu = 25, RULE_rod = 26, RULE_rodx = 27, RULE_cinrod = 28, 
		RULE_coutrod = 29, RULE_message = 30, RULE_workforce = 31, RULE_existVar = 32, 
		RULE_setdimension = 33, RULE_arg = 34, RULE_nazwa = 35;
	public static final String[] ruleNames = {
		"compilationUnit", "ifrule", "opcja", "setOpcja", "scriptLink", "vardecl", 
		"vardeclaration", "variable", "color", "colour", "innercolor", "outercolor", 
		"cpiece", "cpiecexu", "seterror", "setnumeric", "getnumeric", "piecex", 
		"piece", "surface", "csurface", "surfacex", "surfacexu", "crod", "crodx", 
		"crodxu", "rod", "rodx", "cinrod", "coutrod", "message", "workforce", 
		"existVar", "setdimension", "arg", "nazwa"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'IF'", "'['", "']'", "'THEN'", "'ENDIF'", "'OR'", "'AND'", "'='", 
		"'FALSE'", "'TRUE'", "'SETOPTION'", "'+'", "'-'", "'*'", "'/'", "'('", 
		"')'", "'OPTION'", "'CPIECE'", "'CPIECE_EX_U'", "'SETERROR'", "'LET'", 
		"'COLOUR'", "'COLOR'", "'SETNUMERICOPTION'", "'GETNUMERICOPTION'", "'PIECE_EX_U'", 
		"'PIECE'", "'SURFACE'", "'CSURFACE'", "'SURFACE_EX'", "'SURFACE_EX_U'", 
		"'OUTERCOLOUR'", "'INNERCOLOUR'", "'CROD'", "'CROD_EX'", "'CROD_EX_U'", 
		"'ROD'", "'ROD_EX_U'", "'CINNROD_EX_U'", "'COUTROD_EX_U'", "'MESSAGE'", 
		"'SCRIPT'", "'NAZWA'", "'WORKFORCE'", "'MH'", "'ROUND'", "'EXISTSVARIABLE'", 
		"'SETDIMENSION'", null, null, "','", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "LBRACKET", "RBRACKET", "THEN", "ENDIF", "OR", "AND", "EQUALS", 
		"FASLE", "TRUE", "SETOPTION", "PLUS", "MINUS", "ASTERISK", "DIVISION", 
		"LEFT", "RIGHT", "OPTION", "CPIECE", "CPIECE_EX_U", "SETERROR", "LET", 
		"COLOUR", "COLOR", "SETNUMERICOPTION", "GETNUMERICOPTION", "PIECE_EX_U", 
		"PIECE", "SURFACE", "CSURFACE", "SURFACE_EX", "SURFACE_EX_U", "OUTERCOLOUR", 
		"INNERCOLOUR", "CROD", "CROD_EX", "CROD_EX_U", "ROD", "ROD_EX_U", "CINNROD_EX_U", 
		"COUTROD_EX_U", "MESSAGE", "SCRIPT", "NAZWA", "WORKFORCE", "MH", "ROUND", 
		"EXISTSVARIABLE", "SETDIMENSION", "NUMBER", "DECIMAL", "COMMA", "SEMICOLON", 
		"ID", "VAR", "WS", "COMMENT"
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
		public List<NazwaContext> nazwa() {
			return getRuleContexts(NazwaContext.class);
		}
		public NazwaContext nazwa(int i) {
			return getRuleContext(NazwaContext.class,i);
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
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << SETOPTION) | (1L << OPTION) | (1L << CPIECE) | (1L << CPIECE_EX_U) | (1L << SETERROR) | (1L << LET) | (1L << COLOUR) | (1L << COLOR) | (1L << SETNUMERICOPTION) | (1L << GETNUMERICOPTION) | (1L << PIECE_EX_U) | (1L << PIECE) | (1L << SURFACE) | (1L << CSURFACE) | (1L << SURFACE_EX) | (1L << SURFACE_EX_U) | (1L << OUTERCOLOUR) | (1L << INNERCOLOUR) | (1L << CROD) | (1L << CROD_EX) | (1L << CROD_EX_U) | (1L << ROD) | (1L << ROD_EX_U) | (1L << CINNROD_EX_U) | (1L << COUTROD_EX_U) | (1L << MESSAGE) | (1L << SCRIPT) | (1L << NAZWA) | (1L << WORKFORCE) | (1L << EXISTSVARIABLE) | (1L << SETDIMENSION))) != 0)) {
				{
				setState(106);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPTION:
					{
					setState(72);
					opcja();
					}
					break;
				case SETOPTION:
					{
					setState(73);
					setOpcja();
					}
					break;
				case IF:
					{
					setState(74);
					ifrule();
					}
					break;
				case SCRIPT:
					{
					setState(75);
					scriptLink();
					}
					break;
				case CPIECE:
					{
					setState(76);
					cpiece();
					}
					break;
				case CPIECE_EX_U:
					{
					setState(77);
					cpiecexu();
					}
					break;
				case SETERROR:
					{
					setState(78);
					seterror();
					}
					break;
				case SETNUMERICOPTION:
					{
					setState(79);
					setnumeric();
					}
					break;
				case GETNUMERICOPTION:
					{
					setState(80);
					getnumeric();
					setState(81);
					match(SEMICOLON);
					}
					break;
				case PIECE_EX_U:
					{
					setState(83);
					piecex();
					}
					break;
				case PIECE:
					{
					setState(84);
					piece();
					}
					break;
				case SURFACE:
					{
					setState(85);
					surface();
					}
					break;
				case CSURFACE:
					{
					setState(86);
					csurface();
					}
					break;
				case SURFACE_EX:
					{
					setState(87);
					surfacex();
					}
					break;
				case SURFACE_EX_U:
					{
					setState(88);
					surfacexu();
					}
					break;
				case INNERCOLOUR:
					{
					setState(89);
					innercolor();
					}
					break;
				case OUTERCOLOUR:
					{
					setState(90);
					outercolor();
					}
					break;
				case COLOR:
					{
					setState(91);
					color();
					}
					break;
				case COLOUR:
					{
					setState(92);
					colour();
					}
					break;
				case LET:
					{
					setState(93);
					vardecl();
					}
					break;
				case CROD:
					{
					setState(94);
					crod();
					}
					break;
				case CROD_EX:
					{
					setState(95);
					crodx();
					}
					break;
				case CROD_EX_U:
					{
					setState(96);
					crodxu();
					}
					break;
				case ROD:
					{
					setState(97);
					rod();
					}
					break;
				case ROD_EX_U:
					{
					setState(98);
					rodx();
					}
					break;
				case CINNROD_EX_U:
					{
					setState(99);
					cinrod();
					}
					break;
				case COUTROD_EX_U:
					{
					setState(100);
					coutrod();
					}
					break;
				case MESSAGE:
					{
					setState(101);
					message();
					}
					break;
				case WORKFORCE:
					{
					setState(102);
					workforce();
					}
					break;
				case EXISTSVARIABLE:
					{
					setState(103);
					existVar();
					}
					break;
				case SETDIMENSION:
					{
					setState(104);
					setdimension();
					}
					break;
				case NAZWA:
					{
					setState(105);
					nazwa();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
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
			setState(113);
			match(IF);
			setState(114);
			match(LBRACKET);
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPTION:
				{
				setState(115);
				opcja();
				}
				break;
			case VAR:
				{
				setState(116);
				variable();
				}
				break;
			case EXISTSVARIABLE:
				{
				setState(117);
				existVar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(120);
			match(RBRACKET);
			setState(121);
			match(THEN);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF || _la==SETOPTION) {
				{
				setState(124);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SETOPTION:
					{
					setState(122);
					setOpcja();
					}
					break;
				case IF:
					{
					setState(123);
					ifrule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
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
			setState(131);
			match(OPTION);
			setState(132);
			match(LEFT);
			setState(133);
			match(ID);
			setState(134);
			match(COMMA);
			setState(135);
			match(ID);
			setState(136);
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
			setState(138);
			match(SETOPTION);
			setState(139);
			match(LEFT);
			setState(140);
			match(ID);
			setState(141);
			match(COMMA);
			setState(142);
			match(ID);
			setState(143);
			match(RIGHT);
			setState(144);
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
			setState(146);
			match(SCRIPT);
			setState(147);
			match(LEFT);
			setState(148);
			match(ID);
			setState(149);
			match(COMMA);
			setState(150);
			match(ID);
			setState(151);
			match(RIGHT);
			setState(152);
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
			setState(154);
			vardeclaration();
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GETNUMERICOPTION:
				{
				setState(155);
				getnumeric();
				}
				break;
			case LBRACKET:
				{
				setState(156);
				match(LBRACKET);
				setState(157);
				getnumeric();
				setState(158);
				match(RBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(162);
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
			setState(164);
			match(LET);
			setState(165);
			match(VAR);
			setState(166);
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
			setState(168);
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
			setState(170);
			match(COLOR);
			setState(171);
			match(LEFT);
			setState(172);
			match(ID);
			setState(173);
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
			setState(175);
			match(COLOUR);
			setState(176);
			match(LEFT);
			setState(177);
			match(ID);
			setState(178);
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
			setState(180);
			match(INNERCOLOUR);
			setState(181);
			match(LEFT);
			setState(182);
			match(ID);
			setState(183);
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
			setState(185);
			match(OUTERCOLOUR);
			setState(186);
			match(LEFT);
			setState(187);
			match(ID);
			setState(188);
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
			setState(190);
			match(CPIECE);
			setState(191);
			match(LEFT);
			setState(192);
			match(ID);
			setState(193);
			match(COMMA);
			setState(194);
			arg();
			setState(195);
			match(RIGHT);
			setState(196);
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
			setState(198);
			match(CPIECE_EX_U);
			setState(199);
			match(LEFT);
			setState(200);
			match(ID);
			setState(201);
			match(COMMA);
			setState(202);
			arg();
			setState(203);
			match(COMMA);
			setState(204);
			match(ID);
			setState(205);
			match(COMMA);
			setState(206);
			arg();
			setState(207);
			match(RIGHT);
			setState(208);
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
			setState(210);
			match(SETERROR);
			setState(211);
			match(LEFT);
			setState(212);
			arg();
			setState(213);
			match(RIGHT);
			setState(214);
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
			setState(216);
			match(SETNUMERICOPTION);
			setState(217);
			match(LEFT);
			setState(218);
			match(ID);
			setState(219);
			match(COMMA);
			setState(220);
			arg();
			setState(221);
			match(RIGHT);
			setState(222);
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
			setState(224);
			match(GETNUMERICOPTION);
			setState(225);
			match(LEFT);
			setState(226);
			match(ID);
			setState(227);
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
			setState(229);
			match(PIECE_EX_U);
			setState(230);
			match(LEFT);
			setState(231);
			match(ID);
			setState(232);
			match(COMMA);
			setState(233);
			arg();
			setState(234);
			match(COMMA);
			setState(235);
			match(ID);
			setState(236);
			match(COMMA);
			setState(237);
			arg();
			setState(238);
			match(RIGHT);
			setState(239);
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
			setState(241);
			match(PIECE);
			setState(242);
			match(LEFT);
			setState(243);
			match(ID);
			setState(244);
			match(COMMA);
			setState(245);
			arg();
			setState(246);
			match(RIGHT);
			setState(247);
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
			setState(249);
			match(SURFACE);
			setState(250);
			match(LEFT);
			setState(251);
			match(ID);
			setState(252);
			match(COMMA);
			setState(253);
			arg();
			setState(254);
			match(COMMA);
			setState(255);
			arg();
			setState(256);
			match(COMMA);
			setState(257);
			arg();
			setState(258);
			match(RIGHT);
			setState(259);
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
			setState(261);
			match(CSURFACE);
			setState(262);
			match(LEFT);
			setState(263);
			match(ID);
			setState(264);
			match(COMMA);
			setState(265);
			arg();
			setState(266);
			match(COMMA);
			setState(267);
			arg();
			setState(268);
			match(COMMA);
			setState(269);
			arg();
			setState(270);
			match(RIGHT);
			setState(271);
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
			setState(273);
			match(SURFACE_EX);
			setState(274);
			match(LEFT);
			setState(275);
			match(ID);
			setState(276);
			match(COMMA);
			setState(277);
			arg();
			setState(278);
			match(COMMA);
			setState(279);
			arg();
			setState(280);
			match(COMMA);
			setState(281);
			arg();
			setState(282);
			match(COMMA);
			setState(283);
			match(ID);
			setState(284);
			match(RIGHT);
			setState(285);
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
			setState(287);
			match(SURFACE_EX_U);
			setState(288);
			match(LEFT);
			setState(289);
			match(ID);
			setState(290);
			match(COMMA);
			setState(291);
			arg();
			setState(292);
			match(COMMA);
			setState(293);
			arg();
			setState(294);
			match(COMMA);
			setState(295);
			arg();
			setState(296);
			match(COMMA);
			setState(297);
			match(ID);
			setState(298);
			match(COMMA);
			setState(299);
			arg();
			setState(300);
			match(RIGHT);
			setState(301);
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
			setState(303);
			match(CROD);
			setState(304);
			match(LEFT);
			setState(305);
			match(ID);
			setState(306);
			match(COMMA);
			setState(307);
			arg();
			setState(308);
			match(COMMA);
			setState(309);
			arg();
			setState(310);
			match(COMMA);
			setState(311);
			arg();
			setState(312);
			match(COMMA);
			setState(313);
			arg();
			setState(314);
			match(RIGHT);
			setState(315);
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
			setState(317);
			match(CROD_EX);
			setState(318);
			match(LEFT);
			setState(319);
			match(ID);
			setState(320);
			match(COMMA);
			setState(321);
			arg();
			setState(322);
			match(COMMA);
			setState(323);
			arg();
			setState(324);
			match(COMMA);
			setState(325);
			arg();
			setState(326);
			match(COMMA);
			setState(327);
			arg();
			setState(328);
			match(COMMA);
			setState(329);
			arg();
			setState(330);
			match(COMMA);
			setState(331);
			arg();
			setState(332);
			match(COMMA);
			setState(333);
			arg();
			setState(334);
			match(COMMA);
			setState(335);
			match(ID);
			setState(336);
			match(RIGHT);
			setState(337);
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
			setState(339);
			match(CROD_EX_U);
			setState(340);
			match(LEFT);
			setState(341);
			match(ID);
			setState(342);
			match(COMMA);
			setState(343);
			arg();
			setState(344);
			match(COMMA);
			setState(345);
			arg();
			setState(346);
			match(COMMA);
			setState(347);
			arg();
			setState(348);
			match(COMMA);
			setState(349);
			arg();
			setState(350);
			match(COMMA);
			setState(351);
			arg();
			setState(352);
			match(COMMA);
			setState(353);
			arg();
			setState(354);
			match(COMMA);
			setState(355);
			arg();
			setState(356);
			match(COMMA);
			setState(357);
			match(ID);
			setState(358);
			match(COMMA);
			setState(359);
			arg();
			setState(360);
			match(RIGHT);
			setState(361);
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
			setState(363);
			match(ROD);
			setState(364);
			match(LEFT);
			setState(365);
			match(ID);
			setState(366);
			match(COMMA);
			setState(367);
			arg();
			setState(368);
			match(COMMA);
			setState(369);
			arg();
			setState(370);
			match(COMMA);
			setState(371);
			arg();
			setState(372);
			match(COMMA);
			setState(373);
			arg();
			setState(374);
			match(RIGHT);
			setState(375);
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
			setState(377);
			match(ROD_EX_U);
			setState(378);
			match(LEFT);
			setState(379);
			match(ID);
			setState(380);
			match(COMMA);
			setState(381);
			arg();
			setState(382);
			match(COMMA);
			setState(383);
			arg();
			setState(384);
			match(COMMA);
			setState(385);
			arg();
			setState(386);
			match(COMMA);
			setState(387);
			arg();
			setState(388);
			match(COMMA);
			setState(389);
			arg();
			setState(390);
			match(COMMA);
			setState(391);
			arg();
			setState(392);
			match(COMMA);
			setState(393);
			arg();
			setState(394);
			match(COMMA);
			setState(395);
			match(ID);
			setState(396);
			match(COMMA);
			setState(397);
			arg();
			setState(398);
			match(RIGHT);
			setState(399);
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
			setState(401);
			match(CINNROD_EX_U);
			setState(402);
			match(LEFT);
			setState(403);
			match(ID);
			setState(404);
			match(COMMA);
			setState(405);
			arg();
			setState(406);
			match(COMMA);
			setState(407);
			arg();
			setState(408);
			match(COMMA);
			setState(409);
			arg();
			setState(410);
			match(COMMA);
			setState(411);
			arg();
			setState(412);
			match(COMMA);
			setState(413);
			arg();
			setState(414);
			match(COMMA);
			setState(415);
			arg();
			setState(416);
			match(COMMA);
			setState(417);
			arg();
			setState(418);
			match(COMMA);
			setState(419);
			match(ID);
			setState(420);
			match(COMMA);
			setState(421);
			arg();
			setState(422);
			match(RIGHT);
			setState(423);
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
			setState(425);
			match(COUTROD_EX_U);
			setState(426);
			match(LEFT);
			setState(427);
			match(ID);
			setState(428);
			match(COMMA);
			setState(429);
			arg();
			setState(430);
			match(COMMA);
			setState(431);
			arg();
			setState(432);
			match(COMMA);
			setState(433);
			arg();
			setState(434);
			match(COMMA);
			setState(435);
			arg();
			setState(436);
			match(COMMA);
			setState(437);
			arg();
			setState(438);
			match(COMMA);
			setState(439);
			arg();
			setState(440);
			match(COMMA);
			setState(441);
			arg();
			setState(442);
			match(COMMA);
			setState(443);
			match(ID);
			setState(444);
			match(COMMA);
			setState(445);
			arg();
			setState(446);
			match(RIGHT);
			setState(447);
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
			setState(449);
			match(MESSAGE);
			setState(450);
			match(LEFT);
			setState(451);
			match(ID);
			setState(452);
			match(RIGHT);
			setState(453);
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
			setState(455);
			match(WORKFORCE);
			setState(456);
			match(LEFT);
			setState(457);
			match(ID);
			setState(458);
			match(COMMA);
			setState(459);
			arg();
			setState(460);
			match(RIGHT);
			setState(461);
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
			setState(463);
			match(EXISTSVARIABLE);
			setState(464);
			match(LEFT);
			setState(465);
			match(ID);
			setState(466);
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
			setState(468);
			match(SETDIMENSION);
			setState(469);
			match(LEFT);
			setState(470);
			match(ID);
			setState(471);
			match(COMMA);
			setState(472);
			arg();
			setState(473);
			match(RIGHT);
			setState(474);
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
			setState(476);
			match(LBRACKET);
			setState(477);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << DECIMAL) | (1L << VAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(478);
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

	public static class NazwaContext extends ParserRuleContext {
		public TerminalNode NAZWA() { return getToken(ScriptsParser.NAZWA, 0); }
		public TerminalNode LEFT() { return getToken(ScriptsParser.LEFT, 0); }
		public TerminalNode ID() { return getToken(ScriptsParser.ID, 0); }
		public TerminalNode RIGHT() { return getToken(ScriptsParser.RIGHT, 0); }
		public NazwaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nazwa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).enterNazwa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptsListener ) ((ScriptsListener)listener).exitNazwa(this);
		}
	}

	public final NazwaContext nazwa() throws RecognitionException {
		NazwaContext _localctx = new NazwaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_nazwa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(NAZWA);
			setState(481);
			match(LEFT);
			setState(482);
			match(ID);
			setState(483);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u01e8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2m\n\2\f\2\16\2p\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\5\3y\n\3\3\3\3\3\3\3\3\3\7\3\177\n\3\f\3\16\3\u0082\13\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a3\n\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\2\2&\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\3\4\2\64\65"+
		"99\2\u01e8\2n\3\2\2\2\4s\3\2\2\2\6\u0085\3\2\2\2\b\u008c\3\2\2\2\n\u0094"+
		"\3\2\2\2\f\u009c\3\2\2\2\16\u00a6\3\2\2\2\20\u00aa\3\2\2\2\22\u00ac\3"+
		"\2\2\2\24\u00b1\3\2\2\2\26\u00b6\3\2\2\2\30\u00bb\3\2\2\2\32\u00c0\3\2"+
		"\2\2\34\u00c8\3\2\2\2\36\u00d4\3\2\2\2 \u00da\3\2\2\2\"\u00e2\3\2\2\2"+
		"$\u00e7\3\2\2\2&\u00f3\3\2\2\2(\u00fb\3\2\2\2*\u0107\3\2\2\2,\u0113\3"+
		"\2\2\2.\u0121\3\2\2\2\60\u0131\3\2\2\2\62\u013f\3\2\2\2\64\u0155\3\2\2"+
		"\2\66\u016d\3\2\2\28\u017b\3\2\2\2:\u0193\3\2\2\2<\u01ab\3\2\2\2>\u01c3"+
		"\3\2\2\2@\u01c9\3\2\2\2B\u01d1\3\2\2\2D\u01d6\3\2\2\2F\u01de\3\2\2\2H"+
		"\u01e2\3\2\2\2Jm\5\6\4\2Km\5\b\5\2Lm\5\4\3\2Mm\5\n\6\2Nm\5\32\16\2Om\5"+
		"\34\17\2Pm\5\36\20\2Qm\5 \21\2RS\5\"\22\2ST\7\67\2\2Tm\3\2\2\2Um\5$\23"+
		"\2Vm\5&\24\2Wm\5(\25\2Xm\5*\26\2Ym\5,\27\2Zm\5.\30\2[m\5\26\f\2\\m\5\30"+
		"\r\2]m\5\22\n\2^m\5\24\13\2_m\5\f\7\2`m\5\60\31\2am\5\62\32\2bm\5\64\33"+
		"\2cm\5\66\34\2dm\58\35\2em\5:\36\2fm\5<\37\2gm\5> \2hm\5@!\2im\5B\"\2"+
		"jm\5D#\2km\5H%\2lJ\3\2\2\2lK\3\2\2\2lL\3\2\2\2lM\3\2\2\2lN\3\2\2\2lO\3"+
		"\2\2\2lP\3\2\2\2lQ\3\2\2\2lR\3\2\2\2lU\3\2\2\2lV\3\2\2\2lW\3\2\2\2lX\3"+
		"\2\2\2lY\3\2\2\2lZ\3\2\2\2l[\3\2\2\2l\\\3\2\2\2l]\3\2\2\2l^\3\2\2\2l_"+
		"\3\2\2\2l`\3\2\2\2la\3\2\2\2lb\3\2\2\2lc\3\2\2\2ld\3\2\2\2le\3\2\2\2l"+
		"f\3\2\2\2lg\3\2\2\2lh\3\2\2\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2mp\3\2\2\2"+
		"nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\2\2\3r\3\3\2\2\2st\7\3\2"+
		"\2tx\7\4\2\2uy\5\6\4\2vy\5\20\t\2wy\5B\"\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2"+
		"\2yz\3\2\2\2z{\7\5\2\2{\u0080\7\6\2\2|\177\5\b\5\2}\177\5\4\3\2~|\3\2"+
		"\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\7\2\2\u0084\5\3\2\2\2"+
		"\u0085\u0086\7\24\2\2\u0086\u0087\7\22\2\2\u0087\u0088\78\2\2\u0088\u0089"+
		"\7\66\2\2\u0089\u008a\78\2\2\u008a\u008b\7\23\2\2\u008b\7\3\2\2\2\u008c"+
		"\u008d\7\r\2\2\u008d\u008e\7\22\2\2\u008e\u008f\78\2\2\u008f\u0090\7\66"+
		"\2\2\u0090\u0091\78\2\2\u0091\u0092\7\23\2\2\u0092\u0093\7\67\2\2\u0093"+
		"\t\3\2\2\2\u0094\u0095\7-\2\2\u0095\u0096\7\22\2\2\u0096\u0097\78\2\2"+
		"\u0097\u0098\7\66\2\2\u0098\u0099\78\2\2\u0099\u009a\7\23\2\2\u009a\u009b"+
		"\7\67\2\2\u009b\13\3\2\2\2\u009c\u00a2\5\16\b\2\u009d\u00a3\5\"\22\2\u009e"+
		"\u009f\7\4\2\2\u009f\u00a0\5\"\22\2\u00a0\u00a1\7\5\2\2\u00a1\u00a3\3"+
		"\2\2\2\u00a2\u009d\3\2\2\2\u00a2\u009e\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a5\7\67\2\2\u00a5\r\3\2\2\2\u00a6\u00a7\7\30\2\2\u00a7\u00a8\79\2"+
		"\2\u00a8\u00a9\7\n\2\2\u00a9\17\3\2\2\2\u00aa\u00ab\79\2\2\u00ab\21\3"+
		"\2\2\2\u00ac\u00ad\7\32\2\2\u00ad\u00ae\7\22\2\2\u00ae\u00af\78\2\2\u00af"+
		"\u00b0\7\23\2\2\u00b0\23\3\2\2\2\u00b1\u00b2\7\31\2\2\u00b2\u00b3\7\22"+
		"\2\2\u00b3\u00b4\78\2\2\u00b4\u00b5\7\23\2\2\u00b5\25\3\2\2\2\u00b6\u00b7"+
		"\7$\2\2\u00b7\u00b8\7\22\2\2\u00b8\u00b9\78\2\2\u00b9\u00ba\7\23\2\2\u00ba"+
		"\27\3\2\2\2\u00bb\u00bc\7#\2\2\u00bc\u00bd\7\22\2\2\u00bd\u00be\78\2\2"+
		"\u00be\u00bf\7\23\2\2\u00bf\31\3\2\2\2\u00c0\u00c1\7\25\2\2\u00c1\u00c2"+
		"\7\22\2\2\u00c2\u00c3\78\2\2\u00c3\u00c4\7\66\2\2\u00c4\u00c5\5F$\2\u00c5"+
		"\u00c6\7\23\2\2\u00c6\u00c7\7\67\2\2\u00c7\33\3\2\2\2\u00c8\u00c9\7\26"+
		"\2\2\u00c9\u00ca\7\22\2\2\u00ca\u00cb\78\2\2\u00cb\u00cc\7\66\2\2\u00cc"+
		"\u00cd\5F$\2\u00cd\u00ce\7\66\2\2\u00ce\u00cf\78\2\2\u00cf\u00d0\7\66"+
		"\2\2\u00d0\u00d1\5F$\2\u00d1\u00d2\7\23\2\2\u00d2\u00d3\7\67\2\2\u00d3"+
		"\35\3\2\2\2\u00d4\u00d5\7\27\2\2\u00d5\u00d6\7\22\2\2\u00d6\u00d7\5F$"+
		"\2\u00d7\u00d8\7\23\2\2\u00d8\u00d9\7\67\2\2\u00d9\37\3\2\2\2\u00da\u00db"+
		"\7\33\2\2\u00db\u00dc\7\22\2\2\u00dc\u00dd\78\2\2\u00dd\u00de\7\66\2\2"+
		"\u00de\u00df\5F$\2\u00df\u00e0\7\23\2\2\u00e0\u00e1\7\67\2\2\u00e1!\3"+
		"\2\2\2\u00e2\u00e3\7\34\2\2\u00e3\u00e4\7\22\2\2\u00e4\u00e5\78\2\2\u00e5"+
		"\u00e6\7\23\2\2\u00e6#\3\2\2\2\u00e7\u00e8\7\35\2\2\u00e8\u00e9\7\22\2"+
		"\2\u00e9\u00ea\78\2\2\u00ea\u00eb\7\66\2\2\u00eb\u00ec\5F$\2\u00ec\u00ed"+
		"\7\66\2\2\u00ed\u00ee\78\2\2\u00ee\u00ef\7\66\2\2\u00ef\u00f0\5F$\2\u00f0"+
		"\u00f1\7\23\2\2\u00f1\u00f2\7\67\2\2\u00f2%\3\2\2\2\u00f3\u00f4\7\36\2"+
		"\2\u00f4\u00f5\7\22\2\2\u00f5\u00f6\78\2\2\u00f6\u00f7\7\66\2\2\u00f7"+
		"\u00f8\5F$\2\u00f8\u00f9\7\23\2\2\u00f9\u00fa\7\67\2\2\u00fa\'\3\2\2\2"+
		"\u00fb\u00fc\7\37\2\2\u00fc\u00fd\7\22\2\2\u00fd\u00fe\78\2\2\u00fe\u00ff"+
		"\7\66\2\2\u00ff\u0100\5F$\2\u0100\u0101\7\66\2\2\u0101\u0102\5F$\2\u0102"+
		"\u0103\7\66\2\2\u0103\u0104\5F$\2\u0104\u0105\7\23\2\2\u0105\u0106\7\67"+
		"\2\2\u0106)\3\2\2\2\u0107\u0108\7 \2\2\u0108\u0109\7\22\2\2\u0109\u010a"+
		"\78\2\2\u010a\u010b\7\66\2\2\u010b\u010c\5F$\2\u010c\u010d\7\66\2\2\u010d"+
		"\u010e\5F$\2\u010e\u010f\7\66\2\2\u010f\u0110\5F$\2\u0110\u0111\7\23\2"+
		"\2\u0111\u0112\7\67\2\2\u0112+\3\2\2\2\u0113\u0114\7!\2\2\u0114\u0115"+
		"\7\22\2\2\u0115\u0116\78\2\2\u0116\u0117\7\66\2\2\u0117\u0118\5F$\2\u0118"+
		"\u0119\7\66\2\2\u0119\u011a\5F$\2\u011a\u011b\7\66\2\2\u011b\u011c\5F"+
		"$\2\u011c\u011d\7\66\2\2\u011d\u011e\78\2\2\u011e\u011f\7\23\2\2\u011f"+
		"\u0120\7\67\2\2\u0120-\3\2\2\2\u0121\u0122\7\"\2\2\u0122\u0123\7\22\2"+
		"\2\u0123\u0124\78\2\2\u0124\u0125\7\66\2\2\u0125\u0126\5F$\2\u0126\u0127"+
		"\7\66\2\2\u0127\u0128\5F$\2\u0128\u0129\7\66\2\2\u0129\u012a\5F$\2\u012a"+
		"\u012b\7\66\2\2\u012b\u012c\78\2\2\u012c\u012d\7\66\2\2\u012d\u012e\5"+
		"F$\2\u012e\u012f\7\23\2\2\u012f\u0130\7\67\2\2\u0130/\3\2\2\2\u0131\u0132"+
		"\7%\2\2\u0132\u0133\7\22\2\2\u0133\u0134\78\2\2\u0134\u0135\7\66\2\2\u0135"+
		"\u0136\5F$\2\u0136\u0137\7\66\2\2\u0137\u0138\5F$\2\u0138\u0139\7\66\2"+
		"\2\u0139\u013a\5F$\2\u013a\u013b\7\66\2\2\u013b\u013c\5F$\2\u013c\u013d"+
		"\7\23\2\2\u013d\u013e\7\67\2\2\u013e\61\3\2\2\2\u013f\u0140\7&\2\2\u0140"+
		"\u0141\7\22\2\2\u0141\u0142\78\2\2\u0142\u0143\7\66\2\2\u0143\u0144\5"+
		"F$\2\u0144\u0145\7\66\2\2\u0145\u0146\5F$\2\u0146\u0147\7\66\2\2\u0147"+
		"\u0148\5F$\2\u0148\u0149\7\66\2\2\u0149\u014a\5F$\2\u014a\u014b\7\66\2"+
		"\2\u014b\u014c\5F$\2\u014c\u014d\7\66\2\2\u014d\u014e\5F$\2\u014e\u014f"+
		"\7\66\2\2\u014f\u0150\5F$\2\u0150\u0151\7\66\2\2\u0151\u0152\78\2\2\u0152"+
		"\u0153\7\23\2\2\u0153\u0154\7\67\2\2\u0154\63\3\2\2\2\u0155\u0156\7\'"+
		"\2\2\u0156\u0157\7\22\2\2\u0157\u0158\78\2\2\u0158\u0159\7\66\2\2\u0159"+
		"\u015a\5F$\2\u015a\u015b\7\66\2\2\u015b\u015c\5F$\2\u015c\u015d\7\66\2"+
		"\2\u015d\u015e\5F$\2\u015e\u015f\7\66\2\2\u015f\u0160\5F$\2\u0160\u0161"+
		"\7\66\2\2\u0161\u0162\5F$\2\u0162\u0163\7\66\2\2\u0163\u0164\5F$\2\u0164"+
		"\u0165\7\66\2\2\u0165\u0166\5F$\2\u0166\u0167\7\66\2\2\u0167\u0168\78"+
		"\2\2\u0168\u0169\7\66\2\2\u0169\u016a\5F$\2\u016a\u016b\7\23\2\2\u016b"+
		"\u016c\7\67\2\2\u016c\65\3\2\2\2\u016d\u016e\7(\2\2\u016e\u016f\7\22\2"+
		"\2\u016f\u0170\78\2\2\u0170\u0171\7\66\2\2\u0171\u0172\5F$\2\u0172\u0173"+
		"\7\66\2\2\u0173\u0174\5F$\2\u0174\u0175\7\66\2\2\u0175\u0176\5F$\2\u0176"+
		"\u0177\7\66\2\2\u0177\u0178\5F$\2\u0178\u0179\7\23\2\2\u0179\u017a\7\67"+
		"\2\2\u017a\67\3\2\2\2\u017b\u017c\7)\2\2\u017c\u017d\7\22\2\2\u017d\u017e"+
		"\78\2\2\u017e\u017f\7\66\2\2\u017f\u0180\5F$\2\u0180\u0181\7\66\2\2\u0181"+
		"\u0182\5F$\2\u0182\u0183\7\66\2\2\u0183\u0184\5F$\2\u0184\u0185\7\66\2"+
		"\2\u0185\u0186\5F$\2\u0186\u0187\7\66\2\2\u0187\u0188\5F$\2\u0188\u0189"+
		"\7\66\2\2\u0189\u018a\5F$\2\u018a\u018b\7\66\2\2\u018b\u018c\5F$\2\u018c"+
		"\u018d\7\66\2\2\u018d\u018e\78\2\2\u018e\u018f\7\66\2\2\u018f\u0190\5"+
		"F$\2\u0190\u0191\7\23\2\2\u0191\u0192\7\67\2\2\u01929\3\2\2\2\u0193\u0194"+
		"\7*\2\2\u0194\u0195\7\22\2\2\u0195\u0196\78\2\2\u0196\u0197\7\66\2\2\u0197"+
		"\u0198\5F$\2\u0198\u0199\7\66\2\2\u0199\u019a\5F$\2\u019a\u019b\7\66\2"+
		"\2\u019b\u019c\5F$\2\u019c\u019d\7\66\2\2\u019d\u019e\5F$\2\u019e\u019f"+
		"\7\66\2\2\u019f\u01a0\5F$\2\u01a0\u01a1\7\66\2\2\u01a1\u01a2\5F$\2\u01a2"+
		"\u01a3\7\66\2\2\u01a3\u01a4\5F$\2\u01a4\u01a5\7\66\2\2\u01a5\u01a6\78"+
		"\2\2\u01a6\u01a7\7\66\2\2\u01a7\u01a8\5F$\2\u01a8\u01a9\7\23\2\2\u01a9"+
		"\u01aa\7\67\2\2\u01aa;\3\2\2\2\u01ab\u01ac\7+\2\2\u01ac\u01ad\7\22\2\2"+
		"\u01ad\u01ae\78\2\2\u01ae\u01af\7\66\2\2\u01af\u01b0\5F$\2\u01b0\u01b1"+
		"\7\66\2\2\u01b1\u01b2\5F$\2\u01b2\u01b3\7\66\2\2\u01b3\u01b4\5F$\2\u01b4"+
		"\u01b5\7\66\2\2\u01b5\u01b6\5F$\2\u01b6\u01b7\7\66\2\2\u01b7\u01b8\5F"+
		"$\2\u01b8\u01b9\7\66\2\2\u01b9\u01ba\5F$\2\u01ba\u01bb\7\66\2\2\u01bb"+
		"\u01bc\5F$\2\u01bc\u01bd\7\66\2\2\u01bd\u01be\78\2\2\u01be\u01bf\7\66"+
		"\2\2\u01bf\u01c0\5F$\2\u01c0\u01c1\7\23\2\2\u01c1\u01c2\7\67\2\2\u01c2"+
		"=\3\2\2\2\u01c3\u01c4\7,\2\2\u01c4\u01c5\7\22\2\2\u01c5\u01c6\78\2\2\u01c6"+
		"\u01c7\7\23\2\2\u01c7\u01c8\7\67\2\2\u01c8?\3\2\2\2\u01c9\u01ca\7/\2\2"+
		"\u01ca\u01cb\7\22\2\2\u01cb\u01cc\78\2\2\u01cc\u01cd\7\66\2\2\u01cd\u01ce"+
		"\5F$\2\u01ce\u01cf\7\23\2\2\u01cf\u01d0\7\67\2\2\u01d0A\3\2\2\2\u01d1"+
		"\u01d2\7\62\2\2\u01d2\u01d3\7\22\2\2\u01d3\u01d4\78\2\2\u01d4\u01d5\7"+
		"\23\2\2\u01d5C\3\2\2\2\u01d6\u01d7\7\63\2\2\u01d7\u01d8\7\22\2\2\u01d8"+
		"\u01d9\78\2\2\u01d9\u01da\7\66\2\2\u01da\u01db\5F$\2\u01db\u01dc\7\23"+
		"\2\2\u01dc\u01dd\7\67\2\2\u01ddE\3\2\2\2\u01de\u01df\7\4\2\2\u01df\u01e0"+
		"\t\2\2\2\u01e0\u01e1\7\5\2\2\u01e1G\3\2\2\2\u01e2\u01e3\7.\2\2\u01e3\u01e4"+
		"\7\22\2\2\u01e4\u01e5\78\2\2\u01e5\u01e6\7\23\2\2\u01e6I\3\2\2\2\blnx"+
		"~\u0080\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}