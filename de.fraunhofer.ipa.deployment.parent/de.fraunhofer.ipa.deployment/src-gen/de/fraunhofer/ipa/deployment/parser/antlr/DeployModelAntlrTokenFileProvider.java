/*
 * generated by Xtext 2.27.0
 */
package de.fraunhofer.ipa.deployment.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DeployModelAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("de/fraunhofer/ipa/deployment/parser/antlr/internal/InternalDeployModelParser.tokens");
	}
}