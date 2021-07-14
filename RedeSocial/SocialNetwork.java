package RedeSocial;

import java.util.LinkedList;
import java.util.List;

public class SocialNetwork {
    List<User> users = new LinkedList<User>();

    public void addUser(User user) {
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();

        user1.id = "u1, ";
        user1.nome = "João Carlos"; 

        user2.id = "u2, ";
        user2.nome = "Maria Antonia"; 

        user3.id = "u3, ";
        user3.nome = "Emanuel Benedito"; 

        user4.id = "u4, ";
        user4.nome = "Josefina de Almeida"; 

        ImprimeUser users = new ImprimeUser();

        users.imprime(user1);
        users.imprime(user2);
        users.imprime(user3);
        users.imprime(user4);

        System.out.println("----------------------");
    }

    public void addFriendly(String UserFrom, String UserTo) {
        if (UserFrom != null && UserTo != null) {
            System.out.println(UserFrom + " adicionou " + UserTo);
            System.out.println("----------------------");
        }
    }

    public void addPost(String idPost, Post legendPost) {
        Post post1 = new Post();
        Post post2 = new Post();
        Post post3 = new Post();
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();

        ImprimePost posts = new ImprimePost();

        post1.idPost = "p1, ";
        post1.legendPost = "Tomando cafe";
        
        post2.idPost = "p2, ";
        post2.legendPost = "amizade é tudo de bom ";
       
        post3.idPost = "p3, ";
        post3.legendPost = "passeando com meu cachorro";

        user1.id = "u1, ";
        user1.nome = "João Carlos"; 

        user2.id = "u2, ";
        user2.nome = "Maria Antonia"; 

        user3.id = "u3, ";
        user3.nome = "Emanuel Benedito"; 

        posts.imprime(user1);
        posts.imprime(post1);
        System.out.println("----------------------");
        posts.imprime(user2);
        posts.imprime(post2);
        System.out.println("----------------------");
        posts.imprime(user3);
        posts.imprime(post3);

        System.out.println("----------------------");
    }

    public void addComment(String userFrom, String userTo, String idPost, Comment comment) {
        Comment comentario = new Comment(idPost, idPost);
        comentario.userFrom = "u3";
        comentario.userTo = "u1";
        comentario.idPost = "p1";
        comentario.idComment = "c1";
        comentario.comment = "Com pão de queijo ? tudo di bão";

        comentario.imprime();

        System.out.println("----------------------");

    }

    public void liked(String UserFrom, String UserTo, String idPost) {
        if (UserFrom != null && UserTo != null && idPost != null) {
            System.out.println(UserFrom + " curtiu o post " + idPost + " de " + UserTo);
        }
    }

}
