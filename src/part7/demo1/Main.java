package part7.demo1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Post post1 = Post.builder()
                .id(1)
                .title("asdasd")
                .body("qewqew")
                .comments(new ArrayList<>())
                .build();

        Post post2 = Post.builder()
                .id(2)
                .title("wqyfeywqfe")
                .body("dagjsfhdsfg")
                .comments(new ArrayList<>())
                .build();

        ArrayList<Post> posts = new ArrayList<>();
        posts.add(post1);
        posts.add(post2);


        Comment comment11 = Comment.builder().postId(1).id(1).text("ahsdfhgafsd1").build();
        Comment comment12 = Comment.builder().postId(1).id(2).text("ahsdfhgafsd2").build();
        Comment comment21 = Comment.builder().postId(2).id(3).text("ahsdfhgafsd3").build();
        Comment comment22 = Comment.builder().postId(2).id(4).text("ahsdfhgafsd4").build();

        ArrayList<Comment> comments = new ArrayList<>();
        comments.add(comment11);
        comments.add(comment12);
        comments.add(comment21);
        comments.add(comment22);

        for (Comment comment : comments) {
            for (Post post : posts) {
                if (post.getId() == comment.getPostId()) {
                    post.getComments().add(comment);
                }
            }
        }

        for (Post post : posts) {
            System.out.println(post);
        }


    }
}
