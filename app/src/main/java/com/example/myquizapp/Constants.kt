package com.example.myquizapp

object Constants {


    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"



    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            optionOne = "Argentina",
            optionTwo = "Canada",
            optionThree = "Mexico",
            optionFour = "Armenia",
            correctAnswer = 1
        )
        questionList.add(que1)

        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            optionOne = "Argentina",
            optionTwo = "Canada",
            optionThree = "Australia",
            optionFour = "Armenia",
            correctAnswer = 3
        )
        questionList.add(que2)

        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            optionOne = "Argentina",
            optionTwo = "Brazil",
            optionThree = "Denmark",
            optionFour = "Armenia",
            correctAnswer = 2
        )
        questionList.add(que3)

        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            optionOne = "Argentina",
            optionTwo = "Cuba",
            optionThree = "Hawaii",
            optionFour = "Armenia",
            correctAnswer = 3
        )
        questionList.add(que4)

        return questionList


    }

}