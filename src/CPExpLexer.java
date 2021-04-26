// Generated from CPExp.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CPExpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		Identifier=10, Int10=11, Int8=12, Int16=13, ADD=14, SUB=15, MUL=16, DIV=17, 
		GT=18, LT=19, EQ=20, WhiteSpace=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"Identifier", "Int10", "Int8", "Int16", "ADD", "SUB", "MUL", "DIV", "GT", 
			"LT", "EQ", "WhiteSpace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'else'", "'while'", "'do'", "'{'", "'}'", "'('", 
			"')'", null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "Identifier", 
			"Int10", "Int8", "Int16", "ADD", "SUB", "MUL", "DIV", "GT", "LT", "EQ", 
			"WhiteSpace"
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


	public CPExpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CPExp.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0084\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\7\13N\n\13\f\13\16\13Q\13\13\3\f"+
		"\3\f\3\f\7\fV\n\f\f\f\16\fY\13\f\5\f[\n\f\3\r\3\r\3\r\3\r\7\ra\n\r\f\r"+
		"\16\rd\13\r\5\rf\n\r\3\16\3\16\3\16\3\16\6\16l\n\16\r\16\16\16m\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\6"+
		"\26\177\n\26\r\26\16\26\u0080\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27\3\2\n\4\2C\\c|\5\2\62;C\\c|\3\2\63;\3\2\62;\3\2\639\3\2\629\5"+
		"\2\62;CHch\5\2\13\f\17\17\"\"\2\u008a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\60\3\2\2\2\7\65\3\2\2\2\t:\3\2\2\2\13@"+
		"\3\2\2\2\rC\3\2\2\2\17E\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25K\3\2\2\2\27"+
		"Z\3\2\2\2\31\\\3\2\2\2\33g\3\2\2\2\35o\3\2\2\2\37q\3\2\2\2!s\3\2\2\2#"+
		"u\3\2\2\2%w\3\2\2\2\'y\3\2\2\2){\3\2\2\2+~\3\2\2\2-.\7k\2\2./\7h\2\2/"+
		"\4\3\2\2\2\60\61\7v\2\2\61\62\7j\2\2\62\63\7g\2\2\63\64\7p\2\2\64\6\3"+
		"\2\2\2\65\66\7g\2\2\66\67\7n\2\2\678\7u\2\289\7g\2\29\b\3\2\2\2:;\7y\2"+
		"\2;<\7j\2\2<=\7k\2\2=>\7n\2\2>?\7g\2\2?\n\3\2\2\2@A\7f\2\2AB\7q\2\2B\f"+
		"\3\2\2\2CD\7}\2\2D\16\3\2\2\2EF\7\177\2\2F\20\3\2\2\2GH\7*\2\2H\22\3\2"+
		"\2\2IJ\7+\2\2J\24\3\2\2\2KO\t\2\2\2LN\t\3\2\2ML\3\2\2\2NQ\3\2\2\2OM\3"+
		"\2\2\2OP\3\2\2\2P\26\3\2\2\2QO\3\2\2\2R[\7\62\2\2SW\t\4\2\2TV\t\5\2\2"+
		"UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X[\3\2\2\2YW\3\2\2\2ZR\3\2\2\2"+
		"ZS\3\2\2\2[\30\3\2\2\2\\e\7\62\2\2]f\7\62\2\2^b\t\6\2\2_a\t\7\2\2`_\3"+
		"\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2cf\3\2\2\2db\3\2\2\2e]\3\2\2\2e^\3"+
		"\2\2\2f\32\3\2\2\2gh\7\62\2\2hi\7z\2\2ik\3\2\2\2jl\t\b\2\2kj\3\2\2\2l"+
		"m\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\34\3\2\2\2op\7-\2\2p\36\3\2\2\2qr\7/\2"+
		"\2r \3\2\2\2st\7,\2\2t\"\3\2\2\2uv\7\61\2\2v$\3\2\2\2wx\7@\2\2x&\3\2\2"+
		"\2yz\7>\2\2z(\3\2\2\2{|\7?\2\2|*\3\2\2\2}\177\t\t\2\2~}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0083\b\26\2\2\u0083,\3\2\2\2\n\2OWZbem\u0080\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}