package org.example.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commentId;
    private String content;
    private Date commentDate;
    private String note;

    public static Date sqlDateComment(String commentDate){
        java.util.Date purchaseDate = new java.util.Date();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        try{
            purchaseDate = df.parse(commentDate);
        } catch (ParseException e){
            System.out.println("date format error");
            return null;
        }

        java.sql.Date sqlDateComment = new java.sql.Date(purchaseDate.getTime());
        return sqlDateComment;
    }
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idProduct")
    private Product product;

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", content='" + content + '\'' +
                ", commentDate=" + commentDate +
                ", note='" + note + '\'' +
                '}';
    }


}
