package com.GuiceColours.module;

import com.google.inject.AbstractModule;
import com.GuiceColours.services.SpellChecker;
import com.GuiceColours.services.SpellCheckImp;

class TextEditorModule extends AbstractModule {
	   @Override
	   protected void configure() {
	      bind(SpellChecker.class).to(SpellCheckImp.class);
	   } 
	}