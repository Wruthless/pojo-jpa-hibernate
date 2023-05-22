import java.util.StringTokenizer;


/**
 * A POJO implementation of the User entity of the domain model.
 */
public class User {


    // private String username;
    private String firstname;
    private String lastname;

    /*
    public String getUsername() {
        return username;
    }
    */
    public String getName() {
        return firstname + ' ' + lastname;
    }

    /*
    public void setUsername(String username) {
        this.username = username;
    }
    */
    public void setName(String name) {
        StringTokenizer tokenizer = new StringTokenizer(name);
        firstname = tokenizer.nextToken();
        lastname = tokenizer.nextToken();
    }


} // end User{}