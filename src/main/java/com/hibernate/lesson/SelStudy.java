package main.java.com.hibernate.lesson;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelStudy {
    public static void  main(String[] args){
        Configuration conf=new Configuration().configure();
        SessionFactory sf=conf.buildSessionFactory();
        Session se=sf.openSession();

        StudyEntity sty=(StudyEntity)se.get(StudyEntity.class,2);

        System.out.println(sty.getName()+""+sty.getLesson());
        sty.setLesson("python");
        sty.setName("spring");

        Transaction tx=se.beginTransaction();

        se.save(sty);
        tx.commit();

        StudentEntity sty=(StudentEntity)se.get(StudentEntity.class,2);

        System.out.println(sty.getName()+""+ sty.getLesson());

    }
}