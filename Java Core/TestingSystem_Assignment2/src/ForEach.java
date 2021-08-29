
import java.time.LocalDate;

public class ForEach {

	public static void main(String[] args) {
		// Tạo các phòng ban
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

		// Tạo các vị trí
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

		// Tạo các nhân viên
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "vanhientk111@gmail.com";
		account1.username = "hien.nguyenvan";
		account1.fullname = "Nguyễn Văn Hiến";
		account1.department = department4;
		account1.position = position1;
		account1.createDate = LocalDate.now();

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "phuong.nguyen93@gmail.com";
		account2.username = "phuong.nguyen93";
		account2.fullname = "Nguyễn Thị Thu Phương";
		account2.department = department3;
		account2.position = position2;
		account2.createDate = LocalDate.now();

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "duynn03@gmail.com";
		account3.username = "duy.nguyenngoc";
		account3.fullname = "Nguyễn Ngọc Duy";
		account3.department = department4;
		account3.position = position1;
		account3.createDate = LocalDate.now();

		Account account4 = new Account();
		account4.id = 4;
		account4.email = "hoaithanh95@gmail.com";
		account4.username = "hoai.thanh";
		account4.fullname = "Nguyễn Hoài Thanh";
		account4.department = department1;
		account4.position = position3;
		account4.createDate = LocalDate.now();

		Account account5 = new Account();
		account5.id = 5;
		account5.email = "t.anh@gmail.com";
		account5.username = "tuananh";
		account5.fullname = "Đặng Tuấn Anh";
		account5.department = department2;
		account5.position = position4;
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

		// Tạo TypeQuestion
		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.id = 1;
		typeQuestion1.name = TypeName.ESSAY;

		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.id = 2;
		typeQuestion2.name = TypeName.MULTIPLE_CHOICE;

		// Tạo CategoryQuestion
		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.id = 1;
		categoryQuestion1.name = "Java";

		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.id = 2;
		categoryQuestion2.name = "Python";

		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.id = 3;
		categoryQuestion3.name = ".Net";

		CategoryQuestion categoryQuestion4 = new CategoryQuestion();
		categoryQuestion4.id = 4;
		categoryQuestion4.name = "C++";

		CategoryQuestion categoryQuestion5 = new CategoryQuestion();
		categoryQuestion5.id = 5;
		categoryQuestion5.name = "SQL";

		// Tạo Question
		Question question1 = new Question();
		question1.id = 1;
		question1.content = "Java la gi";
		question1.category = categoryQuestion1;
		question1.type = typeQuestion1;
		question1.creator = account1;
		question1.createDate = LocalDate.now();

		Question question2 = new Question();
		question2.id = 2;
		question2.content = "Python la gi";
		question2.category = categoryQuestion2;
		question2.type = typeQuestion2;
		question2.creator = account2;
		question2.createDate = LocalDate.now();

		Question question3 = new Question();
		question3.id = 3;
		question3.content = ".Net la gi";
		question3.category = categoryQuestion3;
		question3.type = typeQuestion2;
		question3.creator = account3;
		question3.createDate = LocalDate.now();

		Question question4 = new Question();
		question4.id = 4;
		question4.content = "C++ la gi";
		question4.category = categoryQuestion4;
		question4.type = typeQuestion2;
		question4.creator = account4;
		question4.createDate = LocalDate.now();

		Question question5 = new Question();
		question5.id = 5;
		question5.content = "SQL la gi";
		question5.category = categoryQuestion5;
		question5.type = typeQuestion2;
		question5.creator = account5;
		question5.createDate = LocalDate.now();

		// Tạo bảng Answer
		Answer answer1 = new Answer();
		answer1.id = 1;
		answer1.content = "Java la mot ngon ngu lap trinh hien dai, bac cao, huong đoi tuong, bao mat va manh me va la một Platform";
		answer1.question = question1;
		answer1.isCorrect = true;

		Answer answer2 = new Answer();
		answer2.id = 2;
		answer2.content = "Python la ngon ngu lap trinh huong đoi tuong da nang có cau truc dữ liệu cap cao manh me va he thong thu vien lon";
		answer2.question = question2;
		answer2.isCorrect = true;

		Answer answer3 = new Answer();
		answer3.id = 3;
		answer3.content = ".Net la ngon ngu lap trinh huong doi tuong";
		answer3.question = question3;
		answer3.isCorrect = false;

		Answer answer4 = new Answer();
		answer4.id = 4;
		answer4.content = "C++ la mot nen tang su dung de phat trien cac ung dung, website";
		answer4.question = question4;
		answer4.isCorrect = false;

		Answer answer5 = new Answer();
		answer5.id = 5;
		answer5.content = "SQL la mot ngon ngu truy van du lieu";
		answer5.question = question5;
		answer5.isCorrect = true;

		// Tạo bảng exam
		Exam exam1 = new Exam();
		exam1.id = 1;
		exam1.code = "A01";
		exam1.title = "Đề thi java01";
		exam1.category = categoryQuestion1;
		exam1.duration = 90;
		exam1.creator = account1;
		exam1.createDate = LocalDate.now();

		Exam exam2 = new Exam();
		exam2.id = 2;
		exam2.code = "B01";
		exam2.title = "Đề thi Python01";
		exam2.category = categoryQuestion2;
		exam2.duration = 60;
		exam2.creator = account2;
		exam2.createDate = LocalDate.now();

		Exam exam3 = new Exam();
		exam3.id = 3;
		exam3.code = "C01";
		exam3.title = "Đề thi .Net01";
		exam3.category = categoryQuestion3;
		exam3.duration = 60;
		exam3.creator = account1;
		exam3.createDate = LocalDate.now();

		Exam exam4 = new Exam();
		exam4.id = 4;
		exam4.code = "D01";
		exam4.title = "Đề thi C++01";
		exam4.category = categoryQuestion4;
		exam4.duration = 60;
		exam4.creator = account3;
		exam4.createDate = LocalDate.now();

		Exam exam5 = new Exam();
		exam5.id = 5;
		exam5.code = "E01";
		exam5.title = "Đề thi SQL01";
		exam5.category = categoryQuestion5;
		exam5.duration = 120;
		exam5.creator = account2;
		exam5.createDate = LocalDate.now();

		Exam[] examsOfQuestion1 = { exam1 };
		question1.exams = examsOfQuestion1;

		Exam[] examsOfQuestion2 = { exam2 };
		question2.exams = examsOfQuestion2;

		Exam[] examsOfQuestion3 = { exam3 };
		question3.exams = examsOfQuestion3;

		Exam[] examsOfQuestion4 = { exam4 };
		question4.exams = examsOfQuestion4;

		Exam[] examsOfQuestion5 = { exam5 };
		question5.exams = examsOfQuestion5;

		Question[] questionsOfExam1 = { question1 };
		exam1.questions = questionsOfExam1;

		Question[] questionsOfExam2 = { question2 };
		exam1.questions = questionsOfExam2;

		Question[] questionsOfExam3 = { question3 };
		exam1.questions = questionsOfExam3;

		Question[] questionsOfExam4 = { question4 };
		exam1.questions = questionsOfExam4;

		Question[] questionsOfExam5 = { question5 };
		exam1.questions = questionsOfExam5;

		// Question 8:
		Account[] numberofaccount = { account1, account2, account3, account4, account5 };
		for (Account account : numberofaccount) {
			System.out.println(account.email);
			System.out.println(account.fullname);
			System.out.println(account.department.name);
			System.out.println("\n");
		}
		// Question 9:
		Department[] departments = { department1, department2, department3, department4, department5 };
		for (Department department : departments) {
			System.out.println(department.id);
			System.out.println(department.name);
			System.out.println("\n");
		}
	}

}
