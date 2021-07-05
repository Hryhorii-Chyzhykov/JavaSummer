package code;

/**
 * Contains regular expressions.
 */
public interface GlobalConstants {
    String NAME_PATTERN = "[A-Z][a-z]{2,}";
    String SURNAME_PATTERN = "[A-Z][a-z]{2,}";
    String PATRONYMIC_PATTERN = "[A-Z][a-z]{2,}";
    String NICK_PATTERN = "[a-zA-Z](.[a-zA-Z0-9_-]*)";
    String COMMENT_PATTERN = "[a-zA-Z](.[a-zA-Z0-9_-]*)";
}
