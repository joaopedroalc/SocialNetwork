package RedeSocial;

public class Post {

    String idPost;
    String legendPost;

   
    public Post(String idPost, String legendPost) {
        this.idPost = idPost;
        this.legendPost = legendPost;
    }

    public Post() {
    }

    public String getLegendPost() {
        return legendPost;
    }

    public void setLegendPost(String legendPost) {
        this.legendPost = legendPost;
    }

    public String getIdPost() {
        return idPost;
    }

    public void setIdPost(String idPost) {
        this.idPost = idPost;
    }
}
