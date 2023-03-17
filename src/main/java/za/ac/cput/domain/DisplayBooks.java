/**
 * Aquilla Williams
 * 217284205
 */

package za.ac.cput.domain;


public class DisplayBooks {

 private  String isbnNo;
 private String bookAuthor;
 private String bookName;

 private String student;

 public DisplayBooks() {
 }

 public DisplayBooks(String isbnNo, String bookAuthor, String bookName, String student) {
  this.isbnNo = isbnNo;
  this.bookAuthor = bookAuthor;
  this.bookName = bookName;
  this.student = student;

}

// getters
public String getIsbnNo(){
  return isbnNo;
 }

 public String getBookAuthor(){
  return bookAuthor;
 }
 public String getBookName(){
  return bookName;
 }
 public String getStudent(){
  return student;
 }

 //setters
 public void setIsbnNo(String isbnNo){
  this.isbnNo = isbnNo;
 }

 public void setBookAuthor(String bookAuthor){
  this.bookAuthor = bookAuthor;
 }
 public void setBookName(String bookName){
  this.bookName = bookName;
 }
 public void setStudent(String student){
  this.student = student;
 }

 @Override
 public String toString() {
  return "DisplayBook{" + "isbnNo=" + isbnNo + ", bookAuthor=" +  bookAuthor+ ", bookName=" + bookName + ", student=" + student +  '}';
 }


}



