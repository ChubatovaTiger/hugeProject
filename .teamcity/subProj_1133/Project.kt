package subProj_1133

import subProj_1133.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1133")
    name = "subProj 1133"

    buildType(subProj_bt_1133_4)
    buildType(subProj_bt_1133_5)
    buildType(subProj_bt_1133_2)
    buildType(subProj_bt_1133_3)
    buildType(subProj_bt_1133_0)
    buildType(subProj_bt_1133_1)
})
