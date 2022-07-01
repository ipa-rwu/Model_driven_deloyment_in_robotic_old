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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MonolithicImplementationDescription", "ImplementationArtifactDescription", "StackImplementationDescription", "Processor_architecture", "RepositoryDescription", "ResourceRequirements", "ImplementsRosModel", "PackageDescription", "DeployRequirements", "BuildRequirements", "ImageDescription", "Oom_kill_disable", "AptRepositories", "RepositoryPath", "ImageVersions", "StartCommands", "UpdateRosDep", "Description", "Memory_swap", "Ros_distro", "DependOn", "Galactic", "KeyLink", "Location", "Ubuntu18", "Ubuntu20", "Branch_1", "Import", "Melodic", "Release", "Branch", "Commit", "Docker", "Gitlab", "Latest", "Memory", "Noetic", "Remote", "Types", "Value", "Arm64", "Debug", "From", "Local", "Mode", "Name", "Path", "Type", "Cpus", "Foxy", "Snap", "Use", "GHz", "MHz", "Any", "KHz", "X86", "GB", "Gb", "Hz", "KB", "Kb", "MB", "Mb", "TB", "Tb", "GB_1", "Gb_1", "KB_1", "Kb_1", "MB_1", "Mb_1", "Ms", "Ns", "Os", "TB_1", "Tb_1", "Us", "Comma", "HyphenMinus", "FullStop", "Colon", "B", "LeftSquareBracket", "RightSquareBracket", "B_1", "D", "H", "M", "S", "RULE_LOCALPATH", "RULE_INT", "RULE_FLOAT", "RULE_URL", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Import=31;
    public static final int Mb_1=75;
    public static final int Os=78;
    public static final int Memory=39;
    public static final int ImplementationArtifactDescription=5;
    public static final int Memory_swap=22;
    public static final int DependOn=24;
    public static final int Noetic=40;
    public static final int RULE_LOCALPATH=94;
    public static final int Docker=36;
    public static final int MonolithicImplementationDescription=4;
    public static final int MB_1=74;
    public static final int RULE_ID=101;
    public static final int Local=47;
    public static final int Hz=63;
    public static final int Arm64=44;
    public static final int RULE_INT=95;
    public static final int RULE_ML_COMMENT=103;
    public static final int Galactic=25;
    public static final int LeftSquareBracket=87;
    public static final int MHz=57;
    public static final int B=86;
    public static final int Description=21;
    public static final int KeyLink=26;
    public static final int D=90;
    public static final int H=91;
    public static final int DeployRequirements=12;
    public static final int Kb_1=73;
    public static final int ImageVersions=18;
    public static final int M=92;
    public static final int RepositoryPath=17;
    public static final int Comma=82;
    public static final int HyphenMinus=83;
    public static final int S=93;
    public static final int Ubuntu20=29;
    public static final int X86=60;
    public static final int KB=64;
    public static final int RULE_INDENT=99;
    public static final int Path=50;
    public static final int FullStop=84;
    public static final int UpdateRosDep=20;
    public static final int Use=55;
    public static final int Ros_distro=23;
    public static final int KB_1=72;
    public static final int TB=68;
    public static final int Type=51;
    public static final int B_1=89;
    public static final int Kb=65;
    public static final int ImplementsRosModel=10;
    public static final int RULE_FLOAT=96;
    public static final int RepositoryDescription=8;
    public static final int PackageDescription=11;
    public static final int Types=42;
    public static final int TB_1=79;
    public static final int Foxy=53;
    public static final int ResourceRequirements=9;
    public static final int Tb=69;
    public static final int BuildRequirements=13;
    public static final int Name=49;
    public static final int MB=66;
    public static final int Latest=38;
    public static final int RightSquareBracket=88;
    public static final int RULE_DEDENT=100;
    public static final int StartCommands=19;
    public static final int Branch_1=30;
    public static final int Mb=67;
    public static final int RULE_URL=97;
    public static final int Value=43;
    public static final int GHz=56;
    public static final int ImageDescription=14;
    public static final int Ubuntu18=28;
    public static final int KHz=59;
    public static final int Gitlab=37;
    public static final int Us=81;
    public static final int Ms=76;
    public static final int Remote=41;
    public static final int RULE_STRING=102;
    public static final int Cpus=52;
    public static final int StackImplementationDescription=6;
    public static final int Gb_1=71;
    public static final int Snap=54;
    public static final int Any=58;
    public static final int RULE_SL_COMMENT=98;
    public static final int Oom_kill_disable=15;
    public static final int Branch=34;
    public static final int GB=61;
    public static final int Colon=85;
    public static final int Melodic=32;
    public static final int EOF=-1;
    public static final int Release=33;
    public static final int Debug=45;
    public static final int Ns=77;
    public static final int RULE_WS=104;
    public static final int Mode=48;
    public static final int Tb_1=80;
    public static final int AptRepositories=16;
    public static final int From=46;
    public static final int RULE_ANY_OTHER=105;
    public static final int GB_1=70;
    public static final int Processor_architecture=7;
    public static final int Commit=35;
    public static final int Gb=62;
    public static final int Location=27;

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

                if ( (LA1_0==MonolithicImplementationDescription||LA1_0==StackImplementationDescription||LA1_0==PackageDescription) ) {
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
    // InternalDeployModelParser.g:110:1: ruleYamlContent returns [EObject current=null] : ( ( (lv_rootContent_0_1= ruleMonolithicImplementationDescription | lv_rootContent_0_2= ruleStackImplementationDescription | lv_rootContent_0_3= rulePackageDescription ) ) ) ;
    public final EObject ruleYamlContent() throws RecognitionException {
        EObject current = null;

        EObject lv_rootContent_0_1 = null;

        EObject lv_rootContent_0_2 = null;

        EObject lv_rootContent_0_3 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:116:2: ( ( ( (lv_rootContent_0_1= ruleMonolithicImplementationDescription | lv_rootContent_0_2= ruleStackImplementationDescription | lv_rootContent_0_3= rulePackageDescription ) ) ) )
            // InternalDeployModelParser.g:117:2: ( ( (lv_rootContent_0_1= ruleMonolithicImplementationDescription | lv_rootContent_0_2= ruleStackImplementationDescription | lv_rootContent_0_3= rulePackageDescription ) ) )
            {
            // InternalDeployModelParser.g:117:2: ( ( (lv_rootContent_0_1= ruleMonolithicImplementationDescription | lv_rootContent_0_2= ruleStackImplementationDescription | lv_rootContent_0_3= rulePackageDescription ) ) )
            // InternalDeployModelParser.g:118:3: ( (lv_rootContent_0_1= ruleMonolithicImplementationDescription | lv_rootContent_0_2= ruleStackImplementationDescription | lv_rootContent_0_3= rulePackageDescription ) )
            {
            // InternalDeployModelParser.g:118:3: ( (lv_rootContent_0_1= ruleMonolithicImplementationDescription | lv_rootContent_0_2= ruleStackImplementationDescription | lv_rootContent_0_3= rulePackageDescription ) )
            // InternalDeployModelParser.g:119:4: (lv_rootContent_0_1= ruleMonolithicImplementationDescription | lv_rootContent_0_2= ruleStackImplementationDescription | lv_rootContent_0_3= rulePackageDescription )
            {
            // InternalDeployModelParser.g:119:4: (lv_rootContent_0_1= ruleMonolithicImplementationDescription | lv_rootContent_0_2= ruleStackImplementationDescription | lv_rootContent_0_3= rulePackageDescription )
            int alt2=3;
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
    // InternalDeployModelParser.g:173:1: entryRuleMonolithicImplementationDescription returns [EObject current=null] : iv_ruleMonolithicImplementationDescription= ruleMonolithicImplementationDescription EOF ;
    public final EObject entryRuleMonolithicImplementationDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonolithicImplementationDescription = null;


        try {
            // InternalDeployModelParser.g:173:76: (iv_ruleMonolithicImplementationDescription= ruleMonolithicImplementationDescription EOF )
            // InternalDeployModelParser.g:174:2: iv_ruleMonolithicImplementationDescription= ruleMonolithicImplementationDescription EOF
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
    // InternalDeployModelParser.g:180:1: ruleMonolithicImplementationDescription returns [EObject current=null] : ( ( (lv_type_0_0= MonolithicImplementationDescription ) ) this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ImplementsRosModel ( (lv_impRosmodel_5_0= RULE_STRING ) ) )? otherlv_6= Description ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= Mode ( (lv_mode_9_0= ruleImplementationModeType ) ) otherlv_10= Branch_1 ( (lv_branch_11_0= ruleBranchType ) ) ( (lv_impl_12_0= ruleImplementationArtifactDescription ) )? this_DEDENT_13= RULE_DEDENT ) ;
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
        Token this_DEDENT_13=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        Enumerator lv_mode_9_0 = null;

        AntlrDatatypeRuleToken lv_branch_11_0 = null;

        EObject lv_impl_12_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:186:2: ( ( ( (lv_type_0_0= MonolithicImplementationDescription ) ) this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ImplementsRosModel ( (lv_impRosmodel_5_0= RULE_STRING ) ) )? otherlv_6= Description ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= Mode ( (lv_mode_9_0= ruleImplementationModeType ) ) otherlv_10= Branch_1 ( (lv_branch_11_0= ruleBranchType ) ) ( (lv_impl_12_0= ruleImplementationArtifactDescription ) )? this_DEDENT_13= RULE_DEDENT ) )
            // InternalDeployModelParser.g:187:2: ( ( (lv_type_0_0= MonolithicImplementationDescription ) ) this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ImplementsRosModel ( (lv_impRosmodel_5_0= RULE_STRING ) ) )? otherlv_6= Description ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= Mode ( (lv_mode_9_0= ruleImplementationModeType ) ) otherlv_10= Branch_1 ( (lv_branch_11_0= ruleBranchType ) ) ( (lv_impl_12_0= ruleImplementationArtifactDescription ) )? this_DEDENT_13= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:187:2: ( ( (lv_type_0_0= MonolithicImplementationDescription ) ) this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ImplementsRosModel ( (lv_impRosmodel_5_0= RULE_STRING ) ) )? otherlv_6= Description ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= Mode ( (lv_mode_9_0= ruleImplementationModeType ) ) otherlv_10= Branch_1 ( (lv_branch_11_0= ruleBranchType ) ) ( (lv_impl_12_0= ruleImplementationArtifactDescription ) )? this_DEDENT_13= RULE_DEDENT )
            // InternalDeployModelParser.g:188:3: ( (lv_type_0_0= MonolithicImplementationDescription ) ) this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ImplementsRosModel ( (lv_impRosmodel_5_0= RULE_STRING ) ) )? otherlv_6= Description ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= Mode ( (lv_mode_9_0= ruleImplementationModeType ) ) otherlv_10= Branch_1 ( (lv_branch_11_0= ruleBranchType ) ) ( (lv_impl_12_0= ruleImplementationArtifactDescription ) )? this_DEDENT_13= RULE_DEDENT
            {
            // InternalDeployModelParser.g:188:3: ( (lv_type_0_0= MonolithicImplementationDescription ) )
            // InternalDeployModelParser.g:189:4: (lv_type_0_0= MonolithicImplementationDescription )
            {
            // InternalDeployModelParser.g:189:4: (lv_type_0_0= MonolithicImplementationDescription )
            // InternalDeployModelParser.g:190:5: lv_type_0_0= MonolithicImplementationDescription
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
            		
            // InternalDeployModelParser.g:210:3: ( (lv_name_3_0= ruleQualifiedName ) )
            // InternalDeployModelParser.g:211:4: (lv_name_3_0= ruleQualifiedName )
            {
            // InternalDeployModelParser.g:211:4: (lv_name_3_0= ruleQualifiedName )
            // InternalDeployModelParser.g:212:5: lv_name_3_0= ruleQualifiedName
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

            // InternalDeployModelParser.g:229:3: (otherlv_4= ImplementsRosModel ( (lv_impRosmodel_5_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ImplementsRosModel) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDeployModelParser.g:230:4: otherlv_4= ImplementsRosModel ( (lv_impRosmodel_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,ImplementsRosModel,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getMonolithicImplementationDescriptionAccess().getImplementsRosModelKeyword_4_0());
                    			
                    // InternalDeployModelParser.g:234:4: ( (lv_impRosmodel_5_0= RULE_STRING ) )
                    // InternalDeployModelParser.g:235:5: (lv_impRosmodel_5_0= RULE_STRING )
                    {
                    // InternalDeployModelParser.g:235:5: (lv_impRosmodel_5_0= RULE_STRING )
                    // InternalDeployModelParser.g:236:6: lv_impRosmodel_5_0= RULE_STRING
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
            		
            // InternalDeployModelParser.g:257:3: ( (lv_description_7_0= RULE_STRING ) )
            // InternalDeployModelParser.g:258:4: (lv_description_7_0= RULE_STRING )
            {
            // InternalDeployModelParser.g:258:4: (lv_description_7_0= RULE_STRING )
            // InternalDeployModelParser.g:259:5: lv_description_7_0= RULE_STRING
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
            		
            // InternalDeployModelParser.g:279:3: ( (lv_mode_9_0= ruleImplementationModeType ) )
            // InternalDeployModelParser.g:280:4: (lv_mode_9_0= ruleImplementationModeType )
            {
            // InternalDeployModelParser.g:280:4: (lv_mode_9_0= ruleImplementationModeType )
            // InternalDeployModelParser.g:281:5: lv_mode_9_0= ruleImplementationModeType
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

            otherlv_10=(Token)match(input,Branch_1,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getMonolithicImplementationDescriptionAccess().getBranchKeyword_9());
            		
            // InternalDeployModelParser.g:302:3: ( (lv_branch_11_0= ruleBranchType ) )
            // InternalDeployModelParser.g:303:4: (lv_branch_11_0= ruleBranchType )
            {
            // InternalDeployModelParser.g:303:4: (lv_branch_11_0= ruleBranchType )
            // InternalDeployModelParser.g:304:5: lv_branch_11_0= ruleBranchType
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

            // InternalDeployModelParser.g:321:3: ( (lv_impl_12_0= ruleImplementationArtifactDescription ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ImplementationArtifactDescription) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDeployModelParser.g:322:4: (lv_impl_12_0= ruleImplementationArtifactDescription )
                    {
                    // InternalDeployModelParser.g:322:4: (lv_impl_12_0= ruleImplementationArtifactDescription )
                    // InternalDeployModelParser.g:323:5: lv_impl_12_0= ruleImplementationArtifactDescription
                    {

                    					newCompositeNode(grammarAccess.getMonolithicImplementationDescriptionAccess().getImplImplementationArtifactDescriptionParserRuleCall_11_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_impl_12_0=ruleImplementationArtifactDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMonolithicImplementationDescriptionRule());
                    					}
                    					set(
                    						current,
                    						"impl",
                    						lv_impl_12_0,
                    						"de.fraunhofer.ipa.deployment.DeployModel.ImplementationArtifactDescription");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_DEDENT_13=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_13, grammarAccess.getMonolithicImplementationDescriptionAccess().getDEDENTTerminalRuleCall_12());
            		

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
    // InternalDeployModelParser.g:348:1: entryRuleBranchType returns [String current=null] : iv_ruleBranchType= ruleBranchType EOF ;
    public final String entryRuleBranchType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBranchType = null;


        try {
            // InternalDeployModelParser.g:348:50: (iv_ruleBranchType= ruleBranchType EOF )
            // InternalDeployModelParser.g:349:2: iv_ruleBranchType= ruleBranchType EOF
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
    // InternalDeployModelParser.g:355:1: ruleBranchType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | kw= Any ) ;
    public final AntlrDatatypeRuleToken ruleBranchType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:361:2: ( (this_STRING_0= RULE_STRING | kw= Any ) )
            // InternalDeployModelParser.g:362:2: (this_STRING_0= RULE_STRING | kw= Any )
            {
            // InternalDeployModelParser.g:362:2: (this_STRING_0= RULE_STRING | kw= Any )
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
                    // InternalDeployModelParser.g:363:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getBranchTypeAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:371:3: kw= Any
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
    // InternalDeployModelParser.g:380:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalDeployModelParser.g:380:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDeployModelParser.g:381:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalDeployModelParser.g:387:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:393:2: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) )
            // InternalDeployModelParser.g:394:2: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            {
            // InternalDeployModelParser.g:394:2: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            // InternalDeployModelParser.g:395:3: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalDeployModelParser.g:402:3: (kw= FullStop this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==FullStop) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDeployModelParser.g:403:4: kw= FullStop this_ID_2= RULE_ID
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
    // InternalDeployModelParser.g:420:1: entryRuleNewImplementationArtifact returns [EObject current=null] : iv_ruleNewImplementationArtifact= ruleNewImplementationArtifact EOF ;
    public final EObject entryRuleNewImplementationArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewImplementationArtifact = null;


        try {
            // InternalDeployModelParser.g:420:66: (iv_ruleNewImplementationArtifact= ruleNewImplementationArtifact EOF )
            // InternalDeployModelParser.g:421:2: iv_ruleNewImplementationArtifact= ruleNewImplementationArtifact EOF
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
    // InternalDeployModelParser.g:427:1: ruleNewImplementationArtifact returns [EObject current=null] : (otherlv_0= Location otherlv_1= Colon ( ( (lv_name_2_1= RULE_LOCALPATH | lv_name_2_2= RULE_URL ) ) ) ( (lv_deployRequirements_3_0= ruleDeploymentRequirements ) ) ( (lv_resourceRequirements_4_0= ruleResourceRequirements ) )? ( (lv_buildRequirements_5_0= ruleBuildRequirements ) )? ( (lv_startCommands_6_0= ruleStartCommands ) ) ) ;
    public final EObject ruleNewImplementationArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        EObject lv_deployRequirements_3_0 = null;

        EObject lv_resourceRequirements_4_0 = null;

        EObject lv_buildRequirements_5_0 = null;

        EObject lv_startCommands_6_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:433:2: ( (otherlv_0= Location otherlv_1= Colon ( ( (lv_name_2_1= RULE_LOCALPATH | lv_name_2_2= RULE_URL ) ) ) ( (lv_deployRequirements_3_0= ruleDeploymentRequirements ) ) ( (lv_resourceRequirements_4_0= ruleResourceRequirements ) )? ( (lv_buildRequirements_5_0= ruleBuildRequirements ) )? ( (lv_startCommands_6_0= ruleStartCommands ) ) ) )
            // InternalDeployModelParser.g:434:2: (otherlv_0= Location otherlv_1= Colon ( ( (lv_name_2_1= RULE_LOCALPATH | lv_name_2_2= RULE_URL ) ) ) ( (lv_deployRequirements_3_0= ruleDeploymentRequirements ) ) ( (lv_resourceRequirements_4_0= ruleResourceRequirements ) )? ( (lv_buildRequirements_5_0= ruleBuildRequirements ) )? ( (lv_startCommands_6_0= ruleStartCommands ) ) )
            {
            // InternalDeployModelParser.g:434:2: (otherlv_0= Location otherlv_1= Colon ( ( (lv_name_2_1= RULE_LOCALPATH | lv_name_2_2= RULE_URL ) ) ) ( (lv_deployRequirements_3_0= ruleDeploymentRequirements ) ) ( (lv_resourceRequirements_4_0= ruleResourceRequirements ) )? ( (lv_buildRequirements_5_0= ruleBuildRequirements ) )? ( (lv_startCommands_6_0= ruleStartCommands ) ) )
            // InternalDeployModelParser.g:435:3: otherlv_0= Location otherlv_1= Colon ( ( (lv_name_2_1= RULE_LOCALPATH | lv_name_2_2= RULE_URL ) ) ) ( (lv_deployRequirements_3_0= ruleDeploymentRequirements ) ) ( (lv_resourceRequirements_4_0= ruleResourceRequirements ) )? ( (lv_buildRequirements_5_0= ruleBuildRequirements ) )? ( (lv_startCommands_6_0= ruleStartCommands ) )
            {
            otherlv_0=(Token)match(input,Location,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getNewImplementationArtifactAccess().getLocationKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getNewImplementationArtifactAccess().getColonKeyword_1());
            		
            // InternalDeployModelParser.g:443:3: ( ( (lv_name_2_1= RULE_LOCALPATH | lv_name_2_2= RULE_URL ) ) )
            // InternalDeployModelParser.g:444:4: ( (lv_name_2_1= RULE_LOCALPATH | lv_name_2_2= RULE_URL ) )
            {
            // InternalDeployModelParser.g:444:4: ( (lv_name_2_1= RULE_LOCALPATH | lv_name_2_2= RULE_URL ) )
            // InternalDeployModelParser.g:445:5: (lv_name_2_1= RULE_LOCALPATH | lv_name_2_2= RULE_URL )
            {
            // InternalDeployModelParser.g:445:5: (lv_name_2_1= RULE_LOCALPATH | lv_name_2_2= RULE_URL )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_LOCALPATH) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_URL) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDeployModelParser.g:446:6: lv_name_2_1= RULE_LOCALPATH
                    {
                    lv_name_2_1=(Token)match(input,RULE_LOCALPATH,FOLLOW_19); 

                    						newLeafNode(lv_name_2_1, grammarAccess.getNewImplementationArtifactAccess().getNameLOCALPATHTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNewImplementationArtifactRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_1,
                    							"de.fraunhofer.ipa.deployment.DeployModel.LOCALPATH");
                    					

                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:461:6: lv_name_2_2= RULE_URL
                    {
                    lv_name_2_2=(Token)match(input,RULE_URL,FOLLOW_19); 

                    						newLeafNode(lv_name_2_2, grammarAccess.getNewImplementationArtifactAccess().getNameURLTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNewImplementationArtifactRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_2,
                    							"de.fraunhofer.ipa.deployment.DeployModel.URL");
                    					

                    }
                    break;

            }


            }


            }

            // InternalDeployModelParser.g:478:3: ( (lv_deployRequirements_3_0= ruleDeploymentRequirements ) )
            // InternalDeployModelParser.g:479:4: (lv_deployRequirements_3_0= ruleDeploymentRequirements )
            {
            // InternalDeployModelParser.g:479:4: (lv_deployRequirements_3_0= ruleDeploymentRequirements )
            // InternalDeployModelParser.g:480:5: lv_deployRequirements_3_0= ruleDeploymentRequirements
            {

            					newCompositeNode(grammarAccess.getNewImplementationArtifactAccess().getDeployRequirementsDeploymentRequirementsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_deployRequirements_3_0=ruleDeploymentRequirements();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNewImplementationArtifactRule());
            					}
            					set(
            						current,
            						"deployRequirements",
            						lv_deployRequirements_3_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.DeploymentRequirements");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeployModelParser.g:497:3: ( (lv_resourceRequirements_4_0= ruleResourceRequirements ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ResourceRequirements) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDeployModelParser.g:498:4: (lv_resourceRequirements_4_0= ruleResourceRequirements )
                    {
                    // InternalDeployModelParser.g:498:4: (lv_resourceRequirements_4_0= ruleResourceRequirements )
                    // InternalDeployModelParser.g:499:5: lv_resourceRequirements_4_0= ruleResourceRequirements
                    {

                    					newCompositeNode(grammarAccess.getNewImplementationArtifactAccess().getResourceRequirementsResourceRequirementsParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_resourceRequirements_4_0=ruleResourceRequirements();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNewImplementationArtifactRule());
                    					}
                    					set(
                    						current,
                    						"resourceRequirements",
                    						lv_resourceRequirements_4_0,
                    						"de.fraunhofer.ipa.deployment.DeployModel.ResourceRequirements");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDeployModelParser.g:516:3: ( (lv_buildRequirements_5_0= ruleBuildRequirements ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==BuildRequirements) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDeployModelParser.g:517:4: (lv_buildRequirements_5_0= ruleBuildRequirements )
                    {
                    // InternalDeployModelParser.g:517:4: (lv_buildRequirements_5_0= ruleBuildRequirements )
                    // InternalDeployModelParser.g:518:5: lv_buildRequirements_5_0= ruleBuildRequirements
                    {

                    					newCompositeNode(grammarAccess.getNewImplementationArtifactAccess().getBuildRequirementsBuildRequirementsParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_buildRequirements_5_0=ruleBuildRequirements();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNewImplementationArtifactRule());
                    					}
                    					set(
                    						current,
                    						"buildRequirements",
                    						lv_buildRequirements_5_0,
                    						"de.fraunhofer.ipa.deployment.DeployModel.BuildRequirements");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDeployModelParser.g:535:3: ( (lv_startCommands_6_0= ruleStartCommands ) )
            // InternalDeployModelParser.g:536:4: (lv_startCommands_6_0= ruleStartCommands )
            {
            // InternalDeployModelParser.g:536:4: (lv_startCommands_6_0= ruleStartCommands )
            // InternalDeployModelParser.g:537:5: lv_startCommands_6_0= ruleStartCommands
            {

            					newCompositeNode(grammarAccess.getNewImplementationArtifactAccess().getStartCommandsStartCommandsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_startCommands_6_0=ruleStartCommands();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNewImplementationArtifactRule());
            					}
            					set(
            						current,
            						"startCommands",
            						lv_startCommands_6_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.StartCommands");
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
    // $ANTLR end "ruleNewImplementationArtifact"


    // $ANTLR start "entryRuleImplementationArtifactDescription"
    // InternalDeployModelParser.g:558:1: entryRuleImplementationArtifactDescription returns [EObject current=null] : iv_ruleImplementationArtifactDescription= ruleImplementationArtifactDescription EOF ;
    public final EObject entryRuleImplementationArtifactDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationArtifactDescription = null;


        try {
            // InternalDeployModelParser.g:558:74: (iv_ruleImplementationArtifactDescription= ruleImplementationArtifactDescription EOF )
            // InternalDeployModelParser.g:559:2: iv_ruleImplementationArtifactDescription= ruleImplementationArtifactDescription EOF
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
    // InternalDeployModelParser.g:565:1: ruleImplementationArtifactDescription returns [EObject current=null] : ( ( (lv_type_0_0= ImplementationArtifactDescription ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT ( ( (lv_impl_3_1= ruleNewImplementationArtifact | lv_impl_3_2= ruleReuseImplementationArtifact ) ) ) this_DEDENT_4= RULE_DEDENT ) ;
    public final EObject ruleImplementationArtifactDescription() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token this_INDENT_2=null;
        Token this_DEDENT_4=null;
        EObject lv_impl_3_1 = null;

        EObject lv_impl_3_2 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:571:2: ( ( ( (lv_type_0_0= ImplementationArtifactDescription ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT ( ( (lv_impl_3_1= ruleNewImplementationArtifact | lv_impl_3_2= ruleReuseImplementationArtifact ) ) ) this_DEDENT_4= RULE_DEDENT ) )
            // InternalDeployModelParser.g:572:2: ( ( (lv_type_0_0= ImplementationArtifactDescription ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT ( ( (lv_impl_3_1= ruleNewImplementationArtifact | lv_impl_3_2= ruleReuseImplementationArtifact ) ) ) this_DEDENT_4= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:572:2: ( ( (lv_type_0_0= ImplementationArtifactDescription ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT ( ( (lv_impl_3_1= ruleNewImplementationArtifact | lv_impl_3_2= ruleReuseImplementationArtifact ) ) ) this_DEDENT_4= RULE_DEDENT )
            // InternalDeployModelParser.g:573:3: ( (lv_type_0_0= ImplementationArtifactDescription ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT ( ( (lv_impl_3_1= ruleNewImplementationArtifact | lv_impl_3_2= ruleReuseImplementationArtifact ) ) ) this_DEDENT_4= RULE_DEDENT
            {
            // InternalDeployModelParser.g:573:3: ( (lv_type_0_0= ImplementationArtifactDescription ) )
            // InternalDeployModelParser.g:574:4: (lv_type_0_0= ImplementationArtifactDescription )
            {
            // InternalDeployModelParser.g:574:4: (lv_type_0_0= ImplementationArtifactDescription )
            // InternalDeployModelParser.g:575:5: lv_type_0_0= ImplementationArtifactDescription
            {
            lv_type_0_0=(Token)match(input,ImplementationArtifactDescription,FOLLOW_17); 

            					newLeafNode(lv_type_0_0, grammarAccess.getImplementationArtifactDescriptionAccess().getTypeImplementationArtifactDescriptionKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImplementationArtifactDescriptionRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "ImplementationArtifactDescription");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getImplementationArtifactDescriptionAccess().getColonKeyword_1());
            		
            this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_21); 

            			newLeafNode(this_INDENT_2, grammarAccess.getImplementationArtifactDescriptionAccess().getINDENTTerminalRuleCall_2());
            		
            // InternalDeployModelParser.g:595:3: ( ( (lv_impl_3_1= ruleNewImplementationArtifact | lv_impl_3_2= ruleReuseImplementationArtifact ) ) )
            // InternalDeployModelParser.g:596:4: ( (lv_impl_3_1= ruleNewImplementationArtifact | lv_impl_3_2= ruleReuseImplementationArtifact ) )
            {
            // InternalDeployModelParser.g:596:4: ( (lv_impl_3_1= ruleNewImplementationArtifact | lv_impl_3_2= ruleReuseImplementationArtifact ) )
            // InternalDeployModelParser.g:597:5: (lv_impl_3_1= ruleNewImplementationArtifact | lv_impl_3_2= ruleReuseImplementationArtifact )
            {
            // InternalDeployModelParser.g:597:5: (lv_impl_3_1= ruleNewImplementationArtifact | lv_impl_3_2= ruleReuseImplementationArtifact )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Location) ) {
                alt10=1;
            }
            else if ( (LA10_0==Use) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDeployModelParser.g:598:6: lv_impl_3_1= ruleNewImplementationArtifact
                    {

                    						newCompositeNode(grammarAccess.getImplementationArtifactDescriptionAccess().getImplNewImplementationArtifactParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_impl_3_1=ruleNewImplementationArtifact();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImplementationArtifactDescriptionRule());
                    						}
                    						set(
                    							current,
                    							"impl",
                    							lv_impl_3_1,
                    							"de.fraunhofer.ipa.deployment.DeployModel.NewImplementationArtifact");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:614:6: lv_impl_3_2= ruleReuseImplementationArtifact
                    {

                    						newCompositeNode(grammarAccess.getImplementationArtifactDescriptionAccess().getImplReuseImplementationArtifactParserRuleCall_3_0_1());
                    					
                    pushFollow(FOLLOW_15);
                    lv_impl_3_2=ruleReuseImplementationArtifact();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImplementationArtifactDescriptionRule());
                    						}
                    						set(
                    							current,
                    							"impl",
                    							lv_impl_3_2,
                    							"de.fraunhofer.ipa.deployment.DeployModel.ReuseImplementationArtifact");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            this_DEDENT_4=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_4, grammarAccess.getImplementationArtifactDescriptionAccess().getDEDENTTerminalRuleCall_4());
            		

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
    // InternalDeployModelParser.g:640:1: entryRuleReuseImplementationArtifact returns [EObject current=null] : iv_ruleReuseImplementationArtifact= ruleReuseImplementationArtifact EOF ;
    public final EObject entryRuleReuseImplementationArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReuseImplementationArtifact = null;


        try {
            // InternalDeployModelParser.g:640:68: (iv_ruleReuseImplementationArtifact= ruleReuseImplementationArtifact EOF )
            // InternalDeployModelParser.g:641:2: iv_ruleReuseImplementationArtifact= ruleReuseImplementationArtifact EOF
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
    // InternalDeployModelParser.g:647:1: ruleReuseImplementationArtifact returns [EObject current=null] : (otherlv_0= Use ( (lv_lists_1_0= ruleImplementationArtifactAbstract ) )+ ) ;
    public final EObject ruleReuseImplementationArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_lists_1_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:653:2: ( (otherlv_0= Use ( (lv_lists_1_0= ruleImplementationArtifactAbstract ) )+ ) )
            // InternalDeployModelParser.g:654:2: (otherlv_0= Use ( (lv_lists_1_0= ruleImplementationArtifactAbstract ) )+ )
            {
            // InternalDeployModelParser.g:654:2: (otherlv_0= Use ( (lv_lists_1_0= ruleImplementationArtifactAbstract ) )+ )
            // InternalDeployModelParser.g:655:3: otherlv_0= Use ( (lv_lists_1_0= ruleImplementationArtifactAbstract ) )+
            {
            otherlv_0=(Token)match(input,Use,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getReuseImplementationArtifactAccess().getUseKeyword_0());
            		
            // InternalDeployModelParser.g:659:3: ( (lv_lists_1_0= ruleImplementationArtifactAbstract ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==HyphenMinus) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDeployModelParser.g:660:4: (lv_lists_1_0= ruleImplementationArtifactAbstract )
            	    {
            	    // InternalDeployModelParser.g:660:4: (lv_lists_1_0= ruleImplementationArtifactAbstract )
            	    // InternalDeployModelParser.g:661:5: lv_lists_1_0= ruleImplementationArtifactAbstract
            	    {

            	    					newCompositeNode(grammarAccess.getReuseImplementationArtifactAccess().getListsImplementationArtifactAbstractParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_23);
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    // InternalDeployModelParser.g:682:1: entryRuleImplementationArtifactAbstract returns [EObject current=null] : iv_ruleImplementationArtifactAbstract= ruleImplementationArtifactAbstract EOF ;
    public final EObject entryRuleImplementationArtifactAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationArtifactAbstract = null;


        try {
            // InternalDeployModelParser.g:682:71: (iv_ruleImplementationArtifactAbstract= ruleImplementationArtifactAbstract EOF )
            // InternalDeployModelParser.g:683:2: iv_ruleImplementationArtifactAbstract= ruleImplementationArtifactAbstract EOF
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
    // InternalDeployModelParser.g:689:1: ruleImplementationArtifactAbstract returns [EObject current=null] : ( rulePreListElement otherlv_1= Import ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) this_INDENT_3= RULE_INDENT otherlv_4= Name ( ( ruleQualifiedName ) ) ( (lv_startCommands_6_0= ruleStartCommands ) ) this_DEDENT_7= RULE_DEDENT ) ;
    public final EObject ruleImplementationArtifactAbstract() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token this_DEDENT_7=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        EObject lv_startCommands_6_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:695:2: ( ( rulePreListElement otherlv_1= Import ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) this_INDENT_3= RULE_INDENT otherlv_4= Name ( ( ruleQualifiedName ) ) ( (lv_startCommands_6_0= ruleStartCommands ) ) this_DEDENT_7= RULE_DEDENT ) )
            // InternalDeployModelParser.g:696:2: ( rulePreListElement otherlv_1= Import ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) this_INDENT_3= RULE_INDENT otherlv_4= Name ( ( ruleQualifiedName ) ) ( (lv_startCommands_6_0= ruleStartCommands ) ) this_DEDENT_7= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:696:2: ( rulePreListElement otherlv_1= Import ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) this_INDENT_3= RULE_INDENT otherlv_4= Name ( ( ruleQualifiedName ) ) ( (lv_startCommands_6_0= ruleStartCommands ) ) this_DEDENT_7= RULE_DEDENT )
            // InternalDeployModelParser.g:697:3: rulePreListElement otherlv_1= Import ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) this_INDENT_3= RULE_INDENT otherlv_4= Name ( ( ruleQualifiedName ) ) ( (lv_startCommands_6_0= ruleStartCommands ) ) this_DEDENT_7= RULE_DEDENT
            {

            			newCompositeNode(grammarAccess.getImplementationArtifactAbstractAccess().getPreListElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,Import,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getImplementationArtifactAbstractAccess().getImportKeyword_1());
            		
            // InternalDeployModelParser.g:708:3: ( (lv_importedNamespace_2_0= ruleQualifiedName ) )
            // InternalDeployModelParser.g:709:4: (lv_importedNamespace_2_0= ruleQualifiedName )
            {
            // InternalDeployModelParser.g:709:4: (lv_importedNamespace_2_0= ruleQualifiedName )
            // InternalDeployModelParser.g:710:5: lv_importedNamespace_2_0= ruleQualifiedName
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
            		
            // InternalDeployModelParser.g:735:3: ( ( ruleQualifiedName ) )
            // InternalDeployModelParser.g:736:4: ( ruleQualifiedName )
            {
            // InternalDeployModelParser.g:736:4: ( ruleQualifiedName )
            // InternalDeployModelParser.g:737:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImplementationArtifactAbstractRule());
            					}
            				

            					newCompositeNode(grammarAccess.getImplementationArtifactAbstractAccess().getNameMonolithicImplementationDescriptionCrossReference_5_0());
            				
            pushFollow(FOLLOW_20);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeployModelParser.g:751:3: ( (lv_startCommands_6_0= ruleStartCommands ) )
            // InternalDeployModelParser.g:752:4: (lv_startCommands_6_0= ruleStartCommands )
            {
            // InternalDeployModelParser.g:752:4: (lv_startCommands_6_0= ruleStartCommands )
            // InternalDeployModelParser.g:753:5: lv_startCommands_6_0= ruleStartCommands
            {

            					newCompositeNode(grammarAccess.getImplementationArtifactAbstractAccess().getStartCommandsStartCommandsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_15);
            lv_startCommands_6_0=ruleStartCommands();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImplementationArtifactAbstractRule());
            					}
            					set(
            						current,
            						"startCommands",
            						lv_startCommands_6_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.StartCommands");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_DEDENT_7=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_7, grammarAccess.getImplementationArtifactAbstractAccess().getDEDENTTerminalRuleCall_7());
            		

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
    // InternalDeployModelParser.g:778:1: entryRuleDeploymentRequirements returns [EObject current=null] : iv_ruleDeploymentRequirements= ruleDeploymentRequirements EOF ;
    public final EObject entryRuleDeploymentRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploymentRequirements = null;


        try {
            // InternalDeployModelParser.g:778:63: (iv_ruleDeploymentRequirements= ruleDeploymentRequirements EOF )
            // InternalDeployModelParser.g:779:2: iv_ruleDeploymentRequirements= ruleDeploymentRequirements EOF
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
    // InternalDeployModelParser.g:785:1: ruleDeploymentRequirements returns [EObject current=null] : ( ( (lv_name_0_0= DeployRequirements ) ) otherlv_1= Colon ( (lv_operatingSystem_2_0= ruleReqOperatingSystem ) ) ( (lv_processorArchitecture_3_0= ruleReqProcessorArchitecture ) ) ( (lv_rosDistro_4_0= ruleReqRosDistro ) )? ) ;
    public final EObject ruleDeploymentRequirements() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_operatingSystem_2_0 = null;

        EObject lv_processorArchitecture_3_0 = null;

        EObject lv_rosDistro_4_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:791:2: ( ( ( (lv_name_0_0= DeployRequirements ) ) otherlv_1= Colon ( (lv_operatingSystem_2_0= ruleReqOperatingSystem ) ) ( (lv_processorArchitecture_3_0= ruleReqProcessorArchitecture ) ) ( (lv_rosDistro_4_0= ruleReqRosDistro ) )? ) )
            // InternalDeployModelParser.g:792:2: ( ( (lv_name_0_0= DeployRequirements ) ) otherlv_1= Colon ( (lv_operatingSystem_2_0= ruleReqOperatingSystem ) ) ( (lv_processorArchitecture_3_0= ruleReqProcessorArchitecture ) ) ( (lv_rosDistro_4_0= ruleReqRosDistro ) )? )
            {
            // InternalDeployModelParser.g:792:2: ( ( (lv_name_0_0= DeployRequirements ) ) otherlv_1= Colon ( (lv_operatingSystem_2_0= ruleReqOperatingSystem ) ) ( (lv_processorArchitecture_3_0= ruleReqProcessorArchitecture ) ) ( (lv_rosDistro_4_0= ruleReqRosDistro ) )? )
            // InternalDeployModelParser.g:793:3: ( (lv_name_0_0= DeployRequirements ) ) otherlv_1= Colon ( (lv_operatingSystem_2_0= ruleReqOperatingSystem ) ) ( (lv_processorArchitecture_3_0= ruleReqProcessorArchitecture ) ) ( (lv_rosDistro_4_0= ruleReqRosDistro ) )?
            {
            // InternalDeployModelParser.g:793:3: ( (lv_name_0_0= DeployRequirements ) )
            // InternalDeployModelParser.g:794:4: (lv_name_0_0= DeployRequirements )
            {
            // InternalDeployModelParser.g:794:4: (lv_name_0_0= DeployRequirements )
            // InternalDeployModelParser.g:795:5: lv_name_0_0= DeployRequirements
            {
            lv_name_0_0=(Token)match(input,DeployRequirements,FOLLOW_17); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDeploymentRequirementsAccess().getNameDeployRequirementsKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeploymentRequirementsRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "deployRequirements");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getDeploymentRequirementsAccess().getColonKeyword_1());
            		
            // InternalDeployModelParser.g:811:3: ( (lv_operatingSystem_2_0= ruleReqOperatingSystem ) )
            // InternalDeployModelParser.g:812:4: (lv_operatingSystem_2_0= ruleReqOperatingSystem )
            {
            // InternalDeployModelParser.g:812:4: (lv_operatingSystem_2_0= ruleReqOperatingSystem )
            // InternalDeployModelParser.g:813:5: lv_operatingSystem_2_0= ruleReqOperatingSystem
            {

            					newCompositeNode(grammarAccess.getDeploymentRequirementsAccess().getOperatingSystemReqOperatingSystemParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_operatingSystem_2_0=ruleReqOperatingSystem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeploymentRequirementsRule());
            					}
            					set(
            						current,
            						"operatingSystem",
            						lv_operatingSystem_2_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.ReqOperatingSystem");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeployModelParser.g:830:3: ( (lv_processorArchitecture_3_0= ruleReqProcessorArchitecture ) )
            // InternalDeployModelParser.g:831:4: (lv_processorArchitecture_3_0= ruleReqProcessorArchitecture )
            {
            // InternalDeployModelParser.g:831:4: (lv_processorArchitecture_3_0= ruleReqProcessorArchitecture )
            // InternalDeployModelParser.g:832:5: lv_processorArchitecture_3_0= ruleReqProcessorArchitecture
            {

            					newCompositeNode(grammarAccess.getDeploymentRequirementsAccess().getProcessorArchitectureReqProcessorArchitectureParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_processorArchitecture_3_0=ruleReqProcessorArchitecture();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeploymentRequirementsRule());
            					}
            					set(
            						current,
            						"processorArchitecture",
            						lv_processorArchitecture_3_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.ReqProcessorArchitecture");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeployModelParser.g:849:3: ( (lv_rosDistro_4_0= ruleReqRosDistro ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==HyphenMinus) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDeployModelParser.g:850:4: (lv_rosDistro_4_0= ruleReqRosDistro )
                    {
                    // InternalDeployModelParser.g:850:4: (lv_rosDistro_4_0= ruleReqRosDistro )
                    // InternalDeployModelParser.g:851:5: lv_rosDistro_4_0= ruleReqRosDistro
                    {

                    					newCompositeNode(grammarAccess.getDeploymentRequirementsAccess().getRosDistroReqRosDistroParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_rosDistro_4_0=ruleReqRosDistro();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeploymentRequirementsRule());
                    					}
                    					set(
                    						current,
                    						"rosDistro",
                    						lv_rosDistro_4_0,
                    						"de.fraunhofer.ipa.deployment.DeployModel.ReqRosDistro");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleDeploymentRequirements"


    // $ANTLR start "entryRuleResourceRequirements"
    // InternalDeployModelParser.g:872:1: entryRuleResourceRequirements returns [EObject current=null] : iv_ruleResourceRequirements= ruleResourceRequirements EOF ;
    public final EObject entryRuleResourceRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceRequirements = null;


        try {
            // InternalDeployModelParser.g:872:61: (iv_ruleResourceRequirements= ruleResourceRequirements EOF )
            // InternalDeployModelParser.g:873:2: iv_ruleResourceRequirements= ruleResourceRequirements EOF
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
    // InternalDeployModelParser.g:879:1: ruleResourceRequirements returns [EObject current=null] : ( ( (lv_name_0_0= ResourceRequirements ) ) otherlv_1= Colon ( (lv_requirements_2_0= ruleResourceRequirement ) )+ ) ;
    public final EObject ruleResourceRequirements() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_requirements_2_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:885:2: ( ( ( (lv_name_0_0= ResourceRequirements ) ) otherlv_1= Colon ( (lv_requirements_2_0= ruleResourceRequirement ) )+ ) )
            // InternalDeployModelParser.g:886:2: ( ( (lv_name_0_0= ResourceRequirements ) ) otherlv_1= Colon ( (lv_requirements_2_0= ruleResourceRequirement ) )+ )
            {
            // InternalDeployModelParser.g:886:2: ( ( (lv_name_0_0= ResourceRequirements ) ) otherlv_1= Colon ( (lv_requirements_2_0= ruleResourceRequirement ) )+ )
            // InternalDeployModelParser.g:887:3: ( (lv_name_0_0= ResourceRequirements ) ) otherlv_1= Colon ( (lv_requirements_2_0= ruleResourceRequirement ) )+
            {
            // InternalDeployModelParser.g:887:3: ( (lv_name_0_0= ResourceRequirements ) )
            // InternalDeployModelParser.g:888:4: (lv_name_0_0= ResourceRequirements )
            {
            // InternalDeployModelParser.g:888:4: (lv_name_0_0= ResourceRequirements )
            // InternalDeployModelParser.g:889:5: lv_name_0_0= ResourceRequirements
            {
            lv_name_0_0=(Token)match(input,ResourceRequirements,FOLLOW_17); 

            					newLeafNode(lv_name_0_0, grammarAccess.getResourceRequirementsAccess().getNameResourceRequirementsKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceRequirementsRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "resourceRequirements");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getResourceRequirementsAccess().getColonKeyword_1());
            		
            // InternalDeployModelParser.g:905:3: ( (lv_requirements_2_0= ruleResourceRequirement ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==HyphenMinus) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDeployModelParser.g:906:4: (lv_requirements_2_0= ruleResourceRequirement )
            	    {
            	    // InternalDeployModelParser.g:906:4: (lv_requirements_2_0= ruleResourceRequirement )
            	    // InternalDeployModelParser.g:907:5: lv_requirements_2_0= ruleResourceRequirement
            	    {

            	    					newCompositeNode(grammarAccess.getResourceRequirementsAccess().getRequirementsResourceRequirementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_requirements_2_0=ruleResourceRequirement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getResourceRequirementsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"requirements",
            	    						lv_requirements_2_0,
            	    						"de.fraunhofer.ipa.deployment.DeployModel.ResourceRequirement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
    // $ANTLR end "ruleResourceRequirements"


    // $ANTLR start "entryRuleResourceRequirement"
    // InternalDeployModelParser.g:928:1: entryRuleResourceRequirement returns [EObject current=null] : iv_ruleResourceRequirement= ruleResourceRequirement EOF ;
    public final EObject entryRuleResourceRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceRequirement = null;


        try {
            // InternalDeployModelParser.g:928:60: (iv_ruleResourceRequirement= ruleResourceRequirement EOF )
            // InternalDeployModelParser.g:929:2: iv_ruleResourceRequirement= ruleResourceRequirement EOF
            {
             newCompositeNode(grammarAccess.getResourceRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResourceRequirement=ruleResourceRequirement();

            state._fsp--;

             current =iv_ruleResourceRequirement; 
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
    // $ANTLR end "entryRuleResourceRequirement"


    // $ANTLR start "ruleResourceRequirement"
    // InternalDeployModelParser.g:935:1: ruleResourceRequirement returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleResourceReqTypes ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleScalarNumber ) ) this_DEDENT_6= RULE_DEDENT ) ;
    public final EObject ruleResourceRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token this_DEDENT_6=null;
        Enumerator lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:941:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleResourceReqTypes ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleScalarNumber ) ) this_DEDENT_6= RULE_DEDENT ) )
            // InternalDeployModelParser.g:942:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleResourceReqTypes ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleScalarNumber ) ) this_DEDENT_6= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:942:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleResourceReqTypes ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleScalarNumber ) ) this_DEDENT_6= RULE_DEDENT )
            // InternalDeployModelParser.g:943:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleResourceReqTypes ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleScalarNumber ) ) this_DEDENT_6= RULE_DEDENT
            {

            			newCompositeNode(grammarAccess.getResourceRequirementAccess().getPreListElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getResourceRequirementAccess().getNameKeyword_1());
            		
            // InternalDeployModelParser.g:954:3: ( (lv_name_2_0= ruleResourceReqTypes ) )
            // InternalDeployModelParser.g:955:4: (lv_name_2_0= ruleResourceReqTypes )
            {
            // InternalDeployModelParser.g:955:4: (lv_name_2_0= ruleResourceReqTypes )
            // InternalDeployModelParser.g:956:5: lv_name_2_0= ruleResourceReqTypes
            {

            					newCompositeNode(grammarAccess.getResourceRequirementAccess().getNameResourceReqTypesEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleResourceReqTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResourceRequirementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.ResourceReqTypes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_26); 

            			newLeafNode(this_INDENT_3, grammarAccess.getResourceRequirementAccess().getINDENTTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Value,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getResourceRequirementAccess().getValueKeyword_4());
            		
            // InternalDeployModelParser.g:981:3: ( (lv_value_5_0= ruleScalarNumber ) )
            // InternalDeployModelParser.g:982:4: (lv_value_5_0= ruleScalarNumber )
            {
            // InternalDeployModelParser.g:982:4: (lv_value_5_0= ruleScalarNumber )
            // InternalDeployModelParser.g:983:5: lv_value_5_0= ruleScalarNumber
            {

            					newCompositeNode(grammarAccess.getResourceRequirementAccess().getValueScalarNumberParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_value_5_0=ruleScalarNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResourceRequirementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_5_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.ScalarNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_DEDENT_6=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_6, grammarAccess.getResourceRequirementAccess().getDEDENTTerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleResourceRequirement"


    // $ANTLR start "entryRuleReqOperatingSystem"
    // InternalDeployModelParser.g:1008:1: entryRuleReqOperatingSystem returns [EObject current=null] : iv_ruleReqOperatingSystem= ruleReqOperatingSystem EOF ;
    public final EObject entryRuleReqOperatingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReqOperatingSystem = null;


        try {
            // InternalDeployModelParser.g:1008:59: (iv_ruleReqOperatingSystem= ruleReqOperatingSystem EOF )
            // InternalDeployModelParser.g:1009:2: iv_ruleReqOperatingSystem= ruleReqOperatingSystem EOF
            {
             newCompositeNode(grammarAccess.getReqOperatingSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReqOperatingSystem=ruleReqOperatingSystem();

            state._fsp--;

             current =iv_ruleReqOperatingSystem; 
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
    // $ANTLR end "entryRuleReqOperatingSystem"


    // $ANTLR start "ruleReqOperatingSystem"
    // InternalDeployModelParser.g:1015:1: ruleReqOperatingSystem returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= Os ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleOperatingSystemTypeList ) ) this_DEDENT_6= RULE_DEDENT ) ;
    public final EObject ruleReqOperatingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token this_DEDENT_6=null;
        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:1021:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= Os ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleOperatingSystemTypeList ) ) this_DEDENT_6= RULE_DEDENT ) )
            // InternalDeployModelParser.g:1022:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= Os ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleOperatingSystemTypeList ) ) this_DEDENT_6= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:1022:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= Os ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleOperatingSystemTypeList ) ) this_DEDENT_6= RULE_DEDENT )
            // InternalDeployModelParser.g:1023:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= Os ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleOperatingSystemTypeList ) ) this_DEDENT_6= RULE_DEDENT
            {

            			newCompositeNode(grammarAccess.getReqOperatingSystemAccess().getPreListElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getReqOperatingSystemAccess().getNameKeyword_1());
            		
            // InternalDeployModelParser.g:1034:3: ( (lv_name_2_0= Os ) )
            // InternalDeployModelParser.g:1035:4: (lv_name_2_0= Os )
            {
            // InternalDeployModelParser.g:1035:4: (lv_name_2_0= Os )
            // InternalDeployModelParser.g:1036:5: lv_name_2_0= Os
            {
            lv_name_2_0=(Token)match(input,Os,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getReqOperatingSystemAccess().getNameOsKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReqOperatingSystemRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_2_0, "os");
            				

            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_26); 

            			newLeafNode(this_INDENT_3, grammarAccess.getReqOperatingSystemAccess().getINDENTTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Value,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getReqOperatingSystemAccess().getValueKeyword_4());
            		
            // InternalDeployModelParser.g:1056:3: ( (lv_value_5_0= ruleOperatingSystemTypeList ) )
            // InternalDeployModelParser.g:1057:4: (lv_value_5_0= ruleOperatingSystemTypeList )
            {
            // InternalDeployModelParser.g:1057:4: (lv_value_5_0= ruleOperatingSystemTypeList )
            // InternalDeployModelParser.g:1058:5: lv_value_5_0= ruleOperatingSystemTypeList
            {

            					newCompositeNode(grammarAccess.getReqOperatingSystemAccess().getValueOperatingSystemTypeListParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_value_5_0=ruleOperatingSystemTypeList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReqOperatingSystemRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_5_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.OperatingSystemTypeList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_DEDENT_6=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_6, grammarAccess.getReqOperatingSystemAccess().getDEDENTTerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleReqOperatingSystem"


    // $ANTLR start "entryRuleOperatingSystemTypeList"
    // InternalDeployModelParser.g:1083:1: entryRuleOperatingSystemTypeList returns [EObject current=null] : iv_ruleOperatingSystemTypeList= ruleOperatingSystemTypeList EOF ;
    public final EObject entryRuleOperatingSystemTypeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatingSystemTypeList = null;


        try {
            // InternalDeployModelParser.g:1083:64: (iv_ruleOperatingSystemTypeList= ruleOperatingSystemTypeList EOF )
            // InternalDeployModelParser.g:1084:2: iv_ruleOperatingSystemTypeList= ruleOperatingSystemTypeList EOF
            {
             newCompositeNode(grammarAccess.getOperatingSystemTypeListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperatingSystemTypeList=ruleOperatingSystemTypeList();

            state._fsp--;

             current =iv_ruleOperatingSystemTypeList; 
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
    // $ANTLR end "entryRuleOperatingSystemTypeList"


    // $ANTLR start "ruleOperatingSystemTypeList"
    // InternalDeployModelParser.g:1090:1: ruleOperatingSystemTypeList returns [EObject current=null] : ( ( rulePreListElement ( (lv_children_1_0= ruleOperatingSystemTypes ) ) ) ( rulePreListElement ( (lv_children_3_0= ruleOperatingSystemTypes ) )* )? ) ;
    public final EObject ruleOperatingSystemTypeList() throws RecognitionException {
        EObject current = null;

        Enumerator lv_children_1_0 = null;

        Enumerator lv_children_3_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:1096:2: ( ( ( rulePreListElement ( (lv_children_1_0= ruleOperatingSystemTypes ) ) ) ( rulePreListElement ( (lv_children_3_0= ruleOperatingSystemTypes ) )* )? ) )
            // InternalDeployModelParser.g:1097:2: ( ( rulePreListElement ( (lv_children_1_0= ruleOperatingSystemTypes ) ) ) ( rulePreListElement ( (lv_children_3_0= ruleOperatingSystemTypes ) )* )? )
            {
            // InternalDeployModelParser.g:1097:2: ( ( rulePreListElement ( (lv_children_1_0= ruleOperatingSystemTypes ) ) ) ( rulePreListElement ( (lv_children_3_0= ruleOperatingSystemTypes ) )* )? )
            // InternalDeployModelParser.g:1098:3: ( rulePreListElement ( (lv_children_1_0= ruleOperatingSystemTypes ) ) ) ( rulePreListElement ( (lv_children_3_0= ruleOperatingSystemTypes ) )* )?
            {
            // InternalDeployModelParser.g:1098:3: ( rulePreListElement ( (lv_children_1_0= ruleOperatingSystemTypes ) ) )
            // InternalDeployModelParser.g:1099:4: rulePreListElement ( (lv_children_1_0= ruleOperatingSystemTypes ) )
            {

            				newCompositeNode(grammarAccess.getOperatingSystemTypeListAccess().getPreListElementParserRuleCall_0_0());
            			
            pushFollow(FOLLOW_29);
            rulePreListElement();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			
            // InternalDeployModelParser.g:1106:4: ( (lv_children_1_0= ruleOperatingSystemTypes ) )
            // InternalDeployModelParser.g:1107:5: (lv_children_1_0= ruleOperatingSystemTypes )
            {
            // InternalDeployModelParser.g:1107:5: (lv_children_1_0= ruleOperatingSystemTypes )
            // InternalDeployModelParser.g:1108:6: lv_children_1_0= ruleOperatingSystemTypes
            {

            						newCompositeNode(grammarAccess.getOperatingSystemTypeListAccess().getChildrenOperatingSystemTypesEnumRuleCall_0_1_0());
            					
            pushFollow(FOLLOW_23);
            lv_children_1_0=ruleOperatingSystemTypes();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getOperatingSystemTypeListRule());
            						}
            						add(
            							current,
            							"children",
            							lv_children_1_0,
            							"de.fraunhofer.ipa.deployment.DeployModel.OperatingSystemTypes");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalDeployModelParser.g:1126:3: ( rulePreListElement ( (lv_children_3_0= ruleOperatingSystemTypes ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==HyphenMinus) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDeployModelParser.g:1127:4: rulePreListElement ( (lv_children_3_0= ruleOperatingSystemTypes ) )*
                    {

                    				newCompositeNode(grammarAccess.getOperatingSystemTypeListAccess().getPreListElementParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_30);
                    rulePreListElement();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalDeployModelParser.g:1134:4: ( (lv_children_3_0= ruleOperatingSystemTypes ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=Ubuntu18 && LA14_0<=Ubuntu20)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalDeployModelParser.g:1135:5: (lv_children_3_0= ruleOperatingSystemTypes )
                    	    {
                    	    // InternalDeployModelParser.g:1135:5: (lv_children_3_0= ruleOperatingSystemTypes )
                    	    // InternalDeployModelParser.g:1136:6: lv_children_3_0= ruleOperatingSystemTypes
                    	    {

                    	    						newCompositeNode(grammarAccess.getOperatingSystemTypeListAccess().getChildrenOperatingSystemTypesEnumRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_30);
                    	    lv_children_3_0=ruleOperatingSystemTypes();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getOperatingSystemTypeListRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"children",
                    	    							lv_children_3_0,
                    	    							"de.fraunhofer.ipa.deployment.DeployModel.OperatingSystemTypes");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


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
    // $ANTLR end "ruleOperatingSystemTypeList"


    // $ANTLR start "entryRuleReqProcessorArchitecture"
    // InternalDeployModelParser.g:1158:1: entryRuleReqProcessorArchitecture returns [EObject current=null] : iv_ruleReqProcessorArchitecture= ruleReqProcessorArchitecture EOF ;
    public final EObject entryRuleReqProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReqProcessorArchitecture = null;


        try {
            // InternalDeployModelParser.g:1158:65: (iv_ruleReqProcessorArchitecture= ruleReqProcessorArchitecture EOF )
            // InternalDeployModelParser.g:1159:2: iv_ruleReqProcessorArchitecture= ruleReqProcessorArchitecture EOF
            {
             newCompositeNode(grammarAccess.getReqProcessorArchitectureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReqProcessorArchitecture=ruleReqProcessorArchitecture();

            state._fsp--;

             current =iv_ruleReqProcessorArchitecture; 
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
    // $ANTLR end "entryRuleReqProcessorArchitecture"


    // $ANTLR start "ruleReqProcessorArchitecture"
    // InternalDeployModelParser.g:1165:1: ruleReqProcessorArchitecture returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= Processor_architecture ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleProcessorArchitectureTypeList ) ) this_DEDENT_6= RULE_DEDENT ) ;
    public final EObject ruleReqProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token this_DEDENT_6=null;
        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:1171:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= Processor_architecture ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleProcessorArchitectureTypeList ) ) this_DEDENT_6= RULE_DEDENT ) )
            // InternalDeployModelParser.g:1172:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= Processor_architecture ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleProcessorArchitectureTypeList ) ) this_DEDENT_6= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:1172:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= Processor_architecture ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleProcessorArchitectureTypeList ) ) this_DEDENT_6= RULE_DEDENT )
            // InternalDeployModelParser.g:1173:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= Processor_architecture ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleProcessorArchitectureTypeList ) ) this_DEDENT_6= RULE_DEDENT
            {

            			newCompositeNode(grammarAccess.getReqProcessorArchitectureAccess().getPreListElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getReqProcessorArchitectureAccess().getNameKeyword_1());
            		
            // InternalDeployModelParser.g:1184:3: ( (lv_name_2_0= Processor_architecture ) )
            // InternalDeployModelParser.g:1185:4: (lv_name_2_0= Processor_architecture )
            {
            // InternalDeployModelParser.g:1185:4: (lv_name_2_0= Processor_architecture )
            // InternalDeployModelParser.g:1186:5: lv_name_2_0= Processor_architecture
            {
            lv_name_2_0=(Token)match(input,Processor_architecture,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getReqProcessorArchitectureAccess().getNameProcessor_architectureKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReqProcessorArchitectureRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_2_0, "processor_architecture");
            				

            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_26); 

            			newLeafNode(this_INDENT_3, grammarAccess.getReqProcessorArchitectureAccess().getINDENTTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Value,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getReqProcessorArchitectureAccess().getValueKeyword_4());
            		
            // InternalDeployModelParser.g:1206:3: ( (lv_value_5_0= ruleProcessorArchitectureTypeList ) )
            // InternalDeployModelParser.g:1207:4: (lv_value_5_0= ruleProcessorArchitectureTypeList )
            {
            // InternalDeployModelParser.g:1207:4: (lv_value_5_0= ruleProcessorArchitectureTypeList )
            // InternalDeployModelParser.g:1208:5: lv_value_5_0= ruleProcessorArchitectureTypeList
            {

            					newCompositeNode(grammarAccess.getReqProcessorArchitectureAccess().getValueProcessorArchitectureTypeListParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_value_5_0=ruleProcessorArchitectureTypeList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReqProcessorArchitectureRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_5_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.ProcessorArchitectureTypeList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_DEDENT_6=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_6, grammarAccess.getReqProcessorArchitectureAccess().getDEDENTTerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleReqProcessorArchitecture"


    // $ANTLR start "entryRuleProcessorArchitectureTypeList"
    // InternalDeployModelParser.g:1233:1: entryRuleProcessorArchitectureTypeList returns [EObject current=null] : iv_ruleProcessorArchitectureTypeList= ruleProcessorArchitectureTypeList EOF ;
    public final EObject entryRuleProcessorArchitectureTypeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorArchitectureTypeList = null;


        try {
            // InternalDeployModelParser.g:1233:70: (iv_ruleProcessorArchitectureTypeList= ruleProcessorArchitectureTypeList EOF )
            // InternalDeployModelParser.g:1234:2: iv_ruleProcessorArchitectureTypeList= ruleProcessorArchitectureTypeList EOF
            {
             newCompositeNode(grammarAccess.getProcessorArchitectureTypeListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessorArchitectureTypeList=ruleProcessorArchitectureTypeList();

            state._fsp--;

             current =iv_ruleProcessorArchitectureTypeList; 
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
    // $ANTLR end "entryRuleProcessorArchitectureTypeList"


    // $ANTLR start "ruleProcessorArchitectureTypeList"
    // InternalDeployModelParser.g:1240:1: ruleProcessorArchitectureTypeList returns [EObject current=null] : ( ( rulePreListElement ( (lv_children_1_0= ruleProcessorArchitectureTypes ) ) ) ( rulePreListElement ( (lv_children_3_0= ruleProcessorArchitectureTypes ) )* )? ) ;
    public final EObject ruleProcessorArchitectureTypeList() throws RecognitionException {
        EObject current = null;

        Enumerator lv_children_1_0 = null;

        Enumerator lv_children_3_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:1246:2: ( ( ( rulePreListElement ( (lv_children_1_0= ruleProcessorArchitectureTypes ) ) ) ( rulePreListElement ( (lv_children_3_0= ruleProcessorArchitectureTypes ) )* )? ) )
            // InternalDeployModelParser.g:1247:2: ( ( rulePreListElement ( (lv_children_1_0= ruleProcessorArchitectureTypes ) ) ) ( rulePreListElement ( (lv_children_3_0= ruleProcessorArchitectureTypes ) )* )? )
            {
            // InternalDeployModelParser.g:1247:2: ( ( rulePreListElement ( (lv_children_1_0= ruleProcessorArchitectureTypes ) ) ) ( rulePreListElement ( (lv_children_3_0= ruleProcessorArchitectureTypes ) )* )? )
            // InternalDeployModelParser.g:1248:3: ( rulePreListElement ( (lv_children_1_0= ruleProcessorArchitectureTypes ) ) ) ( rulePreListElement ( (lv_children_3_0= ruleProcessorArchitectureTypes ) )* )?
            {
            // InternalDeployModelParser.g:1248:3: ( rulePreListElement ( (lv_children_1_0= ruleProcessorArchitectureTypes ) ) )
            // InternalDeployModelParser.g:1249:4: rulePreListElement ( (lv_children_1_0= ruleProcessorArchitectureTypes ) )
            {

            				newCompositeNode(grammarAccess.getProcessorArchitectureTypeListAccess().getPreListElementParserRuleCall_0_0());
            			
            pushFollow(FOLLOW_32);
            rulePreListElement();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			
            // InternalDeployModelParser.g:1256:4: ( (lv_children_1_0= ruleProcessorArchitectureTypes ) )
            // InternalDeployModelParser.g:1257:5: (lv_children_1_0= ruleProcessorArchitectureTypes )
            {
            // InternalDeployModelParser.g:1257:5: (lv_children_1_0= ruleProcessorArchitectureTypes )
            // InternalDeployModelParser.g:1258:6: lv_children_1_0= ruleProcessorArchitectureTypes
            {

            						newCompositeNode(grammarAccess.getProcessorArchitectureTypeListAccess().getChildrenProcessorArchitectureTypesEnumRuleCall_0_1_0());
            					
            pushFollow(FOLLOW_23);
            lv_children_1_0=ruleProcessorArchitectureTypes();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getProcessorArchitectureTypeListRule());
            						}
            						add(
            							current,
            							"children",
            							lv_children_1_0,
            							"de.fraunhofer.ipa.deployment.DeployModel.ProcessorArchitectureTypes");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalDeployModelParser.g:1276:3: ( rulePreListElement ( (lv_children_3_0= ruleProcessorArchitectureTypes ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==HyphenMinus) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDeployModelParser.g:1277:4: rulePreListElement ( (lv_children_3_0= ruleProcessorArchitectureTypes ) )*
                    {

                    				newCompositeNode(grammarAccess.getProcessorArchitectureTypeListAccess().getPreListElementParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_33);
                    rulePreListElement();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalDeployModelParser.g:1284:4: ( (lv_children_3_0= ruleProcessorArchitectureTypes ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==Arm64||LA16_0==X86) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalDeployModelParser.g:1285:5: (lv_children_3_0= ruleProcessorArchitectureTypes )
                    	    {
                    	    // InternalDeployModelParser.g:1285:5: (lv_children_3_0= ruleProcessorArchitectureTypes )
                    	    // InternalDeployModelParser.g:1286:6: lv_children_3_0= ruleProcessorArchitectureTypes
                    	    {

                    	    						newCompositeNode(grammarAccess.getProcessorArchitectureTypeListAccess().getChildrenProcessorArchitectureTypesEnumRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_33);
                    	    lv_children_3_0=ruleProcessorArchitectureTypes();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getProcessorArchitectureTypeListRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"children",
                    	    							lv_children_3_0,
                    	    							"de.fraunhofer.ipa.deployment.DeployModel.ProcessorArchitectureTypes");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


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
    // $ANTLR end "ruleProcessorArchitectureTypeList"


    // $ANTLR start "entryRuleReqRosDistro"
    // InternalDeployModelParser.g:1308:1: entryRuleReqRosDistro returns [EObject current=null] : iv_ruleReqRosDistro= ruleReqRosDistro EOF ;
    public final EObject entryRuleReqRosDistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReqRosDistro = null;


        try {
            // InternalDeployModelParser.g:1308:53: (iv_ruleReqRosDistro= ruleReqRosDistro EOF )
            // InternalDeployModelParser.g:1309:2: iv_ruleReqRosDistro= ruleReqRosDistro EOF
            {
             newCompositeNode(grammarAccess.getReqRosDistroRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReqRosDistro=ruleReqRosDistro();

            state._fsp--;

             current =iv_ruleReqRosDistro; 
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
    // $ANTLR end "entryRuleReqRosDistro"


    // $ANTLR start "ruleReqRosDistro"
    // InternalDeployModelParser.g:1315:1: ruleReqRosDistro returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= Ros_distro ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleRosDistroList ) ) this_DEDENT_6= RULE_DEDENT ) ;
    public final EObject ruleReqRosDistro() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token this_DEDENT_6=null;
        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:1321:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= Ros_distro ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleRosDistroList ) ) this_DEDENT_6= RULE_DEDENT ) )
            // InternalDeployModelParser.g:1322:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= Ros_distro ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleRosDistroList ) ) this_DEDENT_6= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:1322:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= Ros_distro ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleRosDistroList ) ) this_DEDENT_6= RULE_DEDENT )
            // InternalDeployModelParser.g:1323:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= Ros_distro ) ) this_INDENT_3= RULE_INDENT otherlv_4= Value ( (lv_value_5_0= ruleRosDistroList ) ) this_DEDENT_6= RULE_DEDENT
            {

            			newCompositeNode(grammarAccess.getReqRosDistroAccess().getPreListElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getReqRosDistroAccess().getNameKeyword_1());
            		
            // InternalDeployModelParser.g:1334:3: ( (lv_name_2_0= Ros_distro ) )
            // InternalDeployModelParser.g:1335:4: (lv_name_2_0= Ros_distro )
            {
            // InternalDeployModelParser.g:1335:4: (lv_name_2_0= Ros_distro )
            // InternalDeployModelParser.g:1336:5: lv_name_2_0= Ros_distro
            {
            lv_name_2_0=(Token)match(input,Ros_distro,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getReqRosDistroAccess().getNameRos_distroKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReqRosDistroRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_2_0, "ros_distro");
            				

            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_26); 

            			newLeafNode(this_INDENT_3, grammarAccess.getReqRosDistroAccess().getINDENTTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Value,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getReqRosDistroAccess().getValueKeyword_4());
            		
            // InternalDeployModelParser.g:1356:3: ( (lv_value_5_0= ruleRosDistroList ) )
            // InternalDeployModelParser.g:1357:4: (lv_value_5_0= ruleRosDistroList )
            {
            // InternalDeployModelParser.g:1357:4: (lv_value_5_0= ruleRosDistroList )
            // InternalDeployModelParser.g:1358:5: lv_value_5_0= ruleRosDistroList
            {

            					newCompositeNode(grammarAccess.getReqRosDistroAccess().getValueRosDistroListParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_value_5_0=ruleRosDistroList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReqRosDistroRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_5_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.RosDistroList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_DEDENT_6=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_6, grammarAccess.getReqRosDistroAccess().getDEDENTTerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleReqRosDistro"


    // $ANTLR start "entryRuleRosDistroList"
    // InternalDeployModelParser.g:1383:1: entryRuleRosDistroList returns [EObject current=null] : iv_ruleRosDistroList= ruleRosDistroList EOF ;
    public final EObject entryRuleRosDistroList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosDistroList = null;


        try {
            // InternalDeployModelParser.g:1383:54: (iv_ruleRosDistroList= ruleRosDistroList EOF )
            // InternalDeployModelParser.g:1384:2: iv_ruleRosDistroList= ruleRosDistroList EOF
            {
             newCompositeNode(grammarAccess.getRosDistroListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosDistroList=ruleRosDistroList();

            state._fsp--;

             current =iv_ruleRosDistroList; 
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
    // $ANTLR end "entryRuleRosDistroList"


    // $ANTLR start "ruleRosDistroList"
    // InternalDeployModelParser.g:1390:1: ruleRosDistroList returns [EObject current=null] : ( ( rulePreListElement ( (lv_children_1_0= ruleRosDistro ) ) ) ( rulePreListElement ( (lv_children_3_0= ruleRosDistro ) )* )? ) ;
    public final EObject ruleRosDistroList() throws RecognitionException {
        EObject current = null;

        Enumerator lv_children_1_0 = null;

        Enumerator lv_children_3_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:1396:2: ( ( ( rulePreListElement ( (lv_children_1_0= ruleRosDistro ) ) ) ( rulePreListElement ( (lv_children_3_0= ruleRosDistro ) )* )? ) )
            // InternalDeployModelParser.g:1397:2: ( ( rulePreListElement ( (lv_children_1_0= ruleRosDistro ) ) ) ( rulePreListElement ( (lv_children_3_0= ruleRosDistro ) )* )? )
            {
            // InternalDeployModelParser.g:1397:2: ( ( rulePreListElement ( (lv_children_1_0= ruleRosDistro ) ) ) ( rulePreListElement ( (lv_children_3_0= ruleRosDistro ) )* )? )
            // InternalDeployModelParser.g:1398:3: ( rulePreListElement ( (lv_children_1_0= ruleRosDistro ) ) ) ( rulePreListElement ( (lv_children_3_0= ruleRosDistro ) )* )?
            {
            // InternalDeployModelParser.g:1398:3: ( rulePreListElement ( (lv_children_1_0= ruleRosDistro ) ) )
            // InternalDeployModelParser.g:1399:4: rulePreListElement ( (lv_children_1_0= ruleRosDistro ) )
            {

            				newCompositeNode(grammarAccess.getRosDistroListAccess().getPreListElementParserRuleCall_0_0());
            			
            pushFollow(FOLLOW_35);
            rulePreListElement();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			
            // InternalDeployModelParser.g:1406:4: ( (lv_children_1_0= ruleRosDistro ) )
            // InternalDeployModelParser.g:1407:5: (lv_children_1_0= ruleRosDistro )
            {
            // InternalDeployModelParser.g:1407:5: (lv_children_1_0= ruleRosDistro )
            // InternalDeployModelParser.g:1408:6: lv_children_1_0= ruleRosDistro
            {

            						newCompositeNode(grammarAccess.getRosDistroListAccess().getChildrenRosDistroEnumRuleCall_0_1_0());
            					
            pushFollow(FOLLOW_23);
            lv_children_1_0=ruleRosDistro();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRosDistroListRule());
            						}
            						add(
            							current,
            							"children",
            							lv_children_1_0,
            							"de.fraunhofer.ipa.deployment.DeployModel.RosDistro");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalDeployModelParser.g:1426:3: ( rulePreListElement ( (lv_children_3_0= ruleRosDistro ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==HyphenMinus) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDeployModelParser.g:1427:4: rulePreListElement ( (lv_children_3_0= ruleRosDistro ) )*
                    {

                    				newCompositeNode(grammarAccess.getRosDistroListAccess().getPreListElementParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_36);
                    rulePreListElement();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalDeployModelParser.g:1434:4: ( (lv_children_3_0= ruleRosDistro ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==Galactic||LA18_0==Melodic||LA18_0==Noetic||LA18_0==Foxy) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalDeployModelParser.g:1435:5: (lv_children_3_0= ruleRosDistro )
                    	    {
                    	    // InternalDeployModelParser.g:1435:5: (lv_children_3_0= ruleRosDistro )
                    	    // InternalDeployModelParser.g:1436:6: lv_children_3_0= ruleRosDistro
                    	    {

                    	    						newCompositeNode(grammarAccess.getRosDistroListAccess().getChildrenRosDistroEnumRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_36);
                    	    lv_children_3_0=ruleRosDistro();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRosDistroListRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"children",
                    	    							lv_children_3_0,
                    	    							"de.fraunhofer.ipa.deployment.DeployModel.RosDistro");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


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
    // $ANTLR end "ruleRosDistroList"


    // $ANTLR start "entryRuleBuildRequirements"
    // InternalDeployModelParser.g:1458:1: entryRuleBuildRequirements returns [EObject current=null] : iv_ruleBuildRequirements= ruleBuildRequirements EOF ;
    public final EObject entryRuleBuildRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildRequirements = null;


        try {
            // InternalDeployModelParser.g:1458:58: (iv_ruleBuildRequirements= ruleBuildRequirements EOF )
            // InternalDeployModelParser.g:1459:2: iv_ruleBuildRequirements= ruleBuildRequirements EOF
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
    // InternalDeployModelParser.g:1465:1: ruleBuildRequirements returns [EObject current=null] : ( ( (lv_name_0_0= BuildRequirements ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT ( (lv_buildDependencies_3_0= ruleReqBuildDependencies ) )? ( (lv_dependencyRepositories_4_0= ruleReqDependencyRepositories ) )? this_DEDENT_5= RULE_DEDENT ) ;
    public final EObject ruleBuildRequirements() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_INDENT_2=null;
        Token this_DEDENT_5=null;
        EObject lv_buildDependencies_3_0 = null;

        EObject lv_dependencyRepositories_4_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:1471:2: ( ( ( (lv_name_0_0= BuildRequirements ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT ( (lv_buildDependencies_3_0= ruleReqBuildDependencies ) )? ( (lv_dependencyRepositories_4_0= ruleReqDependencyRepositories ) )? this_DEDENT_5= RULE_DEDENT ) )
            // InternalDeployModelParser.g:1472:2: ( ( (lv_name_0_0= BuildRequirements ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT ( (lv_buildDependencies_3_0= ruleReqBuildDependencies ) )? ( (lv_dependencyRepositories_4_0= ruleReqDependencyRepositories ) )? this_DEDENT_5= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:1472:2: ( ( (lv_name_0_0= BuildRequirements ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT ( (lv_buildDependencies_3_0= ruleReqBuildDependencies ) )? ( (lv_dependencyRepositories_4_0= ruleReqDependencyRepositories ) )? this_DEDENT_5= RULE_DEDENT )
            // InternalDeployModelParser.g:1473:3: ( (lv_name_0_0= BuildRequirements ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT ( (lv_buildDependencies_3_0= ruleReqBuildDependencies ) )? ( (lv_dependencyRepositories_4_0= ruleReqDependencyRepositories ) )? this_DEDENT_5= RULE_DEDENT
            {
            // InternalDeployModelParser.g:1473:3: ( (lv_name_0_0= BuildRequirements ) )
            // InternalDeployModelParser.g:1474:4: (lv_name_0_0= BuildRequirements )
            {
            // InternalDeployModelParser.g:1474:4: (lv_name_0_0= BuildRequirements )
            // InternalDeployModelParser.g:1475:5: lv_name_0_0= BuildRequirements
            {
            lv_name_0_0=(Token)match(input,BuildRequirements,FOLLOW_17); 

            					newLeafNode(lv_name_0_0, grammarAccess.getBuildRequirementsAccess().getNameBuildRequirementsKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBuildRequirementsRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "buildRequirements");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBuildRequirementsAccess().getColonKeyword_1());
            		
            this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_37); 

            			newLeafNode(this_INDENT_2, grammarAccess.getBuildRequirementsAccess().getINDENTTerminalRuleCall_2());
            		
            // InternalDeployModelParser.g:1495:3: ( (lv_buildDependencies_3_0= ruleReqBuildDependencies ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==DependOn) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDeployModelParser.g:1496:4: (lv_buildDependencies_3_0= ruleReqBuildDependencies )
                    {
                    // InternalDeployModelParser.g:1496:4: (lv_buildDependencies_3_0= ruleReqBuildDependencies )
                    // InternalDeployModelParser.g:1497:5: lv_buildDependencies_3_0= ruleReqBuildDependencies
                    {

                    					newCompositeNode(grammarAccess.getBuildRequirementsAccess().getBuildDependenciesReqBuildDependenciesParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_38);
                    lv_buildDependencies_3_0=ruleReqBuildDependencies();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBuildRequirementsRule());
                    					}
                    					set(
                    						current,
                    						"buildDependencies",
                    						lv_buildDependencies_3_0,
                    						"de.fraunhofer.ipa.deployment.DeployModel.ReqBuildDependencies");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDeployModelParser.g:1514:3: ( (lv_dependencyRepositories_4_0= ruleReqDependencyRepositories ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==AptRepositories) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDeployModelParser.g:1515:4: (lv_dependencyRepositories_4_0= ruleReqDependencyRepositories )
                    {
                    // InternalDeployModelParser.g:1515:4: (lv_dependencyRepositories_4_0= ruleReqDependencyRepositories )
                    // InternalDeployModelParser.g:1516:5: lv_dependencyRepositories_4_0= ruleReqDependencyRepositories
                    {

                    					newCompositeNode(grammarAccess.getBuildRequirementsAccess().getDependencyRepositoriesReqDependencyRepositoriesParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_dependencyRepositories_4_0=ruleReqDependencyRepositories();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBuildRequirementsRule());
                    					}
                    					set(
                    						current,
                    						"dependencyRepositories",
                    						lv_dependencyRepositories_4_0,
                    						"de.fraunhofer.ipa.deployment.DeployModel.ReqDependencyRepositories");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_DEDENT_5=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_5, grammarAccess.getBuildRequirementsAccess().getDEDENTTerminalRuleCall_5());
            		

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
    // InternalDeployModelParser.g:1541:1: entryRuleReqBuildDependencies returns [EObject current=null] : iv_ruleReqBuildDependencies= ruleReqBuildDependencies EOF ;
    public final EObject entryRuleReqBuildDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReqBuildDependencies = null;


        try {
            // InternalDeployModelParser.g:1541:61: (iv_ruleReqBuildDependencies= ruleReqBuildDependencies EOF )
            // InternalDeployModelParser.g:1542:2: iv_ruleReqBuildDependencies= ruleReqBuildDependencies EOF
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
    // InternalDeployModelParser.g:1548:1: ruleReqBuildDependencies returns [EObject current=null] : ( ( (lv_name_0_0= DependOn ) ) ( (lv_dependencies_1_0= ruleDependency ) )+ ) ;
    public final EObject ruleReqBuildDependencies() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_dependencies_1_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:1554:2: ( ( ( (lv_name_0_0= DependOn ) ) ( (lv_dependencies_1_0= ruleDependency ) )+ ) )
            // InternalDeployModelParser.g:1555:2: ( ( (lv_name_0_0= DependOn ) ) ( (lv_dependencies_1_0= ruleDependency ) )+ )
            {
            // InternalDeployModelParser.g:1555:2: ( ( (lv_name_0_0= DependOn ) ) ( (lv_dependencies_1_0= ruleDependency ) )+ )
            // InternalDeployModelParser.g:1556:3: ( (lv_name_0_0= DependOn ) ) ( (lv_dependencies_1_0= ruleDependency ) )+
            {
            // InternalDeployModelParser.g:1556:3: ( (lv_name_0_0= DependOn ) )
            // InternalDeployModelParser.g:1557:4: (lv_name_0_0= DependOn )
            {
            // InternalDeployModelParser.g:1557:4: (lv_name_0_0= DependOn )
            // InternalDeployModelParser.g:1558:5: lv_name_0_0= DependOn
            {
            lv_name_0_0=(Token)match(input,DependOn,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getReqBuildDependenciesAccess().getNameDependOnKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReqBuildDependenciesRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "dependOn:");
            				

            }


            }

            // InternalDeployModelParser.g:1570:3: ( (lv_dependencies_1_0= ruleDependency ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==HyphenMinus) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDeployModelParser.g:1571:4: (lv_dependencies_1_0= ruleDependency )
            	    {
            	    // InternalDeployModelParser.g:1571:4: (lv_dependencies_1_0= ruleDependency )
            	    // InternalDeployModelParser.g:1572:5: lv_dependencies_1_0= ruleDependency
            	    {

            	    					newCompositeNode(grammarAccess.getReqBuildDependenciesAccess().getDependenciesDependencyParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_dependencies_1_0=ruleDependency();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReqBuildDependenciesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dependencies",
            	    						lv_dependencies_1_0,
            	    						"de.fraunhofer.ipa.deployment.DeployModel.Dependency");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
    // $ANTLR end "ruleReqBuildDependencies"


    // $ANTLR start "entryRuleDependency"
    // InternalDeployModelParser.g:1593:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalDeployModelParser.g:1593:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalDeployModelParser.g:1594:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
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
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // InternalDeployModelParser.g:1600:1: ruleDependency returns [EObject current=null] : (this_LocalPackage_0= ruleLocalPackage | this_GitPackage_1= ruleGitPackage ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        EObject this_LocalPackage_0 = null;

        EObject this_GitPackage_1 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:1606:2: ( (this_LocalPackage_0= ruleLocalPackage | this_GitPackage_1= ruleGitPackage ) )
            // InternalDeployModelParser.g:1607:2: (this_LocalPackage_0= ruleLocalPackage | this_GitPackage_1= ruleGitPackage )
            {
            // InternalDeployModelParser.g:1607:2: (this_LocalPackage_0= ruleLocalPackage | this_GitPackage_1= ruleGitPackage )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==HyphenMinus) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==From) ) {
                    int LA23_2 = input.LA(3);

                    if ( (LA23_2==RULE_ID) ) {
                        alt23=1;
                    }
                    else if ( (LA23_2==RULE_URL) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalDeployModelParser.g:1608:3: this_LocalPackage_0= ruleLocalPackage
                    {

                    			newCompositeNode(grammarAccess.getDependencyAccess().getLocalPackageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LocalPackage_0=ruleLocalPackage();

                    state._fsp--;


                    			current = this_LocalPackage_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:1617:3: this_GitPackage_1= ruleGitPackage
                    {

                    			newCompositeNode(grammarAccess.getDependencyAccess().getGitPackageParserRuleCall_1());
                    		
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
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleLocalPackage"
    // InternalDeployModelParser.g:1629:1: entryRuleLocalPackage returns [EObject current=null] : iv_ruleLocalPackage= ruleLocalPackage EOF ;
    public final EObject entryRuleLocalPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalPackage = null;


        try {
            // InternalDeployModelParser.g:1629:53: (iv_ruleLocalPackage= ruleLocalPackage EOF )
            // InternalDeployModelParser.g:1630:2: iv_ruleLocalPackage= ruleLocalPackage EOF
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
    // InternalDeployModelParser.g:1636:1: ruleLocalPackage returns [EObject current=null] : ( rulePreListElement otherlv_1= From ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) this_INDENT_3= RULE_INDENT otherlv_4= Name ( ( ruleQualifiedName ) ) this_DEDENT_6= RULE_DEDENT ) ;
    public final EObject ruleLocalPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token this_DEDENT_6=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:1642:2: ( ( rulePreListElement otherlv_1= From ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) this_INDENT_3= RULE_INDENT otherlv_4= Name ( ( ruleQualifiedName ) ) this_DEDENT_6= RULE_DEDENT ) )
            // InternalDeployModelParser.g:1643:2: ( rulePreListElement otherlv_1= From ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) this_INDENT_3= RULE_INDENT otherlv_4= Name ( ( ruleQualifiedName ) ) this_DEDENT_6= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:1643:2: ( rulePreListElement otherlv_1= From ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) this_INDENT_3= RULE_INDENT otherlv_4= Name ( ( ruleQualifiedName ) ) this_DEDENT_6= RULE_DEDENT )
            // InternalDeployModelParser.g:1644:3: rulePreListElement otherlv_1= From ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) this_INDENT_3= RULE_INDENT otherlv_4= Name ( ( ruleQualifiedName ) ) this_DEDENT_6= RULE_DEDENT
            {

            			newCompositeNode(grammarAccess.getLocalPackageAccess().getPreListElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_39);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,From,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalPackageAccess().getFromKeyword_1());
            		
            // InternalDeployModelParser.g:1655:3: ( (lv_importedNamespace_2_0= ruleQualifiedName ) )
            // InternalDeployModelParser.g:1656:4: (lv_importedNamespace_2_0= ruleQualifiedName )
            {
            // InternalDeployModelParser.g:1656:4: (lv_importedNamespace_2_0= ruleQualifiedName )
            // InternalDeployModelParser.g:1657:5: lv_importedNamespace_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getLocalPackageAccess().getImportedNamespaceQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_importedNamespace_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalPackageRule());
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

            			newLeafNode(this_INDENT_3, grammarAccess.getLocalPackageAccess().getINDENTTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getLocalPackageAccess().getNameKeyword_4());
            		
            // InternalDeployModelParser.g:1682:3: ( ( ruleQualifiedName ) )
            // InternalDeployModelParser.g:1683:4: ( ruleQualifiedName )
            {
            // InternalDeployModelParser.g:1683:4: ( ruleQualifiedName )
            // InternalDeployModelParser.g:1684:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalPackageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLocalPackageAccess().getNameMonolithicImplementationDescriptionCrossReference_5_0());
            				
            pushFollow(FOLLOW_15);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_DEDENT_6=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_6, grammarAccess.getLocalPackageAccess().getDEDENTTerminalRuleCall_6());
            		

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
    // InternalDeployModelParser.g:1706:1: entryRuleGitPackage returns [EObject current=null] : iv_ruleGitPackage= ruleGitPackage EOF ;
    public final EObject entryRuleGitPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGitPackage = null;


        try {
            // InternalDeployModelParser.g:1706:51: (iv_ruleGitPackage= ruleGitPackage EOF )
            // InternalDeployModelParser.g:1707:2: iv_ruleGitPackage= ruleGitPackage EOF
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
    // InternalDeployModelParser.g:1713:1: ruleGitPackage returns [EObject current=null] : ( rulePreListElement otherlv_1= From ( (lv_path_2_0= RULE_URL ) ) this_INDENT_3= RULE_INDENT otherlv_4= Name ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= Branch_1 ( (lv_branch_7_0= RULE_STRING ) ) )? this_DEDENT_8= RULE_DEDENT ) ;
    public final EObject ruleGitPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_path_2_0=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token lv_branch_7_0=null;
        Token this_DEDENT_8=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:1719:2: ( ( rulePreListElement otherlv_1= From ( (lv_path_2_0= RULE_URL ) ) this_INDENT_3= RULE_INDENT otherlv_4= Name ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= Branch_1 ( (lv_branch_7_0= RULE_STRING ) ) )? this_DEDENT_8= RULE_DEDENT ) )
            // InternalDeployModelParser.g:1720:2: ( rulePreListElement otherlv_1= From ( (lv_path_2_0= RULE_URL ) ) this_INDENT_3= RULE_INDENT otherlv_4= Name ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= Branch_1 ( (lv_branch_7_0= RULE_STRING ) ) )? this_DEDENT_8= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:1720:2: ( rulePreListElement otherlv_1= From ( (lv_path_2_0= RULE_URL ) ) this_INDENT_3= RULE_INDENT otherlv_4= Name ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= Branch_1 ( (lv_branch_7_0= RULE_STRING ) ) )? this_DEDENT_8= RULE_DEDENT )
            // InternalDeployModelParser.g:1721:3: rulePreListElement otherlv_1= From ( (lv_path_2_0= RULE_URL ) ) this_INDENT_3= RULE_INDENT otherlv_4= Name ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= Branch_1 ( (lv_branch_7_0= RULE_STRING ) ) )? this_DEDENT_8= RULE_DEDENT
            {

            			newCompositeNode(grammarAccess.getGitPackageAccess().getPreListElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_39);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,From,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getGitPackageAccess().getFromKeyword_1());
            		
            // InternalDeployModelParser.g:1732:3: ( (lv_path_2_0= RULE_URL ) )
            // InternalDeployModelParser.g:1733:4: (lv_path_2_0= RULE_URL )
            {
            // InternalDeployModelParser.g:1733:4: (lv_path_2_0= RULE_URL )
            // InternalDeployModelParser.g:1734:5: lv_path_2_0= RULE_URL
            {
            lv_path_2_0=(Token)match(input,RULE_URL,FOLLOW_4); 

            					newLeafNode(lv_path_2_0, grammarAccess.getGitPackageAccess().getPathURLTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGitPackageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_2_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.URL");
            				

            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_5); 

            			newLeafNode(this_INDENT_3, grammarAccess.getGitPackageAccess().getINDENTTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getGitPackageAccess().getNameKeyword_4());
            		
            // InternalDeployModelParser.g:1758:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalDeployModelParser.g:1759:4: (lv_name_5_0= RULE_ID )
            {
            // InternalDeployModelParser.g:1759:4: (lv_name_5_0= RULE_ID )
            // InternalDeployModelParser.g:1760:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(lv_name_5_0, grammarAccess.getGitPackageAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGitPackageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDeployModelParser.g:1776:3: (otherlv_6= Branch_1 ( (lv_branch_7_0= RULE_STRING ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Branch_1) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDeployModelParser.g:1777:4: otherlv_6= Branch_1 ( (lv_branch_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,Branch_1,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getGitPackageAccess().getBranchKeyword_6_0());
                    			
                    // InternalDeployModelParser.g:1781:4: ( (lv_branch_7_0= RULE_STRING ) )
                    // InternalDeployModelParser.g:1782:5: (lv_branch_7_0= RULE_STRING )
                    {
                    // InternalDeployModelParser.g:1782:5: (lv_branch_7_0= RULE_STRING )
                    // InternalDeployModelParser.g:1783:6: lv_branch_7_0= RULE_STRING
                    {
                    lv_branch_7_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    						newLeafNode(lv_branch_7_0, grammarAccess.getGitPackageAccess().getBranchSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGitPackageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"branch",
                    							lv_branch_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

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
    // InternalDeployModelParser.g:1808:1: entryRuleReqDependencyRepositories returns [EObject current=null] : iv_ruleReqDependencyRepositories= ruleReqDependencyRepositories EOF ;
    public final EObject entryRuleReqDependencyRepositories() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReqDependencyRepositories = null;


        try {
            // InternalDeployModelParser.g:1808:66: (iv_ruleReqDependencyRepositories= ruleReqDependencyRepositories EOF )
            // InternalDeployModelParser.g:1809:2: iv_ruleReqDependencyRepositories= ruleReqDependencyRepositories EOF
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
    // InternalDeployModelParser.g:1815:1: ruleReqDependencyRepositories returns [EObject current=null] : ( ( (lv_name_0_0= AptRepositories ) ) otherlv_1= Colon ( (lv_children_2_0= ruleAptRepositoryInstance ) )+ ) ;
    public final EObject ruleReqDependencyRepositories() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_children_2_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:1821:2: ( ( ( (lv_name_0_0= AptRepositories ) ) otherlv_1= Colon ( (lv_children_2_0= ruleAptRepositoryInstance ) )+ ) )
            // InternalDeployModelParser.g:1822:2: ( ( (lv_name_0_0= AptRepositories ) ) otherlv_1= Colon ( (lv_children_2_0= ruleAptRepositoryInstance ) )+ )
            {
            // InternalDeployModelParser.g:1822:2: ( ( (lv_name_0_0= AptRepositories ) ) otherlv_1= Colon ( (lv_children_2_0= ruleAptRepositoryInstance ) )+ )
            // InternalDeployModelParser.g:1823:3: ( (lv_name_0_0= AptRepositories ) ) otherlv_1= Colon ( (lv_children_2_0= ruleAptRepositoryInstance ) )+
            {
            // InternalDeployModelParser.g:1823:3: ( (lv_name_0_0= AptRepositories ) )
            // InternalDeployModelParser.g:1824:4: (lv_name_0_0= AptRepositories )
            {
            // InternalDeployModelParser.g:1824:4: (lv_name_0_0= AptRepositories )
            // InternalDeployModelParser.g:1825:5: lv_name_0_0= AptRepositories
            {
            lv_name_0_0=(Token)match(input,AptRepositories,FOLLOW_17); 

            					newLeafNode(lv_name_0_0, grammarAccess.getReqDependencyRepositoriesAccess().getNameAptRepositoriesKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReqDependencyRepositoriesRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "aptRepositories");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getReqDependencyRepositoriesAccess().getColonKeyword_1());
            		
            // InternalDeployModelParser.g:1841:3: ( (lv_children_2_0= ruleAptRepositoryInstance ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==HyphenMinus) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDeployModelParser.g:1842:4: (lv_children_2_0= ruleAptRepositoryInstance )
            	    {
            	    // InternalDeployModelParser.g:1842:4: (lv_children_2_0= ruleAptRepositoryInstance )
            	    // InternalDeployModelParser.g:1843:5: lv_children_2_0= ruleAptRepositoryInstance
            	    {

            	    					newCompositeNode(grammarAccess.getReqDependencyRepositoriesAccess().getChildrenAptRepositoryInstanceParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_children_2_0=ruleAptRepositoryInstance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReqDependencyRepositoriesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"children",
            	    						lv_children_2_0,
            	    						"de.fraunhofer.ipa.deployment.DeployModel.AptRepositoryInstance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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
    // $ANTLR end "ruleReqDependencyRepositories"


    // $ANTLR start "entryRuleAptRepositoryInstance"
    // InternalDeployModelParser.g:1864:1: entryRuleAptRepositoryInstance returns [EObject current=null] : iv_ruleAptRepositoryInstance= ruleAptRepositoryInstance EOF ;
    public final EObject entryRuleAptRepositoryInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAptRepositoryInstance = null;


        try {
            // InternalDeployModelParser.g:1864:62: (iv_ruleAptRepositoryInstance= ruleAptRepositoryInstance EOF )
            // InternalDeployModelParser.g:1865:2: iv_ruleAptRepositoryInstance= ruleAptRepositoryInstance EOF
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
    // InternalDeployModelParser.g:1871:1: ruleAptRepositoryInstance returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT otherlv_4= KeyLink ( (lv_keyLink_5_0= RULE_URL ) ) otherlv_6= RepositoryPath ( (lv_repositoryPath_7_0= RULE_URL ) ) (otherlv_8= UpdateRosDep ( (lv_updateRosDep_9_0= RULE_URL ) ) )? this_DEDENT_10= RULE_DEDENT ) ;
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
            // InternalDeployModelParser.g:1877:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT otherlv_4= KeyLink ( (lv_keyLink_5_0= RULE_URL ) ) otherlv_6= RepositoryPath ( (lv_repositoryPath_7_0= RULE_URL ) ) (otherlv_8= UpdateRosDep ( (lv_updateRosDep_9_0= RULE_URL ) ) )? this_DEDENT_10= RULE_DEDENT ) )
            // InternalDeployModelParser.g:1878:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT otherlv_4= KeyLink ( (lv_keyLink_5_0= RULE_URL ) ) otherlv_6= RepositoryPath ( (lv_repositoryPath_7_0= RULE_URL ) ) (otherlv_8= UpdateRosDep ( (lv_updateRosDep_9_0= RULE_URL ) ) )? this_DEDENT_10= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:1878:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT otherlv_4= KeyLink ( (lv_keyLink_5_0= RULE_URL ) ) otherlv_6= RepositoryPath ( (lv_repositoryPath_7_0= RULE_URL ) ) (otherlv_8= UpdateRosDep ( (lv_updateRosDep_9_0= RULE_URL ) ) )? this_DEDENT_10= RULE_DEDENT )
            // InternalDeployModelParser.g:1879:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT otherlv_4= KeyLink ( (lv_keyLink_5_0= RULE_URL ) ) otherlv_6= RepositoryPath ( (lv_repositoryPath_7_0= RULE_URL ) ) (otherlv_8= UpdateRosDep ( (lv_updateRosDep_9_0= RULE_URL ) ) )? this_DEDENT_10= RULE_DEDENT
            {

            			newCompositeNode(grammarAccess.getAptRepositoryInstanceAccess().getPreListElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAptRepositoryInstanceAccess().getNameKeyword_1());
            		
            // InternalDeployModelParser.g:1890:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDeployModelParser.g:1891:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDeployModelParser.g:1891:4: (lv_name_2_0= RULE_ID )
            // InternalDeployModelParser.g:1892:5: lv_name_2_0= RULE_ID
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_42); 

            			newLeafNode(this_INDENT_3, grammarAccess.getAptRepositoryInstanceAccess().getINDENTTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,KeyLink,FOLLOW_40); 

            			newLeafNode(otherlv_4, grammarAccess.getAptRepositoryInstanceAccess().getKeyLinkKeyword_4());
            		
            // InternalDeployModelParser.g:1916:3: ( (lv_keyLink_5_0= RULE_URL ) )
            // InternalDeployModelParser.g:1917:4: (lv_keyLink_5_0= RULE_URL )
            {
            // InternalDeployModelParser.g:1917:4: (lv_keyLink_5_0= RULE_URL )
            // InternalDeployModelParser.g:1918:5: lv_keyLink_5_0= RULE_URL
            {
            lv_keyLink_5_0=(Token)match(input,RULE_URL,FOLLOW_43); 

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

            otherlv_6=(Token)match(input,RepositoryPath,FOLLOW_40); 

            			newLeafNode(otherlv_6, grammarAccess.getAptRepositoryInstanceAccess().getRepositoryPathKeyword_6());
            		
            // InternalDeployModelParser.g:1938:3: ( (lv_repositoryPath_7_0= RULE_URL ) )
            // InternalDeployModelParser.g:1939:4: (lv_repositoryPath_7_0= RULE_URL )
            {
            // InternalDeployModelParser.g:1939:4: (lv_repositoryPath_7_0= RULE_URL )
            // InternalDeployModelParser.g:1940:5: lv_repositoryPath_7_0= RULE_URL
            {
            lv_repositoryPath_7_0=(Token)match(input,RULE_URL,FOLLOW_44); 

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

            // InternalDeployModelParser.g:1956:3: (otherlv_8= UpdateRosDep ( (lv_updateRosDep_9_0= RULE_URL ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==UpdateRosDep) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDeployModelParser.g:1957:4: otherlv_8= UpdateRosDep ( (lv_updateRosDep_9_0= RULE_URL ) )
                    {
                    otherlv_8=(Token)match(input,UpdateRosDep,FOLLOW_40); 

                    				newLeafNode(otherlv_8, grammarAccess.getAptRepositoryInstanceAccess().getUpdateRosDepKeyword_8_0());
                    			
                    // InternalDeployModelParser.g:1961:4: ( (lv_updateRosDep_9_0= RULE_URL ) )
                    // InternalDeployModelParser.g:1962:5: (lv_updateRosDep_9_0= RULE_URL )
                    {
                    // InternalDeployModelParser.g:1962:5: (lv_updateRosDep_9_0= RULE_URL )
                    // InternalDeployModelParser.g:1963:6: lv_updateRosDep_9_0= RULE_URL
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


    // $ANTLR start "entryRuleStartCommands"
    // InternalDeployModelParser.g:1988:1: entryRuleStartCommands returns [EObject current=null] : iv_ruleStartCommands= ruleStartCommands EOF ;
    public final EObject entryRuleStartCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartCommands = null;


        try {
            // InternalDeployModelParser.g:1988:54: (iv_ruleStartCommands= ruleStartCommands EOF )
            // InternalDeployModelParser.g:1989:2: iv_ruleStartCommands= ruleStartCommands EOF
            {
             newCompositeNode(grammarAccess.getStartCommandsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartCommands=ruleStartCommands();

            state._fsp--;

             current =iv_ruleStartCommands; 
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
    // $ANTLR end "entryRuleStartCommands"


    // $ANTLR start "ruleStartCommands"
    // InternalDeployModelParser.g:1995:1: ruleStartCommands returns [EObject current=null] : ( ( (lv_name_0_0= StartCommands ) ) ( (lv_startCommands_1_0= ruleListStartCommands ) ) ) ;
    public final EObject ruleStartCommands() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_startCommands_1_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:2001:2: ( ( ( (lv_name_0_0= StartCommands ) ) ( (lv_startCommands_1_0= ruleListStartCommands ) ) ) )
            // InternalDeployModelParser.g:2002:2: ( ( (lv_name_0_0= StartCommands ) ) ( (lv_startCommands_1_0= ruleListStartCommands ) ) )
            {
            // InternalDeployModelParser.g:2002:2: ( ( (lv_name_0_0= StartCommands ) ) ( (lv_startCommands_1_0= ruleListStartCommands ) ) )
            // InternalDeployModelParser.g:2003:3: ( (lv_name_0_0= StartCommands ) ) ( (lv_startCommands_1_0= ruleListStartCommands ) )
            {
            // InternalDeployModelParser.g:2003:3: ( (lv_name_0_0= StartCommands ) )
            // InternalDeployModelParser.g:2004:4: (lv_name_0_0= StartCommands )
            {
            // InternalDeployModelParser.g:2004:4: (lv_name_0_0= StartCommands )
            // InternalDeployModelParser.g:2005:5: lv_name_0_0= StartCommands
            {
            lv_name_0_0=(Token)match(input,StartCommands,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getStartCommandsAccess().getNameStartCommandsKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStartCommandsRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "startCommands:");
            				

            }


            }

            // InternalDeployModelParser.g:2017:3: ( (lv_startCommands_1_0= ruleListStartCommands ) )
            // InternalDeployModelParser.g:2018:4: (lv_startCommands_1_0= ruleListStartCommands )
            {
            // InternalDeployModelParser.g:2018:4: (lv_startCommands_1_0= ruleListStartCommands )
            // InternalDeployModelParser.g:2019:5: lv_startCommands_1_0= ruleListStartCommands
            {

            					newCompositeNode(grammarAccess.getStartCommandsAccess().getStartCommandsListStartCommandsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_startCommands_1_0=ruleListStartCommands();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStartCommandsRule());
            					}
            					set(
            						current,
            						"startCommands",
            						lv_startCommands_1_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.ListStartCommands");
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
    // $ANTLR end "ruleStartCommands"


    // $ANTLR start "entryRuleListStartCommands"
    // InternalDeployModelParser.g:2040:1: entryRuleListStartCommands returns [EObject current=null] : iv_ruleListStartCommands= ruleListStartCommands EOF ;
    public final EObject entryRuleListStartCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListStartCommands = null;


        try {
            // InternalDeployModelParser.g:2040:58: (iv_ruleListStartCommands= ruleListStartCommands EOF )
            // InternalDeployModelParser.g:2041:2: iv_ruleListStartCommands= ruleListStartCommands EOF
            {
             newCompositeNode(grammarAccess.getListStartCommandsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListStartCommands=ruleListStartCommands();

            state._fsp--;

             current =iv_ruleListStartCommands; 
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
    // $ANTLR end "entryRuleListStartCommands"


    // $ANTLR start "ruleListStartCommands"
    // InternalDeployModelParser.g:2047:1: ruleListStartCommands returns [EObject current=null] : ( ( rulePreListElement ( (lv_children_1_0= RULE_STRING ) ) ) ( rulePreListElement ( (lv_children_3_0= RULE_STRING ) )* )? ) ;
    public final EObject ruleListStartCommands() throws RecognitionException {
        EObject current = null;

        Token lv_children_1_0=null;
        Token lv_children_3_0=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:2053:2: ( ( ( rulePreListElement ( (lv_children_1_0= RULE_STRING ) ) ) ( rulePreListElement ( (lv_children_3_0= RULE_STRING ) )* )? ) )
            // InternalDeployModelParser.g:2054:2: ( ( rulePreListElement ( (lv_children_1_0= RULE_STRING ) ) ) ( rulePreListElement ( (lv_children_3_0= RULE_STRING ) )* )? )
            {
            // InternalDeployModelParser.g:2054:2: ( ( rulePreListElement ( (lv_children_1_0= RULE_STRING ) ) ) ( rulePreListElement ( (lv_children_3_0= RULE_STRING ) )* )? )
            // InternalDeployModelParser.g:2055:3: ( rulePreListElement ( (lv_children_1_0= RULE_STRING ) ) ) ( rulePreListElement ( (lv_children_3_0= RULE_STRING ) )* )?
            {
            // InternalDeployModelParser.g:2055:3: ( rulePreListElement ( (lv_children_1_0= RULE_STRING ) ) )
            // InternalDeployModelParser.g:2056:4: rulePreListElement ( (lv_children_1_0= RULE_STRING ) )
            {

            				newCompositeNode(grammarAccess.getListStartCommandsAccess().getPreListElementParserRuleCall_0_0());
            			
            pushFollow(FOLLOW_8);
            rulePreListElement();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			
            // InternalDeployModelParser.g:2063:4: ( (lv_children_1_0= RULE_STRING ) )
            // InternalDeployModelParser.g:2064:5: (lv_children_1_0= RULE_STRING )
            {
            // InternalDeployModelParser.g:2064:5: (lv_children_1_0= RULE_STRING )
            // InternalDeployModelParser.g:2065:6: lv_children_1_0= RULE_STRING
            {
            lv_children_1_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            						newLeafNode(lv_children_1_0, grammarAccess.getListStartCommandsAccess().getChildrenSTRINGTerminalRuleCall_0_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getListStartCommandsRule());
            						}
            						addWithLastConsumed(
            							current,
            							"children",
            							lv_children_1_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }


            }

            // InternalDeployModelParser.g:2082:3: ( rulePreListElement ( (lv_children_3_0= RULE_STRING ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==HyphenMinus) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDeployModelParser.g:2083:4: rulePreListElement ( (lv_children_3_0= RULE_STRING ) )*
                    {

                    				newCompositeNode(grammarAccess.getListStartCommandsAccess().getPreListElementParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_45);
                    rulePreListElement();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalDeployModelParser.g:2090:4: ( (lv_children_3_0= RULE_STRING ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==RULE_STRING) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalDeployModelParser.g:2091:5: (lv_children_3_0= RULE_STRING )
                    	    {
                    	    // InternalDeployModelParser.g:2091:5: (lv_children_3_0= RULE_STRING )
                    	    // InternalDeployModelParser.g:2092:6: lv_children_3_0= RULE_STRING
                    	    {
                    	    lv_children_3_0=(Token)match(input,RULE_STRING,FOLLOW_45); 

                    	    						newLeafNode(lv_children_3_0, grammarAccess.getListStartCommandsAccess().getChildrenSTRINGTerminalRuleCall_1_1_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getListStartCommandsRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"children",
                    	    							lv_children_3_0,
                    	    							"org.eclipse.xtext.common.Terminals.STRING");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


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
    // $ANTLR end "ruleListStartCommands"


    // $ANTLR start "entryRuleStackImplementationDescription"
    // InternalDeployModelParser.g:2113:1: entryRuleStackImplementationDescription returns [EObject current=null] : iv_ruleStackImplementationDescription= ruleStackImplementationDescription EOF ;
    public final EObject entryRuleStackImplementationDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStackImplementationDescription = null;


        try {
            // InternalDeployModelParser.g:2113:71: (iv_ruleStackImplementationDescription= ruleStackImplementationDescription EOF )
            // InternalDeployModelParser.g:2114:2: iv_ruleStackImplementationDescription= ruleStackImplementationDescription EOF
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
    // InternalDeployModelParser.g:2120:1: ruleStackImplementationDescription returns [EObject current=null] : ( ( (lv_type_0_0= StackImplementationDescription ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= ImplementsRosModel ( (lv_impRosmodel_6_0= ruleQualifiedName ) ) )? otherlv_7= Description ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= Mode ( (lv_mode_10_0= ruleImplementationModeType ) ) ( (lv_impl_11_0= ruleImplementationArtifactDescription ) ) this_DEDENT_12= RULE_DEDENT ) ;
    public final EObject ruleStackImplementationDescription() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token this_INDENT_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        Token otherlv_9=null;
        Token this_DEDENT_12=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_impRosmodel_6_0 = null;

        Enumerator lv_mode_10_0 = null;

        EObject lv_impl_11_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:2126:2: ( ( ( (lv_type_0_0= StackImplementationDescription ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= ImplementsRosModel ( (lv_impRosmodel_6_0= ruleQualifiedName ) ) )? otherlv_7= Description ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= Mode ( (lv_mode_10_0= ruleImplementationModeType ) ) ( (lv_impl_11_0= ruleImplementationArtifactDescription ) ) this_DEDENT_12= RULE_DEDENT ) )
            // InternalDeployModelParser.g:2127:2: ( ( (lv_type_0_0= StackImplementationDescription ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= ImplementsRosModel ( (lv_impRosmodel_6_0= ruleQualifiedName ) ) )? otherlv_7= Description ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= Mode ( (lv_mode_10_0= ruleImplementationModeType ) ) ( (lv_impl_11_0= ruleImplementationArtifactDescription ) ) this_DEDENT_12= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:2127:2: ( ( (lv_type_0_0= StackImplementationDescription ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= ImplementsRosModel ( (lv_impRosmodel_6_0= ruleQualifiedName ) ) )? otherlv_7= Description ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= Mode ( (lv_mode_10_0= ruleImplementationModeType ) ) ( (lv_impl_11_0= ruleImplementationArtifactDescription ) ) this_DEDENT_12= RULE_DEDENT )
            // InternalDeployModelParser.g:2128:3: ( (lv_type_0_0= StackImplementationDescription ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= ImplementsRosModel ( (lv_impRosmodel_6_0= ruleQualifiedName ) ) )? otherlv_7= Description ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= Mode ( (lv_mode_10_0= ruleImplementationModeType ) ) ( (lv_impl_11_0= ruleImplementationArtifactDescription ) ) this_DEDENT_12= RULE_DEDENT
            {
            // InternalDeployModelParser.g:2128:3: ( (lv_type_0_0= StackImplementationDescription ) )
            // InternalDeployModelParser.g:2129:4: (lv_type_0_0= StackImplementationDescription )
            {
            // InternalDeployModelParser.g:2129:4: (lv_type_0_0= StackImplementationDescription )
            // InternalDeployModelParser.g:2130:5: lv_type_0_0= StackImplementationDescription
            {
            lv_type_0_0=(Token)match(input,StackImplementationDescription,FOLLOW_17); 

            					newLeafNode(lv_type_0_0, grammarAccess.getStackImplementationDescriptionAccess().getTypeStackImplementationDescriptionKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStackImplementationDescriptionRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "StackImplementationDescription");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStackImplementationDescriptionAccess().getColonKeyword_1());
            		
            this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_5); 

            			newLeafNode(this_INDENT_2, grammarAccess.getStackImplementationDescriptionAccess().getINDENTTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getStackImplementationDescriptionAccess().getNameKeyword_3());
            		
            // InternalDeployModelParser.g:2154:3: ( (lv_name_4_0= ruleQualifiedName ) )
            // InternalDeployModelParser.g:2155:4: (lv_name_4_0= ruleQualifiedName )
            {
            // InternalDeployModelParser.g:2155:4: (lv_name_4_0= ruleQualifiedName )
            // InternalDeployModelParser.g:2156:5: lv_name_4_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getStackImplementationDescriptionAccess().getNameQualifiedNameParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_4_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStackImplementationDescriptionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeployModelParser.g:2173:3: (otherlv_5= ImplementsRosModel ( (lv_impRosmodel_6_0= ruleQualifiedName ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ImplementsRosModel) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDeployModelParser.g:2174:4: otherlv_5= ImplementsRosModel ( (lv_impRosmodel_6_0= ruleQualifiedName ) )
                    {
                    otherlv_5=(Token)match(input,ImplementsRosModel,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getStackImplementationDescriptionAccess().getImplementsRosModelKeyword_5_0());
                    			
                    // InternalDeployModelParser.g:2178:4: ( (lv_impRosmodel_6_0= ruleQualifiedName ) )
                    // InternalDeployModelParser.g:2179:5: (lv_impRosmodel_6_0= ruleQualifiedName )
                    {
                    // InternalDeployModelParser.g:2179:5: (lv_impRosmodel_6_0= ruleQualifiedName )
                    // InternalDeployModelParser.g:2180:6: lv_impRosmodel_6_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getStackImplementationDescriptionAccess().getImpRosmodelQualifiedNameParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_impRosmodel_6_0=ruleQualifiedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStackImplementationDescriptionRule());
                    						}
                    						set(
                    							current,
                    							"impRosmodel",
                    							lv_impRosmodel_6_0,
                    							"de.fraunhofer.ipa.deployment.DeployModel.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,Description,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getStackImplementationDescriptionAccess().getDescriptionKeyword_6());
            		
            // InternalDeployModelParser.g:2202:3: ( (lv_description_8_0= RULE_STRING ) )
            // InternalDeployModelParser.g:2203:4: (lv_description_8_0= RULE_STRING )
            {
            // InternalDeployModelParser.g:2203:4: (lv_description_8_0= RULE_STRING )
            // InternalDeployModelParser.g:2204:5: lv_description_8_0= RULE_STRING
            {
            lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_description_8_0, grammarAccess.getStackImplementationDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStackImplementationDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,Mode,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getStackImplementationDescriptionAccess().getModeKeyword_8());
            		
            // InternalDeployModelParser.g:2224:3: ( (lv_mode_10_0= ruleImplementationModeType ) )
            // InternalDeployModelParser.g:2225:4: (lv_mode_10_0= ruleImplementationModeType )
            {
            // InternalDeployModelParser.g:2225:4: (lv_mode_10_0= ruleImplementationModeType )
            // InternalDeployModelParser.g:2226:5: lv_mode_10_0= ruleImplementationModeType
            {

            					newCompositeNode(grammarAccess.getStackImplementationDescriptionAccess().getModeImplementationModeTypeEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_46);
            lv_mode_10_0=ruleImplementationModeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStackImplementationDescriptionRule());
            					}
            					set(
            						current,
            						"mode",
            						lv_mode_10_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.ImplementationModeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeployModelParser.g:2243:3: ( (lv_impl_11_0= ruleImplementationArtifactDescription ) )
            // InternalDeployModelParser.g:2244:4: (lv_impl_11_0= ruleImplementationArtifactDescription )
            {
            // InternalDeployModelParser.g:2244:4: (lv_impl_11_0= ruleImplementationArtifactDescription )
            // InternalDeployModelParser.g:2245:5: lv_impl_11_0= ruleImplementationArtifactDescription
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
    // InternalDeployModelParser.g:2270:1: entryRulePackageDescription returns [EObject current=null] : iv_rulePackageDescription= rulePackageDescription EOF ;
    public final EObject entryRulePackageDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDescription = null;


        try {
            // InternalDeployModelParser.g:2270:59: (iv_rulePackageDescription= rulePackageDescription EOF )
            // InternalDeployModelParser.g:2271:2: iv_rulePackageDescription= rulePackageDescription EOF
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
    // InternalDeployModelParser.g:2277:1: rulePackageDescription returns [EObject current=null] : ( ( (lv_type_0_0= PackageDescription ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT otherlv_3= ImageDescription this_INDENT_4= RULE_INDENT ( (lv_imageDescription_5_0= ruleImageDescription ) ) this_DEDENT_6= RULE_DEDENT otherlv_7= RepositoryDescription ( (lv_repositoryDescription_8_0= ruleRepositoryDescription ) ) this_DEDENT_9= RULE_DEDENT ) ;
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
            // InternalDeployModelParser.g:2283:2: ( ( ( (lv_type_0_0= PackageDescription ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT otherlv_3= ImageDescription this_INDENT_4= RULE_INDENT ( (lv_imageDescription_5_0= ruleImageDescription ) ) this_DEDENT_6= RULE_DEDENT otherlv_7= RepositoryDescription ( (lv_repositoryDescription_8_0= ruleRepositoryDescription ) ) this_DEDENT_9= RULE_DEDENT ) )
            // InternalDeployModelParser.g:2284:2: ( ( (lv_type_0_0= PackageDescription ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT otherlv_3= ImageDescription this_INDENT_4= RULE_INDENT ( (lv_imageDescription_5_0= ruleImageDescription ) ) this_DEDENT_6= RULE_DEDENT otherlv_7= RepositoryDescription ( (lv_repositoryDescription_8_0= ruleRepositoryDescription ) ) this_DEDENT_9= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:2284:2: ( ( (lv_type_0_0= PackageDescription ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT otherlv_3= ImageDescription this_INDENT_4= RULE_INDENT ( (lv_imageDescription_5_0= ruleImageDescription ) ) this_DEDENT_6= RULE_DEDENT otherlv_7= RepositoryDescription ( (lv_repositoryDescription_8_0= ruleRepositoryDescription ) ) this_DEDENT_9= RULE_DEDENT )
            // InternalDeployModelParser.g:2285:3: ( (lv_type_0_0= PackageDescription ) ) otherlv_1= Colon this_INDENT_2= RULE_INDENT otherlv_3= ImageDescription this_INDENT_4= RULE_INDENT ( (lv_imageDescription_5_0= ruleImageDescription ) ) this_DEDENT_6= RULE_DEDENT otherlv_7= RepositoryDescription ( (lv_repositoryDescription_8_0= ruleRepositoryDescription ) ) this_DEDENT_9= RULE_DEDENT
            {
            // InternalDeployModelParser.g:2285:3: ( (lv_type_0_0= PackageDescription ) )
            // InternalDeployModelParser.g:2286:4: (lv_type_0_0= PackageDescription )
            {
            // InternalDeployModelParser.g:2286:4: (lv_type_0_0= PackageDescription )
            // InternalDeployModelParser.g:2287:5: lv_type_0_0= PackageDescription
            {
            lv_type_0_0=(Token)match(input,PackageDescription,FOLLOW_17); 

            					newLeafNode(lv_type_0_0, grammarAccess.getPackageDescriptionAccess().getTypePackageDescriptionKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackageDescriptionRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "PackageDescription");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPackageDescriptionAccess().getColonKeyword_1());
            		
            this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_47); 

            			newLeafNode(this_INDENT_2, grammarAccess.getPackageDescriptionAccess().getINDENTTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,ImageDescription,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPackageDescriptionAccess().getImageDescriptionKeyword_3());
            		
            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_48); 

            			newLeafNode(this_INDENT_4, grammarAccess.getPackageDescriptionAccess().getINDENTTerminalRuleCall_4());
            		
            // InternalDeployModelParser.g:2315:3: ( (lv_imageDescription_5_0= ruleImageDescription ) )
            // InternalDeployModelParser.g:2316:4: (lv_imageDescription_5_0= ruleImageDescription )
            {
            // InternalDeployModelParser.g:2316:4: (lv_imageDescription_5_0= ruleImageDescription )
            // InternalDeployModelParser.g:2317:5: lv_imageDescription_5_0= ruleImageDescription
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

            this_DEDENT_6=(Token)match(input,RULE_DEDENT,FOLLOW_49); 

            			newLeafNode(this_DEDENT_6, grammarAccess.getPackageDescriptionAccess().getDEDENTTerminalRuleCall_6());
            		
            otherlv_7=(Token)match(input,RepositoryDescription,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getPackageDescriptionAccess().getRepositoryDescriptionKeyword_7());
            		
            // InternalDeployModelParser.g:2342:3: ( (lv_repositoryDescription_8_0= ruleRepositoryDescription ) )
            // InternalDeployModelParser.g:2343:4: (lv_repositoryDescription_8_0= ruleRepositoryDescription )
            {
            // InternalDeployModelParser.g:2343:4: (lv_repositoryDescription_8_0= ruleRepositoryDescription )
            // InternalDeployModelParser.g:2344:5: lv_repositoryDescription_8_0= ruleRepositoryDescription
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
    // InternalDeployModelParser.g:2369:1: entryRuleImageDescription returns [EObject current=null] : iv_ruleImageDescription= ruleImageDescription EOF ;
    public final EObject entryRuleImageDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageDescription = null;


        try {
            // InternalDeployModelParser.g:2369:57: (iv_ruleImageDescription= ruleImageDescription EOF )
            // InternalDeployModelParser.g:2370:2: iv_ruleImageDescription= ruleImageDescription EOF
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
    // InternalDeployModelParser.g:2376:1: ruleImageDescription returns [EObject current=null] : (otherlv_0= Types ( (lv_types_1_0= ruleImageTypeList ) ) otherlv_2= Name ( ( ruleQualifiedName ) ) otherlv_4= ImageVersions ( (lv_imageVersions_5_0= ruleImageVersionList ) ) ) ;
    public final EObject ruleImageDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_types_1_0 = null;

        EObject lv_imageVersions_5_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:2382:2: ( (otherlv_0= Types ( (lv_types_1_0= ruleImageTypeList ) ) otherlv_2= Name ( ( ruleQualifiedName ) ) otherlv_4= ImageVersions ( (lv_imageVersions_5_0= ruleImageVersionList ) ) ) )
            // InternalDeployModelParser.g:2383:2: (otherlv_0= Types ( (lv_types_1_0= ruleImageTypeList ) ) otherlv_2= Name ( ( ruleQualifiedName ) ) otherlv_4= ImageVersions ( (lv_imageVersions_5_0= ruleImageVersionList ) ) )
            {
            // InternalDeployModelParser.g:2383:2: (otherlv_0= Types ( (lv_types_1_0= ruleImageTypeList ) ) otherlv_2= Name ( ( ruleQualifiedName ) ) otherlv_4= ImageVersions ( (lv_imageVersions_5_0= ruleImageVersionList ) ) )
            // InternalDeployModelParser.g:2384:3: otherlv_0= Types ( (lv_types_1_0= ruleImageTypeList ) ) otherlv_2= Name ( ( ruleQualifiedName ) ) otherlv_4= ImageVersions ( (lv_imageVersions_5_0= ruleImageVersionList ) )
            {
            otherlv_0=(Token)match(input,Types,FOLLOW_50); 

            			newLeafNode(otherlv_0, grammarAccess.getImageDescriptionAccess().getTypesKeyword_0());
            		
            // InternalDeployModelParser.g:2388:3: ( (lv_types_1_0= ruleImageTypeList ) )
            // InternalDeployModelParser.g:2389:4: (lv_types_1_0= ruleImageTypeList )
            {
            // InternalDeployModelParser.g:2389:4: (lv_types_1_0= ruleImageTypeList )
            // InternalDeployModelParser.g:2390:5: lv_types_1_0= ruleImageTypeList
            {

            					newCompositeNode(grammarAccess.getImageDescriptionAccess().getTypesImageTypeListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_types_1_0=ruleImageTypeList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImageDescriptionRule());
            					}
            					add(
            						current,
            						"types",
            						lv_types_1_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.ImageTypeList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getImageDescriptionAccess().getNameKeyword_2());
            		
            // InternalDeployModelParser.g:2411:3: ( ( ruleQualifiedName ) )
            // InternalDeployModelParser.g:2412:4: ( ruleQualifiedName )
            {
            // InternalDeployModelParser.g:2412:4: ( ruleQualifiedName )
            // InternalDeployModelParser.g:2413:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageDescriptionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getImageDescriptionAccess().getNameMonolithicImplementationDescriptionCrossReference_3_0());
            				
            pushFollow(FOLLOW_51);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,ImageVersions,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getImageDescriptionAccess().getImageVersionsKeyword_4());
            		
            // InternalDeployModelParser.g:2431:3: ( (lv_imageVersions_5_0= ruleImageVersionList ) )
            // InternalDeployModelParser.g:2432:4: (lv_imageVersions_5_0= ruleImageVersionList )
            {
            // InternalDeployModelParser.g:2432:4: (lv_imageVersions_5_0= ruleImageVersionList )
            // InternalDeployModelParser.g:2433:5: lv_imageVersions_5_0= ruleImageVersionList
            {

            					newCompositeNode(grammarAccess.getImageDescriptionAccess().getImageVersionsImageVersionListParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_imageVersions_5_0=ruleImageVersionList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImageDescriptionRule());
            					}
            					set(
            						current,
            						"imageVersions",
            						lv_imageVersions_5_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.ImageVersionList");
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


    // $ANTLR start "entryRuleImageTypeList"
    // InternalDeployModelParser.g:2454:1: entryRuleImageTypeList returns [EObject current=null] : iv_ruleImageTypeList= ruleImageTypeList EOF ;
    public final EObject entryRuleImageTypeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageTypeList = null;


        try {
            // InternalDeployModelParser.g:2454:54: (iv_ruleImageTypeList= ruleImageTypeList EOF )
            // InternalDeployModelParser.g:2455:2: iv_ruleImageTypeList= ruleImageTypeList EOF
            {
             newCompositeNode(grammarAccess.getImageTypeListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImageTypeList=ruleImageTypeList();

            state._fsp--;

             current =iv_ruleImageTypeList; 
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
    // $ANTLR end "entryRuleImageTypeList"


    // $ANTLR start "ruleImageTypeList"
    // InternalDeployModelParser.g:2461:1: ruleImageTypeList returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_children_1_0= ruleImageTypes ) ) (otherlv_2= Comma ( (lv_children_3_0= ruleImageTypes ) )* )? otherlv_4= RightSquareBracket ) ;
    public final EObject ruleImageTypeList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_children_1_0 = null;

        Enumerator lv_children_3_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:2467:2: ( (otherlv_0= LeftSquareBracket ( (lv_children_1_0= ruleImageTypes ) ) (otherlv_2= Comma ( (lv_children_3_0= ruleImageTypes ) )* )? otherlv_4= RightSquareBracket ) )
            // InternalDeployModelParser.g:2468:2: (otherlv_0= LeftSquareBracket ( (lv_children_1_0= ruleImageTypes ) ) (otherlv_2= Comma ( (lv_children_3_0= ruleImageTypes ) )* )? otherlv_4= RightSquareBracket )
            {
            // InternalDeployModelParser.g:2468:2: (otherlv_0= LeftSquareBracket ( (lv_children_1_0= ruleImageTypes ) ) (otherlv_2= Comma ( (lv_children_3_0= ruleImageTypes ) )* )? otherlv_4= RightSquareBracket )
            // InternalDeployModelParser.g:2469:3: otherlv_0= LeftSquareBracket ( (lv_children_1_0= ruleImageTypes ) ) (otherlv_2= Comma ( (lv_children_3_0= ruleImageTypes ) )* )? otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getImageTypeListAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalDeployModelParser.g:2473:3: ( (lv_children_1_0= ruleImageTypes ) )
            // InternalDeployModelParser.g:2474:4: (lv_children_1_0= ruleImageTypes )
            {
            // InternalDeployModelParser.g:2474:4: (lv_children_1_0= ruleImageTypes )
            // InternalDeployModelParser.g:2475:5: lv_children_1_0= ruleImageTypes
            {

            					newCompositeNode(grammarAccess.getImageTypeListAccess().getChildrenImageTypesEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_53);
            lv_children_1_0=ruleImageTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImageTypeListRule());
            					}
            					add(
            						current,
            						"children",
            						lv_children_1_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.ImageTypes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeployModelParser.g:2492:3: (otherlv_2= Comma ( (lv_children_3_0= ruleImageTypes ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Comma) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDeployModelParser.g:2493:4: otherlv_2= Comma ( (lv_children_3_0= ruleImageTypes ) )*
                    {
                    otherlv_2=(Token)match(input,Comma,FOLLOW_54); 

                    				newLeafNode(otherlv_2, grammarAccess.getImageTypeListAccess().getCommaKeyword_2_0());
                    			
                    // InternalDeployModelParser.g:2497:4: ( (lv_children_3_0= ruleImageTypes ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==Docker||LA30_0==Snap) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalDeployModelParser.g:2498:5: (lv_children_3_0= ruleImageTypes )
                    	    {
                    	    // InternalDeployModelParser.g:2498:5: (lv_children_3_0= ruleImageTypes )
                    	    // InternalDeployModelParser.g:2499:6: lv_children_3_0= ruleImageTypes
                    	    {

                    	    						newCompositeNode(grammarAccess.getImageTypeListAccess().getChildrenImageTypesEnumRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_54);
                    	    lv_children_3_0=ruleImageTypes();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getImageTypeListRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"children",
                    	    							lv_children_3_0,
                    	    							"de.fraunhofer.ipa.deployment.DeployModel.ImageTypes");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getImageTypeListAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleImageTypeList"


    // $ANTLR start "entryRuleImageVersionList"
    // InternalDeployModelParser.g:2525:1: entryRuleImageVersionList returns [EObject current=null] : iv_ruleImageVersionList= ruleImageVersionList EOF ;
    public final EObject entryRuleImageVersionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageVersionList = null;


        try {
            // InternalDeployModelParser.g:2525:57: (iv_ruleImageVersionList= ruleImageVersionList EOF )
            // InternalDeployModelParser.g:2526:2: iv_ruleImageVersionList= ruleImageVersionList EOF
            {
             newCompositeNode(grammarAccess.getImageVersionListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImageVersionList=ruleImageVersionList();

            state._fsp--;

             current =iv_ruleImageVersionList; 
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
    // $ANTLR end "entryRuleImageVersionList"


    // $ANTLR start "ruleImageVersionList"
    // InternalDeployModelParser.g:2532:1: ruleImageVersionList returns [EObject current=null] : ( ( rulePreListElement ( (lv_children_1_0= ruleImageVersionTypes ) ) ) ( rulePreListElement ( (lv_children_3_0= ruleImageVersionTypes ) )* )? ) ;
    public final EObject ruleImageVersionList() throws RecognitionException {
        EObject current = null;

        Enumerator lv_children_1_0 = null;

        Enumerator lv_children_3_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:2538:2: ( ( ( rulePreListElement ( (lv_children_1_0= ruleImageVersionTypes ) ) ) ( rulePreListElement ( (lv_children_3_0= ruleImageVersionTypes ) )* )? ) )
            // InternalDeployModelParser.g:2539:2: ( ( rulePreListElement ( (lv_children_1_0= ruleImageVersionTypes ) ) ) ( rulePreListElement ( (lv_children_3_0= ruleImageVersionTypes ) )* )? )
            {
            // InternalDeployModelParser.g:2539:2: ( ( rulePreListElement ( (lv_children_1_0= ruleImageVersionTypes ) ) ) ( rulePreListElement ( (lv_children_3_0= ruleImageVersionTypes ) )* )? )
            // InternalDeployModelParser.g:2540:3: ( rulePreListElement ( (lv_children_1_0= ruleImageVersionTypes ) ) ) ( rulePreListElement ( (lv_children_3_0= ruleImageVersionTypes ) )* )?
            {
            // InternalDeployModelParser.g:2540:3: ( rulePreListElement ( (lv_children_1_0= ruleImageVersionTypes ) ) )
            // InternalDeployModelParser.g:2541:4: rulePreListElement ( (lv_children_1_0= ruleImageVersionTypes ) )
            {

            				newCompositeNode(grammarAccess.getImageVersionListAccess().getPreListElementParserRuleCall_0_0());
            			
            pushFollow(FOLLOW_55);
            rulePreListElement();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			
            // InternalDeployModelParser.g:2548:4: ( (lv_children_1_0= ruleImageVersionTypes ) )
            // InternalDeployModelParser.g:2549:5: (lv_children_1_0= ruleImageVersionTypes )
            {
            // InternalDeployModelParser.g:2549:5: (lv_children_1_0= ruleImageVersionTypes )
            // InternalDeployModelParser.g:2550:6: lv_children_1_0= ruleImageVersionTypes
            {

            						newCompositeNode(grammarAccess.getImageVersionListAccess().getChildrenImageVersionTypesEnumRuleCall_0_1_0());
            					
            pushFollow(FOLLOW_23);
            lv_children_1_0=ruleImageVersionTypes();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getImageVersionListRule());
            						}
            						add(
            							current,
            							"children",
            							lv_children_1_0,
            							"de.fraunhofer.ipa.deployment.DeployModel.ImageVersionTypes");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalDeployModelParser.g:2568:3: ( rulePreListElement ( (lv_children_3_0= ruleImageVersionTypes ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==HyphenMinus) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDeployModelParser.g:2569:4: rulePreListElement ( (lv_children_3_0= ruleImageVersionTypes ) )*
                    {

                    				newCompositeNode(grammarAccess.getImageVersionListAccess().getPreListElementParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_56);
                    rulePreListElement();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalDeployModelParser.g:2576:4: ( (lv_children_3_0= ruleImageVersionTypes ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( ((LA32_0>=Release && LA32_0<=Commit)||LA32_0==Latest) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalDeployModelParser.g:2577:5: (lv_children_3_0= ruleImageVersionTypes )
                    	    {
                    	    // InternalDeployModelParser.g:2577:5: (lv_children_3_0= ruleImageVersionTypes )
                    	    // InternalDeployModelParser.g:2578:6: lv_children_3_0= ruleImageVersionTypes
                    	    {

                    	    						newCompositeNode(grammarAccess.getImageVersionListAccess().getChildrenImageVersionTypesEnumRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_56);
                    	    lv_children_3_0=ruleImageVersionTypes();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getImageVersionListRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"children",
                    	    							lv_children_3_0,
                    	    							"de.fraunhofer.ipa.deployment.DeployModel.ImageVersionTypes");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


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
    // $ANTLR end "ruleImageVersionList"


    // $ANTLR start "entryRuleRepositoryDescription"
    // InternalDeployModelParser.g:2600:1: entryRuleRepositoryDescription returns [EObject current=null] : iv_ruleRepositoryDescription= ruleRepositoryDescription EOF ;
    public final EObject entryRuleRepositoryDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepositoryDescription = null;


        try {
            // InternalDeployModelParser.g:2600:62: (iv_ruleRepositoryDescription= ruleRepositoryDescription EOF )
            // InternalDeployModelParser.g:2601:2: iv_ruleRepositoryDescription= ruleRepositoryDescription EOF
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
    // InternalDeployModelParser.g:2607:1: ruleRepositoryDescription returns [EObject current=null] : ( (lv_spec_0_0= ruleRepositorySpec ) )+ ;
    public final EObject ruleRepositoryDescription() throws RecognitionException {
        EObject current = null;

        EObject lv_spec_0_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:2613:2: ( ( (lv_spec_0_0= ruleRepositorySpec ) )+ )
            // InternalDeployModelParser.g:2614:2: ( (lv_spec_0_0= ruleRepositorySpec ) )+
            {
            // InternalDeployModelParser.g:2614:2: ( (lv_spec_0_0= ruleRepositorySpec ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==HyphenMinus) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalDeployModelParser.g:2615:3: (lv_spec_0_0= ruleRepositorySpec )
            	    {
            	    // InternalDeployModelParser.g:2615:3: (lv_spec_0_0= ruleRepositorySpec )
            	    // InternalDeployModelParser.g:2616:4: lv_spec_0_0= ruleRepositorySpec
            	    {

            	    				newCompositeNode(grammarAccess.getRepositoryDescriptionAccess().getSpecRepositorySpecParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_23);
            	    lv_spec_0_0=ruleRepositorySpec();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getRepositoryDescriptionRule());
            	    				}
            	    				add(
            	    					current,
            	    					"spec",
            	    					lv_spec_0_0,
            	    					"de.fraunhofer.ipa.deployment.DeployModel.RepositorySpec");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);


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
    // InternalDeployModelParser.g:2636:1: entryRuleRepositorySpec returns [EObject current=null] : iv_ruleRepositorySpec= ruleRepositorySpec EOF ;
    public final EObject entryRuleRepositorySpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepositorySpec = null;


        try {
            // InternalDeployModelParser.g:2636:55: (iv_ruleRepositorySpec= ruleRepositorySpec EOF )
            // InternalDeployModelParser.g:2637:2: iv_ruleRepositorySpec= ruleRepositorySpec EOF
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
    // InternalDeployModelParser.g:2643:1: ruleRepositorySpec returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT ( (lv_repository_4_0= ruleRepository ) ) this_DEDENT_5= RULE_DEDENT ) ;
    public final EObject ruleRepositorySpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_INDENT_3=null;
        Token this_DEDENT_5=null;
        EObject lv_repository_4_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:2649:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT ( (lv_repository_4_0= ruleRepository ) ) this_DEDENT_5= RULE_DEDENT ) )
            // InternalDeployModelParser.g:2650:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT ( (lv_repository_4_0= ruleRepository ) ) this_DEDENT_5= RULE_DEDENT )
            {
            // InternalDeployModelParser.g:2650:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT ( (lv_repository_4_0= ruleRepository ) ) this_DEDENT_5= RULE_DEDENT )
            // InternalDeployModelParser.g:2651:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= RULE_ID ) ) this_INDENT_3= RULE_INDENT ( (lv_repository_4_0= ruleRepository ) ) this_DEDENT_5= RULE_DEDENT
            {

            			newCompositeNode(grammarAccess.getRepositorySpecAccess().getPreListElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getRepositorySpecAccess().getNameKeyword_1());
            		
            // InternalDeployModelParser.g:2662:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDeployModelParser.g:2663:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDeployModelParser.g:2663:4: (lv_name_2_0= RULE_ID )
            // InternalDeployModelParser.g:2664:5: lv_name_2_0= RULE_ID
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_57); 

            			newLeafNode(this_INDENT_3, grammarAccess.getRepositorySpecAccess().getINDENTTerminalRuleCall_3());
            		
            // InternalDeployModelParser.g:2684:3: ( (lv_repository_4_0= ruleRepository ) )
            // InternalDeployModelParser.g:2685:4: (lv_repository_4_0= ruleRepository )
            {
            // InternalDeployModelParser.g:2685:4: (lv_repository_4_0= ruleRepository )
            // InternalDeployModelParser.g:2686:5: lv_repository_4_0= ruleRepository
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
    // InternalDeployModelParser.g:2711:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalDeployModelParser.g:2711:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalDeployModelParser.g:2712:2: iv_ruleRepository= ruleRepository EOF
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
    // InternalDeployModelParser.g:2718:1: ruleRepository returns [EObject current=null] : (otherlv_0= Type ( (lv_type_1_0= ruleRepositoryTypes ) ) (otherlv_2= Path ( (lv_path_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_path_3_0=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:2724:2: ( (otherlv_0= Type ( (lv_type_1_0= ruleRepositoryTypes ) ) (otherlv_2= Path ( (lv_path_3_0= RULE_STRING ) ) )? ) )
            // InternalDeployModelParser.g:2725:2: (otherlv_0= Type ( (lv_type_1_0= ruleRepositoryTypes ) ) (otherlv_2= Path ( (lv_path_3_0= RULE_STRING ) ) )? )
            {
            // InternalDeployModelParser.g:2725:2: (otherlv_0= Type ( (lv_type_1_0= ruleRepositoryTypes ) ) (otherlv_2= Path ( (lv_path_3_0= RULE_STRING ) ) )? )
            // InternalDeployModelParser.g:2726:3: otherlv_0= Type ( (lv_type_1_0= ruleRepositoryTypes ) ) (otherlv_2= Path ( (lv_path_3_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,Type,FOLLOW_58); 

            			newLeafNode(otherlv_0, grammarAccess.getRepositoryAccess().getTypeKeyword_0());
            		
            // InternalDeployModelParser.g:2730:3: ( (lv_type_1_0= ruleRepositoryTypes ) )
            // InternalDeployModelParser.g:2731:4: (lv_type_1_0= ruleRepositoryTypes )
            {
            // InternalDeployModelParser.g:2731:4: (lv_type_1_0= ruleRepositoryTypes )
            // InternalDeployModelParser.g:2732:5: lv_type_1_0= ruleRepositoryTypes
            {

            					newCompositeNode(grammarAccess.getRepositoryAccess().getTypeRepositoryTypesEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_59);
            lv_type_1_0=ruleRepositoryTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepositoryRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"de.fraunhofer.ipa.deployment.DeployModel.RepositoryTypes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeployModelParser.g:2749:3: (otherlv_2= Path ( (lv_path_3_0= RULE_STRING ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Path) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDeployModelParser.g:2750:4: otherlv_2= Path ( (lv_path_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,Path,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getRepositoryAccess().getPathKeyword_2_0());
                    			
                    // InternalDeployModelParser.g:2754:4: ( (lv_path_3_0= RULE_STRING ) )
                    // InternalDeployModelParser.g:2755:5: (lv_path_3_0= RULE_STRING )
                    {
                    // InternalDeployModelParser.g:2755:5: (lv_path_3_0= RULE_STRING )
                    // InternalDeployModelParser.g:2756:6: lv_path_3_0= RULE_STRING
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


    // $ANTLR start "entryRulePreListElement"
    // InternalDeployModelParser.g:2777:1: entryRulePreListElement returns [String current=null] : iv_rulePreListElement= rulePreListElement EOF ;
    public final String entryRulePreListElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreListElement = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalDeployModelParser.g:2779:2: (iv_rulePreListElement= rulePreListElement EOF )
            // InternalDeployModelParser.g:2780:2: iv_rulePreListElement= rulePreListElement EOF
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
    // InternalDeployModelParser.g:2789:1: rulePreListElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
    public final AntlrDatatypeRuleToken rulePreListElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalDeployModelParser.g:2796:2: (kw= HyphenMinus )
            // InternalDeployModelParser.g:2797:2: kw= HyphenMinus
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
    // InternalDeployModelParser.g:2808:1: entryRuleScalarNumber returns [String current=null] : iv_ruleScalarNumber= ruleScalarNumber EOF ;
    public final String entryRuleScalarNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleScalarNumber = null;


        try {
            // InternalDeployModelParser.g:2808:52: (iv_ruleScalarNumber= ruleScalarNumber EOF )
            // InternalDeployModelParser.g:2809:2: iv_ruleScalarNumber= ruleScalarNumber EOF
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
    // InternalDeployModelParser.g:2815:1: ruleScalarNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Number_0= ruleNumber (this_Unit_1= ruleUnit )? ) ;
    public final AntlrDatatypeRuleToken ruleScalarNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Number_0 = null;

        AntlrDatatypeRuleToken this_Unit_1 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:2821:2: ( (this_Number_0= ruleNumber (this_Unit_1= ruleUnit )? ) )
            // InternalDeployModelParser.g:2822:2: (this_Number_0= ruleNumber (this_Unit_1= ruleUnit )? )
            {
            // InternalDeployModelParser.g:2822:2: (this_Number_0= ruleNumber (this_Unit_1= ruleUnit )? )
            // InternalDeployModelParser.g:2823:3: this_Number_0= ruleNumber (this_Unit_1= ruleUnit )?
            {

            			newCompositeNode(grammarAccess.getScalarNumberAccess().getNumberParserRuleCall_0());
            		
            pushFollow(FOLLOW_60);
            this_Number_0=ruleNumber();

            state._fsp--;


            			current.merge(this_Number_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalDeployModelParser.g:2833:3: (this_Unit_1= ruleUnit )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=GHz && LA36_0<=MHz)||LA36_0==KHz||(LA36_0>=GB && LA36_0<=Hz)||(LA36_0>=Kb && LA36_0<=Ns)||(LA36_0>=TB_1 && LA36_0<=Us)||LA36_0==B||(LA36_0>=B_1 && LA36_0<=S)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDeployModelParser.g:2834:4: this_Unit_1= ruleUnit
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
    // InternalDeployModelParser.g:2849:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalDeployModelParser.g:2849:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalDeployModelParser.g:2850:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalDeployModelParser.g:2856:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_FLOAT_1=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:2862:2: ( (this_INT_0= RULE_INT | this_FLOAT_1= RULE_FLOAT ) )
            // InternalDeployModelParser.g:2863:2: (this_INT_0= RULE_INT | this_FLOAT_1= RULE_FLOAT )
            {
            // InternalDeployModelParser.g:2863:2: (this_INT_0= RULE_INT | this_FLOAT_1= RULE_FLOAT )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_INT) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_FLOAT) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalDeployModelParser.g:2864:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:2872:3: this_FLOAT_1= RULE_FLOAT
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
    // InternalDeployModelParser.g:2883:1: entryRuleUnit returns [String current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final String entryRuleUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnit = null;


        try {
            // InternalDeployModelParser.g:2883:44: (iv_ruleUnit= ruleUnit EOF )
            // InternalDeployModelParser.g:2884:2: iv_ruleUnit= ruleUnit EOF
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
    // InternalDeployModelParser.g:2890:1: ruleUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ScalarUnitSize_0= ruleScalarUnitSize | this_ScalarUnitTime_1= ruleScalarUnitTime | this_ScalarUnitFrequency_2= ruleScalarUnitFrequency ) ;
    public final AntlrDatatypeRuleToken ruleUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ScalarUnitSize_0 = null;

        AntlrDatatypeRuleToken this_ScalarUnitTime_1 = null;

        AntlrDatatypeRuleToken this_ScalarUnitFrequency_2 = null;



        	enterRule();

        try {
            // InternalDeployModelParser.g:2896:2: ( (this_ScalarUnitSize_0= ruleScalarUnitSize | this_ScalarUnitTime_1= ruleScalarUnitTime | this_ScalarUnitFrequency_2= ruleScalarUnitFrequency ) )
            // InternalDeployModelParser.g:2897:2: (this_ScalarUnitSize_0= ruleScalarUnitSize | this_ScalarUnitTime_1= ruleScalarUnitTime | this_ScalarUnitFrequency_2= ruleScalarUnitFrequency )
            {
            // InternalDeployModelParser.g:2897:2: (this_ScalarUnitSize_0= ruleScalarUnitSize | this_ScalarUnitTime_1= ruleScalarUnitTime | this_ScalarUnitFrequency_2= ruleScalarUnitFrequency )
            int alt38=3;
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
                alt38=1;
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
                alt38=2;
                }
                break;
            case GHz:
            case MHz:
            case KHz:
            case Hz:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalDeployModelParser.g:2898:3: this_ScalarUnitSize_0= ruleScalarUnitSize
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
                    // InternalDeployModelParser.g:2909:3: this_ScalarUnitTime_1= ruleScalarUnitTime
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
                    // InternalDeployModelParser.g:2920:3: this_ScalarUnitFrequency_2= ruleScalarUnitFrequency
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
    // InternalDeployModelParser.g:2934:1: entryRuleScalarUnitSize returns [String current=null] : iv_ruleScalarUnitSize= ruleScalarUnitSize EOF ;
    public final String entryRuleScalarUnitSize() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleScalarUnitSize = null;


        try {
            // InternalDeployModelParser.g:2934:54: (iv_ruleScalarUnitSize= ruleScalarUnitSize EOF )
            // InternalDeployModelParser.g:2935:2: iv_ruleScalarUnitSize= ruleScalarUnitSize EOF
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
    // InternalDeployModelParser.g:2941:1: ruleScalarUnitSize returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= B | (kw= B_1 kw= KB ) | kw= Kb_1 | kw= KB_1 | kw= Kb | kw= MB | kw= Mb_1 | kw= MB_1 | kw= Mb | kw= GB | kw= Gb_1 | kw= Gb | kw= GB_1 | kw= TB | kw= Tb_1 | kw= Tb | kw= TB_1 ) ;
    public final AntlrDatatypeRuleToken ruleScalarUnitSize() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:2947:2: ( (kw= B | (kw= B_1 kw= KB ) | kw= Kb_1 | kw= KB_1 | kw= Kb | kw= MB | kw= Mb_1 | kw= MB_1 | kw= Mb | kw= GB | kw= Gb_1 | kw= Gb | kw= GB_1 | kw= TB | kw= Tb_1 | kw= Tb | kw= TB_1 ) )
            // InternalDeployModelParser.g:2948:2: (kw= B | (kw= B_1 kw= KB ) | kw= Kb_1 | kw= KB_1 | kw= Kb | kw= MB | kw= Mb_1 | kw= MB_1 | kw= Mb | kw= GB | kw= Gb_1 | kw= Gb | kw= GB_1 | kw= TB | kw= Tb_1 | kw= Tb | kw= TB_1 )
            {
            // InternalDeployModelParser.g:2948:2: (kw= B | (kw= B_1 kw= KB ) | kw= Kb_1 | kw= KB_1 | kw= Kb | kw= MB | kw= Mb_1 | kw= MB_1 | kw= Mb | kw= GB | kw= Gb_1 | kw= Gb | kw= GB_1 | kw= TB | kw= Tb_1 | kw= Tb | kw= TB_1 )
            int alt39=17;
            switch ( input.LA(1) ) {
            case B:
                {
                alt39=1;
                }
                break;
            case B_1:
                {
                alt39=2;
                }
                break;
            case Kb_1:
                {
                alt39=3;
                }
                break;
            case KB_1:
                {
                alt39=4;
                }
                break;
            case Kb:
                {
                alt39=5;
                }
                break;
            case MB:
                {
                alt39=6;
                }
                break;
            case Mb_1:
                {
                alt39=7;
                }
                break;
            case MB_1:
                {
                alt39=8;
                }
                break;
            case Mb:
                {
                alt39=9;
                }
                break;
            case GB:
                {
                alt39=10;
                }
                break;
            case Gb_1:
                {
                alt39=11;
                }
                break;
            case Gb:
                {
                alt39=12;
                }
                break;
            case GB_1:
                {
                alt39=13;
                }
                break;
            case TB:
                {
                alt39=14;
                }
                break;
            case Tb_1:
                {
                alt39=15;
                }
                break;
            case Tb:
                {
                alt39=16;
                }
                break;
            case TB_1:
                {
                alt39=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalDeployModelParser.g:2949:3: kw= B
                    {
                    kw=(Token)match(input,B,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getBKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:2955:3: (kw= B_1 kw= KB )
                    {
                    // InternalDeployModelParser.g:2955:3: (kw= B_1 kw= KB )
                    // InternalDeployModelParser.g:2956:4: kw= B_1 kw= KB
                    {
                    kw=(Token)match(input,B_1,FOLLOW_61); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getBKeyword_1_0());
                    			
                    kw=(Token)match(input,KB,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getKBKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDeployModelParser.g:2968:3: kw= Kb_1
                    {
                    kw=(Token)match(input,Kb_1,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getKbKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDeployModelParser.g:2974:3: kw= KB_1
                    {
                    kw=(Token)match(input,KB_1,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getKBKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalDeployModelParser.g:2980:3: kw= Kb
                    {
                    kw=(Token)match(input,Kb,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getKbKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalDeployModelParser.g:2986:3: kw= MB
                    {
                    kw=(Token)match(input,MB,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getMBKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalDeployModelParser.g:2992:3: kw= Mb_1
                    {
                    kw=(Token)match(input,Mb_1,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getMbKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalDeployModelParser.g:2998:3: kw= MB_1
                    {
                    kw=(Token)match(input,MB_1,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getMBKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalDeployModelParser.g:3004:3: kw= Mb
                    {
                    kw=(Token)match(input,Mb,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getMbKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalDeployModelParser.g:3010:3: kw= GB
                    {
                    kw=(Token)match(input,GB,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getGBKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalDeployModelParser.g:3016:3: kw= Gb_1
                    {
                    kw=(Token)match(input,Gb_1,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getGbKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalDeployModelParser.g:3022:3: kw= Gb
                    {
                    kw=(Token)match(input,Gb,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getGbKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalDeployModelParser.g:3028:3: kw= GB_1
                    {
                    kw=(Token)match(input,GB_1,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getGBKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalDeployModelParser.g:3034:3: kw= TB
                    {
                    kw=(Token)match(input,TB,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getTBKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalDeployModelParser.g:3040:3: kw= Tb_1
                    {
                    kw=(Token)match(input,Tb_1,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getTbKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalDeployModelParser.g:3046:3: kw= Tb
                    {
                    kw=(Token)match(input,Tb,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitSizeAccess().getTbKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalDeployModelParser.g:3052:3: kw= TB_1
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
    // InternalDeployModelParser.g:3061:1: entryRuleScalarUnitTime returns [String current=null] : iv_ruleScalarUnitTime= ruleScalarUnitTime EOF ;
    public final String entryRuleScalarUnitTime() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleScalarUnitTime = null;


        try {
            // InternalDeployModelParser.g:3061:54: (iv_ruleScalarUnitTime= ruleScalarUnitTime EOF )
            // InternalDeployModelParser.g:3062:2: iv_ruleScalarUnitTime= ruleScalarUnitTime EOF
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
    // InternalDeployModelParser.g:3068:1: ruleScalarUnitTime returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= D | kw= H | kw= M | kw= S | kw= Ms | kw= Us | kw= Ns ) ;
    public final AntlrDatatypeRuleToken ruleScalarUnitTime() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:3074:2: ( (kw= D | kw= H | kw= M | kw= S | kw= Ms | kw= Us | kw= Ns ) )
            // InternalDeployModelParser.g:3075:2: (kw= D | kw= H | kw= M | kw= S | kw= Ms | kw= Us | kw= Ns )
            {
            // InternalDeployModelParser.g:3075:2: (kw= D | kw= H | kw= M | kw= S | kw= Ms | kw= Us | kw= Ns )
            int alt40=7;
            switch ( input.LA(1) ) {
            case D:
                {
                alt40=1;
                }
                break;
            case H:
                {
                alt40=2;
                }
                break;
            case M:
                {
                alt40=3;
                }
                break;
            case S:
                {
                alt40=4;
                }
                break;
            case Ms:
                {
                alt40=5;
                }
                break;
            case Us:
                {
                alt40=6;
                }
                break;
            case Ns:
                {
                alt40=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalDeployModelParser.g:3076:3: kw= D
                    {
                    kw=(Token)match(input,D,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitTimeAccess().getDKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:3082:3: kw= H
                    {
                    kw=(Token)match(input,H,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitTimeAccess().getHKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDeployModelParser.g:3088:3: kw= M
                    {
                    kw=(Token)match(input,M,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitTimeAccess().getMKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDeployModelParser.g:3094:3: kw= S
                    {
                    kw=(Token)match(input,S,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitTimeAccess().getSKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalDeployModelParser.g:3100:3: kw= Ms
                    {
                    kw=(Token)match(input,Ms,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitTimeAccess().getMsKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalDeployModelParser.g:3106:3: kw= Us
                    {
                    kw=(Token)match(input,Us,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitTimeAccess().getUsKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalDeployModelParser.g:3112:3: kw= Ns
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
    // InternalDeployModelParser.g:3121:1: entryRuleScalarUnitFrequency returns [String current=null] : iv_ruleScalarUnitFrequency= ruleScalarUnitFrequency EOF ;
    public final String entryRuleScalarUnitFrequency() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleScalarUnitFrequency = null;


        try {
            // InternalDeployModelParser.g:3121:59: (iv_ruleScalarUnitFrequency= ruleScalarUnitFrequency EOF )
            // InternalDeployModelParser.g:3122:2: iv_ruleScalarUnitFrequency= ruleScalarUnitFrequency EOF
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
    // InternalDeployModelParser.g:3128:1: ruleScalarUnitFrequency returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Hz | kw= KHz | kw= MHz | kw= GHz ) ;
    public final AntlrDatatypeRuleToken ruleScalarUnitFrequency() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:3134:2: ( (kw= Hz | kw= KHz | kw= MHz | kw= GHz ) )
            // InternalDeployModelParser.g:3135:2: (kw= Hz | kw= KHz | kw= MHz | kw= GHz )
            {
            // InternalDeployModelParser.g:3135:2: (kw= Hz | kw= KHz | kw= MHz | kw= GHz )
            int alt41=4;
            switch ( input.LA(1) ) {
            case Hz:
                {
                alt41=1;
                }
                break;
            case KHz:
                {
                alt41=2;
                }
                break;
            case MHz:
                {
                alt41=3;
                }
                break;
            case GHz:
                {
                alt41=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalDeployModelParser.g:3136:3: kw= Hz
                    {
                    kw=(Token)match(input,Hz,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitFrequencyAccess().getHzKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:3142:3: kw= KHz
                    {
                    kw=(Token)match(input,KHz,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitFrequencyAccess().getKHzKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDeployModelParser.g:3148:3: kw= MHz
                    {
                    kw=(Token)match(input,MHz,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getScalarUnitFrequencyAccess().getMHzKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDeployModelParser.g:3154:3: kw= GHz
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
    // InternalDeployModelParser.g:3163:1: ruleImplementationModeType returns [Enumerator current=null] : ( (enumLiteral_0= Debug ) | (enumLiteral_1= Release ) ) ;
    public final Enumerator ruleImplementationModeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:3169:2: ( ( (enumLiteral_0= Debug ) | (enumLiteral_1= Release ) ) )
            // InternalDeployModelParser.g:3170:2: ( (enumLiteral_0= Debug ) | (enumLiteral_1= Release ) )
            {
            // InternalDeployModelParser.g:3170:2: ( (enumLiteral_0= Debug ) | (enumLiteral_1= Release ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Debug) ) {
                alt42=1;
            }
            else if ( (LA42_0==Release) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalDeployModelParser.g:3171:3: (enumLiteral_0= Debug )
                    {
                    // InternalDeployModelParser.g:3171:3: (enumLiteral_0= Debug )
                    // InternalDeployModelParser.g:3172:4: enumLiteral_0= Debug
                    {
                    enumLiteral_0=(Token)match(input,Debug,FOLLOW_2); 

                    				current = grammarAccess.getImplementationModeTypeAccess().getDebugModeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getImplementationModeTypeAccess().getDebugModeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:3179:3: (enumLiteral_1= Release )
                    {
                    // InternalDeployModelParser.g:3179:3: (enumLiteral_1= Release )
                    // InternalDeployModelParser.g:3180:4: enumLiteral_1= Release
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


    // $ANTLR start "ruleResourceReqTypes"
    // InternalDeployModelParser.g:3190:1: ruleResourceReqTypes returns [Enumerator current=null] : ( (enumLiteral_0= Cpus ) | (enumLiteral_1= Memory ) | (enumLiteral_2= Memory_swap ) | (enumLiteral_3= Oom_kill_disable ) ) ;
    public final Enumerator ruleResourceReqTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:3196:2: ( ( (enumLiteral_0= Cpus ) | (enumLiteral_1= Memory ) | (enumLiteral_2= Memory_swap ) | (enumLiteral_3= Oom_kill_disable ) ) )
            // InternalDeployModelParser.g:3197:2: ( (enumLiteral_0= Cpus ) | (enumLiteral_1= Memory ) | (enumLiteral_2= Memory_swap ) | (enumLiteral_3= Oom_kill_disable ) )
            {
            // InternalDeployModelParser.g:3197:2: ( (enumLiteral_0= Cpus ) | (enumLiteral_1= Memory ) | (enumLiteral_2= Memory_swap ) | (enumLiteral_3= Oom_kill_disable ) )
            int alt43=4;
            switch ( input.LA(1) ) {
            case Cpus:
                {
                alt43=1;
                }
                break;
            case Memory:
                {
                alt43=2;
                }
                break;
            case Memory_swap:
                {
                alt43=3;
                }
                break;
            case Oom_kill_disable:
                {
                alt43=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalDeployModelParser.g:3198:3: (enumLiteral_0= Cpus )
                    {
                    // InternalDeployModelParser.g:3198:3: (enumLiteral_0= Cpus )
                    // InternalDeployModelParser.g:3199:4: enumLiteral_0= Cpus
                    {
                    enumLiteral_0=(Token)match(input,Cpus,FOLLOW_2); 

                    				current = grammarAccess.getResourceReqTypesAccess().getCPUEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getResourceReqTypesAccess().getCPUEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:3206:3: (enumLiteral_1= Memory )
                    {
                    // InternalDeployModelParser.g:3206:3: (enumLiteral_1= Memory )
                    // InternalDeployModelParser.g:3207:4: enumLiteral_1= Memory
                    {
                    enumLiteral_1=(Token)match(input,Memory,FOLLOW_2); 

                    				current = grammarAccess.getResourceReqTypesAccess().getMemoryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getResourceReqTypesAccess().getMemoryEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDeployModelParser.g:3214:3: (enumLiteral_2= Memory_swap )
                    {
                    // InternalDeployModelParser.g:3214:3: (enumLiteral_2= Memory_swap )
                    // InternalDeployModelParser.g:3215:4: enumLiteral_2= Memory_swap
                    {
                    enumLiteral_2=(Token)match(input,Memory_swap,FOLLOW_2); 

                    				current = grammarAccess.getResourceReqTypesAccess().getMemorySawpEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getResourceReqTypesAccess().getMemorySawpEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDeployModelParser.g:3222:3: (enumLiteral_3= Oom_kill_disable )
                    {
                    // InternalDeployModelParser.g:3222:3: (enumLiteral_3= Oom_kill_disable )
                    // InternalDeployModelParser.g:3223:4: enumLiteral_3= Oom_kill_disable
                    {
                    enumLiteral_3=(Token)match(input,Oom_kill_disable,FOLLOW_2); 

                    				current = grammarAccess.getResourceReqTypesAccess().getOomKillDisableEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getResourceReqTypesAccess().getOomKillDisableEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleResourceReqTypes"


    // $ANTLR start "ruleOperatingSystemTypes"
    // InternalDeployModelParser.g:3233:1: ruleOperatingSystemTypes returns [Enumerator current=null] : ( (enumLiteral_0= Ubuntu18 ) | (enumLiteral_1= Ubuntu20 ) ) ;
    public final Enumerator ruleOperatingSystemTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:3239:2: ( ( (enumLiteral_0= Ubuntu18 ) | (enumLiteral_1= Ubuntu20 ) ) )
            // InternalDeployModelParser.g:3240:2: ( (enumLiteral_0= Ubuntu18 ) | (enumLiteral_1= Ubuntu20 ) )
            {
            // InternalDeployModelParser.g:3240:2: ( (enumLiteral_0= Ubuntu18 ) | (enumLiteral_1= Ubuntu20 ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Ubuntu18) ) {
                alt44=1;
            }
            else if ( (LA44_0==Ubuntu20) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalDeployModelParser.g:3241:3: (enumLiteral_0= Ubuntu18 )
                    {
                    // InternalDeployModelParser.g:3241:3: (enumLiteral_0= Ubuntu18 )
                    // InternalDeployModelParser.g:3242:4: enumLiteral_0= Ubuntu18
                    {
                    enumLiteral_0=(Token)match(input,Ubuntu18,FOLLOW_2); 

                    				current = grammarAccess.getOperatingSystemTypesAccess().getUbuntu18EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatingSystemTypesAccess().getUbuntu18EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:3249:3: (enumLiteral_1= Ubuntu20 )
                    {
                    // InternalDeployModelParser.g:3249:3: (enumLiteral_1= Ubuntu20 )
                    // InternalDeployModelParser.g:3250:4: enumLiteral_1= Ubuntu20
                    {
                    enumLiteral_1=(Token)match(input,Ubuntu20,FOLLOW_2); 

                    				current = grammarAccess.getOperatingSystemTypesAccess().getUbuntu20EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatingSystemTypesAccess().getUbuntu20EnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleOperatingSystemTypes"


    // $ANTLR start "ruleRosDistro"
    // InternalDeployModelParser.g:3260:1: ruleRosDistro returns [Enumerator current=null] : ( (enumLiteral_0= Melodic ) | (enumLiteral_1= Noetic ) | (enumLiteral_2= Foxy ) | (enumLiteral_3= Galactic ) ) ;
    public final Enumerator ruleRosDistro() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:3266:2: ( ( (enumLiteral_0= Melodic ) | (enumLiteral_1= Noetic ) | (enumLiteral_2= Foxy ) | (enumLiteral_3= Galactic ) ) )
            // InternalDeployModelParser.g:3267:2: ( (enumLiteral_0= Melodic ) | (enumLiteral_1= Noetic ) | (enumLiteral_2= Foxy ) | (enumLiteral_3= Galactic ) )
            {
            // InternalDeployModelParser.g:3267:2: ( (enumLiteral_0= Melodic ) | (enumLiteral_1= Noetic ) | (enumLiteral_2= Foxy ) | (enumLiteral_3= Galactic ) )
            int alt45=4;
            switch ( input.LA(1) ) {
            case Melodic:
                {
                alt45=1;
                }
                break;
            case Noetic:
                {
                alt45=2;
                }
                break;
            case Foxy:
                {
                alt45=3;
                }
                break;
            case Galactic:
                {
                alt45=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalDeployModelParser.g:3268:3: (enumLiteral_0= Melodic )
                    {
                    // InternalDeployModelParser.g:3268:3: (enumLiteral_0= Melodic )
                    // InternalDeployModelParser.g:3269:4: enumLiteral_0= Melodic
                    {
                    enumLiteral_0=(Token)match(input,Melodic,FOLLOW_2); 

                    				current = grammarAccess.getRosDistroAccess().getMelodicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRosDistroAccess().getMelodicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:3276:3: (enumLiteral_1= Noetic )
                    {
                    // InternalDeployModelParser.g:3276:3: (enumLiteral_1= Noetic )
                    // InternalDeployModelParser.g:3277:4: enumLiteral_1= Noetic
                    {
                    enumLiteral_1=(Token)match(input,Noetic,FOLLOW_2); 

                    				current = grammarAccess.getRosDistroAccess().getNoeticEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRosDistroAccess().getNoeticEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDeployModelParser.g:3284:3: (enumLiteral_2= Foxy )
                    {
                    // InternalDeployModelParser.g:3284:3: (enumLiteral_2= Foxy )
                    // InternalDeployModelParser.g:3285:4: enumLiteral_2= Foxy
                    {
                    enumLiteral_2=(Token)match(input,Foxy,FOLLOW_2); 

                    				current = grammarAccess.getRosDistroAccess().getFoxyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRosDistroAccess().getFoxyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDeployModelParser.g:3292:3: (enumLiteral_3= Galactic )
                    {
                    // InternalDeployModelParser.g:3292:3: (enumLiteral_3= Galactic )
                    // InternalDeployModelParser.g:3293:4: enumLiteral_3= Galactic
                    {
                    enumLiteral_3=(Token)match(input,Galactic,FOLLOW_2); 

                    				current = grammarAccess.getRosDistroAccess().getGalacticEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRosDistroAccess().getGalacticEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleRosDistro"


    // $ANTLR start "ruleProcessorArchitectureTypes"
    // InternalDeployModelParser.g:3303:1: ruleProcessorArchitectureTypes returns [Enumerator current=null] : ( (enumLiteral_0= Arm64 ) | (enumLiteral_1= X86 ) ) ;
    public final Enumerator ruleProcessorArchitectureTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:3309:2: ( ( (enumLiteral_0= Arm64 ) | (enumLiteral_1= X86 ) ) )
            // InternalDeployModelParser.g:3310:2: ( (enumLiteral_0= Arm64 ) | (enumLiteral_1= X86 ) )
            {
            // InternalDeployModelParser.g:3310:2: ( (enumLiteral_0= Arm64 ) | (enumLiteral_1= X86 ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Arm64) ) {
                alt46=1;
            }
            else if ( (LA46_0==X86) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalDeployModelParser.g:3311:3: (enumLiteral_0= Arm64 )
                    {
                    // InternalDeployModelParser.g:3311:3: (enumLiteral_0= Arm64 )
                    // InternalDeployModelParser.g:3312:4: enumLiteral_0= Arm64
                    {
                    enumLiteral_0=(Token)match(input,Arm64,FOLLOW_2); 

                    				current = grammarAccess.getProcessorArchitectureTypesAccess().getArm64EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getProcessorArchitectureTypesAccess().getArm64EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:3319:3: (enumLiteral_1= X86 )
                    {
                    // InternalDeployModelParser.g:3319:3: (enumLiteral_1= X86 )
                    // InternalDeployModelParser.g:3320:4: enumLiteral_1= X86
                    {
                    enumLiteral_1=(Token)match(input,X86,FOLLOW_2); 

                    				current = grammarAccess.getProcessorArchitectureTypesAccess().getX86EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getProcessorArchitectureTypesAccess().getX86EnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleProcessorArchitectureTypes"


    // $ANTLR start "ruleImageTypes"
    // InternalDeployModelParser.g:3330:1: ruleImageTypes returns [Enumerator current=null] : ( (enumLiteral_0= Docker ) | (enumLiteral_1= Snap ) ) ;
    public final Enumerator ruleImageTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:3336:2: ( ( (enumLiteral_0= Docker ) | (enumLiteral_1= Snap ) ) )
            // InternalDeployModelParser.g:3337:2: ( (enumLiteral_0= Docker ) | (enumLiteral_1= Snap ) )
            {
            // InternalDeployModelParser.g:3337:2: ( (enumLiteral_0= Docker ) | (enumLiteral_1= Snap ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Docker) ) {
                alt47=1;
            }
            else if ( (LA47_0==Snap) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalDeployModelParser.g:3338:3: (enumLiteral_0= Docker )
                    {
                    // InternalDeployModelParser.g:3338:3: (enumLiteral_0= Docker )
                    // InternalDeployModelParser.g:3339:4: enumLiteral_0= Docker
                    {
                    enumLiteral_0=(Token)match(input,Docker,FOLLOW_2); 

                    				current = grammarAccess.getImageTypesAccess().getDockerImageEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getImageTypesAccess().getDockerImageEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:3346:3: (enumLiteral_1= Snap )
                    {
                    // InternalDeployModelParser.g:3346:3: (enumLiteral_1= Snap )
                    // InternalDeployModelParser.g:3347:4: enumLiteral_1= Snap
                    {
                    enumLiteral_1=(Token)match(input,Snap,FOLLOW_2); 

                    				current = grammarAccess.getImageTypesAccess().getSnapImageEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getImageTypesAccess().getSnapImageEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleImageTypes"


    // $ANTLR start "ruleImageVersionTypes"
    // InternalDeployModelParser.g:3357:1: ruleImageVersionTypes returns [Enumerator current=null] : ( (enumLiteral_0= Branch ) | (enumLiteral_1= Commit ) | (enumLiteral_2= Latest ) | (enumLiteral_3= Release ) ) ;
    public final Enumerator ruleImageVersionTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:3363:2: ( ( (enumLiteral_0= Branch ) | (enumLiteral_1= Commit ) | (enumLiteral_2= Latest ) | (enumLiteral_3= Release ) ) )
            // InternalDeployModelParser.g:3364:2: ( (enumLiteral_0= Branch ) | (enumLiteral_1= Commit ) | (enumLiteral_2= Latest ) | (enumLiteral_3= Release ) )
            {
            // InternalDeployModelParser.g:3364:2: ( (enumLiteral_0= Branch ) | (enumLiteral_1= Commit ) | (enumLiteral_2= Latest ) | (enumLiteral_3= Release ) )
            int alt48=4;
            switch ( input.LA(1) ) {
            case Branch:
                {
                alt48=1;
                }
                break;
            case Commit:
                {
                alt48=2;
                }
                break;
            case Latest:
                {
                alt48=3;
                }
                break;
            case Release:
                {
                alt48=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalDeployModelParser.g:3365:3: (enumLiteral_0= Branch )
                    {
                    // InternalDeployModelParser.g:3365:3: (enumLiteral_0= Branch )
                    // InternalDeployModelParser.g:3366:4: enumLiteral_0= Branch
                    {
                    enumLiteral_0=(Token)match(input,Branch,FOLLOW_2); 

                    				current = grammarAccess.getImageVersionTypesAccess().getBranchEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getImageVersionTypesAccess().getBranchEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:3373:3: (enumLiteral_1= Commit )
                    {
                    // InternalDeployModelParser.g:3373:3: (enumLiteral_1= Commit )
                    // InternalDeployModelParser.g:3374:4: enumLiteral_1= Commit
                    {
                    enumLiteral_1=(Token)match(input,Commit,FOLLOW_2); 

                    				current = grammarAccess.getImageVersionTypesAccess().getCommitHashEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getImageVersionTypesAccess().getCommitHashEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDeployModelParser.g:3381:3: (enumLiteral_2= Latest )
                    {
                    // InternalDeployModelParser.g:3381:3: (enumLiteral_2= Latest )
                    // InternalDeployModelParser.g:3382:4: enumLiteral_2= Latest
                    {
                    enumLiteral_2=(Token)match(input,Latest,FOLLOW_2); 

                    				current = grammarAccess.getImageVersionTypesAccess().getLatestEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getImageVersionTypesAccess().getLatestEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDeployModelParser.g:3389:3: (enumLiteral_3= Release )
                    {
                    // InternalDeployModelParser.g:3389:3: (enumLiteral_3= Release )
                    // InternalDeployModelParser.g:3390:4: enumLiteral_3= Release
                    {
                    enumLiteral_3=(Token)match(input,Release,FOLLOW_2); 

                    				current = grammarAccess.getImageVersionTypesAccess().getReleaseEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getImageVersionTypesAccess().getReleaseEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleImageVersionTypes"


    // $ANTLR start "ruleRepositoryTypes"
    // InternalDeployModelParser.g:3400:1: ruleRepositoryTypes returns [Enumerator current=null] : ( (enumLiteral_0= Local ) | (enumLiteral_1= Remote ) | (enumLiteral_2= Gitlab ) ) ;
    public final Enumerator ruleRepositoryTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDeployModelParser.g:3406:2: ( ( (enumLiteral_0= Local ) | (enumLiteral_1= Remote ) | (enumLiteral_2= Gitlab ) ) )
            // InternalDeployModelParser.g:3407:2: ( (enumLiteral_0= Local ) | (enumLiteral_1= Remote ) | (enumLiteral_2= Gitlab ) )
            {
            // InternalDeployModelParser.g:3407:2: ( (enumLiteral_0= Local ) | (enumLiteral_1= Remote ) | (enumLiteral_2= Gitlab ) )
            int alt49=3;
            switch ( input.LA(1) ) {
            case Local:
                {
                alt49=1;
                }
                break;
            case Remote:
                {
                alt49=2;
                }
                break;
            case Gitlab:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalDeployModelParser.g:3408:3: (enumLiteral_0= Local )
                    {
                    // InternalDeployModelParser.g:3408:3: (enumLiteral_0= Local )
                    // InternalDeployModelParser.g:3409:4: enumLiteral_0= Local
                    {
                    enumLiteral_0=(Token)match(input,Local,FOLLOW_2); 

                    				current = grammarAccess.getRepositoryTypesAccess().getLocalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRepositoryTypesAccess().getLocalEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDeployModelParser.g:3416:3: (enumLiteral_1= Remote )
                    {
                    // InternalDeployModelParser.g:3416:3: (enumLiteral_1= Remote )
                    // InternalDeployModelParser.g:3417:4: enumLiteral_1= Remote
                    {
                    enumLiteral_1=(Token)match(input,Remote,FOLLOW_2); 

                    				current = grammarAccess.getRepositoryTypesAccess().getRemoteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRepositoryTypesAccess().getRemoteEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDeployModelParser.g:3424:3: (enumLiteral_2= Gitlab )
                    {
                    // InternalDeployModelParser.g:3424:3: (enumLiteral_2= Gitlab )
                    // InternalDeployModelParser.g:3425:4: enumLiteral_2= Gitlab
                    {
                    enumLiteral_2=(Token)match(input,Gitlab,FOLLOW_2); 

                    				current = grammarAccess.getRepositoryTypesAccess().getGitlabEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRepositoryTypesAccess().getGitlabEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleRepositoryTypes"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000852L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000200200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0400000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L,0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000240000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000082200L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0080000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0010008000408000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000180000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x1000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x1000100000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0020010102000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0020010102000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000001010000L,0x0000001000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000010000L,0x0000001000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000040000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000100000L,0x0000001000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0040001000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000001040000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0040001000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000004E00000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000004E00000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000822000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0xEB00000000000002L,0x000000003E43BFFEL});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});

}