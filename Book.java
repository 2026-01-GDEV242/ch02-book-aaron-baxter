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
    public String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
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
    //Part of Exercise 2.85
    public int getPages()
    {
        return pages;
    }
    //Exercise 2.88
    public String getRefNumber()
    {
        return refNumber;
    }
    public void setRefNumber(String ref)
    {
        refNumber = ref;
    }
    //Exercise 2.84
    public void printAuthor()
    {
        System.out.println("Author: " + author);
    }
    public void printTitle() 
    {
        System.out.println("Title: " + title);
    }
    //Exercise 2.86 - Immutability means that the properties cannot be updated. Yes, these properties are immutable.
    //Exercise 2.87
    public void printDetails()
    {
        System.out.println("Title: " + title + ", Author: " + author
                                    + ", Pages: " + pages);
    
        if (refNumber.length() > 0)
        {
            System.out.println("Reference number: " + refNumber);
        }
        else
        {
            System.out.println("ZZZ");
        }                        
    }
}