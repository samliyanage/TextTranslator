package com.translator.util;

import java.util.Locale;

import javax.speech.Central;
import javax.speech.synthesis.*;

public class Speech {

	public void textToSpeech(String text) {
		try {
			System.setProperty("freetts.voices",
					"com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");

			Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
			Synthesizer synthesizer = Central
					.createSynthesizer(new SynthesizerModeDesc(Locale.US));
			synthesizer.allocate();
			synthesizer.resume();
			synthesizer.speakPlainText(text, null);
			synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
			synthesizer.deallocate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
