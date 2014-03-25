package helpers;

import org.abstractj.kalium.NaCl.Sodium;
import org.abstractj.kalium.crypto.Random;

public class RandomKey extends HashedKey {

    public RandomKey() {
        super(new Random().randomBytes(Sodium.SECRETKEY_BYTES));
    }
}