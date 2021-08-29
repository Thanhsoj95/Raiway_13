import java.time.LocalDate;

public class Question {
	short				id;
	String				content;
	CategoryQuestion	category;				
	TypeQuestion		type;
	Account				creator;
	LocalDate			createDate;
	Exam[]				exams;
}
