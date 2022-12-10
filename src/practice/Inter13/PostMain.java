package practice.Inter13;

public class PostMain {

    public static void main(String[] args) {
        Post1 post1=new Post1();
        post1.setContent("Cont");
        post1.setUserName("pk");

        PostImpl post=new PostImpl();
        post.createPost(post1);
    }
}

