package bisq.asset.tokens;

import bisq.asset.AbstractAssetTest;

import org.junit.Test;

public class LupecoinTest extends AbstractAssetTest {

    public LupecoinTest () {
        super(new Lupecoin());
    }

    @Test
    public void testValidAddresses() {
        assertValidAddress("0xd0f79b71a8ffb7f70392630f8bfc900fca27af42");
        assertValidAddress("d0f79b71a8ffb7f70392630f8bfc900fca27af42");
    }

    @Test
    public void testInvalidAddresses() {
        assertInvalidAddress("0x65767ec6d4d3d18a200842352485cdc37cbf3a216");
        assertInvalidAddress("0x65767ec6d4d3d18a200842352485cdc37cbf3a2g");
        assertInvalidAddress("0xd0f79b71a8ffb7f70392630f8bfc900fca27af42O");
    }
