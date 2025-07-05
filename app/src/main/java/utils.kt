import com.example.quizapp.R
import com.example.quizapp.modalClass.Question

class Constants {
    companion object {
        const val APP_START_NAME_DATA = "Name"
        const val QUIZ_FINISH_FINAL_SCORE = "Score"

        fun getQuestion(): MutableList<Question> {
            val questions = mutableListOf<Question>()

            val question1 = Question(
                1, R.drawable.id,
                "India",
                "Iran",
                "Indonesia",
                "Japan",
                3
            )
            questions.add(question1)

            val question2 = Question(
                2,
                R.drawable.jp,
                "China",
                "Japan",
                "South Korea",
                "Thailand",
                2
            )
            questions.add(question2)

            val question3 = Question(
                3,
                R.drawable.`in`,
                "India",
                "Pakistan",
                "Bangladesh",
                "Nepal",
                1
            )
            questions.add(question3)

            val question4 = Question(
                4,
                R.drawable.at,
                "Austria",
                "Russia",
                "Poland",
                "Egypt",
                1
            )
            questions.add(question4)

            val question5 = Question(
                5,
                R.drawable.bd,
                "Singapore",
                "Sweden",
                "Kenya",
                "Bangladesh",
                4
            )
            questions.add(question5)

            val question6 = Question(
                6,
                R.drawable.be,
                "Greece",
                "Mexico",
                "Belgium",
                "Thailand",
                3
            )
            questions.add(question6)

            val question7 = Question(
                7,
                R.drawable.br,
                "Sweden",
                "Brazil",
                "Norway",
                "Singapore",
                2
            )
            questions.add(question7)

            val question8 = Question(
                8,
                R.drawable.ca,
                "Canada",
                "Sweden",
                "Portugal",
                "Denmark",
                1
            )
            questions.add(question8)

            val question9 = Question(
                9,
                R.drawable.cl,
                "Russia",
                "Chile",
                "Italy",
                "Sweden",
                2
            )
            questions.add(question9)

            val question10 = Question(
                10,
                R.drawable.cn,
                "Argentina",
                "Kenya",
                "Switzerland",
                "China",
                4
            )
            questions.add(question10)

            val question11 = Question(
                11,
                R.drawable.co,
                "Finland",
                "Saudi Arabia",
                "Ireland",
                "Colombia",
                4
            )
            questions.add(question11)

            val question12 = Question(
                12,
                R.drawable.cz,
                "Japan",
                "Czech Republic",
                "Pakistan",
                "China",
                2
            )
            questions.add(question12)

            val question13 = Question(
                13,
                R.drawable.dk,
                "Denmark",
                "Spain",
                "Iraq",
                "Finland",
                1
            )
            questions.add(question13)

            val question14 = Question(
                14,
                R.drawable.eg,
                "Egypt",
                "Belgium",
                "Iraq",
                "Singapore",
                1
            )
            questions.add(question14)

            val question15 = Question(
                15,
                R.drawable.fi,
                "Finland",
                "Singapore",
                "North Korea",
                "Italy",
                1
            )
            questions.add(question15)

            val question16 = Question(
                16,
                R.drawable.fr,
                "Kenya",
                "New Zealand",
                "Colombia",
                "France",
                4
            )
            questions.add(question16)

            val question17 = Question(
                17,
                R.drawable.de,
                "Germany",
                "Mexico",
                "Thailand",
                "Colombia",
                1
            )
            questions.add(question17)

            val question18 = Question(
                18,
                R.drawable.gr,
                "Israel",
                "New Zealand",
                "Australia",
                "Greece",
                4
            )
            questions.add(question18)

            val question19 = Question(
                19,
                R.drawable.hu,
                "Pakistan",
                "Egypt",
                "India",
                "Hungary",
                4
            )
            questions.add(question19)

            val question20 = Question(
                20,
                R.drawable.`is`,
                "Iceland",
                "Japan",
                "Portugal",
                "Argentina",
                1
            )
            questions.add(question20)

            val question21 = Question(
                2,
                R.drawable.hr,
                "Croatia",
                "Japan",
                "Portugal",
                "Argentina",
                1
            )
            questions.add(question21)

            val question22 = Question(
                22,
                R.drawable.ir,
                "Mexico",
                "Canada",
                "Iran",
                "Singapore",
                3
            )
            questions.add(question22)

            val question23 = Question(
                23,
                R.drawable.iq,
                "Netherlands",
                "Sweden",
                "Argentina",
                "Iraq",
                4
            )
            questions.add(question23)

            val question24 = Question(
                24,
                R.drawable.ie,
                "Switzerland",
                "Indonesia",
                "Ireland",
                "Argentina",
                3
            )
            questions.add(question24)

            val question25 = Question(
                25,
                R.drawable.il,
                "Israel",
                "India",
                "Czech Republic",
                "Pakistan",
                1
            )
            questions.add(question25)

            val question26 = Question(
                26,
                R.drawable.it,
                "Pakistan",
                "India",
                "New Zealand",
                "Italy",
                4
            )
            questions.add(question26)

            val question27 = Question(
                27,
                R.drawable.jp,
                "Singapore",
                "Iran",
                "Japan",
                "Philippines",
                3
            )
            questions.add(question27)

            val question28 = Question(
                28,
                R.drawable.ke,
                "Switzerland",
                "Hungary",
                "Bangladesh",
                "Kenya",
                4
            )
            questions.add(question28)

            val question29 = Question(
                29,
                R.drawable.my,
                "Australia",
                "Iceland",
                "Malaysia",
                "Portugal",
                3
            )
            questions.add(question29)

            val question30 = Question(
                30,
                R.drawable.mx,
                "Mexico",
                "India",
                "Spain",
                "Kenya",
                1
            )
            questions.add(question30)

            val question31 = Question(
                31,
                R.drawable.nl,
                "Thailand",
                "Netherlands",
                "Czech Republic",
                "Mexico",
                2
            )
            questions.add(question31)

            val question32 = Question(
                32,
                R.drawable.nz,
                "Thailand",
                "Austria",
                "Norway",
                "New Zealand",
                4
            )
            questions.add(question32)

            val question33 = Question(
                33,
                R.drawable.ng,
                "New Zealand",
                "Spain",
                "Nigeria",
                "Colombia",
                3
            )
            questions.add(question33)

            val question34 = Question(
                34,
                R.drawable.kp,
                "Japan",
                "Bangladesh",
                "North Korea",
                "Austria",
                3
            )
            questions.add(question34)

            val question35 = Question(
                35,
                R.drawable.no,
                "Norway",
                "Kenya",
                "Israel",
                "Japan",
                1
            )
            questions.add(question35)

            val question36 = Question(
                36,
                R.drawable.pk,
                "Colombia",
                "Pakistan",
                "Malaysia",
                "Portugal",
                2
            )
            questions.add(question36)

            val question37 = Question(
                37,
                R.drawable.pe,
                "Peru",
                "Singapore",
                "Hungary",
                "Canada",
                1
            )
            questions.add(question37)

            val question38 = Question(
                38,
                R.drawable.ph,
                "Ireland",
                "Brazil",
                "Philippines",
                "Australia",
                3
            )
            questions.add(question38)

            val question39 = Question(
                39,
                R.drawable.pl,
                "Mexico",
                "Brazil",
                "Poland",
                "Austria",
                3
            )
            questions.add(question39)

            val question40 = Question(
                40,
                R.drawable.pt,
                "Portugal",
                "Nigeria",
                "Malaysia",
                "Italy",
                1
            )
            questions.add(question40)

            val question41 = Question(
                41,
                R.drawable.ru,
                "Russia",
                "Philippines",
                "Chile",
                "Indonesia",
                1
            )
            questions.add(question41)

            val question42 = Question(
                42,
                R.drawable.sa,
                "Pakistan",
                "Saudi Arabia",
                "Spain",
                "Singapore",
                2
            )
            questions.add(question42)

            val question43 = Question(
                43,
                R.drawable.sg,
                "Portugal",
                "Switzerland",
                "Pakistan",
                "Singapore",
                4
            )
            questions.add(question43)

            val question44 = Question(
                44,
                R.drawable.za,
                "South Korea",
                "Poland",
                "South Africa",
                "Canada",
                3
            )
            questions.add(question44)

            val question45 = Question(
                45,
                R.drawable.kr,
                "South Korea",
                "Indonesia",
                "Poland",
                "Brazil",
                1
            )
            questions.add(question45)

            val question46 = Question(
                46,
                R.drawable.es,
                "Spain",
                "Egypt",
                "India",
                "Colombia",
                1
            )
            questions.add(question46)

            val question47 = Question(
                47,
                R.drawable.se,
                "Pakistan",
                "Hungary",
                "Singapore",
                "Sweden",
                4
            )
            questions.add(question47)

            val question48 = Question(
                48,
                R.drawable.ch,
                "Czech Republic",
                "Indonesia",
                "Switzerland",
                "Iraq",
                3
            )
            questions.add(question48)

            val question49 = Question(
                49,
                R.drawable.th,
                "Iran",
                "Mexico",
                "Austria",
                "Thailand",
                4
            )
            questions.add(question49)

            val question50 = Question(
                50,
                R.drawable.vn,
                "Vietnam",
                "China",
                "Cambodia",
                "Laos",
                1
            )
            questions.add(question50)

            return questions
        }
    }
}