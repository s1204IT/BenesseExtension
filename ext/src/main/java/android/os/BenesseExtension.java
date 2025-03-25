package android.os;

import android.graphics.Point;
import java.io.File;

public class BenesseExtension {
    public static final File COUNT_DCHA_COMPLETED_FILE = new File("/factory/count_dcha_completed");
    public static final File IGNORE_DCHA_COMPLETED_FILE = new File("/factory/ignore_dcha_completed");

    public static boolean checkPassword(String passwordText) {
        return false;
    }

    public static boolean checkUsbCam() {
        return false;
    }

    public static Point getBaseDisplaySize() {
        return null;
    }

    public static int getDchaState() {
        return 0;
    }

    public static Point getInitialDisplaySize() {
        return null;
    }

    public static int getInt(String name) {
        return -1;
    }

    public static Point getLcdSize() {
        return null;
    }

    public static String getString(String name) {
        return null;
    }

    public static boolean putInt(String name, int value) {
        return false;
    }

    public static boolean putString(String name, String value) {
        return false;
    }

    public static void setDchaState(int status) {
    }

    public static boolean setForcedDisplaySize(int width, int height) {
        return false;
    }
}
