package lesson11.autoRu;

public class Otziv  {
    private String textPlus;
    private String texMinus;
    private String otziv;
    private int like;
    private int dislike;

    public Otziv(String textPlus, String texMinus, String otziv, int like, int dislike) {
        this.textPlus = textPlus;
        this.texMinus = texMinus;
        this.otziv = otziv;
        this.like = like;
        this.dislike = dislike;
    }

    public String getTextPlus() {
        return textPlus;
    }

    public void setTextPlus(String textPlus) {
        this.textPlus = textPlus;
    }

    public String getTexMinus() {
        return texMinus;
    }

    public void setTexMinus(String texMinus) {
        this.texMinus = texMinus;
    }

    public String getOtziv() {
        return otziv;
    }

    public void setOtziv(String otziv) {
        this.otziv = otziv;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }
}
