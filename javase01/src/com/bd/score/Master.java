package com.bd.score;

public class Master {
    public void start(){
        Score scoreTest = new Score();
        int[] scoreList = {10,30,50,20,100,110,90,80};
        scoreTest.setScore(scoreList);
        scoreTest.show();
        scoreTest.showAverage();
        scoreTest.showMax();
    }
}
