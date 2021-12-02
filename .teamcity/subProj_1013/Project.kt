package subProj_1013

import subProj_1013.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1013")
    name = "subProj 1013"

    buildType(subProj_bt_1013_4)
    buildType(subProj_bt_1013_3)
    buildType(subProj_bt_1013_2)
    buildType(subProj_bt_1013_1)
    buildType(subProj_bt_1013_5)
    buildType(subProj_bt_1013_0)
})
