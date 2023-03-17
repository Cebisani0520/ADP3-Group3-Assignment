/** BookClass.java
 * This is a POJO class
 * This class is immutable (objects should not be changed)
 * Cebisani Lamani (219104409)
 * 11 March 2023 */
package za.ac.cput.domain;

public class BookClass {
    private String isbnNum;
    private String bookName;
    private String authorName;
    private String authorSurname;
    private String category;
    private double bookPrice;

    private String authorEmail;

    public BookClass(){}

    //Builder constructor
    public BookClass(Builder builder){
        this.isbnNum = builder.isbnNum;
        this.bookName = builder.bookName;
        this.authorName = builder.authorName;
        this.authorSurname = builder.authorSurname;
        this.category = builder.category;
        this.bookPrice = builder.bookPrice;
        this.authorEmail = builder.authorEmail;
    }

    public String getIsbnNum() {
        return isbnNum;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public String getCategory() {
        return category;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbnNum='" + isbnNum + '\'' +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorSurname='" + authorSurname + '\'' +
                ", category='" + category + '\'' +
                ", bookPrice=" + bookPrice +
                ", authorEmail='" + authorEmail + '\'' +
                '}';
    }
    public static class Builder {
        private String isbnNum;
        private String bookName;
        private String authorName;
        private String authorSurname;
        private String category;
        private double bookPrice;
        private String authorEmail;

        public Builder setIsbnNum(String isbnNum) {
            this.isbnNum = isbnNum;
            return this;
        }

        public Builder setBookName(String bookName) {
            this.bookName = bookName;
            return this;
        }

        public Builder setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }

        public Builder setAuthorSurname(String authorSurname) {
            this.authorSurname = authorSurname;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setBookPrice(double bookPrice) {
            this.bookPrice = bookPrice;
            return this;
        }

        public Builder setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public Builder copy(BookClass bookClass){
            this.isbnNum = bookClass.isbnNum;
            this.bookName = bookClass.bookName;
            this.authorName = bookClass.authorName;
            this.authorSurname = bookClass.authorSurname;
            this.category = bookClass.category;
            this.bookPrice = bookClass.bookPrice;
            this.authorEmail = bookClass.authorEmail;
            return this;
        }
        public BookClass build(){return new BookClass(this);}
    }
}
