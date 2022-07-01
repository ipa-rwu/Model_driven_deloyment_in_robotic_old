/*
 * generated by Xtext 2.27.0
 */
lexer grammar InternalDeployModelLexer;

@header {
package de.fraunhofer.ipa.deployment.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

MonolithicImplementationDescription : 'MonolithicImplementationDescription:';

ImplementationArtifactDescription : 'ImplementationArtifactDescription';

StackImplementationDescription : 'StackImplementationDescription';

Processor_architecture : 'processor_architecture';

RepositoryDescription : 'repositoryDescription:';

ResourceRequirements : 'resourceRequirements';

ImplementsRosModel : 'implementsRosModel:';

PackageDescription : 'PackageDescription';

DeployRequirements : 'deployRequirements';

BuildRequirements : 'buildRequirements';

ImageDescription : 'imageDescription:';

Oom_kill_disable : 'oom_kill_disable';

AptRepositories : 'aptRepositories';

RepositoryPath : 'repositoryPath:';

ImageVersions : 'imageVersions:';

StartCommands : 'startCommands:';

UpdateRosDep : 'updateRosDep:';

Description : 'description:';

Memory_swap : 'memory_swap';

Ros_distro : 'ros_distro';

DependOn : 'dependOn:';

Galactic : 'galactic';

KeyLink : 'keyLink:';

Location : 'location';

Ubuntu18 : 'ubuntu18';

Ubuntu20 : 'ubuntu20';

Branch_1 : 'branch:';

Import : 'import:';

Melodic : 'melodic';

Release : 'release';

Branch : 'branch';

Commit : 'commit';

Docker : 'docker';

Gitlab : 'gitlab';

Latest : 'latest';

Memory : 'memory';

Noetic : 'noetic';

Remote : 'remote';

Types : 'types:';

Value : 'value:';

Arm64 : 'arm64';

Debug : 'debug';

From : 'from:';

Local : 'local';

Mode : 'mode:';

Name : 'name:';

Path : 'path:';

Type : 'type:';

Cpus : 'cpus';

Foxy : 'foxy';

Snap : 'snap';

Use : 'use:';

GHz : 'GHz';

MHz : 'MHz';

Any : 'any';

KHz : 'kHz';

X86 : 'x86';

GB : 'GB';

Gb : 'Gb';

Hz : 'Hz';

KB : 'KB';

Kb : 'Kb';

MB : 'MB';

Mb : 'Mb';

TB : 'TB';

Tb : 'Tb';

GB_1 : 'gB';

Gb_1 : 'gb';

KB_1 : 'kB';

Kb_1 : 'kb';

MB_1 : 'mB';

Mb_1 : 'mb';

Ms : 'ms';

Ns : 'ns';

Os : 'os';

TB_1 : 'tB';

Tb_1 : 'tb';

Us : 'us';

Comma : ',';

HyphenMinus : '-';

FullStop : '.';

Colon : ':';

B : 'B';

LeftSquareBracket : '[';

RightSquareBracket : ']';

B_1 : 'b';

D : 'd';

H : 'h';

M : 'm';

S : 's';

RULE_LOCALPATH : '"' ('/'|'./'|'../'|'.') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'-')* '"';

RULE_FLOAT : RULE_INT '.' RULE_INT;

RULE_URL : ('"' ('http' 's'? '://'|'git@') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'\\'|'/'|'='|'?'|'!'|'('|')'|'.'|'-'|':')* '"'|'localhost'|'"' ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'-')* ':' ('0'..'9')* '"');

RULE_SL_COMMENT : '#' ~(('\n'|'\r'))*;

fragment RULE_INDENT : ;

fragment RULE_DEDENT : ;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
