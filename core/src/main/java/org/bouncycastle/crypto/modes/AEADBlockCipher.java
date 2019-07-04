package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;


public interface AEADBlockCipher extends AEADCipher {

    /**
     * return the cipher this object wraps.
     *
     * @return the cipher this object wraps.
     */
    public BlockCipher getUnderlyingCipher();

}
