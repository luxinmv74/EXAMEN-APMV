package com.example.examenavance

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/
    }
}

/*
Autenticador

Un cliente le ha solicitado desarrollar un prototipo que le permita observar la interacción de una aplicación móvil con
un servicio de base de dato en tiempo real (de Firebase). Además, esta debe considerar la autenticación de usuarios para ingresar y
mostrar los datos almacenados. El cliente ha solicitado que los datos almacenados estén ordenados y describan claramente un elemento
(que podrá elegir ud., por ejemplo un dispositivo: describirá su marca, especificaciones, periféricos, etc).

1.	Plantee un boceto (funcional) a modo de interfaz, que permita apreciar la gestión de la información, esta debe ser almacenada y
obtenida desde un servicio Firebase de Base de Datos en tiempo real.

2.	Para gestionar los roles de usuario, utilice la herramienta Autenticator de Firebase, que se conectará a la aplicación mencionada
(se definirán roles y reglas que deben respetar estos roles, directamente en la herramienta de base de datos en tiempo real).

3.	El rol usuario, debe ser capaz de ingresar una “solicitud” de reserva (puede hacer un prototipo que gestiones la reserva como
mensaje – toast o log), esta se debe ingresar a la base de datos en tiempo real de firebase (dejando registro de que se ingresó una
reserva).

4.	El rol administrador, debe ser capaz leer y escribir en toda la base de datos (en tiempo real de firebase).

5.	Debe presentar al cliente aspectos relevantes de la implementación, como la clase utilizada para manipular los datos en la
aplicación, la conexión con la base de datos en tiempo real de Firebase y el uso de la base de datos.
*/