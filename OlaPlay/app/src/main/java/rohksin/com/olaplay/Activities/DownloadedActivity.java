package rohksin.com.olaplay.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;
import rohksin.com.olaplay.Adapters.HistoryAdapter;
import rohksin.com.olaplay.R;
import rohksin.com.olaplay.Utility.AppUtility;

/**
 * Created by Illuminati on 12/17/2017.
 */

public class DownloadedActivity extends AppCompatActivity {

    @BindView(R.id.downloadedView)
    RecyclerView downLoadedView;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.downloaded_activity);
        ButterKnife.bind(this);

        String[] files = AppUtility.getDowmLoadedFiles(DownloadedActivity.this);
        LinearLayoutManager llm = new LinearLayoutManager(DownloadedActivity.this);
        downLoadedView.setLayoutManager(llm);
        HistoryAdapter adapter = new HistoryAdapter(DownloadedActivity.this, Arrays.asList(files));
        downLoadedView.setAdapter(adapter);

    }
}
