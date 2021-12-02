package subProj_1060

import subProj_1060.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1060")
    name = "subProj 1060"

    buildType(subProj_bt_1060_0)
    buildType(subProj_bt_1060_5)
    buildType(subProj_bt_1060_2)
    buildType(subProj_bt_1060_1)
    buildType(subProj_bt_1060_4)
    buildType(subProj_bt_1060_3)
})
