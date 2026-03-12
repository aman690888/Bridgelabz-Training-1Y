package com.gla.package_assignment.q8.com.access.two;

import com.gla.package_assignment.q8.com.access.one.Base;

public class Derived extends Base {

    public void testDerivedAccess() {

        // privateMethod(); ❌ Not Accessible
        // defaultMethod(); ❌ Not Accessible (different package)
        protectedMethod();   // ✅ Accessible (because subclass)
        publicMethod();      // ✅ Accessible
    }
}