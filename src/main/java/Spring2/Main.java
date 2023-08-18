package Spring2;

import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(
                        ProectConfiguration.class);
        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");
        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
       /* var commentRepository =
                new DBCommentRepository();
        var commentNotificationProxy =
                new EmailCommentNotificationProxy();
        var commentService =
                new CommentService(
                        commentRepository, commentNotificationProxy);
        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");
        commentService.publishComment(comment);*/
    }
}
