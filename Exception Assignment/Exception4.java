4)define a class called as "Item" (Item.java)
with members
String itemid;
String name;
int cost;

parameterized constructor which will accept above details at the time
of creating object.
	member function
void display()
which will display all the details of product
create instances of this class and call the method display.



package Exception;

class Item
{
	String itemid;
	String name;
	int cost;
	Item(String itemid,String name,int cost)
	{
		this.itemid=itemid;
		this.name=name;
		this.cost=cost;
	}
	public void display()
	{
		System.out.println("Itemid is"+" "+itemid);
		System.out.println("Name is"+" "+name);
		System.out.println("Cost is"+" "+cost);
	}
}
public class Exception4 
{

	public static void main(String[] args) 
	{
		Item i=new Item("101","Water",500);
		i.display();
	}

}