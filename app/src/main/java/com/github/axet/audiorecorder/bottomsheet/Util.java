package com.github.axet.audiorecorder.bottomsheet;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/**
 * Created by Gayathri on 18-03-2017.
 */

public class Util {


    public static void showMessage(String message) {
        System.out.println("*****MessageItem: " + message);
    }

    public static void copyDatabaseToExternalStorage(String databaseName) {
        try {
            File sd = Environment.getExternalStorageDirectory();
            File data = Environment.getDataDirectory();

            if (sd.canWrite()) {
                //  String currentDBPath = "//data//com.knots//databases//" + databaseName;
                String currentDBPath = "//data//com.alltime//databases//" + databaseName;
                String backupDBPath = databaseName;
                File currentDB = new File(data, currentDBPath);
                File backupDB = new File(sd, backupDBPath);
                System.out.println("backupDB :" + backupDB);
                if (currentDB.exists()) {
                    FileChannel src = new FileInputStream(currentDB).getChannel();
                    FileChannel dst = new FileOutputStream(backupDB).getChannel();
                    dst.transferFrom(src, 0, src.size());
                    src.close();
                    dst.close();
                }
            }
        } catch (Exception e) {
            Log.e(">>>>", e.toString());
            e.printStackTrace();
        }
    }

    /*public static long getCurrentTime() {
        DateTime dt = new DateTime(DateTimeZone.UTC);
        return dt.getMillis();
    }*/

    public static String getTAG(Class className) {
        String simpleClasssName = className.getSimpleName();
        if (simpleClasssName.length() > 22)
            return simpleClasssName.substring(0, 22);
        else
            return simpleClasssName;
    }


    public static CharSequence[] changeToCharSequence(List<String> items) {
        return items.toArray(new CharSequence[items.size()]);
    }

    public static String[] getStringResourceArray(Activity activity, int arrayId) {
        return activity.getResources().getStringArray(arrayId);
    }


    public static boolean isPackageExisted(Context c, String targetPackage) {

        PackageManager pm = c.getPackageManager();
        try {
            PackageInfo info = pm.getPackageInfo(targetPackage,
                    PackageManager.GET_META_DATA);
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
        return true;
    }

    public static int safeLongToInt(long l) {
        int i = (int) l;
        if ((long) i != l) {
            throw new IllegalArgumentException(l + " cannot be cast to int without changing its value.");
        }
        return i;
    }


    public static String getInboxChannelGroupName(String userGlobalUUID) {
        return userGlobalUUID + "-" + ConstantClass.USER_INBOX_GROUPCHANNEL_NAME;
    }

    public static String getChannelGroupName(String userGlobalUUID) {
        return userGlobalUUID + "-" + ConstantClass.USER_INBOX_GROUPCHANNEL_NAME;
    }

    /*public static String getNotifyFriendsChannelGroup(String userGlobalUUID) {
        return userGlobalUUID + "-" + ConstantClass.NOTIFY_FRIENDS_GROUPCHANNEL_NAME;
    }*/

    public static String getSystemChannel() {
        return ConstantClass.SYSTEM_CHANNEL_NAME;
    }

    /*public static synchronized String getHomeChannelGroupName(String userPhoneNumberWithCC) {
//        return UserUniqueId + "-" + ConstantClass.USER_SELF_CHANNEL_NAME;
        return userPhoneNumberWithCC + "-" + ConstantClass.USER_INBOX_GROUPCHANNEL_NAME;
    }*/

    /*public static synchronized String getMutualChannelName(String userPhoneNumberWithCC) {
//        return UserUniqueId + "-" + ConstantClass.USER_SELF_CHANNEL_NAME;
        return userPhoneNumberWithCC;
    }*/

    public static  int getCountFromPercentage(int total, int percent) {
        return (total / 100) * percent;
    }

    public static  int getPercentageOfTotal(int count, int total){
        return (count * 100) / total;
    }


}
