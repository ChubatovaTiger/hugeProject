package subProj_702

import subProj_702.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_702")
    name = "subProj 702"

    buildType(subProj_bt_702_5)
    buildType(subProj_bt_702_3)
    buildType(subProj_bt_702_4)
    buildType(subProj_bt_702_1)
    buildType(subProj_bt_702_2)
    buildType(subProj_bt_702_0)
})
