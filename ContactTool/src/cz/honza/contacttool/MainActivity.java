package cz.honza.contacttool;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	protected static final int DIALOG_DELETE_CONTACTS = 1000;
	protected static final int DIALOG_DELETE_RAW_CONTACTS = DIALOG_DELETE_CONTACTS + 1;
	protected static final int DIALOG_DELETE_DATA = DIALOG_DELETE_CONTACTS + 2;
	
	protected void contactsLogCat()
	{
		final String[] projection = {ContactsContract.Contacts._ID, ContactsContract.Contacts.DISPLAY_NAME, ContactsContract.Contacts.HAS_PHONE_NUMBER};
		final Cursor c = getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, projection, null, null, ContactsContract.Contacts._ID);
		
		Log.i("Contacts", ContactsContract.Contacts._ID + " / " + ContactsContract.Contacts.DISPLAY_NAME + " / " + ContactsContract.Contacts.HAS_PHONE_NUMBER);
		
		if (c != null && c.moveToFirst())
		{
			do
			{
				Log.i("Contacts", c.getString(0) + " / " + c.getString(1) + " / " + c.getString(2));
			} while (c.moveToNext());
		}
		else
			Toast.makeText(this, R.string.no_result, Toast.LENGTH_LONG).show();
	}
	
	protected void rawContactsLogCat()
	{
		final String[] projection = {ContactsContract.RawContacts._ID, ContactsContract.RawContacts.CONTACT_ID};
		final Cursor c = getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, projection, null, null, ContactsContract.RawContacts.CONTACT_ID);
		
		Log.i("RawContacts", ContactsContract.RawContacts._ID + " / " + ContactsContract.RawContacts.CONTACT_ID);
		
		if (c != null && c.moveToFirst())
		{
			do
			{
				Log.i("RawContacts", c.getString(0) + " / " + c.getString(1));
			} while (c.moveToNext());
		}
		else
			Toast.makeText(this, R.string.no_result, Toast.LENGTH_LONG).show();
	}
	
	protected void dataLogCat()
	{
		final String[] projection = {ContactsContract.Data._ID, ContactsContract.Data.CONTACT_ID, ContactsContract.Data.RAW_CONTACT_ID, ContactsContract.Data.MIMETYPE,
				ContactsContract.Data.DATA1, ContactsContract.Data.DATA2, ContactsContract.Data.DATA3, ContactsContract.Data.DATA4, ContactsContract.Data.DATA5,
				ContactsContract.Data.DATA6, ContactsContract.Data.DATA7, ContactsContract.Data.DATA8, ContactsContract.Data.DATA9, ContactsContract.Data.DATA10,
				ContactsContract.Data.DATA11, ContactsContract.Data.DATA12, ContactsContract.Data.DATA13, ContactsContract.Data.DATA14, ContactsContract.Data.DATA15
		};
		final Cursor c = getContentResolver().query(ContactsContract.Data.CONTENT_URI, projection, null, null, ContactsContract.Data.CONTACT_ID);
		
		Log.i("Data", ContactsContract.Data._ID + " / " + ContactsContract.Data.CONTACT_ID  + " / " +  ContactsContract.Data.RAW_CONTACT_ID  + " / " + ContactsContract.Data.MIMETYPE  + " / " +  
				ContactsContract.Data.DATA1  + " / " +  ContactsContract.Data.DATA2  + " / " +  ContactsContract.Data.DATA3  + " / " +  ContactsContract.Data.DATA4 + " / " +  ContactsContract.Data.DATA5 + " / " + 
				ContactsContract.Data.DATA6  + " / " +  ContactsContract.Data.DATA7  + " / " +  ContactsContract.Data.DATA8  + " / " +  ContactsContract.Data.DATA9 + " / " +  ContactsContract.Data.DATA10 + " / " + 
				ContactsContract.Data.DATA11 + " / " +  ContactsContract.Data.DATA12 + " / " +  ContactsContract.Data.DATA13 + " / " +  ContactsContract.Data.DATA14 + " / " +  ContactsContract.Data.DATA15);
		
		if (c != null && c.moveToFirst())
		{
			do
			{
				String data1 = "blob";
				String data2 = data1;
				String data3 = data1;
				String data4 = data1;
				String data5 = data1;
				String data6 = data1;
				String data7 = data1;
				String data8 = data1;
				String data9 = data1;
				String data10 = data1;
				String data11 = data1;
				String data12 = data1;
				String data13 = data1;
				String data14 = data1;
				String data15 = data1;
				
				try {
					data1 = c.getString(4);
				}
				catch (SQLiteException e)
				{
				}
				
				try {
					data2 = c.getString(5);
				}
				catch (SQLiteException e)
				{
				}

				try {
					data3 = c.getString(6);
				}
				catch (SQLiteException e)
				{
				}

				try {
					data4 = c.getString(7);
				}
				catch (SQLiteException e)
				{
				}

				try {
					data5 = c.getString(8);
				}
				catch (SQLiteException e)
				{
				}

				try {
					data6 = c.getString(9);
				}
				catch (SQLiteException e)
				{
				}

				try {
					data7 = c.getString(10);
				}
				catch (SQLiteException e)
				{
				}

				try {
					data8 = c.getString(11);
				}
				catch (SQLiteException e)
				{
				}

				try {
					data9 = c.getString(12);
				}
				catch (SQLiteException e)
				{
				}

				try {
					data10 = c.getString(13);
				}
				catch (SQLiteException e)
				{
				}

				try {
					data11 = c.getString(14);
				}
				catch (SQLiteException e)
				{
				}

				try {
					data12 = c.getString(15);
				}
				catch (SQLiteException e)
				{
				}

				try {
					data13 = c.getString(16);
				}
				catch (SQLiteException e)
				{
				}

				try {
					data14 = c.getString(17);
				}
				catch (SQLiteException e)
				{
				}

				try {
					data15 = c.getString(18);
				}
				catch (SQLiteException e)
				{
				}

				
				Log.i("data", c.getString(0) + " / " + c.getString(1) + " / " + c.getString(2)  + " / " + c.getString(3)  + " / " + data1
						 + " / " + data2 + " / " + data3 + " / " + data4 + " / " + data5 + " / " + data6
						 + " / " + data7 + " / " + data8 + " / " + data9 + " / " + data10 + " / " + data11
						 + " / " + data12 + " / " + data13 + " / " + data14 + " / " + data15);
			} while (c.moveToNext());
		}
		else
			Toast.makeText(this, R.string.no_result, Toast.LENGTH_LONG).show();
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
		showDialog(DIALOG_DELETE_CONTACTS);
	}
	
	protected void rawContactsDelete()
	{
		showDialog(DIALOG_DELETE_RAW_CONTACTS);
	}
	
	protected void dataDelete()
	{
		showDialog(DIALOG_DELETE_DATA);
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

	@Override
	protected Dialog onCreateDialog(int id) {
		switch (id)
		{
		case DIALOG_DELETE_CONTACTS:
		{
			AlertDialog.Builder b = new AlertDialog.Builder(this);
			b.setTitle(R.string.delete_data);
			b.setMessage(R.string.delete_all);
			b.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					ContentResolver contentResolver = getContentResolver();
			        Cursor cursor = contentResolver.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
			        while (cursor.moveToNext()) {
			            String lookupKey = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.LOOKUP_KEY));
			            Uri uri = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_LOOKUP_URI, lookupKey);
			            contentResolver.delete(uri, null, null);
			        }
			        
			        Toast.makeText(MainActivity.this, "Deleted", Toast.LENGTH_LONG).show();
				}
			});
			
			b.setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			});

			return b.create();
		}
		case DIALOG_DELETE_RAW_CONTACTS:
		{
			AlertDialog.Builder b = new AlertDialog.Builder(this);
			b.setTitle(R.string.delete_data);
			b.setMessage(R.string.delete_all);
			b.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					int rows = getContentResolver().delete(ContactsContract.RawContacts.CONTENT_URI, null, null);
					Toast.makeText(MainActivity.this, rows + " rows deleted", Toast.LENGTH_LONG).show();
				}
			});
			b.setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					int rows = getContentResolver().delete(ContactsContract.Data.CONTENT_URI, null, null);
					Toast.makeText(MainActivity.this, rows + " rows deleted", Toast.LENGTH_LONG).show();					
				}
			});

			return b.create();
		}
		case DIALOG_DELETE_DATA:
		{
			AlertDialog.Builder b = new AlertDialog.Builder(this);
			b.setTitle(R.string.delete_data);
			b.setMessage(R.string.delete_all);
			b.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			});
			b.setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			});

			return b.create();
		}
		}
		return super.onCreateDialog(id);
	}

	
}
