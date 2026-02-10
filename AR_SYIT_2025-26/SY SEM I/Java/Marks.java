class Students{
int phy = 78;
int chem = 75;
int math = 88;
}
class Sem1 extends Students{
int display(){
return phy+chem+math/3;
}
}
public class Mark{
public static void main(String[] args){
Sem1 s = new Sem1();
int a = s.display();
System.out.println(a);

}
}