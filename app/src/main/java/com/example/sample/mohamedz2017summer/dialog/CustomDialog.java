package com.example.sample.mohamedz2017summer.dialog;


/**
 * Created by zaeem on 6/21/2017.
 */

public class CustomDialog extends android.app.Dialog{


    private final ICustomDialogListner listner;

    public interface ICustomDialogListner{
        public void onOKClicked(String msg);
    }

    @OnClick(R.id.dialog_custom_bt)
    public void ok(View view){
        listner.onOKClicked("You Clicked OK");
        cancel();
    }

    public CustomDialog(@NonNull Context context, ICustomDialogListner listner) {
        super(context,R.style.dialog);
        setContentView(R.layout.dialogcustom);
        ButterKnife.bind(this);
        this.listner = listner;

    }
}
