package ihablab4;

public class linkmain {

	public static void main(String[] args) {
	linkedlist a = new linkedlist();
	
	a.isempty();
	a.insertatfront(5);
    a.insertatback(7);
    a.insertafter(4,5);
    a.display();
    a.deletefromfront();
    a.deletefromback();
    a.deleteatposition(4);
    System.out.println(a.occurenceNB(4));
    System.out.println(a.evenNBs());
    System.out.println(a.maximum());;
    System.out.println(a.issorted());
    System.out.println(a.average());
    
    
    
    
	}

}
