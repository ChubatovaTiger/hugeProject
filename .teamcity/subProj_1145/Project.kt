package subProj_1145

import subProj_1145.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1145")
    name = "subProj 1145"

    buildType(subProj_bt_1145_3)
    buildType(subProj_bt_1145_4)
    buildType(subProj_bt_1145_1)
    buildType(subProj_bt_1145_2)
    buildType(subProj_bt_1145_5)
    buildType(subProj_bt_1145_0)
})
