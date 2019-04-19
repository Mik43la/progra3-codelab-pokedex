package bo.upb.programacion3.codelabpokedex;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Elementos de la pantalla
    Toolbar toolbar; // Usaremos un toolbar personalizado, para agregar el icono del Drawer a la izquierda
    ActionBarDrawerToggle drawerToggle; // El objeto del botón del drawer
    DrawerLayout drawerLayout; // Nuestro DrawerLayout

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Esto ya saben!
        this.toolbar = findViewById(R.id.toolbar);
        this.drawerLayout = findViewById(R.id.navigationDrawer);

        if (this.toolbar != null) {
            // Aqui configuramos nuestro Toolbar, con el ícono del Drawer a la izquierda
            this.toolbar.setTitle(R.string.main_activity_title);
            this.toolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.colorWhite));

            drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close);
            drawerToggle.setDrawerIndicatorEnabled(false);
            drawerToggle.setHomeAsUpIndicator(R.drawable.icon_hamburger);
            drawerToggle.setToolbarNavigationClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    drawerLayout.openDrawer(GravityCompat.START); // Podemos abrir y cerrar nuestro drawer programáticamente!!
                }
            });
        }
    }
}