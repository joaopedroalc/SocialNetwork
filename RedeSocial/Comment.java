package RedeSocial;

public class Comment {

    public String idComment;
    public String userFrom;
    public String userTo;
    public String idPost;
    public String comment;

    public Comment(String idComment, String comment) {
        this.idComment =idComment;
        this.comment =comment;
    }

    public void imprime (){
        System.out.println("um usuario " + this.userFrom + " falou que " + "'" + this.comment + "'" + " ao post " + this.idPost  + " do usuario " + this.userTo + "; id do comentario:" + this.idComment);
    }
    public String getContentComment() {
        return comment;
    }

    public void setContentComment(String comment) {
        this.comment = comment;
    }

    public String getIdComment() {
        return idComment;
    }

    public void setIdComment(String idComment) {
        this.idComment = idComment;
    }

}
