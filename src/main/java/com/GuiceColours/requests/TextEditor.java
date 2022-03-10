package com.GuiceColours.requests;

import com.GuiceColours.services.SpellChecker;
import com.google.inject.Inject;

class TextEditor {
	   private SpellChecker spellChecker;
	   @Inject
	   public TextEditor(SpellChecker spellChecker) {
	      this.spellChecker = spellChecker;
	   }
	   public void makeSpellCheck(){
	      spellChecker.checkSpelling();
	   }
	}