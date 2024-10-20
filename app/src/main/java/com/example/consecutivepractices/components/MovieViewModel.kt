package com.example.consecutivepractices.components

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateListOf
import com.example.consecutivepractices.model.Movie

class MovieViewModel : ViewModel() {
    private val _movies = mutableStateListOf<Movie>()

    val movies: List<Movie>
        get() = _movies

    init {
        _movies.addAll(listOf(
            Movie(1, "Матрица", "Мир Матрицы — это иллюзия, существующая только в бесконечном сне обреченного человечества.",  "https://upload.wikimedia.org/wikipedia/ru/9/9d/Matrix-DVD.jpg", "14 октября 1999г.", "Китай", "боевик, фантастика, приключения", "Лана Вачовски", " Киану Ривз, Лоренс Фишберн, Керри-Энн Мосс и Хьюго Уивинг", "2ч 16мин"),
            Movie(2, "Чужой", "В далеком будущем возвращающийся на Землю грузовой космический корабль перехватывает исходящий с неизвестной планеты неопознанный сигнал.", "https://upload.wikimedia.org/wikipedia/ru/thumb/7/70/Alien_Resurrection_poster.jpg/280px-Alien_Resurrection_poster.jpg", "22 июня 1979г", "США", "научная фантастика, ужасы", "Ридли Скотт", "Эллен Рипли, Том Скерритт Вероника, Картрайт Ламберт, Джон Хёрт ", "1ч 57мин"),
            Movie(3, "Хищник", "Американский вертолет был сбит партизанами в Южной Америке. Оставшийся в живых экипаж находится в плену.", "https://thumbs.dfs.ivi.ru/storage8/contents/c/e/43ecb7d0c6db6e8701de5f2d3401f5.jpg", "12 июня 1987г", "США", "боевик, научная фантастика", "Джон Мактирнан", " Арнольд Шварценеггер, Карл Уэзерс, Эльпидия Каррильо, Джесси Вентура", "1ч 47мин"),
            Movie( 4, "Час пик 3", "Неподражаемый дуэт гонконгского инспектора полиции Ли и его напарника из Лос-Анджелеса Джеймса Картера, отличающегося неординарностью и харизмой, будет бороться за правду.", "https://upload.wikimedia.org/wikipedia/ru/1/18/Rush_Hour_3_poster.jpg", "10 августа 2007г", "США", "комедия, боевик", "Бретт Ратнер", "Крис Такер, Джеки Чан", "1ч 32мин"),
            Movie( 5, "Нечто", "Команде ученых американской исследовательской базы в Антарктике предстоит столкнуться с необъяснимым, чудовищным кошмаром.", "https://upload.wikimedia.org/wikipedia/ru/c/c0/The_thing.jpg", "25 июня 1982г", "США", "ужасы, научная фантастика", "Джон Карпентер", "Курт Расселл, Кит Дэвид, Уилфорд Бримли, Дэвид Кленнон", "1ч 49мин")
        ))
    }
}




