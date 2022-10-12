package methodref;

public class Test {

	public static void main(String[] args) {
		School sch=new School();
		Noteable nt=sch::noteLecture;
		nt.note("Lecture");
		
		Noteable nt1=sch::noteObservation;
		nt1.note("note");

		Noteable nt2=sch::noteOnlineClass;
		nt2.note("online");
		
		School mySchool=new School();
		mySchool.noteLecture("lecture");
		mySchool.noteObservation("lecture");
		mySchool.noteOnlineClass("lecture");
	}

}
