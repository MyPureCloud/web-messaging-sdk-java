package cloud.genesys.webmessaging.sdk;

import cloud.genesys.webmessaging.sdk.model.FileUploadMode;

import java.util.regex.Pattern;


public class FileUtils {

    static final String UNKNOWN_MIME_TYPE = "unknown";

    static final String MIMETYPE_REGEXP = "\\w+\\/[\\w.+]+"; // <letters, digits, '_'>/<letters, digits'_', '.', '+'>

    public static boolean isMimeTypeSupported(String mimeType, FileUploadMode mode) {
        if(mode == null) {
            return false;
        }

        if(UNKNOWN_MIME_TYPE == mimeType) {
            return mode.getFileTypes().size() > 0;
        }

        if(!Pattern.matches(MIMETYPE_REGEXP, mimeType)) {
            return false;
        }

        return mode.getFileTypes().stream().anyMatch(fileType -> mimeTypeMatches(mimeType, fileType.getType()));
    }

    public static boolean mimeTypeMatches(String mimeType, String supportedMimeType) {
        if (supportedMimeType == "*/*") {
            return Pattern.matches(MIMETYPE_REGEXP, mimeType);
        }

        String[] mimeTypeSplit = mimeType.split("/");
        String[] supportedMimeTypeSplit = supportedMimeType.split("/");
        if(mimeTypeSplit.length != 2 || supportedMimeTypeSplit.length != 2) {
            return false;
        }
        if(!mimeTypeSplit[0].equalsIgnoreCase(supportedMimeTypeSplit[0])) {
            return false;
        }
        if(mimeTypeSplit[1].equalsIgnoreCase(supportedMimeTypeSplit[1])) {
            return true;
        }
        if(supportedMimeTypeSplit[1].startsWith("*")) {
            return mimeTypeSplit[1].endsWith(supportedMimeType.substring(2));
        }
        return false;
    }
}
