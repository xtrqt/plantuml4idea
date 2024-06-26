package org.plantuml.idea.lang.annotator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * {@link net.sourceforge.plantuml.syntax.LanguageDescriptor}
 * <p>
 * Author: Eugene Steinberg
 * Date: 9/27/14
 */
public enum LanguageDescriptor {
    INSTANCE;

    public static final String IDEA_PARTIAL_RENDER = "idea.partialRender";
    public static final String IDEA_DISABLE_SYNTAX_CHECK = "idea.disableSyntaxCheck";

    public static final String TAGS = "wire|bpm|uml|dot|jcckit|ditaa|project|salt|flow|creole|tree|cute|math|latex|def|gantt|nwdiag|mindmap|wbs|json|git|board|yaml|hcl|ebnf|regex|files|chronology|chen";

    public final List<String> types = Collections.unmodifiableList(Arrays.asList(
            "actor",
            "participant",
            "usecase",
            "class",
            "interface",
            "abstract",
            "enum",
            "component",
            "state",
            "object",
            "artifact",
            "folder",
            "rectangle",
            "node",
            "frame",
            "cloud",
            "database",
            "storage",
            "agent",
            "stack",
            "boundary",
            "control",
            "entity",
            "card",
            "file",
            "package",
            "queue",
            "archimate",
            "diamond",
            "detach"
    ));

    public final List<String> tags = Collections.unmodifiableList(Arrays.asList(
            "@startwire",
            "@startbpm",
            "@startuml",
            "@startdot",
            "@startjcckit",
            "@startditaa",
            "@startproject",
            "@startsalt",
            "@startflow",
            "@startcreole",
            "@starttree",
            "@startcute",
            "@startmath",
            "@startlatex",
            "@startdef",
            "@startgantt",
            "@startnwdiag",
            "@startmindmap",
            "@startwbs",
            "@startjson",
            "@startgit",
            "@startboard",
            "@startyaml",
            "@starthcl",
            "@startebnf",
            "@startregex",
            "@startfiles",
            "@startchronology",
            "@startchen",
            "@endwire",
            "@endbpm",
            "@enduml",
            "@enddot",
            "@endjcckit",
            "@endditaa",
            "@endproject",
            "@endsalt",
            "@endflow",
            "@endcreole",
            "@endtree",
            "@endcute",
            "@endmath",
            "@endlatex",
            "@enddef",
            "@endgantt",
            "@endnwdiag",
            "@endmindmap",
            "@endwbs",
            "@endjson",
            "@endgit",
            "@endboard",
            "@endyaml",
            "@endhcl",
            "@endebnf",
            "@endregex",
            "@endfiles",
            "@endchronology",
            "@endchen"
    ));

    public final List<String> keywords2 = Collections.unmodifiableList(Arrays.asList(
            "as",
            "also",
            "of",
            "on",
            "is"
    ));

    public final List<String> functions = Collections.unmodifiableList(Arrays.asList(
            "%and",
            "%call_user_func",
            "%chr",
            "%darken",
            "%date",
            "%dec2hex",
            "%eval",
            "%dirpath",
            "%false",
            "%feature",
            "%file_exists",
            "%filename",
            "%function_exists",
            "%get_json_keys",
            "%get_json_type",
            "%get_variable_value",
            "%getenv",
            "%hex2dec",
            "%hsl_color",
            "%intval",
            "%invoke_procedure",
            "%is_dark",
            "%is_light",
            "%json_key_exists",
            "%lighten",
            "%load_json",
            "%loadJSON",
            "%lower",
            "%nand",
            "%newline",
            "%nor",
            "%not",
            "%now",
            "%nxor",
            "%or",
            "%retrieve_procedure",
            "%reverse_color",
            "%reverse_hsluv_color",
            "%set_variable_value",
            "%size",
            "%splitstr",
            "%string",
            "%strlen",
            "%strpos",
            "%substr",
            "%true",
            "%upper",
            "%variable_exists",
            "%version",
            "%xor"
    ));

    public final List<String> keywords = Collections.unmodifiableList(Arrays.asList(
            "autonumber",
            "caption",
            "title",
            "newpage",
            "box",
            "alt",
            "else",
            "opt",
            "loop",
            "par",
            "break",
            "critical",
            "note",
            "rnote",
            "hnote",
            "legend",
            "group",
            "left",
            "right",
            "link",
            "over",
            "end",
            "activate",
            "deactivate",
            "destroy",
            "create",
            "footbox",
            "hide",
            "show",
            "skinparam",
            "skin",
            "top",
            "bottom",
            "top to bottom direction",
            "package",
            "namespace",
            "page",
            "up",
            "down",
            "if",
            "else",
            "elseif",
            "endif",
            "partition",
            "footer",
            "endfooter",
            "header",
            "endheader",
            "center",
            "rotate",
            "ref",
            "return",
            "repeat",
            "start",
            "stop",
            "while",
            "endwhile",
            "fork",
            "again",
            "kill",
            "order",
            "allow_mixing",
            "allowmixing",
            "mainframe",
            "across",
            "stereotype",
            "split",
            "style",
            "sprite",
            "circle",
            "empty",
            "members",
            "description",
            "true",
            "false",
            "normal",
            "italic",
            "bold",
            "plain",
            "color",
            "dotted",
            "dashed",
            "bold",
            "map",
            "function",
            "procedure"
    ));

    public final List<String> pluginSettingsPattern = Collections.unmodifiableList(Arrays.asList(
            IDEA_PARTIAL_RENDER,
            IDEA_DISABLE_SYNTAX_CHECK
    ));

    public final List<String> preproc = Collections.unmodifiableList(Arrays.asList(
            "!exit",
            "!include",
            "!theme",
            "!pragma",
            "!define",
            "!undef",
            "!if",
            "!ifdef",
            "!endif",
            "!ifndef",
            "!else",
            "!definelong",
            "!enddefinelong",
            "!function",
            "!procedure",
            "!endfunction",
            "!endprocedure",
            "!unquoted",
            "!return",
            "!startsub",
            "!endsub",
            "!assert",
            "!log",
            "!local",
            "!dump_memory",
            "!import"
    ));
}
