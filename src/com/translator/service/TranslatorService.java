package com.translator.service;

import com.memetix.mst.language.Language;
import com.memetix.mst.translate.Translate;

public class TranslatorService {
	
	public String textToSpeech(String text, String outputLanguage) throws Exception {
		// Set your Windows Azure Marketplace client info - See
		// http://msdn.microsoft.com/en-us/library/hh454950.aspx
		String translatedText="";
		Translate.setClientId("1qaz2wsx");
		Translate
				.setClientSecret("a2/Me09BOE90p5GhPaDj25Kf0s+WktI/gTmuei7Jp0c=");
		
		if("French".equals(outputLanguage)){
			translatedText = Translate.execute(text, Language.ENGLISH, Language.FRENCH);
		}
		
		if("Dutch".equals(outputLanguage)){
			translatedText = Translate.execute(text, Language.ENGLISH, Language.DUTCH);
		}
		
		if("German".equals(outputLanguage)){
			translatedText = Translate.execute(text, Language.ENGLISH, Language.GERMAN);
		}
		
		if("Spanish".equals(outputLanguage)){
			translatedText = Translate.execute(text, Language.ENGLISH, Language.SPANISH);
		}
		return translatedText;
	}

}
