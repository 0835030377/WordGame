package gameframework.services.wordgame.providers;

import java.util.Locale;

/**
 * English dictionary provider.
 * 
 * @author mzue mzukisi
 */
public class EnglishFileDictionaryProvider extends FileDictionaryProviderBase {
	private static final String ENGLISH_CODE = Locale.ENGLISH.getISO3Language();

	private static final String ENGLISH_DICTIONARY_FILE = "/englishDictionary.lst";

	/**
	 * Initializes a new instance of the EnglishDictionaryProvider class. This
	 * instance is configured by Spring settings.
	 */
	public EnglishFileDictionaryProvider(int minimalLetters) {
		super(ENGLISH_DICTIONARY_FILE, minimalLetters);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see gameframework.services.wordgame.providers.FileDictionaryProviderBase#isDictionaryForLang(java.lang.String)
	 */
	public boolean isDictionaryForLang(String lang) {
		return ENGLISH_CODE.equals(lang);
	}

}
