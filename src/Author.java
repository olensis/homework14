public class Author {
    private String authorSurName;
    private String authorName;

    public Author(String authorName, String authorSurName) {
        this.authorName = authorName;
        this.authorSurName = authorSurName;

    }

    public String getAuthorSurName() {
        return this.authorSurName;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    @Override
    public String toString() {
        return "Имя " + this.authorName + " Фамилия " + this.authorSurName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.authorSurName != this.authorSurName) {
            return false;
        } else if (this.authorName != this.authorName) ;
    return false;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorName, authorSurName );
    }
}

