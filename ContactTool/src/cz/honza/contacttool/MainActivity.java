package cz.honza.contacttool;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	protected void contactsLogCat()
	{
		//final String 
		//final Cursor c = getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, projection, selection, selectionArgs, sortOrder);
		Toast.makeText(this, R.string.not_implemented, Toast.LENGTH_LONG).show();
	}
	
	protected void rawContactsLogCat()
	{
		Toast.makeText(this, R.string.not_implemented, Toast.LENGTH_LONG).show();
	}
	
	protected void dataLogCat()
	{
		Toast.makeText(this, R.string.not_implemented, Toast.LENGTH_LONG).show();
	}
	
	protected void contactsListView()
	{
		Toast.makeText(this, R.string.not_implemented, Toast.LENGTH_LONG).show();
	}
	
	protected void rawContactsListView()
	{
		Toast.makeText(this, R.string.not_implemented, Toast.LENGTH_LONG).show();
	}
	
	protected void dataListView()
	{
		Toast.makeText(this, R.string.not_implemented, Toast.LENGTH_LONG).show();
	}
	
	protected void contactsDelete()
	{
		Toast.makeText(this, R.string.not_implemented, Toast.LENGTH_LONG).show();
	}
	
	protected void rawContactsDelete()
	{
		Toast.makeText(this, R.string.not_implemented, Toast.LENGTH_LONG).show();
	}
	
	protected void dataDelete()
	{
		Toast.makeText(this, R.string.not_implemented, Toast.LENGTH_LONG).show();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.main);
		
		final View contactsLogCat = findViewById(R.id.contacts_logcat);
		final View contactsListView = findViewById(R.id.contacts_listview);
		final View contactsDelete = findViewById(R.id.contacts_delete);
		
		final View rawContactsLogCat = findViewById(R.id.rawcontacts_logcat);
		final View rawContactsListView = findViewById(R.id.rawcontacts_listview);
		final View rawContactsDelete = findViewById(R.id.rawcontacts_delete);
		
		final View dataLogCat = findViewById(R.id.data_logcat);
		final View dataListView = findViewById(R.id.data_listview);
		final View dataDelete = findViewById(R.id.data_delete);
		
		contactsLogCat.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				contactsLogCat();
			}
		});
		
		rawContactsLogCat.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				rawContactsLogCat();
			}
		});
		
		dataLogCat.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				dataLogCat();
			}
		});
		
		contactsListView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				contactsListView();
			}
		});
		
		rawContactsListView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				rawContactsListView();
			}
		});
		
		dataListView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				dataListView();
			}
		});
		
		contactsDelete.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				contactsDelete();
			}
		});
		
		rawContactsDelete.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				rawContactsDelete();
			}
		});
		
		dataDelete.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				dataDelete();
			}
		});
	}

}
