package com.Polymorphism05CasePlayer.domain;

public class PingpongCoach extends Coach implements learningEnglish{
    public void coach(){
        System.out.println("coaching PingPong");
    }

    @Override
    public void learnEnglish() {
        System.out.println("Pingpong coach is learning English");
    }
}
