package com.example.drukfitness;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.drukfitness.QuizContract.*;
import java.util.ArrayList;
import java.util.List;

public class QuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "DrukGrammarQuiz";
    private static final int DATABASE_VERSION = 2;
    private SQLiteDatabase db;
    public QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;
        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME);
        onCreate(db);
    }
    private void fillQuestionsTable() {
        Question q1 = new Question("སྔོན་འཇུག་ག་གི་ དཔེར་བརྗོད་ག་སྨོ?", "དབང་།", "འབད", "གཉིས", "བསྒུག", 1);
        addQuestion(q1);
        Question q2 = new Question("ཡང་འཇུག་ཟེར་མི་འདི", "ཀ༽མིང་གཞི་གི་ཧེ་མ་འཇུག་མི།", "ཁ༽རྗེས་འཇུག་གི་ཤུལ་མ་འཇུག་མི།", "ག༽རྗེས་འཇུག་གི་ཧ་མེ་འཇུག་མི།", "ང༽མིང་གཞི་གི་ཤུལ་མ་འཇུག་མི།", 1);
        addQuestion(q2);
        Question q3 = new Question("མིང་གཞི་ཟེར་འདི་ ", "ཀ༽རྗོད་སྒྲ་ཤུགས་སྦེ་སྟོན་མི་ལུ་སླབ་ཨིན།", "ཁ༽རྗོད་སྒྲ་གོ་ལེ་སྦེ་སྟོན་མི་ལུ་སླབ་ཨིན།", "ག༽ ཡངའཇུག་གི་ཤུལ་མ་འཇུག་མི།","ང༽རྗེས་འཇུག་གི་ཤུལ་མ་འཇུག་མི།", 1);
        addQuestion(q3);
        Question q4 = new Question("མིང་གཞི་ཟེར་འདི་ ", "ཀ༽སྔོན་འཇུག་གི་ཡི་གུ་ཨིན།", "ཁ༽ མིང་གཞི་གི་ཡི་གུ་ཨིན", "ག༽རྗེས་འཇུག་གི་ཡི་གུ་ཨིན།","ང༽ཡངའཇུག་གི་ཡི་གུ་ཨིན།", 1);
        addQuestion(q4);
        Question q5 = new Question("ཡང་འཇུག་གི་དཔེར་བརྗོབ་འདི", "ཀ༽གོང་།", "ཁ༽བཏོག", "ག༽བསྒྲུབས།","ང༽འཇུག", 3);
        addQuestion(q5);
        Question q6 = new Question("ས་འདི", "ཀ༽ཡང་འཇུག་ཡི་གུ་ཨིན།", "ཁ༽རྗེས་འཇུག་གི་ཡི་གུ་ཨིན།", "ག༽ མིང་གཞི་གི་ཡི་གུ་ཨིན།","ང༽སྔོན་འཇུག་གི་ཡི་གུ་ཨིན།", 3);
        addQuestion(q6);
        Question q7 = new Question("སྔོན་འཇུག་ལུ་ཡི་གུ", "ཀ༽༤ ཡོད།", "ཁ༽༡༠ ཡོད།", "ག༽༧ ཡོད།","ང༽༥ ཡོད།", 4);
        addQuestion(q7);
        Question q8 = new Question("མིང་གཞིའི་ཡི་གུ་འདི་", "ཀ༽གསལ་བྱེད་སུམ་ཅུ་ཨིན།", "ཁ༽ཡ་བཏགས་༧་ཨིན།", "ག༽ས་མགོ་༡༡ཨིན།","ང༽ལ་མགོ་༡༢་ཨིན།", 1);
        addQuestion(q8);
        Question q9 = new Question("སྔོན་འཇུག་བ་ཡོད་དཔེར་བརྗོད་འདི་", "ཀ༽སྦོམ", "ཁ༽དཀའ", "ག༽བཀག","ང༽དགའ", 2);
        addQuestion(q9);
        Question q10 = new Question("རྗེས་འཇུག་ད་ཡོད་མི་དཔེར་བརྗོད་འདི་", "ཀ༽སྡོད།", "ཁ༽ཁཝ", "ག༽ཉལ","ང༽ལས", 1);
        addQuestion(q10);
        Question q11 = new Question("རྗེས་འཇུག་ན་ཡོད་མི་དཔེར་བརྗོད་འདི་", "ཀ༽གདན།", "ཁ༽འཇུག།", "ག༽ཡོད།","ང༽གཞི", 1);
        addQuestion(q11);
        Question q12 = new Question("རྗེས་འཇུག་ཟེར་མི་འད་", "ཀ༽རྗོད་སྒྲ་ཤུགས་སྦེ་སྟོན་མི་ལུ་སླབ་ཨིན།", "ཁ༽མིང་གཞི་གི་ཤུལ་མ་འཇུག་མི་ལུ་སླབ་ཨིན།", "ག༽ཡང་འཇུག་གི་ཤུལ་མ་འཇུག་མི་ལུ་སླབ་ཨིན།","ང༽མིང་གཞི་གི་ཧེ་མ་འཇུག་མི་ལུ་སླབ་ཨིན།", 1);
        addQuestion(q12);
        Question q13 = new Question("རྗེས་འཇུག་ ག་ང་བ་མ་ ༤  མཐའ་མར་ཕྲད", "ཀ༽སྟེ།", "ཁ༽ཏེ", "ག༽དེ","ང༽སྦེ", 2);
        addQuestion(q13);
        Question q14 = new Question("སྔོན་འཇུག་ འ་ཡོད་མི་དཔེར་བརྗོད་འདི་", "ཀ༽འདི", "ཁ༽བཟོ།", "ག༽དབྱངས།","ང༽ མགྲིན་པ།", 1);
        addQuestion(q14);





    }
    private void addQuestion(Question question) {
        ContentValues cv = new ContentValues();
        cv.put(QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4());
        cv.put(QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        db.insert(QuizContract.QuestionsTable.TABLE_NAME, null, cv);
    }
    public List<Question> getAllQuestions() {
        List<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME, null);
        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_OPTION4)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_ANSWER_NR)));
                questionList.add(question);
            } while (c.moveToNext());
        }
        c.close();
        return questionList;
    }
}


