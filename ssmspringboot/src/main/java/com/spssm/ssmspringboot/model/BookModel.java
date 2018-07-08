package com.spssm.ssmspringboot.model;

public class BookModel {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String bookname;
    private UserModel user;

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + bookname + ", user[ name =" + user.getUsername()+ ",password ="+ user.getPassword() +"]";
    }

}
