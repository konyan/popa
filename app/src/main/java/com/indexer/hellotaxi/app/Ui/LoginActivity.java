package com.indexer.hellotaxi.app.ui;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import com.indexer.hellotaxi.app.R;
import com.indexer.hellotaxi.app.base.BasePopaActivity;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_login)
public class LoginActivity extends BasePopaActivity {

  @ViewById(R.id.btnLogin) Button btnLogin;
  @ViewById(R.id.userPhoneEditText) EditText userPhoneEditText;

  @AfterViews void showLoginUi() {
    ActionBar mActionBar = getSupportActionBar();
    mActionBar.setDisplayHomeAsUpEnabled(true);
    mActionBar.setHomeButtonEnabled(true);
    mActionBar.setIcon(R.drawable.ic_launcher);

    btnLogin.setEnabled(false); // Disable at first place
    enableBtn(userPhoneEditText, btnLogin);
  }

  @Override protected void onCreate(Bundle saveInstanceState) {
    super.onCreate(saveInstanceState);
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    switch (item.getItemId()) {
      case android.R.id.home:
        this.onBackPressed();
        return false;
    }
    return false;
  }

  @Override protected void start() {
  }
}
