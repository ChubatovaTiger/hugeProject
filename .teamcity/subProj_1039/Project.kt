package subProj_1039

import subProj_1039.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1039")
    name = "subProj 1039"

    buildType(subProj_bt_1039_1)
    buildType(subProj_bt_1039_2)
    buildType(subProj_bt_1039_3)
    buildType(subProj_bt_1039_4)
    buildType(subProj_bt_1039_0)
    buildType(subProj_bt_1039_5)
})
