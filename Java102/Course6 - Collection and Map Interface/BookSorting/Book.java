package BookSorting;

public class Book implements Comparable<Book>{
    private String bookName;
    private String writerName;
    private int pageOfNumber;
    private int releaseDate;

    public Book(String bookName, String writerName, int pageOfNumber, int releaseDate) {
        this.bookName = bookName;
        this.writerName = writerName;
        this.pageOfNumber = pageOfNumber;
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Book cBook) {
        return this.bookName.compareTo(cBook.getBookName());
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriterName() {
        return this.writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public int getPageOfNumber() {
        return this.pageOfNumber;
    }

    public void setPageOfNumber(int pageOfNumber) {
        this.pageOfNumber = pageOfNumber;
    }

    public int getReleaseDate() {
        return this.releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
}
