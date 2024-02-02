package cotainment;

public class Library {

	public static void main(String[] args) {
		Author a1=new Author(101,"Ravindranath");
		Author a2=new Author(101,"sunita ");
		Author a3=new Author(101,"A P Rao");
		
		Book b1=new Book(1,"marathi",a1);
		Book b2=new Book(2,"hindi",a2);
		Book b3=new Book(3,"English",a3);
		Book b4=new Book(4,"Sanskrit",a3);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b3);
		System.out.println("-------------------");
		
		Book b5=new Book(1,"mathmatics",new Author(103,"A p jain"));
		Book b6=new Book(2,"Science",new Author(104,"A M kaor"));
		Book b7=new Book(3,"math",new Author(103,"sunita"));
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7);
		System.out.println("-------------------");
		
		Book b8=new Book();
		b8.setBid(111);
		b8.setBname("marathi");
		b8.setAuthor(new Author(222,"Somvanshi"));
		System.out.println(b8);
		System.out.println("-------------------");
		
		//System.out.println(get);

	}

}
