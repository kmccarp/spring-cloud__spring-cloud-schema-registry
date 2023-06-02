/*
 * Copyright 2019-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.schema.registry.config;

import java.util.HashMap;
import java.util.Map;

/**
 * Processor overrides deprecated SchemaServerProperties for backward compatibility.
 *
 * @author Christian Tzolov
 */
public class SchemaServerPropertiesBackwardCompatibilityEnvironmentPostProcessorextends AbstractBackwardCompatibilityEnvironmentPostProcessor {

	public SchemaServerPropertiesBackwardCompatibilityEnvironmentPostProcessor() {
		super(SchemaServerPropertiesBackwardCompatibilityEnvironmentPostProcessor.class.getName());
	}

	@Override
	protected Map<String, String> doGetPropertyMappings() {
		Map<String, String> propertyMapping = new HashMap<>();
		propertyMapping.put("spring.cloud.stream.schema.server.path", "spring.cloud.schema.server.path");
		propertyMapping.put("spring.cloud.stream.schema.server.allowSchemaDeletion", "spring.cloud.schema.server.allowSchemaDeletion");
		propertyMapping.put("spring.cloud.stream.schema.server.allow-schema-deletion", "spring.cloud.schema.server.allow-schema-deletion");
		return propertyMapping;
	}
}
