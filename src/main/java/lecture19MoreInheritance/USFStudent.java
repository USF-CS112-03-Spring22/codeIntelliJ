package lecture19MoreInheritance;

public class USFStudent extends USFPerson {
    private String program; // Bachelors or Masters
    private String transcript;

    public USFStudent(String name, int id, String program, String transcript) {
        super(name, id);
        this.program = program;
        this.transcript = transcript;
    }

    public void updateTranscript(String courseTitle, double grade) {
        transcript = transcript + courseTitle + ": " +  grade + System.lineSeparator();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Program: " + program);
        System.out.println(transcript);
    }

}
