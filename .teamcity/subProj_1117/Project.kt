package subProj_1117

import subProj_1117.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1117")
    name = "subProj 1117"

    buildType(subProj_bt_1117_1)
    buildType(subProj_bt_1117_0)
    buildType(subProj_bt_1117_3)
    buildType(subProj_bt_1117_2)
    buildType(subProj_bt_1117_5)
    buildType(subProj_bt_1117_4)
})
