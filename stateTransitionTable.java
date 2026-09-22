

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
    public static final int COL_OTHER = 14;   // Ccatch-all for invalid characters

    public static void main() {

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