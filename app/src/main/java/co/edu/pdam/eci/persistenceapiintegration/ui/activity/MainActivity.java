package co.edu.pdam.eci.persistenceapiintegration.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.prefs.Preferences;

import co.edu.pdam.eci.persistenceapiintegration.R;
import co.edu.pdam.eci.persistenceapiintegration.data.NetworkException;
import co.edu.pdam.eci.persistenceapiintegration.data.OrmModel;
import co.edu.pdam.eci.persistenceapiintegration.data.dao.RequestCallback;
import co.edu.pdam.eci.persistenceapiintegration.data.dao.RetrofitNetwork;
import co.edu.pdam.eci.persistenceapiintegration.data.dao.TeamDao;
import co.edu.pdam.eci.persistenceapiintegration.data.entity.Team;

public class MainActivity extends AppCompatActivity{

    OrmModel ormModel;

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        System.out.println("INICIALIZANDO ...");

        Team team1 = new Team("PRUEBA 1","PRUEBA","PRUABE");

        try {
            ormModel = new OrmModel();
            ormModel.init(this);
            TeamDao teamDao = ormModel.getTeamDao();
            teamDao.create(team1);
            List<Team> teams = teamDao.getAll();
            for (Team t : teams){
                System.out.println(t.getName() );
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        final ExecutorService executorService = Executors.newFixedThreadPool( 1 );

        executorService.execute( new Runnable()
        {
            @Override
            public void run()
            {
                final RetrofitNetwork network = new RetrofitNetwork();
                executorService.execute(new Runnable() {
                    @Override
                    public void run() {
                        network.getTeams(new RequestCallback<List<Team>>() {
                            @Override
                            public void onSuccess(List<Team> response) {
                                System.out.println("");
                            }

                            @Override
                            public void onFailed(NetworkException e) {

                            }
                        });
                    }
                });
            }
        } );






    }
}
