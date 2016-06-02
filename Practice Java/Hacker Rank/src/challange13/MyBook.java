package challange13;

class MyBook extends Book
{

String title1;
String author1;
int price1;
MyBook(String title,String author,int price)
    {
    super(title,author);
    title1 =   title;
    author1 =  author;
    price1 =  price;
    
}
void display()
    {
    System.out.println("Title: " + title1);
    System.out.println("Author: " + author1);
    System.out.println("Price: " + price1);
    
}
}
