package main.java.com.semicolon.africa.model;

public class Problem {
    private final int uniqueId;
    private boolean isSolved;
    private String name;
    private ProblemType type;
    
    public Problem(int uniqueId, String name, ProblemType type) {
        this.name = name;
        this.type = type;
        this.uniqueId = uniqueId;
        this.isSolved = false;
    }
    
    public boolean isSolved() {
        return isSolved;
    }
    public void solve() {
        this.isSolved = true;
    }


    //public boolean isProblem(int uniqueId) {
        
    //}
    @Override
    public boolean equals(Object obj) {
        if (!obj.getClass().equals(Problem.class)) {
            return false;
        }
        Problem problem = (Problem) obj;
        return this.uniqueId == problem.uniqueId;
    }
//    Above method is same as below
//    @Override
//    public boolean equals(Object obj) {
//        if(obj instanceof Problem) {
//            return this.uniqueId == problem.uniqueId;
//        }
//        return false;
//    }
}
