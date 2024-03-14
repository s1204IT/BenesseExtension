package android.os;

import android.graphics.Point;
import java.io.File;

public class BenesseExtension {
   public static final File COUNT_DCHA_COMPLETED_FILE = new File("/factory/count_dcha_completed");
   public static final File IGNORE_DCHA_COMPLETED_FILE = new File("/factory/ignore_dcha_completed");

   BenesseExtension() {
   }

   public static boolean checkPassword(String var0) {
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

   public static int getInt(String var0) {
      return -1;
   }

   public static Point getLcdSize() {
      return null;
   }

   public static String getString(String var0) {
      return null;
   }

   public static boolean putInt(String var0, int var1) {
      return false;
   }

   public static boolean putString(String var0, String var1) {
      return false;
   }

   public static void setDchaState(int var0) {
   }

   public static boolean setForcedDisplaySize(int var0, int var1) {
      return false;
   }
}
