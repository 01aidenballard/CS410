

class StateTranstionTable {

    // character columns
    public static final int LETTER = 0;   // a-z, A-Z
    public static final int DIGIT = 1;    // 0-9
    public static final int DOT = 2;      // . (for floats)
    public static final int PLUS = 3;     // +
    public static final int MINUS = 4;    // -
    public static final int STAR = 5;     // *
    public static final int SLASH = 6;    // /
    public static final int EQUAL = 7;    // =
    public static final int LESS = 8;     // <
    public static final int GREATER = 9;  // >
    public static final int BANG = 10;    // !
    public static final int LPAREN = 11;  // (
    public static final int RPAREN = 12;  // )
    public static final int WS = 13;      // whitespace
    public static final int IF_KWD = 14;   // if keyword
    public static final int ELSE_KWD = 15; // else keyword
    public static final int ELIF_KWD = 16; // elif keyword
    public static final int WHILE_KWD = 17; // while keyword
    public static final int FOR_KWD = 18; // for keyword
    public static final int IN_KWD = 19; // in keyword
    public static final int VAR_IDF = 20; // variable identifier
    public static final int NUM_LIT = 21; // numeric literal
    public static final int FLT_LIT = 22; // float literal
    public static final int COL_OTHER = 23;   // Ccatch-all for invalid characters

    public static void main() {

            // scanner logic\
                // follow fsm, (i.e if character is "i", check next character if it is "f" then it is a keyword, else it is an identifier)
                
    }

    // helper function
    public int getColumn(char c) {
        if (Character.isLetter(c)) return LETTER;
        if (Character.isDigit(c)) return DIGIT;
        if (Character.isWhitespace(c)) return WS;
        
        switch (c) {
            case '.': return DOT;
            case '+': return PLUS;
            case '-': return MINUS;
            case '*': return STAR;
            case '/': return SLASH;
            case '=': return EQUAL;
            case '<': return LESS;
            case '>': return GREATER;
            case '!': return BANG;
            case '(': return LPAREN;
            case ')': return RPAREN;
            default:  return OTHER;
        }
}


}