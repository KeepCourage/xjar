package io.xjar.boot;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

public class AVisitor extends ClassVisitor {
    protected AVisitor(int api, ClassVisitor classVisitor) {
        super(api, classVisitor);
    }


    @Override
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        return super.visitMethod(access, name, descriptor, signature, exceptions);
    }


}
