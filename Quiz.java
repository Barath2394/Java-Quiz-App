import java.util.Scanner;

public class Quiz{
    public static void main(String[] args) {
        QuestionService service = new QuestionService();
        service.playQuiz();
        service.printScore();
    }
}
class QuestionService{
    Questions[] question = new Questions[5];
    String[] selection = new String[5];
    public QuestionService(){
        question[0] = new Questions(1,"Size of int","2","6","4","4");
        question[1] = new Questions(2,"Size of double","2","6","8","8");
        question[2] = new Questions(3,"Size of char","1","4","2","2");
        question[3] = new Questions(4,"Size of long","4","8","16","8");
        question[4] = new Questions(5,"Size of boolean","1","4","8","1");

    }
    public void playQuiz(){
        int i = 0;
        for (Questions q : question){
            System.out.println("Question");
            System.out.println(q.getId() + "." + q.getQn());
            System.out.println("Options : ");
            System.out.println("a. " +q.getOpt1());
            System.out.println("b. " + q.getOpt2());
            System.out.println("c. " + q.getOpt3());
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your answer : ");
            selection[i] = sc.nextLine();
            i ++;
            System.out.println("----------------------------------------------");
        }
        for (String s : selection){
            System.out.println(s);
        }
    }
    public void printScore(){
        int score = 0;
        for (int i=0;i<question.length;i++){
            Questions que = question[i];
            String actualAnswer = que.getAns();
            String userAnswer = selection[i];

            if(actualAnswer.equals(userAnswer)){
                score ++;
            }
        }
        System.out.println("Your score is : " + score);
    }

}
class Questions{
    private int id;
    private String qn;
    private String opt1;
    private String opt2;
    private String opt3;
    private String ans;
    public void setId(int id) {
        this.id = id;
    }
    public Questions(int id,String qn,String opt1,String opt2,String opt3,String ans){
        this.id= id;
        this.qn = qn;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.ans = ans;
    }
    public void setQn(String qn) {
        this.qn = qn;
    }

    public void setOpt1(String opt1){
        this.opt1 = opt1;
    }
    public void setOpt2(String opt2){
        this.opt2 = opt2;
    }
    public void setOpt3(String opt3){
        this.opt3 = opt3;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public String getQn() {
        return qn;
    }

    public int getId() {
        return id;
    }

    public String getOpt1() {
        return opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public String getOpt3() {
        return opt3;
    }


    public String getAns() {
        return ans;
    }
    public String toString(){
        return "Question [id = " + id + ", question = " + qn + ",opt1 = " + opt1 + ",opt2 = " + opt2 + ",opt3 = "
        + opt3 + ",answer " + ans + "]";
    }
}
