package subProj_262

import subProj_262.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_262")
    name = "subProj 262"

    buildType(subProj_bt_262_4)
    buildType(subProj_bt_262_5)
    buildType(subProj_bt_262_2)
    buildType(subProj_bt_262_3)
    buildType(subProj_bt_262_0)
    buildType(subProj_bt_262_1)
})
