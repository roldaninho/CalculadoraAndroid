package com.example.calculadoraandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    double ope1;
    double ope2;
    double resultado;
    String operation = "idle";
    String unidad_angular = "DEG";
    boolean borrar_pantalla = false;
    boolean iniciar_operacion = false;
    boolean inicio = false;
    boolean seno_activado = false;
    DecimalFormat decimales = new DecimalFormat("#.###");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView pantalla = findViewById(R.id.pantalla);
        final Button tecla1 = findViewById(R.id.tecla1);
        final Button tecla2 = findViewById(R.id.tecla2);
        final Button tecla3 = findViewById(R.id.tecla3);
        final Button tecla4 = findViewById(R.id.tecla4);
        final Button tecla5 = findViewById(R.id.tecla5);
        final Button tecla6 = findViewById(R.id.tecla6);
        final Button tecla7 = findViewById(R.id.tecla7);
        final Button tecla8 = findViewById(R.id.tecla8);
        final Button tecla9 = findViewById(R.id.tecla9);
        final Button tecla0 = findViewById(R.id.tecla0);
        final Button teclaSuma = findViewById(R.id.teclaSuma);
        final Button teclaResta = findViewById(R.id.teclaResta);
        final Button teclaMult = findViewById(R.id.teclaMult);
        final Button teclaDiv = findViewById(R.id.teclaDiv);
        final Button teclaIgual = findViewById(R.id.teclaIgual);
        final Button teclaComa = findViewById(R.id.teclaComa);
        final Button teclaBorrar = findViewById(R.id.teclaBorrar);
        final Button teclaSinus = findViewById(R.id.teclaSinus);
        final Button teclaCos = findViewById(R.id.teclaCos);
        final Button teclaTan = findViewById(R.id.teclaTan);
        final Button teclaRad = findViewById(R.id.teclaRad);

         tecla1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                inicio = true;

                if (iniciar_operacion) {
                    operation = "idle";
                    borrar_pantalla = false;
                    pantalla.setText(tecla1.getText().toString());
                    iniciar_operacion = false;
                    seno_activado = false;
                }
                else {
                    if (borrar_pantalla || seno_activado) {
                        pantalla.setText("");
                        pantalla.setText(pantalla.getText().toString() + tecla1.getText().toString());
                        if(borrar_pantalla) {
                            ope1 = resultado;
                            borrar_pantalla = false;
                        }
                        seno_activado = false;
                    }
                    else {
                        pantalla.setText(pantalla.getText().toString() + tecla1.getText().toString());
                    }
                }
            }
        });

        tecla2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                inicio = true;

                if (iniciar_operacion) {
                    operation = "idle";
                    borrar_pantalla = false;
                    pantalla.setText(tecla2.getText().toString());
                    iniciar_operacion = false;
                    seno_activado = false;
                }
                else {
                    if (borrar_pantalla || seno_activado) {
                        pantalla.setText("");
                        pantalla.setText(pantalla.getText().toString() + tecla2.getText().toString());
                        if(borrar_pantalla) {
                            ope1 = resultado;
                            borrar_pantalla = false;
                        }

                        seno_activado = false;
                    }
                    else {
                        pantalla.setText(pantalla.getText().toString() + tecla2.getText().toString());
                    }
                }
            }
        });

        tecla3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                inicio = true;

                if (iniciar_operacion) {
                    operation = "idle";
                    borrar_pantalla = false;
                    pantalla.setText(tecla3.getText().toString());
                    iniciar_operacion = false;
                    seno_activado = false;
                }
                else {
                    if (borrar_pantalla || seno_activado) {
                        pantalla.setText("");
                        pantalla.setText(pantalla.getText().toString() + tecla3.getText().toString());
                        if(borrar_pantalla) {
                            ope1 = resultado;
                            borrar_pantalla = false;
                        }

                        seno_activado = false;
                    }
                    else {
                        pantalla.setText(pantalla.getText().toString() + tecla3.getText().toString());
                    }
                }
            }
        });

        tecla4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                inicio = true;

                if (iniciar_operacion) {
                    operation = "idle";
                    borrar_pantalla = false;
                    pantalla.setText(tecla4.getText().toString());
                    iniciar_operacion = false;
                    seno_activado = false;
                }
                else {
                    if (borrar_pantalla || seno_activado) {
                        pantalla.setText("");
                        pantalla.setText(pantalla.getText().toString() + tecla4.getText().toString());
                        if(borrar_pantalla) {
                            ope1 = resultado;
                            borrar_pantalla = false;
                        }
                        seno_activado = false;
                    }
                    else {
                        pantalla.setText(pantalla.getText().toString() + tecla4.getText().toString());
                    }
                }
            }
        });

        tecla5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                inicio = true;

                if (iniciar_operacion) {
                    operation = "idle";
                    borrar_pantalla = false;
                    pantalla.setText(tecla5.getText().toString());
                    iniciar_operacion = false;
                    seno_activado = false;
                }
                else {
                    if (borrar_pantalla || seno_activado) {
                        pantalla.setText("");
                        pantalla.setText(pantalla.getText().toString() + tecla5.getText().toString());
                        if(borrar_pantalla) {
                            ope1 = resultado;
                            borrar_pantalla = false;
                        }
                        seno_activado = false;
                    } else {
                        pantalla.setText(pantalla.getText().toString() + tecla5.getText().toString());
                    }
                }
            }
        });

        tecla6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                inicio = true;

                if (iniciar_operacion) {
                    operation = "idle";
                    borrar_pantalla = false;
                    pantalla.setText(tecla6.getText().toString());
                    iniciar_operacion = false;
                    seno_activado = false;
                }
                else {
                    if (borrar_pantalla || seno_activado) {
                        pantalla.setText("");
                        pantalla.setText(pantalla.getText().toString() + tecla6.getText().toString());
                        if(borrar_pantalla) {
                            ope1 = resultado;
                            borrar_pantalla = false;
                        }
                        seno_activado = false;
                    } else {
                        pantalla.setText(pantalla.getText().toString() + tecla6.getText().toString());
                    }
                }
            }
        });

        tecla7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                inicio = true;

                if (iniciar_operacion) {
                    operation = "idle";
                    borrar_pantalla = false;
                    pantalla.setText(tecla7.getText().toString());
                    iniciar_operacion = false;
                    seno_activado = false;
                }
                else {
                    if (borrar_pantalla || seno_activado) {
                        pantalla.setText("");
                        pantalla.setText(pantalla.getText().toString() + tecla7.getText().toString());
                        if(borrar_pantalla) {
                            ope1 = resultado;
                            borrar_pantalla = false;
                        }
                        seno_activado = false;
                    } else {
                        pantalla.setText(pantalla.getText().toString() + tecla7.getText().toString());
                    }
                }
            }
        });

        tecla8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                inicio = true;

                if (iniciar_operacion) {
                    operation = "idle";
                    borrar_pantalla = false;
                    pantalla.setText(tecla8.getText().toString());
                    iniciar_operacion = false;
                    seno_activado = false;
                }
                else {
                    if (borrar_pantalla || seno_activado) {
                        pantalla.setText("");
                        pantalla.setText(pantalla.getText().toString() + tecla8.getText().toString());
                        if(borrar_pantalla) {
                            ope1 = resultado;
                            borrar_pantalla = false;
                        }
                        seno_activado = false;
                    } else {
                        pantalla.setText(pantalla.getText().toString() + tecla8.getText().toString());
                    }
                }
            }
        });

        tecla9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                inicio = true;

                if (iniciar_operacion) {
                    operation = "idle";
                    borrar_pantalla = false;
                    pantalla.setText(tecla9.getText().toString());
                    iniciar_operacion = false;
                    seno_activado = false;
                }
                else {
                    if (borrar_pantalla || seno_activado) {
                        pantalla.setText("");
                        pantalla.setText(pantalla.getText().toString() + tecla9.getText().toString());
                        if(borrar_pantalla) {
                            ope1 = resultado;
                            borrar_pantalla = false;
                        }
                        seno_activado = false;
                    } else {
                        pantalla.setText(pantalla.getText().toString() + tecla9.getText().toString());
                    }
                }
            }
        });

        tecla0.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                inicio = true;

                if (iniciar_operacion) {
                    operation = "idle";
                    borrar_pantalla = false;
                    pantalla.setText(tecla0.getText().toString());
                    iniciar_operacion = false;
                    seno_activado = false;
                }
                else {
                    if (borrar_pantalla || seno_activado) {
                        pantalla.setText("");
                        pantalla.setText(pantalla.getText().toString() + tecla0.getText().toString());
                        if(borrar_pantalla) {
                            ope1 = resultado;
                            borrar_pantalla = false;
                        }
                        seno_activado = false;
                    }
                    else {
                        pantalla.setText(pantalla.getText().toString() + tecla0.getText().toString());
                    }
                }
            }
        });

        teclaSinus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if(pantalla.getText().toString()== null || pantalla.getText().toString()=="" || !inicio){
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Función no valida, introduzca números",
                            Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    toast1.show();
                }
                else if (Double.parseDouble(pantalla.getText().toString())<0)
                {
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Función no valida, número negativo",
                            Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    toast1.show();
                }
                else{
                    if(unidad_angular == "DEG"){
                        double num = Double.parseDouble(pantalla.getText().toString());
                        double ang_radianes = Math.toRadians(num);
                        double seno = Math.sin(ang_radianes);
                        pantalla.setText(decimales.format(seno));
                        seno_activado = true;
                    }
                    else{
                        double num = Double.parseDouble(pantalla.getText().toString());
                        pantalla.setText(decimales.format(Math.sin(num)));
                        borrar_pantalla = true;

                    }
                }
            }
        });

        teclaCos.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if(pantalla.getText().toString()== null || pantalla.getText().toString()=="" || !inicio){
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Función no valida, introduzca números",
                            Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    toast1.show();
                }
                else if (Double.parseDouble(pantalla.getText().toString())<0)
                {
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Función no valida, número negativo",
                            Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    toast1.show();
                }
                else{
                    if(unidad_angular == "DEG"){
                        double num = Double.parseDouble(pantalla.getText().toString());
                        double ang_radianes = Math.toRadians(num);
                        double coseno = Math.cos(ang_radianes);
                        pantalla.setText(decimales.format(coseno));
                        seno_activado = true;
                    }
                    else{
                        double num = Double.parseDouble(pantalla.getText().toString());
                        pantalla.setText(decimales.format(Math.cos(num)));
                        seno_activado = true;

                    }
                }
            }
        });

        teclaTan.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if(pantalla.getText().toString()== null || pantalla.getText().toString()=="" || !inicio){
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Función no valida, introduzca números",
                            Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    toast1.show();
                }
                else if (Double.parseDouble(pantalla.getText().toString())<0)
                {
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Función no valida, número negativo",
                            Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    toast1.show();
                }
                else{
                    if(unidad_angular == "DEG"){
                        double num = Double.parseDouble(pantalla.getText().toString());
                        double ang_radianes = Math.toRadians(num);
                        double tangente = Math.tan(ang_radianes);
                        pantalla.setText(decimales.format(tangente));
                        seno_activado = true;
                    }
                    else{
                        double num = Double.parseDouble(pantalla.getText().toString());
                        pantalla.setText(decimales.format(Math.tan(num)));
                        seno_activado = true;

                    }
                }
            }
        });

        teclaComa.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if(pantalla.getText().toString()== null || pantalla.getText().toString()=="" || !inicio){

                    pantalla.setText("0.");
                }
                else {
                    if (iniciar_operacion) {
                        operation = "idle";
                        borrar_pantalla = false;
                        pantalla.setText("0.");
                        iniciar_operacion = false;
                    } else {
                        if (borrar_pantalla || seno_activado) {
                            pantalla.setText("");
                            pantalla.setText("0,");
                            if(borrar_pantalla) {
                                ope1 = resultado;
                                borrar_pantalla = false;
                            }
                            seno_activado = false;
                        } else {
                            pantalla.setText(pantalla.getText().toString() + ".");
                        }
                    }
                }
            }
        });

        teclaBorrar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                operation = "idle";
                borrar_pantalla = false;
                iniciar_operacion = false;
                seno_activado = false;
                pantalla.setText("");
            }
        });

        teclaRad.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                if(teclaRad.getText().toString() == "RAD"){
                    teclaRad.setText("DEG");
                    unidad_angular = "DEG";
                }
                else{
                    teclaRad.setText("RAD");
                    unidad_angular = "RAD";
                }
            }
        });

        teclaIgual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if(pantalla.getText().toString()== null || pantalla.getText().toString()=="" || !inicio){
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Faltan parámetros",
                            Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    toast1.show();
                }
                else {
                    iniciar_operacion = true;

                    if (operation == "suma") {
                        if (!borrar_pantalla) {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 + ope2;
                            pantalla.setText(decimales.format(resultado));
                            operation = "idle";
                        } else {
                            pantalla.setText(decimales.format(resultado));
                        }
                    } else if (operation == "producto") {
                        if (!borrar_pantalla) {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 * ope2;
                            pantalla.setText(decimales.format(resultado));
                            operation = "idle";
                        } else {
                            pantalla.setText(decimales.format(resultado));
                        }
                    } else if (operation == "resta") {
                        if (!borrar_pantalla) {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 - ope2;
                            pantalla.setText(decimales.format(resultado));
                            operation = "idle";
                        } else {
                            pantalla.setText(decimales.format(resultado));
                        }
                    } else if (operation == "division") {
                        if (!borrar_pantalla) {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 / ope2;
                            pantalla.setText(decimales.format(resultado));
                            operation = "idle";
                        } else {
                            pantalla.setText(decimales.format(resultado));
                        }
                    } else {
                        Toast toast1 = Toast.makeText(getApplicationContext(), "Ya has realizado una operacion. Realiza otra operacion para continuar",
                                Toast.LENGTH_SHORT);
                        toast1.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                        toast1.show();
                    }
                }
            }
        });

        teclaSuma.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if(pantalla.getText().toString()== null || pantalla.getText().toString()=="" || !inicio) {
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Faltan parámetros",
                            Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                    toast1.show();
                }
                else {
                    iniciar_operacion = false;

                    if (operation == "idle") {
                        operation = "suma";
                        ope1 = Double.parseDouble(pantalla.getText().toString());
                        pantalla.setText("");
                    } else {
                        if (operation == "resta") {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 - ope2;
                            pantalla.setText(decimales.format(resultado));
                            borrar_pantalla = true;
                            operation = "suma";
                        } else if (operation == "producto") {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 * ope2;
                            pantalla.setText(decimales.format(resultado));
                            borrar_pantalla = true;
                            operation = "suma";
                        } else if (operation == "division") {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 / ope2;
                            pantalla.setText(decimales.format(resultado));
                            borrar_pantalla = true;
                            operation = "suma";
                        } else {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 + ope2;
                            pantalla.setText(decimales.format(resultado));
                            borrar_pantalla = true;
                        }
                    }
                }
            }
        });

        teclaResta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button

                if(pantalla.getText().toString()== null || pantalla.getText().toString()=="" || !inicio) {
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Faltan parámetros",
                            Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                    toast1.show();
                }
                else {
                    iniciar_operacion = false;

                    if (operation == "idle") {
                        operation = "resta";
                        ope1 = Double.parseDouble(pantalla.getText().toString());
                        pantalla.setText("");
                    } else {
                        if (operation == "suma") {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 + ope2;
                            pantalla.setText(decimales.format(resultado));
                            borrar_pantalla = true;
                            operation = "resta";
                        } else if (operation == "producto") {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 * ope2;
                            pantalla.setText(decimales.format(resultado));
                            borrar_pantalla = true;
                            operation = "resta";
                        } else if (operation == "division") {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 / ope2;
                            pantalla.setText(decimales.format(resultado));
                            borrar_pantalla = true;
                            operation = "resta";
                        } else {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 - ope2;
                            pantalla.setText(decimales.format(resultado));
                            borrar_pantalla = true;
                        }
                    }
                }
            }
        });

        teclaMult.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if (pantalla.getText().toString() == null || pantalla.getText().toString() == "" || !inicio) {
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Faltan parámetros",
                            Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                    toast1.show();
                }
                else {
                    iniciar_operacion = false;

                    if (operation == "idle") {
                        operation = "producto";
                        ope1 = Double.parseDouble(pantalla.getText().toString());
                        pantalla.setText("");
                    } else {
                        if (operation == "suma") {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 + ope2;
                            pantalla.setText(decimales.format(resultado));
                            borrar_pantalla = true;
                            operation = "producto";
                        } else if (operation == "resta") {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 - ope2;
                            pantalla.setText(decimales.format(resultado));
                            borrar_pantalla = true;
                            operation = "producto";
                        } else if (operation == "division") {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 / ope2;
                            pantalla.setText(decimales.format(resultado));
                            borrar_pantalla = true;
                            operation = "producto";
                        } else {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 * ope2;
                            pantalla.setText(decimales.format(resultado));
                            borrar_pantalla = true;
                        }
                    }
                }
            }
        });

        teclaDiv.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if(pantalla.getText().toString()== null || pantalla.getText().toString()=="" || !inicio) {
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Faltan parámetros",
                            Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                    toast1.show();
                }
                else {
                    iniciar_operacion = false;

                    if (operation == "idle") {
                        operation = "division";
                        ope1 = Double.parseDouble(pantalla.getText().toString());
                        pantalla.setText("");
                    } else {
                        if (operation == "suma") {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 + ope2;
                            pantalla.setText(decimales.format(resultado));
                            borrar_pantalla = true;
                            operation = "division";
                        } else if (operation == "resta") {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 - ope2;
                            pantalla.setText(decimales.format(resultado));
                            borrar_pantalla = true;
                            operation = "division";
                        } else if (operation == "producto") {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 * ope2;
                            pantalla.setText(decimales.format(resultado));
                            borrar_pantalla = true;
                            operation = "division";
                        } else {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 / ope2;
                            pantalla.setText(decimales.format(resultado));
                            borrar_pantalla = true;
                        }
                    }
                }
            }
        });

    }
}