package RedeSocial;

public class ImprimePost extends ImprimeUser {
    public void imprime (Post imprimePost){
        System.out.print(imprimePost.idPost);
        System.out.println(imprimePost.legendPost);
    }

}