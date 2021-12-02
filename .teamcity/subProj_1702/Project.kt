package subProj_1702

import subProj_1702.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1702")
    name = "subProj 1702"

    buildType(subProj_bt_1702_1)
    buildType(subProj_bt_1702_0)
    buildType(subProj_bt_1702_3)
    buildType(subProj_bt_1702_2)
    buildType(subProj_bt_1702_5)
    buildType(subProj_bt_1702_4)
})
