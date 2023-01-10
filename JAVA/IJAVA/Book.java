//understanding the concept of compareto();

class Book implements Comparable {

    String name;
    int id;
    double price;

    Book(String s, int i, double p) {
        this.name = s;
        this.id = i;
        this.price = p;
    }

    public String toString() {
        return " Book name = "+name+" Book id = "+id+" Book price = "+price+"\n" ;
    }
    public int compareTo(Object o){
        Book b = (Book)o;
        if(this.price>b.price)
            return 1;
        else if(this.price<b.price)
            return -1;
            else
                return 0;

    }

}
