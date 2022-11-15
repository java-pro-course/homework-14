package com.kalamya.task1.object;



public class User {
private String realName;
private String realSurname;
private  String GitHubNickname;

    public User(String realName,String realSurname, String GitHubNickname){
        this.realName = realName;
        this.realSurname = realSurname;
        this.GitHubNickname= GitHubNickname;
    }

    public String getRealName() {
        return realName;
    }

    public String getRealSurname() {
        return realSurname;
    }


    public String getGitHubNickname() {
        return GitHubNickname;
    }
    public String getInfoStr(){
        String a = GitHubNickname + ": " + realName + " " + realSurname;

        return a;
    }
}
