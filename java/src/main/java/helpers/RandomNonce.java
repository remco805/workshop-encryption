package helpers;

import static org.abstractj.kalium.NaCl.Sodium.XSALSA20_POLY1305_SECRETBOX_NONCEBYTES;

import org.abstractj.kalium.crypto.Random;

public class RandomNonce {

    private byte[] nonce;
    public RandomNonce() {
        this.nonce = new Random().randomBytes(XSALSA20_POLY1305_SECRETBOX_NONCEBYTES);
    }

    public byte[] getBytes() {
        return this.nonce;
    }
}
