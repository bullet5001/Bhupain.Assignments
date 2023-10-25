package assignmentOops.Assi1.Assin2;

public class Soccer extends Sports {
    int n=11;
    @Override
    public String getName() {
        return "This Is Soccor Class";
    }

    @Override
    public void getNumberOfMember() {
        System.out.println("There Are " +this.n+ " Players in "+ this.getName());
    }
}
