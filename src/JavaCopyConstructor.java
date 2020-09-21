public class JavaCopyConstructor {

    int id;
    String name;

    public JavaCopyConstructor(int id,String name){
        this.id=id;
        this.name=name;
    }


    JavaCopyConstructor(){
        System.out.println("Id : "+id+" Name : "+name);
    }

    void display(){
        System.out.println("Id : "+id+" Name : "+name);
    }

    public static void main(String[] args) {
        JavaCopyConstructor j1=new JavaCopyConstructor(1,"Abhijeet");
        JavaCopyConstructor j2=new JavaCopyConstructor();
        j2.id=j1.id;
        j2.name=j1.name;
        j2.display();

    }
}
