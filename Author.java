public class Author {
    private String author_name;
    private String author_id;
    private String email;

    public Author(String author_name, String author_id, String email){
        this.author_name=author_name;
        this.author_id=author_id;
        this.email=email;
    }

    public String getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Author{" +
                "author_name='" + author_name + '\'' +
                ", author_id='" + author_id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
