package subProj_1262

import subProj_1262.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1262")
    name = "subProj 1262"

    buildType(subProj_bt_1262_5)
    buildType(subProj_bt_1262_0)
    buildType(subProj_bt_1262_2)
    buildType(subProj_bt_1262_1)
    buildType(subProj_bt_1262_4)
    buildType(subProj_bt_1262_3)
})
