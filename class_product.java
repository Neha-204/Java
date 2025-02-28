class class_product{
int pcode;
String pname;
int price;
public static void main(String[] args){
class_product pro1=new class_product();
class_product pro2=new class_product();
class_product pro3=new class_product();
pro1.pcode=1213;
pro1.pname="Colgate";
pro1.price=99;
pro2.pcode=1434;
pro2.pname="Fogg";
pro2.price=299;
pro3.pcode=2491;
pro3.pname="Bourborn";
pro3.price=70;
System.out.println(pro1.pcode+": "+pro1.pname +", Price : "+ pro1.price);
System.out.println(pro2.pcode+": "+pro2.pname +", Price : "+ pro2.price);
System.out.println(pro3.pcode+": "+pro3.pname +", Price : "+ pro3.price);
if (pro1.price<pro2.price && pro1.price<pro3.price){
System.out.println(pro1.pname + " has lowest price");
}
else if (pro2.price<pro1.price && pro2.price<pro3.price){
System.out.println(pro2.pname + " has lowest price");
}
else{
System.out.println(pro3.pname + " has lowest price");
}
}}
