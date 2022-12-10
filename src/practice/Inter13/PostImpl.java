package practice.Inter13;

public class PostImpl implements Post{
    @Override
    public int createPost(Post1 post1) {
        System.out.println(post1.getUserName());
        System.out.println(post1.getContent());
        return 45 ;
    }

    void  crea(){

    }
}
