package visrec.ri;

import javax.imageio.ImageIO;
import javax.visrec.ImageFactory;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * {@link ImageFactory} to provide {@link BufferedImage} as return object.
 * @author Kevin Berendsen
 */
public class BufferedImageFactory implements ImageFactory<BufferedImage> {

    /** {@inheritDoc} */
    @Override
    public BufferedImage getImage(File file) throws IOException {
        return ImageIO.read(file);
    }

    /** {@inheritDoc} */
    @Override
    public BufferedImage getImage(URL file) throws IOException {
        return ImageIO.read(file);
    }

    /** {@inheritDoc} */
    @Override
    public BufferedImage getImage(InputStream file) throws IOException {
        return ImageIO.read(file);
    }
}
