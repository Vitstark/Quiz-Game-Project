package ru.quizgameproject.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import ru.quizgameproject.creations.Question;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Component
public class QuestionDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public QuestionDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Question> index() {
        return jdbcTemplate.query("SELECT * FROM questions", new QuestionMapper());
    }

    public List<Question> getThemeQuestions(int theme_id) {
        return jdbcTemplate.query("SELECT * FROM questions WHERE theme_id=?", new Object[]{theme_id}, new QuestionMapper());
    }

}

class QuestionMapper implements RowMapper<Question> {
    @Override
    public Question mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Question(
                rs.getInt("theme_id"),
                rs.getString("body_of_question"),
                rs.getString("correct_answer"),
                (String[]) rs.getArray("uncorrect_answers").getArray()
        );
    }
}