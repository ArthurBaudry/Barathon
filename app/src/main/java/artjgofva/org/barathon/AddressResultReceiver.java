package artjgofva.org.barathon;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.widget.Toast;

/**
 * Created by arthur on 25/04/16.
 */
@SuppressLint("ParcelCreator")
public class AddressResultReceiver extends ResultReceiver {

    private String mAddressOutput;

    public AddressResultReceiver(Handler handler) {
        super(handler);
    }

    @Override
    protected void onReceiveResult(int resultCode, Bundle resultData) {

        // Display the address string
        // or an error message sent from the intent service.
        mAddressOutput = resultData.getString(Constants.RESULT_DATA_KEY);

        // Show a toast message if an address was found.
        if (resultCode == Constants.SUCCESS_RESULT) {
            //Write in file
        }

    }
}
