package com.sokolov.hibernate;


import com.sokolov.hibernate.reports.Reports;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class StartHibernate {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

//        Student student = new Student();
//
//        student.setFirstName("Kat");
//        student.setLastName("Prol");
//        student.setAge(24);
//
//        session.save(student);

//        Student student = session.get(Student.class, 1);

//        System.out.println(student);
//        student.setAge(40);

//        Set<Exam> examSet  = student.getExams();

//        Query query = session.createQuery("from Student ");
//        List<Student> studentList = query.getResultList();

        Reports reports = new Reports();
        reports.getExamResults("Jhn", "Mat",session);

        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}


