package com.example.revision_practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;

    ArrayList<Arrays_modal> arrayList=new ArrayList<>();

    ArrayList<description_Modal> desc_list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        recyclerView=findViewById(R.id.recycler_view);

        arrayList.add(new Arrays_modal(R.drawable.walter,"Walter White"));
        arrayList.add(new Arrays_modal(R.drawable.walterjr,"Walter Junior"));
        arrayList.add(new Arrays_modal(R.drawable.skyler,"Skyler"));
        arrayList.add(new Arrays_modal(R.drawable.jessie,"Jessie Pinkman"));
        arrayList.add(new Arrays_modal(R.drawable.tuco,"Tuco Solmania"));
        arrayList.add(new Arrays_modal(R.drawable.saul,"Saul Godman"));
        arrayList.add(new Arrays_modal(R.drawable.godman,"Mike"));



        desc_list.add(new description_Modal(R.drawable.walter,"Walter white","Walter Hartwell White Sr., also known by his alias Heisenberg, is the fictional antihero protagonist of the American crime drama television series Breaking Bad, portrayed by Bryan Cranston.\n" +
                "\n" +
                "Walter was a skilled chemist and co-founder of a technology firm before he accepted a buy-out from his partners. While his partners became billionaires, Walter became a frustrated high-school chemistry teacher in Albuquerque, barely making ends meet with his family: his wife Skyler (Anna Gunn) and son Walter Jr. (RJ Mitte). At the start of the series, the day after his 50th birthday, Walter is diagnosed with Stage III lung cancer. After this discovery, Walter resorts to manufacturing and selling methamphetamine with a former student, Jesse Pinkman (Aaron Paul), to ensure his family's financial security after his death. " +
                "Due to his expertise, Walter's \"blue meth\" is purer than any other on the market, and he is pulled deeper into the illicit drug trade."));
        desc_list.add(new description_Modal(R.drawable.walterjr,"Walter Junior","Walter Hartwell White Jr.[2] is the teenage son of chemistry teacher Walter White Sr. and writer Skyler White, and has cerebral palsy.[3] When Skyler tells her sister Marie Schrader that she is working on a new short story with a stoner character in it, she asks her about marijuana. Marie assumes that Skyler thinks Walter Jr. is smoking pot, but Skyler insists that she was just talking about her story. Marie asks her husband Hank, a DEA agent, to scare Walter Jr. straight. Hank brings Walter Jr. to a motel to show how meth has corroded the teeth of a prostitute.[4] After Walter White reveals to Hank, Marie, and Walter Jr. that he has cancer, a fact he already shared with Skyler before, Jr. berates him for acting weird and nonchalant about his cancer. He also becomes upset at his father's decision of not choosing chemotherapy.[5] Over the weekend, Jr. and two friends are waiting outside a convenience store, waiting for somebody to buy them beer. The friends run away when Jr. approaches an off-duty cop. The cop tells him he got his \"first and last warning.\" At an intervention held by Skyler for Walt, Hank, Jr., and Marie argue over what to do. While Skyler and Jr. want him to take the treatment, Marie, and later Hank, " +
                "feel Walt should be given the choice to decline the treatment if he wants; Walt ends the intervention by saying he will not do the treatment"));



        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new Recycler_view_Adaptor(MainActivity.this,arrayList,desc_list));

        Toast.makeText(this, "Hey i have changed in Sourabh branch", Toast.LENGTH_SHORT).show();



    }
}