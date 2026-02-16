/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Aaron Baxter
 * @version 2026.02.16
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    public int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, String pages)
    {
        author = bookAuthor;
        title = bookTitle;
    }

    // Add the methods here ...
    //Exercise 2.83
    public String getAuthor()
    {
        return author;
    }
    public String getTitle()
    {
        return title;
    }
    //Exercise 2.84
    public void printAuthor()
    {
        System.out.println("Author: " + author);
    }
    public void printTitle() {
        System.out.println("Title: " + title);
    }
    //Exercise 2.85
    
}
