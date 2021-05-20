/*
 * Copyright 2003-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tonicsystems.jarjar;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;

/**
 * An ASM3 EmptyVisitor replacement
 * @author <a href="mailto:blackdrag@gmx.org">Jochen "blackdrag" Theodorou</a>
 */
public class EmptyClassVisitor extends ClassVisitor {

    public EmptyClassVisitor() {
        super(Constants.ASM_OPCODES);
    }
    
    @Override
    public MethodVisitor visitMethod(int access, String name, String desc,
            String signature, String[] exceptions) {
        return new MethodVisitor(Constants.ASM_OPCODES) {};
    }
    
    @Override
    public AnnotationVisitor visitAnnotation(String desc, boolean visible) {
        return new AnnotationVisitor(Constants.ASM_OPCODES) {};
    }
    
    @Override
    public FieldVisitor visitField(int access, String name, String desc, String signature, Object value) {
        return new FieldVisitor(Constants.ASM_OPCODES) {};
    }

}
