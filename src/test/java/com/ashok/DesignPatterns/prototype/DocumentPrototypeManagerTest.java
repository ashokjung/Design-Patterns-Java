package com.ashok.DesignPatterns.prototype;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ashok jung bahadur
 */


public class DocumentPrototypeManagerTest {

    @Test
    public void testGetClonedDocument() throws Exception {
        PrototypeCapableDocument clonedTAndC = DocumentPrototypeManager.getClonedDocument("tandc");
        clonedTAndC.setVendorName("Mary Parker");
        System.out.println(clonedTAndC);
        PrototypeCapableDocument clonedNDA = DocumentPrototypeManager.getClonedDocument("nda");
        clonedNDA.setVendorName("Patrick Smith");
        System.out.println(clonedNDA);
    }
}
