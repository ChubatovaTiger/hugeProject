package subProj_1917

import subProj_1917.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1917")
    name = "subProj 1917"

    buildType(subProj_bt_1917_4)
    buildType(subProj_bt_1917_5)
    buildType(subProj_bt_1917_2)
    buildType(subProj_bt_1917_3)
    buildType(subProj_bt_1917_0)
    buildType(subProj_bt_1917_1)
})
