package com.prank.app
import android.media.RingtoneManager import android.os.Bundle import android.widget.ImageView import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() { override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState)
    val imageView = ImageView(this).apply {
        // Загрузка картинки обезьяны по ссылке
        scaleType = ImageView.ScaleType.CENTER_CROP
    }
    setContentView(imageView)

    // Загружаем картинку обезьяны
    val imageUrl = "https://images.unsplash.com/photo-1540573133985-778988177a36?q=80&w=1000&auto=format&fit=crop"
    
    // Воспроизводим громкий звук при открытии
    try {
        val notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
        val r = RingtoneManager.getRingtone(applicationContext, notification)
        r.play()
    } catch (e: Exception) {
        e.printStackTrace()
    }
}
}
