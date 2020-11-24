package com.Polymorphism05CasePlayer.domain;

public class PingpongSport extends Sport implements learningEnglish{
    public void sport(){
        System.out.println("playing pingpong");
    }

    @Override
    public void learnEnglish() {
        System.out.println("Pingpong player is learning English");
    }
}
