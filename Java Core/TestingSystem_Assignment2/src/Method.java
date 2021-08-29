import java.time.LocalDate;

public class Method {

	public static void main(String[] args) {

		//Question 1:
		insochannhohon10();
		
		//Question 2:
		Account[] account1 = inputAccounts();
		printAccounts(account1);
		
		//Question 3:
		insonguyenduongnhohon10();
	}

	public static void insochannhohon10() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

	public static void printAccounts(Account[] accounts) {
		for (Account account : accounts) {
			System.out.println(account.id);
			System.out.println(account.username);
			System.out.println(account.fullname);
			System.out.println("Các group account này tham gia:");
			for (Group group : account.groups) {
				System.out.println(group.name);
			}
		}
	}
	
	public static Account[] inputAccounts() {
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "vanhientk111@gmail.com";
		account1.username = "hien.nguyenvan";
		account1.fullname = "Nguyễn Văn Hiến";
		account1.createDate = LocalDate.now();

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "phuong.nguyen93@gmail.com";
		account2.username = "phuong.nguyen93";
		account2.fullname = "Nguyễn Thị Thu Phương";
		account2.createDate = LocalDate.now();

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "duynn03@gmail.com";
		account3.username = "duy.nguyenngoc";
		account3.fullname = "Nguyễn Ngọc Duy";
		account3.createDate = LocalDate.now();

		Account account4 = new Account();
		account4.id = 4;
		account4.email = "hoaithanh95@gmail.com";
		account4.username = "hoai.thanh";
		account4.fullname = "Nguyễn Hoài Thanh";
		account4.createDate = LocalDate.now();

		Account account5 = new Account();
		account5.id = 5;
		account5.email = "t.anh@gmail.com";
		account5.username = "tuananh";
		account5.fullname = "Đặng Tuấn Anh";
		account5.createDate = LocalDate.now();

		// Tạo các group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Kinh Doanh";
		group1.creator = account3;
		group1.createDate = LocalDate.now();

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Sáng Tạo";
		group2.creator = account2;
		group2.createDate = LocalDate.now();

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Thiết Kế";
		group3.creator = account1;
		group3.createDate = LocalDate.now();

		Group group4 = new Group();
		group4.id = 4;
		group4.name = "Team Building";
		group4.creator = account4;
		group4.createDate = LocalDate.now();

		Group group5 = new Group();
		group5.id = 5;
		group5.name = "Du Lịch";
		group5.creator = account4;
		group5.createDate = LocalDate.now();

		Group[] groupsOfAccount1 = { group1, group3 };
		account1.groups = groupsOfAccount1;

		Group[] groupsOfAccount2 = { group2 };
		account2.groups = groupsOfAccount2;

		Group[] groupsOfAccount3 = { group1, group2, group3 };
		account3.groups = groupsOfAccount3;

		Group[] groupsOfAccount4 = { group1, group4, group5 };
		account4.groups = groupsOfAccount4;

		Account[] accountsOfGroup1 = { account1, account3, account4 };
		group1.accounts = accountsOfGroup1;

		Account[] accountsOfGroup2 = { account2, account3 };
		group2.accounts = accountsOfGroup2;

		Account[] accountsOfGroup3 = { account1, account3 };
		group3.accounts = accountsOfGroup3;

		Account[] accountsOfGroup4 = { account4 };
		group3.accounts = accountsOfGroup4;
		
		Account[] accounts = {account1, account2, account3, account4, account5};
		
		return accounts;
	}
	
	public static void insonguyenduongnhohon10() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
		}
	}
}
