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
		T__9=10, Identifier=11, Int10=12, Int8=13, Int16=14, ADD=15, SUB=16, MUL=17, 
		DIV=18, GT=19, LT=20, EQ=21, WhiteSpace=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "Identifier", "Int10", "Int8", "Int16", "ADD", "SUB", "MUL", 
			"DIV", "GT", "LT", "EQ", "WhiteSpace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'if'", "'then'", "'else'", "'while'", "'do'", "'{'", "'}'", 
			"'('", "')'", null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'>'", 
			"'<'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "Identifier", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0088\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\7\fR\n\f\f\f\16"+
		"\fU\13\f\3\r\3\r\3\r\7\rZ\n\r\f\r\16\r]\13\r\5\r_\n\r\3\16\3\16\3\16\3"+
		"\16\7\16e\n\16\f\16\16\16h\13\16\5\16j\n\16\3\17\3\17\3\17\3\17\6\17p"+
		"\n\17\r\17\16\17q\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\6\27\u0083\n\27\r\27\16\27\u0084\3\27\3\27\2\2"+
		"\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\n\4\2C\\c|\5\2\62;C\\c|\3\2"+
		"\63;\3\2\62;\3\2\639\3\2\629\5\2\62;CHch\5\2\13\f\17\17\"\"\2\u008e\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2"+
		"\5\61\3\2\2\2\7\64\3\2\2\2\t9\3\2\2\2\13>\3\2\2\2\rD\3\2\2\2\17G\3\2\2"+
		"\2\21I\3\2\2\2\23K\3\2\2\2\25M\3\2\2\2\27O\3\2\2\2\31^\3\2\2\2\33`\3\2"+
		"\2\2\35k\3\2\2\2\37s\3\2\2\2!u\3\2\2\2#w\3\2\2\2%y\3\2\2\2\'{\3\2\2\2"+
		")}\3\2\2\2+\177\3\2\2\2-\u0082\3\2\2\2/\60\7=\2\2\60\4\3\2\2\2\61\62\7"+
		"k\2\2\62\63\7h\2\2\63\6\3\2\2\2\64\65\7v\2\2\65\66\7j\2\2\66\67\7g\2\2"+
		"\678\7p\2\28\b\3\2\2\29:\7g\2\2:;\7n\2\2;<\7u\2\2<=\7g\2\2=\n\3\2\2\2"+
		">?\7y\2\2?@\7j\2\2@A\7k\2\2AB\7n\2\2BC\7g\2\2C\f\3\2\2\2DE\7f\2\2EF\7"+
		"q\2\2F\16\3\2\2\2GH\7}\2\2H\20\3\2\2\2IJ\7\177\2\2J\22\3\2\2\2KL\7*\2"+
		"\2L\24\3\2\2\2MN\7+\2\2N\26\3\2\2\2OS\t\2\2\2PR\t\3\2\2QP\3\2\2\2RU\3"+
		"\2\2\2SQ\3\2\2\2ST\3\2\2\2T\30\3\2\2\2US\3\2\2\2V_\7\62\2\2W[\t\4\2\2"+
		"XZ\t\5\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\_\3\2\2\2][\3\2\2"+
		"\2^V\3\2\2\2^W\3\2\2\2_\32\3\2\2\2`i\7\62\2\2aj\7\62\2\2bf\t\6\2\2ce\t"+
		"\7\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gj\3\2\2\2hf\3\2\2\2ia\3"+
		"\2\2\2ib\3\2\2\2j\34\3\2\2\2kl\7\62\2\2lm\7z\2\2mo\3\2\2\2np\t\b\2\2o"+
		"n\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\36\3\2\2\2st\7-\2\2t \3\2\2\2"+
		"uv\7/\2\2v\"\3\2\2\2wx\7,\2\2x$\3\2\2\2yz\7\61\2\2z&\3\2\2\2{|\7@\2\2"+
		"|(\3\2\2\2}~\7>\2\2~*\3\2\2\2\177\u0080\7?\2\2\u0080,\3\2\2\2\u0081\u0083"+
		"\t\t\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\b\27\2\2\u0087.\3\2\2\2"+
		"\n\2S[^fiq\u0084\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}