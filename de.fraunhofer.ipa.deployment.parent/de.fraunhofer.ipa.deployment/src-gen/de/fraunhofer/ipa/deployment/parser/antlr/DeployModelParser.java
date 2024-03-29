/*
 * generated by Xtext 2.27.0
 */
package de.fraunhofer.ipa.deployment.parser.antlr;

import com.google.inject.Inject;
import de.fraunhofer.ipa.deployment.parser.antlr.internal.InternalDeployModelParser;
import de.fraunhofer.ipa.deployment.services.DeployModelGrammarAccess;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class DeployModelParser extends AbstractAntlrParser {

	@Inject
	private DeployModelGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected TokenSource createLexer(CharStream stream) {
		return new DeployModelTokenSource(super.createLexer(stream));
	}
	
	/**
	 * Indentation aware languages do not support partial parsing since the lexer is inherently stateful.
	 * Override and return {@code true} if your terminal splitting is stateless.
	 */
	@Override
	protected boolean isReparseSupported() {
		return false;
	}

	@Override
	protected InternalDeployModelParser createParser(XtextTokenStream stream) {
		return new InternalDeployModelParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Yaml";
	}

	public DeployModelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DeployModelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
