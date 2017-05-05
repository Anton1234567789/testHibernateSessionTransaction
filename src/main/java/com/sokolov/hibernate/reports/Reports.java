package com.sokolov.hibernate.reports;

import com.sokolov.hibernate.entity.Exam;
import org.hibernate.Session;

import org.hibernate.query.Query;
import java.util.List;

/**
 * Created by Антон on 05.05.2017.
 */
public class Reports {

    public List<ExamResult> getExamResults(String firstName, String lastName, Session session){
        String query = "select new com.sokolov.hibernate.reports.ExamResult(s.lastName, sj.name, e.grade)" +
                "from Exam e, Student s, Subject sj " +
                "where e.student.id = s.id and e.subject.id = sj.id" +
                "and s.firsName = :firstName and s.lastName = :lastName";
        Query hibernateQuery = session.createQuery(query);

        hibernateQuery.setParameter("firstName", firstName);
        hibernateQuery.setParameter("lastName", lastName);
        return hibernateQuery.getResultList();

    }

}
