package br.com.felipezorzo.sonar.plsql.api;

import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.api.TokenType;

public enum PlSqlTokenType implements TokenType {
    NUMERIC_LITERAL;

    public String getName() {
        return name();
    }

    public String getValue() {
        return name();
    }

    public boolean hasToBeSkippedFromAst(AstNode node) {
        return false;
    }
}