package com.bd.score;

import java.util.Arrays;

public class Score {
    private int[] score;

    Score() {
    }

    public int[] getScore() {
        return score;
    }

    public void setScore(int[] score) {
        this.score = score;
    }

    public void show() {
        for (int res : score) {
            System.out.printf("成绩依次" + res + " ");
        }
    }

    public void showAverage() {
        int sum = 0;
        for (int res :
                score) {
            sum += res;
        }
        System.out.println('\n' + "平均分:" + sum/score.length);
    }

    public void showMax() {
        Arrays.sort(score);
        System.out.println("最高分:" + score[score.length-1]);
    }
}
