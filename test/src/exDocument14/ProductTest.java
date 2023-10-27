package exDocument14;

class Product{
	static int count;
	int serialNo;
	
	Product(){
		++count;
		serialNo = count;
	}
}
public class ProductTest {

	public static void main(String[] args) {
	Product p1 = new Product();
	Product p2 = new Product();
	Product p3 = new Product();

	System.out.print("p1 제품번호 : " + p1.serialNo );
	System.out.print("p1 제품번호 : " + p2.serialNo );
	System.out.print("p1 제품번호 : " + p3.serialNo );
	System.out.print("생산된 제품의 총 갯수 :" + Product.count );
	}
	

}
