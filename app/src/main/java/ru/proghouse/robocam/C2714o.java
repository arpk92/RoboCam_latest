package ru.proghouse.robocam;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.widget.Toast;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

@SuppressWarnings("ALL")
/* renamed from: ru.proghouse.robocam.o */
public class C2714o {
    /* renamed from: a */
    public static File m10947a(Context context) {
        File file = new File(context.getCacheDir(), "robot");
        File file2 = new File(context.getFilesDir(), "robot");
        if (!file.exists() || !file.isDirectory() || file2.exists()) {
            file2.mkdirs();
        } else {
            file2.mkdirs();
            File[] listFiles = file.listFiles();
            for (File file3 : listFiles) {
                if (file3.getName().trim().endsWith(".xml")) {
                    m10952a(file3, new File(file2, file3.getName()));
                }
            }
        }
        return file2;
    }

    /* renamed from: a */
    public static String m10948a(Context context, String str, String str2) {
        int i = 0;
        HashSet hashSet = new HashSet();
        context.getCacheDir();
        File[] listFiles = m10947a(context).listFiles();
        for (File file : listFiles) {
            if (file.getName().trim().endsWith(".xml")) {
                Document parse = null;
                try {
                    parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
                } catch (SAXException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ParserConfigurationException e) {
                    e.printStackTrace();
                }
                parse.getDocumentElement().normalize();
                if (parse.getDocumentElement().getNodeName().equals(str2)) {
                    hashSet.add(str2 + ":" + parse.getDocumentElement().getAttribute("Name"));
                }
            }
        }
        if (str == null) {
            str = "";
        }
        int lastIndexOf = str.trim().lastIndexOf(" ");
        if (lastIndexOf > 0) {
            try {
                i = Integer.parseInt(str.trim().substring(lastIndexOf + 1));
                str = str.trim().substring(0, lastIndexOf).trim();
            } catch (NumberFormatException e) {
            }
        }
        if (hashSet.contains(str2 + ":" + str + (i > 0 ? " " + Integer.toString(i) : ""))) {
            int i2 = i == 0 ? 2 : i + 1;
            while (hashSet.contains(str2 + ":" + str + " " + Integer.toString(i2))) {
                i2++;
            }
            return str + " " + Integer.toString(i2);
        }
        return str + (i > 0 ? " " + Integer.toString(i) : "");
    }

    /* renamed from: a */
    public static void m10949a(Activity activity, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 11) {
            C2702e.m10900a(activity.getString(i), z).show(activity.getFragmentManager(), "dialog");
            return;
        }
        Toast.makeText(activity, activity.getString(i), 0).show();
        activity.finish();
    }

    /* renamed from: a */
    public static void m10950a(Activity activity, String str, boolean z) {
        if (Build.VERSION.SDK_INT >= 11) {
            C2702e.m10900a(str, z).show(activity.getFragmentManager(), "dialog");
            return;
        }
        Toast.makeText(activity, str, 0).show();
        activity.finish();
    }

    /* renamed from: a */
    public static void m10951a(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                m10951a(file2);
            }
        }
        file.delete();
    }

    /* INFO: finally extract failed */
    /* renamed from: a */
    public static void m10952a(File file, File file2) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            FileOutputStream fileOutputStream = null;
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.close();
                        return;
                    }
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    throw th;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m10953a(File file, Document document) {
        try {
            TransformerFactory.newInstance().newTransformer().transform(new DOMSource(document), new StreamResult(new FileOutputStream(file)));
        } catch (TransformerException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m10954a(String str, Document document) {
        m10953a(new File(str), document);
    }

    /* renamed from: a */
    public static boolean m10955a(Activity activity, int i) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (ActivityCompat.checkSelfPermission((Context) activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            Bundle bundle = new Bundle();
            bundle.putInt("message_id", R.string.request_write_external_storage_permission);
            bundle.putStringArray("permissions", new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
            bundle.putInt("request_code", i);
            bundle.putBoolean("finish_activity", false);
            C2698c cVar = new C2698c();
            cVar.setArguments(bundle);
            cVar.show(activity.getFragmentManager(), "dialog");
            return false;
        }
        ActivityCompat.requestPermissions(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, i);
        return false;
    }

    /* renamed from: b */
    public static File m10956b(Context context) {
        File file = new File(context.getFilesDir(), "ads");
        file.mkdirs();
        return file;
    }
}
