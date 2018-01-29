public class Book{
  
 //attribute
  private String title;
  private int numOfPage;
  
  public Book()
  {
    
  }
  
  public Book(String title)
  {
    this.title = title;
  }
  
  public Book(String title,int numOfPage)
  {
    this.title = title;
    this.numOfPage = numOfPage;
  }
  
  public String getTitle()
  {
    return this.title;
  }
  
  public void setTitle(String title)
  {
    this.title = title;
  }
  
  public Int getNumOfPage()
  {
    return this.numOfPage();
  }
  
  public void setNumOfPage(int numOfPage)
  {
    this.numOfPage = numOfPage;
  }
  
  public boolean compareBook(Book book)
  {
    return this.title==book.title && this.numOfPage==book.numOfPage;
  }
  
}