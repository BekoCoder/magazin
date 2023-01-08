package service;

import model.User;

import java.util.UUID;

public class UserService {

    public User[] users;
    public int index = 0;

    public UserService(int size){
        this.users = new User[size];
    }

    public boolean addUser(String name){
        User user = new User(name);
        this.users[index ++] = user;
        return true;
    }


    public User getUserName(UUID userId){
        for (User user: users) {
            if (user != null){
                if (user.id.equals(userId)){
                    return user;
                }
            }
        }
        return null;
    }

    public UUID getUserId(String name){
        for (User user: users) {
            if (user != null){
                if (user.name.equals(name)){
                    return user.id;
                }
            }
        }
        return null;
    }



}