package com.google.base;

public class Story
{

    public void initStoryWrite() {
//        String gameStory = "때는 B.C 5700년 어둠이내고 악이 판치는 곳이다." +
//                " 어둠이 내린 시기를 영웅이 등장해 이겨내리다." +
//                " 이제 영웅이 등장할 시기이니..";

        try {
            Thread.sleep(1000);
            System.out.println("때는 B.C 5700년 어둠이내고 악이 판치는 곳이다.");
            Thread.sleep(1000);
            System.out.println(" 어둠이 내린 시기를 영웅이 등장해 이겨내리다.");
            Thread.sleep(1000);
            System.out.println(" 이제 영웅이 등장할 시기이니..");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}