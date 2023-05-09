package com.example.biscoitodasorte

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<ImageView>(R.id.imageView4).setImageResource(0)
    }

    fun actionButton(view: View) {
        val messageBox = findViewById<TextView>(R.id.textView)
        var cookie = findViewById<ImageView>(R.id.imageView3)
        var cookieOpen = findViewById<ImageView>(R.id.imageView4)
        val frases = arrayListOf<String>(
            "Agora é a hora de surpreender aqueles que duvidaram de você.",
            "Valorize as pequenas conquistas!",
            "Você nunca será velho demais para sonhar um novo sonho.",
            "Avante! Para começar, você só precisa dar o primeiro passo.",
            "Para certas coisas, não basta querer, é preciso batalhar.",
            "Abandone suas dores e não a esperança em dias melhores.",
            "Lutar sempre, vencer às vezes, desistir nunca.",
            "Que os dias bons se tornem rotina e os ruins se tornem raros.",
            "Cada dificuldade ultrapassada te faz mais forte.",
            "Seus medos morrerão de fome se você alimentar a sua motivação.",
            "Abra-se para a coragem e vá atrás dos seus sonhos.",
            "A vida retribui quem pensa positivo.",
            "Tentar é a única maneira de saber se vai dar certo.",
            "Você pode, se acreditar que pode.",
            "Apenas você mesmo sabe a força que você possui.",
            "Você pode ter resultados ou desculpas, mas não os dois.",
            "O sucesso é a soma de pequenos esforços repetidos diariamente.",
            "Não foque em ser ocupado, foque em ser produtivo.",
            "Motivação é aquilo que te faz começar. Habito é aquilo que te faz continuar.",
            "Já pensou que você já superou muitas dificuldades até aqui?",
            "Mesmo que nem todo dia seja bom, há algo de bom todo dia.",
            "O seu plano mais importante é você mesmo.",
            "Modificar-se faz parte da jornada da vida.",
            "Mesmo que a jornada seja lenta, abrir mão não acelera.",
            "Não faça sempre o mesmo se está procurando resultados diferentes.",
            "É necessário abrir mão do comodismo de tempos em tempos.",
            "Você só vai vencer amanhã se não desistir hoje.",
            "Conceitos novos não circulam em mentes quadradas.",
            "Você nunca fará nada se ficar esperando pelas situações perfeitas.",
            "Quando pensar em desistir, lembre-se porque começou.",
            "Se não puder fazer tudo, faça tudo que puder.",
            "Comece onde você está. Use o que você tem. Faça o que puder.",
            "Simplesmente viva a vida.",
            "Que venham dias melhores.",
            "O corpo alcança o que a mente acredita.",
            "Hoje vai dar tudo certo.",
            "Dias de luz sempre retornam para quem iluminado está.",
            "Nem tudo na vida são flores, mas, quando for, regue.",
            "Até o maior dos prédios começa no chão.",
            "Não sabendo que era impossível, foi lá e fez.",
            "Eu nasci para ser feliz, não para ser normal.",
            "Ninguém é igual a você, e isso pode ser sua grande arma.",
            "Jamais desista de ser feliz.",
            "“Não chore porque acabou, sorria porque aconteceu.” (Dr. Seuss)",
            "O melhor lugar do mundo é aqui e agora.",
            "Acredite: tudo tem seu tempo.",
            "Corra, viva, sonhe e alcance.",
            "Seu maior medo também pode ser sua maior motivação.",
        )
        var randomFraseArray = Random.nextInt(frases.size)
        val fraseEscolhida = frases[randomFraseArray]
        cookie.setImageResource(0)
        cookieOpen.setImageResource(R.drawable.fortunecookieopen)
        messageBox.setText("$fraseEscolhida")
    }
}