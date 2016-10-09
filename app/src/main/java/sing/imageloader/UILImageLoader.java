package sing.imageloader;

import android.app.Activity;
import android.net.Uri;
import android.widget.ImageView;
import com.nostra13.universalimageloader.core.assist.ImageSize;
import java.io.File;
import sing.imagepicker.loader.ImageLoader;

public class UILImageLoader implements ImageLoader {

    @Override
    public void displayImage(Activity activity, String path, ImageView imageView, int width, int height) {
        ImageSize size = new ImageSize(width, height);
        com.nostra13.universalimageloader.core.ImageLoader.getInstance().displayImage(Uri.fromFile(new File(path)).toString(), imageView, size);
    }

    @Override
    public void clearMemoryCache() {
    }
}