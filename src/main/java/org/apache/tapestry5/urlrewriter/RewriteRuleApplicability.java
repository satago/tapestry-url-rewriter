// Copyright 2009 The Apache Software Foundation
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.apache.tapestry5.urlrewriter;

/**
 * Defines the situations to which a URLRewriterRule will be applied (inbound,
 * outbound, or both)
 */
public enum RewriteRuleApplicability {
	/** Contributed rule applies to inbound requests only. */
	INBOUND,
	/** Contributed rule applies to "outbound" requests (link rewriting). */
	OUTBOUND,
	/** Contributed rule applies to both inbound and outbound requests. */
	BOTH
}
