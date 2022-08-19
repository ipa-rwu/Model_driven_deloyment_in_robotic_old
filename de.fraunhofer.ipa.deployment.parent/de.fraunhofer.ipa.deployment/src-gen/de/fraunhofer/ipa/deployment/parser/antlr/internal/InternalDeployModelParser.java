package de.fraunhofer.ipa.deployment.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.ipa.deployment.services.DeployModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDeployModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MonolithicImplementationDescription", "ImplementationArtifactDescription", "StackImplementationDescription", "RepositoryDescription", "ResourceRequirements", "DeployRequirements", "ImplementsRosModel", "PackageDescription", "BuildRequirements", "BranchPrefixType", "ImageDescription", "AptRepositories", "RepositoryPath", "TestRosDistros", "StartCommands", "AppliedRepos", "UpdateRosDep", "Description", "RosDistros", "Visibility", "CISetting", "CMakeArgs", "ImageTags", "DependOn", "Location", "CiTypes", "KeyLink", "Branch", "Import", "Release", "Types", "Value", "Debug", "False", "Mode", "Name", "Path", "Type", "True", "Use", "GHz", "MHz", "Any", "KHz", "GB", "Gb", "Hz", "KB", "Kb", "MB", "Mb", "TB", "Tb", "GB_1", "Gb_1", "KB_1", "Kb_1", "MB_1", "Mb_1", "Ms", "Ns", "TB_1", "Tb_1", "Us", "Comma", "HyphenMinus", "FullStop", "Colon", "B", "LeftSquareBracket", "RightSquareBracket", "B_1", "D", "H", "M", "S", "RULE_LOCALPATH", "RULE_INT", "RULE_FLOAT", "RULE_URL", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Import=32;
    public static final int Mb_1=62;
    public static final int ImplementationArtifactDescription=5;
    public static final int False=37;
    public static final int DependOn=27;
    public static final int RULE_LOCALPATH=80;
    public static final int TestRosDistros=17;
    public static final int MonolithicImplementationDescription=4;
    public static final int MB_1=61;
    public static final int RULE_ID=87;
    public static final int Hz=50;
    public static final int RULE_INT=81;
    public static final int RULE_ML_COMMENT=89;
    public static final int LeftSquareBracket=73;
    public static final int MHz=45;
    public static final int B=72;
    public static final int Description=21;
    public static final int KeyLink=30;
    public static final int D=76;
    public static final int H=77;
    public static final int DeployRequirements=9;
    public static final int Kb_1=60;
    public static final int M=78;
    public static final int RepositoryPath=16;
    public static final int Comma=68;
    public static final int HyphenMinus=69;
    public static final int S=79;
    public static final int AppliedRepos=19;
    public static final int KB=51;
    public static final int RULE_INDENT=85;
    public static final int Path=40;
    public static final int FullStop=70;
    public static final int UpdateRosDep=20;
    public static final int Use=43;
    public static final int KB_1=59;
    public static final int CMakeArgs=25;
    public static final int TB=55;
    public static final int Type=41;
    public static final int B_1=75;
    public static final int Kb=52;
    public static final int ImplementsRosModel=10;
    public static final int RULE_FLOAT=82;
    public static final int RepositoryDescription=7;
    public static final int PackageDescription=11;
    public static final int BranchPrefixType=13;
    public static final int Types=34;
    public static final int TB_1=65;
    public static final int True=42;
    public static final int ResourceRequirements=8;
    public static final int Tb=56;
    public static final int BuildRequirements=12;
    public static final int Name=39;
    public static final int MB=53;
    public static final int RightSquareBracket=74;
    public static final int RULE_DEDENT=86;
    public static final int StartCommands=18;
    public static final int Mb=54;
    public static final int RULE_URL=83;
    public static final int Value=35;
    public static final int GHz=44;
    public static final int Visibility=23;
    public static final int ImageDescription=14;
    public static final int CISetting=24;
    public static final int KHz=47;
    public static final int Us=67;
    public static final int Ms=63;
    public static final int RULE_STRING=88;
    public static final int StackImplementationDescription=6;
    public static final int Gb_1=58;
    public static final int Any=46;
    public static final int RULE_SL_COMMENT=84;
    public static final int CiTypes=29;
    public static final int Branch=31;
    public static final int GB=48;
    public static final int Colon=71;
    public static final int EOF=-1;
    public static final int Release=33;
    public static final int Debug=36;
    public static final int RosDistros=22;
    public static final int Ns=64;
    public static final int RULE_WS=90;
    public static final int Mode=38;
    public static final int Tb_1=66;
    public static final int AptRepositories=15;
    public static final int RULE_ANY_OTHER=91;
    public static final int GB_1=57;
    public static final int ImageTags=26;
    public static final int Gb=49;
    public static final int Location=28;

    // delegates
    // delegators


        public InternalDeployModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDeployModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDeployModelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDeployModelParser.g"; }



     	private DeployModelGrammarAccess grammarAccess;

        public InternalDeployModelParser(TokenStream input, DeployModelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Yaml";
       	}

       	@Override
       	protected DeployModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleYaml"
    // InternalDeployModelParser.g:58:1: entryRuleYaml returns [EObject current=null] : iv_ruleYaml= ruleYaml EOF ;
    public final EObject entryRuleYaml() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYaml = null;


        try {
            // InternalDeployModelParser.g:58:45: (iv_ruleYaml= ruleYaml EOF )
            // InternalDeployModelParser.g:59:2: iv_ruleYaml= ruleYaml EOF
            {
             newCompositeNode(grammarAccess.getYamlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleYaml=ruleYaml();

            state._fsp--;

             current =iv_ruleYaml; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleYaml"


    // $ANTLR start "ruleYaml"
    // InternalDeployModelParser.g:65:1: ruleYaml returns [EObject current=null] : ( () ( (lv_content_1_0= ruleYamlContent ) )* ) ;
    public final EObject ruleYaml() throws RecognitionException {
        EObject current = null;

        EObject lv_content_1_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:71:2: ( ( () ( (lv_content_1_0= ruleYamlContent ) )* ) )
            // InternalDeployModelParser.g:72:2: ( () ( (lv_content_1_0= ruleYamlContent ) )* )
            {
            // InternalDeployModelParser.g:72:2: ( () ( (lv_content_1_0= ruleYamlContent ) )* )
            // InternalDeployModelParser.g:73:3: () ( (lv_content_1_0= ruleYamlContent ) )*
            {
            // InternalDeployModelParser.g:73:3: ()
            // InternalDeployModelParser.g:74:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getYamlAccess().getYamlAction_0(),
            					current);
            			

            }

            // InternalDeployModelParser.g:80:3: ( (lv_content_1_0= ruleYamlContent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==MonolithicImplementationDescription||LA1_0==StackImplementationDescription||LA1_0==PackageDescription||LA1_0==CISetting) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDeployModelParser.g:81:4: (lv_content_1_0= ruleYamlContent )
            	    {
            	    // InternalDeployModelParser.g:81:4: (lv_content_1_0= ruleYamlContent )
            	    // InternalDeployModelParser.g:82:5: lv_content_1_0= ruleYamlContent
            	    {

            	    					newCompositeNode(grammarAccess.getYamlAccess().getContentYamlContentParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_content_1_0=ruleYamlContent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getYamlRule());
            	    					}
            	    					add(
            	    						current,
            	    						"content",
            	    						lv_content_1_0,
            	    						"de.fraunhofer.ipa.deployment.DeployModel.YamlContent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleYaml"


    // $ANTLR start "entryRuleYamlContent"
    // InternalDeployModelParser.g:103:1: entryRuleYamlContent returns [EObject current=null] : iv_ruleYamlContent= ruleYamlContent EOF ;
    public final EObject entryRuleYamlContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYamlContent = null;


        try {
            // InternalDeployModelParser.g:103:52: (iv_ruleYamlContent= ruleYamlContent EOF )
            // InternalDeployModelParser.g:104:2: iv_ruleYamlContent= ruleYamlContent EOF
            {
             newCompositeNode(grammarAccess.getYamlContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleYamlContent=ruleYamlContent();

            state._fsp--;

             current =iv_ruleYamlContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleYamlContent"


    // $ANTLR start "ruleYamlContent"
    // InternalDeployModelParser.g:110:1: ruleYamlContent returns [EObject current=null] : ( ( (lv_rootContent_0_1= ruleMonolithicImplementationDescription | lv_rootContent_0_2= ruleStackImplementationDescription | lv_rootContent_0_3= rulePackageDescription | lv_rootContent_0_4= ruleCISetting ) ) ) ;
    public final EObject ruleYamlContent() throws RecognitionException {
        EObject current = null;

        EObject lv_rootContent_0_1 = null;

        EObject lv_rootContent_0_2 = null;

        EObject lv_rootContent_0_3 = null;

        EObject lv_rootContent_0_4 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:116:2: ( ( ( (lv_rootContent_0_1= ruleMonolithicImplementationDescription | lv_rootContent_0_2= ruleStackImplementationDescription | lv_rootContent_0_3= rulePackageDescription | lv_rootContent_0_4= ruleCISetting ) ) ) )
            // InternalDeployModelParser.g:117:2: ( ( (lv_rootContent_0_1= ruleMonolithicImplementationDescription | lv_rootContent_0_2= ruleStackImplementationDescription | lv_rootContent_0_3= rulePackageDescription | lv_rootContent_0_4= ruleCISetting ) ) )
            {
            // InternalDeployModelParser.g:117:2: ( ( (lv_rootContent_0_1= ruleMonolithicImplementationDescription | lv_rootContent_0_2= ruleStackImplementationDescription | lv_rootContent_0_3= rulePackageDescription | lv_rootContent_0_4= ruleCISetting ) ) )
            // InternalDeployModelParser.g:118:3: ( (lv_rootContent_0_1= ruleMonolithicImplementationDescription | lv_rootContent_0_2= ruleStackImplementationDescription | lv_rootContent_0_3= rulePackageDescription | lv_rootContent_0_4= ruleCISetting ) )
            {
            // InternalDeployModelParser.g:118:3: ( (lv_rootContent_0_1= ruleMonolithicImplementationDescription | lv_rootContent_0_2= ruleStackImplementationDescription | lv_rootContent_0_3= rulePackageDescription | lv_rootContent_0_4= ruleCISetting ) )
            // InternalDeployModelParser.g:119:4: (lv_rootContent_0_1= ruleMonolithicImplementationDescription | lv_rootContent_0_2= ruleStackImplementationDescription | lv_rootContent_0_3= rulePackageDescription | lv_rootContent_0_4= ruleCISetting )
            {
            // InternalDeployModelParser.g:119:4: (lv_rootContent_0_1= ruleMonolithicImplementationDescription | lv_rootContent_0_2= ruleStackImplementationDescription | lv_rootContent_0_3= rulePackageDescription | lv_rootContent_0_4= ruleCISetting )
            int alt2=4;
            switch ( input.LA(1) ) {
            case MonolithicImplementationDescription:
                {
                alt2=1;
                }
                break;
            case StackImplementationDescription:
                {
                alt2=2;
                }
                break;
            case PackageDescription:
                {
                alt2=3;
                }
                break;
            case CISetting:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDeployModelParser.g:120:5: lv_rootContent_0_1= ruleMonolithicImplementationDescription
                    {

                    					newCompositeNode(grammarAccess.getYamlContentAccess().getRootContentMonolithicImplementationDescriptionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_rootContent_0_1=ruleMonolithicImplementationDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getYamlContentRule());
                    					}
                    					set(
                    						current,
                    						"rootContent",
                    						lv_rootContent_0_1,
                    						"de.fraunhofer.ipa.deployment.DeployModel.MonolithicImplementationDescription");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:136:5: lv_rootContent_0_2= ruleStackImplementationDescription
                    {

                    					newCompositeNode(grammarAccess.getYamlContentAccess().getRootContentStackImplementationDescriptionParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_rootContent_0_2=ruleStackImplementationDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getYamlContentRule());
                    					}
                    					set(
                    						current,
                    						"rootContent",
                    						lv_rootContent_0_2,
                    						"de.fraunhofer.ipa.deployment.DeployModel.StackImplementationDescription");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalDeployModelParser.g:152:5: lv_rootContent_0_3= rulePackageDescription
                    {

                    					newCompositeNode(grammarAccess.getYamlContentAccess().getRootContentPackageDescriptionParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_rootContent_0_3=rulePackageDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getYamlContentRule());
                    					}
                    					set(
                    						current,
                    						"rootContent",
                    						lv_rootContent_0_3,
                    						"de.fraunhofer.ipa.deployment.DeployModel.PackageDescription");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 4 :
                    // InternalDeployModelParser.g:168:5: lv_rootContent_0_4= ruleCISetting
                    {

                    					newCompositeNode(grammarAccess.getYamlContentAccess().getRootContentCISettingParserRuleCall_0_3());
                    				
                    pushFollow(FOLLOW_2);
                    lv_rootContent_0_4=ruleCISetting();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getYamlContentRule());
                    					}
                    					set(
                    						current,
                    						"rootContent",
                    						lv_rootContent_0_4,
                    						"de.fraunhofer.ipa.deployment.DeployModel.CISetting");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleYamlContent"


    // $ANTLR start "entryRuleMonolithicImplementationDescription"
    // InternalDeployModelParser.g:189:1: entryRuleMonolithicImplementationDescription returns [EObject current=null] : iv_ruleMonolithicImplementationDescription= ruleMonolithicImplementationDescription EOF ;
    public final EObject entryRuleMonolithicImplementationDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonolithicImplementationDescription = null;


        try {
            // InternalDeployModelParser.g:189:76: (iv_ruleMonolithicImplementationDescription= ruleMonolithicImplementationDescription EOF )
            // InternalDeployModelParser.g:190:2: iv_ruleMonolithicImplementationDescription= ruleMonolithicImplementationDescription EOF
            {
             newCompositeNode(grammarAccess.getMonolithicImplementationDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonolithicImplementationDescription=ruleMonolithicImplementationDescription();

            state._fsp--;

             current =iv_ruleMonolithicImplementationDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMonolithicImplementationDescription"


    // $ANTLR start "ruleMonolithicImplementationDescription"
    // InternalDeployModelParser.g:196:1: ruleMonolithicImplementationDescription returns [EObject current=null] : ( ( (lv_type_0_0= MonolithicImplementationDescription ) ) this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ImplementsRosModel ( (lv_impRosmodel_5_0= RULE_STRING ) ) )? otherlv_6= Description ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= Mode ( (lv_mode_9_0= ruleImplementationModeType ) ) otherlv_10= Branch ( (lv_branch_11_0= ruleBranchType ) ) (otherlv_12= ImplementationArtifactDescription ( (lv_implementation_13_0= ruleNewImplementationArtifact ) ) )? this_DEDENT_14= RULE_DEDENT ) ;
    public final EObject ruleMonolithicImplementationDescription() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token this_INDENT_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_impRosmodel_5_0=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token this_DEDENT_14=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        Enumerator lv_mode_9_0 = null;

        AntlrDatatypeRuleToken lv_branch_11_0 = null;

        EObject lv_implementation_13_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:202:2: ( ( ( (lv_type_0_0= MonolithicImplementationDescription ) ) this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ImplementsRosModel ( (lv_impRosmodel_5_0= RULE_STRING ) ) )? otherlv_6= Description ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= Mode ( (lv_mode_9_0= ruleImplementationModeType ) ) otherlv_10= Branch ( (lv_branch_11_0= ruleBranchType ) ) (otherlv_12= ImplementationArtifactDescription ( (lv_implementation_13_0= ruleNewImplementationArtifact ) ) )? this_DEDENT_14= RULE_DEDENT ) )
            // InternalDeployModelParser.g:203:2: ( ( (lv_type_0_0= MonolithicImplementationDescription ) ) this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ImplementsRosModel ( (lv_impRosmodel_5_0= RULE_STRING ) ) )? otherlv_6= Description ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= Mode ( (lv_mode_9_0= ruleImplementationModeType ) ) otherlv_10= Branch ( (lv_branch_11_0= ruleBranchType ) ) (otherlv_12= ImplementationArtifactDescription ( (lv_implementation_13_0= ruleNewImplementationArtifact ) ) )? this_DEDENT_14= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:203:2: ( ( (lv_type_0_0= MonolithicImplementationDescription ) ) this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ImplementsRosModel ( (lv_impRosmodel_5_0= RULE_STRING ) ) )? otherlv_6= Description ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= Mode ( (lv_mode_9_0= ruleImplementationModeType ) ) otherlv_10= Branch ( (lv_branch_11_0= ruleBranchType ) ) (otherlv_12= ImplementationArtifactDescription ( (lv_implementation_13_0= ruleNewImplementationArtifact ) ) )? this_DEDENT_14= RULE_DEDENT )
            // InternalDeployModelParser.g:204:3: ( (lv_type_0_0= MonolithicImplementationDescription ) ) this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ImplementsRosModel ( (lv_impRosmodel_5_0= RULE_STRING ) ) )? otherlv_6= Description ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= Mode ( (lv_mode_9_0= ruleImplementationModeType ) ) otherlv_10= Branch ( (lv_branch_11_0= ruleBranchType ) ) (otherlv_12= ImplementationArtifactDescription ( (lv_implementation_13_0= ruleNewImplementationArtifact ) ) )? this_DEDENT_14= RULE_DEDENT
            {
            // InternalDeployModelParser.g:204:3: ( (lv_type_0_0= MonolithicImplementationDescription ) )
            // InternalDeployModelParser.g:205:4: (lv_type_0_0= MonolithicImplementationDescription )
            {
            // InternalDeployModelParser.g:205:4: (lv_type_0_0= MonolithicImplementationDescription )
            // InternalDeployModelParser.g:206:5: lv_type_0_0= MonolithicImplementationDescription
            {
            lv_type_0_0=(Token)match(input,MonolithicImplementationDescription,FOLLOW_4); 

            					newLeafNode(lv_type_0_0, grammarAccess.getMonolithicImplementationDescriptionAccess().getTypeMonolithicImplementationDescriptionKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMonolithicImplementationDescriptionRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "MonolithicImplementationDescription:");
            				

            }


            }

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_5); 

            			newLeafNode(this_INDENT_1, grammarAccess.getMonolithicImplementationDescriptionAccess().getINDENTTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMonolithicImplementationDescriptionAccess().getNameKeyword_2());
            		
            // InternalDeployModelParser.g:226:3: ( (lv_name_3_0= ruleQualifiedName ) )
            // InternalDeployModelParser.g:227:4: (lv_name_3_0= ruleQualifiedName )
            {
            // InternalDeployModelParser.g:227:4: (lv_name_3_0= ruleQualifiedName )
            // InternalDeployModelParser.g:228:5: lv_name_3_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getMonolithicImplementationDescriptionAccess().getNameQualifiedNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonolithicImplementationDescriptionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeployModelParser.g:245:3: (otherlv_4= ImplementsRosModel ( (lv_impRosmodel_5_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ImplementsRosModel) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDeployModelParser.g:246:4: otherlv_4= ImplementsRosModel ( (lv_impRosmodel_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,ImplementsRosModel,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getMonolithicImplementationDescriptionAccess().getImplementsRosModelKeyword_4_0());
                    			
                    // InternalDeployModelParser.g:250:4: ( (lv_impRosmodel_5_0= RULE_STRING ) )
                    // InternalDeployModelParser.g:251:5: (lv_impRosmodel_5_0= RULE_STRING )
                    {
                    // InternalDeployModelParser.g:251:5: (lv_impRosmodel_5_0= RULE_STRING )
                    // InternalDeployModelParser.g:252:6: lv_impRosmodel_5_0= RULE_STRING
                    {
                    lv_impRosmodel_5_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_impRosmodel_5_0, grammarAccess.getMonolithicImplementationDescriptionAccess().getImpRosmodelSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMonolithicImplementationDescriptionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"impRosmodel",
                    							lv_impRosmodel_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,Description,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getMonolithicImplementationDescriptionAccess().getDescriptionKeyword_5());
            		
            // InternalDeployModelParser.g:273:3: ( (lv_description_7_0= RULE_STRING ) )
            // InternalDeployModelParser.g:274:4: (lv_description_7_0= RULE_STRING )
            {
            // InternalDeployModelParser.g:274:4: (lv_description_7_0= RULE_STRING )
            // InternalDeployModelParser.g:275:5: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_description_7_0, grammarAccess.getMonolithicImplementationDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMonolithicImplementationDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,Mode,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getMonolithicImplementationDescriptionAccess().getModeKeyword_7());
            		
            // InternalDeployModelParser.g:295:3: ( (lv_mode_9_0= ruleImplementationModeType ) )
            // InternalDeployModelParser.g:296:4: (lv_mode_9_0= ruleImplementationModeType )
            {
            // InternalDeployModelParser.g:296:4: (lv_mode_9_0= ruleImplementationModeType )
            // InternalDeployModelParser.g:297:5: lv_mode_9_0= ruleImplementationModeType
            {

            					newCompositeNode(grammarAccess.getMonolithicImplementationDescriptionAccess().getModeImplementationModeTypeEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_12);
            lv_mode_9_0=ruleImplementationModeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonolithicImplementationDescriptionRule());
            					}
            					set(
            						current,
            						"mode",
            						lv_mode_9_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.ImplementationModeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,Branch,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getMonolithicImplementationDescriptionAccess().getBranchKeyword_9());
            		
            // InternalDeployModelParser.g:318:3: ( (lv_branch_11_0= ruleBranchType ) )
            // InternalDeployModelParser.g:319:4: (lv_branch_11_0= ruleBranchType )
            {
            // InternalDeployModelParser.g:319:4: (lv_branch_11_0= ruleBranchType )
            // InternalDeployModelParser.g:320:5: lv_branch_11_0= ruleBranchType
            {

            					newCompositeNode(grammarAccess.getMonolithicImplementationDescriptionAccess().getBranchBranchTypeParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_14);
            lv_branch_11_0=ruleBranchType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonolithicImplementationDescriptionRule());
            					}
            					set(
            						current,
            						"branch",
            						lv_branch_11_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.BranchType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeployModelParser.g:337:3: (otherlv_12= ImplementationArtifactDescription ( (lv_implementation_13_0= ruleNewImplementationArtifact ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ImplementationArtifactDescription) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDeployModelParser.g:338:4: otherlv_12= ImplementationArtifactDescription ( (lv_implementation_13_0= ruleNewImplementationArtifact ) )
                    {
                    otherlv_12=(Token)match(input,ImplementationArtifactDescription,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getMonolithicImplementationDescriptionAccess().getImplementationArtifactDescriptionKeyword_11_0());
                    			
                    // InternalDeployModelParser.g:342:4: ( (lv_implementation_13_0= ruleNewImplementationArtifact ) )
                    // InternalDeployModelParser.g:343:5: (lv_implementation_13_0= ruleNewImplementationArtifact )
                    {
                    // InternalDeployModelParser.g:343:5: (lv_implementation_13_0= ruleNewImplementationArtifact )
                    // InternalDeployModelParser.g:344:6: lv_implementation_13_0= ruleNewImplementationArtifact
                    {

                    						newCompositeNode(grammarAccess.getMonolithicImplementationDescriptionAccess().getImplementationNewImplementationArtifactParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_implementation_13_0=ruleNewImplementationArtifact();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMonolithicImplementationDescriptionRule());
                    						}
                    						set(
                    							current,
                    							"implementation",
                    							lv_implementation_13_0,
                    							"de.fraunhofer.ipa.deployment.DeployModel.NewImplementationArtifact");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_14, grammarAccess.getMonolithicImplementationDescriptionAccess().getDEDENTTerminalRuleCall_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMonolithicImplementationDescription"


    // $ANTLR start "entryRuleBranchType"
    // InternalDeployModelParser.g:370:1: entryRuleBranchType returns [String current=null] : iv_ruleBranchType= ruleBranchType EOF ;
    public final String entryRuleBranchType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBranchType = null;


        try {
            // InternalDeployModelParser.g:370:50: (iv_ruleBranchType= ruleBranchType EOF )
            // InternalDeployModelParser.g:371:2: iv_ruleBranchType= ruleBranchType EOF
            {
             newCompositeNode(grammarAccess.getBranchTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBranchType=ruleBranchType();

            state._fsp--;

             current =iv_ruleBranchType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBranchType"


    // $ANTLR start "ruleBranchType"
    // InternalDeployModelParser.g:377:1: ruleBranchType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | kw= Any ) ;
    public final AntlrDatatypeRuleToken ruleBranchType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:383:2: ( (this_STRING_0= RULE_STRING | kw= Any ) )
            // InternalDeployModelParser.g:384:2: (this_STRING_0= RULE_STRING | kw= Any )
            {
            // InternalDeployModelParser.g:384:2: (this_STRING_0= RULE_STRING | kw= Any )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==Any) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDeployModelParser.g:385:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getBranchTypeAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:393:3: kw= Any
                    {
                    kw=(Token)match(input,Any,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBranchTypeAccess().getAnyKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBranchType"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDeployModelParser.g:402:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalDeployModelParser.g:402:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDeployModelParser.g:403:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalDeployModelParser.g:409:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:415:2: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) )
            // InternalDeployModelParser.g:416:2: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            {
            // InternalDeployModelParser.g:416:2: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            // InternalDeployModelParser.g:417:3: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalDeployModelParser.g:424:3: (kw= FullStop this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==FullStop) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDeployModelParser.g:425:4: kw= FullStop this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleNewImplementationArtifact"
    // InternalDeployModelParser.g:442:1: entryRuleNewImplementationArtifact returns [EObject current=null] : iv_ruleNewImplementationArtifact= ruleNewImplementationArtifact EOF ;
    public final EObject entryRuleNewImplementationArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewImplementationArtifact = null;


        try {
            // InternalDeployModelParser.g:442:66: (iv_ruleNewImplementationArtifact= ruleNewImplementationArtifact EOF )
            // InternalDeployModelParser.g:443:2: iv_ruleNewImplementationArtifact= ruleNewImplementationArtifact EOF
            {
             newCompositeNode(grammarAccess.getNewImplementationArtifactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNewImplementationArtifact=ruleNewImplementationArtifact();

            state._fsp--;

             current =iv_ruleNewImplementationArtifact; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNewImplementationArtifact"


    // $ANTLR start "ruleNewImplementationArtifact"
    // InternalDeployModelParser.g:449:1: ruleNewImplementationArtifact returns [EObject current=null] : (this_INDENT_0= RULE_INDENT otherlv_1= Location ( ( (lv_location_2_1= RULE_STRING | lv_location_2_2= RULE_LOCALPATH | lv_location_2_3= RULE_URL ) ) ) otherlv_3= DeployRequirements ( (lv_deployRequirements_4_0= ruleDeploymentRequirements ) ) (otherlv_5= ResourceRequirements ( (lv_resourceRequirements_6_0= ruleResourceRequirements ) ) )? (otherlv_7= BuildRequirements ( (lv_buildRequirements_8_0= ruleBuildRequirements ) ) )? (otherlv_9= StartCommands ( (lv_startCommands_10_0= ruleMultiValueList ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
    public final EObject ruleNewImplementationArtifact() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_0=null;
        Token otherlv_1=null;
        Token lv_location_2_1=null;
        Token lv_location_2_2=null;
        Token lv_location_2_3=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token this_DEDENT_11=null;
        EObject lv_deployRequirements_4_0 = null;

        EObject lv_resourceRequirements_6_0 = null;

        EObject lv_buildRequirements_8_0 = null;

        EObject lv_startCommands_10_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:455:2: ( (this_INDENT_0= RULE_INDENT otherlv_1= Location ( ( (lv_location_2_1= RULE_STRING | lv_location_2_2= RULE_LOCALPATH | lv_location_2_3= RULE_URL ) ) ) otherlv_3= DeployRequirements ( (lv_deployRequirements_4_0= ruleDeploymentRequirements ) ) (otherlv_5= ResourceRequirements ( (lv_resourceRequirements_6_0= ruleResourceRequirements ) ) )? (otherlv_7= BuildRequirements ( (lv_buildRequirements_8_0= ruleBuildRequirements ) ) )? (otherlv_9= StartCommands ( (lv_startCommands_10_0= ruleMultiValueList ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeployModelParser.g:456:2: (this_INDENT_0= RULE_INDENT otherlv_1= Location ( ( (lv_location_2_1= RULE_STRING | lv_location_2_2= RULE_LOCALPATH | lv_location_2_3= RULE_URL ) ) ) otherlv_3= DeployRequirements ( (lv_deployRequirements_4_0= ruleDeploymentRequirements ) ) (otherlv_5= ResourceRequirements ( (lv_resourceRequirements_6_0= ruleResourceRequirements ) ) )? (otherlv_7= BuildRequirements ( (lv_buildRequirements_8_0= ruleBuildRequirements ) ) )? (otherlv_9= StartCommands ( (lv_startCommands_10_0= ruleMultiValueList ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:456:2: (this_INDENT_0= RULE_INDENT otherlv_1= Location ( ( (lv_location_2_1= RULE_STRING | lv_location_2_2= RULE_LOCALPATH | lv_location_2_3= RULE_URL ) ) ) otherlv_3= DeployRequirements ( (lv_deployRequirements_4_0= ruleDeploymentRequirements ) ) (otherlv_5= ResourceRequirements ( (lv_resourceRequirements_6_0= ruleResourceRequirements ) ) )? (otherlv_7= BuildRequirements ( (lv_buildRequirements_8_0= ruleBuildRequirements ) ) )? (otherlv_9= StartCommands ( (lv_startCommands_10_0= ruleMultiValueList ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeployModelParser.g:457:3: this_INDENT_0= RULE_INDENT otherlv_1= Location ( ( (lv_location_2_1= RULE_STRING | lv_location_2_2= RULE_LOCALPATH | lv_location_2_3= RULE_URL ) ) ) otherlv_3= DeployRequirements ( (lv_deployRequirements_4_0= ruleDeploymentRequirements ) ) (otherlv_5= ResourceRequirements ( (lv_resourceRequirements_6_0= ruleResourceRequirements ) ) )? (otherlv_7= BuildRequirements ( (lv_buildRequirements_8_0= ruleBuildRequirements ) ) )? (otherlv_9= StartCommands ( (lv_startCommands_10_0= ruleMultiValueList ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            this_INDENT_0=(Token)match(input,RULE_INDENT,FOLLOW_17); 

            			newLeafNode(this_INDENT_0, grammarAccess.getNewImplementationArtifactAccess().getINDENTTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,Location,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getNewImplementationArtifactAccess().getLocationKeyword_1());
            		
            // InternalDeployModelParser.g:465:3: ( ( (lv_location_2_1= RULE_STRING | lv_location_2_2= RULE_LOCALPATH | lv_location_2_3= RULE_URL ) ) )
            // InternalDeployModelParser.g:466:4: ( (lv_location_2_1= RULE_STRING | lv_location_2_2= RULE_LOCALPATH | lv_location_2_3= RULE_URL ) )
            {
            // InternalDeployModelParser.g:466:4: ( (lv_location_2_1= RULE_STRING | lv_location_2_2= RULE_LOCALPATH | lv_location_2_3= RULE_URL ) )
            // InternalDeployModelParser.g:467:5: (lv_location_2_1= RULE_STRING | lv_location_2_2= RULE_LOCALPATH | lv_location_2_3= RULE_URL )
            {
            // InternalDeployModelParser.g:467:5: (lv_location_2_1= RULE_STRING | lv_location_2_2= RULE_LOCALPATH | lv_location_2_3= RULE_URL )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case RULE_LOCALPATH:
                {
                alt7=2;
                }
                break;
            case RULE_URL:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDeployModelParser.g:468:6: lv_location_2_1= RULE_STRING
                    {
                    lv_location_2_1=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    						newLeafNode(lv_location_2_1, grammarAccess.getNewImplementationArtifactAccess().getLocationSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNewImplementationArtifactRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"location",
                    							lv_location_2_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:483:6: lv_location_2_2= RULE_LOCALPATH
                    {
                    lv_location_2_2=(Token)match(input,RULE_LOCALPATH,FOLLOW_19); 

                    						newLeafNode(lv_location_2_2, grammarAccess.getNewImplementationArtifactAccess().getLocationLOCALPATHTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNewImplementationArtifactRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"location",
                    							lv_location_2_2,
                    							"de.fraunhofer.ipa.deployment.DeployModel.LOCALPATH");
                    					

                    }
                    break;
                case 3 :
                    // InternalDeployModelParser.g:498:6: lv_location_2_3= RULE_URL
                    {
                    lv_location_2_3=(Token)match(input,RULE_URL,FOLLOW_19); 

                    						newLeafNode(lv_location_2_3, grammarAccess.getNewImplementationArtifactAccess().getLocationURLTerminalRuleCall_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNewImplementationArtifactRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"location",
                    							lv_location_2_3,
                    							"de.fraunhofer.ipa.deployment.DeployModel.URL");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,DeployRequirements,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getNewImplementationArtifactAccess().getDeployRequirementsKeyword_3());
            		
            // InternalDeployModelParser.g:519:3: ( (lv_deployRequirements_4_0= ruleDeploymentRequirements ) )
            // InternalDeployModelParser.g:520:4: (lv_deployRequirements_4_0= ruleDeploymentRequirements )
            {
            // InternalDeployModelParser.g:520:4: (lv_deployRequirements_4_0= ruleDeploymentRequirements )
            // InternalDeployModelParser.g:521:5: lv_deployRequirements_4_0= ruleDeploymentRequirements
            {

            					newCompositeNode(grammarAccess.getNewImplementationArtifactAccess().getDeployRequirementsDeploymentRequirementsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_deployRequirements_4_0=ruleDeploymentRequirements();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNewImplementationArtifactRule());
            					}
            					set(
            						current,
            						"deployRequirements",
            						lv_deployRequirements_4_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.DeploymentRequirements");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeployModelParser.g:538:3: (otherlv_5= ResourceRequirements ( (lv_resourceRequirements_6_0= ruleResourceRequirements ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ResourceRequirements) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDeployModelParser.g:539:4: otherlv_5= ResourceRequirements ( (lv_resourceRequirements_6_0= ruleResourceRequirements ) )
                    {
                    otherlv_5=(Token)match(input,ResourceRequirements,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getNewImplementationArtifactAccess().getResourceRequirementsKeyword_5_0());
                    			
                    // InternalDeployModelParser.g:543:4: ( (lv_resourceRequirements_6_0= ruleResourceRequirements ) )
                    // InternalDeployModelParser.g:544:5: (lv_resourceRequirements_6_0= ruleResourceRequirements )
                    {
                    // InternalDeployModelParser.g:544:5: (lv_resourceRequirements_6_0= ruleResourceRequirements )
                    // InternalDeployModelParser.g:545:6: lv_resourceRequirements_6_0= ruleResourceRequirements
                    {

                    						newCompositeNode(grammarAccess.getNewImplementationArtifactAccess().getResourceRequirementsResourceRequirementsParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_resourceRequirements_6_0=ruleResourceRequirements();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNewImplementationArtifactRule());
                    						}
                    						set(
                    							current,
                    							"resourceRequirements",
                    							lv_resourceRequirements_6_0,
                    							"de.fraunhofer.ipa.deployment.DeployModel.ResourceRequirements");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDeployModelParser.g:563:3: (otherlv_7= BuildRequirements ( (lv_buildRequirements_8_0= ruleBuildRequirements ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==BuildRequirements) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDeployModelParser.g:564:4: otherlv_7= BuildRequirements ( (lv_buildRequirements_8_0= ruleBuildRequirements ) )
                    {
                    otherlv_7=(Token)match(input,BuildRequirements,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getNewImplementationArtifactAccess().getBuildRequirementsKeyword_6_0());
                    			
                    // InternalDeployModelParser.g:568:4: ( (lv_buildRequirements_8_0= ruleBuildRequirements ) )
                    // InternalDeployModelParser.g:569:5: (lv_buildRequirements_8_0= ruleBuildRequirements )
                    {
                    // InternalDeployModelParser.g:569:5: (lv_buildRequirements_8_0= ruleBuildRequirements )
                    // InternalDeployModelParser.g:570:6: lv_buildRequirements_8_0= ruleBuildRequirements
                    {

                    						newCompositeNode(grammarAccess.getNewImplementationArtifactAccess().getBuildRequirementsBuildRequirementsParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_buildRequirements_8_0=ruleBuildRequirements();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNewImplementationArtifactRule());
                    						}
                    						set(
                    							current,
                    							"buildRequirements",
                    							lv_buildRequirements_8_0,
                    							"de.fraunhofer.ipa.deployment.DeployModel.BuildRequirements");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDeployModelParser.g:588:3: (otherlv_9= StartCommands ( (lv_startCommands_10_0= ruleMultiValueList ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==StartCommands) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDeployModelParser.g:589:4: otherlv_9= StartCommands ( (lv_startCommands_10_0= ruleMultiValueList ) )
                    {
                    otherlv_9=(Token)match(input,StartCommands,FOLLOW_23); 

                    				newLeafNode(otherlv_9, grammarAccess.getNewImplementationArtifactAccess().getStartCommandsKeyword_7_0());
                    			
                    // InternalDeployModelParser.g:593:4: ( (lv_startCommands_10_0= ruleMultiValueList ) )
                    // InternalDeployModelParser.g:594:5: (lv_startCommands_10_0= ruleMultiValueList )
                    {
                    // InternalDeployModelParser.g:594:5: (lv_startCommands_10_0= ruleMultiValueList )
                    // InternalDeployModelParser.g:595:6: lv_startCommands_10_0= ruleMultiValueList
                    {

                    						newCompositeNode(grammarAccess.getNewImplementationArtifactAccess().getStartCommandsMultiValueListParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_startCommands_10_0=ruleMultiValueList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNewImplementationArtifactRule());
                    						}
                    						set(
                    							current,
                    							"startCommands",
                    							lv_startCommands_10_0,
                    							"de.fraunhofer.ipa.deployment.DeployModel.MultiValueList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_DEDENT_11=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_11, grammarAccess.getNewImplementationArtifactAccess().getDEDENTTerminalRuleCall_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNewImplementationArtifact"


    // $ANTLR start "entryRuleImplementationArtifactDescription"
    // InternalDeployModelParser.g:621:1: entryRuleImplementationArtifactDescription returns [EObject current=null] : iv_ruleImplementationArtifactDescription= ruleImplementationArtifactDescription EOF ;
    public final EObject entryRuleImplementationArtifactDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationArtifactDescription = null;


        try {
            // InternalDeployModelParser.g:621:74: (iv_ruleImplementationArtifactDescription= ruleImplementationArtifactDescription EOF )
            // InternalDeployModelParser.g:622:2: iv_ruleImplementationArtifactDescription= ruleImplementationArtifactDescription EOF
            {
             newCompositeNode(grammarAccess.getImplementationArtifactDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementationArtifactDescription=ruleImplementationArtifactDescription();

            state._fsp--;

             current =iv_ruleImplementationArtifactDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplementationArtifactDescription"


    // $ANTLR start "ruleImplementationArtifactDescription"
    // InternalDeployModelParser.g:628:1: ruleImplementationArtifactDescription returns [EObject current=null] : (this_INDENT_0= RULE_INDENT ( ( (lv_impl_1_1= ruleNewImplementationArtifact | lv_impl_1_2= ruleReuseImplementationArtifact ) ) ) this_DEDENT_2= RULE_DEDENT ) ;
    public final EObject ruleImplementationArtifactDescription() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_0=null;
        Token this_DEDENT_2=null;
        EObject lv_impl_1_1 = null;

        EObject lv_impl_1_2 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:634:2: ( (this_INDENT_0= RULE_INDENT ( ( (lv_impl_1_1= ruleNewImplementationArtifact | lv_impl_1_2= ruleReuseImplementationArtifact ) ) ) this_DEDENT_2= RULE_DEDENT ) )
            // InternalDeployModelParser.g:635:2: (this_INDENT_0= RULE_INDENT ( ( (lv_impl_1_1= ruleNewImplementationArtifact | lv_impl_1_2= ruleReuseImplementationArtifact ) ) ) this_DEDENT_2= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:635:2: (this_INDENT_0= RULE_INDENT ( ( (lv_impl_1_1= ruleNewImplementationArtifact | lv_impl_1_2= ruleReuseImplementationArtifact ) ) ) this_DEDENT_2= RULE_DEDENT )
            // InternalDeployModelParser.g:636:3: this_INDENT_0= RULE_INDENT ( ( (lv_impl_1_1= ruleNewImplementationArtifact | lv_impl_1_2= ruleReuseImplementationArtifact ) ) ) this_DEDENT_2= RULE_DEDENT
            {
            this_INDENT_0=(Token)match(input,RULE_INDENT,FOLLOW_24); 

            			newLeafNode(this_INDENT_0, grammarAccess.getImplementationArtifactDescriptionAccess().getINDENTTerminalRuleCall_0());
            		
            // InternalDeployModelParser.g:640:3: ( ( (lv_impl_1_1= ruleNewImplementationArtifact | lv_impl_1_2= ruleReuseImplementationArtifact ) ) )
            // InternalDeployModelParser.g:641:4: ( (lv_impl_1_1= ruleNewImplementationArtifact | lv_impl_1_2= ruleReuseImplementationArtifact ) )
            {
            // InternalDeployModelParser.g:641:4: ( (lv_impl_1_1= ruleNewImplementationArtifact | lv_impl_1_2= ruleReuseImplementationArtifact ) )
            // InternalDeployModelParser.g:642:5: (lv_impl_1_1= ruleNewImplementationArtifact | lv_impl_1_2= ruleReuseImplementationArtifact )
            {
            // InternalDeployModelParser.g:642:5: (lv_impl_1_1= ruleNewImplementationArtifact | lv_impl_1_2= ruleReuseImplementationArtifact )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INDENT) ) {
                alt11=1;
            }
            else if ( (LA11_0==Use) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDeployModelParser.g:643:6: lv_impl_1_1= ruleNewImplementationArtifact
                    {

                    						newCompositeNode(grammarAccess.getImplementationArtifactDescriptionAccess().getImplNewImplementationArtifactParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_impl_1_1=ruleNewImplementationArtifact();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImplementationArtifactDescriptionRule());
                    						}
                    						set(
                    							current,
                    							"impl",
                    							lv_impl_1_1,
                    							"de.fraunhofer.ipa.deployment.DeployModel.NewImplementationArtifact");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:659:6: lv_impl_1_2= ruleReuseImplementationArtifact
                    {

                    						newCompositeNode(grammarAccess.getImplementationArtifactDescriptionAccess().getImplReuseImplementationArtifactParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_15);
                    lv_impl_1_2=ruleReuseImplementationArtifact();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImplementationArtifactDescriptionRule());
                    						}
                    						set(
                    							current,
                    							"impl",
                    							lv_impl_1_2,
                    							"de.fraunhofer.ipa.deployment.DeployModel.ReuseImplementationArtifact");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            this_DEDENT_2=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_2, grammarAccess.getImplementationArtifactDescriptionAccess().getDEDENTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplementationArtifactDescription"


    // $ANTLR start "entryRuleReuseImplementationArtifact"
    // InternalDeployModelParser.g:685:1: entryRuleReuseImplementationArtifact returns [EObject current=null] : iv_ruleReuseImplementationArtifact= ruleReuseImplementationArtifact EOF ;
    public final EObject entryRuleReuseImplementationArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReuseImplementationArtifact = null;


        try {
            // InternalDeployModelParser.g:685:68: (iv_ruleReuseImplementationArtifact= ruleReuseImplementationArtifact EOF )
            // InternalDeployModelParser.g:686:2: iv_ruleReuseImplementationArtifact= ruleReuseImplementationArtifact EOF
            {
             newCompositeNode(grammarAccess.getReuseImplementationArtifactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReuseImplementationArtifact=ruleReuseImplementationArtifact();

            state._fsp--;

             current =iv_ruleReuseImplementationArtifact; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReuseImplementationArtifact"


    // $ANTLR start "ruleReuseImplementationArtifact"
    // InternalDeployModelParser.g:692:1: ruleReuseImplementationArtifact returns [EObject current=null] : (otherlv_0= Use ( (lv_lists_1_0= ruleImplementationArtifactAbstract ) )+ ) ;
    public final EObject ruleReuseImplementationArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_lists_1_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:698:2: ( (otherlv_0= Use ( (lv_lists_1_0= ruleImplementationArtifactAbstract ) )+ ) )
            // InternalDeployModelParser.g:699:2: (otherlv_0= Use ( (lv_lists_1_0= ruleImplementationArtifactAbstract ) )+ )
            {
            // InternalDeployModelParser.g:699:2: (otherlv_0= Use ( (lv_lists_1_0= ruleImplementationArtifactAbstract ) )+ )
            // InternalDeployModelParser.g:700:3: otherlv_0= Use ( (lv_lists_1_0= ruleImplementationArtifactAbstract ) )+
            {
            otherlv_0=(Token)match(input,Use,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getReuseImplementationArtifactAccess().getUseKeyword_0());
            		
            // InternalDeployModelParser.g:704:3: ( (lv_lists_1_0= ruleImplementationArtifactAbstract ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==HyphenMinus) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDeployModelParser.g:705:4: (lv_lists_1_0= ruleImplementationArtifactAbstract )
            	    {
            	    // InternalDeployModelParser.g:705:4: (lv_lists_1_0= ruleImplementationArtifactAbstract )
            	    // InternalDeployModelParser.g:706:5: lv_lists_1_0= ruleImplementationArtifactAbstract
            	    {

            	    					newCompositeNode(grammarAccess.getReuseImplementationArtifactAccess().getListsImplementationArtifactAbstractParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_lists_1_0=ruleImplementationArtifactAbstract();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReuseImplementationArtifactRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lists",
            	    						lv_lists_1_0,
            	    						"de.fraunhofer.ipa.deployment.DeployModel.ImplementationArtifactAbstract");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReuseImplementationArtifact"


    // $ANTLR start "entryRuleImplementationArtifactAbstract"
    // InternalDeployModelParser.g:727:1: entryRuleImplementationArtifactAbstract returns [EObject current=null] : iv_ruleImplementationArtifactAbstract= ruleImplementationArtifactAbstract EOF ;
    public final EObject entryRuleImplementationArtifactAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationArtifactAbstract = null;


        try {
            // InternalDeployModelParser.g:727:71: (iv_ruleImplementationArtifactAbstract= ruleImplementationArtifactAbstract EOF )
            // InternalDeployModelParser.g:728:2: iv_ruleImplementationArtifactAbstract= ruleImplementationArtifactAbstract EOF
            {
             newCompositeNode(grammarAccess.getImplementationArtifactAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementationArtifactAbstract=ruleImplementationArtifactAbstract();

            state._fsp--;

             current =iv_ruleImplementationArtifactAbstract; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplementationArtifactAbstract"


    // $ANTLR start "ruleImplementationArtifactAbstract"
    // InternalDeployModelParser.g:734:1: ruleImplementationArtifactAbstract returns [EObject current=null] : ( rulePreListElement otherlv_1= Import ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) this_INDENT_3= RULE_INDENT otherlv_4= Name ( ( ruleQualifiedName ) ) (otherlv_6= StartCommands ( (lv_startCommands_7_0= ruleMultiValueList ) ) )? this_DEDENT_8= RULE_DEDENT ) ;
    public final EObject ruleImplementationArtifactAbstract() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_DEDENT_8=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        EObject lv_startCommands_7_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:740:2: ( ( rulePreListElement otherlv_1= Import ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) this_INDENT_3= RULE_INDENT otherlv_4= Name ( ( ruleQualifiedName ) ) (otherlv_6= StartCommands ( (lv_startCommands_7_0= ruleMultiValueList ) ) )? this_DEDENT_8= RULE_DEDENT ) )
            // InternalDeployModelParser.g:741:2: ( rulePreListElement otherlv_1= Import ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) this_INDENT_3= RULE_INDENT otherlv_4= Name ( ( ruleQualifiedName ) ) (otherlv_6= StartCommands ( (lv_startCommands_7_0= ruleMultiValueList ) ) )? this_DEDENT_8= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:741:2: ( rulePreListElement otherlv_1= Import ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) this_INDENT_3= RULE_INDENT otherlv_4= Name ( ( ruleQualifiedName ) ) (otherlv_6= StartCommands ( (lv_startCommands_7_0= ruleMultiValueList ) ) )? this_DEDENT_8= RULE_DEDENT )
            // InternalDeployModelParser.g:742:3: rulePreListElement otherlv_1= Import ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) this_INDENT_3= RULE_INDENT otherlv_4= Name ( ( ruleQualifiedName ) ) (otherlv_6= StartCommands ( (lv_startCommands_7_0= ruleMultiValueList ) ) )? this_DEDENT_8= RULE_DEDENT
            {

            			newCompositeNode(grammarAccess.getImplementationArtifactAbstractAccess().getPreListElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,Import,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getImplementationArtifactAbstractAccess().getImportKeyword_1());
            		
            // InternalDeployModelParser.g:753:3: ( (lv_importedNamespace_2_0= ruleQualifiedName ) )
            // InternalDeployModelParser.g:754:4: (lv_importedNamespace_2_0= ruleQualifiedName )
            {
            // InternalDeployModelParser.g:754:4: (lv_importedNamespace_2_0= ruleQualifiedName )
            // InternalDeployModelParser.g:755:5: lv_importedNamespace_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getImplementationArtifactAbstractAccess().getImportedNamespaceQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_importedNamespace_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImplementationArtifactAbstractRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_2_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_5); 

            			newLeafNode(this_INDENT_3, grammarAccess.getImplementationArtifactAbstractAccess().getINDENTTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getImplementationArtifactAbstractAccess().getNameKeyword_4());
            		
            // InternalDeployModelParser.g:780:3: ( ( ruleQualifiedName ) )
            // InternalDeployModelParser.g:781:4: ( ruleQualifiedName )
            {
            // InternalDeployModelParser.g:781:4: ( ruleQualifiedName )
            // InternalDeployModelParser.g:782:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImplementationArtifactAbstractRule());
            					}
            				

            					newCompositeNode(grammarAccess.getImplementationArtifactAbstractAccess().getNameMonolithicImplementationDescriptionCrossReference_5_0());
            				
            pushFollow(FOLLOW_22);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeployModelParser.g:796:3: (otherlv_6= StartCommands ( (lv_startCommands_7_0= ruleMultiValueList ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==StartCommands) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDeployModelParser.g:797:4: otherlv_6= StartCommands ( (lv_startCommands_7_0= ruleMultiValueList ) )
                    {
                    otherlv_6=(Token)match(input,StartCommands,FOLLOW_23); 

                    				newLeafNode(otherlv_6, grammarAccess.getImplementationArtifactAbstractAccess().getStartCommandsKeyword_6_0());
                    			
                    // InternalDeployModelParser.g:801:4: ( (lv_startCommands_7_0= ruleMultiValueList ) )
                    // InternalDeployModelParser.g:802:5: (lv_startCommands_7_0= ruleMultiValueList )
                    {
                    // InternalDeployModelParser.g:802:5: (lv_startCommands_7_0= ruleMultiValueList )
                    // InternalDeployModelParser.g:803:6: lv_startCommands_7_0= ruleMultiValueList
                    {

                    						newCompositeNode(grammarAccess.getImplementationArtifactAbstractAccess().getStartCommandsMultiValueListParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_startCommands_7_0=ruleMultiValueList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImplementationArtifactAbstractRule());
                    						}
                    						set(
                    							current,
                    							"startCommands",
                    							lv_startCommands_7_0,
                    							"de.fraunhofer.ipa.deployment.DeployModel.MultiValueList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_DEDENT_8=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_8, grammarAccess.getImplementationArtifactAbstractAccess().getDEDENTTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplementationArtifactAbstract"


    // $ANTLR start "entryRuleDeploymentRequirements"
    // InternalDeployModelParser.g:829:1: entryRuleDeploymentRequirements returns [EObject current=null] : iv_ruleDeploymentRequirements= ruleDeploymentRequirements EOF ;
    public final EObject entryRuleDeploymentRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploymentRequirements = null;


        try {
            // InternalDeployModelParser.g:829:63: (iv_ruleDeploymentRequirements= ruleDeploymentRequirements EOF )
            // InternalDeployModelParser.g:830:2: iv_ruleDeploymentRequirements= ruleDeploymentRequirements EOF
            {
             newCompositeNode(grammarAccess.getDeploymentRequirementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeploymentRequirements=ruleDeploymentRequirements();

            state._fsp--;

             current =iv_ruleDeploymentRequirements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeploymentRequirements"


    // $ANTLR start "ruleDeploymentRequirements"
    // InternalDeployModelParser.g:836:1: ruleDeploymentRequirements returns [EObject current=null] : ( () this_INDENT_1= RULE_INDENT ( (lv_requirements_2_0= rulePropertyExpressType ) )+ this_DEDENT_3= RULE_DEDENT ) ;
    public final EObject ruleDeploymentRequirements() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_1=null;
        Token this_DEDENT_3=null;
        EObject lv_requirements_2_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:842:2: ( ( () this_INDENT_1= RULE_INDENT ( (lv_requirements_2_0= rulePropertyExpressType ) )+ this_DEDENT_3= RULE_DEDENT ) )
            // InternalDeployModelParser.g:843:2: ( () this_INDENT_1= RULE_INDENT ( (lv_requirements_2_0= rulePropertyExpressType ) )+ this_DEDENT_3= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:843:2: ( () this_INDENT_1= RULE_INDENT ( (lv_requirements_2_0= rulePropertyExpressType ) )+ this_DEDENT_3= RULE_DEDENT )
            // InternalDeployModelParser.g:844:3: () this_INDENT_1= RULE_INDENT ( (lv_requirements_2_0= rulePropertyExpressType ) )+ this_DEDENT_3= RULE_DEDENT
            {
            // InternalDeployModelParser.g:844:3: ()
            // InternalDeployModelParser.g:845:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeploymentRequirementsAccess().getDeploymentRequirementsAction_0(),
            					current);
            			

            }

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_25); 

            			newLeafNode(this_INDENT_1, grammarAccess.getDeploymentRequirementsAccess().getINDENTTerminalRuleCall_1());
            		
            // InternalDeployModelParser.g:855:3: ( (lv_requirements_2_0= rulePropertyExpressType ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==HyphenMinus) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDeployModelParser.g:856:4: (lv_requirements_2_0= rulePropertyExpressType )
            	    {
            	    // InternalDeployModelParser.g:856:4: (lv_requirements_2_0= rulePropertyExpressType )
            	    // InternalDeployModelParser.g:857:5: lv_requirements_2_0= rulePropertyExpressType
            	    {

            	    					newCompositeNode(grammarAccess.getDeploymentRequirementsAccess().getRequirementsPropertyExpressTypeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_requirements_2_0=rulePropertyExpressType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeploymentRequirementsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"requirements",
            	    						lv_requirements_2_0,
            	    						"de.fraunhofer.ipa.deployment.DeployModel.PropertyExpressType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            this_DEDENT_3=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_3, grammarAccess.getDeploymentRequirementsAccess().getDEDENTTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeploymentRequirements"


    // $ANTLR start "entryRuleResourceRequirements"
    // InternalDeployModelParser.g:882:1: entryRuleResourceRequirements returns [EObject current=null] : iv_ruleResourceRequirements= ruleResourceRequirements EOF ;
    public final EObject entryRuleResourceRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceRequirements = null;


        try {
            // InternalDeployModelParser.g:882:61: (iv_ruleResourceRequirements= ruleResourceRequirements EOF )
            // InternalDeployModelParser.g:883:2: iv_ruleResourceRequirements= ruleResourceRequirements EOF
            {
             newCompositeNode(grammarAccess.getResourceRequirementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResourceRequirements=ruleResourceRequirements();

            state._fsp--;

             current =iv_ruleResourceRequirements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResourceRequirements"


    // $ANTLR start "ruleResourceRequirements"
    // InternalDeployModelParser.g:889:1: ruleResourceRequirements returns [EObject current=null] : ( () this_INDENT_1= RULE_INDENT ( (lv_requirements_2_0= rulePropertyExpressType ) )+ this_DEDENT_3= RULE_DEDENT ) ;
    public final EObject ruleResourceRequirements() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_1=null;
        Token this_DEDENT_3=null;
        EObject lv_requirements_2_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:895:2: ( ( () this_INDENT_1= RULE_INDENT ( (lv_requirements_2_0= rulePropertyExpressType ) )+ this_DEDENT_3= RULE_DEDENT ) )
            // InternalDeployModelParser.g:896:2: ( () this_INDENT_1= RULE_INDENT ( (lv_requirements_2_0= rulePropertyExpressType ) )+ this_DEDENT_3= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:896:2: ( () this_INDENT_1= RULE_INDENT ( (lv_requirements_2_0= rulePropertyExpressType ) )+ this_DEDENT_3= RULE_DEDENT )
            // InternalDeployModelParser.g:897:3: () this_INDENT_1= RULE_INDENT ( (lv_requirements_2_0= rulePropertyExpressType ) )+ this_DEDENT_3= RULE_DEDENT
            {
            // InternalDeployModelParser.g:897:3: ()
            // InternalDeployModelParser.g:898:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getResourceRequirementsAccess().getResourceRequirementsAction_0(),
            					current);
            			

            }

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_25); 

            			newLeafNode(this_INDENT_1, grammarAccess.getResourceRequirementsAccess().getINDENTTerminalRuleCall_1());
            		
            // InternalDeployModelParser.g:908:3: ( (lv_requirements_2_0= rulePropertyExpressType ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==HyphenMinus) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDeployModelParser.g:909:4: (lv_requirements_2_0= rulePropertyExpressType )
            	    {
            	    // InternalDeployModelParser.g:909:4: (lv_requirements_2_0= rulePropertyExpressType )
            	    // InternalDeployModelParser.g:910:5: lv_requirements_2_0= rulePropertyExpressType
            	    {

            	    					newCompositeNode(grammarAccess.getResourceRequirementsAccess().getRequirementsPropertyExpressTypeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_requirements_2_0=rulePropertyExpressType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getResourceRequirementsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"requirements",
            	    						lv_requirements_2_0,
            	    						"de.fraunhofer.ipa.deployment.DeployModel.PropertyExpressType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            this_DEDENT_3=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_3, grammarAccess.getResourceRequirementsAccess().getDEDENTTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResourceRequirements"


    // $ANTLR start "entryRulePropertyExpressType"
    // InternalDeployModelParser.g:935:1: entryRulePropertyExpressType returns [EObject current=null] : iv_rulePropertyExpressType= rulePropertyExpressType EOF ;
    public final EObject entryRulePropertyExpressType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyExpressType = null;


        try {
            // InternalDeployModelParser.g:935:60: (iv_rulePropertyExpressType= rulePropertyExpressType EOF )
            // InternalDeployModelParser.g:936:2: iv_rulePropertyExpressType= rulePropertyExpressType EOF
            {
             newCompositeNode(grammarAccess.getPropertyExpressTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyExpressType=rulePropertyExpressType();

            state._fsp--;

             current =iv_rulePropertyExpressType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyExpressType"


    // $ANTLR start "rulePropertyExpressType"
    // InternalDeployModelParser.g:942:1: rulePropertyExpressType returns [EObject current=null] : (this_CommonPropertySingleValue_0= ruleCommonPropertySingleValue | this_CommonPropertyMultiValue_1= ruleCommonPropertyMultiValue ) ;
    public final EObject rulePropertyExpressType() throws RecognitionException {
        EObject current = null;

        EObject this_CommonPropertySingleValue_0 = null;

        EObject this_CommonPropertyMultiValue_1 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:948:2: ( (this_CommonPropertySingleValue_0= ruleCommonPropertySingleValue | this_CommonPropertyMultiValue_1= ruleCommonPropertyMultiValue ) )
            // InternalDeployModelParser.g:949:2: (this_CommonPropertySingleValue_0= ruleCommonPropertySingleValue | this_CommonPropertyMultiValue_1= ruleCommonPropertyMultiValue )
            {
            // InternalDeployModelParser.g:949:2: (this_CommonPropertySingleValue_0= ruleCommonPropertySingleValue | this_CommonPropertyMultiValue_1= ruleCommonPropertyMultiValue )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==HyphenMinus) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==Name) ) {
                    int LA16_2 = input.LA(3);

                    if ( (LA16_2==RULE_ID) ) {
                        int LA16_3 = input.LA(4);

                        if ( (LA16_3==RULE_INDENT) ) {
                            int LA16_4 = input.LA(5);

                            if ( (LA16_4==Value) ) {
                                int LA16_5 = input.LA(6);

                                if ( (LA16_5==LeftSquareBracket||LA16_5==RULE_INDENT) ) {
                                    alt16=2;
                                }
                                else if ( ((LA16_5>=RULE_INT && LA16_5<=RULE_FLOAT)||(LA16_5>=RULE_ID && LA16_5<=RULE_STRING)) ) {
                                    alt16=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 16, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 16, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalDeployModelParser.g:950:3: this_CommonPropertySingleValue_0= ruleCommonPropertySingleValue
                    {

                    			newCompositeNode(grammarAccess.getPropertyExpressTypeAccess().getCommonPropertySingleValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommonPropertySingleValue_0=ruleCommonPropertySingleValue();

                    state._fsp--;


                    			current = this_CommonPropertySingleValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:959:3: this_CommonPropertyMultiValue_1= ruleCommonPropertyMultiValue
                    {

                    			newCompositeNode(grammarAccess.getPropertyExpressTypeAccess().getCommonPropertyMultiValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommonPropertyMultiValue_1=ruleCommonPropertyMultiValue();

                    state._fsp--;


                    			current = this_CommonPropertyMultiValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyExpressType"


    // $ANTLR start "entryRuleCommonPropertySingleValue"
    // InternalDeployModelParser.g:971:1: entryRuleCommonPropertySingleValue returns [EObject current=null] : iv_ruleCommonPropertySingleValue= ruleCommonPropertySingleValue EOF ;
    public final EObject entryRuleCommonPropertySingleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonPropertySingleValue = null;


        try {
            // InternalDeployModelParser.g:971:66: (iv_ruleCommonPropertySingleValue= ruleCommonPropertySingleValue EOF )
            // InternalDeployModelParser.g:972:2: iv_ruleCommonPropertySingleValue= ruleCommonPropertySingleValue EOF
            {
             newCompositeNode(grammarAccess.getCommonPropertySingleValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommonPropertySingleValue=ruleCommonPropertySingleValue();

            state._fsp--;

             current =iv_ruleCommonPropertySingleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommonPropertySingleValue"


    // $ANTLR start "ruleCommonPropertySingleValue"
    // InternalDeployModelParser.g:978:1: ruleCommonPropertySingleValue returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleValueTypes ) ) this_DEDENT_6= RULE_DEDENT ) ;
    public final EObject ruleCommonPropertySingleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token this_DEDENT_6=null;
        AntlrDatatypeRuleToken lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:984:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleValueTypes ) ) this_DEDENT_6= RULE_DEDENT ) )
            // InternalDeployModelParser.g:985:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleValueTypes ) ) this_DEDENT_6= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:985:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleValueTypes ) ) this_DEDENT_6= RULE_DEDENT )
            // InternalDeployModelParser.g:986:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleValueTypes ) ) this_DEDENT_6= RULE_DEDENT
            {

            			newCompositeNode(grammarAccess.getCommonPropertySingleValueAccess().getPreListElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCommonPropertySingleValueAccess().getNameKeyword_1());
            		
            // InternalDeployModelParser.g:997:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDeployModelParser.g:998:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDeployModelParser.g:998:4: (lv_name_2_0= RULE_ID )
            // InternalDeployModelParser.g:999:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCommonPropertySingleValueAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommonPropertySingleValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_29); 

            			newLeafNode(this_INDENT_3, grammarAccess.getCommonPropertySingleValueAccess().getINDENTTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Value,FOLLOW_30); 

            			newLeafNode(otherlv_4, grammarAccess.getCommonPropertySingleValueAccess().getValueKeyword_4());
            		
            // InternalDeployModelParser.g:1023:3: ( (lv_value_5_0= ruleValueTypes ) )
            // InternalDeployModelParser.g:1024:4: (lv_value_5_0= ruleValueTypes )
            {
            // InternalDeployModelParser.g:1024:4: (lv_value_5_0= ruleValueTypes )
            // InternalDeployModelParser.g:1025:5: lv_value_5_0= ruleValueTypes
            {

            					newCompositeNode(grammarAccess.getCommonPropertySingleValueAccess().getValueValueTypesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_value_5_0=ruleValueTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommonPropertySingleValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_5_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.ValueTypes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_DEDENT_6=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_6, grammarAccess.getCommonPropertySingleValueAccess().getDEDENTTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommonPropertySingleValue"


    // $ANTLR start "entryRuleCommonPropertyMultiValue"
    // InternalDeployModelParser.g:1050:1: entryRuleCommonPropertyMultiValue returns [EObject current=null] : iv_ruleCommonPropertyMultiValue= ruleCommonPropertyMultiValue EOF ;
    public final EObject entryRuleCommonPropertyMultiValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonPropertyMultiValue = null;


        try {
            // InternalDeployModelParser.g:1050:65: (iv_ruleCommonPropertyMultiValue= ruleCommonPropertyMultiValue EOF )
            // InternalDeployModelParser.g:1051:2: iv_ruleCommonPropertyMultiValue= ruleCommonPropertyMultiValue EOF
            {
             newCompositeNode(grammarAccess.getCommonPropertyMultiValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommonPropertyMultiValue=ruleCommonPropertyMultiValue();

            state._fsp--;

             current =iv_ruleCommonPropertyMultiValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommonPropertyMultiValue"


    // $ANTLR start "ruleCommonPropertyMultiValue"
    // InternalDeployModelParser.g:1057:1: ruleCommonPropertyMultiValue returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleMultiValueList ) ) this_DEDENT_6= RULE_DEDENT ) ;
    public final EObject ruleCommonPropertyMultiValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token this_DEDENT_6=null;
        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:1063:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleMultiValueList ) ) this_DEDENT_6= RULE_DEDENT ) )
            // InternalDeployModelParser.g:1064:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleMultiValueList ) ) this_DEDENT_6= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:1064:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleMultiValueList ) ) this_DEDENT_6= RULE_DEDENT )
            // InternalDeployModelParser.g:1065:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleMultiValueList ) ) this_DEDENT_6= RULE_DEDENT
            {

            			newCompositeNode(grammarAccess.getCommonPropertyMultiValueAccess().getPreListElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCommonPropertyMultiValueAccess().getNameKeyword_1());
            		
            // InternalDeployModelParser.g:1076:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDeployModelParser.g:1077:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDeployModelParser.g:1077:4: (lv_name_2_0= RULE_ID )
            // InternalDeployModelParser.g:1078:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCommonPropertyMultiValueAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommonPropertyMultiValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_29); 

            			newLeafNode(this_INDENT_3, grammarAccess.getCommonPropertyMultiValueAccess().getINDENTTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Value,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getCommonPropertyMultiValueAccess().getValueKeyword_4());
            		
            // InternalDeployModelParser.g:1102:3: ( (lv_value_5_0= ruleMultiValueList ) )
            // InternalDeployModelParser.g:1103:4: (lv_value_5_0= ruleMultiValueList )
            {
            // InternalDeployModelParser.g:1103:4: (lv_value_5_0= ruleMultiValueList )
            // InternalDeployModelParser.g:1104:5: lv_value_5_0= ruleMultiValueList
            {

            					newCompositeNode(grammarAccess.getCommonPropertyMultiValueAccess().getValueMultiValueListParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_value_5_0=ruleMultiValueList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommonPropertyMultiValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_5_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.MultiValueList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_DEDENT_6=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_6, grammarAccess.getCommonPropertyMultiValueAccess().getDEDENTTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommonPropertyMultiValue"


    // $ANTLR start "entryRuleMultiValueList"
    // InternalDeployModelParser.g:1129:1: entryRuleMultiValueList returns [EObject current=null] : iv_ruleMultiValueList= ruleMultiValueList EOF ;
    public final EObject entryRuleMultiValueList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiValueList = null;


        try {
            // InternalDeployModelParser.g:1129:55: (iv_ruleMultiValueList= ruleMultiValueList EOF )
            // InternalDeployModelParser.g:1130:2: iv_ruleMultiValueList= ruleMultiValueList EOF
            {
             newCompositeNode(grammarAccess.getMultiValueListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiValueList=ruleMultiValueList();

            state._fsp--;

             current =iv_ruleMultiValueList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiValueList"


    // $ANTLR start "ruleMultiValueList"
    // InternalDeployModelParser.g:1136:1: ruleMultiValueList returns [EObject current=null] : (this_MultiValueListPreList_0= ruleMultiValueListPreList | this_MultiValueListBracket_1= ruleMultiValueListBracket ) ;
    public final EObject ruleMultiValueList() throws RecognitionException {
        EObject current = null;

        EObject this_MultiValueListPreList_0 = null;

        EObject this_MultiValueListBracket_1 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:1142:2: ( (this_MultiValueListPreList_0= ruleMultiValueListPreList | this_MultiValueListBracket_1= ruleMultiValueListBracket ) )
            // InternalDeployModelParser.g:1143:2: (this_MultiValueListPreList_0= ruleMultiValueListPreList | this_MultiValueListBracket_1= ruleMultiValueListBracket )
            {
            // InternalDeployModelParser.g:1143:2: (this_MultiValueListPreList_0= ruleMultiValueListPreList | this_MultiValueListBracket_1= ruleMultiValueListBracket )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INDENT) ) {
                alt17=1;
            }
            else if ( (LA17_0==LeftSquareBracket) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalDeployModelParser.g:1144:3: this_MultiValueListPreList_0= ruleMultiValueListPreList
                    {

                    			newCompositeNode(grammarAccess.getMultiValueListAccess().getMultiValueListPreListParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultiValueListPreList_0=ruleMultiValueListPreList();

                    state._fsp--;


                    			current = this_MultiValueListPreList_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:1153:3: this_MultiValueListBracket_1= ruleMultiValueListBracket
                    {

                    			newCompositeNode(grammarAccess.getMultiValueListAccess().getMultiValueListBracketParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultiValueListBracket_1=ruleMultiValueListBracket();

                    state._fsp--;


                    			current = this_MultiValueListBracket_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiValueList"


    // $ANTLR start "entryRuleMultiValueListPreList"
    // InternalDeployModelParser.g:1165:1: entryRuleMultiValueListPreList returns [EObject current=null] : iv_ruleMultiValueListPreList= ruleMultiValueListPreList EOF ;
    public final EObject entryRuleMultiValueListPreList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiValueListPreList = null;


        try {
            // InternalDeployModelParser.g:1165:62: (iv_ruleMultiValueListPreList= ruleMultiValueListPreList EOF )
            // InternalDeployModelParser.g:1166:2: iv_ruleMultiValueListPreList= ruleMultiValueListPreList EOF
            {
             newCompositeNode(grammarAccess.getMultiValueListPreListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiValueListPreList=ruleMultiValueListPreList();

            state._fsp--;

             current =iv_ruleMultiValueListPreList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiValueListPreList"


    // $ANTLR start "ruleMultiValueListPreList"
    // InternalDeployModelParser.g:1172:1: ruleMultiValueListPreList returns [EObject current=null] : ( () this_INDENT_1= RULE_INDENT ( rulePreListElement ( (lv_values_3_0= ruleValueTypes ) ) )* this_DEDENT_4= RULE_DEDENT ) ;
    public final EObject ruleMultiValueListPreList() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_1=null;
        Token this_DEDENT_4=null;
        AntlrDatatypeRuleToken lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:1178:2: ( ( () this_INDENT_1= RULE_INDENT ( rulePreListElement ( (lv_values_3_0= ruleValueTypes ) ) )* this_DEDENT_4= RULE_DEDENT ) )
            // InternalDeployModelParser.g:1179:2: ( () this_INDENT_1= RULE_INDENT ( rulePreListElement ( (lv_values_3_0= ruleValueTypes ) ) )* this_DEDENT_4= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:1179:2: ( () this_INDENT_1= RULE_INDENT ( rulePreListElement ( (lv_values_3_0= ruleValueTypes ) ) )* this_DEDENT_4= RULE_DEDENT )
            // InternalDeployModelParser.g:1180:3: () this_INDENT_1= RULE_INDENT ( rulePreListElement ( (lv_values_3_0= ruleValueTypes ) ) )* this_DEDENT_4= RULE_DEDENT
            {
            // InternalDeployModelParser.g:1180:3: ()
            // InternalDeployModelParser.g:1181:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMultiValueListPreListAccess().getMultiValueListPreListAction_0(),
            					current);
            			

            }

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_28); 

            			newLeafNode(this_INDENT_1, grammarAccess.getMultiValueListPreListAccess().getINDENTTerminalRuleCall_1());
            		
            // InternalDeployModelParser.g:1191:3: ( rulePreListElement ( (lv_values_3_0= ruleValueTypes ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==HyphenMinus) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDeployModelParser.g:1192:4: rulePreListElement ( (lv_values_3_0= ruleValueTypes ) )
            	    {

            	    				newCompositeNode(grammarAccess.getMultiValueListPreListAccess().getPreListElementParserRuleCall_2_0());
            	    			
            	    pushFollow(FOLLOW_30);
            	    rulePreListElement();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalDeployModelParser.g:1199:4: ( (lv_values_3_0= ruleValueTypes ) )
            	    // InternalDeployModelParser.g:1200:5: (lv_values_3_0= ruleValueTypes )
            	    {
            	    // InternalDeployModelParser.g:1200:5: (lv_values_3_0= ruleValueTypes )
            	    // InternalDeployModelParser.g:1201:6: lv_values_3_0= ruleValueTypes
            	    {

            	    						newCompositeNode(grammarAccess.getMultiValueListPreListAccess().getValuesValueTypesParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_values_3_0=ruleValueTypes();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiValueListPreListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_3_0,
            	    							"de.fraunhofer.ipa.deployment.DeployModel.ValueTypes");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            this_DEDENT_4=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_4, grammarAccess.getMultiValueListPreListAccess().getDEDENTTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiValueListPreList"


    // $ANTLR start "entryRuleMultiValueListBracket"
    // InternalDeployModelParser.g:1227:1: entryRuleMultiValueListBracket returns [EObject current=null] : iv_ruleMultiValueListBracket= ruleMultiValueListBracket EOF ;
    public final EObject entryRuleMultiValueListBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiValueListBracket = null;


        try {
            // InternalDeployModelParser.g:1227:62: (iv_ruleMultiValueListBracket= ruleMultiValueListBracket EOF )
            // InternalDeployModelParser.g:1228:2: iv_ruleMultiValueListBracket= ruleMultiValueListBracket EOF
            {
             newCompositeNode(grammarAccess.getMultiValueListBracketRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiValueListBracket=ruleMultiValueListBracket();

            state._fsp--;

             current =iv_ruleMultiValueListBracket; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiValueListBracket"


    // $ANTLR start "ruleMultiValueListBracket"
    // InternalDeployModelParser.g:1234:1: ruleMultiValueListBracket returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_values_1_0= ruleValueTypes ) ) (otherlv_2= Comma ( (lv_values_3_0= ruleValueTypes ) )* )? otherlv_4= RightSquareBracket ) ;
    public final EObject ruleMultiValueListBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_values_1_0 = null;

        AntlrDatatypeRuleToken lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:1240:2: ( (otherlv_0= LeftSquareBracket ( (lv_values_1_0= ruleValueTypes ) ) (otherlv_2= Comma ( (lv_values_3_0= ruleValueTypes ) )* )? otherlv_4= RightSquareBracket ) )
            // InternalDeployModelParser.g:1241:2: (otherlv_0= LeftSquareBracket ( (lv_values_1_0= ruleValueTypes ) ) (otherlv_2= Comma ( (lv_values_3_0= ruleValueTypes ) )* )? otherlv_4= RightSquareBracket )
            {
            // InternalDeployModelParser.g:1241:2: (otherlv_0= LeftSquareBracket ( (lv_values_1_0= ruleValueTypes ) ) (otherlv_2= Comma ( (lv_values_3_0= ruleValueTypes ) )* )? otherlv_4= RightSquareBracket )
            // InternalDeployModelParser.g:1242:3: otherlv_0= LeftSquareBracket ( (lv_values_1_0= ruleValueTypes ) ) (otherlv_2= Comma ( (lv_values_3_0= ruleValueTypes ) )* )? otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiValueListBracketAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalDeployModelParser.g:1246:3: ( (lv_values_1_0= ruleValueTypes ) )
            // InternalDeployModelParser.g:1247:4: (lv_values_1_0= ruleValueTypes )
            {
            // InternalDeployModelParser.g:1247:4: (lv_values_1_0= ruleValueTypes )
            // InternalDeployModelParser.g:1248:5: lv_values_1_0= ruleValueTypes
            {

            					newCompositeNode(grammarAccess.getMultiValueListBracketAccess().getValuesValueTypesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
            lv_values_1_0=ruleValueTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiValueListBracketRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_1_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.ValueTypes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeployModelParser.g:1265:3: (otherlv_2= Comma ( (lv_values_3_0= ruleValueTypes ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Comma) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDeployModelParser.g:1266:4: otherlv_2= Comma ( (lv_values_3_0= ruleValueTypes ) )*
                    {
                    otherlv_2=(Token)match(input,Comma,FOLLOW_32); 

                    				newLeafNode(otherlv_2, grammarAccess.getMultiValueListBracketAccess().getCommaKeyword_2_0());
                    			
                    // InternalDeployModelParser.g:1270:4: ( (lv_values_3_0= ruleValueTypes ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>=RULE_INT && LA19_0<=RULE_FLOAT)||(LA19_0>=RULE_ID && LA19_0<=RULE_STRING)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalDeployModelParser.g:1271:5: (lv_values_3_0= ruleValueTypes )
                    	    {
                    	    // InternalDeployModelParser.g:1271:5: (lv_values_3_0= ruleValueTypes )
                    	    // InternalDeployModelParser.g:1272:6: lv_values_3_0= ruleValueTypes
                    	    {

                    	    						newCompositeNode(grammarAccess.getMultiValueListBracketAccess().getValuesValueTypesParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_32);
                    	    lv_values_3_0=ruleValueTypes();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMultiValueListBracketRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"values",
                    	    							lv_values_3_0,
                    	    							"de.fraunhofer.ipa.deployment.DeployModel.ValueTypes");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMultiValueListBracketAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiValueListBracket"


    // $ANTLR start "entryRuleValueTypes"
    // InternalDeployModelParser.g:1298:1: entryRuleValueTypes returns [String current=null] : iv_ruleValueTypes= ruleValueTypes EOF ;
    public final String entryRuleValueTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValueTypes = null;


        try {
            // InternalDeployModelParser.g:1298:50: (iv_ruleValueTypes= ruleValueTypes EOF )
            // InternalDeployModelParser.g:1299:2: iv_ruleValueTypes= ruleValueTypes EOF
            {
             newCompositeNode(grammarAccess.getValueTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueTypes=ruleValueTypes();

            state._fsp--;

             current =iv_ruleValueTypes.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueTypes"


    // $ANTLR start "ruleValueTypes"
    // InternalDeployModelParser.g:1305:1: ruleValueTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_ScalarNumber_2= ruleScalarNumber ) ;
    public final AntlrDatatypeRuleToken ruleValueTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        AntlrDatatypeRuleToken this_ScalarNumber_2 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:1311:2: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_ScalarNumber_2= ruleScalarNumber ) )
            // InternalDeployModelParser.g:1312:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_ScalarNumber_2= ruleScalarNumber )
            {
            // InternalDeployModelParser.g:1312:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_ScalarNumber_2= ruleScalarNumber )
            int alt21=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt21=1;
                }
                break;
            case RULE_STRING:
                {
                alt21=2;
                }
                break;
            case RULE_INT:
            case RULE_FLOAT:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalDeployModelParser.g:1313:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getValueTypesAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:1321:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getValueTypesAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDeployModelParser.g:1329:3: this_ScalarNumber_2= ruleScalarNumber
                    {

                    			newCompositeNode(grammarAccess.getValueTypesAccess().getScalarNumberParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScalarNumber_2=ruleScalarNumber();

                    state._fsp--;


                    			current.merge(this_ScalarNumber_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueTypes"


    // $ANTLR start "entryRuleBuildRequirements"
    // InternalDeployModelParser.g:1343:1: entryRuleBuildRequirements returns [EObject current=null] : iv_ruleBuildRequirements= ruleBuildRequirements EOF ;
    public final EObject entryRuleBuildRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildRequirements = null;


        try {
            // InternalDeployModelParser.g:1343:58: (iv_ruleBuildRequirements= ruleBuildRequirements EOF )
            // InternalDeployModelParser.g:1344:2: iv_ruleBuildRequirements= ruleBuildRequirements EOF
            {
             newCompositeNode(grammarAccess.getBuildRequirementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuildRequirements=ruleBuildRequirements();

            state._fsp--;

             current =iv_ruleBuildRequirements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBuildRequirements"


    // $ANTLR start "ruleBuildRequirements"
    // InternalDeployModelParser.g:1350:1: ruleBuildRequirements returns [EObject current=null] : ( () this_INDENT_1= RULE_INDENT otherlv_2= RosDistros ( (lv_ReqRosDistros_3_0= ruleMultiValueList ) ) (otherlv_4= TestRosDistros ( (lv_ReqTestRosDistros_5_0= ruleMultiValueList ) ) )? (otherlv_6= DependOn ( (lv_ReqBuildDependencies_7_0= ruleReqBuildDependencies ) ) )? (otherlv_8= AptRepositories ( (lv_ReqDependencyRepositories_9_0= ruleReqDependencyRepositories ) ) )? (otherlv_10= CMakeArgs ( (lv_ReqCMakeArgs_11_0= ruleMultiValueList ) ) )? this_DEDENT_12= RULE_DEDENT ) ;
    public final EObject ruleBuildRequirements() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token this_DEDENT_12=null;
        EObject lv_ReqRosDistros_3_0 = null;

        EObject lv_ReqTestRosDistros_5_0 = null;

        EObject lv_ReqBuildDependencies_7_0 = null;

        EObject lv_ReqDependencyRepositories_9_0 = null;

        EObject lv_ReqCMakeArgs_11_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:1356:2: ( ( () this_INDENT_1= RULE_INDENT otherlv_2= RosDistros ( (lv_ReqRosDistros_3_0= ruleMultiValueList ) ) (otherlv_4= TestRosDistros ( (lv_ReqTestRosDistros_5_0= ruleMultiValueList ) ) )? (otherlv_6= DependOn ( (lv_ReqBuildDependencies_7_0= ruleReqBuildDependencies ) ) )? (otherlv_8= AptRepositories ( (lv_ReqDependencyRepositories_9_0= ruleReqDependencyRepositories ) ) )? (otherlv_10= CMakeArgs ( (lv_ReqCMakeArgs_11_0= ruleMultiValueList ) ) )? this_DEDENT_12= RULE_DEDENT ) )
            // InternalDeployModelParser.g:1357:2: ( () this_INDENT_1= RULE_INDENT otherlv_2= RosDistros ( (lv_ReqRosDistros_3_0= ruleMultiValueList ) ) (otherlv_4= TestRosDistros ( (lv_ReqTestRosDistros_5_0= ruleMultiValueList ) ) )? (otherlv_6= DependOn ( (lv_ReqBuildDependencies_7_0= ruleReqBuildDependencies ) ) )? (otherlv_8= AptRepositories ( (lv_ReqDependencyRepositories_9_0= ruleReqDependencyRepositories ) ) )? (otherlv_10= CMakeArgs ( (lv_ReqCMakeArgs_11_0= ruleMultiValueList ) ) )? this_DEDENT_12= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:1357:2: ( () this_INDENT_1= RULE_INDENT otherlv_2= RosDistros ( (lv_ReqRosDistros_3_0= ruleMultiValueList ) ) (otherlv_4= TestRosDistros ( (lv_ReqTestRosDistros_5_0= ruleMultiValueList ) ) )? (otherlv_6= DependOn ( (lv_ReqBuildDependencies_7_0= ruleReqBuildDependencies ) ) )? (otherlv_8= AptRepositories ( (lv_ReqDependencyRepositories_9_0= ruleReqDependencyRepositories ) ) )? (otherlv_10= CMakeArgs ( (lv_ReqCMakeArgs_11_0= ruleMultiValueList ) ) )? this_DEDENT_12= RULE_DEDENT )
            // InternalDeployModelParser.g:1358:3: () this_INDENT_1= RULE_INDENT otherlv_2= RosDistros ( (lv_ReqRosDistros_3_0= ruleMultiValueList ) ) (otherlv_4= TestRosDistros ( (lv_ReqTestRosDistros_5_0= ruleMultiValueList ) ) )? (otherlv_6= DependOn ( (lv_ReqBuildDependencies_7_0= ruleReqBuildDependencies ) ) )? (otherlv_8= AptRepositories ( (lv_ReqDependencyRepositories_9_0= ruleReqDependencyRepositories ) ) )? (otherlv_10= CMakeArgs ( (lv_ReqCMakeArgs_11_0= ruleMultiValueList ) ) )? this_DEDENT_12= RULE_DEDENT
            {
            // InternalDeployModelParser.g:1358:3: ()
            // InternalDeployModelParser.g:1359:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBuildRequirementsAccess().getBuildRequirementsAction_0(),
            					current);
            			

            }

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_33); 

            			newLeafNode(this_INDENT_1, grammarAccess.getBuildRequirementsAccess().getINDENTTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,RosDistros,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getBuildRequirementsAccess().getRosDistrosKeyword_2());
            		
            // InternalDeployModelParser.g:1373:3: ( (lv_ReqRosDistros_3_0= ruleMultiValueList ) )
            // InternalDeployModelParser.g:1374:4: (lv_ReqRosDistros_3_0= ruleMultiValueList )
            {
            // InternalDeployModelParser.g:1374:4: (lv_ReqRosDistros_3_0= ruleMultiValueList )
            // InternalDeployModelParser.g:1375:5: lv_ReqRosDistros_3_0= ruleMultiValueList
            {

            					newCompositeNode(grammarAccess.getBuildRequirementsAccess().getReqRosDistrosMultiValueListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
            lv_ReqRosDistros_3_0=ruleMultiValueList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBuildRequirementsRule());
            					}
            					set(
            						current,
            						"ReqRosDistros",
            						lv_ReqRosDistros_3_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.MultiValueList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeployModelParser.g:1392:3: (otherlv_4= TestRosDistros ( (lv_ReqTestRosDistros_5_0= ruleMultiValueList ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==TestRosDistros) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDeployModelParser.g:1393:4: otherlv_4= TestRosDistros ( (lv_ReqTestRosDistros_5_0= ruleMultiValueList ) )
                    {
                    otherlv_4=(Token)match(input,TestRosDistros,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getBuildRequirementsAccess().getTestRosDistrosKeyword_4_0());
                    			
                    // InternalDeployModelParser.g:1397:4: ( (lv_ReqTestRosDistros_5_0= ruleMultiValueList ) )
                    // InternalDeployModelParser.g:1398:5: (lv_ReqTestRosDistros_5_0= ruleMultiValueList )
                    {
                    // InternalDeployModelParser.g:1398:5: (lv_ReqTestRosDistros_5_0= ruleMultiValueList )
                    // InternalDeployModelParser.g:1399:6: lv_ReqTestRosDistros_5_0= ruleMultiValueList
                    {

                    						newCompositeNode(grammarAccess.getBuildRequirementsAccess().getReqTestRosDistrosMultiValueListParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_ReqTestRosDistros_5_0=ruleMultiValueList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBuildRequirementsRule());
                    						}
                    						set(
                    							current,
                    							"ReqTestRosDistros",
                    							lv_ReqTestRosDistros_5_0,
                    							"de.fraunhofer.ipa.deployment.DeployModel.MultiValueList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDeployModelParser.g:1417:3: (otherlv_6= DependOn ( (lv_ReqBuildDependencies_7_0= ruleReqBuildDependencies ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==DependOn) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDeployModelParser.g:1418:4: otherlv_6= DependOn ( (lv_ReqBuildDependencies_7_0= ruleReqBuildDependencies ) )
                    {
                    otherlv_6=(Token)match(input,DependOn,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getBuildRequirementsAccess().getDependOnKeyword_5_0());
                    			
                    // InternalDeployModelParser.g:1422:4: ( (lv_ReqBuildDependencies_7_0= ruleReqBuildDependencies ) )
                    // InternalDeployModelParser.g:1423:5: (lv_ReqBuildDependencies_7_0= ruleReqBuildDependencies )
                    {
                    // InternalDeployModelParser.g:1423:5: (lv_ReqBuildDependencies_7_0= ruleReqBuildDependencies )
                    // InternalDeployModelParser.g:1424:6: lv_ReqBuildDependencies_7_0= ruleReqBuildDependencies
                    {

                    						newCompositeNode(grammarAccess.getBuildRequirementsAccess().getReqBuildDependenciesReqBuildDependenciesParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_ReqBuildDependencies_7_0=ruleReqBuildDependencies();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBuildRequirementsRule());
                    						}
                    						set(
                    							current,
                    							"ReqBuildDependencies",
                    							lv_ReqBuildDependencies_7_0,
                    							"de.fraunhofer.ipa.deployment.DeployModel.ReqBuildDependencies");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDeployModelParser.g:1442:3: (otherlv_8= AptRepositories ( (lv_ReqDependencyRepositories_9_0= ruleReqDependencyRepositories ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==AptRepositories) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDeployModelParser.g:1443:4: otherlv_8= AptRepositories ( (lv_ReqDependencyRepositories_9_0= ruleReqDependencyRepositories ) )
                    {
                    otherlv_8=(Token)match(input,AptRepositories,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getBuildRequirementsAccess().getAptRepositoriesKeyword_6_0());
                    			
                    // InternalDeployModelParser.g:1447:4: ( (lv_ReqDependencyRepositories_9_0= ruleReqDependencyRepositories ) )
                    // InternalDeployModelParser.g:1448:5: (lv_ReqDependencyRepositories_9_0= ruleReqDependencyRepositories )
                    {
                    // InternalDeployModelParser.g:1448:5: (lv_ReqDependencyRepositories_9_0= ruleReqDependencyRepositories )
                    // InternalDeployModelParser.g:1449:6: lv_ReqDependencyRepositories_9_0= ruleReqDependencyRepositories
                    {

                    						newCompositeNode(grammarAccess.getBuildRequirementsAccess().getReqDependencyRepositoriesReqDependencyRepositoriesParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_ReqDependencyRepositories_9_0=ruleReqDependencyRepositories();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBuildRequirementsRule());
                    						}
                    						set(
                    							current,
                    							"ReqDependencyRepositories",
                    							lv_ReqDependencyRepositories_9_0,
                    							"de.fraunhofer.ipa.deployment.DeployModel.ReqDependencyRepositories");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDeployModelParser.g:1467:3: (otherlv_10= CMakeArgs ( (lv_ReqCMakeArgs_11_0= ruleMultiValueList ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==CMakeArgs) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDeployModelParser.g:1468:4: otherlv_10= CMakeArgs ( (lv_ReqCMakeArgs_11_0= ruleMultiValueList ) )
                    {
                    otherlv_10=(Token)match(input,CMakeArgs,FOLLOW_23); 

                    				newLeafNode(otherlv_10, grammarAccess.getBuildRequirementsAccess().getCMakeArgsKeyword_7_0());
                    			
                    // InternalDeployModelParser.g:1472:4: ( (lv_ReqCMakeArgs_11_0= ruleMultiValueList ) )
                    // InternalDeployModelParser.g:1473:5: (lv_ReqCMakeArgs_11_0= ruleMultiValueList )
                    {
                    // InternalDeployModelParser.g:1473:5: (lv_ReqCMakeArgs_11_0= ruleMultiValueList )
                    // InternalDeployModelParser.g:1474:6: lv_ReqCMakeArgs_11_0= ruleMultiValueList
                    {

                    						newCompositeNode(grammarAccess.getBuildRequirementsAccess().getReqCMakeArgsMultiValueListParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_ReqCMakeArgs_11_0=ruleMultiValueList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBuildRequirementsRule());
                    						}
                    						set(
                    							current,
                    							"ReqCMakeArgs",
                    							lv_ReqCMakeArgs_11_0,
                    							"de.fraunhofer.ipa.deployment.DeployModel.MultiValueList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_DEDENT_12=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_12, grammarAccess.getBuildRequirementsAccess().getDEDENTTerminalRuleCall_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBuildRequirements"


    // $ANTLR start "entryRuleReqBuildDependencies"
    // InternalDeployModelParser.g:1500:1: entryRuleReqBuildDependencies returns [EObject current=null] : iv_ruleReqBuildDependencies= ruleReqBuildDependencies EOF ;
    public final EObject entryRuleReqBuildDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReqBuildDependencies = null;


        try {
            // InternalDeployModelParser.g:1500:61: (iv_ruleReqBuildDependencies= ruleReqBuildDependencies EOF )
            // InternalDeployModelParser.g:1501:2: iv_ruleReqBuildDependencies= ruleReqBuildDependencies EOF
            {
             newCompositeNode(grammarAccess.getReqBuildDependenciesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReqBuildDependencies=ruleReqBuildDependencies();

            state._fsp--;

             current =iv_ruleReqBuildDependencies; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReqBuildDependencies"


    // $ANTLR start "ruleReqBuildDependencies"
    // InternalDeployModelParser.g:1507:1: ruleReqBuildDependencies returns [EObject current=null] : ( () this_INDENT_1= RULE_INDENT ( (lv_dependencies_2_0= ruleDependencyTypes ) )* this_DEDENT_3= RULE_DEDENT ) ;
    public final EObject ruleReqBuildDependencies() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_1=null;
        Token this_DEDENT_3=null;
        EObject lv_dependencies_2_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:1513:2: ( ( () this_INDENT_1= RULE_INDENT ( (lv_dependencies_2_0= ruleDependencyTypes ) )* this_DEDENT_3= RULE_DEDENT ) )
            // InternalDeployModelParser.g:1514:2: ( () this_INDENT_1= RULE_INDENT ( (lv_dependencies_2_0= ruleDependencyTypes ) )* this_DEDENT_3= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:1514:2: ( () this_INDENT_1= RULE_INDENT ( (lv_dependencies_2_0= ruleDependencyTypes ) )* this_DEDENT_3= RULE_DEDENT )
            // InternalDeployModelParser.g:1515:3: () this_INDENT_1= RULE_INDENT ( (lv_dependencies_2_0= ruleDependencyTypes ) )* this_DEDENT_3= RULE_DEDENT
            {
            // InternalDeployModelParser.g:1515:3: ()
            // InternalDeployModelParser.g:1516:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReqBuildDependenciesAccess().getReqBuildDependenciesAction_0(),
            					current);
            			

            }

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_28); 

            			newLeafNode(this_INDENT_1, grammarAccess.getReqBuildDependenciesAccess().getINDENTTerminalRuleCall_1());
            		
            // InternalDeployModelParser.g:1526:3: ( (lv_dependencies_2_0= ruleDependencyTypes ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==HyphenMinus) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDeployModelParser.g:1527:4: (lv_dependencies_2_0= ruleDependencyTypes )
            	    {
            	    // InternalDeployModelParser.g:1527:4: (lv_dependencies_2_0= ruleDependencyTypes )
            	    // InternalDeployModelParser.g:1528:5: lv_dependencies_2_0= ruleDependencyTypes
            	    {

            	    					newCompositeNode(grammarAccess.getReqBuildDependenciesAccess().getDependenciesDependencyTypesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_dependencies_2_0=ruleDependencyTypes();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReqBuildDependenciesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dependencies",
            	    						lv_dependencies_2_0,
            	    						"de.fraunhofer.ipa.deployment.DeployModel.DependencyTypes");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            this_DEDENT_3=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_3, grammarAccess.getReqBuildDependenciesAccess().getDEDENTTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReqBuildDependencies"


    // $ANTLR start "entryRuleDependencyTypes"
    // InternalDeployModelParser.g:1553:1: entryRuleDependencyTypes returns [EObject current=null] : iv_ruleDependencyTypes= ruleDependencyTypes EOF ;
    public final EObject entryRuleDependencyTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyTypes = null;


        try {
            // InternalDeployModelParser.g:1553:56: (iv_ruleDependencyTypes= ruleDependencyTypes EOF )
            // InternalDeployModelParser.g:1554:2: iv_ruleDependencyTypes= ruleDependencyTypes EOF
            {
             newCompositeNode(grammarAccess.getDependencyTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependencyTypes=ruleDependencyTypes();

            state._fsp--;

             current =iv_ruleDependencyTypes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDependencyTypes"


    // $ANTLR start "ruleDependencyTypes"
    // InternalDeployModelParser.g:1560:1: ruleDependencyTypes returns [EObject current=null] : (this_LocalPackage_0= ruleLocalPackage | this_GitPackage_1= ruleGitPackage ) ;
    public final EObject ruleDependencyTypes() throws RecognitionException {
        EObject current = null;

        EObject this_LocalPackage_0 = null;

        EObject this_GitPackage_1 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:1566:2: ( (this_LocalPackage_0= ruleLocalPackage | this_GitPackage_1= ruleGitPackage ) )
            // InternalDeployModelParser.g:1567:2: (this_LocalPackage_0= ruleLocalPackage | this_GitPackage_1= ruleGitPackage )
            {
            // InternalDeployModelParser.g:1567:2: (this_LocalPackage_0= ruleLocalPackage | this_GitPackage_1= ruleGitPackage )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==HyphenMinus) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==Name) ) {
                    int LA27_2 = input.LA(3);

                    if ( (LA27_2==RULE_ID) ) {
                        int LA27_3 = input.LA(4);

                        if ( (LA27_3==EOF||(LA27_3>=HyphenMinus && LA27_3<=FullStop)||LA27_3==RULE_DEDENT) ) {
                            alt27=1;
                        }
                        else if ( (LA27_3==RULE_INDENT) ) {
                            alt27=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 27, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalDeployModelParser.g:1568:3: this_LocalPackage_0= ruleLocalPackage
                    {

                    			newCompositeNode(grammarAccess.getDependencyTypesAccess().getLocalPackageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LocalPackage_0=ruleLocalPackage();

                    state._fsp--;


                    			current = this_LocalPackage_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:1577:3: this_GitPackage_1= ruleGitPackage
                    {

                    			newCompositeNode(grammarAccess.getDependencyTypesAccess().getGitPackageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GitPackage_1=ruleGitPackage();

                    state._fsp--;


                    			current = this_GitPackage_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependencyTypes"


    // $ANTLR start "entryRuleLocalPackage"
    // InternalDeployModelParser.g:1589:1: entryRuleLocalPackage returns [EObject current=null] : iv_ruleLocalPackage= ruleLocalPackage EOF ;
    public final EObject entryRuleLocalPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalPackage = null;


        try {
            // InternalDeployModelParser.g:1589:53: (iv_ruleLocalPackage= ruleLocalPackage EOF )
            // InternalDeployModelParser.g:1590:2: iv_ruleLocalPackage= ruleLocalPackage EOF
            {
             newCompositeNode(grammarAccess.getLocalPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalPackage=ruleLocalPackage();

            state._fsp--;

             current =iv_ruleLocalPackage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalPackage"


    // $ANTLR start "ruleLocalPackage"
    // InternalDeployModelParser.g:1596:1: ruleLocalPackage returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleLocalPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:1602:2: ( ( rulePreListElement otherlv_1= Name ( ( ruleQualifiedName ) ) ) )
            // InternalDeployModelParser.g:1603:2: ( rulePreListElement otherlv_1= Name ( ( ruleQualifiedName ) ) )
            {
            // InternalDeployModelParser.g:1603:2: ( rulePreListElement otherlv_1= Name ( ( ruleQualifiedName ) ) )
            // InternalDeployModelParser.g:1604:3: rulePreListElement otherlv_1= Name ( ( ruleQualifiedName ) )
            {

            			newCompositeNode(grammarAccess.getLocalPackageAccess().getPreListElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalPackageAccess().getNameKeyword_1());
            		
            // InternalDeployModelParser.g:1615:3: ( ( ruleQualifiedName ) )
            // InternalDeployModelParser.g:1616:4: ( ruleQualifiedName )
            {
            // InternalDeployModelParser.g:1616:4: ( ruleQualifiedName )
            // InternalDeployModelParser.g:1617:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalPackageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLocalPackageAccess().getNameMonolithicImplementationDescriptionCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalPackage"


    // $ANTLR start "entryRuleGitPackage"
    // InternalDeployModelParser.g:1635:1: entryRuleGitPackage returns [EObject current=null] : iv_ruleGitPackage= ruleGitPackage EOF ;
    public final EObject entryRuleGitPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGitPackage = null;


        try {
            // InternalDeployModelParser.g:1635:51: (iv_ruleGitPackage= ruleGitPackage EOF )
            // InternalDeployModelParser.g:1636:2: iv_ruleGitPackage= ruleGitPackage EOF
            {
             newCompositeNode(grammarAccess.getGitPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGitPackage=ruleGitPackage();

            state._fsp--;

             current =iv_ruleGitPackage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGitPackage"


    // $ANTLR start "ruleGitPackage"
    // InternalDeployModelParser.g:1642:1: ruleGitPackage returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT otherlv_4= Location ( (lv_path_5_0= RULE_URL ) ) (otherlv_6= Visibility ( (lv_visibility_7_0= RULE_ID ) ) )? this_DEDENT_8= RULE_DEDENT ) ;
    public final EObject ruleGitPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token lv_path_5_0=null;
        Token otherlv_6=null;
        Token lv_visibility_7_0=null;
        Token this_DEDENT_8=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:1648:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT otherlv_4= Location ( (lv_path_5_0= RULE_URL ) ) (otherlv_6= Visibility ( (lv_visibility_7_0= RULE_ID ) ) )? this_DEDENT_8= RULE_DEDENT ) )
            // InternalDeployModelParser.g:1649:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT otherlv_4= Location ( (lv_path_5_0= RULE_URL ) ) (otherlv_6= Visibility ( (lv_visibility_7_0= RULE_ID ) ) )? this_DEDENT_8= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:1649:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT otherlv_4= Location ( (lv_path_5_0= RULE_URL ) ) (otherlv_6= Visibility ( (lv_visibility_7_0= RULE_ID ) ) )? this_DEDENT_8= RULE_DEDENT )
            // InternalDeployModelParser.g:1650:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT otherlv_4= Location ( (lv_path_5_0= RULE_URL ) ) (otherlv_6= Visibility ( (lv_visibility_7_0= RULE_ID ) ) )? this_DEDENT_8= RULE_DEDENT
            {

            			newCompositeNode(grammarAccess.getGitPackageAccess().getPreListElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGitPackageAccess().getNameKeyword_1());
            		
            // InternalDeployModelParser.g:1661:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDeployModelParser.g:1662:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDeployModelParser.g:1662:4: (lv_name_2_0= RULE_ID )
            // InternalDeployModelParser.g:1663:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getGitPackageAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGitPackageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_17); 

            			newLeafNode(this_INDENT_3, grammarAccess.getGitPackageAccess().getINDENTTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Location,FOLLOW_38); 

            			newLeafNode(otherlv_4, grammarAccess.getGitPackageAccess().getLocationKeyword_4());
            		
            // InternalDeployModelParser.g:1687:3: ( (lv_path_5_0= RULE_URL ) )
            // InternalDeployModelParser.g:1688:4: (lv_path_5_0= RULE_URL )
            {
            // InternalDeployModelParser.g:1688:4: (lv_path_5_0= RULE_URL )
            // InternalDeployModelParser.g:1689:5: lv_path_5_0= RULE_URL
            {
            lv_path_5_0=(Token)match(input,RULE_URL,FOLLOW_39); 

            					newLeafNode(lv_path_5_0, grammarAccess.getGitPackageAccess().getPathURLTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGitPackageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_5_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.URL");
            				

            }


            }

            // InternalDeployModelParser.g:1705:3: (otherlv_6= Visibility ( (lv_visibility_7_0= RULE_ID ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Visibility) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDeployModelParser.g:1706:4: otherlv_6= Visibility ( (lv_visibility_7_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,Visibility,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getGitPackageAccess().getVisibilityKeyword_6_0());
                    			
                    // InternalDeployModelParser.g:1710:4: ( (lv_visibility_7_0= RULE_ID ) )
                    // InternalDeployModelParser.g:1711:5: (lv_visibility_7_0= RULE_ID )
                    {
                    // InternalDeployModelParser.g:1711:5: (lv_visibility_7_0= RULE_ID )
                    // InternalDeployModelParser.g:1712:6: lv_visibility_7_0= RULE_ID
                    {
                    lv_visibility_7_0=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(lv_visibility_7_0, grammarAccess.getGitPackageAccess().getVisibilityIDTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGitPackageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"visibility",
                    							lv_visibility_7_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            this_DEDENT_8=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_8, grammarAccess.getGitPackageAccess().getDEDENTTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGitPackage"


    // $ANTLR start "entryRuleReqDependencyRepositories"
    // InternalDeployModelParser.g:1737:1: entryRuleReqDependencyRepositories returns [EObject current=null] : iv_ruleReqDependencyRepositories= ruleReqDependencyRepositories EOF ;
    public final EObject entryRuleReqDependencyRepositories() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReqDependencyRepositories = null;


        try {
            // InternalDeployModelParser.g:1737:66: (iv_ruleReqDependencyRepositories= ruleReqDependencyRepositories EOF )
            // InternalDeployModelParser.g:1738:2: iv_ruleReqDependencyRepositories= ruleReqDependencyRepositories EOF
            {
             newCompositeNode(grammarAccess.getReqDependencyRepositoriesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReqDependencyRepositories=ruleReqDependencyRepositories();

            state._fsp--;

             current =iv_ruleReqDependencyRepositories; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReqDependencyRepositories"


    // $ANTLR start "ruleReqDependencyRepositories"
    // InternalDeployModelParser.g:1744:1: ruleReqDependencyRepositories returns [EObject current=null] : (this_INDENT_0= RULE_INDENT ( (lv_children_1_0= ruleAptRepositoryInstance ) )+ this_DEDENT_2= RULE_DEDENT ) ;
    public final EObject ruleReqDependencyRepositories() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_0=null;
        Token this_DEDENT_2=null;
        EObject lv_children_1_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:1750:2: ( (this_INDENT_0= RULE_INDENT ( (lv_children_1_0= ruleAptRepositoryInstance ) )+ this_DEDENT_2= RULE_DEDENT ) )
            // InternalDeployModelParser.g:1751:2: (this_INDENT_0= RULE_INDENT ( (lv_children_1_0= ruleAptRepositoryInstance ) )+ this_DEDENT_2= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:1751:2: (this_INDENT_0= RULE_INDENT ( (lv_children_1_0= ruleAptRepositoryInstance ) )+ this_DEDENT_2= RULE_DEDENT )
            // InternalDeployModelParser.g:1752:3: this_INDENT_0= RULE_INDENT ( (lv_children_1_0= ruleAptRepositoryInstance ) )+ this_DEDENT_2= RULE_DEDENT
            {
            this_INDENT_0=(Token)match(input,RULE_INDENT,FOLLOW_25); 

            			newLeafNode(this_INDENT_0, grammarAccess.getReqDependencyRepositoriesAccess().getINDENTTerminalRuleCall_0());
            		
            // InternalDeployModelParser.g:1756:3: ( (lv_children_1_0= ruleAptRepositoryInstance ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==HyphenMinus) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDeployModelParser.g:1757:4: (lv_children_1_0= ruleAptRepositoryInstance )
            	    {
            	    // InternalDeployModelParser.g:1757:4: (lv_children_1_0= ruleAptRepositoryInstance )
            	    // InternalDeployModelParser.g:1758:5: lv_children_1_0= ruleAptRepositoryInstance
            	    {

            	    					newCompositeNode(grammarAccess.getReqDependencyRepositoriesAccess().getChildrenAptRepositoryInstanceParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_children_1_0=ruleAptRepositoryInstance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReqDependencyRepositoriesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"children",
            	    						lv_children_1_0,
            	    						"de.fraunhofer.ipa.deployment.DeployModel.AptRepositoryInstance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);

            this_DEDENT_2=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_2, grammarAccess.getReqDependencyRepositoriesAccess().getDEDENTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReqDependencyRepositories"


    // $ANTLR start "entryRuleAptRepositoryInstance"
    // InternalDeployModelParser.g:1783:1: entryRuleAptRepositoryInstance returns [EObject current=null] : iv_ruleAptRepositoryInstance= ruleAptRepositoryInstance EOF ;
    public final EObject entryRuleAptRepositoryInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAptRepositoryInstance = null;


        try {
            // InternalDeployModelParser.g:1783:62: (iv_ruleAptRepositoryInstance= ruleAptRepositoryInstance EOF )
            // InternalDeployModelParser.g:1784:2: iv_ruleAptRepositoryInstance= ruleAptRepositoryInstance EOF
            {
             newCompositeNode(grammarAccess.getAptRepositoryInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAptRepositoryInstance=ruleAptRepositoryInstance();

            state._fsp--;

             current =iv_ruleAptRepositoryInstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAptRepositoryInstance"


    // $ANTLR start "ruleAptRepositoryInstance"
    // InternalDeployModelParser.g:1790:1: ruleAptRepositoryInstance returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT otherlv_4= KeyLink ( (lv_keyLink_5_0= RULE_URL ) ) otherlv_6= RepositoryPath ( (lv_repositoryPath_7_0= RULE_URL ) ) (otherlv_8= UpdateRosDep ( (lv_updateRosDep_9_0= RULE_URL ) ) )? this_DEDENT_10= RULE_DEDENT ) ;
    public final EObject ruleAptRepositoryInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token lv_keyLink_5_0=null;
        Token otherlv_6=null;
        Token lv_repositoryPath_7_0=null;
        Token otherlv_8=null;
        Token lv_updateRosDep_9_0=null;
        Token this_DEDENT_10=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:1796:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT otherlv_4= KeyLink ( (lv_keyLink_5_0= RULE_URL ) ) otherlv_6= RepositoryPath ( (lv_repositoryPath_7_0= RULE_URL ) ) (otherlv_8= UpdateRosDep ( (lv_updateRosDep_9_0= RULE_URL ) ) )? this_DEDENT_10= RULE_DEDENT ) )
            // InternalDeployModelParser.g:1797:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT otherlv_4= KeyLink ( (lv_keyLink_5_0= RULE_URL ) ) otherlv_6= RepositoryPath ( (lv_repositoryPath_7_0= RULE_URL ) ) (otherlv_8= UpdateRosDep ( (lv_updateRosDep_9_0= RULE_URL ) ) )? this_DEDENT_10= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:1797:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT otherlv_4= KeyLink ( (lv_keyLink_5_0= RULE_URL ) ) otherlv_6= RepositoryPath ( (lv_repositoryPath_7_0= RULE_URL ) ) (otherlv_8= UpdateRosDep ( (lv_updateRosDep_9_0= RULE_URL ) ) )? this_DEDENT_10= RULE_DEDENT )
            // InternalDeployModelParser.g:1798:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT otherlv_4= KeyLink ( (lv_keyLink_5_0= RULE_URL ) ) otherlv_6= RepositoryPath ( (lv_repositoryPath_7_0= RULE_URL ) ) (otherlv_8= UpdateRosDep ( (lv_updateRosDep_9_0= RULE_URL ) ) )? this_DEDENT_10= RULE_DEDENT
            {

            			newCompositeNode(grammarAccess.getAptRepositoryInstanceAccess().getPreListElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAptRepositoryInstanceAccess().getNameKeyword_1());
            		
            // InternalDeployModelParser.g:1809:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDeployModelParser.g:1810:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDeployModelParser.g:1810:4: (lv_name_2_0= RULE_ID )
            // InternalDeployModelParser.g:1811:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAptRepositoryInstanceAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAptRepositoryInstanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_40); 

            			newLeafNode(this_INDENT_3, grammarAccess.getAptRepositoryInstanceAccess().getINDENTTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,KeyLink,FOLLOW_38); 

            			newLeafNode(otherlv_4, grammarAccess.getAptRepositoryInstanceAccess().getKeyLinkKeyword_4());
            		
            // InternalDeployModelParser.g:1835:3: ( (lv_keyLink_5_0= RULE_URL ) )
            // InternalDeployModelParser.g:1836:4: (lv_keyLink_5_0= RULE_URL )
            {
            // InternalDeployModelParser.g:1836:4: (lv_keyLink_5_0= RULE_URL )
            // InternalDeployModelParser.g:1837:5: lv_keyLink_5_0= RULE_URL
            {
            lv_keyLink_5_0=(Token)match(input,RULE_URL,FOLLOW_41); 

            					newLeafNode(lv_keyLink_5_0, grammarAccess.getAptRepositoryInstanceAccess().getKeyLinkURLTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAptRepositoryInstanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"keyLink",
            						lv_keyLink_5_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.URL");
            				

            }


            }

            otherlv_6=(Token)match(input,RepositoryPath,FOLLOW_38); 

            			newLeafNode(otherlv_6, grammarAccess.getAptRepositoryInstanceAccess().getRepositoryPathKeyword_6());
            		
            // InternalDeployModelParser.g:1857:3: ( (lv_repositoryPath_7_0= RULE_URL ) )
            // InternalDeployModelParser.g:1858:4: (lv_repositoryPath_7_0= RULE_URL )
            {
            // InternalDeployModelParser.g:1858:4: (lv_repositoryPath_7_0= RULE_URL )
            // InternalDeployModelParser.g:1859:5: lv_repositoryPath_7_0= RULE_URL
            {
            lv_repositoryPath_7_0=(Token)match(input,RULE_URL,FOLLOW_42); 

            					newLeafNode(lv_repositoryPath_7_0, grammarAccess.getAptRepositoryInstanceAccess().getRepositoryPathURLTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAptRepositoryInstanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"repositoryPath",
            						lv_repositoryPath_7_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.URL");
            				

            }


            }

            // InternalDeployModelParser.g:1875:3: (otherlv_8= UpdateRosDep ( (lv_updateRosDep_9_0= RULE_URL ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==UpdateRosDep) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDeployModelParser.g:1876:4: otherlv_8= UpdateRosDep ( (lv_updateRosDep_9_0= RULE_URL ) )
                    {
                    otherlv_8=(Token)match(input,UpdateRosDep,FOLLOW_38); 

                    				newLeafNode(otherlv_8, grammarAccess.getAptRepositoryInstanceAccess().getUpdateRosDepKeyword_8_0());
                    			
                    // InternalDeployModelParser.g:1880:4: ( (lv_updateRosDep_9_0= RULE_URL ) )
                    // InternalDeployModelParser.g:1881:5: (lv_updateRosDep_9_0= RULE_URL )
                    {
                    // InternalDeployModelParser.g:1881:5: (lv_updateRosDep_9_0= RULE_URL )
                    // InternalDeployModelParser.g:1882:6: lv_updateRosDep_9_0= RULE_URL
                    {
                    lv_updateRosDep_9_0=(Token)match(input,RULE_URL,FOLLOW_15); 

                    						newLeafNode(lv_updateRosDep_9_0, grammarAccess.getAptRepositoryInstanceAccess().getUpdateRosDepURLTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAptRepositoryInstanceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"updateRosDep",
                    							lv_updateRosDep_9_0,
                    							"de.fraunhofer.ipa.deployment.DeployModel.URL");
                    					

                    }


                    }


                    }
                    break;

            }

            this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_10, grammarAccess.getAptRepositoryInstanceAccess().getDEDENTTerminalRuleCall_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAptRepositoryInstance"


    // $ANTLR start "entryRuleStackImplementationDescription"
    // InternalDeployModelParser.g:1907:1: entryRuleStackImplementationDescription returns [EObject current=null] : iv_ruleStackImplementationDescription= ruleStackImplementationDescription EOF ;
    public final EObject entryRuleStackImplementationDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStackImplementationDescription = null;


        try {
            // InternalDeployModelParser.g:1907:71: (iv_ruleStackImplementationDescription= ruleStackImplementationDescription EOF )
            // InternalDeployModelParser.g:1908:2: iv_ruleStackImplementationDescription= ruleStackImplementationDescription EOF
            {
             newCompositeNode(grammarAccess.getStackImplementationDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStackImplementationDescription=ruleStackImplementationDescription();

            state._fsp--;

             current =iv_ruleStackImplementationDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStackImplementationDescription"


    // $ANTLR start "ruleStackImplementationDescription"
    // InternalDeployModelParser.g:1914:1: ruleStackImplementationDescription returns [EObject current=null] : ( ( (lv_type_0_0= StackImplementationDescription ) ) this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ImplementsRosModel ( (lv_impRosmodel_5_0= ruleQualifiedName ) ) )? otherlv_6= Description ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= Mode ( (lv_mode_9_0= ruleImplementationModeType ) ) otherlv_10= ImplementationArtifactDescription ( (lv_impl_11_0= ruleImplementationArtifactDescription ) ) this_DEDENT_12= RULE_DEDENT ) ;
    public final EObject ruleStackImplementationDescription() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token this_INDENT_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token this_DEDENT_12=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_impRosmodel_5_0 = null;

        Enumerator lv_mode_9_0 = null;

        EObject lv_impl_11_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:1920:2: ( ( ( (lv_type_0_0= StackImplementationDescription ) ) this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ImplementsRosModel ( (lv_impRosmodel_5_0= ruleQualifiedName ) ) )? otherlv_6= Description ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= Mode ( (lv_mode_9_0= ruleImplementationModeType ) ) otherlv_10= ImplementationArtifactDescription ( (lv_impl_11_0= ruleImplementationArtifactDescription ) ) this_DEDENT_12= RULE_DEDENT ) )
            // InternalDeployModelParser.g:1921:2: ( ( (lv_type_0_0= StackImplementationDescription ) ) this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ImplementsRosModel ( (lv_impRosmodel_5_0= ruleQualifiedName ) ) )? otherlv_6= Description ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= Mode ( (lv_mode_9_0= ruleImplementationModeType ) ) otherlv_10= ImplementationArtifactDescription ( (lv_impl_11_0= ruleImplementationArtifactDescription ) ) this_DEDENT_12= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:1921:2: ( ( (lv_type_0_0= StackImplementationDescription ) ) this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ImplementsRosModel ( (lv_impRosmodel_5_0= ruleQualifiedName ) ) )? otherlv_6= Description ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= Mode ( (lv_mode_9_0= ruleImplementationModeType ) ) otherlv_10= ImplementationArtifactDescription ( (lv_impl_11_0= ruleImplementationArtifactDescription ) ) this_DEDENT_12= RULE_DEDENT )
            // InternalDeployModelParser.g:1922:3: ( (lv_type_0_0= StackImplementationDescription ) ) this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ImplementsRosModel ( (lv_impRosmodel_5_0= ruleQualifiedName ) ) )? otherlv_6= Description ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= Mode ( (lv_mode_9_0= ruleImplementationModeType ) ) otherlv_10= ImplementationArtifactDescription ( (lv_impl_11_0= ruleImplementationArtifactDescription ) ) this_DEDENT_12= RULE_DEDENT
            {
            // InternalDeployModelParser.g:1922:3: ( (lv_type_0_0= StackImplementationDescription ) )
            // InternalDeployModelParser.g:1923:4: (lv_type_0_0= StackImplementationDescription )
            {
            // InternalDeployModelParser.g:1923:4: (lv_type_0_0= StackImplementationDescription )
            // InternalDeployModelParser.g:1924:5: lv_type_0_0= StackImplementationDescription
            {
            lv_type_0_0=(Token)match(input,StackImplementationDescription,FOLLOW_4); 

            					newLeafNode(lv_type_0_0, grammarAccess.getStackImplementationDescriptionAccess().getTypeStackImplementationDescriptionKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStackImplementationDescriptionRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "StackImplementationDescription:");
            				

            }


            }

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_5); 

            			newLeafNode(this_INDENT_1, grammarAccess.getStackImplementationDescriptionAccess().getINDENTTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getStackImplementationDescriptionAccess().getNameKeyword_2());
            		
            // InternalDeployModelParser.g:1944:3: ( (lv_name_3_0= ruleQualifiedName ) )
            // InternalDeployModelParser.g:1945:4: (lv_name_3_0= ruleQualifiedName )
            {
            // InternalDeployModelParser.g:1945:4: (lv_name_3_0= ruleQualifiedName )
            // InternalDeployModelParser.g:1946:5: lv_name_3_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getStackImplementationDescriptionAccess().getNameQualifiedNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStackImplementationDescriptionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeployModelParser.g:1963:3: (otherlv_4= ImplementsRosModel ( (lv_impRosmodel_5_0= ruleQualifiedName ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==ImplementsRosModel) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDeployModelParser.g:1964:4: otherlv_4= ImplementsRosModel ( (lv_impRosmodel_5_0= ruleQualifiedName ) )
                    {
                    otherlv_4=(Token)match(input,ImplementsRosModel,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getStackImplementationDescriptionAccess().getImplementsRosModelKeyword_4_0());
                    			
                    // InternalDeployModelParser.g:1968:4: ( (lv_impRosmodel_5_0= ruleQualifiedName ) )
                    // InternalDeployModelParser.g:1969:5: (lv_impRosmodel_5_0= ruleQualifiedName )
                    {
                    // InternalDeployModelParser.g:1969:5: (lv_impRosmodel_5_0= ruleQualifiedName )
                    // InternalDeployModelParser.g:1970:6: lv_impRosmodel_5_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getStackImplementationDescriptionAccess().getImpRosmodelQualifiedNameParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_impRosmodel_5_0=ruleQualifiedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStackImplementationDescriptionRule());
                    						}
                    						set(
                    							current,
                    							"impRosmodel",
                    							lv_impRosmodel_5_0,
                    							"de.fraunhofer.ipa.deployment.DeployModel.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,Description,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getStackImplementationDescriptionAccess().getDescriptionKeyword_5());
            		
            // InternalDeployModelParser.g:1992:3: ( (lv_description_7_0= RULE_STRING ) )
            // InternalDeployModelParser.g:1993:4: (lv_description_7_0= RULE_STRING )
            {
            // InternalDeployModelParser.g:1993:4: (lv_description_7_0= RULE_STRING )
            // InternalDeployModelParser.g:1994:5: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_description_7_0, grammarAccess.getStackImplementationDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStackImplementationDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,Mode,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getStackImplementationDescriptionAccess().getModeKeyword_7());
            		
            // InternalDeployModelParser.g:2014:3: ( (lv_mode_9_0= ruleImplementationModeType ) )
            // InternalDeployModelParser.g:2015:4: (lv_mode_9_0= ruleImplementationModeType )
            {
            // InternalDeployModelParser.g:2015:4: (lv_mode_9_0= ruleImplementationModeType )
            // InternalDeployModelParser.g:2016:5: lv_mode_9_0= ruleImplementationModeType
            {

            					newCompositeNode(grammarAccess.getStackImplementationDescriptionAccess().getModeImplementationModeTypeEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_43);
            lv_mode_9_0=ruleImplementationModeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStackImplementationDescriptionRule());
            					}
            					set(
            						current,
            						"mode",
            						lv_mode_9_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.ImplementationModeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,ImplementationArtifactDescription,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getStackImplementationDescriptionAccess().getImplementationArtifactDescriptionKeyword_9());
            		
            // InternalDeployModelParser.g:2037:3: ( (lv_impl_11_0= ruleImplementationArtifactDescription ) )
            // InternalDeployModelParser.g:2038:4: (lv_impl_11_0= ruleImplementationArtifactDescription )
            {
            // InternalDeployModelParser.g:2038:4: (lv_impl_11_0= ruleImplementationArtifactDescription )
            // InternalDeployModelParser.g:2039:5: lv_impl_11_0= ruleImplementationArtifactDescription
            {

            					newCompositeNode(grammarAccess.getStackImplementationDescriptionAccess().getImplImplementationArtifactDescriptionParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_15);
            lv_impl_11_0=ruleImplementationArtifactDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStackImplementationDescriptionRule());
            					}
            					set(
            						current,
            						"impl",
            						lv_impl_11_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.ImplementationArtifactDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_DEDENT_12=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_12, grammarAccess.getStackImplementationDescriptionAccess().getDEDENTTerminalRuleCall_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStackImplementationDescription"


    // $ANTLR start "entryRulePackageDescription"
    // InternalDeployModelParser.g:2064:1: entryRulePackageDescription returns [EObject current=null] : iv_rulePackageDescription= rulePackageDescription EOF ;
    public final EObject entryRulePackageDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDescription = null;


        try {
            // InternalDeployModelParser.g:2064:59: (iv_rulePackageDescription= rulePackageDescription EOF )
            // InternalDeployModelParser.g:2065:2: iv_rulePackageDescription= rulePackageDescription EOF
            {
             newCompositeNode(grammarAccess.getPackageDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageDescription=rulePackageDescription();

            state._fsp--;

             current =iv_rulePackageDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDescription"


    // $ANTLR start "rulePackageDescription"
    // InternalDeployModelParser.g:2071:1: rulePackageDescription returns [EObject current=null] : ( ( (lv_type_0_0= PackageDescription ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT otherlv_3= ImageDescription this_INDENT_4= RULE_INDENT ( (lv_imageDescription_5_0= ruleImageDescription ) ) this_DEDENT_6= RULE_DEDENT otherlv_7= RepositoryDescription ( (lv_repositoryDescription_8_0= ruleRepositoryDescription ) ) this_DEDENT_9= RULE_DEDENT ) ;
    public final EObject rulePackageDescription() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token this_INDENT_2=null;
        Token otherlv_3=null;
        Token this_INDENT_4=null;
        Token this_DEDENT_6=null;
        Token otherlv_7=null;
        Token this_DEDENT_9=null;
        EObject lv_imageDescription_5_0 = null;

        EObject lv_repositoryDescription_8_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:2077:2: ( ( ( (lv_type_0_0= PackageDescription ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT otherlv_3= ImageDescription this_INDENT_4= RULE_INDENT ( (lv_imageDescription_5_0= ruleImageDescription ) ) this_DEDENT_6= RULE_DEDENT otherlv_7= RepositoryDescription ( (lv_repositoryDescription_8_0= ruleRepositoryDescription ) ) this_DEDENT_9= RULE_DEDENT ) )
            // InternalDeployModelParser.g:2078:2: ( ( (lv_type_0_0= PackageDescription ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT otherlv_3= ImageDescription this_INDENT_4= RULE_INDENT ( (lv_imageDescription_5_0= ruleImageDescription ) ) this_DEDENT_6= RULE_DEDENT otherlv_7= RepositoryDescription ( (lv_repositoryDescription_8_0= ruleRepositoryDescription ) ) this_DEDENT_9= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:2078:2: ( ( (lv_type_0_0= PackageDescription ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT otherlv_3= ImageDescription this_INDENT_4= RULE_INDENT ( (lv_imageDescription_5_0= ruleImageDescription ) ) this_DEDENT_6= RULE_DEDENT otherlv_7= RepositoryDescription ( (lv_repositoryDescription_8_0= ruleRepositoryDescription ) ) this_DEDENT_9= RULE_DEDENT )
            // InternalDeployModelParser.g:2079:3: ( (lv_type_0_0= PackageDescription ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT otherlv_3= ImageDescription this_INDENT_4= RULE_INDENT ( (lv_imageDescription_5_0= ruleImageDescription ) ) this_DEDENT_6= RULE_DEDENT otherlv_7= RepositoryDescription ( (lv_repositoryDescription_8_0= ruleRepositoryDescription ) ) this_DEDENT_9= RULE_DEDENT
            {
            // InternalDeployModelParser.g:2079:3: ( (lv_type_0_0= PackageDescription ) )
            // InternalDeployModelParser.g:2080:4: (lv_type_0_0= PackageDescription )
            {
            // InternalDeployModelParser.g:2080:4: (lv_type_0_0= PackageDescription )
            // InternalDeployModelParser.g:2081:5: lv_type_0_0= PackageDescription
            {
            lv_type_0_0=(Token)match(input,PackageDescription,FOLLOW_44); 

            					newLeafNode(lv_type_0_0, grammarAccess.getPackageDescriptionAccess().getTypePackageDescriptionKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackageDescriptionRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "PackageDescription");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPackageDescriptionAccess().getColonKeyword_1());
            		
            this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_45); 

            			newLeafNode(this_INDENT_2, grammarAccess.getPackageDescriptionAccess().getINDENTTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,ImageDescription,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPackageDescriptionAccess().getImageDescriptionKeyword_3());
            		
            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_46); 

            			newLeafNode(this_INDENT_4, grammarAccess.getPackageDescriptionAccess().getINDENTTerminalRuleCall_4());
            		
            // InternalDeployModelParser.g:2109:3: ( (lv_imageDescription_5_0= ruleImageDescription ) )
            // InternalDeployModelParser.g:2110:4: (lv_imageDescription_5_0= ruleImageDescription )
            {
            // InternalDeployModelParser.g:2110:4: (lv_imageDescription_5_0= ruleImageDescription )
            // InternalDeployModelParser.g:2111:5: lv_imageDescription_5_0= ruleImageDescription
            {

            					newCompositeNode(grammarAccess.getPackageDescriptionAccess().getImageDescriptionImageDescriptionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_imageDescription_5_0=ruleImageDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageDescriptionRule());
            					}
            					set(
            						current,
            						"imageDescription",
            						lv_imageDescription_5_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.ImageDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_DEDENT_6=(Token)match(input,RULE_DEDENT,FOLLOW_47); 

            			newLeafNode(this_DEDENT_6, grammarAccess.getPackageDescriptionAccess().getDEDENTTerminalRuleCall_6());
            		
            otherlv_7=(Token)match(input,RepositoryDescription,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getPackageDescriptionAccess().getRepositoryDescriptionKeyword_7());
            		
            // InternalDeployModelParser.g:2136:3: ( (lv_repositoryDescription_8_0= ruleRepositoryDescription ) )
            // InternalDeployModelParser.g:2137:4: (lv_repositoryDescription_8_0= ruleRepositoryDescription )
            {
            // InternalDeployModelParser.g:2137:4: (lv_repositoryDescription_8_0= ruleRepositoryDescription )
            // InternalDeployModelParser.g:2138:5: lv_repositoryDescription_8_0= ruleRepositoryDescription
            {

            					newCompositeNode(grammarAccess.getPackageDescriptionAccess().getRepositoryDescriptionRepositoryDescriptionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_15);
            lv_repositoryDescription_8_0=ruleRepositoryDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageDescriptionRule());
            					}
            					set(
            						current,
            						"repositoryDescription",
            						lv_repositoryDescription_8_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.RepositoryDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_DEDENT_9=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_9, grammarAccess.getPackageDescriptionAccess().getDEDENTTerminalRuleCall_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDescription"


    // $ANTLR start "entryRuleImageDescription"
    // InternalDeployModelParser.g:2163:1: entryRuleImageDescription returns [EObject current=null] : iv_ruleImageDescription= ruleImageDescription EOF ;
    public final EObject entryRuleImageDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageDescription = null;


        try {
            // InternalDeployModelParser.g:2163:57: (iv_ruleImageDescription= ruleImageDescription EOF )
            // InternalDeployModelParser.g:2164:2: iv_ruleImageDescription= ruleImageDescription EOF
            {
             newCompositeNode(grammarAccess.getImageDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImageDescription=ruleImageDescription();

            state._fsp--;

             current =iv_ruleImageDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImageDescription"


    // $ANTLR start "ruleImageDescription"
    // InternalDeployModelParser.g:2170:1: ruleImageDescription returns [EObject current=null] : (otherlv_0= Types ( (lv_types_1_0= ruleMultiValueList ) ) otherlv_2= Name ( ( ruleQualifiedName ) ) otherlv_4= ImageTags ( (lv_imageTags_5_0= ruleMultiValueList ) ) ) ;
    public final EObject ruleImageDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_types_1_0 = null;

        EObject lv_imageTags_5_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:2176:2: ( (otherlv_0= Types ( (lv_types_1_0= ruleMultiValueList ) ) otherlv_2= Name ( ( ruleQualifiedName ) ) otherlv_4= ImageTags ( (lv_imageTags_5_0= ruleMultiValueList ) ) ) )
            // InternalDeployModelParser.g:2177:2: (otherlv_0= Types ( (lv_types_1_0= ruleMultiValueList ) ) otherlv_2= Name ( ( ruleQualifiedName ) ) otherlv_4= ImageTags ( (lv_imageTags_5_0= ruleMultiValueList ) ) )
            {
            // InternalDeployModelParser.g:2177:2: (otherlv_0= Types ( (lv_types_1_0= ruleMultiValueList ) ) otherlv_2= Name ( ( ruleQualifiedName ) ) otherlv_4= ImageTags ( (lv_imageTags_5_0= ruleMultiValueList ) ) )
            // InternalDeployModelParser.g:2178:3: otherlv_0= Types ( (lv_types_1_0= ruleMultiValueList ) ) otherlv_2= Name ( ( ruleQualifiedName ) ) otherlv_4= ImageTags ( (lv_imageTags_5_0= ruleMultiValueList ) )
            {
            otherlv_0=(Token)match(input,Types,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getImageDescriptionAccess().getTypesKeyword_0());
            		
            // InternalDeployModelParser.g:2182:3: ( (lv_types_1_0= ruleMultiValueList ) )
            // InternalDeployModelParser.g:2183:4: (lv_types_1_0= ruleMultiValueList )
            {
            // InternalDeployModelParser.g:2183:4: (lv_types_1_0= ruleMultiValueList )
            // InternalDeployModelParser.g:2184:5: lv_types_1_0= ruleMultiValueList
            {

            					newCompositeNode(grammarAccess.getImageDescriptionAccess().getTypesMultiValueListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_types_1_0=ruleMultiValueList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImageDescriptionRule());
            					}
            					set(
            						current,
            						"types",
            						lv_types_1_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.MultiValueList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getImageDescriptionAccess().getNameKeyword_2());
            		
            // InternalDeployModelParser.g:2205:3: ( ( ruleQualifiedName ) )
            // InternalDeployModelParser.g:2206:4: ( ruleQualifiedName )
            {
            // InternalDeployModelParser.g:2206:4: ( ruleQualifiedName )
            // InternalDeployModelParser.g:2207:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageDescriptionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getImageDescriptionAccess().getNameMonolithicImplementationDescriptionCrossReference_3_0());
            				
            pushFollow(FOLLOW_48);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,ImageTags,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getImageDescriptionAccess().getImageTagsKeyword_4());
            		
            // InternalDeployModelParser.g:2225:3: ( (lv_imageTags_5_0= ruleMultiValueList ) )
            // InternalDeployModelParser.g:2226:4: (lv_imageTags_5_0= ruleMultiValueList )
            {
            // InternalDeployModelParser.g:2226:4: (lv_imageTags_5_0= ruleMultiValueList )
            // InternalDeployModelParser.g:2227:5: lv_imageTags_5_0= ruleMultiValueList
            {

            					newCompositeNode(grammarAccess.getImageDescriptionAccess().getImageTagsMultiValueListParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_imageTags_5_0=ruleMultiValueList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImageDescriptionRule());
            					}
            					set(
            						current,
            						"imageTags",
            						lv_imageTags_5_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.MultiValueList");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImageDescription"


    // $ANTLR start "entryRuleRepositoryDescription"
    // InternalDeployModelParser.g:2248:1: entryRuleRepositoryDescription returns [EObject current=null] : iv_ruleRepositoryDescription= ruleRepositoryDescription EOF ;
    public final EObject entryRuleRepositoryDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepositoryDescription = null;


        try {
            // InternalDeployModelParser.g:2248:62: (iv_ruleRepositoryDescription= ruleRepositoryDescription EOF )
            // InternalDeployModelParser.g:2249:2: iv_ruleRepositoryDescription= ruleRepositoryDescription EOF
            {
             newCompositeNode(grammarAccess.getRepositoryDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepositoryDescription=ruleRepositoryDescription();

            state._fsp--;

             current =iv_ruleRepositoryDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepositoryDescription"


    // $ANTLR start "ruleRepositoryDescription"
    // InternalDeployModelParser.g:2255:1: ruleRepositoryDescription returns [EObject current=null] : (this_INDENT_0= RULE_INDENT ( (lv_spec_1_0= ruleRepositorySpec ) )+ this_DEDENT_2= RULE_DEDENT ) ;
    public final EObject ruleRepositoryDescription() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_0=null;
        Token this_DEDENT_2=null;
        EObject lv_spec_1_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:2261:2: ( (this_INDENT_0= RULE_INDENT ( (lv_spec_1_0= ruleRepositorySpec ) )+ this_DEDENT_2= RULE_DEDENT ) )
            // InternalDeployModelParser.g:2262:2: (this_INDENT_0= RULE_INDENT ( (lv_spec_1_0= ruleRepositorySpec ) )+ this_DEDENT_2= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:2262:2: (this_INDENT_0= RULE_INDENT ( (lv_spec_1_0= ruleRepositorySpec ) )+ this_DEDENT_2= RULE_DEDENT )
            // InternalDeployModelParser.g:2263:3: this_INDENT_0= RULE_INDENT ( (lv_spec_1_0= ruleRepositorySpec ) )+ this_DEDENT_2= RULE_DEDENT
            {
            this_INDENT_0=(Token)match(input,RULE_INDENT,FOLLOW_25); 

            			newLeafNode(this_INDENT_0, grammarAccess.getRepositoryDescriptionAccess().getINDENTTerminalRuleCall_0());
            		
            // InternalDeployModelParser.g:2267:3: ( (lv_spec_1_0= ruleRepositorySpec ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==HyphenMinus) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalDeployModelParser.g:2268:4: (lv_spec_1_0= ruleRepositorySpec )
            	    {
            	    // InternalDeployModelParser.g:2268:4: (lv_spec_1_0= ruleRepositorySpec )
            	    // InternalDeployModelParser.g:2269:5: lv_spec_1_0= ruleRepositorySpec
            	    {

            	    					newCompositeNode(grammarAccess.getRepositoryDescriptionAccess().getSpecRepositorySpecParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_spec_1_0=ruleRepositorySpec();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRepositoryDescriptionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"spec",
            	    						lv_spec_1_0,
            	    						"de.fraunhofer.ipa.deployment.DeployModel.RepositorySpec");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            this_DEDENT_2=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_2, grammarAccess.getRepositoryDescriptionAccess().getDEDENTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepositoryDescription"


    // $ANTLR start "entryRuleRepositorySpec"
    // InternalDeployModelParser.g:2294:1: entryRuleRepositorySpec returns [EObject current=null] : iv_ruleRepositorySpec= ruleRepositorySpec EOF ;
    public final EObject entryRuleRepositorySpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepositorySpec = null;


        try {
            // InternalDeployModelParser.g:2294:55: (iv_ruleRepositorySpec= ruleRepositorySpec EOF )
            // InternalDeployModelParser.g:2295:2: iv_ruleRepositorySpec= ruleRepositorySpec EOF
            {
             newCompositeNode(grammarAccess.getRepositorySpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepositorySpec=ruleRepositorySpec();

            state._fsp--;

             current =iv_ruleRepositorySpec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepositorySpec"


    // $ANTLR start "ruleRepositorySpec"
    // InternalDeployModelParser.g:2301:1: ruleRepositorySpec returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT ( (lv_repository_4_0= ruleRepository ) ) this_DEDENT_5= RULE_DEDENT ) ;
    public final EObject ruleRepositorySpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_INDENT_3=null;
        Token this_DEDENT_5=null;
        EObject lv_repository_4_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:2307:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT ( (lv_repository_4_0= ruleRepository ) ) this_DEDENT_5= RULE_DEDENT ) )
            // InternalDeployModelParser.g:2308:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT ( (lv_repository_4_0= ruleRepository ) ) this_DEDENT_5= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:2308:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT ( (lv_repository_4_0= ruleRepository ) ) this_DEDENT_5= RULE_DEDENT )
            // InternalDeployModelParser.g:2309:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT ( (lv_repository_4_0= ruleRepository ) ) this_DEDENT_5= RULE_DEDENT
            {

            			newCompositeNode(grammarAccess.getRepositorySpecAccess().getPreListElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getRepositorySpecAccess().getNameKeyword_1());
            		
            // InternalDeployModelParser.g:2320:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDeployModelParser.g:2321:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDeployModelParser.g:2321:4: (lv_name_2_0= RULE_ID )
            // InternalDeployModelParser.g:2322:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRepositorySpecAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRepositorySpecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_49); 

            			newLeafNode(this_INDENT_3, grammarAccess.getRepositorySpecAccess().getINDENTTerminalRuleCall_3());
            		
            // InternalDeployModelParser.g:2342:3: ( (lv_repository_4_0= ruleRepository ) )
            // InternalDeployModelParser.g:2343:4: (lv_repository_4_0= ruleRepository )
            {
            // InternalDeployModelParser.g:2343:4: (lv_repository_4_0= ruleRepository )
            // InternalDeployModelParser.g:2344:5: lv_repository_4_0= ruleRepository
            {

            					newCompositeNode(grammarAccess.getRepositorySpecAccess().getRepositoryRepositoryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_repository_4_0=ruleRepository();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepositorySpecRule());
            					}
            					set(
            						current,
            						"repository",
            						lv_repository_4_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.Repository");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_DEDENT_5=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_5, grammarAccess.getRepositorySpecAccess().getDEDENTTerminalRuleCall_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepositorySpec"


    // $ANTLR start "entryRuleRepository"
    // InternalDeployModelParser.g:2369:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalDeployModelParser.g:2369:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalDeployModelParser.g:2370:2: iv_ruleRepository= ruleRepository EOF
            {
             newCompositeNode(grammarAccess.getRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepository=ruleRepository();

            state._fsp--;

             current =iv_ruleRepository; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepository"


    // $ANTLR start "ruleRepository"
    // InternalDeployModelParser.g:2376:1: ruleRepository returns [EObject current=null] : (otherlv_0= Type ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= Path ( (lv_path_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token lv_path_3_0=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:2382:2: ( (otherlv_0= Type ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= Path ( (lv_path_3_0= RULE_STRING ) ) )? ) )
            // InternalDeployModelParser.g:2383:2: (otherlv_0= Type ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= Path ( (lv_path_3_0= RULE_STRING ) ) )? )
            {
            // InternalDeployModelParser.g:2383:2: (otherlv_0= Type ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= Path ( (lv_path_3_0= RULE_STRING ) ) )? )
            // InternalDeployModelParser.g:2384:3: otherlv_0= Type ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= Path ( (lv_path_3_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,Type,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRepositoryAccess().getTypeKeyword_0());
            		
            // InternalDeployModelParser.g:2388:3: ( (lv_type_1_0= RULE_ID ) )
            // InternalDeployModelParser.g:2389:4: (lv_type_1_0= RULE_ID )
            {
            // InternalDeployModelParser.g:2389:4: (lv_type_1_0= RULE_ID )
            // InternalDeployModelParser.g:2390:5: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_50); 

            					newLeafNode(lv_type_1_0, grammarAccess.getRepositoryAccess().getTypeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRepositoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDeployModelParser.g:2406:3: (otherlv_2= Path ( (lv_path_3_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Path) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDeployModelParser.g:2407:4: otherlv_2= Path ( (lv_path_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,Path,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getRepositoryAccess().getPathKeyword_2_0());
                    			
                    // InternalDeployModelParser.g:2411:4: ( (lv_path_3_0= RULE_STRING ) )
                    // InternalDeployModelParser.g:2412:5: (lv_path_3_0= RULE_STRING )
                    {
                    // InternalDeployModelParser.g:2412:5: (lv_path_3_0= RULE_STRING )
                    // InternalDeployModelParser.g:2413:6: lv_path_3_0= RULE_STRING
                    {
                    lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_path_3_0, grammarAccess.getRepositoryAccess().getPathSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRepositoryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"path",
                    							lv_path_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepository"


    // $ANTLR start "entryRuleCISetting"
    // InternalDeployModelParser.g:2434:1: entryRuleCISetting returns [EObject current=null] : iv_ruleCISetting= ruleCISetting EOF ;
    public final EObject entryRuleCISetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCISetting = null;


        try {
            // InternalDeployModelParser.g:2434:50: (iv_ruleCISetting= ruleCISetting EOF )
            // InternalDeployModelParser.g:2435:2: iv_ruleCISetting= ruleCISetting EOF
            {
             newCompositeNode(grammarAccess.getCISettingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCISetting=ruleCISetting();

            state._fsp--;

             current =iv_ruleCISetting; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCISetting"


    // $ANTLR start "ruleCISetting"
    // InternalDeployModelParser.g:2441:1: ruleCISetting returns [EObject current=null] : ( ( (lv_type_0_0= CISetting ) ) this_INDENT_1= RULE_INDENT otherlv_2= CiTypes ( (lv_ciTypes_3_0= ruleMultiValueList ) ) otherlv_4= AppliedRepos ( (lv_appliedRepos_5_0= ruleMultiMonolithicImplementationNameList ) ) otherlv_6= BranchPrefixType ( (lv_reqBranchPrefix_7_0= RULE_ID ) ) ( (lv_ciParameters_8_0= ruleCIParameters ) )* this_DEDENT_9= RULE_DEDENT ) ;
    public final EObject ruleCISetting() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token this_INDENT_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_reqBranchPrefix_7_0=null;
        Token this_DEDENT_9=null;
        EObject lv_ciTypes_3_0 = null;

        EObject lv_appliedRepos_5_0 = null;

        EObject lv_ciParameters_8_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:2447:2: ( ( ( (lv_type_0_0= CISetting ) ) this_INDENT_1= RULE_INDENT otherlv_2= CiTypes ( (lv_ciTypes_3_0= ruleMultiValueList ) ) otherlv_4= AppliedRepos ( (lv_appliedRepos_5_0= ruleMultiMonolithicImplementationNameList ) ) otherlv_6= BranchPrefixType ( (lv_reqBranchPrefix_7_0= RULE_ID ) ) ( (lv_ciParameters_8_0= ruleCIParameters ) )* this_DEDENT_9= RULE_DEDENT ) )
            // InternalDeployModelParser.g:2448:2: ( ( (lv_type_0_0= CISetting ) ) this_INDENT_1= RULE_INDENT otherlv_2= CiTypes ( (lv_ciTypes_3_0= ruleMultiValueList ) ) otherlv_4= AppliedRepos ( (lv_appliedRepos_5_0= ruleMultiMonolithicImplementationNameList ) ) otherlv_6= BranchPrefixType ( (lv_reqBranchPrefix_7_0= RULE_ID ) ) ( (lv_ciParameters_8_0= ruleCIParameters ) )* this_DEDENT_9= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:2448:2: ( ( (lv_type_0_0= CISetting ) ) this_INDENT_1= RULE_INDENT otherlv_2= CiTypes ( (lv_ciTypes_3_0= ruleMultiValueList ) ) otherlv_4= AppliedRepos ( (lv_appliedRepos_5_0= ruleMultiMonolithicImplementationNameList ) ) otherlv_6= BranchPrefixType ( (lv_reqBranchPrefix_7_0= RULE_ID ) ) ( (lv_ciParameters_8_0= ruleCIParameters ) )* this_DEDENT_9= RULE_DEDENT )
            // InternalDeployModelParser.g:2449:3: ( (lv_type_0_0= CISetting ) ) this_INDENT_1= RULE_INDENT otherlv_2= CiTypes ( (lv_ciTypes_3_0= ruleMultiValueList ) ) otherlv_4= AppliedRepos ( (lv_appliedRepos_5_0= ruleMultiMonolithicImplementationNameList ) ) otherlv_6= BranchPrefixType ( (lv_reqBranchPrefix_7_0= RULE_ID ) ) ( (lv_ciParameters_8_0= ruleCIParameters ) )* this_DEDENT_9= RULE_DEDENT
            {
            // InternalDeployModelParser.g:2449:3: ( (lv_type_0_0= CISetting ) )
            // InternalDeployModelParser.g:2450:4: (lv_type_0_0= CISetting )
            {
            // InternalDeployModelParser.g:2450:4: (lv_type_0_0= CISetting )
            // InternalDeployModelParser.g:2451:5: lv_type_0_0= CISetting
            {
            lv_type_0_0=(Token)match(input,CISetting,FOLLOW_4); 

            					newLeafNode(lv_type_0_0, grammarAccess.getCISettingAccess().getTypeCISettingKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCISettingRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "CISetting:");
            				

            }


            }

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_51); 

            			newLeafNode(this_INDENT_1, grammarAccess.getCISettingAccess().getINDENTTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,CiTypes,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getCISettingAccess().getCiTypesKeyword_2());
            		
            // InternalDeployModelParser.g:2471:3: ( (lv_ciTypes_3_0= ruleMultiValueList ) )
            // InternalDeployModelParser.g:2472:4: (lv_ciTypes_3_0= ruleMultiValueList )
            {
            // InternalDeployModelParser.g:2472:4: (lv_ciTypes_3_0= ruleMultiValueList )
            // InternalDeployModelParser.g:2473:5: lv_ciTypes_3_0= ruleMultiValueList
            {

            					newCompositeNode(grammarAccess.getCISettingAccess().getCiTypesMultiValueListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_52);
            lv_ciTypes_3_0=ruleMultiValueList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCISettingRule());
            					}
            					set(
            						current,
            						"ciTypes",
            						lv_ciTypes_3_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.MultiValueList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,AppliedRepos,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getCISettingAccess().getAppliedReposKeyword_4());
            		
            // InternalDeployModelParser.g:2494:3: ( (lv_appliedRepos_5_0= ruleMultiMonolithicImplementationNameList ) )
            // InternalDeployModelParser.g:2495:4: (lv_appliedRepos_5_0= ruleMultiMonolithicImplementationNameList )
            {
            // InternalDeployModelParser.g:2495:4: (lv_appliedRepos_5_0= ruleMultiMonolithicImplementationNameList )
            // InternalDeployModelParser.g:2496:5: lv_appliedRepos_5_0= ruleMultiMonolithicImplementationNameList
            {

            					newCompositeNode(grammarAccess.getCISettingAccess().getAppliedReposMultiMonolithicImplementationNameListParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_53);
            lv_appliedRepos_5_0=ruleMultiMonolithicImplementationNameList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCISettingRule());
            					}
            					set(
            						current,
            						"appliedRepos",
            						lv_appliedRepos_5_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.MultiMonolithicImplementationNameList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,BranchPrefixType,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getCISettingAccess().getBranchPrefixTypeKeyword_6());
            		
            // InternalDeployModelParser.g:2517:3: ( (lv_reqBranchPrefix_7_0= RULE_ID ) )
            // InternalDeployModelParser.g:2518:4: (lv_reqBranchPrefix_7_0= RULE_ID )
            {
            // InternalDeployModelParser.g:2518:4: (lv_reqBranchPrefix_7_0= RULE_ID )
            // InternalDeployModelParser.g:2519:5: lv_reqBranchPrefix_7_0= RULE_ID
            {
            lv_reqBranchPrefix_7_0=(Token)match(input,RULE_ID,FOLLOW_54); 

            					newLeafNode(lv_reqBranchPrefix_7_0, grammarAccess.getCISettingAccess().getReqBranchPrefixIDTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCISettingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"reqBranchPrefix",
            						lv_reqBranchPrefix_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDeployModelParser.g:2535:3: ( (lv_ciParameters_8_0= ruleCIParameters ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalDeployModelParser.g:2536:4: (lv_ciParameters_8_0= ruleCIParameters )
            	    {
            	    // InternalDeployModelParser.g:2536:4: (lv_ciParameters_8_0= ruleCIParameters )
            	    // InternalDeployModelParser.g:2537:5: lv_ciParameters_8_0= ruleCIParameters
            	    {

            	    					newCompositeNode(grammarAccess.getCISettingAccess().getCiParametersCIParametersParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_54);
            	    lv_ciParameters_8_0=ruleCIParameters();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCISettingRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ciParameters",
            	    						lv_ciParameters_8_0,
            	    						"de.fraunhofer.ipa.deployment.DeployModel.CIParameters");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            this_DEDENT_9=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_9, grammarAccess.getCISettingAccess().getDEDENTTerminalRuleCall_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCISetting"


    // $ANTLR start "entryRuleMultiMonolithicImplementationNameList"
    // InternalDeployModelParser.g:2562:1: entryRuleMultiMonolithicImplementationNameList returns [EObject current=null] : iv_ruleMultiMonolithicImplementationNameList= ruleMultiMonolithicImplementationNameList EOF ;
    public final EObject entryRuleMultiMonolithicImplementationNameList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiMonolithicImplementationNameList = null;


        try {
            // InternalDeployModelParser.g:2562:78: (iv_ruleMultiMonolithicImplementationNameList= ruleMultiMonolithicImplementationNameList EOF )
            // InternalDeployModelParser.g:2563:2: iv_ruleMultiMonolithicImplementationNameList= ruleMultiMonolithicImplementationNameList EOF
            {
             newCompositeNode(grammarAccess.getMultiMonolithicImplementationNameListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiMonolithicImplementationNameList=ruleMultiMonolithicImplementationNameList();

            state._fsp--;

             current =iv_ruleMultiMonolithicImplementationNameList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiMonolithicImplementationNameList"


    // $ANTLR start "ruleMultiMonolithicImplementationNameList"
    // InternalDeployModelParser.g:2569:1: ruleMultiMonolithicImplementationNameList returns [EObject current=null] : (this_MultiMonolithicImplementationNamePreList_0= ruleMultiMonolithicImplementationNamePreList | this_MultiMonolithicImplementationNameListBracket_1= ruleMultiMonolithicImplementationNameListBracket ) ;
    public final EObject ruleMultiMonolithicImplementationNameList() throws RecognitionException {
        EObject current = null;

        EObject this_MultiMonolithicImplementationNamePreList_0 = null;

        EObject this_MultiMonolithicImplementationNameListBracket_1 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:2575:2: ( (this_MultiMonolithicImplementationNamePreList_0= ruleMultiMonolithicImplementationNamePreList | this_MultiMonolithicImplementationNameListBracket_1= ruleMultiMonolithicImplementationNameListBracket ) )
            // InternalDeployModelParser.g:2576:2: (this_MultiMonolithicImplementationNamePreList_0= ruleMultiMonolithicImplementationNamePreList | this_MultiMonolithicImplementationNameListBracket_1= ruleMultiMonolithicImplementationNameListBracket )
            {
            // InternalDeployModelParser.g:2576:2: (this_MultiMonolithicImplementationNamePreList_0= ruleMultiMonolithicImplementationNamePreList | this_MultiMonolithicImplementationNameListBracket_1= ruleMultiMonolithicImplementationNameListBracket )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_INDENT) ) {
                alt35=1;
            }
            else if ( (LA35_0==LeftSquareBracket) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalDeployModelParser.g:2577:3: this_MultiMonolithicImplementationNamePreList_0= ruleMultiMonolithicImplementationNamePreList
                    {

                    			newCompositeNode(grammarAccess.getMultiMonolithicImplementationNameListAccess().getMultiMonolithicImplementationNamePreListParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultiMonolithicImplementationNamePreList_0=ruleMultiMonolithicImplementationNamePreList();

                    state._fsp--;


                    			current = this_MultiMonolithicImplementationNamePreList_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:2586:3: this_MultiMonolithicImplementationNameListBracket_1= ruleMultiMonolithicImplementationNameListBracket
                    {

                    			newCompositeNode(grammarAccess.getMultiMonolithicImplementationNameListAccess().getMultiMonolithicImplementationNameListBracketParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultiMonolithicImplementationNameListBracket_1=ruleMultiMonolithicImplementationNameListBracket();

                    state._fsp--;


                    			current = this_MultiMonolithicImplementationNameListBracket_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiMonolithicImplementationNameList"


    // $ANTLR start "entryRuleMultiMonolithicImplementationNamePreList"
    // InternalDeployModelParser.g:2598:1: entryRuleMultiMonolithicImplementationNamePreList returns [EObject current=null] : iv_ruleMultiMonolithicImplementationNamePreList= ruleMultiMonolithicImplementationNamePreList EOF ;
    public final EObject entryRuleMultiMonolithicImplementationNamePreList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiMonolithicImplementationNamePreList = null;


        try {
            // InternalDeployModelParser.g:2598:81: (iv_ruleMultiMonolithicImplementationNamePreList= ruleMultiMonolithicImplementationNamePreList EOF )
            // InternalDeployModelParser.g:2599:2: iv_ruleMultiMonolithicImplementationNamePreList= ruleMultiMonolithicImplementationNamePreList EOF
            {
             newCompositeNode(grammarAccess.getMultiMonolithicImplementationNamePreListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiMonolithicImplementationNamePreList=ruleMultiMonolithicImplementationNamePreList();

            state._fsp--;

             current =iv_ruleMultiMonolithicImplementationNamePreList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiMonolithicImplementationNamePreList"


    // $ANTLR start "ruleMultiMonolithicImplementationNamePreList"
    // InternalDeployModelParser.g:2605:1: ruleMultiMonolithicImplementationNamePreList returns [EObject current=null] : ( () this_INDENT_1= RULE_INDENT ( rulePreListElement ( ( ruleQualifiedName ) ) )* this_DEDENT_4= RULE_DEDENT ) ;
    public final EObject ruleMultiMonolithicImplementationNamePreList() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_1=null;
        Token this_DEDENT_4=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:2611:2: ( ( () this_INDENT_1= RULE_INDENT ( rulePreListElement ( ( ruleQualifiedName ) ) )* this_DEDENT_4= RULE_DEDENT ) )
            // InternalDeployModelParser.g:2612:2: ( () this_INDENT_1= RULE_INDENT ( rulePreListElement ( ( ruleQualifiedName ) ) )* this_DEDENT_4= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:2612:2: ( () this_INDENT_1= RULE_INDENT ( rulePreListElement ( ( ruleQualifiedName ) ) )* this_DEDENT_4= RULE_DEDENT )
            // InternalDeployModelParser.g:2613:3: () this_INDENT_1= RULE_INDENT ( rulePreListElement ( ( ruleQualifiedName ) ) )* this_DEDENT_4= RULE_DEDENT
            {
            // InternalDeployModelParser.g:2613:3: ()
            // InternalDeployModelParser.g:2614:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMultiMonolithicImplementationNamePreListAccess().getMultiMonolithicImplementationNamePreListAction_0(),
            					current);
            			

            }

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_28); 

            			newLeafNode(this_INDENT_1, grammarAccess.getMultiMonolithicImplementationNamePreListAccess().getINDENTTerminalRuleCall_1());
            		
            // InternalDeployModelParser.g:2624:3: ( rulePreListElement ( ( ruleQualifiedName ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==HyphenMinus) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalDeployModelParser.g:2625:4: rulePreListElement ( ( ruleQualifiedName ) )
            	    {

            	    				newCompositeNode(grammarAccess.getMultiMonolithicImplementationNamePreListAccess().getPreListElementParserRuleCall_2_0());
            	    			
            	    pushFollow(FOLLOW_6);
            	    rulePreListElement();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalDeployModelParser.g:2632:4: ( ( ruleQualifiedName ) )
            	    // InternalDeployModelParser.g:2633:5: ( ruleQualifiedName )
            	    {
            	    // InternalDeployModelParser.g:2633:5: ( ruleQualifiedName )
            	    // InternalDeployModelParser.g:2634:6: ruleQualifiedName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMultiMonolithicImplementationNamePreListRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getMultiMonolithicImplementationNamePreListAccess().getValuesMonolithicImplementationDescriptionCrossReference_2_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            this_DEDENT_4=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_4, grammarAccess.getMultiMonolithicImplementationNamePreListAccess().getDEDENTTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiMonolithicImplementationNamePreList"


    // $ANTLR start "entryRuleMultiMonolithicImplementationNameListBracket"
    // InternalDeployModelParser.g:2657:1: entryRuleMultiMonolithicImplementationNameListBracket returns [EObject current=null] : iv_ruleMultiMonolithicImplementationNameListBracket= ruleMultiMonolithicImplementationNameListBracket EOF ;
    public final EObject entryRuleMultiMonolithicImplementationNameListBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiMonolithicImplementationNameListBracket = null;


        try {
            // InternalDeployModelParser.g:2657:85: (iv_ruleMultiMonolithicImplementationNameListBracket= ruleMultiMonolithicImplementationNameListBracket EOF )
            // InternalDeployModelParser.g:2658:2: iv_ruleMultiMonolithicImplementationNameListBracket= ruleMultiMonolithicImplementationNameListBracket EOF
            {
             newCompositeNode(grammarAccess.getMultiMonolithicImplementationNameListBracketRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiMonolithicImplementationNameListBracket=ruleMultiMonolithicImplementationNameListBracket();

            state._fsp--;

             current =iv_ruleMultiMonolithicImplementationNameListBracket; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiMonolithicImplementationNameListBracket"


    // $ANTLR start "ruleMultiMonolithicImplementationNameListBracket"
    // InternalDeployModelParser.g:2664:1: ruleMultiMonolithicImplementationNameListBracket returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( ( ruleQualifiedName ) ) (otherlv_2= Comma ( ( ruleQualifiedName ) )* )? otherlv_4= RightSquareBracket ) ;
    public final EObject ruleMultiMonolithicImplementationNameListBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:2670:2: ( (otherlv_0= LeftSquareBracket ( ( ruleQualifiedName ) ) (otherlv_2= Comma ( ( ruleQualifiedName ) )* )? otherlv_4= RightSquareBracket ) )
            // InternalDeployModelParser.g:2671:2: (otherlv_0= LeftSquareBracket ( ( ruleQualifiedName ) ) (otherlv_2= Comma ( ( ruleQualifiedName ) )* )? otherlv_4= RightSquareBracket )
            {
            // InternalDeployModelParser.g:2671:2: (otherlv_0= LeftSquareBracket ( ( ruleQualifiedName ) ) (otherlv_2= Comma ( ( ruleQualifiedName ) )* )? otherlv_4= RightSquareBracket )
            // InternalDeployModelParser.g:2672:3: otherlv_0= LeftSquareBracket ( ( ruleQualifiedName ) ) (otherlv_2= Comma ( ( ruleQualifiedName ) )* )? otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiMonolithicImplementationNameListBracketAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalDeployModelParser.g:2676:3: ( ( ruleQualifiedName ) )
            // InternalDeployModelParser.g:2677:4: ( ruleQualifiedName )
            {
            // InternalDeployModelParser.g:2677:4: ( ruleQualifiedName )
            // InternalDeployModelParser.g:2678:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiMonolithicImplementationNameListBracketRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMultiMonolithicImplementationNameListBracketAccess().getValuesMonolithicImplementationDescriptionCrossReference_1_0());
            				
            pushFollow(FOLLOW_31);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeployModelParser.g:2692:3: (otherlv_2= Comma ( ( ruleQualifiedName ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Comma) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDeployModelParser.g:2693:4: otherlv_2= Comma ( ( ruleQualifiedName ) )*
                    {
                    otherlv_2=(Token)match(input,Comma,FOLLOW_55); 

                    				newLeafNode(otherlv_2, grammarAccess.getMultiMonolithicImplementationNameListBracketAccess().getCommaKeyword_2_0());
                    			
                    // InternalDeployModelParser.g:2697:4: ( ( ruleQualifiedName ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==RULE_ID) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalDeployModelParser.g:2698:5: ( ruleQualifiedName )
                    	    {
                    	    // InternalDeployModelParser.g:2698:5: ( ruleQualifiedName )
                    	    // InternalDeployModelParser.g:2699:6: ruleQualifiedName
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getMultiMonolithicImplementationNameListBracketRule());
                    	    						}
                    	    					

                    	    						newCompositeNode(grammarAccess.getMultiMonolithicImplementationNameListBracketAccess().getValuesMonolithicImplementationDescriptionCrossReference_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_55);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMultiMonolithicImplementationNameListBracketAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiMonolithicImplementationNameListBracket"


    // $ANTLR start "entryRuleCIParameters"
    // InternalDeployModelParser.g:2722:1: entryRuleCIParameters returns [EObject current=null] : iv_ruleCIParameters= ruleCIParameters EOF ;
    public final EObject entryRuleCIParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCIParameters = null;


        try {
            // InternalDeployModelParser.g:2722:53: (iv_ruleCIParameters= ruleCIParameters EOF )
            // InternalDeployModelParser.g:2723:2: iv_ruleCIParameters= ruleCIParameters EOF
            {
             newCompositeNode(grammarAccess.getCIParametersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCIParameters=ruleCIParameters();

            state._fsp--;

             current =iv_ruleCIParameters; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCIParameters"


    // $ANTLR start "ruleCIParameters"
    // InternalDeployModelParser.g:2729:1: ruleCIParameters returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT ( (lv_parameters_3_0= ruleGroupedProperties ) )+ this_DEDENT_4= RULE_DEDENT ) ;
    public final EObject ruleCIParameters() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token this_INDENT_2=null;
        Token this_DEDENT_4=null;
        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:2735:2: ( ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT ( (lv_parameters_3_0= ruleGroupedProperties ) )+ this_DEDENT_4= RULE_DEDENT ) )
            // InternalDeployModelParser.g:2736:2: ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT ( (lv_parameters_3_0= ruleGroupedProperties ) )+ this_DEDENT_4= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:2736:2: ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT ( (lv_parameters_3_0= ruleGroupedProperties ) )+ this_DEDENT_4= RULE_DEDENT )
            // InternalDeployModelParser.g:2737:3: ( (lv_type_0_0= RULE_ID ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT ( (lv_parameters_3_0= ruleGroupedProperties ) )+ this_DEDENT_4= RULE_DEDENT
            {
            // InternalDeployModelParser.g:2737:3: ( (lv_type_0_0= RULE_ID ) )
            // InternalDeployModelParser.g:2738:4: (lv_type_0_0= RULE_ID )
            {
            // InternalDeployModelParser.g:2738:4: (lv_type_0_0= RULE_ID )
            // InternalDeployModelParser.g:2739:5: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_44); 

            					newLeafNode(lv_type_0_0, grammarAccess.getCIParametersAccess().getTypeIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCIParametersRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCIParametersAccess().getColonKeyword_1());
            		
            this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_6); 

            			newLeafNode(this_INDENT_2, grammarAccess.getCIParametersAccess().getINDENTTerminalRuleCall_2());
            		
            // InternalDeployModelParser.g:2763:3: ( (lv_parameters_3_0= ruleGroupedProperties ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalDeployModelParser.g:2764:4: (lv_parameters_3_0= ruleGroupedProperties )
            	    {
            	    // InternalDeployModelParser.g:2764:4: (lv_parameters_3_0= ruleGroupedProperties )
            	    // InternalDeployModelParser.g:2765:5: lv_parameters_3_0= ruleGroupedProperties
            	    {

            	    					newCompositeNode(grammarAccess.getCIParametersAccess().getParametersGroupedPropertiesParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_54);
            	    lv_parameters_3_0=ruleGroupedProperties();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCIParametersRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_3_0,
            	    						"de.fraunhofer.ipa.deployment.DeployModel.GroupedProperties");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            this_DEDENT_4=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_4, grammarAccess.getCIParametersAccess().getDEDENTTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCIParameters"


    // $ANTLR start "entryRuleGroupedProperties"
    // InternalDeployModelParser.g:2790:1: entryRuleGroupedProperties returns [EObject current=null] : iv_ruleGroupedProperties= ruleGroupedProperties EOF ;
    public final EObject entryRuleGroupedProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupedProperties = null;


        try {
            // InternalDeployModelParser.g:2790:58: (iv_ruleGroupedProperties= ruleGroupedProperties EOF )
            // InternalDeployModelParser.g:2791:2: iv_ruleGroupedProperties= ruleGroupedProperties EOF
            {
             newCompositeNode(grammarAccess.getGroupedPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupedProperties=ruleGroupedProperties();

            state._fsp--;

             current =iv_ruleGroupedProperties; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupedProperties"


    // $ANTLR start "ruleGroupedProperties"
    // InternalDeployModelParser.g:2797:1: ruleGroupedProperties returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT ( (lv_properties_3_0= rulePropertyExpressType ) )+ this_DEDENT_4= RULE_DEDENT ) ;
    public final EObject ruleGroupedProperties() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token this_INDENT_2=null;
        Token this_DEDENT_4=null;
        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:2803:2: ( ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT ( (lv_properties_3_0= rulePropertyExpressType ) )+ this_DEDENT_4= RULE_DEDENT ) )
            // InternalDeployModelParser.g:2804:2: ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT ( (lv_properties_3_0= rulePropertyExpressType ) )+ this_DEDENT_4= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:2804:2: ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT ( (lv_properties_3_0= rulePropertyExpressType ) )+ this_DEDENT_4= RULE_DEDENT )
            // InternalDeployModelParser.g:2805:3: ( (lv_type_0_0= RULE_ID ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT ( (lv_properties_3_0= rulePropertyExpressType ) )+ this_DEDENT_4= RULE_DEDENT
            {
            // InternalDeployModelParser.g:2805:3: ( (lv_type_0_0= RULE_ID ) )
            // InternalDeployModelParser.g:2806:4: (lv_type_0_0= RULE_ID )
            {
            // InternalDeployModelParser.g:2806:4: (lv_type_0_0= RULE_ID )
            // InternalDeployModelParser.g:2807:5: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_44); 

            					newLeafNode(lv_type_0_0, grammarAccess.getGroupedPropertiesAccess().getTypeIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupedPropertiesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupedPropertiesAccess().getColonKeyword_1());
            		
            this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_25); 

            			newLeafNode(this_INDENT_2, grammarAccess.getGroupedPropertiesAccess().getINDENTTerminalRuleCall_2());
            		
            // InternalDeployModelParser.g:2831:3: ( (lv_properties_3_0= rulePropertyExpressType ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==HyphenMinus) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalDeployModelParser.g:2832:4: (lv_properties_3_0= rulePropertyExpressType )
            	    {
            	    // InternalDeployModelParser.g:2832:4: (lv_properties_3_0= rulePropertyExpressType )
            	    // InternalDeployModelParser.g:2833:5: lv_properties_3_0= rulePropertyExpressType
            	    {

            	    					newCompositeNode(grammarAccess.getGroupedPropertiesAccess().getPropertiesPropertyExpressTypeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_properties_3_0=rulePropertyExpressType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGroupedPropertiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_3_0,
            	    						"de.fraunhofer.ipa.deployment.DeployModel.PropertyExpressType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            this_DEDENT_4=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_4, grammarAccess.getGroupedPropertiesAccess().getDEDENTTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupedProperties"


    // $ANTLR start "entryRulePreListElement"
    // InternalDeployModelParser.g:2858:1: entryRulePreListElement returns [String current=null] : iv_rulePreListElement= rulePreListElement EOF ;
    public final String entryRulePreListElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreListElement = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalDeployModelParser.g:2860:2: (iv_rulePreListElement= rulePreListElement EOF )
            // InternalDeployModelParser.g:2861:2: iv_rulePreListElement= rulePreListElement EOF
            {
             newCompositeNode(grammarAccess.getPreListElementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePreListElement=rulePreListElement();

            state._fsp--;

             current =iv_rulePreListElement.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulePreListElement"


    // $ANTLR start "rulePreListElement"
    // InternalDeployModelParser.g:2870:1: rulePreListElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
    public final AntlrDatatypeRuleToken rulePreListElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalDeployModelParser.g:2877:2: (kw= HyphenMinus )
            // InternalDeployModelParser.g:2878:2: kw= HyphenMinus
            {
            kw=(Token)match(input,HyphenMinus,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getPreListElementAccess().getHyphenMinusKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulePreListElement"


    // $ANTLR start "entryRuleScalarNumber"
    // InternalDeployModelParser.g:2889:1: entryRuleScalarNumber returns [String current=null] : iv_ruleScalarNumber= ruleScalarNumber EOF ;
    public final String entryRuleScalarNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleScalarNumber = null;


        try {
            // InternalDeployModelParser.g:2889:52: (iv_ruleScalarNumber= ruleScalarNumber EOF )
            // InternalDeployModelParser.g:2890:2: iv_ruleScalarNumber= ruleScalarNumber EOF
            {
             newCompositeNode(grammarAccess.getScalarNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScalarNumber=ruleScalarNumber();

            state._fsp--;

             current =iv_ruleScalarNumber.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalarNumber"


    // $ANTLR start "ruleScalarNumber"
    // InternalDeployModelParser.g:2896:1: ruleScalarNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Number_0= ruleNumber (this_Unit_1= ruleUnit )? ) ;
    public final AntlrDatatypeRuleToken ruleScalarNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Number_0 = null;

        AntlrDatatypeRuleToken this_Unit_1 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:2902:2: ( (this_Number_0= ruleNumber (this_Unit_1= ruleUnit )? ) )
            // InternalDeployModelParser.g:2903:2: (this_Number_0= ruleNumber (this_Unit_1= ruleUnit )? )
            {
            // InternalDeployModelParser.g:2903:2: (this_Number_0= ruleNumber (this_Unit_1= ruleUnit )? )
            // InternalDeployModelParser.g:2904:3: this_Number_0= ruleNumber (this_Unit_1= ruleUnit )?
            {

            			newCompositeNode(grammarAccess.getScalarNumberAccess().getNumberParserRuleCall_0());
            		
            pushFollow(FOLLOW_56);
            this_Number_0=ruleNumber();

            state._fsp--;


            			current.merge(this_Number_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalDeployModelParser.g:2914:3: (this_Unit_1= ruleUnit )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=GHz && LA41_0<=MHz)||(LA41_0>=KHz && LA41_0<=Hz)||(LA41_0>=Kb && LA41_0<=Us)||LA41_0==B||(LA41_0>=B_1 && LA41_0<=S)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDeployModelParser.g:2915:4: this_Unit_1= ruleUnit
                    {

                    				newCompositeNode(grammarAccess.getScalarNumberAccess().getUnitParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Unit_1=ruleUnit();

                    state._fsp--;


                    				current.merge(this_Unit_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalarNumber"


    // $ANTLR start "entryRuleNumber"
    // InternalDeployModelParser.g:2930:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalDeployModelParser.g:2930:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalDeployModelParser.g:2931:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalDeployModelParser.g:2937:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_FLOAT_1=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:2943:2: ( (this_INT_0= RULE_INT | this_FLOAT_1= RULE_FLOAT ) )
            // InternalDeployModelParser.g:2944:2: (this_INT_0= RULE_INT | this_FLOAT_1= RULE_FLOAT )
            {
            // InternalDeployModelParser.g:2944:2: (this_INT_0= RULE_INT | this_FLOAT_1= RULE_FLOAT )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_INT) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_FLOAT) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalDeployModelParser.g:2945:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:2953:3: this_FLOAT_1= RULE_FLOAT
                    {
                    this_FLOAT_1=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

                    			current.merge(this_FLOAT_1);
                    		

                    			newLeafNode(this_FLOAT_1, grammarAccess.getNumberAccess().getFLOATTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleUnit"
    // InternalDeployModelParser.g:2964:1: entryRuleUnit returns [String current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final String entryRuleUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnit = null;


        try {
            // InternalDeployModelParser.g:2964:44: (iv_ruleUnit= ruleUnit EOF )
            // InternalDeployModelParser.g:2965:2: iv_ruleUnit= ruleUnit EOF
            {
             newCompositeNode(grammarAccess.getUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnit=ruleUnit();

            state._fsp--;

             current =iv_ruleUnit.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnit"


    // $ANTLR start "ruleUnit"
    // InternalDeployModelParser.g:2971:1: ruleUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ScalarUnitSize_0= ruleScalarUnitSize | this_ScalarUnitTime_1= ruleScalarUnitTime | this_ScalarUnitFrequency_2= ruleScalarUnitFrequency ) ;
    public final AntlrDatatypeRuleToken ruleUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ScalarUnitSize_0 = null;

        AntlrDatatypeRuleToken this_ScalarUnitTime_1 = null;

        AntlrDatatypeRuleToken this_ScalarUnitFrequency_2 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:2977:2: ( (this_ScalarUnitSize_0= ruleScalarUnitSize | this_ScalarUnitTime_1= ruleScalarUnitTime | this_ScalarUnitFrequency_2= ruleScalarUnitFrequency ) )
            // InternalDeployModelParser.g:2978:2: (this_ScalarUnitSize_0= ruleScalarUnitSize | this_ScalarUnitTime_1= ruleScalarUnitTime | this_ScalarUnitFrequency_2= ruleScalarUnitFrequency )
            {
            // InternalDeployModelParser.g:2978:2: (this_ScalarUnitSize_0= ruleScalarUnitSize | this_ScalarUnitTime_1= ruleScalarUnitTime | this_ScalarUnitFrequency_2= ruleScalarUnitFrequency )
            int alt43=3;
            switch ( input.LA(1) ) {
            case GB:
            case Gb:
            case Kb:
            case MB:
            case Mb:
            case TB:
            case Tb:
            case GB_1:
            case Gb_1:
            case KB_1:
            case Kb_1:
            case MB_1:
            case Mb_1:
            case TB_1:
            case Tb_1:
            case B:
            case B_1:
                {
                alt43=1;
                }
                break;
            case Ms:
            case Ns:
            case Us:
            case D:
            case H:
            case M:
            case S:
                {
                alt43=2;
                }
                break;
            case GHz:
            case MHz:
            case KHz:
            case Hz:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalDeployModelParser.g:2979:3: this_ScalarUnitSize_0= ruleScalarUnitSize
                    {

                    			newCompositeNode(grammarAccess.getUnitAccess().getScalarUnitSizeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScalarUnitSize_0=ruleScalarUnitSize();

                    state._fsp--;


                    			current.merge(this_ScalarUnitSize_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:2990:3: this_ScalarUnitTime_1= ruleScalarUnitTime
                    {

                    			newCompositeNode(grammarAccess.getUnitAccess().getScalarUnitTimeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScalarUnitTime_1=ruleScalarUnitTime();

                    state._fsp--;


                    			current.merge(this_ScalarUnitTime_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDeployModelParser.g:3001:3: this_ScalarUnitFrequency_2= ruleScalarUnitFrequency
                    {

                    			newCompositeNode(grammarAccess.getUnitAccess().getScalarUnitFrequencyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScalarUnitFrequency_2=ruleScalarUnitFrequency();

                    state._fsp--;


                    			current.merge(this_ScalarUnitFrequency_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnit"


    // $ANTLR start "entryRuleScalarUnitSize"
    // InternalDeployModelParser.g:3015:1: entryRuleScalarUnitSize returns [String current=null] : iv_ruleScalarUnitSize= ruleScalarUnitSize EOF ;
    public final String entryRuleScalarUnitSize() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleScalarUnitSize = null;


        try {
            // InternalDeployModelParser.g:3015:54: (iv_ruleScalarUnitSize= ruleScalarUnitSize EOF )
            // InternalDeployModelParser.g:3016:2: iv_ruleScalarUnitSize= ruleScalarUnitSize EOF
            {
             newCompositeNode(grammarAccess.getScalarUnitSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScalarUnitSize=ruleScalarUnitSize();

            state._fsp--;

             current =iv_ruleScalarUnitSize.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalarUnitSize"


    // $ANTLR start "ruleScalarUnitSize"
    // InternalDeployModelParser.g:3022:1: ruleScalarUnitSize returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= B | (kw= B_1 kw= KB ) | kw= Kb_1 | kw= KB_1 | kw= Kb | kw= MB | kw= Mb_1 | kw= MB_1 | kw= Mb | kw= GB | kw= Gb_1 | kw= Gb | kw= GB_1 | kw= TB | kw= Tb_1 | kw= Tb | kw= TB_1 ) ;
    public final AntlrDatatypeRuleToken ruleScalarUnitSize() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:3028:2: ( (kw= B | (kw= B_1 kw= KB ) | kw= Kb_1 | kw= KB_1 | kw= Kb | kw= MB | kw= Mb_1 | kw= MB_1 | kw= Mb | kw= GB | kw= Gb_1 | kw= Gb | kw= GB_1 | kw= TB | kw= Tb_1 | kw= Tb | kw= TB_1 ) )
            // InternalDeployModelParser.g:3029:2: (kw= B | (kw= B_1 kw= KB ) | kw= Kb_1 | kw= KB_1 | kw= Kb | kw= MB | kw= Mb_1 | kw= MB_1 | kw= Mb | kw= GB | kw= Gb_1 | kw= Gb | kw= GB_1 | kw= TB | kw= Tb_1 | kw= Tb | kw= TB_1 )
            {
            // InternalDeployModelParser.g:3029:2: (kw= B | (kw= B_1 kw= KB ) | kw= Kb_1 | kw= KB_1 | kw= Kb | kw= MB | kw= Mb_1 | kw= MB_1 | kw= Mb | kw= GB | kw= Gb_1 | kw= Gb | kw= GB_1 | kw= TB | kw= Tb_1 | kw= Tb | kw= TB_1 )
            int alt44=17;
            switch ( input.LA(1) ) {
            case B:
                {
                alt44=1;
                }
                break;
            case B_1:
                {
                alt44=2;
                }
                break;
            case Kb_1:
                {
                alt44=3;
                }
                break;
            case KB_1:
                {
                alt44=4;
                }
                break;
            case Kb:
                {
                alt44=5;
                }
                break;
            case MB:
                {
                alt44=6;
                }
                break;
            case Mb_1:
                {
                alt44=7;
                }
                break;
            case MB_1:
                {
                alt44=8;
                }
                break;
            case Mb:
                {
                alt44=9;
                }
                break;
            case GB:
                {
                alt44=10;
                }
                break;
            case Gb_1:
                {
                alt44=11;
                }
                break;
            case Gb:
                {
                alt44=12;
                }
                break;
            case GB_1:
                {
                alt44=13;
                }
                break;
            case TB:
                {
                alt44=14;
                }
                break;
            case Tb_1:
                {
                alt44=15;
                }
                break;
            case Tb:
                {
                alt44=16;
                }
                break;
            case TB_1:
                {
                alt44=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalDeployModelParser.g:3030:3: kw= B
                    {
                    kw=(Token)match(input,B,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getBKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:3036:3: (kw= B_1 kw= KB )
                    {
                    // InternalDeployModelParser.g:3036:3: (kw= B_1 kw= KB )
                    // InternalDeployModelParser.g:3037:4: kw= B_1 kw= KB
                    {
                    kw=(Token)match(input,B_1,FOLLOW_57); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getBKeyword_1_0());
                    			
                    kw=(Token)match(input,KB,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getKBKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDeployModelParser.g:3049:3: kw= Kb_1
                    {
                    kw=(Token)match(input,Kb_1,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getKbKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDeployModelParser.g:3055:3: kw= KB_1
                    {
                    kw=(Token)match(input,KB_1,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getKBKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalDeployModelParser.g:3061:3: kw= Kb
                    {
                    kw=(Token)match(input,Kb,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getKbKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalDeployModelParser.g:3067:3: kw= MB
                    {
                    kw=(Token)match(input,MB,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getMBKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalDeployModelParser.g:3073:3: kw= Mb_1
                    {
                    kw=(Token)match(input,Mb_1,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getMbKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalDeployModelParser.g:3079:3: kw= MB_1
                    {
                    kw=(Token)match(input,MB_1,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getMBKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalDeployModelParser.g:3085:3: kw= Mb
                    {
                    kw=(Token)match(input,Mb,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getMbKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalDeployModelParser.g:3091:3: kw= GB
                    {
                    kw=(Token)match(input,GB,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getGBKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalDeployModelParser.g:3097:3: kw= Gb_1
                    {
                    kw=(Token)match(input,Gb_1,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getGbKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalDeployModelParser.g:3103:3: kw= Gb
                    {
                    kw=(Token)match(input,Gb,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getGbKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalDeployModelParser.g:3109:3: kw= GB_1
                    {
                    kw=(Token)match(input,GB_1,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getGBKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalDeployModelParser.g:3115:3: kw= TB
                    {
                    kw=(Token)match(input,TB,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getTBKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalDeployModelParser.g:3121:3: kw= Tb_1
                    {
                    kw=(Token)match(input,Tb_1,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getTbKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalDeployModelParser.g:3127:3: kw= Tb
                    {
                    kw=(Token)match(input,Tb,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getTbKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalDeployModelParser.g:3133:3: kw= TB_1
                    {
                    kw=(Token)match(input,TB_1,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getTBKeyword_16());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalarUnitSize"


    // $ANTLR start "entryRuleScalarUnitTime"
    // InternalDeployModelParser.g:3142:1: entryRuleScalarUnitTime returns [String current=null] : iv_ruleScalarUnitTime= ruleScalarUnitTime EOF ;
    public final String entryRuleScalarUnitTime() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleScalarUnitTime = null;


        try {
            // InternalDeployModelParser.g:3142:54: (iv_ruleScalarUnitTime= ruleScalarUnitTime EOF )
            // InternalDeployModelParser.g:3143:2: iv_ruleScalarUnitTime= ruleScalarUnitTime EOF
            {
             newCompositeNode(grammarAccess.getScalarUnitTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScalarUnitTime=ruleScalarUnitTime();

            state._fsp--;

             current =iv_ruleScalarUnitTime.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalarUnitTime"


    // $ANTLR start "ruleScalarUnitTime"
    // InternalDeployModelParser.g:3149:1: ruleScalarUnitTime returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= D | kw= H | kw= M | kw= S | kw= Ms | kw= Us | kw= Ns ) ;
    public final AntlrDatatypeRuleToken ruleScalarUnitTime() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:3155:2: ( (kw= D | kw= H | kw= M | kw= S | kw= Ms | kw= Us | kw= Ns ) )
            // InternalDeployModelParser.g:3156:2: (kw= D | kw= H | kw= M | kw= S | kw= Ms | kw= Us | kw= Ns )
            {
            // InternalDeployModelParser.g:3156:2: (kw= D | kw= H | kw= M | kw= S | kw= Ms | kw= Us | kw= Ns )
            int alt45=7;
            switch ( input.LA(1) ) {
            case D:
                {
                alt45=1;
                }
                break;
            case H:
                {
                alt45=2;
                }
                break;
            case M:
                {
                alt45=3;
                }
                break;
            case S:
                {
                alt45=4;
                }
                break;
            case Ms:
                {
                alt45=5;
                }
                break;
            case Us:
                {
                alt45=6;
                }
                break;
            case Ns:
                {
                alt45=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalDeployModelParser.g:3157:3: kw= D
                    {
                    kw=(Token)match(input,D,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitTimeAccess().getDKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:3163:3: kw= H
                    {
                    kw=(Token)match(input,H,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitTimeAccess().getHKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDeployModelParser.g:3169:3: kw= M
                    {
                    kw=(Token)match(input,M,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitTimeAccess().getMKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDeployModelParser.g:3175:3: kw= S
                    {
                    kw=(Token)match(input,S,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitTimeAccess().getSKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalDeployModelParser.g:3181:3: kw= Ms
                    {
                    kw=(Token)match(input,Ms,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitTimeAccess().getMsKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalDeployModelParser.g:3187:3: kw= Us
                    {
                    kw=(Token)match(input,Us,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitTimeAccess().getUsKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalDeployModelParser.g:3193:3: kw= Ns
                    {
                    kw=(Token)match(input,Ns,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitTimeAccess().getNsKeyword_6());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalarUnitTime"


    // $ANTLR start "entryRuleScalarUnitFrequency"
    // InternalDeployModelParser.g:3202:1: entryRuleScalarUnitFrequency returns [String current=null] : iv_ruleScalarUnitFrequency= ruleScalarUnitFrequency EOF ;
    public final String entryRuleScalarUnitFrequency() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleScalarUnitFrequency = null;


        try {
            // InternalDeployModelParser.g:3202:59: (iv_ruleScalarUnitFrequency= ruleScalarUnitFrequency EOF )
            // InternalDeployModelParser.g:3203:2: iv_ruleScalarUnitFrequency= ruleScalarUnitFrequency EOF
            {
             newCompositeNode(grammarAccess.getScalarUnitFrequencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScalarUnitFrequency=ruleScalarUnitFrequency();

            state._fsp--;

             current =iv_ruleScalarUnitFrequency.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalarUnitFrequency"


    // $ANTLR start "ruleScalarUnitFrequency"
    // InternalDeployModelParser.g:3209:1: ruleScalarUnitFrequency returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Hz | kw= KHz | kw= MHz | kw= GHz ) ;
    public final AntlrDatatypeRuleToken ruleScalarUnitFrequency() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:3215:2: ( (kw= Hz | kw= KHz | kw= MHz | kw= GHz ) )
            // InternalDeployModelParser.g:3216:2: (kw= Hz | kw= KHz | kw= MHz | kw= GHz )
            {
            // InternalDeployModelParser.g:3216:2: (kw= Hz | kw= KHz | kw= MHz | kw= GHz )
            int alt46=4;
            switch ( input.LA(1) ) {
            case Hz:
                {
                alt46=1;
                }
                break;
            case KHz:
                {
                alt46=2;
                }
                break;
            case MHz:
                {
                alt46=3;
                }
                break;
            case GHz:
                {
                alt46=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalDeployModelParser.g:3217:3: kw= Hz
                    {
                    kw=(Token)match(input,Hz,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitFrequencyAccess().getHzKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:3223:3: kw= KHz
                    {
                    kw=(Token)match(input,KHz,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitFrequencyAccess().getKHzKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDeployModelParser.g:3229:3: kw= MHz
                    {
                    kw=(Token)match(input,MHz,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitFrequencyAccess().getMHzKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDeployModelParser.g:3235:3: kw= GHz
                    {
                    kw=(Token)match(input,GHz,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitFrequencyAccess().getGHzKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalarUnitFrequency"


    // $ANTLR start "ruleImplementationModeType"
    // InternalDeployModelParser.g:3244:1: ruleImplementationModeType returns [Enumerator current=null] : ( (enumLiteral_0= Debug ) | (enumLiteral_1= Release ) ) ;
    public final Enumerator ruleImplementationModeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:3250:2: ( ( (enumLiteral_0= Debug ) | (enumLiteral_1= Release ) ) )
            // InternalDeployModelParser.g:3251:2: ( (enumLiteral_0= Debug ) | (enumLiteral_1= Release ) )
            {
            // InternalDeployModelParser.g:3251:2: ( (enumLiteral_0= Debug ) | (enumLiteral_1= Release ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Debug) ) {
                alt47=1;
            }
            else if ( (LA47_0==Release) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalDeployModelParser.g:3252:3: (enumLiteral_0= Debug )
                    {
                    // InternalDeployModelParser.g:3252:3: (enumLiteral_0= Debug )
                    // InternalDeployModelParser.g:3253:4: enumLiteral_0= Debug
                    {
                    enumLiteral_0=(Token)match(input,Debug,FOLLOW_2); 

                    				current = grammarAccess.getImplementationModeTypeAccess().getDebugModeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getImplementationModeTypeAccess().getDebugModeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:3260:3: (enumLiteral_1= Release )
                    {
                    // InternalDeployModelParser.g:3260:3: (enumLiteral_1= Release )
                    // InternalDeployModelParser.g:3261:4: enumLiteral_1= Release
                    {
                    enumLiteral_1=(Token)match(input,Release,FOLLOW_2); 

                    				current = grammarAccess.getImplementationModeTypeAccess().getReleaseModeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getImplementationModeTypeAccess().getReleaseModeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplementationModeType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000852L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000400000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L,0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000001090000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000041100L,0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000041000L,0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000040000L,0x0000000000400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200200L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000001860000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000001860400L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000000A028000L,0x0000000000400000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000000A008000L,0x0000000000400000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000002008000L,0x0000000000400000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000002000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000800000L,0x0000000000400000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000100000L,0x0000000000400000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800400L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0xFFF7B00000000002L,0x000000000000F90FL});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0008000000000000L});

}