// Generated from /home/maciej/IdeaProjects/skrypt/Scripts.g4 by ANTLR 4.7
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
		SETOPTION=1, OPTION=2, IGNORED=3, ID=4, WS=5, COMMENT=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SETOPTION", "OPTION", "IGNORED", "ID", "WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SETOPTION", "OPTION", "IGNORED", "ID", "WS", "COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\bQ\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\5\2\21\n\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2#\n\2\3\3\5\3&\n\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\65\n\3\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\6\5=\n\5\r\5\16\5>\3\5\3\5\3\6\6\6D\n\6\r\6\16\6E\3"+
		"\6\3\6\3\7\3\7\6\7L\n\7\r\7\16\7M\3\7\3\7\4>M\2\b\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\3\2\3\5\2\13\f\17\17\"\"\2W\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\20\3\2\2\2\5%\3\2\2\2\7\66\3\2\2"+
		"\2\t:\3\2\2\2\13C\3\2\2\2\rI\3\2\2\2\17\21\7\"\2\2\20\17\3\2\2\2\20\21"+
		"\3\2\2\2\21\22\3\2\2\2\22\23\7U\2\2\23\24\7G\2\2\24\25\7V\2\2\25\26\7"+
		"Q\2\2\26\27\7R\2\2\27\30\7V\2\2\30\31\7K\2\2\31\32\7Q\2\2\32\33\7P\2\2"+
		"\33\34\3\2\2\2\34\35\7*\2\2\35\36\5\t\5\2\36\37\7.\2\2\37 \5\t\5\2 \""+
		"\7+\2\2!#\7\f\2\2\"!\3\2\2\2\"#\3\2\2\2#\4\3\2\2\2$&\7\"\2\2%$\3\2\2\2"+
		"%&\3\2\2\2&\'\3\2\2\2\'(\7Q\2\2()\7R\2\2)*\7V\2\2*+\7K\2\2+,\7Q\2\2,-"+
		"\7P\2\2-.\3\2\2\2./\7*\2\2/\60\5\t\5\2\60\61\7.\2\2\61\62\5\t\5\2\62\64"+
		"\7+\2\2\63\65\7\f\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65\6\3\2\2\2\66\67\13"+
		"\2\2\2\678\3\2\2\289\b\4\2\29\b\3\2\2\2:<\7$\2\2;=\13\2\2\2<;\3\2\2\2"+
		"=>\3\2\2\2>?\3\2\2\2><\3\2\2\2?@\3\2\2\2@A\7$\2\2A\n\3\2\2\2BD\t\2\2\2"+
		"CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\b\6\2\2H\f\3\2\2"+
		"\2IK\7\'\2\2JL\13\2\2\2KJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2MK\3\2\2\2NO\3\2"+
		"\2\2OP\b\7\2\2P\16\3\2\2\2\n\2\20\"%\64>EM\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}