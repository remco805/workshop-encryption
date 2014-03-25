package helpers;

import org.abstractj.kalium.crypto.Hash;

public class HashedKey {

    private byte[] key;
    public HashedKey(byte[] key) {
        this.key = new Hash().sha256(key);
    }

    public byte[] getBytes() {
        return this.key;
    }
}