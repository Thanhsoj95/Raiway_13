import java.time.LocalDate;

public class Exam {
	short				id;
	String				code;
	String				title;
	CategoryQuestion	category;
	short				duration;
	Account				creator;
	LocalDate			createDate;
	Question[]			questions;
}
