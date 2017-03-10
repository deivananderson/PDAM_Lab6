package co.edu.pdam.eci.persistenceapiintegration.data.dao;

import java.util.List;

import co.edu.pdam.eci.persistenceapiintegration.data.entity.Team;
import retrofit2.Call;
import retrofit2.http.GET;

interface TeamsService
{

    @GET( "teams.json" )
    Call<List<Team>> getTeamsList( );

}