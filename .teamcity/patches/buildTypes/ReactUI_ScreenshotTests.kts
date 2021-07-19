package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'ReactUI_ScreenshotTests'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("ReactUI_ScreenshotTests")) {
    check(artifactRules == "") {
        "Unexpected option value: artifactRules = $artifactRules"
    }
    artifactRules = "+:packages/react-ui/.creevey/report => report.zip"
}
