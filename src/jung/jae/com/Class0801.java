package jung.jae.com;

	public class Class0801 {
	public static void main(String[] args) {
	
		
		int num1 = 30;
		int num2 = 50;
		int total = num1 + num2;
		
		//�Ǽ��� ������ ���� �����Ѵ�.
		System.out.println("�Ǽ��� ���ڴ� ���? : " + total + "����");
		
			Storage storage = new Storage();
			storage.num1 = 30;
			storage.num2 = 45;
			
			int total1 = storage.num1 + storage.num2;
			
			System.out.println("�Ǽ��� �����Դ�? : " + total1 + "kg");
			
				Storage str2 = new Storage();
				str2.num1 = 20;
				str2.num2 = 30;
				
				int total2 = str2.num1 + str2.num2;
				
				System.out.println("�Ǽ��� ���ڼ���? : " + total2 + "��");
				
					total2=total2 + storage.num1;
					total2=total2 + storage.num2;
					
					System.out.println("total2 : " + (total2 * storage.num1) + "gg");
		}
}
