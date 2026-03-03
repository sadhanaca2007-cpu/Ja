class Rectangle{
int l,b;
Rectangle(int l,int b){ this.l=l; this.b=b; }
void area(){ System.out.println("Area = "+(l*b)); }
public static void main(String[] args){
Rectangle r=new Rectangle(10,5);
r.area();
}
}