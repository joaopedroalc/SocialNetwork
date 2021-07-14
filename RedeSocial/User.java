package RedeSocial;

import java.util.LinkedList;
import java.util.List;

public class User {
    String id;
    String nome;

    private List<User> friends = new LinkedList<User>();

    public User(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public User() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void addFriendly(User user) {
        friends.add(user);
    }

    public void imprimeFriendly(User user) {

    }
}
