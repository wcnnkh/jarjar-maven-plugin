/**
 * Copyright 2007 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tonicsystems.jarjar;

import java.io.IOException;

import com.tonicsystems.jarjar.util.EntryStruct;
import com.tonicsystems.jarjar.util.JarProcessor;

class ManifestProcessor implements JarProcessor
{
    private static final String MANIFEST_PATH = "META-INF/MANIFEST.MF";
    private static final ManifestProcessor INSTANCE = new ManifestProcessor();

    public static ManifestProcessor getInstance() {
        return INSTANCE;
    }
    
    private ManifestProcessor() {}

    public boolean process(EntryStruct struct) throws IOException {
        return !struct.name.equalsIgnoreCase(MANIFEST_PATH);
    }
}
    
