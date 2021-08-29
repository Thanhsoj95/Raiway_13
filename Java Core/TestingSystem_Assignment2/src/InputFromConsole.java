import java.time.LocalDate;
import java.util.Scanner;

public class InputFromConsole {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//	// Question 1:
//		System.out.println("Mời bạn nhập vào 3 số nguyên ");
//		System.out.println("Nhập vào số thứ nhất: ");
//		int i1 = scanner.nextInt();
//
//		System.out.println("Nhập vào số thứ hai: ");
//		int i2 = scanner.nextInt();
//
//		System.out.println("Nhập vào số thứ ba: ");
//		int i3 = scanner.nextInt();
//
//		System.out.println("Bạn vừa nhập vào các số nguyên: " + i1 + " " + i2 + " " + i3);
//		
//	// Question 2:
//		System.out.println("Mời bạn nhập vào 2 số thực ");
//		System.out.println("Nhập vào số thứ nhất: ");
//		float j1 = scanner.nextFloat();
//		
//		System.out.println("Nhập vào số thứ hai: ");
//		float j2 = scanner.nextFloat();
//		scanner.nextLine();
//		
//		System.out.println("Bạn vừa nhập vào các số thực " + j1 + " " + j2);
//		
//	// Question 3:
//		System.out.println("Mời bạn nhập vào họ: ");
//		String u1 = scanner.next();
//		
//		System.out.println("Mời bạn nhập vào tên: ");
//		String u2 = scanner.nextLine();
//		
//		System.out.println("Họ và tên của bạn là: " + u1 + " " + u2);
//	
//	// Question 4:
//		System.out.println("Mời bạn nhập vào năm sinh: ");
//		int y = scanner.nextInt();
//		
//		System.out.println("Mời bạn nhập vào tháng sinh: ");
//		int m = scanner.nextInt();
//		
//		System.out.println("Mời bạn nhập vào ngày sinh: ");
//		int d = scanner.nextInt();
//		
//		LocalDate dateBirth = LocalDate.of(y, m, d);
////		System.out.println("Ngày sinh nhật của bạn là: " + dateBirth);
//
//		// Question 5:
//		createAccount();

		// Question 6:
		createDepartment();
	}

//	public static void createAccount() {
//		Scanner scanner = new Scanner(System.in);
//		Account account = new Account();
//
//		System.out.println("-----------------CREATE ACCOUNT-----------------");
//		System.out.println("Mời bạn nhập vào id:");
//		account.id = scanner.nextShort();
//		scanner.nextLine();
//
//		System.out.println("Mời bạn nhập vào email:");
//		account.email = scanner.nextLine();
//
//		System.out.println("Mời bạn nhập vào username:");
//		account.username = scanner.nextLine();
//
//		System.out.println("Mời bạn nhập vào fullname:");
//		account.fullname = scanner.nextLine();
//
//		boolean isDepartmentName = false;
//		do {
//			System.out.println("Mời bạn nhập vào tên department:");
//			String departmentName = scanner.nextLine();
//
//			Department[] departments = inputDepartments();
//			for (Department department : departments) {
//				if (departmentName.equals(department.name)) {
//					account.department = department;
//					isDepartmentName = true;
//					break;
//				}
//			}
//
//			if (isDepartmentName == false) {
//				System.out.println("Tên phòng ban bạn nhập chưa đúng, mời bạn nhập lại!");
//			}
//		} while (isDepartmentName == false);
//
//		boolean isPositonName = false;
//		do {
//			System.out.println("Mời bạn nhập vào tên position:");
//			String positionName = scanner.nextLine();
//
//			Position[] positions = inputPositions();
//			for (Position position : positions) {
//				if (positionName.equals(position.name.toString())) {
//					account.position = position;
//					isPositonName = true;
//					break;
//				}
//			}
//
//			if (isPositonName == false) {
//				System.out.println("Tên chức vụ bạn nhập chưa đúng, mời bạn nhập lại!");
//			}
//		} while (isPositonName == false);
//		
//		account.createDate = LocalDate.now();
//		account.groups = null;
//
//		System.out.println("Tạo thành công!");
//
//	}
//
	public static Department[] inputDepartments() {
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Marketing";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "Nhân sự";

		Department department4 = new Department();
		department4.id = 4;
		department4.name = "Kỹ Thuật";

		Department department5 = new Department();
		department5.id = 5;
		department5.name = "Kế Toán";

		Department[] departments = { department1, department2, department3, department4, department5 };

		return departments;
	}

	public static Position[] inputPositions() {
		Position position1 = new Position();
		position1.id = 1;
		position1.name = PositionName.DEV;

		Position position2 = new Position();
		position2.id = 2;
		position2.name = PositionName.TEST;

		Position position3 = new Position();
		position3.id = 3;
		position3.name = PositionName.SCRUM_MASTER;

		Position position4 = new Position();
		position4.id = 4;
		position4.name = PositionName.PM;

		Position[] positions = { position1, position2, position3, position4 };

		return positions;
	}

	public static void createDepartment() {
		Scanner scanner = new Scanner(System.in);
		Department[] departments = inputDepartments();

		boolean isdepartmentid;
		int id;

		System.out.println("-----------------CREATE DEPARTMENT-----------------");

		do {
			isdepartmentid = false;

			System.out.println("Mời bạn nhập vào id:");
			id = scanner.nextByte();
			scanner.nextLine();

			for (Department department : departments) {
				if (id == department.id) {
					isdepartmentid = true;
					break;
				}
			}

			if (isdepartmentid == true) {
				System.out.println("Id phòng ban bạn nhập đã tồn tại, mời bạn nhập lại!");
			}
		} while (isdepartmentid == true);

		boolean isdepartmentName;
		String name;
		do {
			isdepartmentName = false;
			System.out.println("Mời bạn nhập vào tên phòng ban:");
			name = scanner.nextLine();

			for (Department department : departments) {
				if (name.equals(department.name)) {
					isdepartmentName = true;
					break;
				}
			}
			if (isdepartmentName == true) {
				System.out.println("Tên phòng ban bạn nhập đã tồn tại, mời bạn nhập lại!");
			}
		} while (isdepartmentName == true);

		System.out.println("Tạo thành công!");

	}
}
