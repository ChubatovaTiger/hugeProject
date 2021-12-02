package subProj_1397

import subProj_1397.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1397")
    name = "subProj 1397"

    buildType(subProj_bt_1397_3)
    buildType(subProj_bt_1397_2)
    buildType(subProj_bt_1397_5)
    buildType(subProj_bt_1397_4)
    buildType(subProj_bt_1397_1)
    buildType(subProj_bt_1397_0)
})
