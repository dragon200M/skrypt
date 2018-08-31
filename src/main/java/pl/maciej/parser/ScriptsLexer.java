// Generated from /home/maciej/IdeaProjects/skrypt/Scripts.g4 by ANTLR 4.7
package pl.maciej.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScriptsLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IF", "LBRACKET", "RBRACKET", "THEN", "ENDIF", "OR", "AND", "EQUALS", 
		"FASLE", "TRUE", "SETOPTION", "PLUS", "MINUS", "ASTERISK", "DIVISION", 
		"LEFT", "RIGHT", "OPTION", "CPIECE", "CPIECE_EX_U", "SETERROR", "LET", 
		"COLOUR", "COLOR", "SETNUMERICOPTION", "GETNUMERICOPTION", "PIECE_EX_U", 
		"PIECE", "SURFACE", "CSURFACE", "SURFACE_EX", "SURFACE_EX_U", "OUTERCOLOUR", 
		"INNERCOLOUR", "CROD", "CROD_EX", "CROD_EX_U", "ROD", "ROD_EX_U", "CINNROD_EX_U", 
		"COUTROD_EX_U", "MESSAGE", "SCRIPT", "NAZWA", "WORKFORCE", "MH", "ROUND", 
		"EXISTSVARIABLE", "SETDIMENSION", "NUMBER", "DECIMAL", "COMMA", "SEMICOLON", 
		"ID", "VAR", "WS", "COMMENT"
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


	public ScriptsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Scripts.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u0219\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\7\63\u01df\n\63\f\63\16\63\u01e2\13\63\5\63\u01e4\n\63\3\64\3\64"+
		"\3\64\7\64\u01e9\n\64\f\64\16\64\u01ec\13\64\3\64\3\64\6\64\u01f0\n\64"+
		"\r\64\16\64\u01f1\5\64\u01f4\n\64\3\65\3\65\3\66\3\66\3\67\3\67\7\67\u01fc"+
		"\n\67\f\67\16\67\u01ff\13\67\3\67\3\67\38\68\u0204\n8\r8\168\u0205\39"+
		"\69\u0209\n9\r9\169\u020a\39\39\3:\3:\7:\u0211\n:\f:\16:\u0214\13:\3:"+
		"\3:\3:\3:\4\u01fd\u0212\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9q:s;\3\2\6\3\2\63;\3\2\62;\13\2\62;C\\aac|"+
		"\u00d5\u00d5\u00f5\u00f5\u0106\u0109\u0143\u0144\u017b\u017e\5\2\13\f"+
		"\17\17\"\"\2\u0221\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5x\3\2"+
		"\2\2\7z\3\2\2\2\t|\3\2\2\2\13\u0081\3\2\2\2\r\u0087\3\2\2\2\17\u008a\3"+
		"\2\2\2\21\u008e\3\2\2\2\23\u0090\3\2\2\2\25\u0096\3\2\2\2\27\u009b\3\2"+
		"\2\2\31\u00a5\3\2\2\2\33\u00a7\3\2\2\2\35\u00a9\3\2\2\2\37\u00ab\3\2\2"+
		"\2!\u00ad\3\2\2\2#\u00af\3\2\2\2%\u00b1\3\2\2\2\'\u00b8\3\2\2\2)\u00bf"+
		"\3\2\2\2+\u00cb\3\2\2\2-\u00d4\3\2\2\2/\u00d8\3\2\2\2\61\u00df\3\2\2\2"+
		"\63\u00e5\3\2\2\2\65\u00f6\3\2\2\2\67\u0107\3\2\2\29\u0112\3\2\2\2;\u0118"+
		"\3\2\2\2=\u0120\3\2\2\2?\u0129\3\2\2\2A\u0134\3\2\2\2C\u0141\3\2\2\2E"+
		"\u014d\3\2\2\2G\u0159\3\2\2\2I\u015e\3\2\2\2K\u0166\3\2\2\2M\u0170\3\2"+
		"\2\2O\u0174\3\2\2\2Q\u017d\3\2\2\2S\u018a\3\2\2\2U\u0197\3\2\2\2W\u019f"+
		"\3\2\2\2Y\u01a6\3\2\2\2[\u01ac\3\2\2\2]\u01b6\3\2\2\2_\u01b9\3\2\2\2a"+
		"\u01bf\3\2\2\2c\u01ce\3\2\2\2e\u01e3\3\2\2\2g\u01f3\3\2\2\2i\u01f5\3\2"+
		"\2\2k\u01f7\3\2\2\2m\u01f9\3\2\2\2o\u0203\3\2\2\2q\u0208\3\2\2\2s\u020e"+
		"\3\2\2\2uv\7K\2\2vw\7H\2\2w\4\3\2\2\2xy\7]\2\2y\6\3\2\2\2z{\7_\2\2{\b"+
		"\3\2\2\2|}\7V\2\2}~\7J\2\2~\177\7G\2\2\177\u0080\7P\2\2\u0080\n\3\2\2"+
		"\2\u0081\u0082\7G\2\2\u0082\u0083\7P\2\2\u0083\u0084\7F\2\2\u0084\u0085"+
		"\7K\2\2\u0085\u0086\7H\2\2\u0086\f\3\2\2\2\u0087\u0088\7Q\2\2\u0088\u0089"+
		"\7T\2\2\u0089\16\3\2\2\2\u008a\u008b\7C\2\2\u008b\u008c\7P\2\2\u008c\u008d"+
		"\7F\2\2\u008d\20\3\2\2\2\u008e\u008f\7?\2\2\u008f\22\3\2\2\2\u0090\u0091"+
		"\7H\2\2\u0091\u0092\7C\2\2\u0092\u0093\7N\2\2\u0093\u0094\7U\2\2\u0094"+
		"\u0095\7G\2\2\u0095\24\3\2\2\2\u0096\u0097\7V\2\2\u0097\u0098\7T\2\2\u0098"+
		"\u0099\7W\2\2\u0099\u009a\7G\2\2\u009a\26\3\2\2\2\u009b\u009c\7U\2\2\u009c"+
		"\u009d\7G\2\2\u009d\u009e\7V\2\2\u009e\u009f\7Q\2\2\u009f\u00a0\7R\2\2"+
		"\u00a0\u00a1\7V\2\2\u00a1\u00a2\7K\2\2\u00a2\u00a3\7Q\2\2\u00a3\u00a4"+
		"\7P\2\2\u00a4\30\3\2\2\2\u00a5\u00a6\7-\2\2\u00a6\32\3\2\2\2\u00a7\u00a8"+
		"\7/\2\2\u00a8\34\3\2\2\2\u00a9\u00aa\7,\2\2\u00aa\36\3\2\2\2\u00ab\u00ac"+
		"\7\61\2\2\u00ac \3\2\2\2\u00ad\u00ae\7*\2\2\u00ae\"\3\2\2\2\u00af\u00b0"+
		"\7+\2\2\u00b0$\3\2\2\2\u00b1\u00b2\7Q\2\2\u00b2\u00b3\7R\2\2\u00b3\u00b4"+
		"\7V\2\2\u00b4\u00b5\7K\2\2\u00b5\u00b6\7Q\2\2\u00b6\u00b7\7P\2\2\u00b7"+
		"&\3\2\2\2\u00b8\u00b9\7E\2\2\u00b9\u00ba\7R\2\2\u00ba\u00bb\7K\2\2\u00bb"+
		"\u00bc\7G\2\2\u00bc\u00bd\7E\2\2\u00bd\u00be\7G\2\2\u00be(\3\2\2\2\u00bf"+
		"\u00c0\7E\2\2\u00c0\u00c1\7R\2\2\u00c1\u00c2\7K\2\2\u00c2\u00c3\7G\2\2"+
		"\u00c3\u00c4\7E\2\2\u00c4\u00c5\7G\2\2\u00c5\u00c6\7a\2\2\u00c6\u00c7"+
		"\7G\2\2\u00c7\u00c8\7Z\2\2\u00c8\u00c9\7a\2\2\u00c9\u00ca\7W\2\2\u00ca"+
		"*\3\2\2\2\u00cb\u00cc\7U\2\2\u00cc\u00cd\7G\2\2\u00cd\u00ce\7V\2\2\u00ce"+
		"\u00cf\7G\2\2\u00cf\u00d0\7T\2\2\u00d0\u00d1\7T\2\2\u00d1\u00d2\7Q\2\2"+
		"\u00d2\u00d3\7T\2\2\u00d3,\3\2\2\2\u00d4\u00d5\7N\2\2\u00d5\u00d6\7G\2"+
		"\2\u00d6\u00d7\7V\2\2\u00d7.\3\2\2\2\u00d8\u00d9\7E\2\2\u00d9\u00da\7"+
		"Q\2\2\u00da\u00db\7N\2\2\u00db\u00dc\7Q\2\2\u00dc\u00dd\7W\2\2\u00dd\u00de"+
		"\7T\2\2\u00de\60\3\2\2\2\u00df\u00e0\7E\2\2\u00e0\u00e1\7Q\2\2\u00e1\u00e2"+
		"\7N\2\2\u00e2\u00e3\7Q\2\2\u00e3\u00e4\7T\2\2\u00e4\62\3\2\2\2\u00e5\u00e6"+
		"\7U\2\2\u00e6\u00e7\7G\2\2\u00e7\u00e8\7V\2\2\u00e8\u00e9\7P\2\2\u00e9"+
		"\u00ea\7W\2\2\u00ea\u00eb\7O\2\2\u00eb\u00ec\7G\2\2\u00ec\u00ed\7T\2\2"+
		"\u00ed\u00ee\7K\2\2\u00ee\u00ef\7E\2\2\u00ef\u00f0\7Q\2\2\u00f0\u00f1"+
		"\7R\2\2\u00f1\u00f2\7V\2\2\u00f2\u00f3\7K\2\2\u00f3\u00f4\7Q\2\2\u00f4"+
		"\u00f5\7P\2\2\u00f5\64\3\2\2\2\u00f6\u00f7\7I\2\2\u00f7\u00f8\7G\2\2\u00f8"+
		"\u00f9\7V\2\2\u00f9\u00fa\7P\2\2\u00fa\u00fb\7W\2\2\u00fb\u00fc\7O\2\2"+
		"\u00fc\u00fd\7G\2\2\u00fd\u00fe\7T\2\2\u00fe\u00ff\7K\2\2\u00ff\u0100"+
		"\7E\2\2\u0100\u0101\7Q\2\2\u0101\u0102\7R\2\2\u0102\u0103\7V\2\2\u0103"+
		"\u0104\7K\2\2\u0104\u0105\7Q\2\2\u0105\u0106\7P\2\2\u0106\66\3\2\2\2\u0107"+
		"\u0108\7R\2\2\u0108\u0109\7K\2\2\u0109\u010a\7G\2\2\u010a\u010b\7E\2\2"+
		"\u010b\u010c\7G\2\2\u010c\u010d\7a\2\2\u010d\u010e\7G\2\2\u010e\u010f"+
		"\7Z\2\2\u010f\u0110\7a\2\2\u0110\u0111\7W\2\2\u01118\3\2\2\2\u0112\u0113"+
		"\7R\2\2\u0113\u0114\7K\2\2\u0114\u0115\7G\2\2\u0115\u0116\7E\2\2\u0116"+
		"\u0117\7G\2\2\u0117:\3\2\2\2\u0118\u0119\7U\2\2\u0119\u011a\7W\2\2\u011a"+
		"\u011b\7T\2\2\u011b\u011c\7H\2\2\u011c\u011d\7C\2\2\u011d\u011e\7E\2\2"+
		"\u011e\u011f\7G\2\2\u011f<\3\2\2\2\u0120\u0121\7E\2\2\u0121\u0122\7U\2"+
		"\2\u0122\u0123\7W\2\2\u0123\u0124\7T\2\2\u0124\u0125\7H\2\2\u0125\u0126"+
		"\7C\2\2\u0126\u0127\7E\2\2\u0127\u0128\7G\2\2\u0128>\3\2\2\2\u0129\u012a"+
		"\7U\2\2\u012a\u012b\7W\2\2\u012b\u012c\7T\2\2\u012c\u012d\7H\2\2\u012d"+
		"\u012e\7C\2\2\u012e\u012f\7E\2\2\u012f\u0130\7G\2\2\u0130\u0131\7a\2\2"+
		"\u0131\u0132\7G\2\2\u0132\u0133\7Z\2\2\u0133@\3\2\2\2\u0134\u0135\7U\2"+
		"\2\u0135\u0136\7W\2\2\u0136\u0137\7T\2\2\u0137\u0138\7H\2\2\u0138\u0139"+
		"\7C\2\2\u0139\u013a\7E\2\2\u013a\u013b\7G\2\2\u013b\u013c\7a\2\2\u013c"+
		"\u013d\7G\2\2\u013d\u013e\7Z\2\2\u013e\u013f\7a\2\2\u013f\u0140\7W\2\2"+
		"\u0140B\3\2\2\2\u0141\u0142\7Q\2\2\u0142\u0143\7W\2\2\u0143\u0144\7V\2"+
		"\2\u0144\u0145\7G\2\2\u0145\u0146\7T\2\2\u0146\u0147\7E\2\2\u0147\u0148"+
		"\7Q\2\2\u0148\u0149\7N\2\2\u0149\u014a\7Q\2\2\u014a\u014b\7W\2\2\u014b"+
		"\u014c\7T\2\2\u014cD\3\2\2\2\u014d\u014e\7K\2\2\u014e\u014f\7P\2\2\u014f"+
		"\u0150\7P\2\2\u0150\u0151\7G\2\2\u0151\u0152\7T\2\2\u0152\u0153\7E\2\2"+
		"\u0153\u0154\7Q\2\2\u0154\u0155\7N\2\2\u0155\u0156\7Q\2\2\u0156\u0157"+
		"\7W\2\2\u0157\u0158\7T\2\2\u0158F\3\2\2\2\u0159\u015a\7E\2\2\u015a\u015b"+
		"\7T\2\2\u015b\u015c\7Q\2\2\u015c\u015d\7F\2\2\u015dH\3\2\2\2\u015e\u015f"+
		"\7E\2\2\u015f\u0160\7T\2\2\u0160\u0161\7Q\2\2\u0161\u0162\7F\2\2\u0162"+
		"\u0163\7a\2\2\u0163\u0164\7G\2\2\u0164\u0165\7Z\2\2\u0165J\3\2\2\2\u0166"+
		"\u0167\7E\2\2\u0167\u0168\7T\2\2\u0168\u0169\7Q\2\2\u0169\u016a\7F\2\2"+
		"\u016a\u016b\7a\2\2\u016b\u016c\7G\2\2\u016c\u016d\7Z\2\2\u016d\u016e"+
		"\7a\2\2\u016e\u016f\7W\2\2\u016fL\3\2\2\2\u0170\u0171\7T\2\2\u0171\u0172"+
		"\7Q\2\2\u0172\u0173\7F\2\2\u0173N\3\2\2\2\u0174\u0175\7T\2\2\u0175\u0176"+
		"\7Q\2\2\u0176\u0177\7F\2\2\u0177\u0178\7a\2\2\u0178\u0179\7G\2\2\u0179"+
		"\u017a\7Z\2\2\u017a\u017b\7a\2\2\u017b\u017c\7W\2\2\u017cP\3\2\2\2\u017d"+
		"\u017e\7E\2\2\u017e\u017f\7K\2\2\u017f\u0180\7P\2\2\u0180\u0181\7P\2\2"+
		"\u0181\u0182\7T\2\2\u0182\u0183\7Q\2\2\u0183\u0184\7F\2\2\u0184\u0185"+
		"\7a\2\2\u0185\u0186\7G\2\2\u0186\u0187\7Z\2\2\u0187\u0188\7a\2\2\u0188"+
		"\u0189\7W\2\2\u0189R\3\2\2\2\u018a\u018b\7E\2\2\u018b\u018c\7Q\2\2\u018c"+
		"\u018d\7W\2\2\u018d\u018e\7V\2\2\u018e\u018f\7T\2\2\u018f\u0190\7Q\2\2"+
		"\u0190\u0191\7F\2\2\u0191\u0192\7a\2\2\u0192\u0193\7G\2\2\u0193\u0194"+
		"\7Z\2\2\u0194\u0195\7a\2\2\u0195\u0196\7W\2\2\u0196T\3\2\2\2\u0197\u0198"+
		"\7O\2\2\u0198\u0199\7G\2\2\u0199\u019a\7U\2\2\u019a\u019b\7U\2\2\u019b"+
		"\u019c\7C\2\2\u019c\u019d\7I\2\2\u019d\u019e\7G\2\2\u019eV\3\2\2\2\u019f"+
		"\u01a0\7U\2\2\u01a0\u01a1\7E\2\2\u01a1\u01a2\7T\2\2\u01a2\u01a3\7K\2\2"+
		"\u01a3\u01a4\7R\2\2\u01a4\u01a5\7V\2\2\u01a5X\3\2\2\2\u01a6\u01a7\7P\2"+
		"\2\u01a7\u01a8\7C\2\2\u01a8\u01a9\7\\\2\2\u01a9\u01aa\7Y\2\2\u01aa\u01ab"+
		"\7C\2\2\u01abZ\3\2\2\2\u01ac\u01ad\7Y\2\2\u01ad\u01ae\7Q\2\2\u01ae\u01af"+
		"\7T\2\2\u01af\u01b0\7M\2\2\u01b0\u01b1\7H\2\2\u01b1\u01b2\7Q\2\2\u01b2"+
		"\u01b3\7T\2\2\u01b3\u01b4\7E\2\2\u01b4\u01b5\7G\2\2\u01b5\\\3\2\2\2\u01b6"+
		"\u01b7\7O\2\2\u01b7\u01b8\7J\2\2\u01b8^\3\2\2\2\u01b9\u01ba\7T\2\2\u01ba"+
		"\u01bb\7Q\2\2\u01bb\u01bc\7W\2\2\u01bc\u01bd\7P\2\2\u01bd\u01be\7F\2\2"+
		"\u01be`\3\2\2\2\u01bf\u01c0\7G\2\2\u01c0\u01c1\7Z\2\2\u01c1\u01c2\7K\2"+
		"\2\u01c2\u01c3\7U\2\2\u01c3\u01c4\7V\2\2\u01c4\u01c5\7U\2\2\u01c5\u01c6"+
		"\7X\2\2\u01c6\u01c7\7C\2\2\u01c7\u01c8\7T\2\2\u01c8\u01c9\7K\2\2\u01c9"+
		"\u01ca\7C\2\2\u01ca\u01cb\7D\2\2\u01cb\u01cc\7N\2\2\u01cc\u01cd\7G\2\2"+
		"\u01cdb\3\2\2\2\u01ce\u01cf\7U\2\2\u01cf\u01d0\7G\2\2\u01d0\u01d1\7V\2"+
		"\2\u01d1\u01d2\7F\2\2\u01d2\u01d3\7K\2\2\u01d3\u01d4\7O\2\2\u01d4\u01d5"+
		"\7G\2\2\u01d5\u01d6\7P\2\2\u01d6\u01d7\7U\2\2\u01d7\u01d8\7K\2\2\u01d8"+
		"\u01d9\7Q\2\2\u01d9\u01da\7P\2\2\u01dad\3\2\2\2\u01db\u01e4\7\62\2\2\u01dc"+
		"\u01e0\t\2\2\2\u01dd\u01df\t\3\2\2\u01de\u01dd\3\2\2\2\u01df\u01e2\3\2"+
		"\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2"+
		"\u01e0\3\2\2\2\u01e3\u01db\3\2\2\2\u01e3\u01dc\3\2\2\2\u01e4f\3\2\2\2"+
		"\u01e5\u01f4\7\62\2\2\u01e6\u01ea\t\2\2\2\u01e7\u01e9\t\3\2\2\u01e8\u01e7"+
		"\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"\u01ed\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ef\7\60\2\2\u01ee\u01f0\t"+
		"\3\2\2\u01ef\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01e5\3\2\2\2\u01f3\u01e6\3\2"+
		"\2\2\u01f4h\3\2\2\2\u01f5\u01f6\7.\2\2\u01f6j\3\2\2\2\u01f7\u01f8\7=\2"+
		"\2\u01f8l\3\2\2\2\u01f9\u01fd\7$\2\2\u01fa\u01fc\13\2\2\2\u01fb\u01fa"+
		"\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe"+
		"\u0200\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0201\7$\2\2\u0201n\3\2\2\2\u0202"+
		"\u0204\t\4\2\2\u0203\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0203\3\2"+
		"\2\2\u0205\u0206\3\2\2\2\u0206p\3\2\2\2\u0207\u0209\t\5\2\2\u0208\u0207"+
		"\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020c\u020d\b9\2\2\u020dr\3\2\2\2\u020e\u0212\7\'\2\2\u020f"+
		"\u0211\13\2\2\2\u0210\u020f\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0213\3"+
		"\2\2\2\u0212\u0210\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u0212\3\2\2\2\u0215"+
		"\u0216\7\f\2\2\u0216\u0217\3\2\2\2\u0217\u0218\b:\2\2\u0218t\3\2\2\2\f"+
		"\2\u01e0\u01e3\u01ea\u01f1\u01f3\u01fd\u0205\u020a\u0212\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}