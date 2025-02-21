package main.java.com.semicolon.africa.model;

import java.util.ArrayList;

public class Person {
    //private String problemName;
    private int currentId = 1;
    private final ArrayList<Problem> problems = new ArrayList<>();

    public void addProblem(String problemName, ProblemType type) {
        problems.add(new Problem(currentId++, problemName, type));
    }

    public Problem findProblemBy (int uniqueId) {
        for (Problem problem : problems) {
            if (problem.isProblem(uniqueId))
                return problem;
        }
        throw new RuntimeException("Problem not found");
    }

    public void solve(int uniqueId) {
        findProblemBy(uniqueId).solve();
    }

    public ArrayList<Problem> showUnsolvedProblems() {
        ArrayList<Problem> unsolvedProblems = new ArrayList<>();
        for (Problem problem : problems) {
            if(!problem.isSolved())
                unsolvedProblems.add(problem);
        }
        return unsolvedProblems;
    }
}
