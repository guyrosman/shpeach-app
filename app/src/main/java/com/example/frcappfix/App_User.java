package com.example.frcappfix;

import static java.lang.String.*;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

public class App_User {
    private Personal_Detail personal_details;
    private String userName;
    private String email;
    private String password;
    private String phoneNumber;
    private String id;
    private List<Group> groups;
    private List<Group> managing_groups;
    private List<String> friends_ids;

    public App_User(Personal_Detail personal_details, String userName, String email, String password, String phoneNumber) {
        this.personal_details = personal_details;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public App_User(Personal_Detail personal_details, String userName, String email, String password, String phoneNumber, String id, List<Group> groups, List<Group> managing_groups, List<String> friends_ids) {
        this.personal_details = personal_details;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.id = id;
        this.groups = groups;
        this.managing_groups = managing_groups;
        this.friends_ids = friends_ids;
    }

    public void addGroup(Group group, Context context){
        if(!isInGroup(group)) {
            groups.add(group);
        }
        else{
            Toast.makeText(context, valueOf(R.string.already_in_group ), Toast.LENGTH_SHORT).show();
        }
    }
    public boolean isInGroup(Group group){
        for (Group g :groups) {
            if (g.getId().equals(group.getId())){
                return true;
        }
        }
        return false;
    }
    public void addFriend(App_User friend, Context context){
        if(!isFriend(friend.getId())){
            friends_ids.add(friend.getId());
            Toast.makeText(context, R.string.friend_added, Toast.LENGTH_SHORT).show();
        }

    }
    public boolean isFriend(String id){
        return friends_ids.contains(id);
    }

    public Personal_Detail getPersonal_details() {
        return personal_details;
    }

    public void setPersonal_details(Personal_Detail personal_details) {
        this.personal_details = personal_details;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
