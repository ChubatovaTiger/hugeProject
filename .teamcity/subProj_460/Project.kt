package subProj_460

import subProj_460.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_460")
    name = "subProj 460"

    buildType(subProj_bt_460_1)
    buildType(subProj_bt_460_0)
    buildType(subProj_bt_460_5)
    buildType(subProj_bt_460_4)
    buildType(subProj_bt_460_3)
    buildType(subProj_bt_460_2)
})
