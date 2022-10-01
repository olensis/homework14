public class Book {
    private int yearOfPublication;
    private String publisherName;

    public Book (String publisherName, int yearOfPublication) {
        this.publisherName = publisherName;
        this.yearOfPublication = yearOfPublication;


    }
    public String getPublisherName () {
        return this.publisherName;
    }
    public int getYearOfPublication () {
        return this.yearOfPublication;

    }
    public void setYearOfPublication (int yearOfPublication ) {
        this.yearOfPublication = yearOfPublication;

    }

    @Override
    public String toString() {
        return "Год издания " + this.yearOfPublication+ " Название издания " + this.publisherName;
    }
    @Override
    public boolean equals(Object other) {
        if (this.yearOfPublication != this.yearOfPublication) {
            return false;

        }else if (this.publisherName != this.publisherName);
        return false;

    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(publisherName, yearOfPublication );
    }
}
