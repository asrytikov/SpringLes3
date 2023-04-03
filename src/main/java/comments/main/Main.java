package comments.main;

import comments.ProjectConfiguration;
import comments.model.Comment;
import comments.proxies.EmailCommentNotificationProxy;
import comments.repositories.DBCommentRepository;
import comments.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        /*var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();

        var commentService = new CommentService(commentRepository, commentNotificationProxy);*/

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("Ivan");
        comment.setText("Demo");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);


    }
}
