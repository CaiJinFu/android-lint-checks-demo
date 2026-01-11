package com.lyft.android.lint.checks

import com.android.tools.lint.client.api.IssueRegistry
import com.android.tools.lint.detector.api.CURRENT_API
import com.android.tools.lint.detector.api.Issue
import com.google.auto.service.AutoService

/**
 * The class contains the list of issues that will be checked when running lint.
 *
 * This class is referenced from the `checks/build.gradle` file, so we can
 * suppress the unused warning.
 */
@AutoService(IssueRegistry::class)
@Suppress("unused")
class IssueRegistryLint : IssueRegistry() {

    override val api: Int = CURRENT_API
    override val issues: List<Issue> = listOf(
        AndroidToastJavaKotlinDetector.ISSUE,
        DeprecatedButtonJavaKotlinDetector.ISSUE,
        DeprecatedButtonXmlDetector.ISSUE,
        DeprecatedPurpleColorJavaKotlinDetector.ISSUE,
        DeprecatedPurpleColorXmlDetector.ISSUE,
        HardcodedHexColorXmlDetector.ISSUE,
        OkayStringXmlDetector.ISSUE
    )
}
