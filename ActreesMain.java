class ActreesMain 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		
		Actrees A1=new Actrees("sai",25,9,6,3);
		A1.Display();
	}
}
class Actrees
{
	String name;
	int age,no_of_movies,no_of_hits,no_of_flops;

	public Actrees(String name,int age,int no_of_movies,int no_of_hits,int no_of_flops)
	{
		this.name=name;
		this.age=age;
		this.no_of_movies=no_of_movies;
		this.no_of_hits=no_of_hits;
		this.no_of_flops=no_of_flops;
	}
	public void Display()
	{
		System.out.print("Name of acter - "+name+"\tAge - "+age+"\tNumber of Movies"+no_of_movies+"\tNumber of Hits - "+no_of_hits+"\tNumber of flops - "+no_of_flops);
	}
}