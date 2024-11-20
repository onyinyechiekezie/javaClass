import java.util.Scanner;
public class MyersBQuestionnaire     {
	public static void main(String[] args)  {

	Scanner input = new Scanner(System.in);
	
	
	System.out.println("PLEASE ENTER YOUR NAME: ");
	String name = input.nextLine();

	System.out.println("TO START YOUR MBTI TEST PLS CHOSE OPTION (A OR B )");

         
	
	String[][] questions = {

	{"A.expand energy, enjoy groups"}, {"B.conserve energy, enjoy one-on-one"},
	{"A.interpret literally"}, {"B.looking for meaning and possibilities"},
	{"A.logical, thinking, questioning"}, {"B.empathetic, feeling, accommodating"},
	{"A.organised, orderly"} ,{"B.flexible, adaptable "},
	{"A.more outing, think out loud"}, {"B.more reserved, think of yourself "},
	{"A.candid, straight forward, frank"}, {"B.tactful, kind, encouraging "},
	{"A.plain, schedule"}, {"B.unplanned, spontaneous"},
	{"A.seek many tasks, public activities, interation with others"}, {"B.seek private, solitary activities with quite to concentrate "},
	{"A.standard, usual, conventional"} , {"B.different, novel, unique "},
	{"A.firm, tend to criticize, hold the line"}, {"B.gentle, tend to appreciate, conciliate "},
	{"A.regulated, structured"}, {" B.easy going, live and let live"},
	{"A.external, communicative, express yourself"},{" B.internal, reticent, keep to yourself"},
	{"A.focus on here-and-now"}, {" B.look to the future, global perspective, big picture"},
	{"A.tough-minded, just"}, {" B.tender-hearted, merciful"},
	{"A.preparation, plan ahead"}, {" B.go with the flow, adapt as you go"},
	{"A.active, initiate "}, {" B.eflective, deliberade"},
	{"A.facts, things, What is"} ,{" B. ideas, dreams, What could be, philosophical"},
	{"A.matter of fact, issue-oriented "}, {" B.sensitive, people-oriented, compassion=ate"},
	{"A.control, govern "}, {" B.latitude, freedom"},

       }; 
  
	
      String[] responses = new String[questions.length];

for(int index = 0; index < questions.length; index+=2){
   for(int value = 0; value < questions[index].length; value++){
       System.out.println(questions[index]  [value]+" "+  questions[index + 1]  [value]);
	
       responses[index] = scanner.next();
	

         }   
        }

	switch(responses[0])   {
  case "A": System.out.println( name+ " here are your results  ");
   		System.out.println("EI");
   		break;
  case "B": System.out.println("EI");
   		break;
   		default:
     	    System.out.println("invalid");
   		break;
 } 
  	switch(choice[2]){
  case "A": System.out.println("EI");
   		break;
  case "B": System.out.println("EI");
   		break;
   		default:
     	    System.out.println("invalid");
   		break;

 } 
 	switch(choice[4]){
  case "A": System.out.println("EI");
   		break;
  case "B": System.out.println("EI");
   		break;
  		default:
     	    System.out.println("invalid");
   		break;

 } 
 	switch(choice[6]){
  case "A": System.out.println("EI");
   		break;
  case "B": System.out.println("EI");
   		break;
  		default:
     	    System.out.println("invalid");
   		break;

 } 
 	switch(choice[8]){
  case "A": System.out.println("EI");
   		break;
  case "B": System.out.println("EI");
   		break;
  		default:
            System.out.println("invalid");
   		break;

 } 
 	switch(choice[10]){
  case "A": System.out.println("TF");
   		break;
  case "B": System.out.println("TF");
   		break;
  		default:
     	    System.out.println("invalid");
   		break;

 } 
 	switch(choice[12]){
  case "A": System.out.println("TF");
   		break;
  case "B": System.out.println("TF");
   		break;
  		default:
     	    System.out.println("invalid");
   		break;

 } 
 	switch(choice[14]){
  case "A": System.out.println("TF");
   		break;
  case "B": System.out.println("TF");
   		break;
  		default:
     	    System.out.println("invalid");
   		break;

 } 
 	switch(choice[16]){
  case "A": System.out.println("TF");
   		break;
  case "B": System.out.println("TF");
   		break;
  		default:
     	    System.out.println("invalid");
   		break;

 } 
 	switch(choice[18]){
  case "A": System.out.println("TF");
   		break;
  case "B": System.out.println("TF");
   		break;
  		default:
            System.out.println("invalid");
   		break;

 }

}
}

	
		



	
	
	
	  