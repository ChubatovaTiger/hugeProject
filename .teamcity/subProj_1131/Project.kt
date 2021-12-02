package subProj_1131

import subProj_1131.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1131")
    name = "subProj 1131"

    buildType(subProj_bt_1131_4)
    buildType(subProj_bt_1131_5)
    buildType(subProj_bt_1131_2)
    buildType(subProj_bt_1131_3)
    buildType(subProj_bt_1131_0)
    buildType(subProj_bt_1131_1)
})
