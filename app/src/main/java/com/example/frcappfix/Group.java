package com.example.frcappfix;

import android.content.Context;
import android.widget.Toast;

import java.util.List;

public class Group {
    private String name;
    private String password;
    private String id;
    private List<String> users;
    private String manager_id;

    public Group(String name, String password,String manager_id) {
        this.name = name;
        this.password = password;
        this.manager_id = manager_id;
        users.add(manager_id);
    }

    public Group(String name, String password, String id, List<String> users, String manager_id) {
        this.name = name;
        this.password = password;
        this.id = id;
        this.users = users;
        this.manager_id = manager_id;
    }

    public void addUser(App_User user, Context context){
        if(!users.contains(user.getId())){
            users.add(user.getId());
            Toast.makeText(context, R.string.joined_group, Toast.LENGTH_SHORT).show();
        }
    }

    public String getManager_id() {
        return manager_id;
    }

    public void setManager_id(String manager_id) {
        this.manager_id = manager_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
